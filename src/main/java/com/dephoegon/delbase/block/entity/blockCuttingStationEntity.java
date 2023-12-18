package com.dephoegon.delbase.block.entity;

import com.dephoegon.delbase.aid.inventory.ImplementedInventory;
import com.dephoegon.delbase.aid.inventory.slotControls;
import com.dephoegon.delbase.aid.world.config;
import com.dephoegon.delbase.recipe.blockCutterStationRecipes;
import com.dephoegon.delbase.screen.blockCuttingStationScreenHandler;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.*;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

import static com.dephoegon.delbase.Delbase.configHolder;
import static com.dephoegon.delbase.aid.recipe.TierRandomDropAid.*;
import static com.dephoegon.delbase.aid.recipe.countAid.netheriteDiamondBonus;
import static com.dephoegon.delbase.item.BlockCutterItems.*;
import static net.minecraft.item.Items.DIAMOND;

public class blockCuttingStationEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory, SidedInventory, Inventory {
    public static final int invSize = 3;
    public static final int planSlot = 2;
    public static final int inputSlot = 0;
    public static final int outSlot = 1;
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(invSize, ItemStack.EMPTY);
    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = config.BLOCK_CUTTING_STATION_CRAFT_TIME.get();
    public blockCuttingStationEntity(BlockPos pos, BlockState state) {
        super(blockEntities.BLOCK_CUTTER_ENTITY, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            public int get(int index) {
                return switch (index) {
                    case 0 -> blockCuttingStationEntity.this.progress;
                    case 1 -> blockCuttingStationEntity.this.maxProgress;
                    default -> 0;
                };
            }
            public void set(int index, int value) {
                switch (index) {
                    case 0 -> blockCuttingStationEntity.this.progress = value;
                    case 1 -> blockCuttingStationEntity.this.maxProgress = value;
                }
            }
            public int size() { return 2; }
        };
    }

    public int size() { return inventory.size(); }
    public boolean isEmpty() { return inventory.stream().allMatch(ItemStack::isEmpty); }
    public ItemStack getStack(int slot) { return inventory.get(slot); }
    public ItemStack removeStack(int slot) { return Inventories.removeStack(inventory, slot); }
    public void setStack(int slot, ItemStack stack) {
        inventory.set(slot, stack);
        if (stack.getCount() > getMaxCountPerStack()) {
            stack.setCount(getMaxCountPerStack());
        }
        markDirty();
    }
    public void clear() {
        inventory.clear();
    }
    public int[] getAvailableSlots(Direction side) {
        // Return the index of the slot that is accessible from the given side
        if (side == Direction.DOWN) {
            return new int[]{outSlot};
        } else if (side == Direction.UP) {
            return new int[]{inputSlot};
        } else {
            return new int[]{planSlot};
        }
    }
    public boolean canInsert(int slot, ItemStack stack, Direction dir) {
        // Only allow insertion into the specified slot from the given side
        int[] availableSlots = getAvailableSlots(dir);
        for (int availableSlot : availableSlots) {
            return slot == availableSlot && slotControls.isValidBlockCutterItem(stack, slot);
        }
        return false;
    }
    public boolean canExtract(int slot, ItemStack stack, Direction dir) {
        // Allow extraction from any slot
        return true;
    }
    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }
    public Text getDisplayName() {
        return Text.translatable("block.delbase.block_cutting_station");
    }
    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new blockCuttingStationScreenHandler(syncId, inv, this, this.propertyDelegate);
    }
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        nbt.putInt("block_cutting_station.progress", progress);
        Inventories.writeNbt(nbt, inventory);
    }
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        progress = nbt.getInt("block_cutting_station.progress");
        super.readNbt(nbt);
    }
    public static void tick(World world, BlockPos pos, BlockState state, blockCuttingStationEntity entity) {
        if (hasRecipe(entity)) {
            entity.progress++;
            markDirty(world, pos, state);
            if (entity.progress > entity.maxProgress) { craftItem(entity); }
        } else  {
            entity.resetProgress();
            markDirty(world, pos, state);
        }
    }
    private void resetProgress() { this.progress = 0; }
    @SuppressWarnings("SameParameterValue")
    private static ItemStack extractItem(@NotNull ItemStack itemStack, int amount) {
        ItemStack out = ItemStack.EMPTY;
        if (itemStack.getCount() - amount < 1) { return out; }
        out = itemStack;
        out.setCount(itemStack.getCount()-amount);
        return out;
    }
    private static void dropContents(@NotNull World world, BlockPos pos, @NotNull SimpleInventory inventory) {
        for (int i = 0; i < inventory.size(); i++) {
            world.spawnEntity(new ItemEntity(world, pos.getX()+0.5, pos.getY()+0.5, pos.getZ()+0.5, new ItemStack(inventory.getStack(i).getItem())));
        }
        inventory.clear();
    }
    private static void craftItem(@NotNull blockCuttingStationEntity entity) {
        World level = entity.world;
        BlockPos worldPosition = entity.getPos();
        SimpleInventory inventory = new SimpleInventory(entity.inventory.size());
        for (int i = 0; i < entity.inventory.size(); i++) { inventory.setStack(i, entity.getStack(i)); }

        assert level != null;
        Optional<blockCutterStationRecipes> match = level.getRecipeManager()
                .getFirstMatch(blockCutterStationRecipes.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            Item resultItem = match.get().getOutput().getItem();
            String keyString = "none";
            boolean skipOutputSlot = false;
            int count = match.get().getOutput().getCount();
            if (entity.getStack(planSlot).getItem() == ARMOR_COMPOUND.asItem()) {
                Item le_item = entity.getStack(inputSlot).getItem();
                boolean skipCompoundEat = false;
                if (le_item instanceof ArmorItem recycle) {
                    if (recycle.getMaterial() == ArmorMaterials.NETHERITE) {
                        count = 1;
                        int bonusCount = netheriteDiamondBonus(recycle);
                        SimpleInventory bonus = new SimpleInventory(bonusCount);
                        for (int i = 0; i < bonusCount; i++) {
                            bonus.setStack(i, new ItemStack(DIAMOND));
                        }
                        dropContents(level, worldPosition, bonus);
                    }
                }
                if (le_item instanceof ToolItem tieredItem) {
                    if (tieredItem.getMaterial() == ToolMaterials.STONE) {
                        skipOutputSlot = true;
                        skipCompoundEat = true;
                        keyString = "stone";
                    }
                    if (tieredItem.getMaterial() == ToolMaterials.WOOD) {
                        skipOutputSlot = true;
                        skipCompoundEat = true;
                        keyString = "wood";
                    }
                    if (tieredItem.getMaterial() == ToolMaterials.NETHERITE) {
                        skipOutputSlot = true;
                        keyString = "netherite";
                        if (le_item instanceof SwordItem) {
                            count = configHolder.netherriteSwordDiamondBonus;
                        }
                        if (le_item instanceof AxeItem) {
                            count = configHolder.netherriteAxeDiamondBonus;
                        }
                        if (le_item instanceof PickaxeItem) {
                            count = configHolder.netherritePickAxeDiamondBonus;
                        }
                        if (le_item instanceof HoeItem || le_item instanceof ShovelItem) {
                            count = 1;
                        }
                    }
                    if ((le_item instanceof SwordItem || le_item instanceof AxeItem || le_item instanceof PickaxeItem || le_item instanceof HoeItem) && keyString.equals("none")) {
                        skipOutputSlot = true;
                        keyString = "tools";
                        //Special Behaviors for the Tiers of items
                    }
                }
                if (!(skipCompoundEat)){
                    entity.setStack(planSlot, extractItem(entity.getStack(planSlot), 1));
                }
            }
            entity.setStack(inputSlot, extractItem(entity.getStack(inputSlot), 1));
            if (skipOutputSlot) {
                int returnSize;
                SimpleInventory stone = null;
                if (keyString.equals("stone")) {
                    returnSize = configHolder.stoneSalvageRolls;
                    stone = stoneContainer(returnSize);
                    //stone confetti
                }
                if (keyString.equals("wood")){
                    returnSize = configHolder.woodSalvageRolls;
                    stone = woodContainer(returnSize);
                    //wooden confetti
                }
                if (keyString.equals("netherite")) {
                    stone = netheriteToolsBonus(count);
                    entity.setStack(outSlot, new ItemStack(resultItem,
                            entity.getStack(outSlot).getCount() + 1));
                    //put into the slot, as Netherite is a high tier. diamond(s) still allowed pop out like confetti.
                }
                if (keyString.equals("tools")) {
                    stone = ToolsBonus();
                    entity.setStack(outSlot, new ItemStack(resultItem,
                            entity.getStack(outSlot).getCount() + count));
                    //pops sticks like confetti, puts the output item
                }
                dropContents(level, worldPosition, stone);
            } else {
                entity.setStack(outSlot, new ItemStack(resultItem,
                        entity.getStack(outSlot).getCount() + count));
            }
            entity.resetProgress();
        }
    }
    private static boolean hasRecipe(@NotNull blockCuttingStationEntity entity) {
        World world1 = entity.world;
        SimpleInventory inventory = new SimpleInventory(entity.inventory.size());
        for (int i =0; i < entity.inventory.size(); i++) { inventory.setStack(i, entity.getStack(i)); }

        assert world1 != null;
        Optional<blockCutterStationRecipes> match = world1.getRecipeManager()
                .getFirstMatch(blockCutterStationRecipes.Type.INSTANCE, inventory, world1);

        if (match.isPresent()){
            Item planSlotItem;
            if (entity.getStack(planSlot).isEmpty()) { return false; } else { planSlotItem = entity.getStack(planSlot).getItem(); }
            ItemStack resultItem = match.get().getOutput();
            int count = resultItem.getCount();
            if (resultItem.getItem() instanceof BlockItem tOutput) {
                if (tOutput.getBlock() instanceof SlabBlock) {
                    count = 1;
                    if (planSlotItem != SLAB_PLANS.asItem()) { return false; }
                }
                if (tOutput.getBlock() instanceof WallBlock && planSlotItem != WALL_PLANS.asItem()) {
                    return false;
                }
                if (tOutput.getBlock() instanceof StairsBlock && planSlotItem != STAIR_PLANS.asItem()) {
                    return false;
                }
                if (tOutput.getBlock() instanceof FenceBlock && planSlotItem != FENCE_PLANS.asItem()) {
                    return false;
                }
                if (tOutput.getBlock() instanceof FenceGateBlock && planSlotItem != FENCE_GATE_PLANS.asItem()) {
                    return false;
                }
            } // Just because I like to enforce plan usage, & possibly avoid any overlooked items.
            // Counting Aids
            return canInsertAmountIntoOutputSlot(inventory, count) && canInsertItemIntoOutputSlot(inventory, resultItem);
        } else return false;
    }
    private static boolean hasNotReachedStackLimit(@NotNull blockCuttingStationEntity entity) {
        return entity.getStack(outSlot).getCount() < entity.getStack(outSlot).getMaxCount();
    }
    private static boolean canInsertItemIntoOutputSlot(@NotNull SimpleInventory inventory, @NotNull ItemStack output) {
        return inventory.getStack(blockCuttingStationEntity.outSlot).getItem() == output.getItem() || inventory.getStack(blockCuttingStationEntity.outSlot).isEmpty();
    }
    private static boolean canInsertAmountIntoOutputSlot(@NotNull SimpleInventory inventory, int variableOut) {
        return inventory.getStack(blockCuttingStationEntity.outSlot).getMaxCount() >= inventory.getStack(blockCuttingStationEntity.outSlot).getCount()+variableOut;
    }

}
