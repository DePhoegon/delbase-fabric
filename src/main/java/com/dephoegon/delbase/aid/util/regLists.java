package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.aid.event.BlockOnFireCallBack;
import com.dephoegon.delbase.block.ash.ashBlocks;
import com.dephoegon.delbase.block.slabs.slabWood;
import com.dephoegon.delbase.item.BlockCutterItems;
import com.dephoegon.delbase.item.ShiftingDyes;

public class regLists {
    public static void RegisterFirstList() {
        BlockOnFireCallBack.EVENT.register(new burntReplacer());
        ashBlocks.registerAshBlocks();
    }
    public static void RegisterSecondList() {
        BlockCutterItems.registerItems();
        ShiftingDyes.registerItems();
        slabWood.registerWoodSlabs();
    }
}
