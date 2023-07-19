package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.aid.block.stock.*;
import com.dephoegon.delbase.aid.event.BlockOnFireCallBack;
import com.dephoegon.delbase.aid.event.blockReplacer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.block.general.ashBlocks.*;

public class burntReplacer implements BlockOnFireCallBack {

    @Override
    public void onBlockOnFire(World world, BlockPos pos, BlockState state) {
        System.out.println("Block destroyed by Fire @ pos " + pos);
    }
    public static void AshBlock(World world, BlockPos blockpos, @NotNull BlockState state) {
        Block block = state.getBlock();
        if (block instanceof axisBlock) { blockReplacer.AxisPlacement(world, blockpos, state, ASH_LOG.getDefaultState()); }
        if (block instanceof slabBlock) { blockReplacer.SlabPlacement(world, blockpos, state, ASH_SLAB.getDefaultState()); }
        if (block instanceof genBlock) { world.setBlockState(blockpos, ASH_BLOCK.getDefaultState()); }
        if (block instanceof modSandBlock) { world.setBlockState(blockpos, ASH_BLOCK.getDefaultState()); }
        if (block instanceof stairBlock) { blockReplacer.StairPlacement(world, blockpos, state, ASH_STAIR.getDefaultState()); }
        if (block instanceof wallBlock) { blockReplacer.WallPlacement(world, blockpos, state, ASH_WALL.getDefaultState()); }
        if (block instanceof fenceBlock) { blockReplacer.FencePlacement(world, blockpos, state, ASH_FENCE.getDefaultState()); }
        if (block instanceof fenceGateBlock) { blockReplacer.FenceGatePlacement(world, blockpos, state, ASH_FENCE_BLOCK.getDefaultState()); }
    }
}
