package com.dephoegon.delbase.aid.inventory;

import com.dephoegon.delbase.aid.items.compoundPlans;
import com.dephoegon.delbase.aid.items.cutterPlans;
import com.dephoegon.delbase.block.entity.blockCuttingStationEntity;
import net.minecraft.item.ItemStack;

public class slotControls {
    public static boolean isValidBlockCutterItem(ItemStack itemStack, int slot) {
        return switch (slot) {
            case blockCuttingStationEntity.outSlot -> isValidOutput();
            case blockCuttingStationEntity.inputSlot -> isValidInput(itemStack);
            case blockCuttingStationEntity.planSlot -> isValidPlans(itemStack);
            default -> false;
        };
    }
    private static boolean isValidPlans(ItemStack itemStack) { return itemStack.getItem() instanceof compoundPlans || itemStack.getItem() instanceof cutterPlans; }
    private static boolean isValidOutput() { return false; }
    private static boolean isValidInput(ItemStack itemStack) { return !isValidPlans(itemStack); }
}
