package com.dephoegon.delbase.aid.block.alt;

import com.dephoegon.delbase.aid.block.stock.stairBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import org.jetbrains.annotations.NotNull;

public class quartzStair extends stairBlock {
    public quartzStair(BlockState baseBlockState, Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, StairsBlock StrippedStairBlock) {
        super(baseBlockState, settings, normToolTip, shiftToolTip, ctrlToolTip, StrippedStairBlock);
    }
}
