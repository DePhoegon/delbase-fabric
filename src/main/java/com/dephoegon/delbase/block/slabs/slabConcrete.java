package com.dephoegon.delbase.block.slabs;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.slab.concreteSlab;
import com.dephoegon.delbase.block.baseModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.*;

public class slabConcrete extends baseModBlocks {
    public static final SlabBlock RED_CONCRETE_SLAB = noToolTipAid("red_concrete_slab", RED_CONCRETE);
    public static final SlabBlock WHITE_CONCRETE_SLAB = noToolTipAid("white_concrete_slab", WHITE_CONCRETE);
    public static final SlabBlock ORANGE_CONCRETE_SLAB = noToolTipAid("orange_concrete_slab", ORANGE_CONCRETE);
    public static final SlabBlock MAGENTA_CONCRETE_SLAB = noToolTipAid("magenta_concrete_slab", MAGENTA_CONCRETE);
    public static final SlabBlock LIGHT_BLUE_CONCRETE_SLAB = noToolTipAid("light_blue_concrete_slab", LIGHT_BLUE_CONCRETE);
    public static final SlabBlock YELLOW_CONCRETE_SLAB = noToolTipAid("yellow_concrete_slab", YELLOW_CONCRETE);
    public static final SlabBlock LIME_CONCRETE_SLAB = noToolTipAid("lime_concrete_slab", LIME_CONCRETE);
    public static final SlabBlock PINK_CONCRETE_SLAB = noToolTipAid("pink_concrete_slab", PINK_CONCRETE);
    public static final SlabBlock GRAY_CONCRETE_SLAB = noToolTipAid("gray_concrete_slab", GRAY_CONCRETE);
    public static final SlabBlock LIGHT_GRAY_CONCRETE_SLAB = noToolTipAid("light_gray_concrete_slab", LIGHT_GRAY_CONCRETE);
    public static final SlabBlock CYAN_CONCRETE_SLAB = noToolTipAid("cyan_concrete_slab", CYAN_CONCRETE);
    public static final SlabBlock PURPLE_CONCRETE_SLAB = noToolTipAid("purple_concrete_slab", PURPLE_CONCRETE);
    public static final SlabBlock BLUE_CONCRETE_SLAB = noToolTipAid("blue_concrete_slab", BLUE_CONCRETE);
    public static final SlabBlock GREEN_CONCRETE_SLAB = noToolTipAid("green_concrete_slab", GREEN_CONCRETE);
    public static final SlabBlock BROWN_CONCRETE_SLAB = noToolTipAid("brown_concrete_slab", BROWN_CONCRETE);
    public static final SlabBlock BLACK_CONCRETE_SLAB = noToolTipAid("black_concrete_slab", BLACK_CONCRETE);

    private static SlabBlock noToolTipAid(String name, Block block) { return chiseledSandStoneHelper(name, block, "", "", ""); }
    private static SlabBlock chiseledSandStoneHelper(String name, Block block, String norm, String Shift, String Ctrl) { return (SlabBlock) registerBlock(name, new concreteSlab(AbstractBlock.Settings.copy(block).sounds(BlockSoundGroup.STONE), norm, Shift, Ctrl)); }
    public static void registerConcreteSlab() { Delbase.LOGGER.info("Registering Concrete Slabs for "+Delbase.Delbase_ID); }
}