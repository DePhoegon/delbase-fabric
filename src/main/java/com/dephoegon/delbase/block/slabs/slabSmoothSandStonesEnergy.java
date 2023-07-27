package com.dephoegon.delbase.block.slabs;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.slab.cutSandStoneSlab;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.block.general.genSandStones.BLACK_SAND_STONE;

public class slabSmoothSandStonesEnergy extends baseModBlocks {
    public static final SlabBlock BLOOD_SMOOTH_SAND_STONE_SLAB_ENERGY = noToolTipAid("blood_smooth_sand_stone_slab_energy", BLOOD_SAND_STONE);
    public static final SlabBlock WHITE_SMOOTH_SAND_STONE_SLAB_ENERGY = noToolTipAid("white_smooth_sand_stone_slab_energy", WHITE_SAND_STONE);
    public static final SlabBlock ORANGE_SMOOTH_SAND_STONE_SLAB_ENERGY = noToolTipAid("orange_smooth_sand_stone_slab_energy", ORANGE_SAND_STONE);
    public static final SlabBlock MAGENTA_SMOOTH_SAND_STONE_SLAB_ENERGY = noToolTipAid("magenta_smooth_sand_stone_slab_energy", MAGENTA_SAND_STONE);
    public static final SlabBlock LIGHT_BLUE_SMOOTH_SAND_STONE_SLAB_ENERGY = noToolTipAid("light_blue_smooth_sand_stone_slab_energy", LIGHT_BLUE_SAND_STONE);
    public static final SlabBlock YELLOW_SMOOTH_SAND_STONE_SLAB_ENERGY = noToolTipAid("yellow_smooth_sand_stone_slab_energy", YELLOW_SAND_STONE);
    public static final SlabBlock LIME_SMOOTH_SAND_STONE_SLAB_ENERGY = noToolTipAid("lime_smooth_sand_stone_slab_energy", LIME_SAND_STONE);
    public static final SlabBlock PINK_SMOOTH_SAND_STONE_SLAB_ENERGY = noToolTipAid("pink_smooth_sand_stone_slab_energy", PINK_SAND_STONE);
    public static final SlabBlock GRAY_SMOOTH_SAND_STONE_SLAB_ENERGY = noToolTipAid("gray_smooth_sand_stone_slab_energy", GREEN_SAND_STONE);
    public static final SlabBlock LIGHT_GRAY_SMOOTH_SAND_STONE_SLAB_ENERGY = noToolTipAid("light_gray_smooth_sand_stone_slab_energy", LIGHT_GRAY_SAND_STONE);
    public static final SlabBlock CYAN_SMOOTH_SAND_STONE_SLAB_ENERGY = noToolTipAid("cyan_smooth_sand_stone_slab_energy", CYAN_SAND_STONE);
    public static final SlabBlock PURPLE_SMOOTH_SAND_STONE_SLAB_ENERGY = noToolTipAid("purple_smooth_sand_stone_slab_energy", PURPLE_SAND_STONE);
    public static final SlabBlock BLUE_SMOOTH_SAND_STONE_SLAB_ENERGY = noToolTipAid("blue_smooth_sand_stone_slab_energy", BLUE_SAND_STONE);
    public static final SlabBlock GREEN_SMOOTH_SAND_STONE_SLAB_ENERGY = noToolTipAid("green_smooth_sand_stone_slab_energy", GREEN_SAND_STONE);
    public static final SlabBlock BROWN_SMOOTH_SAND_STONE_SLAB_ENERGY = noToolTipAid("brown_smooth_sand_stone_slab_energy", BROWN_SAND_STONE);
    public static final SlabBlock BLACK_SMOOTH_SAND_STONE_SLAB_ENERGY = noToolTipAid("black_smooth_sand_stone_slab_energy", BLACK_SAND_STONE);

    private static SlabBlock noToolTipAid(String name, Block block) { return cutSandStoneHelper(name, block, "", "", ""); }
    private static SlabBlock cutSandStoneHelper(String name, Block block, String norm, String Shift, String Ctrl) { return (SlabBlock) registerBlock(name, new cutSandStoneSlab(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.STONE), norm, Shift, Ctrl)); }
    public static void registerCutSandStoneSlabs() { Delbase.LOGGER.info("Registering Energy Smooth SandStone Slabs for "+Delbase.Delbase_ID); }
}