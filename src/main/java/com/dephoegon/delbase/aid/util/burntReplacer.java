package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.aid.event.BlockOnFireCallBack;
import com.dephoegon.delbase.aid.event.blockReplacer;
import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public class burntReplacer implements BlockOnFireCallBack {

    @Override
    public void onBlockOnFire(World world, BlockPos pos, BlockState state) {
        System.out.println("Block destroyed by Fire @ pos " + pos);
    }
    public static void AshBlock(World world, BlockPos blockpos, @NotNull BlockState state) {
        Block block = state.getBlock();
        if (block instanceof PillarBlock) { blockReplacer.AxisPlacement(world, blockpos, state); return; }
        if (block instanceof SlabBlock) { blockReplacer.SlabPlacement(world, blockpos, state); return; }
        if (block instanceof StairsBlock) { blockReplacer.StairPlacement(world, blockpos, state); return; }
        if (block instanceof WallBlock) { blockReplacer.WallPlacement(world, blockpos, state); return; }
        if (block instanceof FenceBlock) { blockReplacer.FencePlacement(world, blockpos, state); return; }
        if (block instanceof FenceGateBlock) { blockReplacer.FenceGatePlacement(world, blockpos, state); return; }
        if (block != null) { blockReplacer.DefaultPlacement(world, blockpos); }
    }
}