package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.stock.fenceBlock;
import com.dephoegon.delbase.aid.block.stock.modFenceGate;
import com.dephoegon.delbase.block.baseModBlocks;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.*;

public class stoneFences extends baseModBlocks {
    public static final FenceBlock STONE_FENCE = noToolTipFAid("stone_fence", STONE, BlockSoundGroup.STONE);
    public static final FenceGateBlock STONE_FENCE_GATE = noToolTipFgAid("stone_fence_gate", STONE, BlockSoundGroup.STONE);
    public static final FenceBlock COBBLESTONE_FENCE = noToolTipFAid("cobblestone_fence", COBBLESTONE, BlockSoundGroup.STONE);
    public static final FenceGateBlock COBBLESTONE_FENCE_GATE = noToolTipFgAid("cobblestone_fence_gate", COBBLESTONE, BlockSoundGroup.STONE);
    public static final FenceBlock DEEPSLATE_FENCE = noToolTipFAid("deepslate_fence", DEEPSLATE, BlockSoundGroup.DEEPSLATE);
    public static final FenceGateBlock DEEPSLATE_FENCE_GATE = noToolTipFgAid("deepslate_fence_gate", DEEPSLATE, BlockSoundGroup.DEEPSLATE);
    public static final FenceBlock COBBLED_DEEPSLATE_FENCE = noToolTipFAid("cobbled_deepslate_fence", COBBLED_DEEPSLATE, BlockSoundGroup.DEEPSLATE);
    public static final FenceGateBlock COBBLED_DEEPSLATE_FENCE_GATE = noToolTipFgAid("cobbled_deepslate_fence_gate", COBBLED_DEEPSLATE, BlockSoundGroup.DEEPSLATE);
    public static final FenceBlock DEEPSLATE_TILE_FENCE = noToolTipFAid("deepslate_tile_fence", DEEPSLATE_TILES, BlockSoundGroup.DEEPSLATE);
    public static final FenceGateBlock DEEPSLATE_TILE_FENCE_GATE = noToolTipFgAid("deepslate_tile_fence_gate", DEEPSLATE_TILES, BlockSoundGroup.DEEPSLATE);
    public static final FenceBlock POLISHED_DEEPSLATE_FENCE = noToolTipFAid("polished_deepslate_fence", POLISHED_DEEPSLATE, BlockSoundGroup.DEEPSLATE);
    public static final FenceGateBlock POLISHED_DEEPSLATE_FENCE_GATE = noToolTipFgAid("polished_deepslate_fence_gate", POLISHED_DEEPSLATE, BlockSoundGroup.DEEPSLATE);
    public static final FenceBlock DEEPSLATE_BRICK_FENCE = noToolTipFAid("deepslate_brick_fence", DEEPSLATE_BRICKS, BlockSoundGroup.DEEPSLATE);
    public static final FenceGateBlock DEEPSLATE_BRICK_FENCE_GATE = noToolTipFgAid("deepslate_brick_fence_gate", DEEPSLATE_BRICKS, BlockSoundGroup.DEEPSLATE);
    public static final FenceBlock BRICK_FENCE = noToolTipFAid("brick_fence", BRICKS, BlockSoundGroup.NETHER_BRICKS);
    public static final FenceGateBlock BRICK_FENCE_GATE = noToolTipFgAid("brick_fence_gate", BRICKS, BlockSoundGroup.NETHER_BRICKS);
    public static final FenceBlock MUD_BRICK_FENCE = noToolTipFAid("mud_brick_fence", MUD_BRICKS, BlockSoundGroup.MUD_BRICKS);
    public static final FenceGateBlock MUD_BRICK_FENCE_GATE = noToolTipFgAid("mud_brick_fence_gate", MUD_BRICKS, BlockSoundGroup.MUD_BRICKS);

    private static FenceBlock noToolTipFAid(String name, Block block, BlockSoundGroup soundGroup) { return fenceBlockAid(name, block, soundGroup, "","", "", null); }
    private static FenceGateBlock noToolTipFgAid(String name, Block block, BlockSoundGroup soundGroup) { return fenceGateBlockAid(name, block, soundGroup, "","", "", null); }
    @SuppressWarnings("SameParameterValue")
    private static FenceBlock fenceBlockAid(String name, Block block, BlockSoundGroup soundGroup, String NormToolTip, String ShiftToolTip, String CtrlToolTip, FenceBlock strippedState) {
        return  (FenceBlock) registerBlock(name, new fenceBlock(AbstractBlock.Settings.copy(block).sounds(soundGroup), NormToolTip, ShiftToolTip, CtrlToolTip, strippedState));
    }
    @SuppressWarnings("SameParameterValue")
    private static FenceGateBlock fenceGateBlockAid(String name, Block block, BlockSoundGroup soundGroup, String NormToolTip, String ShiftToolTip, String CtrlToolTip, FenceGateBlock StrippedState) {
        return  (FenceGateBlock) registerBlock(name, new modFenceGate(AbstractBlock.Settings.copy(block).sounds(soundGroup), NormToolTip, ShiftToolTip, CtrlToolTip, StrippedState, WoodType.OAK));
    }
    public static void registerStoneFences() { Delbase.LOGGER.info("Registering Stone Fences for "+Delbase.Delbase_ID); }
}
