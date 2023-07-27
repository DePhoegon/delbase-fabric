package com.dephoegon.delbase.block.slabs;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.alt.quartzSlab;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.*;

public class slabQuartz extends baseModBlocks {
    public static final SlabBlock CHISELED_QUARTZ_SLAB = noToolTipAid("chiseled_quartz_slab", CHISELED_QUARTZ_BLOCK);
    public static final SlabBlock QUARTZ_BRICK_SLAB = noToolTipAid("quartz_brick_slab", QUARTZ_BRICKS);
    public static final SlabBlock QUARTZ_PILLAR_SLAB = noToolTipAid("quartz_pillar_slab", QUARTZ_PILLAR);

    private static SlabBlock noToolTipAid(String name, Block block) { return quartzSlabRegister(name, block, "", "", ""); }
    private static SlabBlock quartzSlabRegister(String name, Block block, String norm, String Shift, String Ctrl) { return (SlabBlock) registerBlock(name, new quartzSlab(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.STONE), norm, Shift, Ctrl)); }
    public static void registerConcreteSlab() { Delbase.LOGGER.info("Registering Concrete Slabs for "+Delbase.Delbase_ID); }
}