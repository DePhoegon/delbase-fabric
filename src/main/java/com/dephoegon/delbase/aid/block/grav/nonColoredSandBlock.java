package com.dephoegon.delbase.aid.block.grav;

import com.dephoegon.delbase.aid.block.stock.modSandBlock;
import org.jetbrains.annotations.NotNull;

public class nonColoredSandBlock extends modSandBlock {
    public nonColoredSandBlock(int color, Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, boolean falls) {
        super(color, settings, normToolTip, shiftToolTip, ctrlToolTip, null, falls);
    }
}
