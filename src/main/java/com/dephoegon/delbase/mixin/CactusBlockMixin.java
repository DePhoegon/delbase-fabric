package com.dephoegon.delbase.mixin;

import com.dephoegon.delbase.aid.block.colorshift.slab.sandSlab;
import com.dephoegon.delbase.aid.block.colorshift.slab.sandSlabEnergy;
import com.dephoegon.delbase.aid.block.stock.modSandBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CactusBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CactusBlock.class)
public class CactusBlockMixin {
    @Inject(method = "canPlaceAt", at = @At("HEAD"), cancellable = true)
    private void canPlaceAt(@NotNull BlockState state, @NotNull WorldView world, @NotNull BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        // Check if the block is cactus, dead bush, or sugar cane
        Block groundBlock = world.getBlockState(pos.down()).getBlock();
        if (groundBlock instanceof modSandBlock) { cir.setReturnValue(true); }
        if (groundBlock instanceof sandSlab || groundBlock instanceof sandSlabEnergy) {
            SlabType type = world.getBlockState(pos.down()).get(SlabBlock.TYPE);
            if (type != SlabType.BOTTOM) { cir.setReturnValue(true); }
        }
    }
}
