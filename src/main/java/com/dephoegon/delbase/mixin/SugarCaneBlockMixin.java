package com.dephoegon.delbase.mixin;

import com.dephoegon.delbase.aid.block.colorshift.slab.sandSlab;
import com.dephoegon.delbase.aid.block.colorshift.slab.sandSlabEnergy;
import com.dephoegon.delbase.aid.block.stock.modSandBlock;
import net.minecraft.block.*;
import net.minecraft.block.enums.SlabType;
import net.minecraft.fluid.FluidState;
import net.minecraft.tag.FluidTags;
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
        Block groundBlock = world.getBlockState(pos.down()).getBlock();
        if (groundBlock instanceof modSandBlock) { modBLock = true; }
        if (groundBlock instanceof sandSlab || groundBlock instanceof sandSlabEnergy) {
            SlabType type = world.getBlockState(pos.down()).get(SlabBlock.TYPE);
            if (type != SlabType.BOTTOM) { modBLock = true; }
        }
        if (modBLock) {
            BlockPos blockPos = pos.down();
            for (Direction direction : Direction.Type.HORIZONTAL) {
                BlockState blockState2 = world.getBlockState(blockPos.offset(direction));
                FluidState fluidState = world.getFluidState(blockPos.offset(direction));
                if (!fluidState.isIn(FluidTags.WATER) && !blockState2.isOf(Blocks.FROSTED_ICE)) continue;
                cir.setReturnValue(true);
            }
        }
    }
}