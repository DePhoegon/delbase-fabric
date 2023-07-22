package com.dephoegon.delbase.aid.block.colorshift.stair;

import com.dephoegon.delbase.aid.block.stock.stairBlock;
import net.minecraft.block.BlockState;
import org.jetbrains.annotations.NotNull;

public class sandStoneStair extends stairBlock {
    public sandStoneStair(BlockState baseBlockState, Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(baseBlockState, settings, normToolTip, shiftToolTip, ctrlToolTip, null);
    }
}
