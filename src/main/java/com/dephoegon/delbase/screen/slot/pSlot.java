package com.dephoegon.delbase.screen.slot;

import com.dephoegon.delbase.block.entity.blockCuttingStationEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.aid.inventory.slotControls.isValidBlockCutterItem;

public class pSlot extends Slot {
    public pSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }
    @Override
    public boolean canInsert(@NotNull ItemStack stack) { return isValidBlockCutterItem(stack, blockCuttingStationEntity.planSlot); }
    public int getMaxItemCount(@NotNull ItemStack stack) { return stack.getMaxCount(); }
}