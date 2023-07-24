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

import static com.dephoegon.delbase.block.fence.strippedWoodenFences.*;
import static net.minecraft.block.Blocks.*;

public class woodenFences extends baseModBlocks {
    public static FenceBlock ACACIA_WOOD_FENCE = noToolTipFAid("acacia_wood_fence", ACACIA_WOOD, STRIPPED_ACACIA_WOOD_FENCE);
    public static FenceGateBlock ACACIA_WOOD_FENCE_GATE = noToolTipFgAid("acacia_wood_fence_gate", ACACIA_WOOD, STRIPPED_ACACIA_WOOD_FENCE_GATE);
    public static FenceBlock ACACIA_LOG_FENCE = noToolTipFAid("acacia_log_fence", ACACIA_WOOD, STRIPPED_ACACIA_LOG_FENCE);
    public static FenceGateBlock ACACIA_LOG_FENCE_GATE = noToolTipFgAid("acacia_log_fence_gate", ACACIA_WOOD, STRIPPED_ACACIA_LOG_FENCE_GATE);
    public static FenceBlock BIRCH_WOOD_FENCE = noToolTipFAid("birch_wood_fence", BIRCH_WOOD,STRIPPED_BIRCH_WOOD_FENCE);
    public static FenceGateBlock BIRCH_WOOD_FENCE_GATE = noToolTipFgAid("birch_wood_fence_gate", BIRCH_WOOD, STRIPPED_BIRCH_WOOD_FENCE_GATE);
    public static FenceBlock BIRCH_LOG_FENCE = noToolTipFAid("birch_log_fence", BIRCH_WOOD, STRIPPED_BIRCH_LOG_FENCE);
    public static FenceGateBlock BIRCH_LOG_FENCE_GATE = noToolTipFgAid("birch_log_fence_gate", BIRCH_WOOD, STRIPPED_BIRCH_LOG_FENCE_GATE);
    public static FenceBlock CRIMSON_HYPHAE_FENCE = noToolTipFAid("crimson_hyphae_fence", CRIMSON_HYPHAE, STRIPPED_CRIMSON_HYPHAE_FENCE);
    public static FenceGateBlock CRIMSON_HYPHAE_FENCE_GATE = noToolTipFgAid("crimson_hyphae_fence_gate", CRIMSON_HYPHAE, STRIPPED_CRIMSON_HYPHAE_FENCE_GATE);
    public static FenceBlock CRIMSON_STEM_FENCE = noToolTipFAid("crimson_stem_fence", CRIMSON_HYPHAE, STRIPPED_CRIMSON_STEM_FENCE);
    public static FenceGateBlock CRIMSON_STEM_FENCE_GATE = noToolTipFgAid("crimson_stem_fence_gate", CRIMSON_HYPHAE, STRIPPED_CRIMSON_STEM_FENCE_GATE);
    public static FenceBlock DARK_OAK_WOOD_FENCE = noToolTipFAid("dark_oak_wood_fence", DARK_OAK_WOOD, STRIPPED_DARK_OAK_WOOD_FENCE);
    public static FenceGateBlock DARK_OAK_WOOD_FENCE_GATE = noToolTipFgAid("dark_oak_wood_fence_gate", DARK_OAK_WOOD, STRIPPED_DARK_OAK_WOOD_FENCE_GATE);
    public static FenceBlock DARK_OAK_LOG_FENCE = noToolTipFAid("dark_oak_log_fence", DARK_OAK_WOOD, STRIPPED_DARK_OAK_LOG_FENCE);
    public static FenceGateBlock DARK_OAK_LOG_FENCE_GATE = noToolTipFgAid("dark_oak_log_fence_gate", DARK_OAK_WOOD, STRIPPED_DARK_OAK_LOG_FENCE_GATE);
    public static FenceBlock JUNGLE_WOOD_FENCE = noToolTipFAid("jungle_wood_fence", JUNGLE_WOOD, STRIPPED_JUNGLE_WOOD_FENCE);
    public static FenceGateBlock JUNGLE_WOOD_FENCE_GATE = noToolTipFgAid("jungle_wood_fence_gate", JUNGLE_WOOD, STRIPPED_JUNGLE_WOOD_FENCE_GATE);
    public static FenceBlock JUNGLE_LOG_FENCE = noToolTipFAid("jungle_log_fence", JUNGLE_WOOD, STRIPPED_JUNGLE_LOG_FENCE);
    public static FenceGateBlock JUNGLE_LOG_FENCE_GATE = noToolTipFgAid("jungle_log_fence_gate", JUNGLE_WOOD, STRIPPED_JUNGLE_LOG_FENCE_GATE);
    public static FenceBlock OAK_WOOD_FENCE = noToolTipFAid("oak_wood_fence", OAK_WOOD, STRIPPED_OAK_WOOD_FENCE);
    public static FenceGateBlock OAK_WOOD_FENCE_GATE = noToolTipFgAid("oak_wood_fence_gate", OAK_WOOD, STRIPPED_OAK_WOOD_FENCE_GATE);
    public static FenceBlock OAK_LOG_FENCE = noToolTipFAid("oak_log_fence", OAK_WOOD, STRIPPED_OAK_LOG_FENCE);
    public static FenceGateBlock OAK_LOG_FENCE_GATE = noToolTipFgAid("oak_log_fence_gate", OAK_WOOD, STRIPPED_OAK_LOG_FENCE_GATE);
    public static FenceBlock SPRUCE_WOOD_FENCE = noToolTipFAid("spruce_wood_fence", SPRUCE_WOOD, STRIPPED_SPRUCE_WOOD_FENCE);
    public static FenceGateBlock SPRUCE_WOOD_FENCE_GATE = noToolTipFgAid("spruce_wood_fence_gate", SPRUCE_WOOD, STRIPPED_SPRUCE_WOOD_FENCE_GATE);
    public static FenceBlock SPRUCE_LOG_FENCE = noToolTipFAid("spruce_log_fence", SPRUCE_WOOD, STRIPPED_SPRUCE_LOG_FENCE);
    public static FenceGateBlock SPRUCE_LOG_FENCE_GATE = noToolTipFgAid("spruce_log_fence_gate", SPRUCE_WOOD, STRIPPED_SPRUCE_LOG_FENCE_GATE);
    public static FenceBlock WARPED_HYPHAE_FENCE = noToolTipFAid("warped_hyphae_fence", WARPED_HYPHAE, STRIPPED_WARPED_HYPHAE_FENCE);
    public static FenceGateBlock WARPED_HYPHAE_FENCE_GATE = noToolTipFgAid("warped_hyphae_fence_gate", WARPED_HYPHAE, STRIPPED_WARPED_HYPHAE_FENCE_GATE);
    public static FenceBlock WARPED_STEM_FENCE = noToolTipFAid("warped_stem_fence", WARPED_HYPHAE, STRIPPED_WARPED_STEM_FENCE);
    public static FenceGateBlock WARPED_STEM_FENCE_GATE = noToolTipFgAid("warped_stem_fence_gate", WARPED_HYPHAE, STRIPPED_WARPED_STEM_FENCE_GATE);

    private static FenceBlock noToolTipFAid(String name, Block block, FenceBlock strippedState) { return fenceBlockAid(name, block, strippedState, "","", ""); }
    private static FenceGateBlock noToolTipFgAid(String name, Block block, FenceGateBlock strippedState) { return fenceGateBlockAid(name, block, strippedState, "","", ""); }
    @SuppressWarnings("SameParameterValue")
    private static FenceBlock fenceBlockAid(String name, Block block, FenceBlock strippedState, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceBlock) registerBlock(name, new woodFence(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.WOOD), NormToolTip, ShiftToolTip, CtrlToolTip, strippedState));
    }
    @SuppressWarnings("SameParameterValue")
    private static FenceGateBlock fenceGateBlockAid(String name, Block block, FenceGateBlock strippedState, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceGateBlock) registerBlock(name, new woodFenceGate(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.WOOD), NormToolTip, ShiftToolTip, CtrlToolTip, strippedState));
    }
    public static void registerWoodenFences() { Delbase.LOGGER.info("Registering Wooden Fences for "+Delbase.Delbase_ID); }
}