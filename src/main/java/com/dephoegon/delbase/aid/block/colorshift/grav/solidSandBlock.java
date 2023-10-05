package com.dephoegon.delbase.aid.block.colorshift.grav;

import com.dephoegon.delbase.aid.block.stock.modSandBlock;
import org.jetbrains.annotations.NotNull;

public class solidSandBlock extends modSandBlock {
    public solidSandBlock(int color, Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, boolean falls) {
        super(color, settings, normToolTip, shiftToolTip, ctrlToolTip, null, falls);
    }
}
