package com.dephoegon.delbase.aid.block.stock;

import com.dephoegon.delbase.aid.util.blockArrayList;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ColoredFallingBlock;
import net.minecraft.block.FallingBlock;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.FallingBlockEntity;
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
import net.minecraft.util.ColorCode;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static com.dephoegon.delbase.aid.util.kb.HCtrl;
import static com.dephoegon.delbase.aid.util.kb.HShift;
import static net.minecraft.block.Blocks.RED_SAND;
import static net.minecraft.block.Blocks.SAND;

public class modSandBlock extends ColoredFallingBlock {
    private final String tip0;
    private final String tip1;
    private final String tip2;
    private final BlockState strippedState;
    private final boolean fall;
    public modSandBlock(ColorCode color, Settings settings, @NotNull String normToolTip, String shiftToolTip, String ctrlToolTip, FallingBlock StrippedFallingBlock, boolean falls) {
        super(color, settings);
        if(normToolTip.isEmpty()) { tip0 = null; } else { tip0 = normToolTip; }
        if(shiftToolTip.isEmpty()) { tip1 = null; } else { tip1 = shiftToolTip; }
        if(ctrlToolTip.isEmpty()) { tip2 = null; } else { tip2 = ctrlToolTip; }
        strippedState = StrippedFallingBlock != null ? StrippedFallingBlock.getDefaultState() : null;
        fall = falls;
    }
    public boolean getFall() { return fall; }
    protected void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (getFall()) {
            if (gravity(world, pos) && pos.getY() > world.getBottomY()) {
                FallingBlockEntity fallingBlockEntity = FallingBlockEntity.spawnFromBlock(world, pos, state);
                this.configureFallingBlockEntity(fallingBlockEntity);
            }
        }
        if (canFallThrough(world.getBlockState(pos.down())) && pos.getY() >= world.getBottomY()) {
            FallingBlockEntity fallingBlockEntity = FallingBlockEntity.spawnFromBlock(world, pos, state);
            this.configureFallingBlockEntity(fallingBlockEntity);
        }
    }
    private boolean gravity(ServerWorld worldIn, @NotNull BlockPos pos) {
        boolean noFall = spider(pos.up(), worldIn, 0);
        if (noFall) { return false; } else { return canFallThrough(worldIn.getBlockState(pos.down())); }
    }
    private boolean spider(BlockPos pos, @NotNull ServerWorld worldIn, int count) {
        boolean last;
        int l_count = count+1;
        Block bob = worldIn.getBlockState(pos).getBlock();
        if (blockArrayList.checkFallLock(bob)) { last = true; }
        else if (gravMatch(bob) && l_count < 7) { last = spider(pos.up(), worldIn, l_count); }
        else { last = false; }
        return last;
    }
    private boolean gravMatch(@NotNull Block block) { return block.getDefaultState() == SAND.getDefaultState() || block.getDefaultState() == RED_SAND.getDefaultState() || block instanceof modSandBlock; }
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
