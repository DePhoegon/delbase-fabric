package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.wall.sandWall;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.SandBlock;
import net.minecraft.sound.BlockSoundGroup;

import static com.dephoegon.delbase.block.gravity.gravColorSands.*;
import static net.minecraft.block.Blocks.RED_SAND;
import static net.minecraft.block.Blocks.SAND;

public class wallSands extends baseModBlocks {
    public static final SandBlock SAND_WALL = colorSolidSandHelper("sand_wall", SAND);
    public static final SandBlock RED_SAND_WALL = colorSolidSandHelper("red_sand_wall", RED_SAND);
    public static final SandBlock BLOOD_SAND_WALL = colorSolidSandHelper("blood_sand_wall", BLOOD_SAND);
    public static final SandBlock WHITE_SAND_WALL = colorSolidSandHelper("white_sand_wall", WHITE_SAND);
    public static final SandBlock ORANGE_SAND_WALL = colorSolidSandHelper("orange_sand_wall", ORANGE_SAND);
    public static final SandBlock MAGENTA_SAND_WALL = colorSolidSandHelper("magenta_sand_wall", MAGENTA_SAND);
    public static final SandBlock LIGHT_BLUE_SAND_WALL = colorSolidSandHelper("light_blue_sand_wall", LIGHT_BLUE_SAND);
    public static final SandBlock LIGHT_GRAY_SAND_WALL = colorSolidSandHelper("light_gray_sand_wall", LIGHT_GRAY_SAND);
    public static final SandBlock YELLOW_SAND_WALL = colorSolidSandHelper("yellow_sand_wall", YELLOW_SAND);
    public static final SandBlock LIME_SAND_WALL = colorSolidSandHelper("lime_sand_wall", LIME_SAND);
    public static final SandBlock PINK_SAND_WALL = colorSolidSandHelper("pink_sand_wall", PINK_SAND);
    public static final SandBlock GRAY_SAND_WALL = colorSolidSandHelper("gray_sand_wall", GRAY_SAND);
    public static final SandBlock PURPLE_SAND_WALL = colorSolidSandHelper("purple_sand_wall", PURPLE_SAND);
    public static final SandBlock CYAN_SAND_WALL = colorSolidSandHelper("cyan_sand_wall", CYAN_SAND);
    public static final SandBlock BLUE_SAND_WALL = colorSolidSandHelper("blue_sand_wall", BLUE_SAND);
    public static final SandBlock GREEN_SAND_WALL = colorSolidSandHelper("green_sand_wall", GREEN_SAND);
    public static final SandBlock BROWN_SAND_WALL = colorSolidSandHelper("brown_sand_wall", BROWN_SAND);
    public static final SandBlock BLACK_SAND_WALL = colorSolidSandHelper("black_sand_wall", BLACK_SAND);

    private static SandBlock colorSolidSandHelper(String name, Block block) {
        return (SandBlock) registerBlock(name, new sandWall(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.SAND), "", "", ""));
    }
    public static void registerColoredSands() { Delbase.LOGGER.info("Registering Colored Sand Walls for "+Delbase.Delbase_ID); }
}