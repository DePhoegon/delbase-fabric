package com.dephoegon.delbase.aid.block.colorshift.wall;

import com.dephoegon.delbase.aid.block.stock.wallBlock;
import org.jetbrains.annotations.NotNull;

public class concreteWall extends wallBlock {
    public concreteWall(Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(settings, normToolTip, shiftToolTip, ctrlToolTip, null);
    }
}
