package com.dephoegon.delbase.aid.block.colorshift.grav;

import com.dephoegon.delbase.aid.block.stock.modSandBlock;
import net.minecraft.block.FallingBlock;
import org.jetbrains.annotations.NotNull;

public class sandBlock extends modSandBlock {
    public sandBlock(int color, Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, FallingBlock StrippedFallingBlock, boolean falls) {
        super(color, settings, normToolTip, shiftToolTip, ctrlToolTip, StrippedFallingBlock, falls);
    }
}
