package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.wall.chiseledSandStoneWall;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.WallBlock;
import net.minecraft.sound.BlockSoundGroup;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static net.minecraft.block.Blocks.RED_SANDSTONE;
import static net.minecraft.block.Blocks.SANDSTONE;

public class wallChiseledSandStones extends baseModBlocks {
    public static final WallBlock CHISELED_SAND_STONE_WALL = noToolTipAid("blood_chiseled_sand_stone_wall", SANDSTONE);
    public static final WallBlock RED_CHISELED_SAND_STONE_WALL = noToolTipAid("red_chiseled_sand_stone_wall", RED_SANDSTONE);
    public static final WallBlock BLOOD_CHISELED_SAND_STONE_WALL = noToolTipAid("blood_chiseled_sand_stone_wall", BLOOD_SAND_STONE);
    public static final WallBlock WHITE_CHISELED_SAND_STONE_WALL = noToolTipAid("white_chiseled_sand_stone_wall", WHITE_SAND_STONE);
    public static final WallBlock ORANGE_CHISELED_SAND_STONE_WALL = noToolTipAid("orange_chiseled_sand_stone_wall", ORANGE_SAND_STONE);
    public static final WallBlock MAGENTA_CHISELED_SAND_STONE_WALL = noToolTipAid("magenta_chiseled_sand_stone_wall", MAGENTA_SAND_STONE);
    public static final WallBlock LIGHT_BLUE_CHISELED_SAND_STONE_WALL = noToolTipAid("light_blue_chiseled_sand_stone_wall", LIGHT_BLUE_SAND_STONE);
    public static final WallBlock YELLOW_CHISELED_SAND_STONE_WALL = noToolTipAid("yellow_chiseled_sand_stone_wall", YELLOW_SAND_STONE);
    public static final WallBlock LIME_CHISELED_SAND_STONE_WALL = noToolTipAid("lime_chiseled_sand_stone_wall", LIME_SAND_STONE);
    public static final WallBlock PINK_CHISELED_SAND_STONE_WALL = noToolTipAid("pink_chiseled_sand_stone_wall", PINK_SAND_STONE);
    public static final WallBlock GRAY_CHISELED_SAND_STONE_WALL = noToolTipAid("gray_chiseled_sand_stone_wall", GREEN_SAND_STONE);
    public static final WallBlock LIGHT_GRAY_CHISELED_SAND_STONE_WALL = noToolTipAid("light_gray_chiseled_sand_stone_wall", LIGHT_GRAY_SAND_STONE);
    public static final WallBlock CYAN_CHISELED_SAND_STONE_WALL = noToolTipAid("cyan_chiseled_sand_stone_wall", CYAN_SAND_STONE);
    public static final WallBlock PURPLE_CHISELED_SAND_STONE_WALL = noToolTipAid("purple_chiseled_sand_stone_wall", PURPLE_SAND_STONE);
    public static final WallBlock BLUE_CHISELED_SAND_STONE_WALL = noToolTipAid("blue_chiseled_sand_stone_wall", BLUE_SAND_STONE);
    public static final WallBlock GREEN_CHISELED_SAND_STONE_WALL = noToolTipAid("green_chiseled_sand_stone_wall", GREEN_SAND_STONE);
    public static final WallBlock BROWN_CHISELED_SAND_STONE_WALL = noToolTipAid("brown_chiseled_sand_stone_wall", BROWN_SAND_STONE);
    public static final WallBlock BLACK_CHISELED_SAND_STONE_WALL = noToolTipAid("black_chiseled_sand_stone_wall", BLACK_SAND_STONE);

    private static WallBlock noToolTipAid(String name, Block block) { return chiseledSandStoneHelper(name, block, "", "", ""); }
    private static WallBlock chiseledSandStoneHelper(String name, Block block, String norm, String Shift, String Ctrl) { return (WallBlock) registerBlock(name, new chiseledSandStoneWall(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.STONE), norm, Shift, Ctrl)); }
    public static void registerChiseledSandStonewalls() { Delbase.LOGGER.info("Registering Chiseled SandStone walls for "+Delbase.Delbase_ID); }
}