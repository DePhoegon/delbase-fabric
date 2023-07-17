package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.aid.block.stock.*;
import com.dephoegon.delbase.aid.event.BlockOnFireCallBack;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ConnectingBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public class burntReplacer implements BlockOnFireCallBack {

    @Override
    public void onBlockOnFire(World world, BlockPos pos, BlockState state) {
        System.out.println("Block is on fire @ pos " + pos);
    }
    public void AshBlock(World world, BlockPos blockpos, BlockState state) {
        Block block = state.getBlock();
        if (block instanceof axisBlock) {

        }
        if (block instanceof slabBlock) {

        }
        if (block instanceof genBlock) {

        }
        if (block instanceof gravBlock) {

        }
        if (block instanceof stairBlock) {

        }
        if (block instanceof wallBlock) {

        }
        if (block instanceof fenceBlock) {
            fenceReplace(world, blockpos, state, null);
        }
        if (block instanceof fenceGateBlock) {

        }
    }
    private static void fenceReplace(@NotNull World world, BlockPos pos, @NotNull BlockState blockState, @NotNull BlockState defaultReplacementState) {
        boolean east = blockState.get(ConnectingBlock.EAST);
        boolean west = blockState.get(ConnectingBlock.WEST);
        boolean north = blockState.get(ConnectingBlock.NORTH);
        boolean south = blockState.get(ConnectingBlock.SOUTH);
        world.setBlockState(pos, defaultReplacementState.with(ConnectingBlock.SOUTH, south).with(ConnectingBlock.NORTH, north).with(ConnectingBlock.EAST, east).with(ConnectingBlock.WEST, west));
    }
}
