package com.dephoegon.delbase.aid.block.colorshift.fence;

import com.dephoegon.delbase.aid.block.stock.fenceGateBlock;
import net.minecraft.block.FenceGateBlock;
import org.jetbrains.annotations.NotNull;

public class concreteFenceBlock extends fenceGateBlock {
    public concreteFenceBlock(Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, FenceGateBlock StrippedFenceGateBlock) {
        super(settings, normToolTip, shiftToolTip, ctrlToolTip, StrippedFenceGateBlock);
    }
}
