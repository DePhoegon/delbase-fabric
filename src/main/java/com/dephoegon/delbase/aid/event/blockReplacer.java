package com.dephoegon.delbase.aid.event;

import net.minecraft.block.BlockState;
import net.minecraft.block.ConnectingBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public class blockReplacer {
    public static void WallPlacement(@NotNull World world, BlockPos pos, @NotNull BlockState blockState, @NotNull BlockState defaultReplacementState) {

    }
    public static void StairPlacement(@NotNull World world, BlockPos pos, @NotNull BlockState blockState, @NotNull BlockState defaultReplacementState) {

    }
    public static void SlabPlacement(@NotNull World world, BlockPos pos, @NotNull BlockState blockState, @NotNull BlockState defaultReplacementState) {
        boolean waterlogged = blockState.get(Properties.WATERLOGGED);
        SlabType type = blockState.get(Properties.SLAB_TYPE);
        world.setBlockState(pos, defaultReplacementState.with(Properties.SLAB_TYPE, type).with(Properties.WATERLOGGED, waterlogged));
    }
    public static void AxisPlacement(@NotNull World world, BlockPos pos, @NotNull BlockState blockState, @NotNull BlockState defaultReplacementState) {
        Direction.Axis axis = blockState.get(Properties.AXIS);
        world.setBlockState(pos, defaultReplacementState.with(Properties.AXIS, axis));
    }
    public static void FencePlacement(@NotNull World world, BlockPos pos, @NotNull BlockState blockState, @NotNull BlockState defaultReplacementState) {
        boolean east = blockState.get(ConnectingBlock.EAST);
        boolean west = blockState.get(ConnectingBlock.WEST);
        boolean north = blockState.get(ConnectingBlock.NORTH);
        boolean south = blockState.get(ConnectingBlock.SOUTH);
        world.setBlockState(pos, defaultReplacementState.with(ConnectingBlock.SOUTH, south).with(ConnectingBlock.NORTH, north).with(ConnectingBlock.EAST, east).with(ConnectingBlock.WEST, west));
    }
    public static void FenceGatePlacement(@NotNull World world, BlockPos pos, @NotNull BlockState blockState, @NotNull BlockState defaultReplacementState) {

    }
}
