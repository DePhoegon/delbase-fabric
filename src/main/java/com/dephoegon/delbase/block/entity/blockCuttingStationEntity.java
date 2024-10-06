package com.dephoegon.delbase.block.entity;

import com.dephoegon.delbase.aid.inventory.ImplementedInventory;
import com.dephoegon.delbase.aid.inventory.slotControls;
import com.dephoegon.delbase.aid.world.config;
import com.dephoegon.delbase.recipe.old_blockCutterStationRecipes;
import com.dephoegon.delbase.screen.blockCuttingStationScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.*;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

import static com.dephoegon.delbase.aid.recipe.TierRandomDropAid.*;
import static com.dephoegon.delbase.aid.recipe.countAid.netheriteDiamondBonus;
import static com.dephoegon.delbase.item.BlockCutterItems.*;
import static net.minecraft.item.Items.DIAMOND;

public class blockCuttingStationEntity extends BlockEntity implements ExtendedScreenHandlerFactory<BlockPos>, ImplementedInventory {
    // Init Values
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

    // Craft Related
    public static void tick(@NotNull World world, BlockPos pos, BlockState state, blockCuttingStationEntity entity) {
        if (world.isClient()) { return; }
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
    private static void craftItem(@NotNull blockCuttingStationEntity entity) {
        World level = entity.world;
        BlockPos worldPosition = entity.getPos();
        SimpleInventory inventory = new SimpleInventory(entity.inventory.size());
        for (int i = 0; i < entity.inventory.size(); i++) { inventory.setStack(i, entity.getStack(i)); }

        assert level != null;
        DynamicRegistryManager rpHold = level.getRegistryManager();
        Optional<old_blockCutterStationRecipes> match = level.getRecipeManager()
                .getFirstMatch(old_blockCutterStationRecipes.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            Item resultItem = match.get().getResult(rpHold).getItem();
            String keyString = "none";
            boolean skipOutputSlot = false;
            int count = match.get().getResult(rpHold).getCount();
            int matRequired = 1; // get via Recipe
            if (entity.getStack(planSlot).getItem() == ARMOR_COMPOUND.asItem()) {
                int eatCount = 1; // Use Config to set later
                Item le_item = entity.getStack(inputSlot).getItem();
                boolean skipCompoundEat = false;
                if (le_item instanceof ArmorItem recycle) {
                    if (recycle.getMaterial() == ArmorMaterials.NETHERITE) {
                        count = 1;
                        int bonusCount = netheriteDiamondBonus(recycle);
                        SimpleInventory bonus = new SimpleInventory(bonusCount);
                        for (int i = 0; i < bonusCount; i++) { bonus.setStack(i, new ItemStack(DIAMOND)); }
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
                        if (le_item instanceof SwordItem) { count = config.NETHERRITE_SWORD_BONUS.get(); }
                        if (le_item instanceof AxeItem) { count = config.NETHERRITE_AXE_BONUS.get(); }
                        if (le_item instanceof PickaxeItem) { count = config.NETHERRITE_PICKAXE_BONUS.get(); }
                        if (le_item instanceof HoeItem || le_item instanceof ShovelItem) { count = 1; }
                    }
                    if ((le_item instanceof SwordItem || le_item instanceof AxeItem || le_item instanceof PickaxeItem || le_item instanceof HoeItem) && keyString.equals("none")) {
                        skipOutputSlot = true;
                        keyString = "tools";
                        //Special Behaviors for the Tiers of items
                    }
                }
                if (!(skipCompoundEat)){ entity.setStack(planSlot, extractItem(entity.getStack(planSlot), eatCount)); }
            }
            entity.setStack(inputSlot, extractItem(entity.getStack(inputSlot), matRequired));
            if (skipOutputSlot) {
                int returnSize;
                SimpleInventory stone = null;
                if (keyString.equals("stone")) {
                    returnSize = config.STONE_SALVAGE_ROLLS.get();
                    stone = stoneContainer(returnSize);
                    //stone confetti
                }
                if (keyString.equals("wood")){
                    returnSize = config.WOOD_SALVAGE_ROLLS.get();
                    stone = woodContainer(returnSize);
                    //wooden confetti
                }
                if (keyString.equals("netherite")) {
                    stone = netheriteToolsBonus(count);
                    entity.setStack(outSlot, new ItemStack(resultItem, entity.getStack(outSlot).getCount() + 1));
                    //put into the slot, as Netherite is a high tier. diamond(s) still allowed pop out like confetti.
                }
                if (keyString.equals("tools")) {
                    stone = ToolsBonus();
                    entity.setStack(outSlot, new ItemStack(resultItem, entity.getStack(outSlot).getCount() + count));
                    //pops sticks like confetti, puts the output item
                }
                dropContents(level, worldPosition, stone);
            } else { entity.setStack(outSlot, new ItemStack(resultItem, entity.getStack(outSlot).getCount() + count)); }
            entity.resetProgress();
        }
    }
    private static boolean hasRecipe(@NotNull blockCuttingStationEntity entity) {
        World world1 = entity.world;
        SimpleInventory inventory = new SimpleInventory(entity.inventory.size());
        for (int i =0; i < entity.inventory.size(); i++) { inventory.setStack(i, entity.getStack(i)); }

        assert world1 != null;
        Optional<old_blockCutterStationRecipes> match = world1.getRecipeManager()
                .getFirstMatch(old_blockCutterStationRecipes.Type.INSTANCE, inventory, world1);

        if (match.isPresent()){
            Item planSlotItem;
            if (entity.getStack(planSlot).isEmpty()) { return false; } else { planSlotItem = entity.getStack(planSlot).getItem(); }
            ItemStack resultItem = match.get().getResult(world1.getRegistryManager());
            int count = resultItem.getCount();
            if (resultItem.getItem() instanceof BlockItem tOutput) {
                if (tOutput.getBlock() instanceof SlabBlock) {
                    count = 1;
                    if (planSlotItem != SLAB_PLANS.asItem()) { return false; }
                }
                if (tOutput.getBlock() instanceof WallBlock && planSlotItem != WALL_PLANS.asItem()) { return false; }
                if (tOutput.getBlock() instanceof StairsBlock && planSlotItem != STAIR_PLANS.asItem()) { return false; }
                if (tOutput.getBlock() instanceof FenceBlock && planSlotItem != FENCE_PLANS.asItem()) { return false; }
                if (tOutput.getBlock() instanceof FenceGateBlock && planSlotItem != FENCE_GATE_PLANS.asItem()) { return false; }
            } // Just because I like to enforce plan usage, & possibly avoid any overlooked items.
            // Counting Aids
            return canUseOutput(inventory, resultItem, count, entity);
        } else return false;
    }

    // Data
    protected void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        super.writeNbt(nbt, registryLookup);
        nbt.putInt("block_cutting_station.progress", progress);
        Inventories.writeNbt(nbt, inventory, registryLookup);
    }
    public void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        super.readNbt(nbt, registryLookup);
        progress = nbt.getInt("block_cutting_station.progress");
        Inventories.readNbt(nbt, inventory, registryLookup);
    }
    public Text getDisplayName() { return Text.translatable("block.delbase.block_cutting_station"); }

    // Slot Access/Control
    public ItemStack getStack(int slot) {
        markDirty();
        return inventory.get(slot);
    }
    public ItemStack removeStack(int slot, int amount) {
        markDirty();
        ItemStack out = inventory.get(slot);
        out.decrement(amount);
        return inventory.set(slot, out);
    }
    public ItemStack removeStack(int slot) {
        markDirty();
        return Inventories.removeStack(inventory, slot);
    }
    public void setStack(int slot, ItemStack stack) {
        markDirty();
        inventory.set(slot, stack);
        if (stack.getCount() > stack.getMaxCount()) { inventory.set(slot, stack.copyWithCount(stack.getMaxCount())); }
        else { inventory.set(slot, stack); }
    }
    private static ItemStack extractItem(@NotNull ItemStack itemStack, @SuppressWarnings("SameParameterValue") int amount) {
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

    //Slot Check
    public boolean canPlayerUse(PlayerEntity player) { return Inventory.canPlayerUse(this, player); }
    public DefaultedList<ItemStack> getItems() { return inventory; }
    public boolean canInsert(int slot, ItemStack stack, Direction dir) {
        // Only allow insertion into the specified slot from the given side
        int[] availableSlots = getAvailableSlots(dir);
        for (int availableSlot : availableSlots) {
            return slot == availableSlot && slotControls.isValidBlockCutterItem(stack, slot);
        }
        return false;
    }
    private static boolean canUseOutput(@NotNull SimpleInventory inventory, @NotNull ItemStack output, int variableOut, @NotNull blockCuttingStationEntity entity) {
        if (entity.getStack(outSlot).isEmpty()) { return true; }
        if (entity.getStack(outSlot).getItem() == output.getItem()) { return inventory.getStack(outSlot).getMaxCount() >= inventory.getStack(outSlot).getCount() + variableOut; }
        return false;
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
    public boolean isEmpty() {
        for (int i = 0; i < size(); i++) {
            ItemStack stack = getStack(i);
            if (!stack.isEmpty()) { return false; }
        }
        return true;
    }
    public int size() { return inventory.size(); }

    //Packet Update
    public Packet<ClientPlayPacketListener> toUpdatePacket() { return BlockEntityUpdateS2CPacket.create(this); }

    // Screen
    public BlockPos getScreenOpeningData(ServerPlayerEntity player) { return this.pos; }
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) { return new blockCuttingStationScreenHandler(syncId, inv, this, this.propertyDelegate); }
}