package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.aid.event.blockReplacer;
import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

import static com.dephoegon.delbase.aid.util.blockArrayList.getVanilla_wood_list;
import static com.dephoegon.delbase.block.general.ashBlocks.ASH_BLOCK;
import static com.dephoegon.delbase.block.general.ashBlocks.ASH_LOG;

public class burntReplacer  {
    public static boolean threshHold(int cap, int thresh) { return randomNum(cap) > thresh; }
    public static void AshBlock(World world, BlockPos blockpos, @NotNull BlockState state) {
        Block block = state.getBlock();
        if (block instanceof PillarBlock) {
            BlockState blockState = getVanilla_wood_list().contains(block.getDefaultState()) ? ASH_BLOCK.getDefaultState() : ASH_LOG.getDefaultState();
            blockReplacer.AxisPlacement(world, blockpos, state, blockState);
            return;
        }
        if (block instanceof SlabBlock) { blockReplacer.SlabPlacement(world, blockpos, state); return; }
        if (block instanceof StairsBlock) { blockReplacer.StairPlacement(world, blockpos, state); return; }
        if (block instanceof WallBlock) { blockReplacer.WallPlacement(world, blockpos, state); return; }
        if (block instanceof FenceBlock) { blockReplacer.FencePlacement(world, blockpos, state); return; }
        if (block instanceof FenceGateBlock) { blockReplacer.FenceGatePlacement(world, blockpos, state); return; }
        if (block != null) { blockReplacer.DefaultPlacement(world, blockpos); }
    }
    private static int randomNum(int max){
        Random random = new Random();
        return random.nextInt(max)+1;
    }
}