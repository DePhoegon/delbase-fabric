package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.stock.fenceBlock;
import com.dephoegon.delbase.aid.block.stock.fenceGateBlock;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.WoodType;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.*;

public class leafFences extends baseModBlocks {
    public static final FenceBlock OAK_LEAF_FENCE = noToolTipFAid("oak_leaf_fence", OAK_LEAVES);
    public static final FenceGateBlock OAK_LEAF_FENCE_GATE = noToolTipFgAid("oak_leaf_fence_gate", OAK_LEAVES);
    public static final FenceBlock SPRUCE_LEAF_FENCE = noToolTipFAid("spruce_leaf_fence", SPRUCE_FENCE);
    public static final FenceGateBlock SPRUCE_LEAF_FENCE_GATE = noToolTipFgAid("spruce_leaf_fence_gate", SPRUCE_LEAVES);
    public static final FenceBlock BIRCH_LEAF_FENCE = noToolTipFAid("birch_leaf_fence", BIRCH_LEAVES);
    public static final FenceGateBlock BIRCH_LEAF_FENCE_GATE = noToolTipFgAid("birch_leaf_fence_gate", BIRCH_LEAVES);
    public static final FenceBlock ACACIA_LEAF_FENCE = noToolTipFAid("acacia_leaf_fence", ACACIA_LEAVES);
    public static final FenceGateBlock ACACIA_LEAF_FENCE_GATE = noToolTipFgAid("acacia_leaf_fence_gate", ACACIA_LEAVES);
    public static final FenceBlock JUNGLE_LEAF_FENCE = noToolTipFAid("jungle_leaf_fence", JUNGLE_LEAVES);
    public static final FenceGateBlock JUNGLE_LEAF_FENCE_GATE = noToolTipFgAid("jungle_leaf_fence_gate", JUNGLE_LEAVES);
    public static final FenceBlock DARK_OAK_LEAF_FENCE = noToolTipFAid("dark_oak_leaf_fence", DARK_OAK_LEAVES);
    public static final FenceGateBlock DARK_OAK_LEAF_FENCE_GATE = noToolTipFgAid("dark_oak_leaf_fence_gate", DARK_OAK_LEAVES);
    public static final FenceBlock AZALEA_LEAF_FENCE = noToolTipFAid("azalea_leaf_fence", AZALEA_LEAVES);
    public static final FenceGateBlock AZALEA_LEAF_FENCE_GATE = noToolTipFgAid("azalea_leaf_fence_gate", AZALEA_LEAVES, BlockSoundGroup.AZALEA_LEAVES);
    public static final FenceBlock FLOWERING_AZALEA_LEAF_FENCE = noToolTipFAid("flowering_azalea_leaf_fence", FLOWERING_AZALEA_LEAVES, BlockSoundGroup.FLOWERING_AZALEA);
    public static final FenceGateBlock FLOWERING_AZALEA_LEAF_FENCE_GATE = noToolTipFgAid("flowering_azalea_leaf_fence_gate", FLOWERING_AZALEA_LEAVES);
    public static final FenceBlock MANGROVE_LEAF_FENCE = noToolTipFAid("mangrove_leaf_fence", MANGROVE_LEAVES, BlockSoundGroup.GLASS);
    public static final FenceGateBlock MANGROVE_LEAF_FENCE_GATE = noToolTipFgAid("mangrove_leaf_fence_gate", MANGROVE_LEAVES, BlockSoundGroup.GLASS);


    private static FenceBlock noToolTipFAid(String name, Block block) { return fenceBlockAid(name, block, BlockSoundGroup.GRASS, "","", ""); }
    private static FenceBlock noToolTipFAid(String name, Block block, BlockSoundGroup group) { return fenceBlockAid(name, block, group, "","", ""); }
    private static FenceGateBlock noToolTipFgAid(String name, Block block) { return fenceGateBlockAid(name, block, BlockSoundGroup.GLASS, "","", ""); }
    private static FenceGateBlock noToolTipFgAid(String name, Block block, BlockSoundGroup group) { return fenceGateBlockAid(name, block, group, "","", ""); }
    @SuppressWarnings("SameParameterValue")
    private static FenceBlock fenceBlockAid(String name, Block block, BlockSoundGroup group, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceBlock) registerBlock(name, new fenceBlock(FabricBlockSettings.copyOf(block).sounds(group).nonOpaque().suffocates(baseModBlocks::never).blockVision(baseModBlocks::never), NormToolTip, ShiftToolTip, CtrlToolTip, null), 30, 60);
    }
    @SuppressWarnings("SameParameterValue")
    private static FenceGateBlock fenceGateBlockAid(String name, Block block, BlockSoundGroup group, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceGateBlock) registerBlock(name, new fenceGateBlock(FabricBlockSettings.copyOf(block).sounds(group).nonOpaque().suffocates(baseModBlocks::never).blockVision(baseModBlocks::never), NormToolTip, ShiftToolTip, CtrlToolTip, null, WoodType.BIRCH), 30, 60);
    }
    public static void registerLeafFences() { Delbase.LOGGER.info("Registering Leaf Fences for "+Delbase.Delbase_ID); }
}