package com.dephoegon.delbase.aid.event;

import com.dephoegon.delbase.block.axis.axisCutSandStones;
import com.dephoegon.delbase.block.fence.chiseledSandStoneFences;
import com.dephoegon.delbase.block.fence.concreteFences;
import com.dephoegon.delbase.block.fence.cutSandStoneFence;
import com.dephoegon.delbase.block.general.machineBlock;
import com.dephoegon.delbase.item.BlockCutterItems;
import com.dephoegon.delbase.item.ShiftingDyes;
import net.minecraft.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class itemGroupArrays {
    public static @NotNull ArrayList<Item> axisBlocks() {
        ArrayList<Item> out = new ArrayList<>();
        out.add(axisCutSandStones.BLOOD_CUT_SAND_STONE.asItem());
        out.add(axisCutSandStones.WHITE_CUT_SAND_STONE.asItem());
        out.add(axisCutSandStones.ORANGE_CUT_SAND_STONE.asItem());
        out.add(axisCutSandStones.MAGENTA_CUT_SAND_STONE.asItem());
        out.add(axisCutSandStones.LIGHT_BLUE_CUT_SAND_STONE.asItem());
        out.add(axisCutSandStones.YELLOW_CUT_SAND_STONE.asItem());
        out.add(axisCutSandStones.LIME_CUT_SAND_STONE.asItem());
        out.add(axisCutSandStones.PINK_CUT_SAND_STONE.asItem());
        out.add(axisCutSandStones.GRAY_CUT_SAND_STONE.asItem());
        out.add(axisCutSandStones.LIGHT_GRAY_CUT_SAND_STONE.asItem());
        out.add(axisCutSandStones.CYAN_CUT_SAND_STONE.asItem());
        out.add(axisCutSandStones.PURPLE_CUT_SAND_STONE.asItem());
        out.add(axisCutSandStones.BLUE_CUT_SAND_STONE.asItem());
        out.add(axisCutSandStones.GREEN_CUT_SAND_STONE.asItem());
        out.add(axisCutSandStones.BROWN_CUT_SAND_STONE.asItem());
        out.add(axisCutSandStones.BLACK_CUT_SAND_STONE.asItem());
        return out;
    }
    public static @NotNull ArrayList<Item> machineBlock() {
        ArrayList<Item> out = new ArrayList<>();
        out.add(machineBlock.BLOCK_CUTTER_STATION.asItem());
        return out;
    }
    public static @NotNull ArrayList<Item> chiseledSandStoneFence() {
        ArrayList<Item> out = new ArrayList<>();
        out.add(chiseledSandStoneFences.WHITE_CHISELED_SAND_STONE_FENCE.asItem());
        out.add(chiseledSandStoneFences.WHITE_CHISELED_SAND_STONE_FENCE_GATE.asItem());
        out.add(chiseledSandStoneFences.ORANGE_CHISELED_SAND_STONE_FENCE.asItem());
        out.add(chiseledSandStoneFences.ORANGE_CHISELED_SAND_STONE_FENCE_GATE.asItem());
        out.add(chiseledSandStoneFences.MAGENTA_CHISELED_SAND_STONE_FENCE.asItem());
        out.add(chiseledSandStoneFences.MAGENTA_CHISELED_SAND_STONE_FENCE_GATE.asItem());
        out.add(chiseledSandStoneFences.LIGHT_BLUE_CHISELED_SAND_STONE_FENCE.asItem());
        out.add(chiseledSandStoneFences.LIGHT_BLUE_CHISELED_SAND_STONE_FENCE_GATE.asItem());
        out.add(chiseledSandStoneFences.YELLOW_CHISELED_SAND_STONE_FENCE.asItem());
        out.add(chiseledSandStoneFences.YELLOW_CHISELED_SAND_STONE_FENCE_GATE.asItem());
        out.add(chiseledSandStoneFences.LIME_CHISELED_SAND_STONE_FENCE.asItem());
        out.add(chiseledSandStoneFences.LIME_CHISELED_SAND_STONE_FENCE_GATE.asItem());
        out.add(chiseledSandStoneFences.PINK_CHISELED_SAND_STONE_FENCE.asItem());
        out.add(chiseledSandStoneFences.PINK_CHISELED_SAND_STONE_FENCE_GATE.asItem());
        out.add(chiseledSandStoneFences.GRAY_CHISELED_SAND_STONE_FENCE.asItem());
        out.add(chiseledSandStoneFences.GRAY_CHISELED_SAND_STONE_FENCE_GATE.asItem());
        out.add(chiseledSandStoneFences.LIGHT_GRAY_CHISELED_SAND_STONE_FENCE.asItem());
        out.add(chiseledSandStoneFences.LIGHT_GRAY_CHISELED_SAND_STONE_FENCE_GATE.asItem());
        out.add(chiseledSandStoneFences.CYAN_CHISELED_SAND_STONE_FENCE.asItem());
        out.add(chiseledSandStoneFences.CYAN_CHISELED_SAND_STONE_FENCE_GATE.asItem());
        out.add(chiseledSandStoneFences.PURPLE_CHISELED_SAND_STONE_FENCE.asItem());
        out.add(chiseledSandStoneFences.PURPLE_CHISELED_SAND_STONE_FENCE_GATE.asItem());
        out.add(chiseledSandStoneFences.BLUE_CHISELED_SAND_STONE_FENCE.asItem());
        out.add(chiseledSandStoneFences.BLUE_CHISELED_SAND_STONE_FENCE_GATE.asItem());
        out.add(chiseledSandStoneFences.BROWN_CHISELED_SAND_STONE_FENCE.asItem());
        out.add(chiseledSandStoneFences.BROWN_CHISELED_SAND_STONE_FENCE_GATE.asItem());
        out.add(chiseledSandStoneFences.GREEN_CHISELED_SAND_STONE_FENCE.asItem());
        out.add(chiseledSandStoneFences.GREEN_CHISELED_SAND_STONE_FENCE_GATE.asItem());
        out.add(chiseledSandStoneFences.RED_CHISELED_SAND_STONE_FENCE.asItem());
        out.add(chiseledSandStoneFences.RED_CHISELED_SAND_STONE_FENCE_GATE.asItem());
        out.add(chiseledSandStoneFences.BLACK_CHISELED_SAND_STONE_FENCE.asItem());
        out.add(chiseledSandStoneFences.BLACK_CHISELED_SAND_STONE_FENCE_GATE.asItem());
        out.add(chiseledSandStoneFences.CHISELED_SAND_STONE_FENCE.asItem());
        out.add(chiseledSandStoneFences.CHISELED_SAND_STONE_FENCE_GATE.asItem());
        out.add(chiseledSandStoneFences.BLOOD_CHISELED_SAND_STONE_FENCE.asItem());
        out.add(chiseledSandStoneFences.BLOOD_CHISELED_SAND_STONE_FENCE_GATE.asItem());
        return out;
    }
    public static @NotNull ArrayList<Item> concreteFence() {
        ArrayList<Item> out = new ArrayList<>();
        out.add(concreteFences.WHITE_CONCRETE_FENCE.asItem());
        out.add(concreteFences.WHITE_CONCRETE_FENCE_GATE.asItem());
        out.add(concreteFences.ORANGE_CONCRETE_FENCE.asItem());
        out.add(concreteFences.ORANGE_CONCRETE_FENCE_GATE.asItem());
        out.add(concreteFences.MAGENTA_CONCRETE_FENCE.asItem());
        out.add(concreteFences.MAGENTA_CONCRETE_FENCE_GATE.asItem());
        out.add(concreteFences.LIGHT_BLUE_CONCRETE_FENCE.asItem());
        out.add(concreteFences.LIGHT_BLUE_CONCRETE_FENCE_GATE.asItem());
        out.add(concreteFences.YELLOW_CONCRETE_FENCE.asItem());
        out.add(concreteFences.YELLOW_CONCRETE_FENCE_GATE.asItem());
        out.add(concreteFences.LIME_CONCRETE_FENCE.asItem());
        out.add(concreteFences.LIME_CONCRETE_FENCE_GATE.asItem());
        out.add(concreteFences.PINK_CONCRETE_FENCE.asItem());
        out.add(concreteFences.PINK_CONCRETE_FENCE_GATE.asItem());
        out.add(concreteFences.GRAY_CONCRETE_FENCE.asItem());
        out.add(concreteFences.GRAY_CONCRETE_FENCE_GATE.asItem());
        out.add(concreteFences.LIGHT_GRAY_CONCRETE_FENCE.asItem());
        out.add(concreteFences.LIGHT_GRAY_CONCRETE_FENCE_GATE.asItem());
        out.add(concreteFences.CYAN_CONCRETE_FENCE.asItem());
        out.add(concreteFences.CYAN_CONCRETE_FENCE_GATE.asItem());
        out.add(concreteFences.PURPLE_CONCRETE_FENCE.asItem());
        out.add(concreteFences.PURPLE_CONCRETE_FENCE_GATE.asItem());
        out.add(concreteFences.BLUE_CONCRETE_FENCE.asItem());
        out.add(concreteFences.BLUE_CONCRETE_FENCE_GATE.asItem());
        out.add(concreteFences.BROWN_CONCRETE_FENCE.asItem());
        out.add(concreteFences.BROWN_CONCRETE_FENCE_GATE.asItem());
        out.add(concreteFences.GREEN_CONCRETE_FENCE.asItem());
        out.add(concreteFences.GREEN_CONCRETE_FENCE_GATE.asItem());
        out.add(concreteFences.RED_CONCRETE_FENCE.asItem());
        out.add(concreteFences.RED_CONCRETE_FENCE_GATE.asItem());
        out.add(concreteFences.BLACK_CONCRETE_FENCE.asItem());
        out.add(concreteFences.BLACK_CONCRETE_FENCE_GATE.asItem());
        return out;
    }
    public static @NotNull ArrayList<Item> cutSandStoneFence() {
        ArrayList<Item> out = new ArrayList<>();
        out.add(cutSandStoneFence.WHITE_CUT_SAND_STONE_FENCE.asItem());
        out.add(cutSandStoneFence.WHITE_CUT_SAND_STONE_FENCE_GATE.asItem());
        out.add(cutSandStoneFence.ORANGE_CUT_SAND_STONE_FENCE.asItem());
        out.add(cutSandStoneFence.ORANGE_CUT_SAND_STONE_FENCE_GATE.asItem());
        return out;
    }
    public static @NotNull ArrayList<Item> fenceMisc() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> leafFence() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> quartzFences() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> sandFences() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> sandStoneFences() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> smoothSandStoneFences() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> stoneFences() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> strippedWoodenFences() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> terracottaFences() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> woodenFences() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> ashBlocks() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> genChiseledSandStones() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> genSandStones() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> genSmoothSandStones() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> misc() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> gravColorSands() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> gravColorSolidSands() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> slabChiseledSandStones() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> slabChiseledSandStoneEnergy() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> slabConcrete() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> slabCutSandStones() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> slabCutSandStonesEnergy() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> slabLeaves() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> slabMisc() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> slabQuartz() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> slabSands() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> slabSandsEnergy() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> slabSandStones() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> slabSandStonesEnergy() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> slabSmoothSandStones() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> slabSmoothSandStonesEnergy() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> slabStrippedWoods() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> slabTerracotta() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> slabWoods() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> stairChiseledSandStones() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> stairConcrete() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> stairCutSandStones() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> stairLeaves() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> stairMisc() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> stairQuartz() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> stairSands() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> stairSandStones() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> stairSmoothSandStones() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> stairStrippedWoods() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> stairTerracotta() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> stairWoods() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> hedgeLeaves() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> wallChiseledSandStones() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> wallConcrete() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> wallCutSandStones() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> wallMisc() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> wallQuartz() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> wallSands() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> wallSandStones() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> wallSmoothSandStones() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> wallStrippedWoods() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> wallTerracotta() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> wallWoods() {
        ArrayList<Item> out = new ArrayList<>();

        return out;
    }
    public static @NotNull ArrayList<Item> getDelBlocks() {
        ArrayList<Item> delBlocks =  new ArrayList<>();
        delBlocks.addAll(machineBlock());
        delBlocks.addAll(axisBlocks());
        delBlocks.addAll(chiseledSandStoneFence());
        delBlocks.addAll(concreteFence());
        delBlocks.addAll(cutSandStoneFence());
        delBlocks.addAll(fenceMisc());
        delBlocks.addAll(leafFence());
        delBlocks.addAll(quartzFences());
        delBlocks.addAll(sandFences());
        delBlocks.addAll(sandStoneFences());
        delBlocks.addAll(smoothSandStoneFences());
        delBlocks.addAll(stoneFences());
        delBlocks.addAll(strippedWoodenFences());
        delBlocks.addAll(terracottaFences());
        delBlocks.addAll(woodenFences());
        delBlocks.addAll(ashBlocks());
        delBlocks.addAll(genSandStones());
        delBlocks.addAll(genChiseledSandStones());
        delBlocks.addAll(genSmoothSandStones());
        delBlocks.addAll(misc());
        delBlocks.addAll(slabChiseledSandStones());
        delBlocks.addAll(slabChiseledSandStoneEnergy());
        delBlocks.addAll(slabConcrete());
        delBlocks.addAll(slabCutSandStones());
        delBlocks.addAll(slabCutSandStonesEnergy());
        delBlocks.addAll(slabLeaves());
        delBlocks.addAll(slabMisc());
        delBlocks.addAll(slabQuartz());
        delBlocks.addAll(slabSands());
        delBlocks.addAll(slabSandsEnergy());
        delBlocks.addAll(slabSandStones());
        delBlocks.addAll(slabSandStonesEnergy());
        delBlocks.addAll(slabSmoothSandStones());
        delBlocks.addAll(slabSmoothSandStonesEnergy());
        delBlocks.addAll(slabStrippedWoods());
        delBlocks.addAll(slabTerracotta());
        delBlocks.addAll(slabWoods());
        delBlocks.addAll(stairChiseledSandStones());
        delBlocks.addAll(stairConcrete());
        delBlocks.addAll(stairCutSandStones());
        delBlocks.addAll(stairLeaves());
        delBlocks.addAll(stairMisc());
        delBlocks.addAll(stairQuartz());
        delBlocks.addAll(stairSands());
        delBlocks.addAll(stairSandStones());
        delBlocks.addAll(stairSmoothSandStones());
        delBlocks.addAll(stairStrippedWoods());
        delBlocks.addAll(stairTerracotta());
        delBlocks.addAll(stairWoods());
        delBlocks.addAll(hedgeLeaves());
        delBlocks.addAll(wallChiseledSandStones());
        delBlocks.addAll(wallConcrete());
        delBlocks.addAll(wallChiseledSandStones());
        delBlocks.addAll(wallMisc());
        delBlocks.addAll(wallQuartz());
        delBlocks.addAll(wallSands());
        delBlocks.addAll(wallSandStones());
        delBlocks.addAll(wallStrippedWoods());
        delBlocks.addAll(wallTerracotta());
        delBlocks.addAll(wallWoods());
        return delBlocks;
    }
    public static @NotNull ArrayList<Item> blockCutterItems() {
        ArrayList<Item> out = new ArrayList<>();
        out.add(BlockCutterItems.ARMOR_COMPOUND);
        out.add(BlockCutterItems.WALL_PLANS);
        out.add(BlockCutterItems.SLAB_PLANS);
        out.add(BlockCutterItems.FENCE_PLANS);
        out.add(BlockCutterItems.FENCE_GATE_PLANS);
        out.add(BlockCutterItems.STAIR_PLANS);
        return out;
    }
    public static @NotNull ArrayList<Item> shiftingDyes() {
        ArrayList<Item> out = new ArrayList<>();
        out.add(ShiftingDyes.CLEANSE_SHIFT_DYE);
        out.add(ShiftingDyes.RED_SHIFT_DYE);
        out.add(ShiftingDyes.BLOOD_SHIFT_DYE);
        out.add(ShiftingDyes.WHITE_SHIFT_DYE);
        out.add(ShiftingDyes.ORANGE_SHIFT_DYE);
        out.add(ShiftingDyes.MAGENTA_SHIFT_DYE);
        out.add(ShiftingDyes.LIGHT_BLUE_SHIFT_DYE);
        out.add(ShiftingDyes.YELLOW_SHIFT_DYE);
        out.add(ShiftingDyes.LIME_SHIFT_DYE);
        out.add(ShiftingDyes.PINK_SHIFT_DYE);
        out.add(ShiftingDyes.GRAY_SHIFT_DYE);
        out.add(ShiftingDyes.LIGHT_GRAY_SHIFT_DYE);
        out.add(ShiftingDyes.CYAN_SHIFT_DYE);
        out.add(ShiftingDyes.PURPLE_SHIFT_DYE);
        out.add(ShiftingDyes.BLUE_SHIFT_DYE);
        out.add(ShiftingDyes.GREEN_SHIFT_DYE);
        out.add(ShiftingDyes.BROWN_SHIFT_DYE);
        out.add(ShiftingDyes.BLACK_SHIFT_DYE);
        return out;
    }
    public static @NotNull ArrayList<Item> getDelItems() {
        ArrayList<Item> delItems = new ArrayList<>();
        delItems.addAll(blockCutterItems());
        delItems.addAll(shiftingDyes());
        return delItems;
    }
}