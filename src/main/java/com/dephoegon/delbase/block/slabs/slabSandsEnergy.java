package com.dephoegon.delbase.block.slabs;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.slab.sandSlabEnergy;
import com.dephoegon.delbase.block.baseModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;

import static com.dephoegon.delbase.block.gravity.gravColorSands.*;
import static net.minecraft.block.Blocks.RED_SAND;
import static net.minecraft.block.Blocks.SAND;

public class slabSandsEnergy extends baseModBlocks {
    public static final SlabBlock SAND_SLAB_ENERGY = energySandSlabHelper("sand_slab_energy", SAND);
    public static final SlabBlock RED_SAND_SLAB_ENERGY = energySandSlabHelper("red_sand_slab_energy", RED_SAND);
    public static final SlabBlock BLOOD_SAND_SLAB_ENERGY = energySandSlabHelper("blood_sand_slab_energy", BLOOD_SAND);
    public static final SlabBlock WHITE_SAND_SLAB_ENERGY = energySandSlabHelper("white_sand_slab_energy", WHITE_SAND);
    public static final SlabBlock ORANGE_SAND_SLAB_ENERGY = energySandSlabHelper("orange_sand_slab_energy", ORANGE_SAND);
    public static final SlabBlock MAGENTA_SAND_SLAB_ENERGY = energySandSlabHelper("magenta_sand_slab_energy", MAGENTA_SAND);
    public static final SlabBlock LIGHT_BLUE_SAND_SLAB_ENERGY = energySandSlabHelper("light_blue_sand_slab_energy", LIGHT_BLUE_SAND);
    public static final SlabBlock YELLOW_SAND_SLAB_ENERGY = energySandSlabHelper("yellow_sand_slab_energy", YELLOW_SAND);
    public static final SlabBlock LIME_SAND_SLAB_ENERGY = energySandSlabHelper("lime_sand_slab_energy", LIME_SAND);
    public static final SlabBlock PINK_SAND_SLAB_ENERGY = energySandSlabHelper("pink_sand_slab_energy", PINK_SAND);
    public static final SlabBlock GRAY_SAND_SLAB_ENERGY = energySandSlabHelper("gray_sand_slab_energy", GRAY_SAND);
    public static final SlabBlock LIGHT_GRAY_SAND_SLAB_ENERGY = energySandSlabHelper("light_gray_sand_slab_energy", LIGHT_GRAY_SAND);
    public static final SlabBlock CYAN_SAND_SLAB_ENERGY = energySandSlabHelper("cyan_sand_slab_energy", CYAN_SAND);
    public static final SlabBlock PURPLE_SAND_SLAB_ENERGY = energySandSlabHelper("purple_sand_slab_energy", PURPLE_SAND);
    public static final SlabBlock BLUE_SAND_SLAB_ENERGY = energySandSlabHelper("blue_sand_slab_energy", BLUE_SAND);
    public static final SlabBlock GREEN_SAND_SLAB_ENERGY = energySandSlabHelper("green_sand_slab_energy", GREEN_SAND);
    public static final SlabBlock BROWN_SAND_SLAB_ENERGY = energySandSlabHelper("brown_sand_slab_energy", BROWN_SAND);
    public static final SlabBlock BLACK_SAND_SLAB_ENERGY = energySandSlabHelper("black_sand_slab_energy", BLACK_SAND);

    private static SlabBlock energySandSlabHelper(String name, Block block) { return (SlabBlock) registerBlock(name, new sandSlabEnergy(AbstractBlock.Settings.copy(block).sounds(BlockSoundGroup.SAND).luminance((blockstate) -> 5), "","","")); }
    public static void registerColoredSandSlabs() { Delbase.LOGGER.info("Registering Energy Colored Sand Slabs for "+Delbase.Delbase_ID); }
}
