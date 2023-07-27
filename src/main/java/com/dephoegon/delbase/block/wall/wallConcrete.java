package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.wall.concreteWall;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.WallBlock;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.*;

public class wallConcrete extends baseModBlocks {
    public static final WallBlock RED_CONCRETE_WALL = noToolTipAid("red_concrete_wall", RED_CONCRETE);
    public static final WallBlock WHITE_CONCRETE_WALL = noToolTipAid("white_concrete_wall", WHITE_CONCRETE);
    public static final WallBlock ORANGE_CONCRETE_WALL = noToolTipAid("orange_concrete_wall", ORANGE_CONCRETE);
    public static final WallBlock MAGENTA_CONCRETE_WALL = noToolTipAid("magenta_concrete_wall", MAGENTA_CONCRETE);
    public static final WallBlock LIGHT_BLUE_CONCRETE_WALL = noToolTipAid("light_blue_concrete_wall", LIGHT_BLUE_CONCRETE);
    public static final WallBlock YELLOW_CONCRETE_WALL = noToolTipAid("yellow_concrete_wall", YELLOW_CONCRETE);
    public static final WallBlock LIME_CONCRETE_WALL = noToolTipAid("lime_concrete_wall", LIME_CONCRETE);
    public static final WallBlock PINK_CONCRETE_WALL = noToolTipAid("pink_concrete_wall", PINK_CONCRETE);
    public static final WallBlock GRAY_CONCRETE_WALL = noToolTipAid("gray_concrete_wall", GRAY_CONCRETE);
    public static final WallBlock LIGHT_GRAY_CONCRETE_WALL = noToolTipAid("light_gray_concrete_wall", LIGHT_GRAY_CONCRETE);
    public static final WallBlock CYAN_CONCRETE_WALL = noToolTipAid("cyan_concrete_wall", CYAN_CONCRETE);
    public static final WallBlock PURPLE_CONCRETE_WALL = noToolTipAid("purple_concrete_wall", PURPLE_CONCRETE);
    public static final WallBlock BLUE_CONCRETE_WALL = noToolTipAid("blue_concrete_wall", BLUE_CONCRETE);
    public static final WallBlock GREEN_CONCRETE_WALL = noToolTipAid("green_concrete_wall", GREEN_CONCRETE);
    public static final WallBlock BROWN_CONCRETE_WALL = noToolTipAid("brown_concrete_wall", BROWN_CONCRETE);
    public static final WallBlock BLACK_CONCRETE_WALL = noToolTipAid("black_concrete_wall", BLACK_CONCRETE);

    private static WallBlock noToolTipAid(String name, Block block) { return chiseledSandStoneHelper(name, block, "", "", ""); }
    private static WallBlock chiseledSandStoneHelper(String name, Block block, String norm, String Shift, String Ctrl) { return (WallBlock) registerBlock(name, new concreteWall(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.STONE), norm, Shift, Ctrl)); }
    public static void registerConcreteWall() { Delbase.LOGGER.info("Registering Concrete Walls for "+Delbase.Delbase_ID); }
}