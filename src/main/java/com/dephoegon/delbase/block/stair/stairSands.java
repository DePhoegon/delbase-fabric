package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.stair.sandStair;
import com.dephoegon.delbase.block.baseModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.block.gravity.gravColorSands.*;
import static net.minecraft.block.Blocks.RED_SAND;
import static net.minecraft.block.Blocks.SAND;

public class stairSands extends baseModBlocks {
    public static final StairsBlock SAND_STAIR = colorSolidSandHelper("sand_stair", SAND);
    public static final StairsBlock RED_SAND_STAIR = colorSolidSandHelper("red_sand_stair", RED_SAND);
    public static final StairsBlock BLOOD_SAND_STAIR = colorSolidSandHelper("blood_sand_stair", BLOOD_SAND);
    public static final StairsBlock WHITE_SAND_STAIR = colorSolidSandHelper("white_sand_stair", WHITE_SAND);
    public static final StairsBlock ORANGE_SAND_STAIR = colorSolidSandHelper("orange_sand_stair", ORANGE_SAND);
    public static final StairsBlock MAGENTA_SAND_STAIR = colorSolidSandHelper("magenta_sand_stair", MAGENTA_SAND);
    public static final StairsBlock LIGHT_BLUE_SAND_STAIR = colorSolidSandHelper("light_blue_sand_stair", LIGHT_BLUE_SAND);
    public static final StairsBlock LIGHT_GRAY_SAND_STAIR = colorSolidSandHelper("light_gray_sand_stair", LIGHT_GRAY_SAND);
    public static final StairsBlock YELLOW_SAND_STAIR = colorSolidSandHelper("yellow_sand_stair", YELLOW_SAND);
    public static final StairsBlock LIME_SAND_STAIR = colorSolidSandHelper("lime_sand_stair", LIME_SAND);
    public static final StairsBlock PINK_SAND_STAIR = colorSolidSandHelper("pink_sand_stair", PINK_SAND);
    public static final StairsBlock GRAY_SAND_STAIR = colorSolidSandHelper("gray_sand_stair", GRAY_SAND);
    public static final StairsBlock PURPLE_SAND_STAIR = colorSolidSandHelper("purple_sand_stair", PURPLE_SAND);
    public static final StairsBlock CYAN_SAND_STAIR = colorSolidSandHelper("cyan_sand_stair", CYAN_SAND);
    public static final StairsBlock BLUE_SAND_STAIR = colorSolidSandHelper("blue_sand_stair", BLUE_SAND);
    public static final StairsBlock GREEN_SAND_STAIR = colorSolidSandHelper("green_sand_stair", GREEN_SAND);
    public static final StairsBlock BROWN_SAND_STAIR = colorSolidSandHelper("brown_sand_stair", BROWN_SAND);
    public static final StairsBlock BLACK_SAND_STAIR = colorSolidSandHelper("black_sand_stair", BLACK_SAND);

    private static StairsBlock colorSolidSandHelper(String name, @NotNull Block block) {
        return (StairsBlock) registerBlock(name, new sandStair(block.getDefaultState(), AbstractBlock.Settings.copy(block).sounds(BlockSoundGroup.SAND), "tooltip.delbase.info.more", "tooltip.delbase.sand.solid.info", "tooltip.delbase.sand.solid.flavor"));
    }
    public static void registerColoredSands() { Delbase.LOGGER.info("Registering Colored Sands for "+Delbase.Delbase_ID); }
}