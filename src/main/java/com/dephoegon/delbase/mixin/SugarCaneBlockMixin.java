package com.dephoegon.delbase.mixin;

import com.dephoegon.delbase.aid.block.colorshift.grav.sandBlock;
import com.dephoegon.delbase.aid.block.colorshift.grav.solidSandBlock;
import com.dephoegon.delbase.aid.block.colorshift.slab.sandSlab;
import com.dephoegon.delbase.aid.block.colorshift.slab.sandSlabEnergy;
import com.dephoegon.delbase.aid.block.colorshift.stair.sandStair;
import net.minecraft.block.*;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.SlabType;
import net.minecraft.fluid.FluidState;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SugarCaneBlock.class)
public class SugarCaneBlockMixin {
    @Inject(method = "canPlaceAt", at = @At("HEAD"), cancellable = true)
    private void canPlaceAt(@NotNull BlockState state, @NotNull WorldView world, @NotNull BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        boolean modBLock = false;
        boolean waterLoggable = false;
        Block groundBlock = world.getBlockState(pos.down()).getBlock();
        if (groundBlock instanceof sandBlock || groundBlock instanceof solidSandBlock) { modBLock = true; }
        if (groundBlock instanceof sandSlab || groundBlock instanceof sandSlabEnergy) {
            SlabType type = world.getBlockState(pos.down()).get(SlabBlock.TYPE);
            if (type != SlabType.BOTTOM) { modBLock = true; waterLoggable = type != SlabType.DOUBLE;}
        }
        if (groundBlock instanceof sandStair) {
            BlockHalf half = world.getBlockState(pos.down()).get(StairsBlock.HALF);
            if (half == BlockHalf.TOP) { modBLock = true; waterLoggable = true;}
        }
        if (modBLock) {
            BlockPos blockPos = pos.down();
            for (Direction direction : Direction.Type.HORIZONTAL) {
                BlockState blockState2 = world.getBlockState(blockPos.offset(direction));
                FluidState fluidState = world.getFluidState(blockPos.offset(direction));
                boolean waterLogged = waterLoggable ? world.getBlockState(blockPos).get(Properties.WATERLOGGED) : false;
                if (!fluidState.isIn(FluidTags.WATER) && !blockState2.isOf(Blocks.FROSTED_ICE) && !waterLogged) continue;
                cir.setReturnValue(true);
            }
        }
    }
}