package com.dephoegon.delbase.aid.block.colorshift.stair;

import com.dephoegon.delbase.aid.block.stock.stairBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import org.jetbrains.annotations.NotNull;

public class terracottaStair extends stairBlock {
    public terracottaStair(BlockState baseBlockState, Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, StairsBlock StrippedStairBlock) {
        super(baseBlockState, settings, normToolTip, shiftToolTip, ctrlToolTip, StrippedStairBlock);
    }
}
