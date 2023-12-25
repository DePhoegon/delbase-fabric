package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.aid.event.blockReplacer;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.aid.util.dyeList.*;
import static com.dephoegon.delbase.item.ShiftingDyes.*;

public class colorMixInteractions {
    @SuppressWarnings("DataFlowIssue")
    public static ActionResult ColorLogic(World world, BlockPos blockPos, BlockState TargetBlock, BlockState BaseDefaultBlock, BlockState RedBaseDefaultBlock, BlockState DarkRedDefaultBlock, BlockState WhiteDefaultBlock, BlockState OrangeDefaultBlock, BlockState MagentaDefaultBlock, BlockState LightBlueDefaultBlock, BlockState YellowDefaultBlock, BlockState LimeDefaultBlock, BlockState PinkDefaultBlock, BlockState GrayDefaultBlock, BlockState LightGrayDefaultBlock, BlockState CyanDefaultBlock, BlockState PurpleDefaultBlock, BlockState BlueDefaultBlock, BlockState GreenDefaultBlock, BlockState BrownDefaultBlock, BlockState BlackDefaultBlock, int DefaultBlockIndex, @NotNull Item inHand, PlayerEntity playerEntity) {
        BlockState place_me = null;
        boolean place = false;
        boolean lock_cut = false;
        if (inHand.equals(cleanse.getItem()) && BaseDefaultBlock != null) {
            if (TargetBlock != BaseDefaultBlock && BaseDefaultBlock != null) {
                place = true;
            }
            if (TargetBlock == RedBaseDefaultBlock && RedBaseDefaultBlock != null) {
                playerEntity.giveItemStack(new ItemStack(RED_SHIFT_DYE.asItem()));
            }
            if (TargetBlock == DarkRedDefaultBlock && DarkRedDefaultBlock != null) {
                playerEntity.giveItemStack(new ItemStack(BLOOD_SHIFT_DYE.asItem()));
            }
            if (TargetBlock == WhiteDefaultBlock && WhiteDefaultBlock != null) {
                playerEntity.giveItemStack(new ItemStack(WHITE_SHIFT_DYE.asItem()));
            }
            if (TargetBlock == OrangeDefaultBlock && OrangeDefaultBlock != null) {
                playerEntity.giveItemStack(new ItemStack(ORANGE_SHIFT_DYE.asItem()));
            }
            if (TargetBlock == MagentaDefaultBlock && MagentaDefaultBlock != null) {
                playerEntity.giveItemStack(new ItemStack(MAGENTA_SHIFT_DYE.asItem()));
            }
            if (TargetBlock == LightBlueDefaultBlock && LightBlueDefaultBlock != null) {
                playerEntity.giveItemStack(new ItemStack(LIGHT_BLUE_SHIFT_DYE.asItem()));
            }
            if (TargetBlock == YellowDefaultBlock && YellowDefaultBlock != null) {
                playerEntity.giveItemStack(new ItemStack(YELLOW_SHIFT_DYE.asItem()));
            }
            if (TargetBlock == LimeDefaultBlock && LimeDefaultBlock != null) {
                playerEntity.giveItemStack(new ItemStack(LIME_SHIFT_DYE.asItem()));
            }
            if (TargetBlock == PinkDefaultBlock && PinkDefaultBlock != null) {
                playerEntity.giveItemStack(new ItemStack(PINK_SHIFT_DYE.asItem()));
            }
            if (TargetBlock == GrayDefaultBlock && GrayDefaultBlock != null) {
                playerEntity.giveItemStack(new ItemStack(GRAY_SHIFT_DYE.asItem()));
            }
            if (TargetBlock == LightGrayDefaultBlock && LightGrayDefaultBlock != null) {
                playerEntity.giveItemStack(new ItemStack(LIGHT_GRAY_SHIFT_DYE.asItem()));
            }
            if (TargetBlock == CyanDefaultBlock && CyanDefaultBlock != null) {
                playerEntity.giveItemStack(new ItemStack(CYAN_SHIFT_DYE.asItem()));
            }
            if (TargetBlock == PurpleDefaultBlock && PurpleDefaultBlock != null) {
                playerEntity.giveItemStack(new ItemStack(PURPLE_SHIFT_DYE.asItem()));
            }
            if (TargetBlock == BlueDefaultBlock && BlueDefaultBlock != null) {
                playerEntity.giveItemStack(new ItemStack(BLUE_SHIFT_DYE.asItem()));
            }
            if (TargetBlock == GreenDefaultBlock && GreenDefaultBlock != null) {
                playerEntity.giveItemStack(new ItemStack(GREEN_SHIFT_DYE.asItem()));
            }
            if (TargetBlock == BrownDefaultBlock && BrownDefaultBlock != null) {
                playerEntity.giveItemStack(new ItemStack(BROWN_SHIFT_DYE.asItem()));
            }
            if (TargetBlock == BlackDefaultBlock && BlackDefaultBlock != null) {
                playerEntity.giveItemStack(new ItemStack(BLACK_SHIFT_DYE.asItem()));
            }
            if (place) {
                place_me = BaseDefaultBlock;
                lock_cut = true;
            }
        }
        if (inHand.equals(red.getItem())) {
            if (RedBaseDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && DarkRedDefaultBlock != null) {
                playerEntity.giveItemStack(new ItemStack(CLEANSE_SHIFT_DYE.asItem()));
                place_me = DarkRedDefaultBlock;
                lock_cut = true;
                place = true;
            }
            if (TargetBlock == YellowDefaultBlock && OrangeDefaultBlock != null) {
                place_me = OrangeDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(ORANGE_SHIFT_DYE.asItem()));
                place = true;
            }
            if (TargetBlock == BlueDefaultBlock && PurpleDefaultBlock != null) {
                place_me = PurpleDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(PURPLE_SHIFT_DYE.asItem()));
                place = true;
            }
            if (TargetBlock == WhiteDefaultBlock && PinkDefaultBlock != null) {
                place_me = PinkDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(PINK_SHIFT_DYE.asItem()));
                place = true;
            }
            if (TargetBlock == DarkRedDefaultBlock && RedBaseDefaultBlock != null) {
                place_me = RedBaseDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(RED_SHIFT_DYE.asItem()));
                place = true;
                lock_cut = true;
            }
            if (place && place_me == null) {
                place_me = RedBaseDefaultBlock;
                lock_cut = true;
                playerEntity.giveItemStack(new ItemStack(CLEANSE_SHIFT_DYE.asItem()));
            }
        }
        if (inHand.equals(blood.getItem())) {
            if (TargetBlock != DarkRedDefaultBlock && DarkRedDefaultBlock != null) { place = true; }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == RedBaseDefaultBlock && DarkRedDefaultBlock != null) {
                lock_cut = true;
                playerEntity.giveItemStack(new ItemStack(RED_SHIFT_DYE.asItem()));
                place_me = DarkRedDefaultBlock;
                place = true;
            }
            if (TargetBlock == YellowDefaultBlock && OrangeDefaultBlock != null) {
                place_me = OrangeDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(RED_SHIFT_DYE.asItem()));
                place = true;
            }
            if (TargetBlock == BlueDefaultBlock && PurpleDefaultBlock != null) {
                place_me = PurpleDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(RED_SHIFT_DYE.asItem()));
                place = true;
            }
            if (TargetBlock == WhiteDefaultBlock && PinkDefaultBlock != null) {
                place_me = PinkDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(RED_SHIFT_DYE.asItem()));
                place = true;
            }
            if (place_me == null && place) {
                place_me = DarkRedDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(CLEANSE_SHIFT_DYE.asItem()));
            }
        }
        if (inHand.equals(white.getItem())) {
            if (TargetBlock != WhiteDefaultBlock && WhiteDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && PinkDefaultBlock != null) {
                lock_cut = true;
                place_me = PinkDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(PINK_SHIFT_DYE.asItem()));
                place = true;
            }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == DarkRedDefaultBlock && PinkDefaultBlock != null) {
                place_me = PinkDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(PINK_SHIFT_DYE.asItem()));
                place = true;
            }
            if (TargetBlock == GreenDefaultBlock && LimeDefaultBlock != null) {
                place_me = LimeDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(LIME_SHIFT_DYE.asItem()));
                place = true;
            }
            if (TargetBlock == BlueDefaultBlock && LightBlueDefaultBlock != null) {
                place_me = LightBlueDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(LIGHT_BLUE_SHIFT_DYE.asItem()));
                place = true;
            }
            if (TargetBlock == BlackDefaultBlock && GrayDefaultBlock != null) {
                place_me = GrayDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(GRAY_SHIFT_DYE.asItem()));
                place = true;
            }
            if (TargetBlock == GrayDefaultBlock && LightGrayDefaultBlock != null) {
                place_me = LightGrayDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(LIGHT_GRAY_SHIFT_DYE.asItem()));
                place = true;
            }
            if (place && place_me == null) {
                place_me = WhiteDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(CLEANSE_SHIFT_DYE.asItem()));
            }
        }
        if (inHand.equals(orange.getItem())) {
            if (TargetBlock != OrangeDefaultBlock && OrangeDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (place) {
                place_me = OrangeDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(CLEANSE_SHIFT_DYE.asItem()));
            }
        }
        if (inHand.equals(magenta.getItem())) {
            if (TargetBlock != MagentaDefaultBlock && MagentaDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (place) {
                place_me = MagentaDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(CLEANSE_SHIFT_DYE.asItem()));
            }
        }
        if (inHand.equals(light_blue.getItem())) {
            if (TargetBlock != LightBlueDefaultBlock && LightBlueDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (place) {
                place_me = LightBlueDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(CLEANSE_SHIFT_DYE.asItem()));
            }
        }
        if (inHand.equals(yellow.getItem())) {
            if (TargetBlock != YellowDefaultBlock && YellowDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && OrangeDefaultBlock != null) {
                lock_cut = true;
                place_me = OrangeDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(ORANGE_SHIFT_DYE.asItem()));
                place = true;
            }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == DarkRedDefaultBlock && OrangeDefaultBlock != null) {
                place_me = OrangeDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(RED_SHIFT_DYE.asItem()));
                place = true;
            }
            if (place && place_me == null) {
                place_me = YellowDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(CLEANSE_SHIFT_DYE.asItem()));
            }
        }
        if (inHand.equals(lime.getItem())) {
            if (TargetBlock != LimeDefaultBlock && LimeDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (place) {
                place_me = LimeDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(CLEANSE_SHIFT_DYE.asItem()));
            }
        }
        if (inHand.equals(pink.getItem())) {
            if (TargetBlock != PinkDefaultBlock && PinkDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == PurpleDefaultBlock && MagentaDefaultBlock != null) {
                place_me = MagentaDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(MAGENTA_SHIFT_DYE.asItem()));
                place = true;
            }
            if (TargetBlock == BlackDefaultBlock && RedBaseDefaultBlock != null) {
                place_me = RedBaseDefaultBlock;
                lock_cut = true;
                playerEntity.giveItemStack(new ItemStack(RED_SHIFT_DYE.asItem()));
                place = true;
            }
            if (place && place_me == null) {
                place_me = PinkDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(CLEANSE_SHIFT_DYE.asItem()));
            }
        }
        if (inHand.equals(gray.getItem())) {
            if (TargetBlock != GrayDefaultBlock && GrayDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == WhiteDefaultBlock && LightGrayDefaultBlock != null) {
                place_me = LightGrayDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(LIGHT_GRAY_SHIFT_DYE.asItem()));
                place = true;
            }
            if (place && place_me == null) {
                place_me = GrayDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(CLEANSE_SHIFT_DYE.asItem()));
            }
        }
        if (inHand.equals(light_gray.getItem())) {
            if (TargetBlock != LightGrayDefaultBlock && LightGrayDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == BlackDefaultBlock && GrayDefaultBlock != null) {
                place_me = GrayDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(GRAY_SHIFT_DYE.asItem()));
                place = true;
            }
            if (place && place_me == null) {
                place_me = LightGrayDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(CLEANSE_SHIFT_DYE.asItem()));
            }
        }
        if (inHand.equals(cyan.getItem())) {
            if (TargetBlock != CyanDefaultBlock && CyanDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (place) {
                place_me = CyanDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(CLEANSE_SHIFT_DYE.asItem()));
            }
        }
        if (inHand.equals(purple.getItem())) {
            if (TargetBlock != PurpleDefaultBlock && PurpleDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == PinkDefaultBlock && MagentaDefaultBlock != null) {
                place_me = MagentaDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(MAGENTA_SHIFT_DYE.asItem()));
                place = true;
            }
            if (place && place_me == null) {
                place_me = PurpleDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(CLEANSE_SHIFT_DYE.asItem()));
            }
        }
        if (inHand.equals(blue.getItem())) {
            if (TargetBlock != BlueDefaultBlock && BlueDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && PurpleDefaultBlock != null) {
                lock_cut = true;
                place_me = PurpleDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(PURPLE_SHIFT_DYE.asItem()));
                place = true;
            }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == GreenDefaultBlock && CyanDefaultBlock != null) {
                place_me = CyanDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(CYAN_SHIFT_DYE.asItem()));
                place = true;
            }
            if (TargetBlock == WhiteDefaultBlock && LightBlueDefaultBlock != null) {
                place_me = LightBlueDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(LIGHT_BLUE_SHIFT_DYE.asItem()));
                place = true;
            }
            if (place && place_me == null) {
                place_me = BlueDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(CLEANSE_SHIFT_DYE.asItem()));
            }

        }
        if (inHand.equals(green.getItem())) {
            if (TargetBlock != GrayDefaultBlock && GrayDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == WhiteDefaultBlock && LimeDefaultBlock != null) {
                place_me = LimeDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(LIME_SHIFT_DYE.asItem()));
                place = true;
            }
            if (TargetBlock == BlueDefaultBlock && PurpleDefaultBlock != null) {
                place_me = PurpleDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(PURPLE_SHIFT_DYE.asItem()));
                place = true;
            }
            if (place && place_me == null) {
                place_me = GreenDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(CLEANSE_SHIFT_DYE.asItem()));
            }
        }
        if (inHand.equals(brown.getItem())) {
            if (TargetBlock != BrownDefaultBlock && BrownDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (place) {
                place_me = BrownDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(CLEANSE_SHIFT_DYE.asItem()));
            }
        }
        if (inHand.equals(black.getItem())) {
            if (TargetBlock != BlackDefaultBlock && BlackDefaultBlock != null) { place = true; }
            if (TargetBlock == RedBaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == BaseDefaultBlock && BaseDefaultBlock != null) { lock_cut = true; }
            if (TargetBlock == LightGrayDefaultBlock && GrayDefaultBlock != null) {
                place_me = GrayDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(GRAY_SHIFT_DYE.asItem()));
                place = true;
            }
            if (TargetBlock == LightBlueDefaultBlock && BlueDefaultBlock != null) {
                place_me = BlueDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(BLUE_SHIFT_DYE.asItem()));
                place = true;
            }
            if (TargetBlock == LimeDefaultBlock && GreenDefaultBlock != null) {
                place_me = GreenDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(GREEN_SHIFT_DYE.asItem()));
                place = true;
            }
            if (TargetBlock == PinkDefaultBlock && RedBaseDefaultBlock != null) {
                place_me = RedBaseDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(RED_SHIFT_DYE.asItem()));
                lock_cut = true;
                place = true;
            }
            if (place && place_me == null) {
                place_me = BlackDefaultBlock;
                playerEntity.giveItemStack(new ItemStack(CLEANSE_SHIFT_DYE.asItem()));
            }
        }
        if (place) {
            BlockState blockState = world.getBlockState(blockPos);
            switch (DefaultBlockIndex) {
                case 1 ->
                    //walls
                        blockReplacer.WallPlacement(world, blockPos, blockState, place_me);
                case 2 ->
                    //Stairs
                        blockReplacer.StairPlacement(world, blockPos, blockState, place_me);
                case 3 ->
                    //Slabs
                        blockReplacer.SlabPlacement(world, blockPos, blockState, place_me);
                case 4 ->
                    //Axis, lock_cut used to mix 'non-axis' default blocks with axis blocks in the set or use (cut_sandstone // cut_red_sandstone) as example
                    //Is triggered only one base block & red block, (foolish method) possible to rework stack to allow cutLocking on any... but no reason to atm
                        blockReplacer.AxisPlacement(world, blockPos, blockState, place_me, lock_cut);
                case 5 ->
                    //DefaultBocks with no special placements
                    //AxisPlacement set to do default states on which suits default blocks
                        blockReplacer.AxisPlacement(world, blockPos, blockState, place_me, true);
                case 6 ->
                    //Fence Blocks
                        blockReplacer.FencePlacement(world, blockPos, blockState, place_me);
                case 7 ->
                    //Fence Gate Blocks
                        blockReplacer.FenceGatePlacement(world, blockPos, blockState, place_me);
                default -> { return ActionResult.FAIL; }
            }
            playerEntity.getMainHandStack().setCount(playerEntity.getMainHandStack().getCount()-1);
            return ActionResult.SUCCESS;
        } else return ActionResult.FAIL;
    }
}