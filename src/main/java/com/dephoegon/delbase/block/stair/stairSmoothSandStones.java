package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.stair.smoothSandStoneStair;
import com.dephoegon.delbase.block.baseModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;

import static com.dephoegon.delbase.block.general.genSandStones.*;

public class stairSmoothSandStones extends baseModBlocks {
    public static final StairsBlock BLOOD_SMOOTH_SAND_STONE_STAIR = noToolTipAid("blood_smooth_sand_stone_stair", BLOOD_SAND_STONE);
    public static final StairsBlock WHITE_SMOOTH_SAND_STONE_STAIR = noToolTipAid("white_smooth_sand_stone_stair", WHITE_SAND_STONE);
    public static final StairsBlock ORANGE_SMOOTH_SAND_STONE_STAIR = noToolTipAid("orange_smooth_sand_stone_stair", ORANGE_SAND_STONE);
    public static final StairsBlock MAGENTA_SMOOTH_SAND_STONE_STAIR = noToolTipAid("magenta_smooth_sand_stone_stair", MAGENTA_SAND_STONE);
    public static final StairsBlock LIGHT_BLUE_SMOOTH_SAND_STONE_STAIR = noToolTipAid("light_blue_smooth_sand_stone_stair", LIGHT_BLUE_SAND_STONE);
    public static final StairsBlock YELLOW_SMOOTH_SAND_STONE_STAIR = noToolTipAid("yellow_smooth_sand_stone_stair", YELLOW_SAND_STONE);
    public static final StairsBlock LIME_SMOOTH_SAND_STONE_STAIR = noToolTipAid("lime_smooth_sand_stone_stair", LIME_SAND_STONE);
    public static final StairsBlock PINK_SMOOTH_SAND_STONE_STAIR = noToolTipAid("pink_smooth_sand_stone_stair", PINK_SAND_STONE);
    public static final StairsBlock GRAY_SMOOTH_SAND_STONE_STAIR = noToolTipAid("gray_smooth_sand_stone_stair", GRAY_SAND_STONE);
    public static final StairsBlock LIGHT_GRAY_SMOOTH_SAND_STONE_STAIR = noToolTipAid("light_gray_smooth_sand_stone_stair", LIGHT_GRAY_SAND_STONE);
    public static final StairsBlock CYAN_SMOOTH_SAND_STONE_STAIR = noToolTipAid("cyan_smooth_sand_stone_stair", CYAN_SAND_STONE);
    public static final StairsBlock PURPLE_SMOOTH_SAND_STONE_STAIR = noToolTipAid("purple_smooth_sand_stone_stair", PURPLE_SAND_STONE);
    public static final StairsBlock BLUE_SMOOTH_SAND_STONE_STAIR = noToolTipAid("blue_smooth_sand_stone_stair", BLUE_SAND_STONE);
    public static final StairsBlock GREEN_SMOOTH_SAND_STONE_STAIR = noToolTipAid("green_smooth_sand_stone_stair", GREEN_SAND_STONE);
    public static final StairsBlock BROWN_SMOOTH_SAND_STONE_STAIR = noToolTipAid("brown_smooth_sand_stone_stair", BROWN_SAND_STONE);
    public static final StairsBlock BLACK_SMOOTH_SAND_STONE_STAIR = noToolTipAid("black_smooth_sand_stone_stair", BLACK_SAND_STONE);

    private static StairsBlock noToolTipAid(String name, Block block) { return smoothSandStoneHelper(name, block, "", "", ""); }
    private static StairsBlock smoothSandStoneHelper(String name, Block block, String norm, String Shift, String Ctrl) { return (StairsBlock) registerBlock(name, new smoothSandStoneStair(block.getDefaultState(), AbstractBlock.Settings.copy(block).sounds(BlockSoundGroup.STONE), norm, Shift, Ctrl)); }
    public static void registerCutSandStoneStairs() { Delbase.LOGGER.info("Registering Smooth SandStone Stairs for "+Delbase.Delbase_ID); }
}