package com.dephoegon.delbase.screen;

import com.dephoegon.delbase.block.entity.blockCuttingStationEntity;
import com.dephoegon.delbase.screen.slot.inputSlot;
import com.dephoegon.delbase.screen.slot.outSlot;
import com.dephoegon.delbase.screen.slot.planSlot;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.block.entity.blockCuttingStationEntity.*;

public class blockCuttingStationScreenHandler extends ScreenHandler {
    private final Inventory inventory;
    private final PropertyDelegate propertyDelegate;
    public blockCuttingStationScreenHandler(int syncId, PlayerInventory playerInventory, PacketByteBuf buf) {
        this(syncId, playerInventory, playerInventory.player.getWorld().getBlockEntity(buf.readBlockPos()), new ArrayPropertyDelegate(2));
    }
    public blockCuttingStationScreenHandler(int syncId, @NotNull PlayerInventory playerInventory, BlockEntity blockEntity, PropertyDelegate delegate) {
        super(screenHandlers.BLOCK_CUTTING_STATION_SCREEN_HANDLER, syncId);
        checkSize((Inventory) blockEntity, blockCuttingStationEntity.invSize);
        this.inventory = (Inventory) blockEntity;
        inventory.onOpen(playerInventory.player);
        this.addSlot(new inputSlot(inventory, inputSlot, 57, 18));
        this.addSlot(new outSlot(inventory, outSlot, 80, 60));
        this.addSlot(new planSlot(inventory, planSlot, 103, 18));
        this.propertyDelegate = delegate;

        addPlayerInventory(playerInventory);
        addPlayerHotBar(playerInventory);

        addProperties(delegate);
    }
    public boolean isCrafting() { return propertyDelegate.get(0) > 0; }
    public int getScaledProgress() {
        int progress = this.propertyDelegate.get(0);
        int maxProgress = this.propertyDelegate.get(1);
        int progressArrowSize = 26;

        return maxProgress != 0 && progress != 0 ? progress * progressArrowSize / maxProgress : 0;
    }

    @Override
    public boolean canUse(PlayerEntity player) { return this.inventory.canPlayerUse(player); }
    public ItemStack quickMove(PlayerEntity player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);
        if (slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();
            if (invSlot < this.inventory.size()) {
                if(!this.insertItem(originalStack, this.inventory.size(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(originalStack, 0, this.inventory.size(), false)) {
                return ItemStack.EMPTY;
            }

            if (originalStack.isEmpty()) { slot.setStack(ItemStack.EMPTY); }
            else { slot.markDirty(); }
        }
        return newStack;
    }
    private void addPlayerInventory(PlayerInventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) { this.addSlot(new Slot(playerInventory, l+i*9+9, 8+l*18, 86+i*18)); }
        }
    }
    private void addPlayerHotBar(PlayerInventory playerInventory) {
        for (int i = 0; i < 9; ++i) { this.addSlot(new Slot(playerInventory, i, 8+ i*18, 144)); }
    }
}