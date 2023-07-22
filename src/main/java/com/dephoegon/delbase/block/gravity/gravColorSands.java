package com.dephoegon.delbase.block.gravity;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.grav.sandBlock;
import com.dephoegon.delbase.aid.block.colorshift.grav.solidSandBlock;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.SandBlock;
import net.minecraft.sound.BlockSoundGroup;


public class gravColorSands extends baseModBlocks {
    public static final SandBlock BLOOD_SAND = colorSandHelper(0xff0000, "blood_sand");
    public static final SandBlock WHITE_SAND = colorSandHelper(0xffffff, "white_sand");
    public static final SandBlock ORANGE_SAND = colorSandHelper(0xffa500, "orange_sand");
    public static final SandBlock MAGENTA_SAND = colorSandHelper(0xff00ff, "magenta_sand");
    public static final SandBlock LIGHT_BLUE_SAND = colorSandHelper(0xff00ff, "light_blue_sand");
    public static final SandBlock YELLOW_SAND = colorSandHelper(0xffff00, "yellow_sand");
    public static final SandBlock LIME_SAND = colorSandHelper(0x00ff00, "lime_sand");
    public static final SandBlock PINK_SAND = colorSandHelper(0xffc0cb, "pink_sand");
    public static final SandBlock GRAY_SAND = colorSandHelper(0x808080, "gray_sand");
    public static final SandBlock PURPLE_SAND = colorSandHelper(0x800080, "purple_sand");
    public static final SandBlock BLUE_SAND = colorSandHelper(0x0000ff, "blue_sand");
    public static final SandBlock GREEN_SAND = colorSandHelper(0x008000, "green_sand");
    public static final SandBlock BROWN_SAND = colorSandHelper(0x714e32, "brown_sand");
    public static final SandBlock BLACK_SAND = colorSandHelper(0x000000, "black_sand");
    public static final SandBlock SOLID_SAND = colorSolidSandHelper(14406560, "solid_sand");
    public static final SandBlock RED_SOLID_SAND = colorSolidSandHelper(11098145, "red_solid_sand");
    public static final SandBlock BLOOD_SOLID_SAND = colorSolidSandHelper(0xff0000, "blood_solid_sand");
    public static final SandBlock WHITE_SOLID_SAND = colorSolidSandHelper(0xffffff, "white_solid_sand");
    public static final SandBlock ORANGE_SOLID_SAND = colorSolidSandHelper(0xffa500, "orange_solid_sand");
    public static final SandBlock MAGENTA_SOLID_SAND = colorSolidSandHelper(0xff00ff, "magenta_solid_sand");
    public static final SandBlock LIGHT_BLUE_SOLID_SAND = colorSolidSandHelper(0xff00ff, "light_blue_solid_sand");
    public static final SandBlock YELLOW_SOLID_SAND = colorSolidSandHelper(0xffff00, "yellow_solid_sand");
    public static final SandBlock LIME_SOLID_SAND = colorSolidSandHelper(0x00ff00, "lime_solid_sand");
    public static final SandBlock PINK_SOLID_SAND = colorSolidSandHelper(0xffc0cb, "pink_solid_sand");
    public static final SandBlock GRAY_SOLID_SAND = colorSolidSandHelper(0x808080, "gray_solid_sand");
    public static final SandBlock PURPLE_SOLID_SAND = colorSolidSandHelper(0x800080, "purple_solid_sand");
    public static final SandBlock BLUE_SOLID_SAND = colorSolidSandHelper(0x0000ff, "blue_solid_sand");
    public static final SandBlock GREEN_SOLID_SAND = colorSolidSandHelper(0x008000, "green_solid_sand");
    public static final SandBlock BROWN_SOLID_SAND = colorSolidSandHelper(0x714e32, "brown_solid_sand");
    public static final SandBlock BLACK_SOLID_SAND = colorSolidSandHelper(0x000000, "black_solid_sand");

    private static SandBlock colorSandHelper(int dustColor, String name) {
        return (SandBlock) registerBlock(name, new sandBlock(dustColor, FabricBlockSettings.of(Material.AGGREGATE, MapColor.PALE_YELLOW).strength(0.5f).sounds(BlockSoundGroup.SAND), "tooltip.delbase.info.more", "tooltip.delbase.sand.hold.info", "tooltip.delbase.sand.hold.flavor", true));
    }
    private static SandBlock colorSolidSandHelper(int dustColor, String name) {
        return (SandBlock) registerBlock(name, new solidSandBlock(dustColor, FabricBlockSettings.of(Material.AGGREGATE, MapColor.PALE_YELLOW).strength(0.5f).sounds(BlockSoundGroup.SAND), "tooltip.delbase.info.more", "tooltip.delbase.sand.solid.info", "tooltip.delbase.sand.solid.flavor", false));
    }
    public static void registerColoredSands() { Delbase.LOGGER.info("Registering Colored Sands for "+Delbase.Delbase_ID); }
}
