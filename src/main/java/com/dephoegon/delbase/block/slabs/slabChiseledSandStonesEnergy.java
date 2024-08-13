package com.dephoegon.delbase.block.slabs;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.slab.chiseledSandStoneSlabEnergy;
import com.dephoegon.delbase.block.baseModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static net.minecraft.block.Blocks.RED_SANDSTONE;
import static net.minecraft.block.Blocks.SANDSTONE;

public class slabChiseledSandStonesEnergy extends baseModBlocks {
    public static final SlabBlock CHISELED_SAND_STONE_SLAB_ENERGY = noToolTipAid("chiseled_sand_stone_slab_energy", SANDSTONE);
    public static final SlabBlock RED_CHISELED_SAND_STONE_SLAB_ENERGY = noToolTipAid("red_chiseled_sand_stone_slab_energy", RED_SANDSTONE);
    public static final SlabBlock BLOOD_CHISELED_SAND_STONE_SLAB_ENERGY = noToolTipAid("blood_chiseled_sand_stone_slab_energy", BLOOD_SAND_STONE);
    public static final SlabBlock WHITE_CHISELED_SAND_STONE_SLAB_ENERGY = noToolTipAid("white_chiseled_sand_stone_slab_energy", WHITE_SAND_STONE);
    public static final SlabBlock ORANGE_CHISELED_SAND_STONE_SLAB_ENERGY = noToolTipAid("orange_chiseled_sand_stone_slab_energy", ORANGE_SAND_STONE);
    public static final SlabBlock MAGENTA_CHISELED_SAND_STONE_SLAB_ENERGY = noToolTipAid("magenta_chiseled_sand_stone_slab_energy", MAGENTA_SAND_STONE);
    public static final SlabBlock LIGHT_BLUE_CHISELED_SAND_STONE_SLAB_ENERGY = noToolTipAid("light_blue_chiseled_sand_stone_slab_energy", LIGHT_BLUE_SAND_STONE);
    public static final SlabBlock YELLOW_CHISELED_SAND_STONE_SLAB_ENERGY = noToolTipAid("yellow_chiseled_sand_stone_slab_energy", YELLOW_SAND_STONE);
    public static final SlabBlock LIME_CHISELED_SAND_STONE_SLAB_ENERGY = noToolTipAid("lime_chiseled_sand_stone_slab_energy", LIME_SAND_STONE);
    public static final SlabBlock PINK_CHISELED_SAND_STONE_SLAB_ENERGY = noToolTipAid("pink_chiseled_sand_stone_slab_energy", PINK_SAND_STONE);
    public static final SlabBlock GRAY_CHISELED_SAND_STONE_SLAB_ENERGY = noToolTipAid("gray_chiseled_sand_stone_slab_energy", GRAY_SAND_STONE);
    public static final SlabBlock LIGHT_GRAY_CHISELED_SAND_STONE_SLAB_ENERGY = noToolTipAid("light_gray_chiseled_sand_stone_slab_energy", LIGHT_GRAY_SAND_STONE);
    public static final SlabBlock CYAN_CHISELED_SAND_STONE_SLAB_ENERGY = noToolTipAid("cyan_chiseled_sand_stone_slab_energy", CYAN_SAND_STONE);
    public static final SlabBlock PURPLE_CHISELED_SAND_STONE_SLAB_ENERGY = noToolTipAid("purple_chiseled_sand_stone_slab_energy", PURPLE_SAND_STONE);
    public static final SlabBlock BLUE_CHISELED_SAND_STONE_SLAB_ENERGY = noToolTipAid("blue_chiseled_sand_stone_slab_energy", BLUE_SAND_STONE);
    public static final SlabBlock GREEN_CHISELED_SAND_STONE_SLAB_ENERGY = noToolTipAid("green_chiseled_sand_stone_slab_energy", GREEN_SAND_STONE);
    public static final SlabBlock BROWN_CHISELED_SAND_STONE_SLAB_ENERGY = noToolTipAid("brown_chiseled_sand_stone_slab_energy", BROWN_SAND_STONE);
    public static final SlabBlock BLACK_CHISELED_SAND_STONE_SLAB_ENERGY = noToolTipAid("black_chiseled_sand_stone_slab_energy", BLACK_SAND_STONE);

    private static SlabBlock noToolTipAid(String name, Block block) { return chiseledSandStoneHelper(name, block, "", "", ""); }
    private static SlabBlock chiseledSandStoneHelper(String name, Block block, String norm, String Shift, String Ctrl) { return (SlabBlock) registerBlock(name, new chiseledSandStoneSlabEnergy(AbstractBlock.Settings.copy(block).sounds(BlockSoundGroup.STONE), norm, Shift, Ctrl)); }
    public static void registerCutSandStoneSlabEnergy() { Delbase.LOGGER.info("Registering Chiseled SandStone Energetic Slab for "+Delbase.Delbase_ID); }
}