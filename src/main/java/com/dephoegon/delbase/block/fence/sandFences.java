package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.fence.sandFence;
import com.dephoegon.delbase.aid.block.colorshift.fence.sandFenceGate;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.sound.BlockSoundGroup;

import static com.dephoegon.delbase.block.gravity.gravColorSands.*;
import static net.minecraft.block.Blocks.RED_SAND;
import static net.minecraft.block.Blocks.SAND;

public class sandFences extends baseModBlocks {
    public static final FenceBlock WHITE_SAND_FENCE = noToolTipFAid("white_sand_fence", WHITE_SAND);
    public static final FenceGateBlock WHITE_SAND_FENCE_GATE = noToolTipFgAid("white_sand_fence_gate", WHITE_SAND);
    public static final FenceBlock ORANGE_SAND_FENCE = noToolTipFAid("orange_sand_fence", ORANGE_SAND);
    public static final FenceGateBlock ORANGE_SAND_FENCE_GATE = noToolTipFgAid("orange_sand_fence_gate", ORANGE_SAND);
    public static final FenceBlock MAGENTA_SAND_FENCE = noToolTipFAid("magenta_sand_fence", MAGENTA_SAND);
    public static final FenceGateBlock MAGENTA_SAND_FENCE_GATE = noToolTipFgAid("magenta_sand_fence_gate", MAGENTA_SAND);
    public static final FenceBlock LIGHT_BLUE_SAND_FENCE = noToolTipFAid("light_blue_sand_fence", LIGHT_BLUE_SAND);
    public static final FenceGateBlock LIGHT_BLUE_SAND_FENCE_GATE = noToolTipFgAid("light_blue_sand_fence_gate", LIGHT_BLUE_SAND);
    public static final FenceBlock YELLOW_SAND_FENCE = noToolTipFAid("yellow_sand_fence", YELLOW_SAND);
    public static final FenceGateBlock YELLOW_SAND_FENCE_GATE = noToolTipFgAid("yellow_sand_fence_gate", YELLOW_SAND);
    public static final FenceBlock LIME_SAND_FENCE = noToolTipFAid("lime_sand_fence", LIME_SAND);
    public static final FenceGateBlock LIME_SAND_FENCE_GATE = noToolTipFgAid("lime_sand_fence_gate", LIME_SAND);
    public static final FenceBlock PINK_SAND_FENCE = noToolTipFAid("pink_sand_fence", PINK_SAND);
    public static final FenceGateBlock PINK_SAND_FENCE_GATE = noToolTipFgAid("pink_sand_fence_gate", PINK_SAND);
    public static final FenceBlock GRAY_SAND_FENCE = noToolTipFAid("gray_sand_fence", GRAY_SAND);
    public static final FenceGateBlock GRAY_SAND_FENCE_GATE = noToolTipFgAid("gray_sand_fence_gate", GRAY_SAND);
    public static final FenceBlock LIGHT_GRAY_SAND_FENCE = noToolTipFAid("light_gray_sand_fence", LIGHT_GRAY_SAND);
    public static final FenceGateBlock LIGHT_GRAY_SAND_FENCE_GATE = noToolTipFgAid("light_gray_sand_fence_gate", LIGHT_GRAY_SAND);
    public static final FenceBlock CYAN_SAND_FENCE = noToolTipFAid("cyan_sand_fence", CYAN_SAND);
    public static final FenceGateBlock CYAN_SAND_FENCE_GATE = noToolTipFgAid("cyan_sand_fence_gate", CYAN_SAND);
    public static final FenceBlock PURPLE_SAND_FENCE = noToolTipFAid("purple_sand_fence", PURPLE_SAND);
    public static final FenceGateBlock PURPLE_SAND_FENCE_GATE = noToolTipFgAid("purple_sand_fence_gate", PURPLE_SAND);
    public static final FenceBlock BLUE_SAND_FENCE = noToolTipFAid("blue_sand_fence", BLUE_SAND);
    public static final FenceGateBlock BLUE_SAND_FENCE_GATE = noToolTipFgAid("blue_sand_fence_gate", BLUE_SAND);
    public static final FenceBlock BROWN_SAND_FENCE = noToolTipFAid("brown_sand_fence", BROWN_SAND);
    public static final FenceGateBlock BROWN_SAND_FENCE_GATE = noToolTipFgAid("brown_sand_fence_gate", BROWN_SAND);
    public static final FenceBlock GREEN_SAND_FENCE = noToolTipFAid("green_sand_fence", GREEN_SAND);
    public static final FenceGateBlock GREEN_SAND_FENCE_GATE = noToolTipFgAid("green_sand_fence_gate", GREEN_SAND);
    public static final FenceBlock RED_SAND_FENCE = noToolTipFAid("red_sand_fence", RED_SAND);
    public static final FenceGateBlock RED_SAND_FENCE_GATE = noToolTipFgAid("red_sand_fence_gate", RED_SAND);
    public static final FenceBlock BLACK_SAND_FENCE = noToolTipFAid("black_sand_fence", BLACK_SAND);
    public static final FenceGateBlock BLACK_SAND_FENCE_GATE = noToolTipFgAid("black_sand_fence_gate", BLACK_SAND);
    public static final FenceBlock SAND_FENCE = noToolTipFAid("sand_fence", SAND);
    public static final FenceGateBlock SAND_FENCE_GATE = noToolTipFgAid("sand_fence_gate", SAND);
    public static final FenceBlock BLOOD_SAND_FENCE = noToolTipFAid("blood_sand_fence", BLOOD_SAND);
    public static final FenceGateBlock BLOOD_SAND_FENCE_GATE = noToolTipFgAid("blood_sand_fence_gate", BLOOD_SAND);

    private static FenceBlock noToolTipFAid(String name, Block block) { return fenceBlockAid(name, block, "","", ""); }
    private static FenceGateBlock noToolTipFgAid(String name, Block block) { return fenceGateBlockAid(name, block, "","", ""); }
    @SuppressWarnings("SameParameterValue")
    private static FenceBlock fenceBlockAid(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceBlock) registerBlock(name, new sandFence(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.SAND), NormToolTip, ShiftToolTip, CtrlToolTip));
    }
    @SuppressWarnings("SameParameterValue")
    private static FenceGateBlock fenceGateBlockAid(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceGateBlock) registerBlock(name, new sandFenceGate(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.SAND), NormToolTip, ShiftToolTip, CtrlToolTip));
    }
    public static void registerSandFences() { Delbase.LOGGER.info("Registering Sand Fences for "+Delbase.Delbase_ID); }
}