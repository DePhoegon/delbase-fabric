package com.dephoegon.delbase.block.gravity;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.grav.sandBlock;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.SandBlock;
import net.minecraft.sound.BlockSoundGroup;


public class gravColorSands extends baseModBlocks {
    public static final SandBlock BLOOD_SAND = colorSandHelper(0xff0000, "blood_sand", MapColor.RED);
    public static final SandBlock WHITE_SAND = colorSandHelper(0xffffff, "white_sand", MapColor.WHITE);
    public static final SandBlock ORANGE_SAND = colorSandHelper(0xffa500, "orange_sand", MapColor.ORANGE);
    public static final SandBlock MAGENTA_SAND = colorSandHelper(0xff00ff, "magenta_sand", MapColor.MAGENTA);
    public static final SandBlock LIGHT_BLUE_SAND = colorSandHelper(0xff00ff, "light_blue_sand", MapColor.LIGHT_BLUE);
    public static final SandBlock LIGHT_GRAY_SAND = colorSandHelper(0xd3d3d3, "light_gray_sand", MapColor.LIGHT_GRAY);
    public static final SandBlock YELLOW_SAND = colorSandHelper(0xffff00, "yellow_sand", MapColor.YELLOW);
    public static final SandBlock LIME_SAND = colorSandHelper(0x00ff00, "lime_sand", MapColor.LIME);
    public static final SandBlock PINK_SAND = colorSandHelper(0xffc0cb, "pink_sand", MapColor.PINK);
    public static final SandBlock GRAY_SAND = colorSandHelper(0x808080, "gray_sand", MapColor.GRAY);
    public static final SandBlock CYAN_SAND = colorSandHelper(0x00ffff, "cyan_sand", MapColor.CYAN);
    public static final SandBlock PURPLE_SAND = colorSandHelper(0x800080, "purple_sand", MapColor.PURPLE);
    public static final SandBlock BLUE_SAND = colorSandHelper(0x0000ff, "blue_sand", MapColor.BLUE);
    public static final SandBlock GREEN_SAND = colorSandHelper(0x008000, "green_sand", MapColor.GREEN);
    public static final SandBlock BROWN_SAND = colorSandHelper(0x714e32, "brown_sand", MapColor.BROWN);
    public static final SandBlock BLACK_SAND = colorSandHelper(0x000000, "black_sand", MapColor.BLACK);

    private static SandBlock colorSandHelper(int dustColor, String name, MapColor mapColor) {
        return (SandBlock) registerBlock(name, new sandBlock(dustColor, FabricBlockSettings.of(Material.AGGREGATE, mapColor).strength(0.5f).sounds(BlockSoundGroup.SAND), "tooltip.delbase.info.more", "tooltip.delbase.sand.hold.info", "tooltip.delbase.sand.hold.flavor", true));
    }
    public static void registerColoredSands() { Delbase.LOGGER.info("Registering Colored Sands for "+Delbase.Delbase_ID); }
}
