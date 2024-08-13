package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.wall.terracottaWall;
import com.dephoegon.delbase.block.baseModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.WallBlock;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.*;

public class wallTerracotta extends baseModBlocks {
    public static final WallBlock WHITE_TERRACOTTA_WALL = noToolTipAid("white_terracotta_wall", WHITE_TERRACOTTA);
    public static final WallBlock ORANGE_TERRACOTTA_WALL = noToolTipAid("orange_terracotta_wall", ORANGE_TERRACOTTA);
    public static final WallBlock MAGENTA_TERRACOTTA_WALL = noToolTipAid("magenta_terracotta_wall", MAGENTA_TERRACOTTA);
    public static final WallBlock LIGHT_BLUE_TERRACOTTA_WALL = noToolTipAid("light_blue_terracotta_wall", LIGHT_BLUE_TERRACOTTA);
    public static final WallBlock YELLOW_TERRACOTTA_WALL = noToolTipAid("yellow_terracotta_wall", YELLOW_TERRACOTTA);
    public static final WallBlock LIME_TERRACOTTA_WALL = noToolTipAid("lime_terracotta_wall", LIME_TERRACOTTA);
    public static final WallBlock PINK_TERRACOTTA_WALL = noToolTipAid("pink_terracotta_wall", PINK_TERRACOTTA);
    public static final WallBlock GRAY_TERRACOTTA_WALL = noToolTipAid("gray_terracotta_wall", GRAY_TERRACOTTA);
    public static final WallBlock LIGHT_GRAY_TERRACOTTA_WALL = noToolTipAid("light_gray_terracotta_wall", LIGHT_GRAY_TERRACOTTA);
    public static final WallBlock CYAN_TERRACOTTA_WALL = noToolTipAid("cyan_terracotta_wall", CYAN_TERRACOTTA);
    public static final WallBlock PURPLE_TERRACOTTA_WALL = noToolTipAid("purple_terracotta_wall", PURPLE_TERRACOTTA);
    public static final WallBlock BLUE_TERRACOTTA_WALL = noToolTipAid("blue_terracotta_wall", BLUE_TERRACOTTA);
    public static final WallBlock BROWN_TERRACOTTA_WALL = noToolTipAid("brown_terracotta_wall", BROWN_TERRACOTTA);
    public static final WallBlock GREEN_TERRACOTTA_WALL = noToolTipAid("green_terracotta_wall", GREEN_TERRACOTTA);
    public static final WallBlock RED_TERRACOTTA_WALL = noToolTipAid("red_terracotta_wall", RED_TERRACOTTA);
    public static final WallBlock BLACK_TERRACOTTA_WALL = noToolTipAid("black_terracotta_wall", BLACK_TERRACOTTA);
    public static final WallBlock TERRACOTTA_WALL = noToolTipAid("terracotta_wall", TERRACOTTA);

    private static WallBlock noToolTipAid(String name, Block block) { return terracottaHelper(name, block, "", "", ""); }
    private static WallBlock terracottaHelper(String name, Block block, String norm, String Shift, String Ctrl) { return (WallBlock) registerBlock(name, new terracottaWall(AbstractBlock.Settings.copy(block).sounds(BlockSoundGroup.CALCITE), norm, Shift, Ctrl)); }
    public static void registerTerracottaWall() { Delbase.LOGGER.info("Registering Terracotta Walls for "+Delbase.Delbase_ID); }
}