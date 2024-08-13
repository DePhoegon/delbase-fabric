package com.dephoegon.delbase.aid.block.grav;

import com.dephoegon.delbase.aid.block.stock.modColoredFallingBlock;
import net.minecraft.util.ColorCode;
import org.jetbrains.annotations.NotNull;

public class coloredGravBlock extends modColoredFallingBlock {
    public coloredGravBlock(ColorCode color, Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, boolean falls) {
        super(color, settings, normToolTip, shiftToolTip, ctrlToolTip, null, falls);
    }
}