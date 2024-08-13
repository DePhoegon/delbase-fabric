package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.fenceGateBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.WoodType;
import org.jetbrains.annotations.NotNull;

public class quartzFenceGate extends fenceGateBlock {
    public quartzFenceGate(AbstractBlock.Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(settings, normToolTip, shiftToolTip, ctrlToolTip, null, WoodType.ACACIA);
    }
}
