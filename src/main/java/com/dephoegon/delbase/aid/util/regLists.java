package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.aid.event.blockColoring;
import com.dephoegon.delbase.aid.world.serverAccess;
import com.dephoegon.delbase.block.axis.axisCutSandStones;
import com.dephoegon.delbase.block.entity.blockEntities;
import com.dephoegon.delbase.block.fence.*;
import com.dephoegon.delbase.block.general.*;
import com.dephoegon.delbase.block.gravity.gravColorSands;
import com.dephoegon.delbase.block.gravity.gravColorSolidSand;
import com.dephoegon.delbase.block.slabs.*;
import com.dephoegon.delbase.block.stair.*;
import com.dephoegon.delbase.block.wall.*;
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
        BlockRenderLayerMap.INSTANCE.putBlock(machineBlock.BLOCK_CUTTER_STATION, RenderLayer.getCutout());
        ModKeyBindings.registerKeyBinds();
        HandledScreens.register(screenHandlers.BLOCK_CUTTING_STATION_SCREEN_HANDLER, blockCuttingStationScreen::new);
        blockColoring.setLeafColors();
    }
    // Blocks & Classes that need to be registered first before called ont by others
    public static void RegisterBaseEvents() {
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
        stairStrippedWoods.registerWoodStairs();
        wallStrippedWoods.registerWoodWalls();
    }
    // Rest of the common blocks
    public static void RegisterSecondList() {
        //sand
        gravColorSolidSand.registerColoredSands();
        sandFences.registerSandFences();
        slabSandsEnergy.registerColoredSandSlabs();
        slabSands.registerColoredSands();
        stairSands.registerColoredSands();
        wallSands.registerColoredSands();
        //Items
        BlockCutterItems.registerItems();
        ShiftingDyes.registerItems();
        //Woods
        slabWood.registerWoodSlabs();
        woodenFences.registerWoodenFences();
        stairWoods.registerWoodStairs();
        wallWoods.registerWoodWalls();
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
        stairChiseledSandStones.registerCutSandStoneStairs();
        stairCutSandStones.registerCutSandStoneStairs();
        stairSandStones.registerCutSandStoneStairs();
        stairSmoothSandStones.registerCutSandStoneStairs();
        wallChiseledSandStones.registerChiseledSandStonewalls();
        wallCutSandStones.registerCutSandStonewalls();
        wallSandStones.registerSandStonewalls();
        wallSmoothSandStones.registerSmoothSandStonewalls();
        //Concrete
        concreteFences.registerConcreteFences();
        slabConcrete.registerConcreteSlab();
        stairConcrete.registerConcreteStair();
        wallConcrete.registerConcreteWall();
        //Misc
        fenceMisc.registerMiscFences();
        misc.registerMiscBlock();
        slabMisc.registerMiscFences();
        stairMisc.registerMiscFences();
        wallMisc.registerMiscFences();
        wallQuartz.registerConcreteWall();
        //leafys
        leafFences.registerLeafFences();
        slabLeaves.registerLeafSlabs();
        stairLeaves.registerLeafStairs();
        hedgeLeaves.registerLeafSlabs();
        //quartz
        quartzFences.registerQuartzFences();
        slabQuartz.registerConcreteSlab();
        stairQuartz.registerConcreteStair();
        //Stone
        stoneFences.registerStoneFences();
        //terracotta
        terracottaFences.registerTerracottaFences();
        slabTerracotta.registerTerracottaSlab();
        stairTerracotta.registerTerracottaStair();
        wallTerracotta.registerTerracottaWall();


        //Post Items
        serverAccess.init();
    }
}