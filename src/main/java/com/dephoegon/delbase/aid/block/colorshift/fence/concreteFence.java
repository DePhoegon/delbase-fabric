package com.dephoegon.delbase.aid.block.colorshift.fence;

import com.dephoegon.delbase.aid.block.stock.fenceBlock;
import org.jetbrains.annotations.NotNull;

public class concreteFence extends fenceBlock {
    public concreteFence(Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(settings, normToolTip, shiftToolTip, ctrlToolTip, null);
    }
}
