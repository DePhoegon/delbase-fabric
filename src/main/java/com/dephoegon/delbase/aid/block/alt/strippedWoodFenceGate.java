package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.modFenceGate;
import net.minecraft.block.WoodType;
import org.jetbrains.annotations.NotNull;

public class strippedWoodFenceGate extends modFenceGate {
    public strippedWoodFenceGate(Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, WoodType type) {
        super(settings, normToolTip, shiftToolTip, ctrlToolTip, null, type);
    }
}
