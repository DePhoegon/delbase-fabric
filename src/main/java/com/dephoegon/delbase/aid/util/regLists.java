package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.aid.event.BlockOnFireCallBack;
import com.dephoegon.delbase.aid.world.serverVariableAccess;
import com.dephoegon.delbase.block.axis.axisCutSandStones;
import com.dephoegon.delbase.block.entity.blockEntities;
import com.dephoegon.delbase.block.fence.*;
import com.dephoegon.delbase.block.general.ashBlocks;
import com.dephoegon.delbase.block.general.genSandStones;
import com.dephoegon.delbase.block.general.machineBlock;
import com.dephoegon.delbase.block.gravity.gravColorSands;
import com.dephoegon.delbase.block.gravity.gravColorSolidSand;
import com.dephoegon.delbase.block.slabs.slabSandEnergy;
import com.dephoegon.delbase.block.slabs.slabWood;
import com.dephoegon.delbase.item.BlockCutterItems;
import com.dephoegon.delbase.item.ShiftingDyes;
import com.dephoegon.delbase.recipe.modRecipes;
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
    public static void RegisterBaseEvents() {
        BlockOnFireCallBack.EVENT.register(new burntReplacer());
        serverVariableAccess variableAccess = new serverVariableAccess();
        variableAccess.init();
        blockArrayList.setBlockArrays();
        modRecipes.registerRecipes();
    }
    public static void RegisterFirstList() {
        //blockCutter
        machineBlock.registerModBlocks();
        blockEntities.registerAllBlockEntities();
        //Ash
        ashBlocks.registerAshBlocks();
        //Sand
        genSandStones.registerSandStone();
        //SandStones
        gravColorSands.registerColoredSands();
        cutSandStoneFence.registerCutSandStoneFences();
        //Stripped Woods

    }
    // Rest of the common blocks
    public static void RegisterSecondList() {
        //sand
        gravColorSolidSand.registerColoredSands();
        //Items
        BlockCutterItems.registerItems();
        ShiftingDyes.registerItems();
        //Woods
        slabWood.registerWoodSlabs();
        slabSandEnergy.registerColoredSandSlabs();
        //SandStones
        axisCutSandStones.registerCutSandStones();
        chiseledSandStoneFences.registerChiseledSandStoneFences();
        //Concrete
        concreteFences.registerConcreteFences();
        //Misc
        fenceMisc.registerMiscFences();
        //leafys
        leafFences.registerLeafFences();
    }
}