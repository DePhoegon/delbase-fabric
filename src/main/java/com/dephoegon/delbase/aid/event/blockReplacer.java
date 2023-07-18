package com.dephoegon.delbase.aid.event;

import net.minecraft.block.BlockState;
import net.minecraft.block.ConnectingBlock;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.SlabType;
import net.minecraft.block.enums.StairShape;
import net.minecraft.block.enums.WallShape;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public class blockReplacer {
    public static void WallPlacement(@NotNull World world, BlockPos pos, @NotNull BlockState blockState, @NotNull BlockState defaultReplacementState) {
        boolean up = blockState.get(Properties.UP);
        WallShape east = blockState.get(Properties.EAST_WALL_SHAPE);
        WallShape north = blockState.get(Properties.NORTH_WALL_SHAPE);
        WallShape south = blockState.get(Properties.SOUTH_WALL_SHAPE);
        WallShape west = blockState.get(Properties.WEST_WALL_SHAPE);
        boolean waterlogged = blockState.get(Properties.WATERLOGGED);
        world.setBlockState(pos, defaultReplacementState.with(Properties.WATERLOGGED, waterlogged).with(Properties.WEST_WALL_SHAPE, west).with(Properties.SOUTH_WALL_SHAPE, south).with(Properties.NORTH_WALL_SHAPE, north).with(Properties.EAST_WALL_SHAPE, east).with(Properties.UP, up));
    }
    public static void StairPlacement(@NotNull World world, BlockPos pos, @NotNull BlockState blockState, @NotNull BlockState defaultReplacementState) {
        Direction facing = blockState.get(HorizontalFacingBlock.FACING);
        BlockHalf half = blockState.get(Properties.BLOCK_HALF);
        StairShape shape = blockState.get(Properties.STAIR_SHAPE);
        boolean waterlogged = blockState.get(Properties.WATERLOGGED);
        world.setBlockState(pos, defaultReplacementState.with(Properties.WATERLOGGED, waterlogged).with(Properties.FACING, facing).with(Properties.BLOCK_HALF, half).with(Properties.STAIR_SHAPE, shape));
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
        boolean open = blockState.get(Properties.OPEN);
        boolean powered = blockState.get(Properties.POWERED);
        boolean in_wall = blockState.get(Properties.IN_WALL);
        world.setBlockState(pos, defaultReplacementState.with(Properties.IN_WALL, in_wall).with(Properties.POWERED, powered).with(Properties.OPEN, open));
    }
}
