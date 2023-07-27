package com.dephoegon.delbase.block.slabs;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.slab.sandSlab;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;

import static com.dephoegon.delbase.block.gravity.gravColorSands.*;
import static net.minecraft.block.Blocks.RED_SAND;
import static net.minecraft.block.Blocks.SAND;

public class slabSands extends baseModBlocks {
    public static final SlabBlock SAND_SLAB = colorSolidSandHelper("sand_slab", SAND);
    public static final SlabBlock RED_SAND_SLAB = colorSolidSandHelper("red_sand_slab", RED_SAND);
    public static final SlabBlock BLOOD_SAND_SLAB = colorSolidSandHelper("blood_sand_slab", BLOOD_SAND);
    public static final SlabBlock WHITE_SAND_SLAB = colorSolidSandHelper("white_sand_slab", WHITE_SAND);
    public static final SlabBlock ORANGE_SAND_SLAB = colorSolidSandHelper("orange_sand_slab", ORANGE_SAND);
    public static final SlabBlock MAGENTA_SAND_SLAB = colorSolidSandHelper("magenta_sand_slab", MAGENTA_SAND);
    public static final SlabBlock LIGHT_BLUE_SAND_SLAB = colorSolidSandHelper("light_blue_sand_slab", LIGHT_BLUE_SAND);
    public static final SlabBlock LIGHT_GRAY_SAND_SLAB = colorSolidSandHelper("light_gray_sand_slab", LIGHT_GRAY_SAND);
    public static final SlabBlock YELLOW_SAND_SLAB = colorSolidSandHelper("yellow_sand_slab", YELLOW_SAND);
    public static final SlabBlock LIME_SAND_SLAB = colorSolidSandHelper("lime_sand_slab", LIME_SAND);
    public static final SlabBlock PINK_SAND_SLAB = colorSolidSandHelper("pink_sand_slab", PINK_SAND);
    public static final SlabBlock GRAY_SAND_SLAB = colorSolidSandHelper("gray_sand_slab", GRAY_SAND);
    public static final SlabBlock PURPLE_SAND_SLAB = colorSolidSandHelper("purple_sand_slab", PURPLE_SAND);
    public static final SlabBlock CYAN_SAND_SLAB = colorSolidSandHelper("cyan_sand_slab", CYAN_SAND);
    public static final SlabBlock BLUE_SAND_SLAB = colorSolidSandHelper("blue_sand_slab", BLUE_SAND);
    public static final SlabBlock GREEN_SAND_SLAB = colorSolidSandHelper("green_sand_slab", GREEN_SAND);
    public static final SlabBlock BROWN_SAND_SLAB = colorSolidSandHelper("brown_sand_slab", BROWN_SAND);
    public static final SlabBlock BLACK_SAND_SLAB = colorSolidSandHelper("black_sand_slab", BLACK_SAND);

    private static SlabBlock colorSolidSandHelper(String name, Block block) {
        return (SlabBlock) registerBlock(name, new sandSlab(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.SAND), "", "", ""));
    }
    public static void registerColoredSands() { Delbase.LOGGER.info("Registering Colored Sands for "+Delbase.Delbase_ID); }
}