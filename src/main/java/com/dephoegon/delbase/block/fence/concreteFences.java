package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.fence.concreteFence;
import com.dephoegon.delbase.aid.block.colorshift.fence.concreteFenceGate;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.*;

public class concreteFences extends baseModBlocks {
    public static final FenceBlock WHITE_CONCRETE_FENCE = noToolTipFAid("white_concrete_fence", WHITE_CONCRETE);
    public static final FenceGateBlock WHITE_CONCRETE_FENCE_GATE = noToolTipFgAid("white_concrete_fence_gate", WHITE_CONCRETE);
    public static final FenceBlock ORANGE_CONCRETE_FENCE = noToolTipFAid("orange_concrete_fence", ORANGE_CONCRETE);
    public static final FenceGateBlock ORANGE_CONCRETE_FENCE_GATE = noToolTipFgAid("orange_concrete_fence_gate", ORANGE_CONCRETE);
    public static final FenceBlock MAGENTA_CONCRETE_FENCE = noToolTipFAid("magenta_concrete_fence", MAGENTA_CONCRETE);
    public static final FenceGateBlock MAGENTA_CONCRETE_FENCE_GATE = noToolTipFgAid("magenta_concrete_fence_gate", MAGENTA_CONCRETE);
    public static final FenceBlock LIGHT_BLUE_CONCRETE_FENCE = noToolTipFAid("light_blue_concrete_fence", LIGHT_BLUE_CONCRETE);
    public static final FenceGateBlock LIGHT_BLUE_CONCRETE_FENCE_GATE = noToolTipFgAid("light_blue_concrete_fence_gate", LIGHT_BLUE_CONCRETE);
    public static final FenceBlock YELLOW_CONCRETE_FENCE = noToolTipFAid("yellow_concrete_fence", YELLOW_CONCRETE);
    public static final FenceGateBlock YELLOW_CONCRETE_FENCE_GATE = noToolTipFgAid("yellow_concrete_fence_gate", YELLOW_CONCRETE);
    public static final FenceBlock LIME_CONCRETE_FENCE = noToolTipFAid("lime_concrete_fence", LIME_CONCRETE);
    public static final FenceGateBlock LIME_CONCRETE_FENCE_GATE = noToolTipFgAid("lime_concrete_fence_gate", LIME_CONCRETE);
    public static final FenceBlock PINK_CONCRETE_FENCE = noToolTipFAid("pink_concrete_fence", PINK_CONCRETE);
    public static final FenceGateBlock PINK_CONCRETE_FENCE_GATE = noToolTipFgAid("pink_concrete_fence_gate", PINK_CONCRETE);
    public static final FenceBlock GRAY_CONCRETE_FENCE = noToolTipFAid("gray_concrete_fence", GRAY_CONCRETE);
    public static final FenceGateBlock GRAY_CONCRETE_FENCE_GATE = noToolTipFgAid("gray_concrete_fence_gate", GRAY_CONCRETE);
    public static final FenceBlock LIGHT_GRAY_CONCRETE_FENCE = noToolTipFAid("light_gray_concrete_fence", LIGHT_GRAY_CONCRETE);
    public static final FenceGateBlock LIGHT_GRAY_CONCRETE_FENCE_GATE = noToolTipFgAid("light_gray_concrete_fence_gate", LIGHT_GRAY_CONCRETE);
    public static final FenceBlock CYAN_CONCRETE_FENCE = noToolTipFAid("cyan_concrete_fence", CYAN_CONCRETE);
    public static final FenceGateBlock CYAN_CONCRETE_FENCE_GATE = noToolTipFgAid("cyan_concrete_fence_gate", CYAN_CONCRETE);
    public static final FenceBlock PURPLE_CONCRETE_FENCE = noToolTipFAid("purple_concrete_fence", PURPLE_CONCRETE);
    public static final FenceGateBlock PURPLE_CONCRETE_FENCE_GATE = noToolTipFgAid("purple_concrete_fence_gate", PURPLE_CONCRETE);
    public static final FenceBlock BLUE_CONCRETE_FENCE = noToolTipFAid("blue_concrete_fence", BLUE_CONCRETE);
    public static final FenceGateBlock BLUE_CONCRETE_FENCE_GATE = noToolTipFgAid("blue_concrete_fence_gate", BLUE_CONCRETE);
    public static final FenceBlock BROWN_CONCRETE_FENCE = noToolTipFAid("brown_concrete_fence", BROWN_CONCRETE);
    public static final FenceGateBlock BROWN_CONCRETE_FENCE_GATE = noToolTipFgAid("brown_concrete_fence_gate", BROWN_CONCRETE);
    public static final FenceBlock GREEN_CONCRETE_FENCE = noToolTipFAid("green_concrete_fence", GREEN_CONCRETE);
    public static final FenceGateBlock GREEN_CONCRETE_FENCE_GATE = noToolTipFgAid("green_concrete_fence_gate", GREEN_CONCRETE);
    public static final FenceBlock RED_CONCRETE_FENCE = noToolTipFAid("red_concrete_fence", RED_CONCRETE);
    public static final FenceGateBlock RED_CONCRETE_FENCE_GATE = noToolTipFgAid("red_concrete_fence_gate", RED_CONCRETE);
    public static final FenceBlock BLACK_CONCRETE_FENCE = noToolTipFAid("black_concrete_fence", BLACK_CONCRETE);
    public static final FenceGateBlock BLACK_CONCRETE_FENCE_GATE = noToolTipFgAid("black_concrete_fence_gate", BLACK_CONCRETE);

    private static FenceBlock noToolTipFAid(String name, Block concreteBlock) { return fenceBlockAid(name, "","", "", concreteBlock); }
    private static FenceGateBlock noToolTipFgAid(String name, Block concreteBlock) { return fenceGateBlockAid(name, "","", "", concreteBlock); }
    @SuppressWarnings("SameParameterValue")
    private static FenceBlock fenceBlockAid(String name, String NormToolTip, String ShiftToolTip, String CtrlToolTip, Block concreteBlock) {
        return  (FenceBlock) registerBlock(name, new concreteFence(FabricBlockSettings.copyOf(concreteBlock).sounds(BlockSoundGroup.STONE), NormToolTip, ShiftToolTip, CtrlToolTip));
    }
    @SuppressWarnings("SameParameterValue")
    private static FenceGateBlock fenceGateBlockAid(String name, String NormToolTip, String ShiftToolTip, String CtrlToolTip, Block concreteBlock) {
        return  (FenceGateBlock) registerBlock(name, new concreteFenceGate(FabricBlockSettings.copyOf(concreteBlock).sounds(BlockSoundGroup.STONE), NormToolTip, ShiftToolTip, CtrlToolTip));
    }
    public static void registerConcreteFences() { Delbase.LOGGER.info("Registering Concrete Fences for "+Delbase.Delbase_ID); }
}
