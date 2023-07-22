package com.dephoegon.delbase.aid.block.grav;

import com.dephoegon.delbase.aid.block.stock.modSandBlock;
import org.jetbrains.annotations.NotNull;

public class nonColoredSolidSandBlock extends modSandBlock {
    public nonColoredSolidSandBlock(int color, Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(color, settings, normToolTip, shiftToolTip, ctrlToolTip, null, false);
    }
}
