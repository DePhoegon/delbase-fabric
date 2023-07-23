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

public class stoneFences extends baseModBlocks {
    public static FenceBlock STONE_FENCE = noToolTipFAid("stone_fence", STONE, BlockSoundGroup.STONE);
    public static FenceGateBlock STONE_FENCE_GATE = noToolTipFgAid("stone_fence_gate", STONE, BlockSoundGroup.STONE);
    public static FenceBlock COBBLESTONE_FENCE = noToolTipFAid("cobblestone_fence", COBBLESTONE, BlockSoundGroup.STONE);
    public static FenceGateBlock COBBLESTONE_FENCE_GATE = noToolTipFgAid("cobblestone_fence_gate", COBBLESTONE, BlockSoundGroup.STONE);
    public static FenceBlock DEEPSLATE_FENCE = noToolTipFAid("deepslate_fence", DEEPSLATE, BlockSoundGroup.DEEPSLATE);
    public static FenceGateBlock DEEPSLATE_FENCE_GATE = noToolTipFgAid("deepslate_fence_gate", DEEPSLATE, BlockSoundGroup.DEEPSLATE);
    public static FenceBlock COBBLED_DEEPSLATE_FENCE = noToolTipFAid("cobbled_deepslate_fence", COBBLED_DEEPSLATE, BlockSoundGroup.DEEPSLATE);
    public static FenceGateBlock COBBLED_DEEPSLATE_FENCE_GATE = noToolTipFgAid("cobbled_deepslate_fence_gate", COBBLED_DEEPSLATE, BlockSoundGroup.DEEPSLATE);
    public static FenceBlock DEEPSLATE_TILE_FENCE = noToolTipFAid("deepslate_tile_fence", DEEPSLATE_TILES, BlockSoundGroup.DEEPSLATE);
    public static FenceGateBlock DEEPSLATE_TILE_FENCE_GATE = noToolTipFgAid("deepslate_tile_fence_gate", DEEPSLATE_TILES, BlockSoundGroup.DEEPSLATE);
    public static FenceBlock POLISHED_DEEPSLATE_FENCE = noToolTipFAid("polished_deepslate_fence", POLISHED_DEEPSLATE, BlockSoundGroup.DEEPSLATE);
    public static FenceGateBlock POLISHED_DEEPSLATE_FENCE_GATE = noToolTipFgAid("polished_deepslate_fence_gate", POLISHED_DEEPSLATE, BlockSoundGroup.DEEPSLATE);
    public static FenceBlock DEEPSLATE_BRICK_FENCE = noToolTipFAid("deepslate_brick_fence", DEEPSLATE_BRICKS, BlockSoundGroup.DEEPSLATE);
    public static FenceGateBlock DEEPSLATE_BRICK_FENCE_GATE = noToolTipFgAid("deepslate_brick_fence_gate", DEEPSLATE_BRICKS, BlockSoundGroup.DEEPSLATE);
    public static FenceBlock BRICK_FENCE = noToolTipFAid("brick_fence", BRICKS, BlockSoundGroup.NETHER_BRICKS);
    public static FenceGateBlock BRICK_FENCE_GATE = noToolTipFgAid("brick_fence_gate", BRICKS, BlockSoundGroup.NETHER_BRICKS);

    private static FenceBlock noToolTipFAid(String name, Block block, BlockSoundGroup soundGroup) { return fenceBlockAid(name, block, soundGroup, "","", "", null); }
    private static FenceGateBlock noToolTipFgAid(String name, Block block, BlockSoundGroup soundGroup) { return fenceGateBlockAid(name, block, soundGroup, "","", "", null); }
    @SuppressWarnings("SameParameterValue")
    private static FenceBlock fenceBlockAid(String name, Block block, BlockSoundGroup soundGroup, String NormToolTip, String ShiftToolTip, String CtrlToolTip, FenceBlock strippedState) {
        return  (FenceBlock) registerBlock(name, new fenceBlock(FabricBlockSettings.copyOf(block).sounds(soundGroup), NormToolTip, ShiftToolTip, CtrlToolTip, strippedState));
    }
    @SuppressWarnings("SameParameterValue")
    private static FenceGateBlock fenceGateBlockAid(String name, Block block, BlockSoundGroup soundGroup, String NormToolTip, String ShiftToolTip, String CtrlToolTip, FenceGateBlock StrippedState) {
        return  (FenceGateBlock) registerBlock(name, new fenceGateBlock(FabricBlockSettings.copyOf(block).sounds(soundGroup), NormToolTip, ShiftToolTip, CtrlToolTip, StrippedState));
    }
    public static void registerStoneFences() { Delbase.LOGGER.info("Registering Stone Fences for "+Delbase.Delbase_ID); }
}
