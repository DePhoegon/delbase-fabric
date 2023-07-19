package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.aid.event.BlockOnFireCallBack;
import com.dephoegon.delbase.block.entity.blockEntities;
import com.dephoegon.delbase.block.general.ashBlocks;
import com.dephoegon.delbase.block.general.machineBlock;
import com.dephoegon.delbase.block.gravity.gravColorSands;
import com.dephoegon.delbase.block.slabs.slabSandEnergy;
import com.dephoegon.delbase.block.slabs.slabWood;
import com.dephoegon.delbase.item.BlockCutterItems;
import com.dephoegon.delbase.item.ShiftingDyes;
import com.dephoegon.delbase.screen.blockCuttingStationScreen;
import com.dephoegon.delbase.screen.screenHandlers;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;

public class regLists {
    //Client Only, Reg.
    public static void RegisterClientFirst() {
        BlockRenderLayerMap.INSTANCE.putBlock(machineBlock.BLOCK_CUTTER_BLOCK, RenderLayer.getCutout());
        KeyBindings.registerKeyBinds();
        HandledScreens.register(screenHandlers.BLOCK_CUTTING_STATION_SCREEN_HANDLER, blockCuttingStationScreen::new);
    }
    // Blocks & Classes that need to be registered first before called ont by others
    public static void RegisterFirstList() {
        BlockOnFireCallBack.EVENT.register(new burntReplacer());
        machineBlock.registerModBlocks();
        blockEntities.registerAllBlockEntities();
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
