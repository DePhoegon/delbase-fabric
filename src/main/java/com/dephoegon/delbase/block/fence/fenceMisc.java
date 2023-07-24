package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.stock.fenceBlock;
import com.dephoegon.delbase.aid.block.stock.fenceGateBlock;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.*;

public class fenceMisc extends baseModBlocks {
    public static FenceBlock GLOWSTONE_FENCE = noToolTipFAid("glowstone_fence", GLOWSTONE, 15);
    public static FenceGateBlock GLOWSTONE_FENCE_GATE = noToolTipFgAid("glowstone_fence_gate", GLOWSTONE, 15);
    public static FenceBlock COBBLED_BASALT_FENCE = noToolTipFAid("cobbled_basalt_fence", SMOOTH_BASALT);
    public static FenceGateBlock COBBLED_BASALT_FENCE_GATE = noToolTipFgAid("cobbled_basalt_fence_gate", SMOOTH_BASALT);
    public static FenceBlock BASALT_FENCE = noToolTipFAid("basalt_fence", SMOOTH_BASALT);
    public static FenceGateBlock BASALT_FENCE_GATE = noToolTipFgAid("basalt_fence_gate", SMOOTH_BASALT);
    public static FenceBlock SMOOTH_BASALT_FENCE = noToolTipFAid("smooth_basalt_fence", SMOOTH_BASALT);
    public static FenceGateBlock SMOOTH_BASALT_FENCE_GATE = noToolTipFgAid("smooth_basalt_fence_gate", SMOOTH_BASALT);
    public static FenceBlock POLISHED_BASALT_FENCE = noToolTipFAid("polished_basalt_fence", SMOOTH_BASALT);
    public static FenceGateBlock POLISHED_BASALT_FENCE_GATE = noToolTipFgAid("polished_basalt_fence_gate", SMOOTH_BASALT);
    public static FenceBlock END_STONE_FENCE = noToolTipFAid("end_stone_fence", END_STONE);
    public static FenceGateBlock END_STONE_FENCE_GATE = noToolTipFgAid("end_stone_fence_gate", END_STONE);
    public static FenceBlock DRIPSTONE_FENCE = noToolTipFAid("dripstone_fence", DRIPSTONE_BLOCK);
    public static FenceGateBlock DRIPSTONE_FENCE_GATE = noToolTipFgAid("dripstone_fence_gate", DRIPSTONE_BLOCK);
    public static FenceBlock CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE = noToolTipFAid("cracked_polished_blackstone_brick_fence", CRACKED_POLISHED_BLACKSTONE_BRICKS);
    public static FenceGateBlock CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE_GATE = noToolTipFgAid("cracked_polished_blackstone_brick_fence_gate", CRACKED_POLISHED_BLACKSTONE_BRICKS);
    public static FenceBlock RAW_GOLD_FENCE = noToolTipFAid("raw_gold_fence", RAW_GOLD_BLOCK);
    public static FenceGateBlock RAW_GOLD_FENCE_GATE = noToolTipFgAid("raw_gold_fence_gate", RAW_GOLD_BLOCK);
    public static FenceBlock RAW_COPPER_FENCE = noToolTipFAid("raw_copper_fence", RAW_COPPER_BLOCK);
    public static FenceGateBlock RAW_COPPER_FENCE_GATE = noToolTipFgAid("raw_copper_fence_gate", RAW_COPPER_BLOCK);
    public static FenceBlock RAW_IRON_FENCE = noToolTipFAid("raw_iron_fence", RAW_IRON_BLOCK);
    public static FenceGateBlock RAW_IRON_FENCE_GATE = noToolTipFgAid("raw_iron_fence_gate", RAW_IRON_BLOCK);
    public static FenceBlock PURPUR_BLOCK_FENCE = noToolTipFAid("purpur_block_fence", PURPUR_BLOCK);
    public static FenceGateBlock PURPUR_BLOCK_FENCE_GATE = noToolTipFgAid("purpur_block_fence_gate", PURPUR_BLOCK);
    public static FenceBlock COAL_BLOCK_FENCE = noToolTipFAid("coal_block_fence", 5001, COAL_BLOCK);
    public static FenceGateBlock COAL_BLOCK_FENCE_GATE = noToolTipFgAid("coal_block_fence_gate", 5001, COAL_BLOCK);
    public static FenceBlock CHISELED_POLISHED_BLACKSTONE_FENCE = noToolTipFAid("chiseled_polished_blackstone_fence", CHISELED_POLISHED_BLACKSTONE);
    public static FenceGateBlock CHISELED_POLISHED_BLACKSTONE_FENCE_GATE = noToolTipFgAid("chiseled_polished_blackstone_fence_gate", CHISELED_POLISHED_BLACKSTONE);
    public static FenceBlock BONE_BLOCK_FENCE = noToolTipFAid("bone_block_fence", BONE_BLOCK);
    public static FenceGateBlock BONE_BLOCK_FENCE_GATE = noToolTipFgAid("bone_block_fence_gate", BONE_BLOCK);
    public static FenceBlock DRIED_KELP_FENCE = noToolTipFAid("dried_kelp_fence", 1600, DRIED_KELP_BLOCK);
    public static FenceGateBlock DRIED_KELP_FENCE_GATE = noToolTipFgAid("dried_kelp_fence_gate", 1600, DRIED_KELP_BLOCK);
    public static FenceBlock NETHERRACK_FENCE = noToolTipFAid("netherrack_fence", NETHERRACK);
    public static FenceGateBlock NETHERRACK_FENCE_GATE = noToolTipFgAid("netherrack_fence_gate", NETHERRACK);
    public static FenceBlock SHROOMLIGHT_FENCE = noToolTipFAid("shroomlight_fence", SHROOMLIGHT, 15);
    public static FenceGateBlock SHROOMLIGHT_FENCE_GATE = noToolTipFgAid("shroomlight_fence_gate", SHROOMLIGHT, 15);
    public static FenceBlock MAGMA_BLOCK_FENCE = noToolTipFAid("magma_block_fence", MAGMA_BLOCK, 3);
    public static FenceGateBlock MAGMA_BLOCK_FENCE_GATE = noToolTipFgAid("magma_block_fence_gate", MAGMA_BLOCK, 3);
    public static FenceGateBlock NETHERBRICK_FENCE_GATE = noToolTipFgAid("netherbrick_fence_gate", NETHER_BRICKS);
    public static FenceBlock RED_NETHERBRICK_FENCE = noToolTipFAid("red_netherbrick_fence", RED_NETHER_BRICKS);
    public static FenceGateBlock RED_NETHERBRICK_FENCE_GATE = noToolTipFgAid("red_netherbrick_fence_gate", RED_NETHER_BRICKS);


    private static FenceBlock noToolTipFAid(String name, Block block) { return fenceBlockAid(name, block, "","", ""); }
    private static FenceGateBlock noToolTipFgAid(String name, Block block) { return fenceGateBlockAid(name, block, "","", ""); }
    private static FenceBlock noToolTipFAid(String name, int fuelTime, Block block) { return fenceBlockAid(name, block, fuelTime, "","", ""); }
    private static FenceGateBlock noToolTipFgAid(String name, int fuelTime, Block block) { return fenceGateBlockAid(name, block, fuelTime, "","", ""); }
    private static FenceBlock noToolTipFAid(String name, Block block, int light) { return fenceBlockAid(name, block, "","", "", light); }
    private static FenceGateBlock noToolTipFgAid(String name, Block block, int light) { return fenceGateBlockAid(name, block, "","", "", light); }
    @SuppressWarnings("SameParameterValue")
    private static FenceBlock fenceBlockAid(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceBlock) registerBlock(name, new fenceBlock(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.STONE), NormToolTip, ShiftToolTip, CtrlToolTip, null));
    }
    @SuppressWarnings("SameParameterValue")
    private static FenceGateBlock fenceGateBlockAid(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceGateBlock) registerBlock(name, new fenceGateBlock(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.STONE), NormToolTip, ShiftToolTip, CtrlToolTip, null));
    }
    @SuppressWarnings("SameParameterValue")
    private static FenceBlock fenceBlockAid(String name, Block block, int fuelTime, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceBlock) registerBlock(name, new fenceBlock(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.STONE), NormToolTip, ShiftToolTip, CtrlToolTip, null), fuelTime);
    }
    @SuppressWarnings("SameParameterValue")
    private static FenceGateBlock fenceGateBlockAid(String name, Block block, int fuelTime, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceGateBlock) registerBlock(name, new fenceGateBlock(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.STONE), NormToolTip, ShiftToolTip, CtrlToolTip, null), fuelTime);
    }
    @SuppressWarnings("SameParameterValue")
    private static FenceBlock fenceBlockAid(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip, int light) {
        return  (FenceBlock) registerBlock(name, new fenceBlock(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.STONE).luminance((blockstate) -> light), NormToolTip, ShiftToolTip, CtrlToolTip, null));
    }
    @SuppressWarnings("SameParameterValue")
    private static FenceGateBlock fenceGateBlockAid(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip, int light) {
        return  (FenceGateBlock) registerBlock(name, new fenceGateBlock(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.STONE).luminance((blockstate) -> light), NormToolTip, ShiftToolTip, CtrlToolTip, null));
    }
    public static void registerMiscFences() { Delbase.LOGGER.info("Registering MISC Fences for "+Delbase.Delbase_ID); }
}