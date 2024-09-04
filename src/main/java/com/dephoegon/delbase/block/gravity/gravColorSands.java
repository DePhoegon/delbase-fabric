package com.dephoegon.delbase.block.gravity;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.grav.sandBlock;
import com.dephoegon.delbase.block.baseModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.ColoredFallingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.ColorCode;

import static net.minecraft.block.Blocks.SAND;


public class gravColorSands extends baseModBlocks {
    public static final ColoredFallingBlock BLOOD_SAND = colorSandHelper(0xff0000, "blood_sand", MapColor.TERRACOTTA_RED);
    public static final ColoredFallingBlock WHITE_SAND = colorSandHelper(0xffffff, "white_sand", MapColor.TERRACOTTA_WHITE);
    public static final ColoredFallingBlock ORANGE_SAND = colorSandHelper(0xffa500, "orange_sand", MapColor.TERRACOTTA_ORANGE);
    public static final ColoredFallingBlock MAGENTA_SAND = colorSandHelper(0xff00ff, "magenta_sand", MapColor.TERRACOTTA_MAGENTA);
    public static final ColoredFallingBlock LIGHT_BLUE_SAND = colorSandHelper(0xff00ff, "light_blue_sand", MapColor.TERRACOTTA_LIGHT_BLUE);
    public static final ColoredFallingBlock LIGHT_GRAY_SAND = colorSandHelper(0xd3d3d3, "light_gray_sand", MapColor.TERRACOTTA_LIGHT_GRAY);
    public static final ColoredFallingBlock YELLOW_SAND = colorSandHelper(0xffff00, "yellow_sand", MapColor.TERRACOTTA_YELLOW);
    public static final ColoredFallingBlock LIME_SAND = colorSandHelper(0x00ff00, "lime_sand", MapColor.TERRACOTTA_LIME);
    public static final ColoredFallingBlock PINK_SAND = colorSandHelper(0xffc0cb, "pink_sand", MapColor.TERRACOTTA_PINK);
    public static final ColoredFallingBlock GRAY_SAND = colorSandHelper(0x808080, "gray_sand", MapColor.TERRACOTTA_GRAY);
    public static final ColoredFallingBlock CYAN_SAND = colorSandHelper(0x00ffff, "cyan_sand", MapColor.TERRACOTTA_CYAN);
    public static final ColoredFallingBlock PURPLE_SAND = colorSandHelper(0x800080, "purple_sand", MapColor.TERRACOTTA_PURPLE);
    public static final ColoredFallingBlock BLUE_SAND = colorSandHelper(0x0000ff, "blue_sand", MapColor.TERRACOTTA_BLUE);
    public static final ColoredFallingBlock GREEN_SAND = colorSandHelper(0x008000, "green_sand", MapColor.TERRACOTTA_GREEN);
    public static final ColoredFallingBlock BROWN_SAND = colorSandHelper(0x714e32, "brown_sand", MapColor.TERRACOTTA_BROWN);
    public static final ColoredFallingBlock BLACK_SAND = colorSandHelper(0x000000, "black_sand", MapColor.TERRACOTTA_BLACK);

    private static ColoredFallingBlock colorSandHelper(int dustColor, String name, MapColor mapColor) {
        return (ColoredFallingBlock) registerBlock(name, new sandBlock(new ColorCode(dustColor), AbstractBlock.Settings.copy(SAND).mapColor(mapColor).strength(0.5f).sounds(BlockSoundGroup.SAND), "tooltip.delbase.sand.hold.flavor", "", "", true));
    }
    public static void registerColoredSands() { Delbase.LOGGER.info("Registering Colored Sands for "+Delbase.Delbase_ID); }
}