package com.dephoegon.delbase.item;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.items.BlockDyes;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.DyeColor;

public class ShiftingDyes extends BaseItems {
    public static final Item CLEANSE_SHIFT_DYE = ShiftDyeHelper(DyeColor.WHITE, "cleanse_shift_dye", "tooltip.delbase.color.suction");
    public static final Item RED_SHIFT_DYE = ShiftDyeHelper(DyeColor.RED, "red_shift_dye");
    public static final Item BLOOD_SHIFT_DYE = ShiftDyeHelper(DyeColor.RED, "blood_shift_dye");
    public static final Item WHITE_SHIFT_DYE = ShiftDyeHelper(DyeColor.WHITE, "white_shift_dye");
    public static final Item ORANGE_SHIFT_DYE = ShiftDyeHelper(DyeColor.ORANGE, "orange_shift_dye");
    public static final Item MAGENTA_SHIFT_DYE = ShiftDyeHelper(DyeColor.MAGENTA, "magenta_shift_dye");
    public static final Item LIGHT_BLUE_SHIFT_DYE = ShiftDyeHelper(DyeColor.LIGHT_BLUE, "light_blue_shift_dye");
    public static final Item YELLOW_SHIFT_DYE = ShiftDyeHelper(DyeColor.YELLOW, "yellow_shift_dye");
    public static final Item LIME_SHIFT_DYE = ShiftDyeHelper(DyeColor.LIME, "lime_shift_dye");
    public static final Item PINK_SHIFT_DYE = ShiftDyeHelper(DyeColor.PINK, "pink_shift_dye");
    public static final Item GRAY_SHIFT_DYE = ShiftDyeHelper(DyeColor.GRAY, "gray_shift_dye");
    public static final Item LIGHT_GRAY_SHIFT_DYE = ShiftDyeHelper(DyeColor.LIGHT_GRAY, "light_gray_shift_dye");
    public static final Item CYAN_SHIFT_DYE = ShiftDyeHelper(DyeColor.CYAN, "cyan_shift_dye");
    public static final Item PURPLE_SHIFT_DYE = ShiftDyeHelper(DyeColor.PURPLE, "purple_shift_dye");
    public static final Item BLUE_SHIFT_DYE = ShiftDyeHelper(DyeColor.BLUE, "blue_shift_dye");
    public static final Item GREEN_SHIFT_DYE = ShiftDyeHelper(DyeColor.GREEN, "green_shift_dye");
    public static final Item BROWN_SHIFT_DYE = ShiftDyeHelper(DyeColor.BROWN, "brown_shift_dye");
    public static final Item BLACK_SHIFT_DYE = ShiftDyeHelper(DyeColor.BLACK, "black_shift_dye");

    public static void registerItems() {
        Delbase.LOGGER.info("Registering "+Delbase.Delbase_ID+" Dye Items");
    }
    private static Item ShiftDyeHelper(DyeColor color, String name, String shift) { return registerItem(name, new BlockDyes(color, new FabricItemSettings().maxCount(64), "tooltip.delbase.info.shift.more", shift, "")); }
    private static Item ShiftDyeHelper(DyeColor color, String name) { return ShiftDyeHelper(color, name, "tooltip.delbase.color.shifter"); }
}