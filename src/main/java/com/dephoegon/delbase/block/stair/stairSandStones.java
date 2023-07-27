package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.stair.sandStoneStair;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static net.minecraft.block.Blocks.RED_SANDSTONE;
import static net.minecraft.block.Blocks.SANDSTONE;

public class stairSandStones extends baseModBlocks {
    public static final StairsBlock _SAND_STONE_STAIR = noToolTipAid("blood__sand_stone_stair", SANDSTONE);
    public static final StairsBlock RED__SAND_STONE_STAIR = noToolTipAid("red__sand_stone_stair", RED_SANDSTONE);
    public static final StairsBlock BLOOD__SAND_STONE_STAIR = noToolTipAid("blood__sand_stone_stair", BLOOD_SAND_STONE);
    public static final StairsBlock WHITE__SAND_STONE_STAIR = noToolTipAid("white__sand_stone_stair", WHITE_SAND_STONE);
    public static final StairsBlock ORANGE__SAND_STONE_STAIR = noToolTipAid("orange__sand_stone_stair", ORANGE_SAND_STONE);
    public static final StairsBlock MAGENTA__SAND_STONE_STAIR = noToolTipAid("magenta__sand_stone_stair", MAGENTA_SAND_STONE);
    public static final StairsBlock LIGHT_BLUE__SAND_STONE_STAIR = noToolTipAid("light_blue__sand_stone_stair", LIGHT_BLUE_SAND_STONE);
    public static final StairsBlock YELLOW__SAND_STONE_STAIR = noToolTipAid("yellow__sand_stone_stair", YELLOW_SAND_STONE);
    public static final StairsBlock LIME__SAND_STONE_STAIR = noToolTipAid("lime__sand_stone_stair", LIME_SAND_STONE);
    public static final StairsBlock PINK__SAND_STONE_STAIR = noToolTipAid("pink__sand_stone_stair", PINK_SAND_STONE);
    public static final StairsBlock GRAY__SAND_STONE_STAIR = noToolTipAid("gray__sand_stone_stair", GREEN_SAND_STONE);
    public static final StairsBlock LIGHT_GRAY__SAND_STONE_STAIR = noToolTipAid("light_gray__sand_stone_stair", LIGHT_GRAY_SAND_STONE);
    public static final StairsBlock CYAN__SAND_STONE_STAIR = noToolTipAid("cyan__sand_stone_stair", CYAN_SAND_STONE);
    public static final StairsBlock PURPLE__SAND_STONE_STAIR = noToolTipAid("purple__sand_stone_stair", PURPLE_SAND_STONE);
    public static final StairsBlock BLUE__SAND_STONE_STAIR = noToolTipAid("blue__sand_stone_stair", BLUE_SAND_STONE);
    public static final StairsBlock GREEN__SAND_STONE_STAIR = noToolTipAid("green__sand_stone_stair", GREEN_SAND_STONE);
    public static final StairsBlock BROWN__SAND_STONE_STAIR = noToolTipAid("brown__sand_stone_stair", BROWN_SAND_STONE);
    public static final StairsBlock BLACK__SAND_STONE_STAIR = noToolTipAid("black__sand_stone_stair", BLACK_SAND_STONE);

    private static StairsBlock noToolTipAid(String name, Block block) { return SandStoneHelper(name, block, "", "", ""); }
    private static StairsBlock SandStoneHelper(String name, Block block, String norm, String Shift, String Ctrl) { return (StairsBlock) registerBlock(name, new sandStoneStair(block.getDefaultState(), FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.STONE), norm, Shift, Ctrl)); }
    public static void registerCutSandStoneStairs() { Delbase.LOGGER.info("Registering SandStone Stairs for "+Delbase.Delbase_ID); }
}