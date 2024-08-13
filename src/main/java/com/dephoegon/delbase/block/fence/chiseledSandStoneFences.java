package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.fence.chiseledSandStoneFence;
import com.dephoegon.delbase.aid.block.colorshift.fence.chiseledSandStoneFenceGate;
import com.dephoegon.delbase.block.baseModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.sound.BlockSoundGroup;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static net.minecraft.block.Blocks.RED_SANDSTONE;
import static net.minecraft.block.Blocks.SANDSTONE;

public class chiseledSandStoneFences extends baseModBlocks {
    public static final FenceBlock WHITE_CHISELED_SAND_STONE_FENCE = noToolTipFAid("white_chiseled_sand_stone_fence", WHITE_SAND_STONE);
    public static final FenceGateBlock WHITE_CHISELED_SAND_STONE_FENCE_GATE = noToolTipFgAid("white_chiseled_sand_stone_fence_gate", WHITE_SAND_STONE);
    public static final FenceBlock ORANGE_CHISELED_SAND_STONE_FENCE = noToolTipFAid("orange_chiseled_sand_stone_fence", ORANGE_SAND_STONE);
    public static final FenceGateBlock ORANGE_CHISELED_SAND_STONE_FENCE_GATE = noToolTipFgAid("orange_chiseled_sand_stone_fence_gate", ORANGE_SAND_STONE);
    public static final FenceBlock MAGENTA_CHISELED_SAND_STONE_FENCE = noToolTipFAid("magenta_chiseled_sand_stone_fence", MAGENTA_SAND_STONE);
    public static final FenceGateBlock MAGENTA_CHISELED_SAND_STONE_FENCE_GATE = noToolTipFgAid("magenta_chiseled_sand_stone_fence_gate", MAGENTA_SAND_STONE);
    public static final FenceBlock LIGHT_BLUE_CHISELED_SAND_STONE_FENCE = noToolTipFAid("light_blue_chiseled_sand_stone_fence", LIGHT_BLUE_SAND_STONE);
    public static final FenceGateBlock LIGHT_BLUE_CHISELED_SAND_STONE_FENCE_GATE = noToolTipFgAid("light_blue_chiseled_sand_stone_fence_gate", LIGHT_BLUE_SAND_STONE);
    public static final FenceBlock YELLOW_CHISELED_SAND_STONE_FENCE = noToolTipFAid("yellow_chiseled_sand_stone_fence", YELLOW_SAND_STONE);
    public static final FenceGateBlock YELLOW_CHISELED_SAND_STONE_FENCE_GATE = noToolTipFgAid("yellow_chiseled_sand_stone_fence_gate", YELLOW_SAND_STONE);
    public static final FenceBlock LIME_CHISELED_SAND_STONE_FENCE = noToolTipFAid("lime_chiseled_sand_stone_fence", LIME_SAND_STONE);
    public static final FenceGateBlock LIME_CHISELED_SAND_STONE_FENCE_GATE = noToolTipFgAid("lime_chiseled_sand_stone_fence_gate", LIME_SAND_STONE);
    public static final FenceBlock PINK_CHISELED_SAND_STONE_FENCE = noToolTipFAid("pink_chiseled_sand_stone_fence", PINK_SAND_STONE);
    public static final FenceGateBlock PINK_CHISELED_SAND_STONE_FENCE_GATE = noToolTipFgAid("pink_chiseled_sand_stone_fence_gate", PINK_SAND_STONE);
    public static final FenceBlock GRAY_CHISELED_SAND_STONE_FENCE = noToolTipFAid("gray_chiseled_sand_stone_fence", GRAY_SAND_STONE);
    public static final FenceGateBlock GRAY_CHISELED_SAND_STONE_FENCE_GATE = noToolTipFgAid("gray_chiseled_sand_stone_fence_gate", GRAY_SAND_STONE);
    public static final FenceBlock LIGHT_GRAY_CHISELED_SAND_STONE_FENCE = noToolTipFAid("light_gray_chiseled_sand_stone_fence", LIGHT_GRAY_SAND_STONE);
    public static final FenceGateBlock LIGHT_GRAY_CHISELED_SAND_STONE_FENCE_GATE = noToolTipFgAid("light_gray_chiseled_sand_stone_fence_gate", LIGHT_GRAY_SAND_STONE);
    public static final FenceBlock CYAN_CHISELED_SAND_STONE_FENCE = noToolTipFAid("cyan_chiseled_sand_stone_fence", CYAN_SAND_STONE);
    public static final FenceGateBlock CYAN_CHISELED_SAND_STONE_FENCE_GATE = noToolTipFgAid("cyan_chiseled_sand_stone_fence_gate", CYAN_SAND_STONE);
    public static final FenceBlock PURPLE_CHISELED_SAND_STONE_FENCE = noToolTipFAid("purple_chiseled_sand_stone_fence", PURPLE_SAND_STONE);
    public static final FenceGateBlock PURPLE_CHISELED_SAND_STONE_FENCE_GATE = noToolTipFgAid("purple_chiseled_sand_stone_fence_gate", PURPLE_SAND_STONE);
    public static final FenceBlock BLUE_CHISELED_SAND_STONE_FENCE = noToolTipFAid("blue_chiseled_sand_stone_fence", BLUE_SAND_STONE);
    public static final FenceGateBlock BLUE_CHISELED_SAND_STONE_FENCE_GATE = noToolTipFgAid("blue_chiseled_sand_stone_fence_gate", BLUE_SAND_STONE);
    public static final FenceBlock BROWN_CHISELED_SAND_STONE_FENCE = noToolTipFAid("brown_chiseled_sand_stone_fence", BROWN_SAND_STONE);
    public static final FenceGateBlock BROWN_CHISELED_SAND_STONE_FENCE_GATE = noToolTipFgAid("brown_chiseled_sand_stone_fence_gate", BROWN_SAND_STONE);
    public static final FenceBlock GREEN_CHISELED_SAND_STONE_FENCE = noToolTipFAid("green_chiseled_sand_stone_fence", GREEN_SAND_STONE);
    public static final FenceGateBlock GREEN_CHISELED_SAND_STONE_FENCE_GATE = noToolTipFgAid("green_chiseled_sand_stone_fence_gate", GREEN_SAND_STONE);
    public static final FenceBlock RED_CHISELED_SAND_STONE_FENCE = noToolTipFAid("red_chiseled_sand_stone_fence", RED_SANDSTONE);
    public static final FenceGateBlock RED_CHISELED_SAND_STONE_FENCE_GATE = noToolTipFgAid("red_chiseled_sand_stone_fence_gate", RED_SANDSTONE);
    public static final FenceBlock BLACK_CHISELED_SAND_STONE_FENCE = noToolTipFAid("black_chiseled_sand_stone_fence", BLACK_SAND_STONE);
    public static final FenceGateBlock BLACK_CHISELED_SAND_STONE_FENCE_GATE = noToolTipFgAid("black_chiseled_sand_stone_fence_gate", BLACK_SAND_STONE);
    public static final FenceBlock CHISELED_SAND_STONE_FENCE = noToolTipFAid("chiseled_sand_stone_fence", SANDSTONE);
    public static final FenceGateBlock CHISELED_SAND_STONE_FENCE_GATE = noToolTipFgAid("chiseled_sand_stone_fence_gate", SANDSTONE);
    public static final FenceBlock BLOOD_CHISELED_SAND_STONE_FENCE = noToolTipFAid("blood_chiseled_sand_stone_fence", BLOOD_SAND_STONE);
    public static final FenceGateBlock BLOOD_CHISELED_SAND_STONE_FENCE_GATE = noToolTipFgAid("blood_chiseled_sand_stone_fence_gate", BLOOD_SAND_STONE);

    private static FenceBlock noToolTipFAid(String name, Block block) { return fenceBlockAid(name, block, "","", ""); }
    private static FenceGateBlock noToolTipFgAid(String name, Block block) { return fenceGateBlockAid(name, block, "","", ""); }
    @SuppressWarnings("SameParameterValue")
    private static FenceBlock fenceBlockAid(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceBlock) registerBlock(name, new chiseledSandStoneFence(AbstractBlock.Settings.copy(block).sounds(BlockSoundGroup.STONE), NormToolTip, ShiftToolTip, CtrlToolTip));
    }
    @SuppressWarnings("SameParameterValue")
    private static FenceGateBlock fenceGateBlockAid(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceGateBlock) registerBlock(name, new chiseledSandStoneFenceGate(AbstractBlock.Settings.copy(block).sounds(BlockSoundGroup.STONE), NormToolTip, ShiftToolTip, CtrlToolTip));
    }
    public static void registerChiseledSandStoneFences() { Delbase.LOGGER.info("Registering Chiseled SandStone Fences for "+Delbase.Delbase_ID); }
}