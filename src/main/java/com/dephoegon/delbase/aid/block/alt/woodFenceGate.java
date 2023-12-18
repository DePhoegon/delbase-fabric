package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.fenceGateBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.WoodType;
import org.jetbrains.annotations.NotNull;

public class woodFenceGate extends fenceGateBlock {
    public woodFenceGate(Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, FenceGateBlock StrippedFenceGateBlock, WoodType type) {
        super(settings, normToolTip, shiftToolTip, ctrlToolTip, StrippedFenceGateBlock, type);
    }
}
