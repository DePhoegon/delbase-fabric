package com.dephoegon.delbase.aid.block.stock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SlabBlock;
import org.jetbrains.annotations.NotNull;

public class energySlab extends modSlabBlock {
    public energySlab(AbstractBlock.Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, SlabBlock StrippedSlabBlock) {
        super(settings, normToolTip, shiftToolTip, ctrlToolTip, StrippedSlabBlock);
    }
}
