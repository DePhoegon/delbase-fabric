package com.dephoegon.delbase.screen;

import com.dephoegon.delbase.block.entity.blockCuttingStationEntity;
import com.dephoegon.delbase.screen.slot.inputSlot;
import com.dephoegon.delbase.screen.slot.outSlot;
import com.dephoegon.delbase.screen.slot.planSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;

import static com.dephoegon.delbase.block.entity.blockCuttingStationEntity.*;

public class blockCuttingStationScreenHandler extends ScreenHandler {
    private final Inventory inventory;
    public blockCuttingStationScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, new SimpleInventory(blockCuttingStationEntity.invSize));
    }
    public blockCuttingStationScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory) {
        super(screenHandlers.BLOCK_CUTTING_STATION_SCREEN_HANDLER, syncId);
        checkSize(inventory, blockCuttingStationEntity.invSize);
        this.inventory = inventory;
        inventory.onOpen(playerInventory.player);
        this.addSlot(new inputSlot(inventory, inputSlot, 57, 18));
        this.addSlot(new outSlot(inventory, outSlot, 80, 60));
        this.addSlot(new planSlot(inventory, planSlot, 103, 18));

        addPlayerInventory(playerInventory);
        addPlayerHotBar(playerInventory);
    }
    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }
    public ItemStack transferSlot(PlayerEntity player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);
        if (slot != null && slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();
            if (invSlot < this.inventory.size()) {
                if(!this.insertItem(originalStack, this.inventory.size(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(originalStack, 0, this.inventory.size(), false)) {
                return ItemStack.EMPTY;
            }

            if (originalStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
        }

        return newStack;
    }
    private void addPlayerInventory(PlayerInventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l+i*9+9, 8+l*18, 86+i*18));
            }
        }
    }
    private void addPlayerHotBar(PlayerInventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8+ i*18, 144));
        }
    }
}