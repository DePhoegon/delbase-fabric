package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.wallBlock;
import net.minecraft.block.WallBlock;
import org.jetbrains.annotations.NotNull;

public class quartzWall extends wallBlock {
    public quartzWall(Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, WallBlock StrippedWallBlock) {
        super(settings, normToolTip, shiftToolTip, ctrlToolTip, StrippedWallBlock);
    }
}
