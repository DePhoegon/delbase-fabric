package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.aid.event.BlockOnFireCallBack;
import com.dephoegon.delbase.aid.world.serverVariableAccess;
import com.dephoegon.delbase.block.axis.axisCutSandStones;
import com.dephoegon.delbase.block.entity.blockEntities;
import com.dephoegon.delbase.block.fence.*;
import com.dephoegon.delbase.block.general.*;
import com.dephoegon.delbase.block.gravity.gravColorSands;
import com.dephoegon.delbase.block.gravity.gravColorSolidSand;
import com.dephoegon.delbase.block.slabs.*;
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
        gravColorSands.registerColoredSands();
        //SandStones
        genSandStones.registerSandStone();
        //Stripped Woods
        strippedWoodenFences.registerStrippedWoodenFences();
        slabStrippedWoods.registerWoodSlabs();
    }
    // Rest of the common blocks
    public static void RegisterSecondList() {
        //sand
        gravColorSolidSand.registerColoredSands();
        sandFences.registerSandFences();
        slabSandsEnergy.registerColoredSandSlabs();
        slabSands.registerColoredSands();
        //Items
        BlockCutterItems.registerItems();
        ShiftingDyes.registerItems();
        //Woods
        slabWood.registerWoodSlabs();
        woodenFences.registerWoodenFences();
        //SandStones
        axisCutSandStones.registerCutSandStones();
        genSmoothSandStones.registerSmoothSandStoneBlock();
        genChiseledSandStones.registerChiseledSandStoneBlock();

        chiseledSandStoneFences.registerChiseledSandStoneFences();
        cutSandStoneFence.registerCutSandStoneFences();
        sandStoneFences.registerSandStoneFences();
        smoothSandStoneFences.registerSandStoneFences();

        slabChiseledSandStones.registerCutSandStoneSlabs();
        slabChiseledSandStonesEnergy.registerCutSandStoneSlabEnergy();
        slabCutSandStones.registerCutSandStoneSlabs();
        slabCutSandStonesEnergy.registerCutSandStoneSlabEnergy();
        slabSandStones.registerCutSandStoneSlabs();
        slabSandStonesEnergy.registerCutSandStoneSlabs();
        slabSmoothSandStones.registerCutSandStoneSlabs();
        slabSmoothSandStonesEnergy.registerCutSandStoneSlabs();
        //Concrete
        concreteFences.registerConcreteFences();
        slabConcrete.registerConcreteSlab();
        //Misc
        fenceMisc.registerMiscFences();
        misc.registerMiscBlock();
        slabMisc.registerMiscFences();
        //leafys
        leafFences.registerLeafFences();
        slabLeaves.registerLeafSlabs();
        //quartz
        quartzFences.registerQuartzFences();
        slabQuartz.registerConcreteSlab();
        //Stone
        stoneFences.registerStoneFences();
        //terracotta
        terracottaFences.registerTerracottaFences();
        slabTerracotta.registerTerracottaSlab();
    }
}