package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.fence.sandStoneFence;
import com.dephoegon.delbase.aid.block.colorshift.fence.sandStoneFenceGate;
import com.dephoegon.delbase.block.baseModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.sound.BlockSoundGroup;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static net.minecraft.block.Blocks.RED_SANDSTONE;
import static net.minecraft.block.Blocks.SANDSTONE;

public class sandStoneFences extends baseModBlocks {
    public static final FenceBlock WHITE_SAND_STONE_FENCE = noToolTipFAid("white_sand_stone_fence", WHITE_SAND_STONE);
    public static final FenceGateBlock WHITE_SAND_STONE_FENCE_GATE = noToolTipFgAid("white_sand_stone_fence_gate", WHITE_SAND_STONE);
    public static final FenceBlock ORANGE_SAND_STONE_FENCE = noToolTipFAid("orange_sand_stone_fence", ORANGE_SAND_STONE);
    public static final FenceGateBlock ORANGE_SAND_STONE_FENCE_GATE = noToolTipFgAid("orange_sand_stone_fence_gate", ORANGE_SAND_STONE);
    public static final FenceBlock MAGENTA_SAND_STONE_FENCE = noToolTipFAid("magenta_sand_stone_fence", MAGENTA_SAND_STONE);
    public static final FenceGateBlock MAGENTA_SAND_STONE_FENCE_GATE = noToolTipFgAid("magenta_sand_stone_fence_gate", MAGENTA_SAND_STONE);
    public static final FenceBlock LIGHT_BLUE_SAND_STONE_FENCE = noToolTipFAid("light_blue_sand_stone_fence", LIGHT_BLUE_SAND_STONE);
    public static final FenceGateBlock LIGHT_BLUE_SAND_STONE_FENCE_GATE = noToolTipFgAid("light_blue_sand_stone_fence_gate", LIGHT_BLUE_SAND_STONE);
    public static final FenceBlock YELLOW_SAND_STONE_FENCE = noToolTipFAid("yellow_sand_stone_fence", YELLOW_SAND_STONE);
    public static final FenceGateBlock YELLOW_SAND_STONE_FENCE_GATE = noToolTipFgAid("yellow_sand_stone_fence_gate", YELLOW_SAND_STONE);
    public static final FenceBlock LIME_SAND_STONE_FENCE = noToolTipFAid("lime_sand_stone_fence", LIME_SAND_STONE);
    public static final FenceGateBlock LIME_SAND_STONE_FENCE_GATE = noToolTipFgAid("lime_sand_stone_fence_gate", LIME_SAND_STONE);
    public static final FenceBlock PINK_SAND_STONE_FENCE = noToolTipFAid("pink_sand_stone_fence", PINK_SAND_STONE);
    public static final FenceGateBlock PINK_SAND_STONE_FENCE_GATE = noToolTipFgAid("pink_sand_stone_fence_gate", PINK_SAND_STONE);
    public static final FenceBlock GRAY_SAND_STONE_FENCE = noToolTipFAid("gray_sand_stone_fence", GRAY_SAND_STONE);
    public static final FenceGateBlock GRAY_SAND_STONE_FENCE_GATE = noToolTipFgAid("gray_sand_stone_fence_gate", GRAY_SAND_STONE);
    public static final FenceBlock LIGHT_GRAY_SAND_STONE_FENCE = noToolTipFAid("light_gray_sand_stone_fence", LIGHT_GRAY_SAND_STONE);
    public static final FenceGateBlock LIGHT_GRAY_SAND_STONE_FENCE_GATE = noToolTipFgAid("light_gray_sand_stone_fence_gate", LIGHT_GRAY_SAND_STONE);
    public static final FenceBlock CYAN_SAND_STONE_FENCE = noToolTipFAid("cyan_sand_stone_fence", CYAN_SAND_STONE);
    public static final FenceGateBlock CYAN_SAND_STONE_FENCE_GATE = noToolTipFgAid("cyan_sand_stone_fence_gate", CYAN_SAND_STONE);
    public static final FenceBlock PURPLE_SAND_STONE_FENCE = noToolTipFAid("purple_sand_stone_fence", PURPLE_SAND_STONE);
    public static final FenceGateBlock PURPLE_SAND_STONE_FENCE_GATE = noToolTipFgAid("purple_sand_stone_fence_gate", PURPLE_SAND_STONE);
    public static final FenceBlock BLUE_SAND_STONE_FENCE = noToolTipFAid("blue_sand_stone_fence", BLUE_SAND_STONE);
    public static final FenceGateBlock BLUE_SAND_STONE_FENCE_GATE = noToolTipFgAid("blue_sand_stone_fence_gate", BLUE_SAND_STONE);
    public static final FenceBlock BROWN_SAND_STONE_FENCE = noToolTipFAid("brown_sand_stone_fence", BROWN_SAND_STONE);
    public static final FenceGateBlock BROWN_SAND_STONE_FENCE_GATE = noToolTipFgAid("brown_sand_stone_fence_gate", BROWN_SAND_STONE);
    public static final FenceBlock GREEN_SAND_STONE_FENCE = noToolTipFAid("green_sand_stone_fence", GREEN_SAND_STONE);
    public static final FenceGateBlock GREEN_SAND_STONE_FENCE_GATE = noToolTipFgAid("green_sand_stone_fence_gate", GREEN_SAND_STONE);
    public static final FenceBlock RED_SAND_STONE_FENCE = noToolTipFAid("red_sand_stone_fence", RED_SANDSTONE);
    public static final FenceGateBlock RED_SAND_STONE_FENCE_GATE = noToolTipFgAid("red_sand_stone_fence_gate", RED_SANDSTONE);
    public static final FenceBlock BLACK_SAND_STONE_FENCE = noToolTipFAid("black_sand_stone_fence", BLACK_SAND_STONE);
    public static final FenceGateBlock BLACK_SAND_STONE_FENCE_GATE = noToolTipFgAid("black_sand_stone_fence_gate", BLACK_SAND_STONE);
    public static final FenceBlock SAND_STONE_FENCE = noToolTipFAid("sand_stone_fence", SANDSTONE);
    public static final FenceGateBlock SAND_STONE_FENCE_GATE = noToolTipFgAid("sand_stone_fence_gate", SANDSTONE);
    public static final FenceBlock BLOOD_SAND_STONE_FENCE = noToolTipFAid("blood_sand_stone_fence", BLOOD_SAND_STONE);
    public static final FenceGateBlock BLOOD_SAND_STONE_FENCE_GATE = noToolTipFgAid("blood_sand_stone_fence_gate", BLOOD_SAND_STONE);

    private static FenceBlock noToolTipFAid(String name, Block block) { return fenceBlockAid(name, block, "","", ""); }
    private static FenceGateBlock noToolTipFgAid(String name, Block block) { return fenceGateBlockAid(name, block, "","", ""); }
    @SuppressWarnings("SameParameterValue")
    private static FenceBlock fenceBlockAid(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceBlock) registerBlock(name, new sandStoneFence(AbstractBlock.Settings.copy(block).sounds(BlockSoundGroup.STONE), NormToolTip, ShiftToolTip, CtrlToolTip));
    }
    @SuppressWarnings("SameParameterValue")
    private static FenceGateBlock fenceGateBlockAid(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceGateBlock) registerBlock(name, new sandStoneFenceGate(AbstractBlock.Settings.copy(block).sounds(BlockSoundGroup.STONE), NormToolTip, ShiftToolTip, CtrlToolTip));
    }
    public static void registerSandStoneFences() { Delbase.LOGGER.info("Registering SandStone Fences for "+Delbase.Delbase_ID); }
}
