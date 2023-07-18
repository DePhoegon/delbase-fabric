package com.dephoegon.delbase.mixin;

import com.dephoegon.delbase.aid.event.BlockOnFireCallBack;
import net.minecraft.block.FireBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import static com.dephoegon.delbase.aid.event.modBlockCheck.isModBlock;
import static com.dephoegon.delbase.aid.util.burntReplacer.AshBlock;

@Mixin(FireBlock.class)
public class FireBlockMixin {
    @Redirect(method = "trySpreadingFire", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;removeBlock(Lnet/minecraft/util/math/BlockPos;Z)Z"))
    private boolean onRemoveBlock(World world, BlockPos pos, boolean move) {
        BlockOnFireCallBack.EVENT.invoker().onBlockOnFire(world, pos, world.getBlockState(pos));
        if (isModBlock(world.getBlockState(pos).getBlock())) {
            AshBlock(world, pos, world.getBlockState(pos));
        } else { return world.removeBlock(pos, move); }
        return false;
    }
}