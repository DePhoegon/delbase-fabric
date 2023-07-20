package com.dephoegon.delbase.aid.recipe;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.aid.world.defaultVariables.*;
import static com.dephoegon.delbase.aid.world.globalVariables.*;

public class countAid {

    private static final int nether_chest = getValueOrDefault(getStaticNetherriteChestDiamondBonus(), dNetherriteChestDiamondBonus);
    private static final int nether_helmet = getValueOrDefault(getStaticNetherriteHelmetDiamondBonus(), dNetherriteHelmetDiamondBonus);
    private static final int nether_legs = getValueOrDefault(getStaticNetherriteLeggingsDiamondBonus(), dNetherriteLeggingsDiamondBonus);
    private static final int nether_boot = getValueOrDefault(getStaticNetherriteBootsDiamondBonus(), dNetherriteBootsDiamondBonus);

    public static int netheriteDiamondBonus(@NotNull ArmorItem recycle) {
        int count = 1;
            if (recycle.getSlotType() == EquipmentSlot.CHEST) { count = nether_chest; }
            if (recycle.getSlotType() == EquipmentSlot.FEET) { count = nether_boot; }
            if (recycle.getSlotType() == EquipmentSlot.HEAD) { count = nether_helmet; }
            if (recycle.getSlotType() == EquipmentSlot.LEGS) { count = nether_legs; }
        return count;
    }
}
