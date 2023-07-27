package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.stock.wallBlock;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.WallBlock;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.*;

public class wallMisc extends baseModBlocks {
    public static final WallBlock END_STONE_WALL = noToolTipFAid("end_stone_wall", END_STONE);
    public static final WallBlock PURPUR_BLOCK_WALL = noToolTipFAid("purpur_block_wall", PURPUR_BLOCK);
    public static final WallBlock BONE_BLOCK_WALL = noToolTipFAid("bone_block_wall", BONE_BLOCK, BlockSoundGroup.BONE);
    public static final WallBlock DRIED_KELP_WALL = noToolTipFAid("dried_kelp_wall", DRIED_KELP_BLOCK, BlockSoundGroup.GRASS, 4001, 5, 10);
    public static final WallBlock GLOWSTONE_WALL = noToolTipFAid("glowstone_wall", GLOWSTONE, 15);
    public static final WallBlock BASALT_WALL = noToolTipFAid("basalt_wall", BASALT);
    public static final WallBlock COBBLED_BASALT_WALL = noToolTipFAid("cobbled_basalt_wall", BASALT);
    public static final WallBlock POLISHED_BASALT_WALL = noToolTipFAid("polished_basalt_wall", BASALT);
    public static final WallBlock SMOOTH_BASALT_WALL = noToolTipFAid("smooth_basalt_wall", BASALT);
    public static final WallBlock RAW_COPPER_WALL = noToolTipFAid("raw_copper_wall", RAW_COPPER_BLOCK, BlockSoundGroup.METAL);
    public static final WallBlock RAW_GOLD_WALL = noToolTipFAid("raw_gold_wall", RAW_GOLD_BLOCK, BlockSoundGroup.METAL);
    public static final WallBlock RAW_IRON_WALL = noToolTipFAid("raw_iron_wall", RAW_IRON_BLOCK, BlockSoundGroup.METAL);
    public static final WallBlock COAL_BLOCK_WALL = noToolTipFAid("coal_block_wall", 16000, COAL_BLOCK);
    public static final WallBlock CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = noToolTipFAid("cracked_polished_blackstone_brick_wall", CRACKED_POLISHED_BLACKSTONE_BRICKS);
    public static final WallBlock CHISELED_POLISHED_BLACKSTONE_WALL = noToolTipFAid("chiseled_polished_blackstone_wall", CHISELED_POLISHED_BLACKSTONE);
    public static final WallBlock DRIPSTONE_WALL = noToolTipFAid("dripstone_wall", DRIPSTONE_BLOCK, BlockSoundGroup.DRIPSTONE_BLOCK);
    public static final WallBlock NETHERRACK_WALL = noToolTipFAid("netherrack_wall", NETHERRACK, BlockSoundGroup.NETHERRACK);
    public static final WallBlock SHROOMLIGHT_WALL = noToolTipFAid("shroomlight_wall", SHROOMLIGHT, BlockSoundGroup.SHROOMLIGHT, 15);
    public static final WallBlock MAGMA_BLOCK_WALL = noToolTipFAid("magma_block_wall", MAGMA_BLOCK, 3);
    public static final WallBlock DEEPSLATE_WALL = noToolTipFAid("deepslate_wall", DEEPSLATE, BlockSoundGroup.DEEPSLATE);
    public static final WallBlock STONE_WALL = noToolTipFAid("stone_wall", STONE, BlockSoundGroup.STONE);

    private static WallBlock noToolTipFAid(String name, Block block) { return wallBlockAid(name, block, BlockSoundGroup.STONE, "","", ""); }
    private static WallBlock noToolTipFAid(String name, Block block, BlockSoundGroup blockSoundGroup) { return wallBlockAid(name, block, blockSoundGroup, "","", ""); }
    private static WallBlock noToolTipFAid(String name, int fuelTime, Block block) { return wallBlockAid(name, block, BlockSoundGroup.STONE, fuelTime, "","", ""); }
    private static WallBlock noToolTipFAid(String name, int fuelTime, Block block, BlockSoundGroup blockSoundGroup) { return wallBlockAid(name, block, blockSoundGroup, fuelTime, "","", ""); }
    private static WallBlock noToolTipFAid(String name, Block block, int light) { return wallBlockAid(name, block, BlockSoundGroup.STONE, "","", "", light); }
    private static WallBlock noToolTipFAid(String name, Block block, BlockSoundGroup blockSoundGroup, int light) { return wallBlockAid(name, block, blockSoundGroup, "","", "", light); }
    private static WallBlock noToolTipFAid(String name, Block block, BlockSoundGroup blockSoundGroup, int fuelTime, int burnChance, int burnSpread) {
        return wallBlockAid(name, block, blockSoundGroup, fuelTime, burnChance, burnSpread, "", "", "");
    }
    private static WallBlock wallBlockAid(String name, Block block, BlockSoundGroup blockSoundGroup, int fuelTime, int burnChance, int burnSpread, String norm, String shift, String Ctrl) {
        return (WallBlock) registerBlock(name, new wallBlock(FabricBlockSettings.copyOf(block).sounds(blockSoundGroup), norm, shift, Ctrl, null), true, fuelTime, burnChance, burnSpread);
    }
    @SuppressWarnings("SameParameterValue")
    private static WallBlock wallBlockAid(String name, Block block, BlockSoundGroup blockSoundGroup, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (WallBlock) registerBlock(name, new wallBlock(FabricBlockSettings.copyOf(block).sounds(blockSoundGroup), NormToolTip, ShiftToolTip, CtrlToolTip, null));
    }
    @SuppressWarnings("SameParameterValue")
    private static WallBlock wallBlockAid(String name, Block block, BlockSoundGroup blockSoundGroup, int fuelTime, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (WallBlock) registerBlock(name, new wallBlock(FabricBlockSettings.copyOf(block).sounds(blockSoundGroup), NormToolTip, ShiftToolTip, CtrlToolTip, null), fuelTime);
    }
    @SuppressWarnings("SameParameterValue")
    private static WallBlock wallBlockAid(String name, Block block, BlockSoundGroup blockSoundGroup, String NormToolTip, String ShiftToolTip, String CtrlToolTip, int light) {
        return  (WallBlock) registerBlock(name, new wallBlock(FabricBlockSettings.copyOf(block).sounds(blockSoundGroup).luminance((blockstate) -> light), NormToolTip, ShiftToolTip, CtrlToolTip, null));
    }
    public static void registerMiscFences() { Delbase.LOGGER.info("Registering MISC Walls for "+Delbase.Delbase_ID); }
}