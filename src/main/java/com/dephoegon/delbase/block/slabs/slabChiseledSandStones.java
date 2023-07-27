package com.dephoegon.delbase.block.slabs;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.slab.chiseledSandStoneSlab;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;

import static com.dephoegon.delbase.block.general.genSandStones.*;

public class slabChiseledSandStones extends baseModBlocks {
    public static final SlabBlock BLOOD_CHISELED_SAND_STONE_SLAB = noToolTipAid("blood_chiseled_sand_stone_slab", BLOOD_SAND_STONE);
    public static final SlabBlock WHITE_CHISELED_SAND_STONE_SLAB = noToolTipAid("white_chiseled_sand_stone_slab", WHITE_SAND_STONE);
    public static final SlabBlock ORANGE_CHISELED_SAND_STONE_SLAB = noToolTipAid("orange_chiseled_sand_stone_slab", ORANGE_SAND_STONE);
    public static final SlabBlock MAGENTA_CHISELED_SAND_STONE_SLAB = noToolTipAid("magenta_chiseled_sand_stone_slab", MAGENTA_SAND_STONE);
    public static final SlabBlock LIGHT_BLUE_CHISELED_SAND_STONE_SLAB = noToolTipAid("light_blue_chiseled_sand_stone_slab", LIGHT_BLUE_SAND_STONE);
    public static final SlabBlock YELLOW_CHISELED_SAND_STONE_SLAB = noToolTipAid("yellow_chiseled_sand_stone_slab", YELLOW_SAND_STONE);
    public static final SlabBlock LIME_CHISELED_SAND_STONE_SLAB = noToolTipAid("lime_chiseled_sand_stone_slab", LIME_SAND_STONE);
    public static final SlabBlock PINK_CHISELED_SAND_STONE_SLAB = noToolTipAid("pink_chiseled_sand_stone_slab", PINK_SAND_STONE);
    public static final SlabBlock GRAY_CHISELED_SAND_STONE_SLAB = noToolTipAid("gray_chiseled_sand_stone_slab", GREEN_SAND_STONE);
    public static final SlabBlock LIGHT_GRAY_CHISELED_SAND_STONE_SLAB = noToolTipAid("light_gray_chiseled_sand_stone_slab", LIGHT_GRAY_SAND_STONE);
    public static final SlabBlock CYAN_CHISELED_SAND_STONE_SLAB = noToolTipAid("cyan_chiseled_sand_stone_slab", CYAN_SAND_STONE);
    public static final SlabBlock PURPLE_CHISELED_SAND_STONE_SLAB = noToolTipAid("purple_chiseled_sand_stone_slab", PURPLE_SAND_STONE);
    public static final SlabBlock BLUE_CHISELED_SAND_STONE_SLAB = noToolTipAid("blue_chiseled_sand_stone_slab", BLUE_SAND_STONE);
    public static final SlabBlock GREEN_CHISELED_SAND_STONE_SLAB = noToolTipAid("green_chiseled_sand_stone_slab", GREEN_SAND_STONE);
    public static final SlabBlock BROWN_CHISELED_SAND_STONE_SLAB = noToolTipAid("brown_chiseled_sand_stone_slab", BROWN_SAND_STONE);
    public static final SlabBlock BLACK_CHISELED_SAND_STONE_SLAB = noToolTipAid("black_chiseled_sand_stone_slab", BLACK_SAND_STONE);

    private static SlabBlock noToolTipAid(String name, Block block) { return chiseledSandStoneHelper(name, block, "", "", ""); }
    private static SlabBlock chiseledSandStoneHelper(String name, Block block, String norm, String Shift, String Ctrl) { return (SlabBlock) registerBlock(name, new chiseledSandStoneSlab(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.STONE), norm, Shift, Ctrl)); }
    public static void registerCutSandStoneSlabs() { Delbase.LOGGER.info("Registering Chiseled SandStone Slabs for "+Delbase.Delbase_ID); }
}