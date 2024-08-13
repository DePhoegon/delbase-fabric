package com.dephoegon.delbase.aid.block.grav;

import net.minecraft.util.ColorCode;
import org.jetbrains.annotations.NotNull;

public class coloredSolidGravBlock extends coloredGravBlock {
    public coloredSolidGravBlock(ColorCode color, Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(color, settings, normToolTip, shiftToolTip, ctrlToolTip, false);
    }
}