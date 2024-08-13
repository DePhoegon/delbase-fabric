package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.alt.quartzFence;
import com.dephoegon.delbase.aid.block.alt.quartzFenceGate;
import com.dephoegon.delbase.block.baseModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.*;

public class quartzFences extends baseModBlocks {
    public static final FenceBlock QUARTZ_BRICKS_FENCE = noToolTipFAid("quartz_bricks_fence", QUARTZ_BRICKS);
    public static final FenceGateBlock QUARTZ_BRICKS_FENCE_GATE = noToolTipFgAid("quartz_bricks_fence_gate", QUARTZ_BRICKS);
    public static final FenceBlock QUARTZ_BLOCK_FENCE = noToolTipFAid("quartz_block_fence", QUARTZ_BLOCK);
    public static final FenceGateBlock QUARTZ_BLOCK_FENCE_GATE = noToolTipFgAid("quartz_block_fence_gate", QUARTZ_BLOCK);
    public static final FenceBlock SMOOTH_QUARTZ_FENCE = noToolTipFAid("smooth_quartz_fence", SMOOTH_QUARTZ);
    public static final FenceGateBlock SMOOTH_QUARTZ_FENCE_GATE = noToolTipFgAid("smooth_quartz_fence_gate", SMOOTH_QUARTZ);
    public static final FenceBlock CHISELED_QUARTZ_BLOCK_FENCE = noToolTipFAid("chiseled_quartz_block_fence", CHISELED_QUARTZ_BLOCK);
    public static final FenceGateBlock CHISELED_QUARTZ_BLOCK_FENCE_GATE = noToolTipFgAid("chiseled_quartz_block_fence_gate", CHISELED_QUARTZ_BLOCK);
    public static final FenceBlock QUARTZ_PILLAR_FENCE = noToolTipFAid("quartz_pillar_fence", QUARTZ_BLOCK);
    public static final FenceGateBlock QUARTZ_PILLAR_FENCE_GATE = noToolTipFgAid("quartz_pillar_fence_gate", QUARTZ_BLOCK);

    private static FenceBlock noToolTipFAid(String name, Block block) { return fenceBlockAid(name, block, "","", ""); }
    private static FenceGateBlock noToolTipFgAid(String name, Block block) { return fenceGateBlockAid(name, block, "","", ""); }
    @SuppressWarnings("SameParameterValue")
    private static FenceBlock fenceBlockAid(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceBlock) registerBlock(name, new quartzFence(AbstractBlock.Settings.copy(block).sounds(BlockSoundGroup.STONE), NormToolTip, ShiftToolTip, CtrlToolTip));
    }
    @SuppressWarnings("SameParameterValue")
    private static FenceGateBlock fenceGateBlockAid(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceGateBlock) registerBlock(name, new quartzFenceGate(AbstractBlock.Settings.copy(block).sounds(BlockSoundGroup.STONE), NormToolTip, ShiftToolTip, CtrlToolTip));
    }
    public static void registerQuartzFences() { Delbase.LOGGER.info("Registering Quartz Fences for "+Delbase.Delbase_ID); }
}