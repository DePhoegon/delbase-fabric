package com.dephoegon.delbase.block.entity;

import com.dephoegon.delbase.aid.inventory.ImplementedInventory;
import com.dephoegon.delbase.aid.inventory.slotControls;
import com.dephoegon.delbase.screen.blockCuttingStationScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class blockCuttingStationEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory, SidedInventory, Inventory {
    public static final int invSize = 3;
    public static final int planSlot = 2;
    public static final int inputSlot = 0;
    public static final int outSlot = 1;
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(invSize, ItemStack.EMPTY);
    public blockCuttingStationEntity(BlockPos pos, BlockState state) {
        super(blockEntities.BLOCK_CUTTER_ENTITY, pos, state);
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
        return new TranslatableText("block.delbase.block_cutting_station");
    }
    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new blockCuttingStationScreenHandler(syncId, inv, this);
    }
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
    }
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        super.readNbt(nbt);
    }
    public static void tick(World world, BlockPos pos, BlockState state, blockCuttingStationEntity entity) {
        if (hasRecipe(entity) && hasNotReachedStackLimit(entity)) {
            craftItem(entity);
        }
    }
    private static void craftItem(blockCuttingStationEntity entity) {
        // Craft Logic
    }
    private static boolean hasRecipe(blockCuttingStationEntity entity) {
        // Recipe Logic
        return false;
    }
    private static boolean hasNotReachedStackLimit(blockCuttingStationEntity entity) {
        return entity.getStack(outSlot).getCount() < entity.getStack(outSlot).getMaxCount();
    }

}
