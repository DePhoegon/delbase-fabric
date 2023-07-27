package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.stair.sandStoneStair;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;

import static com.dephoegon.delbase.block.general.genSandStones.*;

public class stairSandStones extends baseModBlocks {
    public static final StairsBlock BLOOD_SAND_STONE_STAIR = noToolTipAid("blood_sand_stone_stair", BLOOD_SAND_STONE);
    public static final StairsBlock WHITE_SAND_STONE_STAIR = noToolTipAid("white_sand_stone_stair", WHITE_SAND_STONE);
    public static final StairsBlock ORANGE_SAND_STONE_STAIR = noToolTipAid("orange_sand_stone_stair", ORANGE_SAND_STONE);
    public static final StairsBlock MAGENTA_SAND_STONE_STAIR = noToolTipAid("magenta_sand_stone_stair", MAGENTA_SAND_STONE);
    public static final StairsBlock LIGHT_BLUE_SAND_STONE_STAIR = noToolTipAid("light_blue_sand_stone_stair", LIGHT_BLUE_SAND_STONE);
    public static final StairsBlock YELLOW_SAND_STONE_STAIR = noToolTipAid("yellow_sand_stone_stair", YELLOW_SAND_STONE);
    public static final StairsBlock LIME_SAND_STONE_STAIR = noToolTipAid("lime_sand_stone_stair", LIME_SAND_STONE);
    public static final StairsBlock PINK_SAND_STONE_STAIR = noToolTipAid("pink_sand_stone_stair", PINK_SAND_STONE);
    public static final StairsBlock GRAY_SAND_STONE_STAIR = noToolTipAid("gray_sand_stone_stair", GREEN_SAND_STONE);
    public static final StairsBlock LIGHT_GRAY_SAND_STONE_STAIR = noToolTipAid("light_gray_sand_stone_stair", LIGHT_GRAY_SAND_STONE);
    public static final StairsBlock CYAN_SAND_STONE_STAIR = noToolTipAid("cyan_sand_stone_stair", CYAN_SAND_STONE);
    public static final StairsBlock PURPLE_SAND_STONE_STAIR = noToolTipAid("purple_sand_stone_stair", PURPLE_SAND_STONE);
    public static final StairsBlock BLUE_SAND_STONE_STAIR = noToolTipAid("blue_sand_stone_stair", BLUE_SAND_STONE);
    public static final StairsBlock GREEN_SAND_STONE_STAIR = noToolTipAid("green_sand_stone_stair", GREEN_SAND_STONE);
    public static final StairsBlock BROWN_SAND_STONE_STAIR = noToolTipAid("brown_sand_stone_stair", BROWN_SAND_STONE);
    public static final StairsBlock BLACK_SAND_STONE_STAIR = noToolTipAid("black_sand_stone_stair", BLACK_SAND_STONE);

    private static StairsBlock noToolTipAid(String name, Block block) { return SandStoneHelper(name, block, "", "", ""); }
    private static StairsBlock SandStoneHelper(String name, Block block, String norm, String Shift, String Ctrl) { return (StairsBlock) registerBlock(name, new sandStoneStair(block.getDefaultState(), FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.STONE), norm, Shift, Ctrl)); }
    public static void registerCutSandStoneStairs() { Delbase.LOGGER.info("Registering SandStone Stairs for "+Delbase.Delbase_ID); }
}