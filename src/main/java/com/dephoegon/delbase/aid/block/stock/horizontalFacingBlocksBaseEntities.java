package com.dephoegon.delbase.aid.block.stock;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.math.BlockPos;

import static net.minecraft.state.property.Properties.HORIZONTAL_FACING;

public class horizontalFacingBlocksBaseEntities extends BlockEntity {
    public static final DirectionProperty FACING = HORIZONTAL_FACING;
    private final String tip0;
    private final String tip1;
    private final String tip2;
    private final boolean flame;
    public horizontalFacingBlocksBaseEntities(BlockEntityType<?> type, BlockPos pos, BlockState state, String normToolTip, String shiftToolTip, String ctrlToolTip, boolean flames) {
        super(type, pos, state);
        if(normToolTip.equals("")) { tip0 = null; } else { tip0 = normToolTip; }
        if(shiftToolTip.equals("")) { tip1 = null; } else { tip1 = shiftToolTip; }
        if(ctrlToolTip.equals("")) { tip2 = null; } else { tip2 = ctrlToolTip; }
        flame = flames;
    }
}
