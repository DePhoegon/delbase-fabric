package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.stair.cutSandStoneStair;
import com.dephoegon.delbase.block.baseModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static net.minecraft.block.Blocks.RED_SANDSTONE;
import static net.minecraft.block.Blocks.SANDSTONE;

public class stairCutSandStones extends baseModBlocks {
    public static final StairsBlock CUT_SAND_STONE_STAIR = noToolTipAid("cut_sand_stone_stair", SANDSTONE);
    public static final StairsBlock RED_CUT_SAND_STONE_STAIR = noToolTipAid("red_cut_sand_stone_stair", RED_SANDSTONE);
    public static final StairsBlock BLOOD_CUT_SAND_STONE_STAIR = noToolTipAid("blood_cut_sand_stone_stair", BLOOD_SAND_STONE);
    public static final StairsBlock WHITE_CUT_SAND_STONE_STAIR = noToolTipAid("white_cut_sand_stone_stair", WHITE_SAND_STONE);
    public static final StairsBlock ORANGE_CUT_SAND_STONE_STAIR = noToolTipAid("orange_cut_sand_stone_stair", ORANGE_SAND_STONE);
    public static final StairsBlock MAGENTA_CUT_SAND_STONE_STAIR = noToolTipAid("magenta_cut_sand_stone_stair", MAGENTA_SAND_STONE);
    public static final StairsBlock LIGHT_BLUE_CUT_SAND_STONE_STAIR = noToolTipAid("light_blue_cut_sand_stone_stair", LIGHT_BLUE_SAND_STONE);
    public static final StairsBlock YELLOW_CUT_SAND_STONE_STAIR = noToolTipAid("yellow_cut_sand_stone_stair", YELLOW_SAND_STONE);
    public static final StairsBlock LIME_CUT_SAND_STONE_STAIR = noToolTipAid("lime_cut_sand_stone_stair", LIME_SAND_STONE);
    public static final StairsBlock PINK_CUT_SAND_STONE_STAIR = noToolTipAid("pink_cut_sand_stone_stair", PINK_SAND_STONE);
    public static final StairsBlock GRAY_CUT_SAND_STONE_STAIR = noToolTipAid("gray_cut_sand_stone_stair", GREEN_SAND_STONE);
    public static final StairsBlock LIGHT_GRAY_CUT_SAND_STONE_STAIR = noToolTipAid("light_gray_cut_sand_stone_stair", LIGHT_GRAY_SAND_STONE);
    public static final StairsBlock CYAN_CUT_SAND_STONE_STAIR = noToolTipAid("cyan_cut_sand_stone_stair", CYAN_SAND_STONE);
    public static final StairsBlock PURPLE_CUT_SAND_STONE_STAIR = noToolTipAid("purple_cut_sand_stone_stair", PURPLE_SAND_STONE);
    public static final StairsBlock BLUE_CUT_SAND_STONE_STAIR = noToolTipAid("blue_cut_sand_stone_stair", BLUE_SAND_STONE);
    public static final StairsBlock GREEN_CUT_SAND_STONE_STAIR = noToolTipAid("green_cut_sand_stone_stair", GREEN_SAND_STONE);
    public static final StairsBlock BROWN_CUT_SAND_STONE_STAIR = noToolTipAid("brown_cut_sand_stone_stair", BROWN_SAND_STONE);
    public static final StairsBlock BLACK_CUT_SAND_STONE_STAIR = noToolTipAid("black_cut_sand_stone_stair", BLACK_SAND_STONE);

    private static StairsBlock noToolTipAid(String name, Block block) { return cutSandStoneHelper(name, block, "", "", ""); }
    private static StairsBlock cutSandStoneHelper(String name, Block block, String norm, String Shift, String Ctrl) { return (StairsBlock) registerBlock(name, new cutSandStoneStair(block.getDefaultState(), AbstractBlock.Settings.copy(block).sounds(BlockSoundGroup.STONE), norm, Shift, Ctrl)); }
    public static void registerCutSandStoneStairs() { Delbase.LOGGER.info("Registering Cut SandStone Stairs for "+Delbase.Delbase_ID); }
}