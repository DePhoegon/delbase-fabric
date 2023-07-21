package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.fenceBlock;
import net.minecraft.block.FenceBlock;
import org.jetbrains.annotations.NotNull;

public class quartzFence extends fenceBlock {
    public quartzFence(Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, FenceBlock StrippedFenceBlock) {
        super(settings, normToolTip, shiftToolTip, ctrlToolTip, StrippedFenceBlock);
    }
}
