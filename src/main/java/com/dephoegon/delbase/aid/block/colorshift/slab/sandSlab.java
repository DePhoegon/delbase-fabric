package com.dephoegon.delbase.aid.block.colorshift.slab;

import com.dephoegon.delbase.aid.block.stock.modSlabBlock;
import net.minecraft.block.AbstractBlock;
import org.jetbrains.annotations.NotNull;

public class sandSlab extends modSlabBlock {
    public sandSlab(AbstractBlock.Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(settings, normToolTip, shiftToolTip, ctrlToolTip, null);
    }
}
