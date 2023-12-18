package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.fenceGateBlock;
import net.minecraft.block.WoodType;
import org.jetbrains.annotations.NotNull;

public class strippedWoodFenceGate extends fenceGateBlock {
    public strippedWoodFenceGate(Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, WoodType type) {
        super(settings, normToolTip, shiftToolTip, ctrlToolTip, null, type);
    }
}
