package com.dephoegon.delbase.block.slabs;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.slab.cutSandStoneSlabEnergy;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static net.minecraft.block.Blocks.RED_SANDSTONE;
import static net.minecraft.block.Blocks.SANDSTONE;

public class slabCutSandStonesEnergy extends baseModBlocks {
    public static final SlabBlock CUT_SAND_STONE_SLAB_ENERGY = noToolTipAid("cut_sand_stone_slab_energy", SANDSTONE);
    public static final SlabBlock RED_CUT_SAND_STONE_SLAB_ENERGY = noToolTipAid("red_cut_sand_stone_slab_energy", RED_SANDSTONE);
    public static final SlabBlock BLOOD_CUT_SAND_STONE_SLAB_ENERGY = noToolTipAid("blood_cut_sand_stone_slab_energy", BLOOD_SAND_STONE);
    public static final SlabBlock WHITE_CUT_SAND_STONE_SLAB_ENERGY = noToolTipAid("white_cut_sand_stone_slab_energy", WHITE_SAND_STONE);
    public static final SlabBlock ORANGE_CUT_SAND_STONE_SLAB_ENERGY = noToolTipAid("orange_cut_sand_stone_slab_energy", ORANGE_SAND_STONE);
    public static final SlabBlock MAGENTA_CUT_SAND_STONE_SLAB_ENERGY = noToolTipAid("magenta_cut_sand_stone_slab_energy", MAGENTA_SAND_STONE);
    public static final SlabBlock LIGHT_BLUE_CUT_SAND_STONE_SLAB_ENERGY = noToolTipAid("light_blue_cut_sand_stone_slab_energy", LIGHT_BLUE_SAND_STONE);
    public static final SlabBlock YELLOW_CUT_SAND_STONE_SLAB_ENERGY = noToolTipAid("yellow_cut_sand_stone_slab_energy", YELLOW_SAND_STONE);
    public static final SlabBlock LIME_CUT_SAND_STONE_SLAB_ENERGY = noToolTipAid("lime_cut_sand_stone_slab_energy", LIME_SAND_STONE);
    public static final SlabBlock PINK_CUT_SAND_STONE_SLAB_ENERGY = noToolTipAid("pink_cut_sand_stone_slab_energy", PINK_SAND_STONE);
    public static final SlabBlock GRAY_CUT_SAND_STONE_SLAB_ENERGY = noToolTipAid("gray_cut_sand_stone_slab_energy", GREEN_SAND_STONE);
    public static final SlabBlock LIGHT_GRAY_CUT_SAND_STONE_SLAB_ENERGY = noToolTipAid("light_gray_cut_sand_stone_slab_energy", LIGHT_GRAY_SAND_STONE);
    public static final SlabBlock CYAN_CUT_SAND_STONE_SLAB_ENERGY = noToolTipAid("cyan_cut_sand_stone_slab_energy", CYAN_SAND_STONE);
    public static final SlabBlock PURPLE_CUT_SAND_STONE_SLAB_ENERGY = noToolTipAid("purple_cut_sand_stone_slab_energy", PURPLE_SAND_STONE);
    public static final SlabBlock BLUE_CUT_SAND_STONE_SLAB_ENERGY = noToolTipAid("blue_cut_sand_stone_slab_energy", BLUE_SAND_STONE);
    public static final SlabBlock GREEN_CUT_SAND_STONE_SLAB_ENERGY = noToolTipAid("green_cut_sand_stone_slab_energy", GREEN_SAND_STONE);
    public static final SlabBlock BROWN_CUT_SAND_STONE_SLAB_ENERGY = noToolTipAid("brown_cut_sand_stone_slab_energy", BROWN_SAND_STONE);
    public static final SlabBlock BLACK_CUT_SAND_STONE_SLAB_ENERGY = noToolTipAid("black_cut_sand_stone_slab_energy", BLACK_SAND_STONE);

    private static SlabBlock noToolTipAid(String name, Block block) { return cutSandStoneHelper(name, block, "", "", ""); }
    private static SlabBlock cutSandStoneHelper(String name, Block block, String norm, String Shift, String Ctrl) { return (SlabBlock) registerBlock(name, new cutSandStoneSlabEnergy(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.STONE), norm, Shift, Ctrl)); }
    public static void registerCutSandStoneSlabEnergy() { Delbase.LOGGER.info("Registering Cut SandStone Energetic Slab for "+Delbase.Delbase_ID); }
}