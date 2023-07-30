package com.dephoegon.delbase.aid.block.stock;

import com.dephoegon.delbase.aid.event.blockReplacer;
import net.minecraft.block.BlockState;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.dephoegon.delbase.aid.util.kb.HCtrl;
import static com.dephoegon.delbase.aid.util.kb.HShift;

public class fenceGateBlock extends FenceGateBlock {
    private final String tip0;
    private final String tip1;
    private final String tip2;
    private final BlockState strippedState;
    public fenceGateBlock(Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, FenceGateBlock StrippedFenceGateBlock) {
        super(settings);
        if(normToolTip.equals("")) { tip0 = null; } else { tip0 = normToolTip; }
        if(shiftToolTip.equals("")) { tip1 = null; } else { tip1 = shiftToolTip; }
        if(ctrlToolTip.equals("")) { tip2 = null; } else { tip2 = ctrlToolTip; }
        strippedState = StrippedFenceGateBlock != null ? StrippedFenceGateBlock.getDefaultState() : null;
    }
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> toolTip, TooltipContext options) {
        super.appendTooltip(stack, world, toolTip, options);
        if(!(HShift()) && !(HCtrl()) && tip0 != null) { toolTip.add(new TranslatableText(tip0)); } //if neither pressed, show tip0 (if not empty)
        if(HCtrl() && tip2 != null) { toolTip.add(new TranslatableText(tip2)); }//if ctrl, show tip2 (if not empty), do first
        if(HShift() && tip1 != null) { toolTip.add(new TranslatableText(tip1)); } //if shift, show tip1 (if not empty)
    }
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, @NotNull PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack stack = player.getStackInHand(hand);
        if (stack.getItem() instanceof AxeItem && strippedState != null) {
            world.playSound(player, pos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
            if (!world.isClient) {
                blockReplacer.FenceGatePlacement(world, pos, state, strippedState);
                stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
            }
            player.swingHand(hand);
            return ActionResult.SUCCESS;
        }
        return super.onUse(state, world, pos, player, hand, hit);
    }
}