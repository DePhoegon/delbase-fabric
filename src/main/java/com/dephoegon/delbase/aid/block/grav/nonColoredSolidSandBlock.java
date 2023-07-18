package com.dephoegon.delbase.aid.block.grav;

import com.dephoegon.delbase.aid.block.stock.modSandBlock;
import net.minecraft.block.FallingBlock;
import org.jetbrains.annotations.NotNull;

public class nonColoredSolidSandBlock extends modSandBlock {
    public nonColoredSolidSandBlock(int color, Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, FallingBlock StrippedFallingBlock) {
        super(color, settings, normToolTip, shiftToolTip, ctrlToolTip, StrippedFallingBlock, false);
    }
}
