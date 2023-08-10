package com.dephoegon.delbase.mixin;

import com.dephoegon.delbase.aid.block.colorshift.slab.sandSlab;
import com.dephoegon.delbase.aid.block.colorshift.slab.sandSlabEnergy;
import com.dephoegon.delbase.aid.block.colorshift.stair.sandStair;
import com.dephoegon.delbase.aid.block.colorshift.wall.sandWall;
import com.dephoegon.delbase.aid.block.stock.modSandBlock;
import net.minecraft.block.*;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.SlabType;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DeadBushBlock.class)
public class DeadBushBlockMixin {
    @Inject(method = "canPlantOnTop", at = @At("HEAD"), cancellable = true)
    private void canPlantOnTop(@NotNull BlockState floor, BlockView world, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        // Check if the block is cactus, dead bush, or sugar cane
        Block groundBlock = floor.getBlock();
        if (groundBlock instanceof modSandBlock) { cir.setReturnValue(true); }
        if (groundBlock instanceof sandSlab || groundBlock instanceof sandSlabEnergy) {
            SlabType type = floor.get(SlabBlock.TYPE);
            if (type != SlabType.BOTTOM) { cir.setReturnValue(true); }
        }
        if (groundBlock instanceof sandWall) {
            cir.setReturnValue(floor.get(Properties.UP));
        }
        if (groundBlock instanceof sandStair) {
            BlockHalf half = floor.get(StairsBlock.HALF);
            if (half == BlockHalf.TOP) { cir.setReturnValue(true); }
        }
    }
}