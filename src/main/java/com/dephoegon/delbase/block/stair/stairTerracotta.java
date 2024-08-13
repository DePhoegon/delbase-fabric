package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.stair.terracottaStair;
import com.dephoegon.delbase.block.baseModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.*;

public class stairTerracotta extends baseModBlocks {
    public static final StairsBlock WHITE_TERRACOTTA_STAIR = noToolTipAid("white_terracotta_stair", WHITE_TERRACOTTA);
    public static final StairsBlock ORANGE_TERRACOTTA_STAIR = noToolTipAid("orange_terracotta_stair", ORANGE_TERRACOTTA);
    public static final StairsBlock MAGENTA_TERRACOTTA_STAIR = noToolTipAid("magenta_terracotta_stair", MAGENTA_TERRACOTTA);
    public static final StairsBlock LIGHT_BLUE_TERRACOTTA_STAIR = noToolTipAid("light_blue_terracotta_stair", LIGHT_BLUE_TERRACOTTA);
    public static final StairsBlock YELLOW_TERRACOTTA_STAIR = noToolTipAid("yellow_terracotta_stair", YELLOW_TERRACOTTA);
    public static final StairsBlock LIME_TERRACOTTA_STAIR = noToolTipAid("lime_terracotta_stair", LIME_TERRACOTTA);
    public static final StairsBlock PINK_TERRACOTTA_STAIR = noToolTipAid("pink_terracotta_stair", PINK_TERRACOTTA);
    public static final StairsBlock GRAY_TERRACOTTA_STAIR = noToolTipAid("gray_terracotta_stair", GRAY_TERRACOTTA);
    public static final StairsBlock LIGHT_GRAY_TERRACOTTA_STAIR = noToolTipAid("light_gray_terracotta_stair", LIGHT_GRAY_TERRACOTTA);
    public static final StairsBlock CYAN_TERRACOTTA_STAIR = noToolTipAid("cyan_terracotta_stair", CYAN_TERRACOTTA);
    public static final StairsBlock PURPLE_TERRACOTTA_STAIR = noToolTipAid("purple_terracotta_stair", PURPLE_TERRACOTTA);
    public static final StairsBlock BLUE_TERRACOTTA_STAIR = noToolTipAid("blue_terracotta_stair", BLUE_TERRACOTTA);
    public static final StairsBlock BROWN_TERRACOTTA_STAIR = noToolTipAid("brown_terracotta_stair", BROWN_TERRACOTTA);
    public static final StairsBlock GREEN_TERRACOTTA_STAIR = noToolTipAid("green_terracotta_stair", GREEN_TERRACOTTA);
    public static final StairsBlock RED_TERRACOTTA_STAIR = noToolTipAid("red_terracotta_stair", RED_TERRACOTTA);
    public static final StairsBlock BLACK_TERRACOTTA_STAIR = noToolTipAid("black_terracotta_stair", BLACK_TERRACOTTA);
    public static final StairsBlock TERRACOTTA_STAIR = noToolTipAid("terracotta_stair", TERRACOTTA);

    private static StairsBlock noToolTipAid(String name, Block block) { return terracottaHelper(name, block, "", "", ""); }
    private static StairsBlock terracottaHelper(String name, Block block, String norm, String Shift, String Ctrl) { return (StairsBlock) registerBlock(name, new terracottaStair(block.getDefaultState(), AbstractBlock.Settings.copy(block).sounds(BlockSoundGroup.CALCITE), norm, Shift, Ctrl)); }
    public static void registerTerracottaStair() { Delbase.LOGGER.info("Registering Terracotta Stairs for "+Delbase.Delbase_ID); }
}