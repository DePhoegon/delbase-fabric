package com.dephoegon.delbase.aid.recipe;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.Delbase.configHolder;

public class countAid {

    private static final int nether_chest = configHolder.netherriteChestDiamondBonus;
    private static final int nether_helmet = configHolder.netherriteHelmetDiamondBonus;
    private static final int nether_legs = configHolder.netherriteLeggingsDiamondBonus;
    private static final int nether_boot = configHolder.netherriteBootsDiamondBonus;

    public static int netheriteDiamondBonus(@NotNull ArmorItem recycle) {
        int count = 1;
            if (recycle.getSlotType() == EquipmentSlot.CHEST) { count = nether_chest; }
            if (recycle.getSlotType() == EquipmentSlot.FEET) { count = nether_boot; }
            if (recycle.getSlotType() == EquipmentSlot.HEAD) { count = nether_helmet; }
            if (recycle.getSlotType() == EquipmentSlot.LEGS) { count = nether_legs; }
        return count;
    }
}
