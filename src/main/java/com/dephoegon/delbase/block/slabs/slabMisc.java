package com.dephoegon.delbase.block.slabs;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.stock.slabBlock;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.*;

public class slabMisc extends baseModBlocks {
    public static final SlabBlock END_STONE_SLAB = noToolTipFAid("end_stone_slab", END_STONE);
    public static final SlabBlock BONE_BLOCK_SLAB = noToolTipFAid("bone_block_slab", BONE_BLOCK, BlockSoundGroup.BONE);
    public static final SlabBlock DRIED_KELP_SLAB = noToolTipFAid("dried_kelp_slab", DRIED_KELP_BLOCK, BlockSoundGroup.GRASS, 4001, 5, 10);
    public static final SlabBlock GLOWSTONE_SLAB = noToolTipFAid("glowstone_slab", GLOWSTONE, 15);
    public static final SlabBlock BASALT_SLAB = noToolTipFAid("basalt_slab", BASALT);
    public static final SlabBlock POLISHED_BASALT_SLAB = noToolTipFAid("polished_basalt_slab", BASALT);
    public static final SlabBlock SMOOTH_BASALT_SLAB = noToolTipFAid("smooth_basalt_slab", BASALT);
    public static final SlabBlock RAW_COPPER_SLAB = noToolTipFAid("raw_copper_slab", RAW_COPPER_BLOCK, BlockSoundGroup.METAL);
    public static final SlabBlock RAW_GOLD_SLAB = noToolTipFAid("raw_gold_slab", RAW_GOLD_BLOCK, BlockSoundGroup.METAL);
    public static final SlabBlock RAW_IRON_SLAB = noToolTipFAid("raw_iron_slab", RAW_IRON_BLOCK, BlockSoundGroup.METAL);
    public static final SlabBlock COAL_BLOCK_SLAB = noToolTipFAid("coal_block_slab", 16000, COAL_BLOCK);
    public static final SlabBlock CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = noToolTipFAid("cracked_polished_blackstone_brick_slab", CRACKED_POLISHED_BLACKSTONE_BRICKS);
    public static final SlabBlock CHISELED_POLISHED_BLACKSTONE_SLAB = noToolTipFAid("chiseled_polished_blackstone_slab", CHISELED_POLISHED_BLACKSTONE);
    public static final SlabBlock DRIPSTONE_SLAB = noToolTipFAid("dripstone_slab", DRIPSTONE_BLOCK, BlockSoundGroup.DRIPSTONE_BLOCK);
    public static final SlabBlock NETHERRACK_SLAB = noToolTipFAid("netherrack_slab", NETHERRACK, BlockSoundGroup.NETHERRACK);
    public static final SlabBlock SHROOMLIGHT_SLAB = noToolTipFAid("shroomlight_slab", SHROOMLIGHT, BlockSoundGroup.SHROOMLIGHT, 15);
    public static final SlabBlock MAGMA_BLOCK_SLAB = noToolTipFAid("magma_block_slab", MAGMA_BLOCK, 3);
    public static final SlabBlock DEEPSLATE_SLAB = noToolTipFAid("deepslate_slab", DEEPSLATE, BlockSoundGroup.DEEPSLATE);

    private static SlabBlock noToolTipFAid(String name, Block block) { return slabBlockAid(name, block, BlockSoundGroup.STONE, "","", ""); }
    private static SlabBlock noToolTipFAid(String name, Block block, BlockSoundGroup blockSoundGroup) { return slabBlockAid(name, block, blockSoundGroup, "","", ""); }
    private static SlabBlock noToolTipFAid(String name, int fuelTime, Block block) { return slabBlockAid(name, block, BlockSoundGroup.STONE, fuelTime, "","", ""); }
    private static SlabBlock noToolTipFAid(String name, int fuelTime, Block block, BlockSoundGroup blockSoundGroup) { return slabBlockAid(name, block, blockSoundGroup, fuelTime, "","", ""); }
    private static SlabBlock noToolTipFAid(String name, Block block, int light) { return slabBlockAid(name, block, BlockSoundGroup.STONE, "","", "", light); }
    private static SlabBlock noToolTipFAid(String name, Block block, BlockSoundGroup blockSoundGroup, int light) { return slabBlockAid(name, block, blockSoundGroup, "","", "", light); }
    private static SlabBlock noToolTipFAid(String name, Block block, BlockSoundGroup blockSoundGroup, int fuelTime, int burnChance, int burnSpread) {
        return slabBlockAid(name, block, blockSoundGroup, fuelTime, burnChance, burnSpread, "", "", "");
    }
    private static SlabBlock slabBlockAid(String name, Block block, BlockSoundGroup blockSoundGroup, int fuelTime, int burnChance, int burnSpread, String norm, String shift, String Ctrl) {
        return (SlabBlock) registerBlock(name, new slabBlock(FabricBlockSettings.copyOf(block).sounds(blockSoundGroup), norm, shift, Ctrl, null), true, fuelTime, burnChance, burnSpread);
    }
    @SuppressWarnings("SameParameterValue")
    private static SlabBlock slabBlockAid(String name, Block block, BlockSoundGroup blockSoundGroup, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (SlabBlock) registerBlock(name, new slabBlock(FabricBlockSettings.copyOf(block).sounds(blockSoundGroup), NormToolTip, ShiftToolTip, CtrlToolTip, null));
    }
    @SuppressWarnings("SameParameterValue")
    private static SlabBlock slabBlockAid(String name, Block block, BlockSoundGroup blockSoundGroup, int fuelTime, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (SlabBlock) registerBlock(name, new slabBlock(FabricBlockSettings.copyOf(block).sounds(blockSoundGroup), NormToolTip, ShiftToolTip, CtrlToolTip, null), fuelTime);
    }
    @SuppressWarnings("SameParameterValue")
    private static SlabBlock slabBlockAid(String name, Block block, BlockSoundGroup blockSoundGroup, String NormToolTip, String ShiftToolTip, String CtrlToolTip, int light) {
        return  (SlabBlock) registerBlock(name, new slabBlock(FabricBlockSettings.copyOf(block).sounds(blockSoundGroup).luminance((blockstate) -> light), NormToolTip, ShiftToolTip, CtrlToolTip, null));
    }
    public static void registerMiscFences() { Delbase.LOGGER.info("Registering MISC Fences for "+Delbase.Delbase_ID); }
}