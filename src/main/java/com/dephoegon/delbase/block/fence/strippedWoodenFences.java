package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.alt.strippedWoodFence;
import com.dephoegon.delbase.aid.block.alt.strippedWoodFenceGate;
import com.dephoegon.delbase.block.baseModBlocks;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.*;

public class strippedWoodenFences extends baseModBlocks {
    public static final FenceBlock STRIPPED_ACACIA_WOOD_FENCE = noToolTipFAid("stripped_acacia_wood_fence", ACACIA_WOOD, true);
    public static final FenceGateBlock STRIPPED_ACACIA_WOOD_FENCE_GATE = noToolTipFgAid("stripped_acacia_wood_fence_gate", ACACIA_WOOD, WoodType.ACACIA, true);
    public static final FenceBlock STRIPPED_ACACIA_LOG_FENCE = noToolTipFAid("stripped_acacia_log_fence", ACACIA_WOOD, true);
    public static final FenceGateBlock STRIPPED_ACACIA_LOG_FENCE_GATE = noToolTipFgAid("stripped_acacia_log_fence_gate", ACACIA_WOOD, WoodType.ACACIA, true);
    public static final FenceBlock STRIPPED_BIRCH_WOOD_FENCE = noToolTipFAid("stripped_birch_wood_fence", BIRCH_WOOD, true);
    public static final FenceGateBlock STRIPPED_BIRCH_WOOD_FENCE_GATE = noToolTipFgAid("stripped_birch_wood_fence_gate", BIRCH_WOOD, WoodType.BIRCH, true);
    public static final FenceBlock STRIPPED_BIRCH_LOG_FENCE = noToolTipFAid("stripped_birch_log_fence", BIRCH_WOOD, true);
    public static final FenceGateBlock STRIPPED_BIRCH_LOG_FENCE_GATE = noToolTipFgAid("stripped_birch_log_fence_gate", BIRCH_WOOD, WoodType.BIRCH, true);
    public static final FenceBlock STRIPPED_CRIMSON_HYPHAE_FENCE = noToolTipFAid("stripped_crimson_hyphae_fence", CRIMSON_HYPHAE, false);
    public static final FenceGateBlock STRIPPED_CRIMSON_HYPHAE_FENCE_GATE = noToolTipFgAid("stripped_crimson_hyphae_fence_gate", CRIMSON_HYPHAE, WoodType.CRIMSON, false);
    public static final FenceBlock STRIPPED_CRIMSON_STEM_FENCE = noToolTipFAid("stripped_crimson_stem_fence", CRIMSON_HYPHAE, false);
    public static final FenceGateBlock STRIPPED_CRIMSON_STEM_FENCE_GATE = noToolTipFgAid("stripped_crimson_stem_fence_gate", CRIMSON_HYPHAE, WoodType.CRIMSON, false);
    public static final FenceBlock STRIPPED_DARK_OAK_WOOD_FENCE = noToolTipFAid("stripped_dark_oak_wood_fence", DARK_OAK_WOOD, true);
    public static final FenceGateBlock STRIPPED_DARK_OAK_WOOD_FENCE_GATE = noToolTipFgAid("stripped_dark_oak_wood_fence_gate", DARK_OAK_WOOD, WoodType.DARK_OAK, true);
    public static final FenceBlock STRIPPED_DARK_OAK_LOG_FENCE = noToolTipFAid("stripped_dark_oak_log_fence", DARK_OAK_WOOD, true);
    public static final FenceGateBlock STRIPPED_DARK_OAK_LOG_FENCE_GATE = noToolTipFgAid("stripped_dark_oak_log_fence_gate", DARK_OAK_WOOD, WoodType.DARK_OAK, true);
    public static final FenceBlock STRIPPED_JUNGLE_WOOD_FENCE = noToolTipFAid("stripped_jungle_wood_fence", JUNGLE_WOOD, true);
    public static final FenceGateBlock STRIPPED_JUNGLE_WOOD_FENCE_GATE = noToolTipFgAid("stripped_jungle_wood_fence_gate", JUNGLE_WOOD, WoodType.JUNGLE, true);
    public static final FenceBlock STRIPPED_JUNGLE_LOG_FENCE = noToolTipFAid("stripped_jungle_log_fence", JUNGLE_WOOD, true);
    public static final FenceGateBlock STRIPPED_JUNGLE_LOG_FENCE_GATE = noToolTipFgAid("stripped_jungle_log_fence_gate", JUNGLE_WOOD, WoodType.JUNGLE, true);
    public static final FenceBlock STRIPPED_OAK_WOOD_FENCE = noToolTipFAid("stripped_oak_wood_fence", OAK_WOOD, true);
    public static final FenceGateBlock STRIPPED_OAK_WOOD_FENCE_GATE = noToolTipFgAid("stripped_oak_wood_fence_gate", OAK_WOOD, WoodType.OAK, true);
    public static final FenceBlock STRIPPED_OAK_LOG_FENCE = noToolTipFAid("stripped_oak_log_fence", OAK_WOOD, true);
    public static final FenceGateBlock STRIPPED_OAK_LOG_FENCE_GATE = noToolTipFgAid("stripped_oak_log_fence_gate", OAK_WOOD, WoodType.OAK, true);
    public static final FenceBlock STRIPPED_SPRUCE_WOOD_FENCE = noToolTipFAid("stripped_spruce_wood_fence", SPRUCE_WOOD, true);
    public static final FenceGateBlock STRIPPED_SPRUCE_WOOD_FENCE_GATE = noToolTipFgAid("stripped_spruce_wood_fence_gate", SPRUCE_WOOD, WoodType.SPRUCE, true);
    public static final FenceBlock STRIPPED_SPRUCE_LOG_FENCE = noToolTipFAid("stripped_spruce_log_fence", SPRUCE_WOOD, true);
    public static final FenceGateBlock STRIPPED_SPRUCE_LOG_FENCE_GATE = noToolTipFgAid("stripped_spruce_log_fence_gate", SPRUCE_WOOD, WoodType.SPRUCE, true);
    public static final FenceBlock STRIPPED_WARPED_HYPHAE_FENCE = noToolTipFAid("stripped_warped_hyphae_fence", WARPED_HYPHAE, false);
    public static final FenceGateBlock STRIPPED_WARPED_HYPHAE_FENCE_GATE = noToolTipFgAid("stripped_warped_hyphae_fence_gate", WARPED_HYPHAE, WoodType.WARPED, false);
    public static final FenceBlock STRIPPED_WARPED_STEM_FENCE = noToolTipFAid("stripped_warped_stem_fence", WARPED_HYPHAE, false);
    public static final FenceGateBlock STRIPPED_WARPED_STEM_FENCE_GATE = noToolTipFgAid("stripped_warped_stem_fence_gate", WARPED_HYPHAE, WoodType.WARPED, false);
    public static final FenceBlock STRIPPED_MANGROVE_WOOD_FENCE = noToolTipFAid("stripped_mangrove_wood_fence", STRIPPED_OAK_WOOD, true);
    public static final FenceGateBlock STRIPPED_MANGROVE_WOOD_FENCE_GATE = noToolTipFgAid("stripped_mangrove_wood_fence_gate", STRIPPED_OAK_WOOD, WoodType.MANGROVE, true);
    public static final FenceBlock STRIPPED_MANGROVE_LOG_FENCE = noToolTipFAid("stripped_mangrove_log_fence", STRIPPED_OAK_WOOD, true);
    public static final FenceGateBlock STRIPPED_MANGROVE_LOG_FENCE_GATE = noToolTipFgAid("stripped_mangrove_log_fence_gate", STRIPPED_OAK_WOOD, WoodType.MANGROVE, true);
    public static final FenceBlock STRIPPED_CHERRY_WOOD_FENCE = noToolTipFAid("stripped_cherry_wood_fence", STRIPPED_CHERRY_WOOD, true);
    public static final FenceGateBlock STRIPPED_CHERRY_WOOD_FENCE_GATE = noToolTipFgAid("stripped_cherry_wood_fence_gate", STRIPPED_CHERRY_WOOD, WoodType.CHERRY, true);
    public static final FenceBlock STRIPPED_CHERRY_LOG_FENCE = noToolTipFAid("stripped_cherry_log_fence", STRIPPED_CHERRY_WOOD, true);
    public static final FenceGateBlock STRIPPED_CHERRY_LOG_FENCE_GATE = noToolTipFgAid("stripped_cherry_log_fence_gate", STRIPPED_CHERRY_WOOD, WoodType.CHERRY, true);

    private static FenceBlock noToolTipFAid(String name, Block block, boolean burnable) {
        if (burnable) { return burnFenceBlockAid(name, block, "", "", ""); }
        return fenceBlockAid(name, block, "","", "");
    }
    private static FenceGateBlock noToolTipFgAid(String name, Block block, WoodType type, boolean burnable) {
        if (burnable) { return burnFenceGateBlockAid(name, block, type, "", "", ""); }
        return fenceGateBlockAid(name, block, type, "","", ""); }
    @SuppressWarnings("SameParameterValue")
    private static FenceBlock fenceBlockAid(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceBlock) registerBlock(name, new strippedWoodFence(AbstractBlock.Settings.copy(block).sounds(BlockSoundGroup.WOOD), NormToolTip, ShiftToolTip, CtrlToolTip));
    }
    @SuppressWarnings("SameParameterValue")
    private static FenceGateBlock fenceGateBlockAid(String name, Block block, WoodType type, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceGateBlock) registerBlock(name, new strippedWoodFenceGate(AbstractBlock.Settings.copy(block).sounds(BlockSoundGroup.WOOD), NormToolTip, ShiftToolTip, CtrlToolTip, type));
    }
    @SuppressWarnings("SameParameterValue")
    private static FenceBlock burnFenceBlockAid(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceBlock) registerBlock(name, new strippedWoodFence(AbstractBlock.Settings.copy(block).sounds(BlockSoundGroup.WOOD), NormToolTip, ShiftToolTip, CtrlToolTip),true, 1000, 5, 10);
    }
    @SuppressWarnings("SameParameterValue")
    private static FenceGateBlock burnFenceGateBlockAid(String name, Block block, WoodType type, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceGateBlock) registerBlock(name, new strippedWoodFenceGate(AbstractBlock.Settings.copy(block).sounds(BlockSoundGroup.WOOD), NormToolTip, ShiftToolTip, CtrlToolTip, type),true, 1000, 5, 10);
    }
    public static void registerStrippedWoodenFences() { Delbase.LOGGER.info("Registering Stripped Wooden Fences for "+Delbase.Delbase_ID); }
}