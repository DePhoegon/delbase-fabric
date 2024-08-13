package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.wall.sandStoneWall;
import com.dephoegon.delbase.block.baseModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.WallBlock;
import net.minecraft.sound.BlockSoundGroup;

import static com.dephoegon.delbase.block.general.genSandStones.*;

public class wallSandStones extends baseModBlocks {
    public static final WallBlock BLOOD_SAND_STONE_WALL = noToolTipAid("blood_sand_stone_wall", BLOOD_SAND_STONE);
    public static final WallBlock WHITE_SAND_STONE_WALL = noToolTipAid("white_sand_stone_wall", WHITE_SAND_STONE);
    public static final WallBlock ORANGE_SAND_STONE_WALL = noToolTipAid("orange_sand_stone_wall", ORANGE_SAND_STONE);
    public static final WallBlock MAGENTA_SAND_STONE_WALL = noToolTipAid("magenta_sand_stone_wall", MAGENTA_SAND_STONE);
    public static final WallBlock LIGHT_BLUE_SAND_STONE_WALL = noToolTipAid("light_blue_sand_stone_wall", LIGHT_BLUE_SAND_STONE);
    public static final WallBlock YELLOW_SAND_STONE_WALL = noToolTipAid("yellow_sand_stone_wall", YELLOW_SAND_STONE);
    public static final WallBlock LIME_SAND_STONE_WALL = noToolTipAid("lime_sand_stone_wall", LIME_SAND_STONE);
    public static final WallBlock PINK_SAND_STONE_WALL = noToolTipAid("pink_sand_stone_wall", PINK_SAND_STONE);
    public static final WallBlock GRAY_SAND_STONE_WALL = noToolTipAid("gray_sand_stone_wall", GRAY_SAND_STONE);
    public static final WallBlock LIGHT_GRAY_SAND_STONE_WALL = noToolTipAid("light_gray_sand_stone_wall", LIGHT_GRAY_SAND_STONE);
    public static final WallBlock CYAN_SAND_STONE_WALL = noToolTipAid("cyan_sand_stone_wall", CYAN_SAND_STONE);
    public static final WallBlock PURPLE_SAND_STONE_WALL = noToolTipAid("purple_sand_stone_wall", PURPLE_SAND_STONE);
    public static final WallBlock BLUE_SAND_STONE_WALL = noToolTipAid("blue_sand_stone_wall", BLUE_SAND_STONE);
    public static final WallBlock GREEN_SAND_STONE_WALL = noToolTipAid("green_sand_stone_wall", GREEN_SAND_STONE);
    public static final WallBlock BROWN_SAND_STONE_WALL = noToolTipAid("brown_sand_stone_wall", BROWN_SAND_STONE);
    public static final WallBlock BLACK_SAND_STONE_WALL = noToolTipAid("black_sand_stone_wall", BLACK_SAND_STONE);

    private static WallBlock noToolTipAid(String name, Block block) { return SandStoneHelper(name, block, "", "", ""); }
    private static WallBlock SandStoneHelper(String name, Block block, String norm, String Shift, String Ctrl) { return (WallBlock) registerBlock(name, new sandStoneWall(AbstractBlock.Settings.copy(block).sounds(BlockSoundGroup.STONE), norm, Shift, Ctrl)); }
    public static void registerSandStonewalls() { Delbase.LOGGER.info("Registering SandStone walls for "+Delbase.Delbase_ID); }
}