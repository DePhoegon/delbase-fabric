package com.dephoegon.delbase.aid.event;

import net.minecraft.block.*;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.SlabType;
import net.minecraft.block.enums.StairShape;
import net.minecraft.block.enums.WallShape;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.block.general.ashBlocks.*;

public class blockReplacer {
    public static void DefaultPlacement(@NotNull World world, BlockPos pos) { DefaultPlacement(world, pos, ASH_BLOCK.getDefaultState()); }
    public static void DefaultPlacement(@NotNull World world, BlockPos pos, @NotNull BlockState blockState) { world.setBlockState(pos, blockState); }
    public static void WallPlacement(@NotNull World world, BlockPos pos, @NotNull BlockState blockState) { WallPlacement(world, pos, blockState, ASH_WALL.getDefaultState()); }
    public static void WallPlacement(@NotNull World world, BlockPos pos, @NotNull BlockState blockState, @NotNull BlockState defaultReplacementState) {
        if (!(blockState.getBlock() instanceof WallBlock)) { return; }
        boolean up = blockState.get(WallBlock.UP);
        WallShape east = blockState.get(WallBlock.EAST_SHAPE);
        WallShape north = blockState.get(WallBlock.NORTH_SHAPE);
        WallShape south = blockState.get(WallBlock.SOUTH_SHAPE);
        WallShape west = blockState.get(WallBlock.WEST_SHAPE);
        boolean waterlogged = blockState.get(WallBlock.WATERLOGGED);
        world.setBlockState(pos, defaultReplacementState.with(WallBlock.WATERLOGGED, waterlogged).with(WallBlock.WEST_SHAPE, west).with(WallBlock.SOUTH_SHAPE, south).with(WallBlock.NORTH_SHAPE, north).with(WallBlock.EAST_SHAPE, east).with(WallBlock.UP, up));
    }
    public static void StairPlacement(@NotNull World world, BlockPos pos, @NotNull BlockState blockState) { StairPlacement(world, pos, blockState, ASH_STAIR.getDefaultState()); }
    public static void StairPlacement(@NotNull World world, BlockPos pos, @NotNull BlockState blockState, @NotNull BlockState defaultReplacementState) {
        if (!(blockState.getBlock() instanceof StairsBlock)) { return; }
        Direction facing = blockState.get(StairsBlock.FACING);
        BlockHalf half = blockState.get(StairsBlock.HALF);
        StairShape shape = blockState.get(StairsBlock.SHAPE);
        boolean waterlogged = blockState.get(StairsBlock.WATERLOGGED);
        world.setBlockState(pos, defaultReplacementState.with(StairsBlock.WATERLOGGED, waterlogged).with(StairsBlock.FACING, facing).with(StairsBlock.HALF, half).with(StairsBlock.SHAPE, shape));
    }
    public static void SlabPlacement(@NotNull World world, BlockPos pos, @NotNull BlockState blockState) { SlabPlacement(world, pos, blockState, ASH_SLAB.getDefaultState()); }
    public static void SlabPlacement(@NotNull World world, BlockPos pos, @NotNull BlockState blockState, @NotNull BlockState defaultReplacementState) {
        if (!(blockState.getBlock() instanceof SlabBlock)) { return; }
        boolean waterlogged = blockState.get(SlabBlock.WATERLOGGED);
        SlabType type = blockState.get(SlabBlock.TYPE);
        world.setBlockState(pos, defaultReplacementState.with(SlabBlock.TYPE, type).with(SlabBlock.WATERLOGGED, waterlogged));
    }
    public static void AxisPlacement(@NotNull World world, BlockPos pos, @NotNull BlockState blockState) { AxisPlacement(world, pos, blockState, ASH_LOG.getDefaultState()); }
    public static void AxisPlacement(@NotNull World world, BlockPos pos, @NotNull BlockState blockState, @NotNull BlockState defaultReplacementState) {
        if (!(blockState.getBlock() instanceof PillarBlock)) { return; }
        Direction.Axis axis = blockState.get(PillarBlock.AXIS);
        world.setBlockState(pos, defaultReplacementState.with(PillarBlock.AXIS, axis));
    }
    public static void FencePlacement(@NotNull World world, BlockPos pos, @NotNull BlockState blockState) { FencePlacement(world, pos, blockState, ASH_FENCE.getDefaultState()); }
    public static void FencePlacement(@NotNull World world, BlockPos pos, @NotNull BlockState blockState, @NotNull BlockState defaultReplacementState) {
        if (!(blockState.getBlock() instanceof FenceBlock)) { return; }
        boolean east = blockState.get(FenceBlock.EAST);
        boolean west = blockState.get(FenceBlock.WEST);
        boolean north = blockState.get(FenceBlock.NORTH);
        boolean south = blockState.get(FenceBlock.SOUTH);
        world.setBlockState(pos, defaultReplacementState.with(FenceBlock.SOUTH, south).with(FenceBlock.NORTH, north).with(FenceBlock.EAST, east).with(FenceBlock.WEST, west));
    }
    public static void FenceGatePlacement(@NotNull World world, BlockPos pos, @NotNull BlockState blockState) { FenceGatePlacement(world, pos, blockState, ASH_FENCE_GATE.getDefaultState()); }
    public static void FenceGatePlacement(@NotNull World world, BlockPos pos, @NotNull BlockState blockState, @NotNull BlockState defaultReplacementState) {
        if (!(blockState.getBlock() instanceof FenceGateBlock)) { return; }
        boolean open = blockState.get(FenceGateBlock.OPEN);
        boolean powered = blockState.get(FenceGateBlock.POWERED);
        boolean in_wall = blockState.get(FenceGateBlock.IN_WALL);
        world.setBlockState(pos, defaultReplacementState.with(FenceGateBlock.IN_WALL, in_wall).with(FenceGateBlock.POWERED, powered).with(FenceGateBlock.OPEN, open));
    }
}