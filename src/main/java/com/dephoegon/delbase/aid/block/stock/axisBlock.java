package com.dephoegon.delbase.aid.block.stock;

import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static com.dephoegon.delbase.aid.util.kb.HCtrl;
import static com.dephoegon.delbase.aid.util.kb.HShift;

public class axisBlock extends PillarBlock {
    private final String tip0;
    private final String tip1;
    private final String tip2;
    private final BlockState strippedState;
    public axisBlock(Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, PillarBlock StrippedPillarBlock) {
        super(settings);
        if(normToolTip.isEmpty()) { tip0 = null; } else { tip0 = normToolTip; }
        if(shiftToolTip.isEmpty()) { tip1 = null; } else { tip1 = shiftToolTip; }
        if(ctrlToolTip.isEmpty()) { tip2 = null; } else { tip2 = ctrlToolTip; }
        strippedState = StrippedPillarBlock != null ? StrippedPillarBlock.getDefaultState() : null;
    }
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> toolTip, TooltipType type) {
        super.appendTooltip(stack, context, toolTip, type);
        if(!(HShift()) && !(HCtrl()) && tip0 != null) { toolTip.add(Text.translatable(tip0)); } //if neither pressed, show tip0 (if not empty)
        if(HCtrl() && tip2 != null) { toolTip.add(Text.translatable(tip2)); }//if ctrl, show tip2 (if not empty), do first
        if(HShift() && tip1 != null) { toolTip.add(Text.translatable(tip1)); } //if shift, show tip1 (if not empty)
    }
    @Override
    public ItemActionResult onUseWithItem(@NotNull ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (stack.getItem() instanceof AxeItem && strippedState != null && player.getAbilities().allowModifyWorld) {
            if (!world.isClient) {
                world.playSound(player, pos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                world.setBlockState(pos, strippedState);
                EquipmentSlot equipmentSlot = hand == Hand.MAIN_HAND ? EquipmentSlot.MAINHAND : EquipmentSlot.OFFHAND;
                stack.damage(1, (ServerWorld) world, player instanceof ServerPlayerEntity sp ? sp : null, item -> player.sendEquipmentBreakStatus(item, equipmentSlot));
            }
            player.swingHand(hand);
            return ItemActionResult.SUCCESS;
        }
        return super.onUseWithItem(stack, state, world, pos, player, hand, hit);
    }
}
