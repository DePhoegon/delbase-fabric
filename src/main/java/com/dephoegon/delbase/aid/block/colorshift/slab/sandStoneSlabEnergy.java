package com.dephoegon.delbase.aid.block.colorshift.slab;

import com.dephoegon.delbase.aid.block.stock.energySlab;
import net.minecraft.block.AbstractBlock;
import org.jetbrains.annotations.NotNull;

public class sandStoneSlabEnergy extends energySlab {
    public sandStoneSlabEnergy(AbstractBlock.Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(settings, normToolTip, shiftToolTip, ctrlToolTip, null);
    }
}
