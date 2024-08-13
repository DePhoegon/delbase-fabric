package com.dephoegon.delbase.aid.block.colorshift.grav;

import net.minecraft.block.AbstractBlock;
import net.minecraft.util.ColorCode;
import org.jetbrains.annotations.NotNull;

public class solidSandBlock extends sandBlock {

    public solidSandBlock(ColorCode color, AbstractBlock.Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, boolean falls) {
        super(color, settings, normToolTip, shiftToolTip, ctrlToolTip, null, falls);
    }
}
