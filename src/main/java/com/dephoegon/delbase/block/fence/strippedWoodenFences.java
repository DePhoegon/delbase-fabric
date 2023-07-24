package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.alt.woodFence;
import com.dephoegon.delbase.aid.block.alt.woodFenceGate;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.*;

public class strippedWoodenFences extends baseModBlocks {
    public static FenceBlock STRIPPED_ACACIA_WOOD_FENCE = noToolTipFAid("stripped_acacia_wood_fence", ACACIA_WOOD);
    public static FenceGateBlock STRIPPED_ACACIA_WOOD_FENCE_GATE = noToolTipFgAid("stripped_acacia_wood_fence_gate", ACACIA_WOOD);
    public static FenceBlock STRIPPED_ACACIA_LOG_FENCE = noToolTipFAid("stripped_acacia_log_fence", ACACIA_WOOD);
    public static FenceGateBlock STRIPPED_ACACIA_LOG_FENCE_GATE = noToolTipFgAid("stripped_acacia_log_fence_gate", ACACIA_WOOD);
    public static FenceBlock STRIPPED_BIRCH_WOOD_FENCE = noToolTipFAid("stripped_birch_wood_fence", BIRCH_WOOD);
    public static FenceGateBlock STRIPPED_BIRCH_WOOD_FENCE_GATE = noToolTipFgAid("stripped_birch_wood_fence_gate", BIRCH_WOOD);
    public static FenceBlock STRIPPED_BIRCH_LOG_FENCE = noToolTipFAid("stripped_birch_log_fence", BIRCH_WOOD);
    public static FenceGateBlock STRIPPED_BIRCH_LOG_FENCE_GATE = noToolTipFgAid("stripped_birch_log_fence_gate", BIRCH_WOOD);
    public static FenceBlock STRIPPED_CRIMSON_HYPHAE_FENCE = noToolTipFAid("stripped_crimson_hyphae_fence", CRIMSON_HYPHAE);
    public static FenceGateBlock STRIPPED_CRIMSON_HYPHAE_FENCE_GATE = noToolTipFgAid("stripped_crimson_hyphae_fence_gate", CRIMSON_HYPHAE);
    public static FenceBlock STRIPPED_CRIMSON_STEM_FENCE = noToolTipFAid("stripped_crimson_stem_fence", CRIMSON_HYPHAE);
    public static FenceGateBlock STRIPPED_CRIMSON_STEM_FENCE_GATE = noToolTipFgAid("stripped_crimson_stem_fence_gate", CRIMSON_HYPHAE);
    public static FenceBlock STRIPPED_DARK_OAK_WOOD_FENCE = noToolTipFAid("stripped_dark_oak_wood_fence", DARK_OAK_WOOD);
    public static FenceGateBlock STRIPPED_DARK_OAK_WOOD_FENCE_GATE = noToolTipFgAid("stripped_dark_oak_wood_fence_gate", DARK_OAK_WOOD);
    public static FenceBlock STRIPPED_DARK_OAK_LOG_FENCE = noToolTipFAid("stripped_dark_oak_log_fence", DARK_OAK_WOOD);
    public static FenceGateBlock STRIPPED_DARK_OAK_LOG_FENCE_GATE = noToolTipFgAid("stripped_dark_oak_log_fence_gate", DARK_OAK_WOOD);
    public static FenceBlock STRIPPED_JUNGLE_WOOD_FENCE = noToolTipFAid("stripped_jungle_wood_fence", JUNGLE_WOOD);
    public static FenceGateBlock STRIPPED_JUNGLE_WOOD_FENCE_GATE = noToolTipFgAid("stripped_jungle_wood_fence_gate", JUNGLE_WOOD);
    public static FenceBlock STRIPPED_JUNGLE_LOG_FENCE = noToolTipFAid("stripped_jungle_log_fence", JUNGLE_WOOD);
    public static FenceGateBlock STRIPPED_JUNGLE_LOG_FENCE_GATE = noToolTipFgAid("stripped_jungle_log_fence_gate", JUNGLE_WOOD);
    public static FenceBlock STRIPPED_OAK_WOOD_FENCE = noToolTipFAid("stripped_oak_wood_fence", OAK_WOOD);
    public static FenceGateBlock STRIPPED_OAK_WOOD_FENCE_GATE = noToolTipFgAid("stripped_oak_wood_fence_gate", OAK_WOOD);
    public static FenceBlock STRIPPED_OAK_LOG_FENCE = noToolTipFAid("stripped_oak_log_fence", OAK_WOOD);
    public static FenceGateBlock STRIPPED_OAK_LOG_FENCE_GATE = noToolTipFgAid("stripped_oak_log_fence_gate", OAK_WOOD);
    public static FenceBlock STRIPPED_SPRUCE_WOOD_FENCE = noToolTipFAid("stripped_spruce_wood_fence", SPRUCE_WOOD);
    public static FenceGateBlock STRIPPED_SPRUCE_WOOD_FENCE_GATE = noToolTipFgAid("stripped_spruce_wood_fence_gate", SPRUCE_WOOD);
    public static FenceBlock STRIPPED_SPRUCE_LOG_FENCE = noToolTipFAid("stripped_spruce_log_fence", SPRUCE_WOOD);
    public static FenceGateBlock STRIPPED_SPRUCE_LOG_FENCE_GATE = noToolTipFgAid("stripped_spruce_log_fence_gate", SPRUCE_WOOD);
    public static FenceBlock STRIPPED_WARPED_HYPHAE_FENCE = noToolTipFAid("stripped_warped_hyphae_fence", WARPED_HYPHAE);
    public static FenceGateBlock STRIPPED_WARPED_HYPHAE_FENCE_GATE = noToolTipFgAid("stripped_warped_hyphae_fence_gate", WARPED_HYPHAE);
    public static FenceBlock STRIPPED_WARPED_STEM_FENCE = noToolTipFAid("stripped_warped_stem_fence", WARPED_HYPHAE);
    public static FenceGateBlock STRIPPED_WARPED_STEM_FENCE_GATE = noToolTipFgAid("stripped_warped_stem_fence_gate", WARPED_HYPHAE);

    private static FenceBlock noToolTipFAid(String name, Block block) { return fenceBlockAid(name, block, "","", ""); }
    private static FenceGateBlock noToolTipFgAid(String name, Block block) { return fenceGateBlockAid(name, block, "","", ""); }
    @SuppressWarnings("SameParameterValue")
    private static FenceBlock fenceBlockAid(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceBlock) registerBlock(name, new woodFence(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.WOOD), NormToolTip, ShiftToolTip, CtrlToolTip, null));
    }
    @SuppressWarnings("SameParameterValue")
    private static FenceGateBlock fenceGateBlockAid(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceGateBlock) registerBlock(name, new woodFenceGate(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.WOOD), NormToolTip, ShiftToolTip, CtrlToolTip, null));
    }
    public static void registerStrippedWoodenFences() { Delbase.LOGGER.info("Registering Stripped Wooden Fences for "+Delbase.Delbase_ID); }
}