package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.fence.terracottaFence;
import com.dephoegon.delbase.aid.block.colorshift.fence.terracottaFenceGate;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.*;

public class terracottaFences extends baseModBlocks {
    public static final FenceBlock WHITE_TERRACOTTA_FENCE = noToolTipFAid("white_terracotta_fence", WHITE_TERRACOTTA);
    public static final FenceGateBlock WHITE_TERRACOTTA_FENCE_GATE = noToolTipFgAid("white_terracotta_fence_gate", WHITE_TERRACOTTA);
    public static final FenceBlock ORANGE_TERRACOTTA_FENCE = noToolTipFAid("orange_terracotta_fence", ORANGE_TERRACOTTA);
    public static final FenceGateBlock ORANGE_TERRACOTTA_FENCE_GATE = noToolTipFgAid("orange_terracotta_fence_gate", ORANGE_TERRACOTTA);
    public static final FenceBlock MAGENTA_TERRACOTTA_FENCE = noToolTipFAid("magenta_terracotta_fence", MAGENTA_TERRACOTTA);
    public static final FenceGateBlock MAGENTA_TERRACOTTA_FENCE_GATE = noToolTipFgAid("magenta_terracotta_fence_gate", MAGENTA_TERRACOTTA);
    public static final FenceBlock LIGHT_BLUE_TERRACOTTA_FENCE = noToolTipFAid("light_blue_terracotta_fence", LIGHT_BLUE_TERRACOTTA);
    public static final FenceGateBlock LIGHT_BLUE_TERRACOTTA_FENCE_GATE = noToolTipFgAid("light_blue_terracotta_fence_gate", LIGHT_BLUE_TERRACOTTA);
    public static final FenceBlock YELLOW_TERRACOTTA_FENCE = noToolTipFAid("yellow_terracotta_fence", YELLOW_TERRACOTTA);
    public static final FenceGateBlock YELLOW_TERRACOTTA_FENCE_GATE = noToolTipFgAid("yellow_terracotta_fence_gate", YELLOW_TERRACOTTA);
    public static final FenceBlock LIME_TERRACOTTA_FENCE = noToolTipFAid("lime_terracotta_fence", LIME_TERRACOTTA);
    public static final FenceGateBlock LIME_TERRACOTTA_FENCE_GATE = noToolTipFgAid("lime_terracotta_fence_gate", LIME_TERRACOTTA);
    public static final FenceBlock PINK_TERRACOTTA_FENCE = noToolTipFAid("pink_terracotta_fence", PINK_TERRACOTTA);
    public static final FenceGateBlock PINK_TERRACOTTA_FENCE_GATE = noToolTipFgAid("pink_terracotta_fence_gate", PINK_TERRACOTTA);
    public static final FenceBlock GRAY_TERRACOTTA_FENCE = noToolTipFAid("gray_terracotta_fence", GRAY_TERRACOTTA);
    public static final FenceGateBlock GRAY_TERRACOTTA_FENCE_GATE = noToolTipFgAid("gray_terracotta_fence_gate", GRAY_TERRACOTTA);
    public static final FenceBlock LIGHT_GRAY_TERRACOTTA_FENCE = noToolTipFAid("light_gray_terracotta_fence", LIGHT_GRAY_TERRACOTTA);
    public static final FenceGateBlock LIGHT_GRAY_TERRACOTTA_FENCE_GATE = noToolTipFgAid("light_gray_terracotta_fence_gate", LIGHT_GRAY_TERRACOTTA);
    public static final FenceBlock CYAN_TERRACOTTA_FENCE = noToolTipFAid("cyan_terracotta_fence", CYAN_TERRACOTTA);
    public static final FenceGateBlock CYAN_TERRACOTTA_FENCE_GATE = noToolTipFgAid("cyan_terracotta_fence_gate", CYAN_TERRACOTTA);
    public static final FenceBlock PURPLE_TERRACOTTA_FENCE = noToolTipFAid("purple_terracotta_fence", PURPLE_TERRACOTTA);
    public static final FenceGateBlock PURPLE_TERRACOTTA_FENCE_GATE = noToolTipFgAid("purple_terracotta_fence_gate", PURPLE_TERRACOTTA);
    public static final FenceBlock BLUE_TERRACOTTA_FENCE = noToolTipFAid("blue_terracotta_fence", BLUE_TERRACOTTA);
    public static final FenceGateBlock BLUE_TERRACOTTA_FENCE_GATE = noToolTipFgAid("blue_terracotta_fence_gate", BLUE_TERRACOTTA);
    public static final FenceBlock BROWN_TERRACOTTA_FENCE = noToolTipFAid("brown_terracotta_fence", BROWN_TERRACOTTA);
    public static final FenceGateBlock BROWN_TERRACOTTA_FENCE_GATE = noToolTipFgAid("brown_terracotta_fence_gate", BROWN_TERRACOTTA);
    public static final FenceBlock GREEN_TERRACOTTA_FENCE = noToolTipFAid("green_terracotta_fence", GREEN_TERRACOTTA);
    public static final FenceGateBlock GREEN_TERRACOTTA_FENCE_GATE = noToolTipFgAid("green_terracotta_fence_gate", GREEN_TERRACOTTA);
    public static final FenceBlock RED_TERRACOTTA_FENCE = noToolTipFAid("red_terracotta_fence", RED_TERRACOTTA);
    public static final FenceGateBlock RED_TERRACOTTA_FENCE_GATE = noToolTipFgAid("red_terracotta_fence_gate", RED_TERRACOTTA);
    public static final FenceBlock BLACK_TERRACOTTA_FENCE = noToolTipFAid("black_terracotta_fence", BLACK_TERRACOTTA);
    public static final FenceGateBlock BLACK_TERRACOTTA_FENCE_GATE = noToolTipFgAid("black_terracotta_fence_gate", BLACK_TERRACOTTA);
    public static final FenceBlock TERRACOTTA_FENCE = noToolTipFAid("terracotta_fence", TERRACOTTA);
    public static final FenceGateBlock TERRACOTTA_FENCE_GATE = noToolTipFgAid("terracotta_fence_gate", TERRACOTTA);

    private static FenceBlock noToolTipFAid(String name, Block block) { return fenceBlockAid(name, block, BlockSoundGroup.CALCITE, "","", ""); }
    private static FenceGateBlock noToolTipFgAid(String name, Block block) { return fenceGateBlockAid(name, block, BlockSoundGroup.CALCITE, "","", ""); }
    @SuppressWarnings("SameParameterValue")
    private static FenceBlock fenceBlockAid(String name, Block block, BlockSoundGroup soundGroup, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceBlock) registerBlock(name, new terracottaFence(FabricBlockSettings.copyOf(block).sounds(soundGroup), NormToolTip, ShiftToolTip, CtrlToolTip));
    }
    @SuppressWarnings("SameParameterValue")
    private static FenceGateBlock fenceGateBlockAid(String name, Block block, BlockSoundGroup soundGroup, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceGateBlock) registerBlock(name, new terracottaFenceGate(FabricBlockSettings.copyOf(block).sounds(soundGroup), NormToolTip, ShiftToolTip, CtrlToolTip));
    }
    public static void registerTerracottaFences() { Delbase.LOGGER.info("Registering Terracotta Fences for "+Delbase.Delbase_ID); }
}
