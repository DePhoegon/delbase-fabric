package com.dephoegon.delbase.aid.inventory;

import net.minecraft.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import static com.dephoegon.delbase.item.BlockCutterItems.*;

public class listArrays {
    private static @NotNull ArrayList<Item> setPlansOnlyArray(){
        ArrayList<Item> tempArray = new ArrayList<>();
        tempArray.add(WALL_PLANS.asItem());
        tempArray.add(FENCE_PLANS.asItem());
        tempArray.add(FENCE_GATE_PLANS.asItem());
        tempArray.add(SLAB_PLANS.asItem());
        tempArray.add(STAIR_PLANS.asItem());
        return tempArray;
    }
    private static @NotNull ArrayList<Item> setFullArray(@NotNull ArrayList<Item> list) {
        list.add(ARMOR_COMPOUND.asItem());
        return list;
    }
    public static @NotNull ArrayList<Item> getPlanOnlyArray() { return setPlansOnlyArray(); }
    public static @NotNull ArrayList<Item> getFullPlanSlotArray() { return setFullArray(setPlansOnlyArray()); }
}
