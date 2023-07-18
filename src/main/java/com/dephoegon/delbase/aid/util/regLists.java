package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.aid.event.BlockOnFireCallBack;
import com.dephoegon.delbase.block.ash.ashBlocks;
import com.dephoegon.delbase.block.gravity.gravColorSands;
import com.dephoegon.delbase.block.slabs.slabSandEnergy;
import com.dephoegon.delbase.block.slabs.slabWood;
import com.dephoegon.delbase.item.BlockCutterItems;
import com.dephoegon.delbase.item.ShiftingDyes;

public class regLists {
    //Client Only, Reg.
    public static void RegisterClientFirst() {
        KeyBindings.registerKeyBinds();
    }
    // Blocks & Classes that need to be registered first before called ont by others
    public static void RegisterFirstList() {
        BlockOnFireCallBack.EVENT.register(new burntReplacer());
        blockArrayList.setBlockArrays();
        ashBlocks.registerAshBlocks();
    }
    // Rest of the common blocks
    public static void RegisterSecondList() {
        gravColorSands.registerColoredSands();
        BlockCutterItems.registerItems();
        ShiftingDyes.registerItems();
        slabWood.registerWoodSlabs();
        slabSandEnergy.registerColoredSandSlabs();
    }
}
