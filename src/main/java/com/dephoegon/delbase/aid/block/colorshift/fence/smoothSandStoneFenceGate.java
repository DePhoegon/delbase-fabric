package com.dephoegon.delbase.aid.block.colorshift.fence;

import com.dephoegon.delbase.aid.block.stock.modFenceGate;
import com.dephoegon.delbase.aid.block.stock.modSlabBlock;
import net.minecraft.block.WoodType;
import org.jetbrains.annotations.NotNull;

public class smoothSandStoneFenceGate extends modFenceGate {
    public smoothSandStoneFenceGate(Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(settings, normToolTip, shiftToolTip, ctrlToolTip, null, WoodType.DARK_OAK);
    }
}
