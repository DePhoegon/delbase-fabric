package com.dephoegon.delbase.aid.recipe;

import com.dephoegon.delbase.aid.world.config;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import org.jetbrains.annotations.NotNull;

public class countAid {

    private static final int nether_chest = config.NETHERRITE_CHEST_DIAMOND_BONUS.get();
    private static final int nether_helmet = config.NETHERRITE_HELMET_DIAMOND_BONUS.get();
    private static final int nether_legs = config.NETHERRITE_LEGGINGS_DIAMOND_BONUS.get();
    private static final int nether_boot = config.NETHERRITE_BOOTS_DIAMOND_BONUS.get();

    public static int netheriteDiamondBonus(@NotNull ArmorItem recycle) {
        int count = 1;
            if (recycle.getSlotType() == EquipmentSlot.CHEST) { count = nether_chest; }
            if (recycle.getSlotType() == EquipmentSlot.FEET) { count = nether_boot; }
            if (recycle.getSlotType() == EquipmentSlot.HEAD) { count = nether_helmet; }
            if (recycle.getSlotType() == EquipmentSlot.LEGS) { count = nether_legs; }
        return count;
    }
}