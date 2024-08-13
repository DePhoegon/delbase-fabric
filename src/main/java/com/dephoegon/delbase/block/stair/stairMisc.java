package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.stock.stairBlock;
import com.dephoegon.delbase.block.baseModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;
import org.jetbrains.annotations.NotNull;

import static net.minecraft.block.Blocks.*;

public class stairMisc extends baseModBlocks {
    public static final StairsBlock END_STONE_STAIR = noToolTipFAid("end_stone_stair", END_STONE);
    public static final StairsBlock BONE_BLOCK_STAIR = noToolTipFAid("bone_block_stair", BONE_BLOCK, BlockSoundGroup.BONE);
    public static final StairsBlock DRIED_KELP_STAIR = noToolTipFAid("dried_kelp_stair", DRIED_KELP_BLOCK, BlockSoundGroup.GRASS, 4001, 15, 30);
    public static final StairsBlock GLOWSTONE_STAIR = noToolTipFAid("glowstone_stair", GLOWSTONE, 15);
    public static final StairsBlock BASALT_STAIR = noToolTipFAid("basalt_stair", BASALT);
    public static final StairsBlock COBBLED_BASALT_STAIR = noToolTipFAid("cobbled_basalt_stair", BASALT);
    public static final StairsBlock POLISHED_BASALT_STAIR = noToolTipFAid("polished_basalt_stair", BASALT);
    public static final StairsBlock SMOOTH_BASALT_STAIR = noToolTipFAid("smooth_basalt_stair", BASALT);
    public static final StairsBlock RAW_COPPER_STAIR = noToolTipFAid("raw_copper_stair", RAW_COPPER_BLOCK, BlockSoundGroup.METAL);
    public static final StairsBlock RAW_GOLD_STAIR = noToolTipFAid("raw_gold_stair", RAW_GOLD_BLOCK, BlockSoundGroup.METAL);
    public static final StairsBlock RAW_IRON_STAIR = noToolTipFAid("raw_iron_stair", RAW_IRON_BLOCK, BlockSoundGroup.METAL);
    public static final StairsBlock COAL_BLOCK_STAIR = noToolTipFAid("coal_block_stair", 16000, COAL_BLOCK);
    public static final StairsBlock CRACKED_POLISHED_BLACKSTONE_BRICK_STAIR = noToolTipFAid("cracked_polished_blackstone_brick_stair", CRACKED_POLISHED_BLACKSTONE_BRICKS);
    public static final StairsBlock CHISELED_POLISHED_BLACKSTONE_STAIR = noToolTipFAid("chiseled_polished_blackstone_stair", CHISELED_POLISHED_BLACKSTONE);
    public static final StairsBlock DRIPSTONE_STAIR = noToolTipFAid("dripstone_stair", DRIPSTONE_BLOCK, BlockSoundGroup.DRIPSTONE_BLOCK);
    public static final StairsBlock NETHERRACK_STAIR = noToolTipFAid("netherrack_stair", NETHERRACK, BlockSoundGroup.NETHERRACK);
    public static final StairsBlock SHROOMLIGHT_STAIR = noToolTipFAid("shroomlight_stair", SHROOMLIGHT, BlockSoundGroup.SHROOMLIGHT, 15);
    public static final StairsBlock MAGMA_BLOCK_STAIR = noToolTipFAid("magma_block_stair", MAGMA_BLOCK, 3);
    public static final StairsBlock DEEPSLATE_STAIR = noToolTipFAid("deepslate_stair", DEEPSLATE, BlockSoundGroup.DEEPSLATE);
    public static final StairsBlock PACKED_MUD_STAIR = noToolTipFAid("packed_mud_stair", PACKED_MUD, BlockSoundGroup.PACKED_MUD);
    public static final StairsBlock SCULK_STAIR = noToolTipFAid("sculk_stair", SCULK, BlockSoundGroup.SCULK);
    public static final StairsBlock MUD_STAIR = noToolTipFAid("mud_stair", MUD, BlockSoundGroup.MUD);
    public static final StairsBlock MUDDY_MANGROVE_ROOT_STAIR = noToolTipFAid("muddy_mangrove_root_stair", MUDDY_MANGROVE_ROOTS, BlockSoundGroup.MUDDY_MANGROVE_ROOTS);
    public static final StairsBlock MANGROVE_ROOT_STAIR = noToolTipFAid("mangrove_root_stair", MANGROVE_ROOTS, BlockSoundGroup.MANGROVE_ROOTS, 0, 30, 60);
    public static final StairsBlock OCHRE_FROGLIGHT_STAIR = noToolTipFAid("ochre_froglight_stair", OCHRE_FROGLIGHT, BlockSoundGroup.FROGLIGHT, 15);
    public static final StairsBlock VERDANT_FROGLIGHT_STAIR = noToolTipFAid("verdant_froglight_stair", VERDANT_FROGLIGHT, BlockSoundGroup.FROGLIGHT, 15);
    public static final StairsBlock PEARLESCENT_FROGLIGHT_STAIR = noToolTipFAid("pearlescent_froglight_stair", PEARLESCENT_FROGLIGHT, BlockSoundGroup.FROGLIGHT, 15);

    private static StairsBlock noToolTipFAid(String name, Block block) { return stairsBlockAid(name, block, BlockSoundGroup.STONE, "","", ""); }
    private static StairsBlock noToolTipFAid(String name, Block block, BlockSoundGroup blockSoundGroup) { return stairsBlockAid(name, block, blockSoundGroup, "","", ""); }
    private static StairsBlock noToolTipFAid(String name, int fuelTime, Block block) { return stairsBlockAid(name, block, BlockSoundGroup.STONE, fuelTime, "","", ""); }
    private static StairsBlock noToolTipFAid(String name, int fuelTime, Block block, BlockSoundGroup blockSoundGroup) { return stairsBlockAid(name, block, blockSoundGroup, fuelTime, "","", ""); }
    private static StairsBlock noToolTipFAid(String name, Block block, int light) { return stairsBlockAid(name, block, BlockSoundGroup.STONE, "","", "", light); }
    private static StairsBlock noToolTipFAid(String name, Block block, BlockSoundGroup blockSoundGroup, int light) { return stairsBlockAid(name, block, blockSoundGroup, "","", "", light); }
    private static StairsBlock noToolTipFAid(String name, Block block, BlockSoundGroup blockSoundGroup, int fuelTime, int burnChance, int burnSpread) {
        return stairsBlockAid(name, block, blockSoundGroup, fuelTime, burnChance, burnSpread, "", "", "");
    }
    private static StairsBlock stairsBlockAid(String name, Block block, BlockSoundGroup blockSoundGroup, int fuelTime, int burnChance, int burnSpread, String norm, String shift, String Ctrl) {
        return (StairsBlock) registerBlock(name, new stairBlock(block.getDefaultState(), AbstractBlock.Settings.copy(block).sounds(blockSoundGroup), norm, shift, Ctrl, null), true, fuelTime, burnChance, burnSpread);
    }
    @SuppressWarnings("SameParameterValue")
    private static StairsBlock stairsBlockAid(String name, Block block, BlockSoundGroup blockSoundGroup, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (StairsBlock) registerBlock(name, new stairBlock(block.getDefaultState(), AbstractBlock.Settings.copy(block).sounds(blockSoundGroup), NormToolTip, ShiftToolTip, CtrlToolTip, null));
    }
    @SuppressWarnings("SameParameterValue")
    private static StairsBlock stairsBlockAid(String name, Block block, BlockSoundGroup blockSoundGroup, int fuelTime, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (StairsBlock) registerBlock(name, new stairBlock(block.getDefaultState(), AbstractBlock.Settings.copy(block).sounds(blockSoundGroup), NormToolTip, ShiftToolTip, CtrlToolTip, null), fuelTime);
    }
    @SuppressWarnings("SameParameterValue")
    private static StairsBlock stairsBlockAid(String name, @NotNull Block block, BlockSoundGroup blockSoundGroup, String NormToolTip, String ShiftToolTip, String CtrlToolTip, int light) {
        return  (StairsBlock) registerBlock(name, new stairBlock(block.getDefaultState(), AbstractBlock.Settings.copy(block).sounds(blockSoundGroup).luminance((blockstate) -> light), NormToolTip, ShiftToolTip, CtrlToolTip, null));
    }
    public static void registerMiscFences() { Delbase.LOGGER.info("Registering MISC Fences for "+Delbase.Delbase_ID); }
}