package com.dephoegon.delbase.aid.event;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class typeSelector {
    public static ActionResult axis_select(World world, BlockPos pos, BlockState defaultState, Block block, PlayerEntity player, Item inHand) {
        /*
        int blockIndex = 4;
        if (block instanceof cutSandStone || state == CUT_SANDSTONE.defaultBlockState() || state == CUT_RED_SANDSTONE.defaultBlockState()) {
            return ColorLogic(world, blockPos, state, CUT_SANDSTONE.defaultBlockState(), CUT_RED_SANDSTONE.defaultBlockState(), BLOOD_CUT_SAND_STONE.get().defaultBlockState(), WHITE_CUT_SAND_STONE.get().defaultBlockState(), ORANGE_CUT_SAND_STONE.get().defaultBlockState(), MAGENTA_CUT_SAND_STONE.get().defaultBlockState(), LIGHT_BLUE_CUT_SAND_STONE.get().defaultBlockState(), YELLOW_CUT_SAND_STONE.get().defaultBlockState(), LIME_CUT_SAND_STONE.get().defaultBlockState(), PINK_CUT_SAND_STONE.get().defaultBlockState(), GRAY_CUT_SAND_STONE.get().defaultBlockState(), LIGHT_GRAY_CUT_SAND_STONE.get().defaultBlockState(), CYAN_CUT_SAND_STONE.get().defaultBlockState(), PURPLE_CUT_SAND_STONE.get().defaultBlockState(), BLUE_CUT_SAND_STONE.get().defaultBlockState(), GREEN_CUT_SAND_STONE.get().defaultBlockState(), BROWN_CUT_SAND_STONE.get().defaultBlockState(), BLACK_CUT_SAND_STONE.get().defaultBlockState(), blockIndex, inHand, playerEntity);
        }
         */
        return ActionResult.FAIL;
    }
    public static ActionResult slab_select(World world, BlockPos pos, BlockState defaultState, Block block, PlayerEntity player, Item inHand) { return ActionResult.FAIL; }
    public static ActionResult gen_select(World world, BlockPos pos, BlockState defaultState, Block block, PlayerEntity player, Item inHand) { return ActionResult.FAIL; }
    public static ActionResult stair_select(World world, BlockPos pos, BlockState defaultState, Block block, PlayerEntity player, Item inHand) { return ActionResult.FAIL; }
    public static ActionResult wall_select(World world, BlockPos pos, BlockState defaultState, Block block, PlayerEntity player, Item inHand) { return ActionResult.FAIL; }
    public static ActionResult fence_select(World world, BlockPos pos, BlockState defaultState, Block block, PlayerEntity player, Item inHand) { return ActionResult.FAIL; }
    public static ActionResult fenceGate_select(World world, BlockPos pos, BlockState defaultState, Block block, PlayerEntity player, Item inHand) { return ActionResult.FAIL; }
    public static ActionResult grav_select(World world, BlockPos pos, BlockState defaultState, Block block, PlayerEntity player, Item inHand) { return ActionResult.FAIL; }
}
