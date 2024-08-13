package com.dephoegon.delbase.block.slabs;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.slab.cutSandStoneSlab;
import com.dephoegon.delbase.block.baseModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;

import static com.dephoegon.delbase.block.general.genSandStones.*;

public class slabCutSandStones extends baseModBlocks {
    public static final SlabBlock BLOOD_CUT_SAND_STONE_SLAB = noToolTipAid("blood_cut_sand_stone_slab", BLOOD_SAND_STONE);
    public static final SlabBlock WHITE_CUT_SAND_STONE_SLAB = noToolTipAid("white_cut_sand_stone_slab", WHITE_SAND_STONE);
    public static final SlabBlock ORANGE_CUT_SAND_STONE_SLAB = noToolTipAid("orange_cut_sand_stone_slab", ORANGE_SAND_STONE);
    public static final SlabBlock MAGENTA_CUT_SAND_STONE_SLAB = noToolTipAid("magenta_cut_sand_stone_slab", MAGENTA_SAND_STONE);
    public static final SlabBlock LIGHT_BLUE_CUT_SAND_STONE_SLAB = noToolTipAid("light_blue_cut_sand_stone_slab", LIGHT_BLUE_SAND_STONE);
    public static final SlabBlock YELLOW_CUT_SAND_STONE_SLAB = noToolTipAid("yellow_cut_sand_stone_slab", YELLOW_SAND_STONE);
    public static final SlabBlock LIME_CUT_SAND_STONE_SLAB = noToolTipAid("lime_cut_sand_stone_slab", LIME_SAND_STONE);
    public static final SlabBlock PINK_CUT_SAND_STONE_SLAB = noToolTipAid("pink_cut_sand_stone_slab", PINK_SAND_STONE);
    public static final SlabBlock GRAY_CUT_SAND_STONE_SLAB = noToolTipAid("gray_cut_sand_stone_slab", GRAY_SAND_STONE);
    public static final SlabBlock LIGHT_GRAY_CUT_SAND_STONE_SLAB = noToolTipAid("light_gray_cut_sand_stone_slab", LIGHT_GRAY_SAND_STONE);
    public static final SlabBlock CYAN_CUT_SAND_STONE_SLAB = noToolTipAid("cyan_cut_sand_stone_slab", CYAN_SAND_STONE);
    public static final SlabBlock PURPLE_CUT_SAND_STONE_SLAB = noToolTipAid("purple_cut_sand_stone_slab", PURPLE_SAND_STONE);
    public static final SlabBlock BLUE_CUT_SAND_STONE_SLAB = noToolTipAid("blue_cut_sand_stone_slab", BLUE_SAND_STONE);
    public static final SlabBlock GREEN_CUT_SAND_STONE_SLAB = noToolTipAid("green_cut_sand_stone_slab", GREEN_SAND_STONE);
    public static final SlabBlock BROWN_CUT_SAND_STONE_SLAB = noToolTipAid("brown_cut_sand_stone_slab", BROWN_SAND_STONE);
    public static final SlabBlock BLACK_CUT_SAND_STONE_SLAB = noToolTipAid("black_cut_sand_stone_slab", BLACK_SAND_STONE);

    private static SlabBlock noToolTipAid(String name, Block block) { return cutSandStoneHelper(name, block, "", "", ""); }
    private static SlabBlock cutSandStoneHelper(String name, Block block, String norm, String Shift, String Ctrl) { return (SlabBlock) registerBlock(name, new cutSandStoneSlab(AbstractBlock.Settings.copy(block).sounds(BlockSoundGroup.STONE), norm, Shift, Ctrl)); }
    public static void registerCutSandStoneSlabs() { Delbase.LOGGER.info("Registering Cut SandStone Slabs for "+Delbase.Delbase_ID); }
}