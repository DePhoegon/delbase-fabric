package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.fence.chiseledSandStoneFence;
import com.dephoegon.delbase.aid.block.colorshift.fence.chiseledSandStoneFenceGate;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.CUT_SANDSTONE;

public class chiseledSandStoneFences extends baseModBlocks {
    public static FenceBlock WHITE_CHISELED_SAND_STONE_FENCE = noToolTipFAid("white_chiseled_sand_stone_fence");
    public static FenceGateBlock WHITE_CHISELED_SAND_STONE_FENCE_GATE = noToolTipFgAid("white_chiseled_sand_stone_fence_gate");
    public static FenceBlock ORANGE_CHISELED_SAND_STONE_FENCE = noToolTipFAid("orange_chiseled_sand_stone_fence");
    public static FenceGateBlock ORANGE_CHISELED_SAND_STONE_FENCE_GATE = noToolTipFgAid("orange_chiseled_sand_stone_fence_gate");
    private static FenceBlock noToolTipFAid(String name) { return fenceBlockAid(name, "","", ""); }
    private static FenceGateBlock noToolTipFgAid(String name) { return fenceGateBlockAid(name, "","", ""); }
    @SuppressWarnings("SameParameterValue")
    private static FenceBlock fenceBlockAid(String name, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceBlock) registerBlock(name, new chiseledSandStoneFence(FabricBlockSettings.of(Material.STONE, MapColor.PALE_YELLOW).sounds(BlockSoundGroup.STONE), NormToolTip, ShiftToolTip, CtrlToolTip));
    }
    @SuppressWarnings("SameParameterValue")
    private static FenceGateBlock fenceGateBlockAid(String name, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (FenceGateBlock) registerBlock(name, new chiseledSandStoneFenceGate(FabricBlockSettings.copyOf(CUT_SANDSTONE).sounds(BlockSoundGroup.STONE), NormToolTip, ShiftToolTip, CtrlToolTip));
    }
    public void registerChiseledSandStoneFences() { Delbase.LOGGER.info("Registering Chiseled SandStone Fences for "+Delbase.Delbase_ID); }
}
