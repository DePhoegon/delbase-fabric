package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.wall.cutSandStoneWall;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.WallBlock;
import net.minecraft.sound.BlockSoundGroup;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static net.minecraft.block.Blocks.RED_SANDSTONE;
import static net.minecraft.block.Blocks.SANDSTONE;

public class wallCutSandStones extends baseModBlocks {
    public static final WallBlock CUT_SAND_STONE_WALL = noToolTipAid("cut_sand_stone_wall", SANDSTONE);
    public static final WallBlock RED_CUT_SAND_STONE_WALL = noToolTipAid("red_cut_sand_stone_wall", RED_SANDSTONE);
    public static final WallBlock BLOOD_CUT_SAND_STONE_WALL = noToolTipAid("blood_cut_sand_stone_wall", BLOOD_SAND_STONE);
    public static final WallBlock WHITE_CUT_SAND_STONE_WALL = noToolTipAid("white_cut_sand_stone_wall", WHITE_SAND_STONE);
    public static final WallBlock ORANGE_CUT_SAND_STONE_WALL = noToolTipAid("orange_cut_sand_stone_wall", ORANGE_SAND_STONE);
    public static final WallBlock MAGENTA_CUT_SAND_STONE_WALL = noToolTipAid("magenta_cut_sand_stone_wall", MAGENTA_SAND_STONE);
    public static final WallBlock LIGHT_BLUE_CUT_SAND_STONE_WALL = noToolTipAid("light_blue_cut_sand_stone_wall", LIGHT_BLUE_SAND_STONE);
    public static final WallBlock YELLOW_CUT_SAND_STONE_WALL = noToolTipAid("yellow_cut_sand_stone_wall", YELLOW_SAND_STONE);
    public static final WallBlock LIME_CUT_SAND_STONE_WALL = noToolTipAid("lime_cut_sand_stone_wall", LIME_SAND_STONE);
    public static final WallBlock PINK_CUT_SAND_STONE_WALL = noToolTipAid("pink_cut_sand_stone_wall", PINK_SAND_STONE);
    public static final WallBlock GRAY_CUT_SAND_STONE_WALL = noToolTipAid("gray_cut_sand_stone_wall", GRAY_SAND_STONE);
    public static final WallBlock LIGHT_GRAY_CUT_SAND_STONE_WALL = noToolTipAid("light_gray_cut_sand_stone_wall", LIGHT_GRAY_SAND_STONE);
    public static final WallBlock CYAN_CUT_SAND_STONE_WALL = noToolTipAid("cyan_cut_sand_stone_wall", CYAN_SAND_STONE);
    public static final WallBlock PURPLE_CUT_SAND_STONE_WALL = noToolTipAid("purple_cut_sand_stone_wall", PURPLE_SAND_STONE);
    public static final WallBlock BLUE_CUT_SAND_STONE_WALL = noToolTipAid("blue_cut_sand_stone_wall", BLUE_SAND_STONE);
    public static final WallBlock GREEN_CUT_SAND_STONE_WALL = noToolTipAid("green_cut_sand_stone_wall", GREEN_SAND_STONE);
    public static final WallBlock BROWN_CUT_SAND_STONE_WALL = noToolTipAid("brown_cut_sand_stone_wall", BROWN_SAND_STONE);
    public static final WallBlock BLACK_CUT_SAND_STONE_WALL = noToolTipAid("black_cut_sand_stone_wall", BLACK_SAND_STONE);

    private static WallBlock noToolTipAid(String name, Block block) { return cutSandStoneHelper(name, block, "", "", ""); }
    private static WallBlock cutSandStoneHelper(String name, Block block, String norm, String Shift, String Ctrl) { return (WallBlock) registerBlock(name, new cutSandStoneWall(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.STONE), norm, Shift, Ctrl)); }
    public static void registerCutSandStonewalls() { Delbase.LOGGER.info("Registering Cut SandStone walls for "+Delbase.Delbase_ID); }
}