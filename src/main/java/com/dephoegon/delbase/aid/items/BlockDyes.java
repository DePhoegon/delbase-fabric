package com.dephoegon.delbase.aid.items;

import com.dephoegon.delbase.aid.block.stock.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.DyeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.dephoegon.delbase.aid.event.typeSelector.*;
import static com.dephoegon.delbase.aid.util.blockArrayList.*;
import static com.dephoegon.delbase.aid.util.kb.HCtrl;
import static com.dephoegon.delbase.aid.util.kb.HShift;

public class BlockDyes extends DyeItem {
    private final String tip0;
    private final String tip1;
    private final String tip2;
    public BlockDyes(DyeColor color, Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(color, settings);
        if(normToolTip.isEmpty()) { tip0 = null; } else { tip0 = normToolTip; }
        if(shiftToolTip.isEmpty()) { tip1 = null; } else { tip1 = shiftToolTip; }
        if(ctrlToolTip.isEmpty()) { tip2 = null; } else { tip2 = ctrlToolTip; }
    }
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);
        if(!(HShift()) && !(HCtrl()) && tip0 != null) { tooltip.add(Text.translatable(tip0)); } //if neither pressed, show tip0 (if not empty)
        if(HCtrl() && tip2 != null) { tooltip.add(Text.translatable(tip2)); }//if ctrl, show tip2 (if not empty), do first
        if(HShift() && tip1 != null) { tooltip.add(Text.translatable(tip1)); } //if shift, show tip1 (if not empty)
    }
    public ActionResult useOnBlock(@NotNull ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockpos = context.getBlockPos();
        Block block = world.getBlockState(blockpos).getBlock();
        BlockState defaultBlockState = block.getDefaultState();
        PlayerEntity player = context.getPlayer();
        assert player != null;
        Item dye_hand = player.getStackInHand(context.getHand()).getItem();
        boolean m_hand_dye = dye_hand.asItem() == player.getMainHandStack().getItem();
        if (m_hand_dye) {
            if (block instanceof axisBlock || getAxis_list().contains(defaultBlockState)) {
                return axis_select(world, blockpos, defaultBlockState, block, player, dye_hand);
            }
            if (block instanceof slabBlock || getSlab_list().contains(defaultBlockState)) {
                return slab_select(world, blockpos, defaultBlockState, block, player, dye_hand);
            }
            if (block instanceof genBlock || getGeneral_list().contains(defaultBlockState)) {
                return gen_select(world, blockpos, defaultBlockState, block, player, dye_hand);
            }
            if (block instanceof modSandBlock || getGravity_list().contains(defaultBlockState)) {
                return grav_select(world, blockpos, defaultBlockState, block, player, dye_hand);
            }
            if (block instanceof stairBlock || getStair_list().contains(defaultBlockState)) {
                return stair_select(world, blockpos, defaultBlockState, block, player, dye_hand);
            }
            if (block instanceof wallBlock || getWall_list().contains(defaultBlockState)) {
                return wall_select(world, blockpos, defaultBlockState, block, player, dye_hand);
            }
            if (block instanceof fenceBlock) {
                return fence_select(world, blockpos, defaultBlockState, block, player, dye_hand);
            }
            if (block instanceof fenceGateBlock) {
                return fenceGate_select(world, blockpos, defaultBlockState, block, player, dye_hand);
            }
        }
        return ActionResult.FAIL;
    }
}
