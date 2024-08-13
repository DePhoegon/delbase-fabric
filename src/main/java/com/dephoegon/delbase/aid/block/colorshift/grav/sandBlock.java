package com.dephoegon.delbase.aid.block.colorshift.grav;

import net.minecraft.block.AbstractBlock;
import org.jetbrains.annotations.NotNull;

public class sandBlock extends modSandBlock {
    public sandBlock(int color, AbstractBlock.Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, boolean falls) {
        super(color, settings, normToolTip, shiftToolTip, ctrlToolTip, null, falls);
    }
}
