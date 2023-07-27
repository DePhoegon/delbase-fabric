package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.wall.smoothSandStoneWall;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.WallBlock;
import net.minecraft.sound.BlockSoundGroup;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static net.minecraft.block.Blocks.RED_SANDSTONE;
import static net.minecraft.block.Blocks.SANDSTONE;

public class wallSmoothSandStones extends baseModBlocks {
    public static final WallBlock SMOOTH_SAND_STONE_WALL = noToolTipAid("smooth_sand_stone_wall", SANDSTONE);
    public static final WallBlock RED_SMOOTH_SAND_STONE_WALL = noToolTipAid("red_smooth_sand_stone_wall", RED_SANDSTONE);
    public static final WallBlock BLOOD_SMOOTH_SAND_STONE_WALL = noToolTipAid("blood_smooth_sand_stone_wall", BLOOD_SAND_STONE);
    public static final WallBlock WHITE_SMOOTH_SAND_STONE_WALL = noToolTipAid("white_smooth_sand_stone_wall", WHITE_SAND_STONE);
    public static final WallBlock ORANGE_SMOOTH_SAND_STONE_WALL = noToolTipAid("orange_smooth_sand_stone_wall", ORANGE_SAND_STONE);
    public static final WallBlock MAGENTA_SMOOTH_SAND_STONE_WALL = noToolTipAid("magenta_smooth_sand_stone_wall", MAGENTA_SAND_STONE);
    public static final WallBlock LIGHT_BLUE_SMOOTH_SAND_STONE_WALL = noToolTipAid("light_blue_smooth_sand_stone_wall", LIGHT_BLUE_SAND_STONE);
    public static final WallBlock YELLOW_SMOOTH_SAND_STONE_WALL = noToolTipAid("yellow_smooth_sand_stone_wall", YELLOW_SAND_STONE);
    public static final WallBlock LIME_SMOOTH_SAND_STONE_WALL = noToolTipAid("lime_smooth_sand_stone_wall", LIME_SAND_STONE);
    public static final WallBlock PINK_SMOOTH_SAND_STONE_WALL = noToolTipAid("pink_smooth_sand_stone_wall", PINK_SAND_STONE);
    public static final WallBlock GRAY_SMOOTH_SAND_STONE_WALL = noToolTipAid("gray_smooth_sand_stone_wall", GREEN_SAND_STONE);
    public static final WallBlock LIGHT_GRAY_SMOOTH_SAND_STONE_WALL = noToolTipAid("light_gray_smooth_sand_stone_wall", LIGHT_GRAY_SAND_STONE);
    public static final WallBlock CYAN_SMOOTH_SAND_STONE_WALL = noToolTipAid("cyan_smooth_sand_stone_wall", CYAN_SAND_STONE);
    public static final WallBlock PURPLE_SMOOTH_SAND_STONE_WALL = noToolTipAid("purple_smooth_sand_stone_wall", PURPLE_SAND_STONE);
    public static final WallBlock BLUE_SMOOTH_SAND_STONE_WALL = noToolTipAid("blue_smooth_sand_stone_wall", BLUE_SAND_STONE);
    public static final WallBlock GREEN_SMOOTH_SAND_STONE_WALL = noToolTipAid("green_smooth_sand_stone_wall", GREEN_SAND_STONE);
    public static final WallBlock BROWN_SMOOTH_SAND_STONE_WALL = noToolTipAid("brown_smooth_sand_stone_wall", BROWN_SAND_STONE);
    public static final WallBlock BLACK_SMOOTH_SAND_STONE_WALL = noToolTipAid("black_smooth_sand_stone_wall", BLACK_SAND_STONE);

    private static WallBlock noToolTipAid(String name, Block block) { return smoothSandStoneHelper(name, block, "", "", ""); }
    private static WallBlock smoothSandStoneHelper(String name, Block block, String norm, String Shift, String Ctrl) { return (WallBlock) registerBlock(name, new smoothSandStoneWall(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.STONE), norm, Shift, Ctrl)); }
    public static void registerSmoothSandStonewalls() { Delbase.LOGGER.info("Registering Smooth SandStone walls for "+Delbase.Delbase_ID); }
}