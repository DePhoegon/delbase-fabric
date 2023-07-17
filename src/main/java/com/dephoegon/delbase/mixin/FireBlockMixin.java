package com.dephoegon.delbase.mixin;

import com.dephoegon.delbase.aid.event.BlockOnFireCallBack;
import net.minecraft.block.FireBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import static com.dephoegon.delbase.aid.event.modBlockCheck.isModBlock;

@Mixin(FireBlock.class)
public class FireBlockMixin {
    @Redirect(method = "trySpreadingFire", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;removeBlock(Lnet/minecraft/util/math/BlockPos;Z)Z"))
    private boolean onRemoveBlock(World world, BlockPos pos, boolean move) {
        BlockOnFireCallBack.EVENT.invoker().onBlockOnFire(world, pos, world.getBlockState(pos));
        if (isModBlock(world.getBlockState(pos).getBlock())) {

        } else { return world.removeBlock(pos, move); }
        return false;
    }

}
