package com.dephoegon.delbase.block.general;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.stock.*;
import com.dephoegon.delbase.block.baseModBlocks;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.OAK_WOOD;

public class ashBlocks extends baseModBlocks {
    private static final AbstractBlock.Settings ashBlock = AbstractBlock.Settings.copy(OAK_WOOD).sounds(BlockSoundGroup.WOOD);
    public static final SlabBlock ASH_SLAB = (SlabBlock) registerBlock("ash_slab", new modSlabBlock(ashBlock, "", "", "", null), 8000);
    public static final StairsBlock ASH_STAIR = (StairsBlock) registerBlock("ash_stair", new stairBlock(OAK_WOOD.getDefaultState(), ashBlock, "", "", "", null), 12000);
    public static final PillarBlock ASH_LOG = (PillarBlock) registerBlock("ash_log", new modSlabBlock(ashBlock, "","","", null), 16000);
    public static final WallBlock ASH_WALL = (WallBlock) registerBlock("ash_wall", new wallBlock(ashBlock, "","","", null), 10000);
    public static final Block ASH_BLOCK = registerBlock("ash_block", new modSlabBlock(ashBlock,"", "", "", null), 16000);
    public static final FenceBlock ASH_FENCE = (FenceBlock) registerBlock("ash_fence", new fenceBlock(ashBlock, "", "","", null), 5000);
    public static final FenceGateBlock ASH_FENCE_GATE = (FenceGateBlock) registerBlock("ash_fence_gate", new modFenceGate(ashBlock, "","","", null, WoodType.OAK), 5000);

    public static void registerAshBlocks() { Delbase.LOGGER.info("Registering Ash Blocks for "+Delbase.Delbase_ID); }
}