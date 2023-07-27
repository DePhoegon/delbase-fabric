package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.stair.chiseledSandStoneStair;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static net.minecraft.block.Blocks.RED_SANDSTONE;
import static net.minecraft.block.Blocks.SANDSTONE;

public class stairChiseledSandStones extends baseModBlocks {
    public static final StairsBlock CHISELED_SAND_STONE_STAIR = noToolTipAid("blood_chiseled_sand_stone_stair", SANDSTONE);
    public static final StairsBlock RED_CHISELED_SAND_STONE_STAIR = noToolTipAid("red_chiseled_sand_stone_stair", RED_SANDSTONE);
    public static final StairsBlock BLOOD_CHISELED_SAND_STONE_STAIR = noToolTipAid("blood_chiseled_sand_stone_stair", BLOOD_SAND_STONE);
    public static final StairsBlock WHITE_CHISELED_SAND_STONE_STAIR = noToolTipAid("white_chiseled_sand_stone_stair", WHITE_SAND_STONE);
    public static final StairsBlock ORANGE_CHISELED_SAND_STONE_STAIR = noToolTipAid("orange_chiseled_sand_stone_stair", ORANGE_SAND_STONE);
    public static final StairsBlock MAGENTA_CHISELED_SAND_STONE_STAIR = noToolTipAid("magenta_chiseled_sand_stone_stair", MAGENTA_SAND_STONE);
    public static final StairsBlock LIGHT_BLUE_CHISELED_SAND_STONE_STAIR = noToolTipAid("light_blue_chiseled_sand_stone_stair", LIGHT_BLUE_SAND_STONE);
    public static final StairsBlock YELLOW_CHISELED_SAND_STONE_STAIR = noToolTipAid("yellow_chiseled_sand_stone_stair", YELLOW_SAND_STONE);
    public static final StairsBlock LIME_CHISELED_SAND_STONE_STAIR = noToolTipAid("lime_chiseled_sand_stone_stair", LIME_SAND_STONE);
    public static final StairsBlock PINK_CHISELED_SAND_STONE_STAIR = noToolTipAid("pink_chiseled_sand_stone_stair", PINK_SAND_STONE);
    public static final StairsBlock GRAY_CHISELED_SAND_STONE_STAIR = noToolTipAid("gray_chiseled_sand_stone_stair", GREEN_SAND_STONE);
    public static final StairsBlock LIGHT_GRAY_CHISELED_SAND_STONE_STAIR = noToolTipAid("light_gray_chiseled_sand_stone_stair", LIGHT_GRAY_SAND_STONE);
    public static final StairsBlock CYAN_CHISELED_SAND_STONE_STAIR = noToolTipAid("cyan_chiseled_sand_stone_stair", CYAN_SAND_STONE);
    public static final StairsBlock PURPLE_CHISELED_SAND_STONE_STAIR = noToolTipAid("purple_chiseled_sand_stone_stair", PURPLE_SAND_STONE);
    public static final StairsBlock BLUE_CHISELED_SAND_STONE_STAIR = noToolTipAid("blue_chiseled_sand_stone_stair", BLUE_SAND_STONE);
    public static final StairsBlock GREEN_CHISELED_SAND_STONE_STAIR = noToolTipAid("green_chiseled_sand_stone_stair", GREEN_SAND_STONE);
    public static final StairsBlock BROWN_CHISELED_SAND_STONE_STAIR = noToolTipAid("brown_chiseled_sand_stone_stair", BROWN_SAND_STONE);
    public static final StairsBlock BLACK_CHISELED_SAND_STONE_STAIR = noToolTipAid("black_chiseled_sand_stone_stair", BLACK_SAND_STONE);

    private static StairsBlock noToolTipAid(String name, Block block) { return chiseledSandStoneHelper(name, block, "", "", ""); }
    private static StairsBlock chiseledSandStoneHelper(String name, Block block, String norm, String Shift, String Ctrl) { return (StairsBlock) registerBlock(name, new chiseledSandStoneStair(block.getDefaultState(), FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.STONE), norm, Shift, Ctrl)); }
    public static void registerCutSandStoneStairs() { Delbase.LOGGER.info("Registering Chiseled SandStone Stairs for "+Delbase.Delbase_ID); }
}