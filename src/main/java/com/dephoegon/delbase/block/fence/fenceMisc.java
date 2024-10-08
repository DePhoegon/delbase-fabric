package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.stock.fenceBlock;
import com.dephoegon.delbase.aid.block.stock.modFenceGate;
import com.dephoegon.delbase.block.baseModBlocks;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.*;

public class fenceMisc extends baseModBlocks {
    public static final FenceBlock GLOWSTONE_FENCE = noToolTipFAid("glowstone_fence", GLOWSTONE, BlockSoundGroup.GLASS, 15);
    public static final FenceGateBlock GLOWSTONE_FENCE_GATE = noToolTipFgAid("glowstone_fence_gate", GLOWSTONE, BlockSoundGroup.GLASS, 15);
    public static final FenceBlock COBBLED_BASALT_FENCE = noToolTipFAid("cobbled_basalt_fence", SMOOTH_BASALT);
    public static final FenceGateBlock COBBLED_BASALT_FENCE_GATE = noToolTipFgAid("cobbled_basalt_fence_gate", SMOOTH_BASALT);
    public static final FenceBlock BASALT_FENCE = noToolTipFAid("basalt_fence", SMOOTH_BASALT);
    public static final FenceGateBlock BASALT_FENCE_GATE = noToolTipFgAid("basalt_fence_gate", SMOOTH_BASALT);
    public static final FenceBlock SMOOTH_BASALT_FENCE = noToolTipFAid("smooth_basalt_fence", SMOOTH_BASALT);
    public static final FenceGateBlock SMOOTH_BASALT_FENCE_GATE = noToolTipFgAid("smooth_basalt_fence_gate", SMOOTH_BASALT);
    public static final FenceBlock POLISHED_BASALT_FENCE = noToolTipFAid("polished_basalt_fence", SMOOTH_BASALT);
    public static final FenceGateBlock POLISHED_BASALT_FENCE_GATE = noToolTipFgAid("polished_basalt_fence_gate", SMOOTH_BASALT);
    public static final FenceBlock END_STONE_FENCE = noToolTipFAid("end_stone_fence", END_STONE);
    public static final FenceGateBlock END_STONE_FENCE_GATE = noToolTipFgAid("end_stone_fence_gate", END_STONE);
    public static final FenceBlock DRIPSTONE_FENCE = noToolTipFAid("dripstone_fence", DRIPSTONE_BLOCK, BlockSoundGroup.DRIPSTONE_BLOCK);
    public static final FenceGateBlock DRIPSTONE_FENCE_GATE = noToolTipFgAid("dripstone_fence_gate", DRIPSTONE_BLOCK, BlockSoundGroup.DRIPSTONE_BLOCK);
    public static final FenceBlock CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE = noToolTipFAid("cracked_polished_blackstone_brick_fence", CRACKED_POLISHED_BLACKSTONE_BRICKS);
    public static final FenceGateBlock CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE_GATE = noToolTipFgAid("cracked_polished_blackstone_brick_fence_gate", CRACKED_POLISHED_BLACKSTONE_BRICKS);
    public static final FenceBlock RAW_GOLD_FENCE = noToolTipFAid("raw_gold_fence", RAW_GOLD_BLOCK, BlockSoundGroup.METAL);
    public static final FenceGateBlock RAW_GOLD_FENCE_GATE = noToolTipFgAid("raw_gold_fence_gate", RAW_GOLD_BLOCK, BlockSoundGroup.METAL);
    public static final FenceBlock RAW_COPPER_FENCE = noToolTipFAid("raw_copper_fence", RAW_COPPER_BLOCK, BlockSoundGroup.METAL);
    public static final FenceGateBlock RAW_COPPER_FENCE_GATE = noToolTipFgAid("raw_copper_fence_gate", RAW_COPPER_BLOCK, BlockSoundGroup.METAL);
    public static final FenceBlock RAW_IRON_FENCE = noToolTipFAid("raw_iron_fence", RAW_IRON_BLOCK, BlockSoundGroup.METAL);
    public static final FenceGateBlock RAW_IRON_FENCE_GATE = noToolTipFgAid("raw_iron_fence_gate", RAW_IRON_BLOCK, BlockSoundGroup.METAL);
    public static final FenceBlock PURPUR_BLOCK_FENCE = noToolTipFAid("purpur_block_fence", PURPUR_BLOCK);
    public static final FenceGateBlock PURPUR_BLOCK_FENCE_GATE = noToolTipFgAid("purpur_block_fence_gate", PURPUR_BLOCK);
    public static final FenceBlock COAL_BLOCK_FENCE = noToolTipFAid("coal_block_fence", 5001, COAL_BLOCK);
    public static final FenceGateBlock COAL_BLOCK_FENCE_GATE = noToolTipFgAid("coal_block_fence_gate", 5001, COAL_BLOCK);
    public static final FenceBlock CHISELED_POLISHED_BLACKSTONE_FENCE = noToolTipFAid("chiseled_polished_blackstone_fence", CHISELED_POLISHED_BLACKSTONE);
    public static final FenceGateBlock CHISELED_POLISHED_BLACKSTONE_FENCE_GATE = noToolTipFgAid("chiseled_polished_blackstone_fence_gate", CHISELED_POLISHED_BLACKSTONE);
    public static final FenceBlock BONE_BLOCK_FENCE = noToolTipFAid("bone_block_fence", BONE_BLOCK, BlockSoundGroup.BONE);
    public static final FenceGateBlock BONE_BLOCK_FENCE_GATE = noToolTipFgAid("bone_block_fence_gate", BONE_BLOCK, BlockSoundGroup.BONE);
    public static final FenceBlock DRIED_KELP_FENCE = noToolTipFAid("dried_kelp_fence", DRIED_KELP_BLOCK, BlockSoundGroup.GRASS, 1600, 15, 30);
    public static final FenceGateBlock DRIED_KELP_FENCE_GATE = noToolTipFgAid("dried_kelp_fence_gate", DRIED_KELP_BLOCK, BlockSoundGroup.GRASS, 1600, 15, 30);
    public static final FenceBlock NETHERRACK_FENCE = noToolTipFAid("netherrack_fence", NETHERRACK, BlockSoundGroup.NETHERRACK);
    public static final FenceGateBlock NETHERRACK_FENCE_GATE = noToolTipFgAid("netherrack_fence_gate", NETHERRACK,BlockSoundGroup.NETHERRACK);
    public static final FenceBlock SHROOMLIGHT_FENCE = noToolTipFAid("shroomlight_fence", SHROOMLIGHT, BlockSoundGroup.SHROOMLIGHT, 15);
    public static final FenceGateBlock SHROOMLIGHT_FENCE_GATE = noToolTipFgAid("shroomlight_fence_gate", SHROOMLIGHT, BlockSoundGroup.SHROOMLIGHT, 15);
    public static final FenceBlock MAGMA_BLOCK_FENCE = noToolTipFAid("magma_block_fence", MAGMA_BLOCK, 3);
    public static final FenceGateBlock MAGMA_BLOCK_FENCE_GATE = noToolTipFgAid("magma_block_fence_gate", MAGMA_BLOCK, 3);
    public static final FenceGateBlock NETHERBRICK_FENCE_GATE = noToolTipFgAid("netherbrick_fence_gate", NETHER_BRICKS, BlockSoundGroup.NETHER_BRICKS);
    public static final FenceBlock RED_NETHERBRICK_FENCE = noToolTipFAid("red_netherbrick_fence", RED_NETHER_BRICKS, BlockSoundGroup.NETHER_BRICKS);
    public static final FenceGateBlock RED_NETHERBRICK_FENCE_GATE = noToolTipFgAid("red_netherbrick_fence_gate", RED_NETHER_BRICKS, BlockSoundGroup.NETHER_BRICKS);
    public static final FenceBlock SCULK_FENCE = noToolTipFAid("sculk_fence", SCULK, BlockSoundGroup.SCULK);
    public static final FenceGateBlock SCULK_FENCE_GATE_BLOCK = noToolTipFgAid("sculk_fence_gate", SCULK, BlockSoundGroup.SCULK);
    public static final FenceBlock PACKED_MUD_FENCE = noToolTipFAid("packed_mud_fence", PACKED_MUD, BlockSoundGroup.PACKED_MUD);
    public static final FenceGateBlock PACKED_MUD_FENCE_GATE_BLOCK = noToolTipFgAid("packed_mud_fence_gate", PACKED_MUD, BlockSoundGroup.PACKED_MUD);
    public static final FenceBlock MUD_FENCE = noToolTipFAid("mud_fence", MUD, BlockSoundGroup.MUD);
    public static final FenceGateBlock MUD_FENCE_GATE = noToolTipFgAid("mud_fence_gate", MUD, BlockSoundGroup.MUD);
    public static final FenceBlock MUDDY_MANGROVE_ROOT_FENCE = noToolTipFAid("muddy_mangrove_root_fence", MUDDY_MANGROVE_ROOTS, BlockSoundGroup.MUDDY_MANGROVE_ROOTS);
    public static final FenceGateBlock MUDDY_MANGROVE_ROOT_FENCE_GATE = noToolTipFgAid("muddy_mangrove_root_fence_gate", MUDDY_MANGROVE_ROOTS, BlockSoundGroup.MUDDY_MANGROVE_ROOTS);
    public static final FenceBlock MANGROVE_ROOT_FENCE = noToolTipFAid("mangrove_root_fence", MANGROVE_ROOTS, BlockSoundGroup.MANGROVE_ROOTS, 0, 30, 60);
    public static final FenceGateBlock MANGROVE_ROOT_FENCE_GATE = noToolTipFgAid("mangrove_root_fence_gate", MANGROVE_ROOTS, BlockSoundGroup.MANGROVE_ROOTS, 0 , 30, 60);
    public static final FenceBlock OCHRE_FROGLIGHT_FENCE = noToolTipFAid("ochre_froglight_fence", OCHRE_FROGLIGHT, BlockSoundGroup.FROGLIGHT, 15);
    public static final FenceGateBlock OCHRE_FROGLIGHT_FENCE_GATE = noToolTipFgAid("ochre_froglight_fence_gate", OCHRE_FROGLIGHT, BlockSoundGroup.FROGLIGHT, 15);
    public static final FenceBlock VERDANT_FROGLIGHT_FENCE = noToolTipFAid("verdant_froglight_fence", VERDANT_FROGLIGHT, BlockSoundGroup.FROGLIGHT, 15);
    public static final FenceGateBlock VERDANT_FROGLIGHT_FENCE_GATE = noToolTipFgAid("verdant_froglight_fence_gate", VERDANT_FROGLIGHT, BlockSoundGroup.FROGLIGHT, 15);
    public static final FenceBlock PEARLESCENT_FROGLIGHT_FENCE = noToolTipFAid("pearlescent_froglight_fence", PEARLESCENT_FROGLIGHT, BlockSoundGroup.FROGLIGHT, 15);
    public static final FenceGateBlock PEARLESCENT_FROGLIGHT_FENCE_GATE = noToolTipFgAid("pearlescent_froglight_fence_gate", PEARLESCENT_FROGLIGHT, BlockSoundGroup.FROGLIGHT, 15);

    private static FenceBlock noToolTipFAid(String name, Block block) { return fenceBlockAid(name, block, BlockSoundGroup.STONE, "","", ""); }
    private static FenceBlock noToolTipFAid(String name, Block block, BlockSoundGroup blockSoundGroup) { return fenceBlockAid(name, block, blockSoundGroup, "","", ""); }
    private static FenceGateBlock noToolTipFgAid(String name, Block block) { return fenceGateBlockAid(name, block, BlockSoundGroup.STONE, "","", ""); }
    private static FenceGateBlock noToolTipFgAid(String name, Block block, BlockSoundGroup blockSoundGroup) { return fenceGateBlockAid(name, block, blockSoundGroup, "","", ""); }
    private static FenceBlock noToolTipFAid(String name, int fuelTime, Block block) { return fenceBlockAid(name, block, BlockSoundGroup.STONE, fuelTime, "","", ""); }
    private static FenceBlock noToolTipFAid(String name, int fuelTime, Block block, BlockSoundGroup blockSoundGroup) { return fenceBlockAid(name, block, blockSoundGroup, fuelTime, "","", ""); }
    private static FenceGateBlock noToolTipFgAid(String name, int fuelTime, Block block) { return fenceGateBlockAid(name, block, BlockSoundGroup.STONE, fuelTime, "","", ""); }
    private static FenceGateBlock noToolTipFgAid(String name, int fuelTime, Block block, BlockSoundGroup blockSoundGroup) { return fenceGateBlockAid(name, block, blockSoundGroup, fuelTime, "","", ""); }
    private static FenceBlock noToolTipFAid(String name, Block block, int light) { return fenceBlockAid(name, block, BlockSoundGroup.STONE, "","", "", light); }
    private static FenceBlock noToolTipFAid(String name, Block block, BlockSoundGroup blockSoundGroup, int light) { return fenceBlockAid(name, block, blockSoundGroup, "","", "", light); }
    private static FenceGateBlock noToolTipFgAid(String name, Block block, int light) { return fenceGateBlockAid(name, block, BlockSoundGroup.STONE, "","", "", light); }
    private static FenceGateBlock noToolTipFgAid(String name, Block block, BlockSoundGroup blockSoundGroup, int light) { return fenceGateBlockAid(name, block, blockSoundGroup, "","", "", light); }
    private static FenceBlock noToolTipFAid(String name, Block block, BlockSoundGroup blockSoundGroup, int fuelTime, int burnChance, int burnSpread) {
        return fenceBlockAid(name, block, blockSoundGroup, fuelTime, burnChance, burnSpread, "", "", "");
    }
    private static FenceGateBlock noToolTipFgAid(String name, Block block, BlockSoundGroup blockSoundGroup, int fuelTime, int burnChance, int burnSpread) {
        return fenceGateBlockAid(name, block, blockSoundGroup, fuelTime, burnChance, burnSpread, "", "", "");
    }
    private static FenceBlock fenceBlockAid(String name, Block block, BlockSoundGroup blockSoundGroup, int fuelTime, int burnChance, int burnSpread, String norm, String shift, String ctrl) {
        return (FenceBlock) registerBlock(name, new fenceBlock(AbstractBlock.Settings.copy(block).sounds(blockSoundGroup), norm, shift, ctrl, null), true, fuelTime, burnChance, burnSpread);
    }
    private static FenceGateBlock fenceGateBlockAid(String name, Block block, BlockSoundGroup blockSoundGroup, int fuelTime, int burnChance, int burnSpread, String norm, String shift, String ctrl) {
        return (FenceGateBlock) registerBlock(name, new modFenceGate(AbstractBlock.Settings.copy(block).sounds(blockSoundGroup), norm, shift, ctrl, null, WoodType.OAK), true, fuelTime, burnChance, burnSpread);
    }
    @SuppressWarnings("SameParameterValue")
    private static FenceBlock fenceBlockAid(String name, Block block, BlockSoundGroup blockSoundGroup, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceBlock) registerBlock(name, new fenceBlock(AbstractBlock.Settings.copy(block).sounds(blockSoundGroup), NormToolTip, ShiftToolTip, CtrlToolTip, null));
    }
    @SuppressWarnings("SameParameterValue")
    private static FenceGateBlock fenceGateBlockAid(String name, Block block, BlockSoundGroup blockSoundGroup, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceGateBlock) registerBlock(name, new modFenceGate(AbstractBlock.Settings.copy(block).sounds(blockSoundGroup), NormToolTip, ShiftToolTip, CtrlToolTip, null, WoodType.OAK));
    }
    @SuppressWarnings("SameParameterValue")
    private static FenceBlock fenceBlockAid(String name, Block block, BlockSoundGroup blockSoundGroup, int fuelTime, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceBlock) registerBlock(name, new fenceBlock(AbstractBlock.Settings.copy(block).sounds(blockSoundGroup), NormToolTip, ShiftToolTip, CtrlToolTip, null), fuelTime);
    }
    @SuppressWarnings("SameParameterValue")
    private static FenceGateBlock fenceGateBlockAid(String name, Block block, BlockSoundGroup blockSoundGroup, int fuelTime, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceGateBlock) registerBlock(name, new modFenceGate(AbstractBlock.Settings.copy(block).sounds(blockSoundGroup), NormToolTip, ShiftToolTip, CtrlToolTip, null, WoodType.OAK), fuelTime);
    }
    @SuppressWarnings("SameParameterValue")
    private static FenceBlock fenceBlockAid(String name, Block block, BlockSoundGroup blockSoundGroup, String NormToolTip, String ShiftToolTip, String CtrlToolTip, int light) {
        return  (FenceBlock) registerBlock(name, new fenceBlock(AbstractBlock.Settings.copy(block).sounds(blockSoundGroup).luminance((blockstate) -> light), NormToolTip, ShiftToolTip, CtrlToolTip, null));
    }
    @SuppressWarnings("SameParameterValue")
    private static FenceGateBlock fenceGateBlockAid(String name, Block block, BlockSoundGroup blockSoundGroup, String NormToolTip, String ShiftToolTip, String CtrlToolTip, int light) {
        return  (FenceGateBlock) registerBlock(name, new modFenceGate(AbstractBlock.Settings.copy(block).sounds(blockSoundGroup).luminance((blockstate) -> light), NormToolTip, ShiftToolTip, CtrlToolTip, null, WoodType.OAK));
    }
    public static void registerMiscFences() { Delbase.LOGGER.info("Registering MISC Fences for "+Delbase.Delbase_ID); }
}