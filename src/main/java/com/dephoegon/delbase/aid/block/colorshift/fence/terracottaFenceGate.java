package com.dephoegon.delbase.aid.block.colorshift.fence;

import com.dephoegon.delbase.aid.block.stock.fenceGateBlock;
import net.minecraft.block.WoodType;
import org.jetbrains.annotations.NotNull;

public class terracottaFenceGate extends fenceGateBlock {
    public terracottaFenceGate(Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(settings, normToolTip, shiftToolTip, ctrlToolTip, null, WoodType.DARK_OAK);
    }
}
