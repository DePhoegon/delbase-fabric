package com.dephoegon.delbase.datagen;

import com.dephoegon.delbase.Delbase;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.*;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

import static com.dephoegon.delbase.block.axis.axisCutSandStones.*;
import static com.dephoegon.delbase.block.fence.chiseledSandStoneFences.*;
import static com.dephoegon.delbase.block.fence.concreteFences.*;
import static com.dephoegon.delbase.block.fence.cutSandStoneFence.*;
import static com.dephoegon.delbase.block.fence.fenceMisc.*;
import static com.dephoegon.delbase.block.fence.leafFences.*;
import static com.dephoegon.delbase.block.fence.sandFences.*;
import static com.dephoegon.delbase.block.fence.sandStoneFences.*;
import static com.dephoegon.delbase.block.fence.smoothSandStoneFences.*;
import static com.dephoegon.delbase.block.fence.strippedWoodenFences.*;
import static com.dephoegon.delbase.block.fence.terracottaFences.*;
import static com.dephoegon.delbase.block.fence.woodenFences.*;
import static com.dephoegon.delbase.block.general.genChiseledSandStones.*;
import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.block.general.genSmoothSandStones.*;
import static com.dephoegon.delbase.block.gravity.gravColorSolidSand.*;
import static com.dephoegon.delbase.block.slabs.slabChiseledSandStones.*;
import static com.dephoegon.delbase.block.slabs.slabConcrete.*;
import static com.dephoegon.delbase.block.slabs.slabCutSandStones.*;
import static com.dephoegon.delbase.block.slabs.slabLeaves.*;
import static com.dephoegon.delbase.block.slabs.slabMisc.*;
import static com.dephoegon.delbase.block.slabs.slabSandStones.*;
import static com.dephoegon.delbase.block.slabs.slabSands.*;
import static com.dephoegon.delbase.block.slabs.slabSmoothSandStones.*;
import static com.dephoegon.delbase.block.slabs.slabStrippedWoods.*;
import static com.dephoegon.delbase.block.slabs.slabTerracotta.*;
import static com.dephoegon.delbase.block.slabs.slabWood.*;
import static com.dephoegon.delbase.block.stair.stairChiseledSandStones.*;
import static com.dephoegon.delbase.block.stair.stairConcrete.*;
import static com.dephoegon.delbase.block.stair.stairCutSandStones.*;
import static com.dephoegon.delbase.block.stair.stairLeaves.*;
import static com.dephoegon.delbase.block.stair.stairMisc.*;
import static com.dephoegon.delbase.block.stair.stairSandStones.*;
import static com.dephoegon.delbase.block.stair.stairSands.*;
import static com.dephoegon.delbase.block.stair.stairSmoothSandStones.*;
import static com.dephoegon.delbase.block.stair.stairStrippedWoods.*;
import static com.dephoegon.delbase.block.stair.stairTerracotta.*;
import static com.dephoegon.delbase.block.stair.stairWoods.*;
import static com.dephoegon.delbase.block.wall.hedgeLeaves.*;
import static com.dephoegon.delbase.block.wall.wallChiseledSandStones.*;
import static com.dephoegon.delbase.block.wall.wallConcrete.*;
import static com.dephoegon.delbase.block.wall.wallCutSandStones.*;
import static com.dephoegon.delbase.block.wall.wallMisc.*;
import static com.dephoegon.delbase.block.wall.wallSandStones.*;
import static com.dephoegon.delbase.block.wall.wallSands.*;
import static com.dephoegon.delbase.block.wall.wallSmoothSandStones.*;
import static com.dephoegon.delbase.block.wall.wallStrippedWoods.*;
import static com.dephoegon.delbase.block.wall.wallTerracotta.*;
import static com.dephoegon.delbase.block.wall.wallWoods.*;

public class modVariantCraftGenerator extends FabricRecipeProvider {
    public modVariantCraftGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        allVariantCraftingTable(exporter, BLACK_SOLID_SAND.asItem(), BLACK_SAND_WALL, BLACK_SAND_STAIR, BLACK_SAND_SLAB, BLACK_SAND_FENCE, BLACK_SAND_FENCE_GATE, "black_sand");
        allVariantCraftingTable(exporter, BLUE_SOLID_SAND.asItem(), BLUE_SAND_WALL, BLUE_SAND_STAIR, BLUE_SAND_SLAB, BLUE_SAND_FENCE, BLUE_SAND_FENCE_GATE, "blue_sand");
        allVariantCraftingTable(exporter, BROWN_SOLID_SAND.asItem(), BROWN_SAND_WALL, BROWN_SAND_STAIR, BROWN_SAND_SLAB, BROWN_SAND_FENCE, BROWN_SAND_FENCE_GATE, "brown_sand");
        allVariantCraftingTable(exporter, CYAN_SOLID_SAND.asItem(), CYAN_SAND_WALL, CYAN_SAND_STAIR, CYAN_SAND_SLAB, CYAN_SAND_FENCE, CYAN_SAND_FENCE_GATE, "cyan_sand");
        allVariantCraftingTable(exporter, BLOOD_SOLID_SAND.asItem(), BLOOD_SAND_WALL, BLOOD_SAND_STAIR, BLOOD_SAND_SLAB, BLOOD_SAND_FENCE, BLOOD_SAND_FENCE_GATE, "dark_red_sand");
        allVariantCraftingTable(exporter, GRAY_SOLID_SAND.asItem(), GRAY_SAND_WALL, GRAY_SAND_STAIR, GRAY_SAND_SLAB, GRAY_SAND_FENCE, GRAY_SAND_FENCE_GATE, "gray_sand");
        allVariantCraftingTable(exporter, GREEN_SOLID_SAND.asItem(), GREEN_SAND_WALL, GREEN_SAND_STAIR, GREEN_SAND_SLAB, GREEN_SAND_FENCE, GREEN_SAND_FENCE_GATE, "green_sand");
        allVariantCraftingTable(exporter, LIGHT_BLUE_SOLID_SAND.asItem(), LIGHT_BLUE_SAND_WALL, LIGHT_BLUE_SAND_STAIR, LIGHT_BLUE_SAND_SLAB, LIGHT_BLUE_SAND_FENCE, LIGHT_BLUE_SAND_FENCE_GATE, "light_blue_sand");
        allVariantCraftingTable(exporter, LIGHT_GRAY_SOLID_SAND.asItem(), LIGHT_GRAY_SAND_WALL, LIGHT_GRAY_SAND_STAIR, LIGHT_GRAY_SAND_SLAB, LIGHT_GRAY_SAND_FENCE, LIGHT_GRAY_SAND_FENCE_GATE, "light_gray_sand");
        allVariantCraftingTable(exporter, LIME_SOLID_SAND.asItem(), LIME_SAND_WALL, LIME_SAND_STAIR, LIME_SAND_SLAB, LIME_SAND_FENCE, LIME_SAND_FENCE_GATE, "lime_sand");
        allVariantCraftingTable(exporter, MAGENTA_SOLID_SAND.asItem(), MAGENTA_SAND_WALL, MAGENTA_SAND_STAIR, MAGENTA_SAND_SLAB, MAGENTA_SAND_FENCE, MAGENTA_SAND_FENCE_GATE, "magenta_sand");
        allVariantCraftingTable(exporter, ORANGE_SOLID_SAND.asItem(), ORANGE_SAND_WALL, ORANGE_SAND_STAIR, ORANGE_SAND_SLAB, ORANGE_SAND_FENCE, ORANGE_SAND_FENCE_GATE, "orange_sand");
        allVariantCraftingTable(exporter, PINK_SOLID_SAND.asItem(), PINK_SAND_WALL, PINK_SAND_STAIR, PINK_SAND_SLAB, PINK_SAND_FENCE, PINK_SAND_FENCE_GATE, "pink_sand");
        allVariantCraftingTable(exporter, PURPLE_SOLID_SAND.asItem(), PURPLE_SAND_WALL, PURPLE_SAND_STAIR, PURPLE_SAND_SLAB, PURPLE_SAND_FENCE, PURPLE_SAND_FENCE_GATE, "purple_sand");
        allVariantCraftingTable(exporter, RED_SOLID_SAND.asItem(), RED_SAND_WALL, RED_SAND_STAIR, RED_SAND_SLAB, RED_SAND_FENCE, RED_SAND_FENCE_GATE, "red_sand");
        allVariantCraftingTable(exporter, SOLID_SAND.asItem(), SAND_WALL, SAND_STAIR, SAND_SLAB, SAND_FENCE, SAND_FENCE_GATE, "sand");
        allVariantCraftingTable(exporter, WHITE_SOLID_SAND.asItem(), WHITE_SAND_WALL, WHITE_SAND_STAIR, WHITE_SAND_SLAB, WHITE_SAND_FENCE, WHITE_SAND_FENCE_GATE, "white_sand");
        allVariantCraftingTable(exporter, YELLOW_SOLID_SAND.asItem(), YELLOW_SAND_WALL, YELLOW_SAND_STAIR, YELLOW_SAND_SLAB, YELLOW_SAND_FENCE, YELLOW_SAND_FENCE_GATE, "yellow_sand");
        //Base SandStone Variants
        allVariantCraftingTable(exporter, Items.CHISELED_RED_SANDSTONE, RED_CHISELED_SAND_STONE_WALL, RED_CHISELED_SAND_STONE_STAIR, RED_CHISELED_SAND_STONE_SLAB, RED_CHISELED_SAND_STONE_FENCE, RED_CHISELED_SAND_STONE_FENCE_GATE, "red_chiseled_sand_stone");
        allVariantCraftingTable(exporter, Items.CHISELED_SANDSTONE, CHISELED_SAND_STONE_WALL, CHISELED_SAND_STONE_STAIR, CHISELED_SAND_STONE_SLAB,CHISELED_SAND_STONE_FENCE, CHISELED_SAND_STONE_FENCE_GATE, "chiseled_sand_stone");
        allVariantCraftingTable(exporter, Items.RED_SANDSTONE, null, null, null, RED_SAND_STONE_FENCE, RED_SAND_STONE_FENCE_GATE, "red_sand_stone");
        allVariantCraftingTable(exporter, Items.SANDSTONE, null, null, null, SAND_STONE_FENCE, SAND_STONE_FENCE_GATE, "sand_stone");
        allVariantCraftingTable(exporter, Items.SMOOTH_RED_SANDSTONE, null, null, null, RED_SMOOTH_SAND_STONE_FENCE, RED_SAND_STONE_FENCE_GATE, "red_smooth_sand_stone");
        allVariantCraftingTable(exporter, Items.SMOOTH_SANDSTONE, null, null, null, SMOOTH_SAND_STONE_FENCE, SAND_STONE_FENCE_GATE, "smooth_sand_stone");
        allVariantCraftingTable(exporter, Items.CUT_RED_SANDSTONE, RED_CUT_SAND_STONE_WALL, RED_CUT_SAND_STONE_STAIR, null, RED_CUT_SAND_STONE_FENCE, RED_CUT_SAND_STONE_FENCE_GATE, "red_cut_sand_stone");
        allVariantCraftingTable(exporter, Items.CUT_SANDSTONE, CUT_SAND_STONE_WALL, CUT_SAND_STONE_STAIR, null, CUT_SAND_STONE_FENCE, CUT_SAND_STONE_FENCE_GATE, "cut_sand_stone");
        //Mod SandStones Variants
        allVariantCraftingTable(exporter, BLACK_CUT_SAND_STONE.asItem(), BLACK_CUT_SAND_STONE_WALL, BLACK_CUT_SAND_STONE_STAIR, BLACK_CUT_SAND_STONE_SLAB, BLACK_CUT_SAND_STONE_FENCE, BLACK_CUT_SAND_STONE_FENCE_GATE, "black_cut_sand_stone");
        allVariantCraftingTable(exporter, BLACK_CHISELED_SAND_STONE.asItem(), BLACK_CHISELED_SAND_STONE_WALL, BLACK_CHISELED_SAND_STONE_STAIR, BLACK_CHISELED_SAND_STONE_SLAB, BLACK_CHISELED_SAND_STONE_FENCE, BLACK_CHISELED_SAND_STONE_FENCE_GATE, "black_chiseled_sand_stone");
        allVariantCraftingTable(exporter, BLACK_SMOOTH_SAND_STONE.asItem(), BLACK_SMOOTH_SAND_STONE_WALL, BLACK_SMOOTH_SAND_STONE_STAIR, BLACK_SMOOTH_SAND_STONE_SLAB, BLACK_SMOOTH_SAND_STONE_FENCE, BLACK_SMOOTH_SAND_STONE_FENCE_GATE, "black_smooth_sand_stone");
        allVariantCraftingTable(exporter, BLACK_SAND_STONE.asItem(), BLACK_SAND_STONE_WALL, BLACK_SAND_STONE_STAIR, BLACK_SAND_STONE_SLAB, BLACK_SAND_STONE_FENCE, BLACK_SAND_STONE_FENCE_GATE, "black_sand_stone");
        allVariantCraftingTable(exporter, BLOOD_CUT_SAND_STONE.asItem(), BLOOD_CUT_SAND_STONE_WALL, BLOOD_CUT_SAND_STONE_STAIR, BLOOD_CUT_SAND_STONE_SLAB, BLOOD_CUT_SAND_STONE_FENCE, BLOOD_CUT_SAND_STONE_FENCE_GATE, "dark_red_cut_sand_stone");
        allVariantCraftingTable(exporter, BLOOD_CHISELED_SAND_STONE.asItem(), BLOOD_CHISELED_SAND_STONE_WALL, BLOOD_CHISELED_SAND_STONE_STAIR, BLOOD_CHISELED_SAND_STONE_SLAB, BLOOD_CHISELED_SAND_STONE_FENCE, BLOOD_CHISELED_SAND_STONE_FENCE_GATE, "dark_red_chiseled_sand_stone");
        allVariantCraftingTable(exporter, BLOOD_SMOOTH_SAND_STONE.asItem(), BLOOD_SMOOTH_SAND_STONE_WALL, BLOOD_SMOOTH_SAND_STONE_STAIR, BLOOD_SMOOTH_SAND_STONE_SLAB, BLOOD_SMOOTH_SAND_STONE_FENCE, BLOOD_SMOOTH_SAND_STONE_FENCE_GATE, "dark_red_smooth_sand_stone");
        allVariantCraftingTable(exporter, BLOOD_SAND_STONE.asItem(), BLOOD_SAND_STONE_WALL, BLOOD_SAND_STONE_STAIR, BLOOD_SAND_STONE_SLAB, BLOOD_SAND_STONE_FENCE, BLOOD_SAND_STONE_FENCE_GATE, "dark_red_sand_stone");
        allVariantCraftingTable(exporter, BLUE_CUT_SAND_STONE.asItem(), BLUE_CUT_SAND_STONE_WALL, BLUE_CUT_SAND_STONE_STAIR, BLUE_CUT_SAND_STONE_SLAB, BLUE_CUT_SAND_STONE_FENCE, BLUE_CUT_SAND_STONE_FENCE_GATE, "blue_cut_sand_stone");
        allVariantCraftingTable(exporter, BLUE_CHISELED_SAND_STONE.asItem(), BLUE_CHISELED_SAND_STONE_WALL, BLUE_CHISELED_SAND_STONE_STAIR, BLUE_CHISELED_SAND_STONE_SLAB, BLUE_CHISELED_SAND_STONE_FENCE, BLUE_CHISELED_SAND_STONE_FENCE_GATE, "blue_chiseled_sand_stone");
        allVariantCraftingTable(exporter, BLUE_SMOOTH_SAND_STONE.asItem(), BLUE_SMOOTH_SAND_STONE_WALL, BLUE_SMOOTH_SAND_STONE_STAIR, BLUE_SMOOTH_SAND_STONE_SLAB, BLUE_SMOOTH_SAND_STONE_FENCE, BLUE_SMOOTH_SAND_STONE_FENCE_GATE, "blue_smooth_sand_stone");
        allVariantCraftingTable(exporter, BLUE_SAND_STONE.asItem(), BLUE_SAND_STONE_WALL, BLUE_SAND_STONE_STAIR, BLUE_SAND_STONE_SLAB, BLUE_SAND_STONE_FENCE, BLUE_SAND_STONE_FENCE_GATE, "blue_sand_stone");
        allVariantCraftingTable(exporter, BROWN_CUT_SAND_STONE.asItem(), BROWN_CUT_SAND_STONE_WALL, BROWN_CUT_SAND_STONE_STAIR, BROWN_CUT_SAND_STONE_SLAB, BROWN_CUT_SAND_STONE_FENCE, BROWN_CUT_SAND_STONE_FENCE_GATE, "brown_cut_sand_stone");
        allVariantCraftingTable(exporter, BROWN_CHISELED_SAND_STONE.asItem(), BROWN_CHISELED_SAND_STONE_WALL, BROWN_CHISELED_SAND_STONE_STAIR, BROWN_CHISELED_SAND_STONE_SLAB, BROWN_CHISELED_SAND_STONE_FENCE, BROWN_CHISELED_SAND_STONE_FENCE_GATE, "brown_chiseled_sand_stone");
        allVariantCraftingTable(exporter, BROWN_SMOOTH_SAND_STONE.asItem(), BROWN_SMOOTH_SAND_STONE_WALL, BROWN_SMOOTH_SAND_STONE_STAIR, BROWN_SMOOTH_SAND_STONE_SLAB, BROWN_SMOOTH_SAND_STONE_FENCE, BROWN_SMOOTH_SAND_STONE_FENCE_GATE, "brown_smooth_sand_stone");
        allVariantCraftingTable(exporter, BROWN_SAND_STONE.asItem(), BROWN_SAND_STONE_WALL, BROWN_SAND_STONE_STAIR, BROWN_SAND_STONE_SLAB, BROWN_SAND_STONE_FENCE, BROWN_SAND_STONE_FENCE_GATE, "brown_sand_stone");
        allVariantCraftingTable(exporter, CYAN_CUT_SAND_STONE.asItem(), CYAN_CUT_SAND_STONE_WALL, CYAN_CUT_SAND_STONE_STAIR, CYAN_CUT_SAND_STONE_SLAB, CYAN_CUT_SAND_STONE_FENCE, CYAN_CUT_SAND_STONE_FENCE_GATE, "cyan_cut_sand_stone");
        allVariantCraftingTable(exporter, CYAN_CHISELED_SAND_STONE.asItem(), CYAN_CHISELED_SAND_STONE_WALL, CYAN_CHISELED_SAND_STONE_STAIR, CYAN_CHISELED_SAND_STONE_SLAB, CYAN_CHISELED_SAND_STONE_FENCE, CYAN_CHISELED_SAND_STONE_FENCE_GATE, "cyan_chiseled_sand_stone");
        allVariantCraftingTable(exporter, CYAN_SMOOTH_SAND_STONE.asItem(), CYAN_SMOOTH_SAND_STONE_WALL, CYAN_SMOOTH_SAND_STONE_STAIR, CYAN_SMOOTH_SAND_STONE_SLAB, CYAN_SMOOTH_SAND_STONE_FENCE, CYAN_SMOOTH_SAND_STONE_FENCE_GATE, "cyan_smooth_sand_stone");
        allVariantCraftingTable(exporter, CYAN_SAND_STONE.asItem(), CYAN_SAND_STONE_WALL, CYAN_SAND_STONE_STAIR, CYAN_SAND_STONE_SLAB, CYAN_SAND_STONE_FENCE, CYAN_SAND_STONE_FENCE_GATE, "cyan_sand_stone");
        allVariantCraftingTable(exporter, GRAY_CUT_SAND_STONE.asItem(), GRAY_CUT_SAND_STONE_WALL, GRAY_CUT_SAND_STONE_STAIR, GRAY_CUT_SAND_STONE_SLAB, GRAY_CUT_SAND_STONE_FENCE, GRAY_CUT_SAND_STONE_FENCE_GATE, "gray_cut_sand_stone");
        allVariantCraftingTable(exporter, GRAY_CHISELED_SAND_STONE.asItem(), GRAY_CHISELED_SAND_STONE_WALL, GRAY_CHISELED_SAND_STONE_STAIR, GRAY_CHISELED_SAND_STONE_SLAB, GRAY_CHISELED_SAND_STONE_FENCE, GRAY_CHISELED_SAND_STONE_FENCE_GATE, "gray_chiseled_sand_stone");
        allVariantCraftingTable(exporter, GRAY_SMOOTH_SAND_STONE.asItem(), GRAY_SMOOTH_SAND_STONE_WALL, GRAY_SMOOTH_SAND_STONE_STAIR, GRAY_SMOOTH_SAND_STONE_SLAB, GRAY_SMOOTH_SAND_STONE_FENCE, GRAY_SMOOTH_SAND_STONE_FENCE_GATE, "gray_smooth_sand_stone");
        allVariantCraftingTable(exporter, GRAY_SAND_STONE.asItem(), GRAY_SAND_STONE_WALL, GRAY_SAND_STONE_STAIR, GRAY_SAND_STONE_SLAB, GRAY_SAND_STONE_FENCE, GRAY_SAND_STONE_FENCE_GATE, "gray_sand_stone");
        allVariantCraftingTable(exporter, GREEN_CUT_SAND_STONE.asItem(), GREEN_CUT_SAND_STONE_WALL, GREEN_CUT_SAND_STONE_STAIR, GREEN_CUT_SAND_STONE_SLAB, GREEN_CUT_SAND_STONE_FENCE, GREEN_CUT_SAND_STONE_FENCE_GATE, "green_cut_sand_stone");
        allVariantCraftingTable(exporter, GREEN_CHISELED_SAND_STONE.asItem(), GREEN_CHISELED_SAND_STONE_WALL, GREEN_CHISELED_SAND_STONE_STAIR, GREEN_CHISELED_SAND_STONE_SLAB, GREEN_CHISELED_SAND_STONE_FENCE, GREEN_CHISELED_SAND_STONE_FENCE_GATE, "green_chiseled_sand_stone");
        allVariantCraftingTable(exporter, GREEN_SMOOTH_SAND_STONE.asItem(), GREEN_SMOOTH_SAND_STONE_WALL, GREEN_SMOOTH_SAND_STONE_STAIR, GREEN_SMOOTH_SAND_STONE_SLAB, GREEN_SMOOTH_SAND_STONE_FENCE, GREEN_SMOOTH_SAND_STONE_FENCE_GATE, "green_smooth_sand_stone");
        allVariantCraftingTable(exporter, GREEN_SAND_STONE.asItem(), GREEN_SAND_STONE_WALL, GREEN_SAND_STONE_STAIR, GREEN_SAND_STONE_SLAB, GREEN_SAND_STONE_FENCE, GREEN_SAND_STONE_FENCE_GATE, "green_sand_stone");
        allVariantCraftingTable(exporter, LIGHT_BLUE_CUT_SAND_STONE.asItem(), LIGHT_BLUE_CUT_SAND_STONE_WALL, LIGHT_BLUE_CUT_SAND_STONE_STAIR, LIGHT_BLUE_CUT_SAND_STONE_SLAB, LIGHT_BLUE_CUT_SAND_STONE_FENCE, LIGHT_BLUE_CUT_SAND_STONE_FENCE_GATE, "light_blue_cut_sand_stone");
        allVariantCraftingTable(exporter, LIGHT_BLUE_CHISELED_SAND_STONE.asItem(), LIGHT_BLUE_CHISELED_SAND_STONE_WALL, LIGHT_BLUE_CHISELED_SAND_STONE_STAIR, LIGHT_BLUE_CHISELED_SAND_STONE_SLAB, LIGHT_BLUE_CHISELED_SAND_STONE_FENCE, LIGHT_BLUE_CHISELED_SAND_STONE_FENCE_GATE, "light_blue_chiseled_sand_stone");
        allVariantCraftingTable(exporter, LIGHT_BLUE_SMOOTH_SAND_STONE.asItem(), LIGHT_BLUE_SMOOTH_SAND_STONE_WALL, LIGHT_BLUE_SMOOTH_SAND_STONE_STAIR, LIGHT_BLUE_SMOOTH_SAND_STONE_SLAB, LIGHT_BLUE_SMOOTH_SAND_STONE_FENCE, LIGHT_BLUE_SMOOTH_SAND_STONE_FENCE_GATE, "light_blue_smooth_sand_stone");
        allVariantCraftingTable(exporter, LIGHT_BLUE_SAND_STONE.asItem(), LIGHT_BLUE_SAND_STONE_WALL, LIGHT_BLUE_SAND_STONE_STAIR, LIGHT_BLUE_SAND_STONE_SLAB, LIGHT_BLUE_SAND_STONE_FENCE, LIGHT_BLUE_SAND_STONE_FENCE_GATE, "light_blue_sand_stone");
        allVariantCraftingTable(exporter, LIGHT_GRAY_CUT_SAND_STONE.asItem(), LIGHT_GRAY_CUT_SAND_STONE_WALL, LIGHT_GRAY_CUT_SAND_STONE_STAIR, LIGHT_GRAY_CUT_SAND_STONE_SLAB, LIGHT_GRAY_CUT_SAND_STONE_FENCE, LIGHT_GRAY_CUT_SAND_STONE_FENCE_GATE, "light_gray_cut_sand_stone");
        allVariantCraftingTable(exporter, LIGHT_GRAY_CHISELED_SAND_STONE.asItem(), LIGHT_GRAY_CHISELED_SAND_STONE_WALL, LIGHT_GRAY_CHISELED_SAND_STONE_STAIR, LIGHT_GRAY_CHISELED_SAND_STONE_SLAB, LIGHT_GRAY_CHISELED_SAND_STONE_FENCE, LIGHT_GRAY_CHISELED_SAND_STONE_FENCE_GATE, "light_gray_chiseled_sand_stone");
        allVariantCraftingTable(exporter, LIGHT_GRAY_SMOOTH_SAND_STONE.asItem(), LIGHT_GRAY_SMOOTH_SAND_STONE_WALL, LIGHT_GRAY_SMOOTH_SAND_STONE_STAIR, LIGHT_GRAY_SMOOTH_SAND_STONE_SLAB, LIGHT_GRAY_SMOOTH_SAND_STONE_FENCE, LIGHT_GRAY_SMOOTH_SAND_STONE_FENCE_GATE, "light_gray_smooth_sand_stone");
        allVariantCraftingTable(exporter, LIGHT_GRAY_SAND_STONE.asItem(), LIGHT_GRAY_SAND_STONE_WALL, LIGHT_GRAY_SAND_STONE_STAIR, LIGHT_GRAY_SAND_STONE_SLAB, LIGHT_GRAY_SAND_STONE_FENCE, LIGHT_GRAY_SAND_STONE_FENCE_GATE, "light_gray_sand_stone");
        allVariantCraftingTable(exporter, LIME_CUT_SAND_STONE.asItem(), LIME_CUT_SAND_STONE_WALL, LIME_CUT_SAND_STONE_STAIR, LIME_CUT_SAND_STONE_SLAB, LIME_CUT_SAND_STONE_FENCE, LIME_CUT_SAND_STONE_FENCE_GATE, "lime_cut_sand_stone");
        allVariantCraftingTable(exporter, LIME_CHISELED_SAND_STONE.asItem(), LIME_CHISELED_SAND_STONE_WALL, LIME_CHISELED_SAND_STONE_STAIR, LIME_CHISELED_SAND_STONE_SLAB, LIME_CHISELED_SAND_STONE_FENCE, LIME_CHISELED_SAND_STONE_FENCE_GATE, "lime_chiseled_sand_stone");
        allVariantCraftingTable(exporter, LIME_SMOOTH_SAND_STONE.asItem(), LIME_SMOOTH_SAND_STONE_WALL, LIME_SMOOTH_SAND_STONE_STAIR, LIME_SMOOTH_SAND_STONE_SLAB, LIME_SMOOTH_SAND_STONE_FENCE, LIME_SMOOTH_SAND_STONE_FENCE_GATE, "lime_smooth_sand_stone");
        allVariantCraftingTable(exporter, LIME_SAND_STONE.asItem(), LIME_SAND_STONE_WALL, LIME_SAND_STONE_STAIR, LIME_SAND_STONE_SLAB, LIME_SAND_STONE_FENCE, LIME_SAND_STONE_FENCE_GATE, "lime_sand_stone");
        allVariantCraftingTable(exporter, MAGENTA_CUT_SAND_STONE.asItem(), MAGENTA_CUT_SAND_STONE_WALL, MAGENTA_CUT_SAND_STONE_STAIR, MAGENTA_CUT_SAND_STONE_SLAB, MAGENTA_CUT_SAND_STONE_FENCE, MAGENTA_CUT_SAND_STONE_FENCE_GATE, "magenta_cut_sand_stone");
        allVariantCraftingTable(exporter, MAGENTA_CHISELED_SAND_STONE.asItem(), MAGENTA_CHISELED_SAND_STONE_WALL, MAGENTA_CHISELED_SAND_STONE_STAIR, MAGENTA_CHISELED_SAND_STONE_SLAB, MAGENTA_CHISELED_SAND_STONE_FENCE, MAGENTA_CHISELED_SAND_STONE_FENCE_GATE, "magenta_chiseled_sand_stone");
        allVariantCraftingTable(exporter, MAGENTA_SMOOTH_SAND_STONE.asItem(), MAGENTA_SMOOTH_SAND_STONE_WALL, MAGENTA_SMOOTH_SAND_STONE_STAIR, MAGENTA_SMOOTH_SAND_STONE_SLAB, MAGENTA_SMOOTH_SAND_STONE_FENCE, MAGENTA_SMOOTH_SAND_STONE_FENCE_GATE, "magenta_smooth_sand_stone");
        allVariantCraftingTable(exporter, MAGENTA_SAND_STONE.asItem(), MAGENTA_SAND_STONE_WALL, MAGENTA_SAND_STONE_STAIR, MAGENTA_SAND_STONE_SLAB, MAGENTA_SAND_STONE_FENCE, MAGENTA_SAND_STONE_FENCE_GATE, "magenta_sand_stone");
        allVariantCraftingTable(exporter, ORANGE_CUT_SAND_STONE.asItem(), ORANGE_CUT_SAND_STONE_WALL, ORANGE_CUT_SAND_STONE_STAIR, ORANGE_CUT_SAND_STONE_SLAB, ORANGE_CUT_SAND_STONE_FENCE, ORANGE_CUT_SAND_STONE_FENCE_GATE, "orange_cut_sand_stone");
        allVariantCraftingTable(exporter, ORANGE_CHISELED_SAND_STONE.asItem(), ORANGE_CHISELED_SAND_STONE_WALL, ORANGE_CHISELED_SAND_STONE_STAIR, ORANGE_CHISELED_SAND_STONE_SLAB, ORANGE_CHISELED_SAND_STONE_FENCE, ORANGE_CHISELED_SAND_STONE_FENCE_GATE, "orange_chiseled_sand_stone");
        allVariantCraftingTable(exporter, ORANGE_SMOOTH_SAND_STONE.asItem(), ORANGE_SMOOTH_SAND_STONE_WALL, ORANGE_SMOOTH_SAND_STONE_STAIR, ORANGE_SMOOTH_SAND_STONE_SLAB, ORANGE_SMOOTH_SAND_STONE_FENCE, ORANGE_SMOOTH_SAND_STONE_FENCE_GATE, "orange_smooth_sand_stone");
        allVariantCraftingTable(exporter, ORANGE_SAND_STONE.asItem(), ORANGE_SAND_STONE_WALL, ORANGE_SAND_STONE_STAIR, ORANGE_SAND_STONE_SLAB, ORANGE_SAND_STONE_FENCE, ORANGE_SAND_STONE_FENCE_GATE, "orange_sand_stone");
        allVariantCraftingTable(exporter, PINK_CUT_SAND_STONE.asItem(), PINK_CUT_SAND_STONE_WALL, PINK_CUT_SAND_STONE_STAIR, PINK_CUT_SAND_STONE_SLAB, PINK_CUT_SAND_STONE_FENCE, PINK_CUT_SAND_STONE_FENCE_GATE, "pink_cut_sand_stone");
        allVariantCraftingTable(exporter, PINK_CHISELED_SAND_STONE.asItem(), PINK_CHISELED_SAND_STONE_WALL, PINK_CHISELED_SAND_STONE_STAIR, PINK_CHISELED_SAND_STONE_SLAB, PINK_CHISELED_SAND_STONE_FENCE, PINK_CHISELED_SAND_STONE_FENCE_GATE, "pink_chiseled_sand_stone");
        allVariantCraftingTable(exporter, PINK_SMOOTH_SAND_STONE.asItem(), PINK_SMOOTH_SAND_STONE_WALL, PINK_SMOOTH_SAND_STONE_STAIR, PINK_SMOOTH_SAND_STONE_SLAB, PINK_SMOOTH_SAND_STONE_FENCE, PINK_SMOOTH_SAND_STONE_FENCE_GATE, "pink_smooth_sand_stone");
        allVariantCraftingTable(exporter, PINK_SAND_STONE.asItem(), PINK_SAND_STONE_WALL, PINK_SAND_STONE_STAIR, PINK_SAND_STONE_SLAB, PINK_SAND_STONE_FENCE, PINK_SAND_STONE_FENCE_GATE, "pink_sand_stone");
        allVariantCraftingTable(exporter, PURPLE_CUT_SAND_STONE.asItem(), PURPLE_CUT_SAND_STONE_WALL, PURPLE_CUT_SAND_STONE_STAIR, PURPLE_CUT_SAND_STONE_SLAB, PURPLE_CUT_SAND_STONE_FENCE, PURPLE_CUT_SAND_STONE_FENCE_GATE, "purple_cut_sand_stone");
        allVariantCraftingTable(exporter, PURPLE_CHISELED_SAND_STONE.asItem(), PURPLE_CHISELED_SAND_STONE_WALL, PURPLE_CHISELED_SAND_STONE_STAIR, PURPLE_CHISELED_SAND_STONE_SLAB, PURPLE_CHISELED_SAND_STONE_FENCE, PURPLE_CHISELED_SAND_STONE_FENCE_GATE, "purple_chiseled_sand_stone");
        allVariantCraftingTable(exporter, PURPLE_SMOOTH_SAND_STONE.asItem(), PURPLE_SMOOTH_SAND_STONE_WALL, PURPLE_SMOOTH_SAND_STONE_STAIR, PURPLE_SMOOTH_SAND_STONE_SLAB, PURPLE_SMOOTH_SAND_STONE_FENCE, PURPLE_SMOOTH_SAND_STONE_FENCE_GATE, "purple_smooth_sand_stone");
        allVariantCraftingTable(exporter, PURPLE_SAND_STONE.asItem(), PURPLE_SAND_STONE_WALL, PURPLE_SAND_STONE_STAIR, PURPLE_SAND_STONE_SLAB, PURPLE_SAND_STONE_FENCE, PURPLE_SAND_STONE_FENCE_GATE, "purple_sand_stone");
        allVariantCraftingTable(exporter, WHITE_CUT_SAND_STONE.asItem(), WHITE_CUT_SAND_STONE_WALL, WHITE_CUT_SAND_STONE_STAIR, WHITE_CUT_SAND_STONE_SLAB, WHITE_CUT_SAND_STONE_FENCE, WHITE_CUT_SAND_STONE_FENCE_GATE, "white_cut_sand_stone");
        allVariantCraftingTable(exporter, WHITE_CHISELED_SAND_STONE.asItem(), WHITE_CHISELED_SAND_STONE_WALL, WHITE_CHISELED_SAND_STONE_STAIR, WHITE_CHISELED_SAND_STONE_SLAB, WHITE_CHISELED_SAND_STONE_FENCE, WHITE_CHISELED_SAND_STONE_FENCE_GATE, "white_chiseled_sand_stone");
        allVariantCraftingTable(exporter, WHITE_SMOOTH_SAND_STONE.asItem(), WHITE_SMOOTH_SAND_STONE_WALL, WHITE_SMOOTH_SAND_STONE_STAIR, WHITE_SMOOTH_SAND_STONE_SLAB, WHITE_SMOOTH_SAND_STONE_FENCE, WHITE_SMOOTH_SAND_STONE_FENCE_GATE, "white_smooth_sand_stone");
        allVariantCraftingTable(exporter, WHITE_SAND_STONE.asItem(), WHITE_SAND_STONE_WALL, WHITE_SAND_STONE_STAIR, WHITE_SAND_STONE_SLAB, WHITE_SAND_STONE_FENCE, WHITE_SAND_STONE_FENCE_GATE, "white_sand_stone");
        allVariantCraftingTable(exporter, YELLOW_CUT_SAND_STONE.asItem(), YELLOW_CUT_SAND_STONE_WALL, YELLOW_CUT_SAND_STONE_STAIR, YELLOW_CUT_SAND_STONE_SLAB, YELLOW_CUT_SAND_STONE_FENCE, YELLOW_CUT_SAND_STONE_FENCE_GATE, "yellow_cut_sand_stone");
        allVariantCraftingTable(exporter, YELLOW_CHISELED_SAND_STONE.asItem(), YELLOW_CHISELED_SAND_STONE_WALL, YELLOW_CHISELED_SAND_STONE_STAIR, YELLOW_CHISELED_SAND_STONE_SLAB, YELLOW_CHISELED_SAND_STONE_FENCE, YELLOW_CHISELED_SAND_STONE_FENCE_GATE, "yellow_chiseled_sand_stone");
        allVariantCraftingTable(exporter, YELLOW_SMOOTH_SAND_STONE.asItem(), YELLOW_SMOOTH_SAND_STONE_WALL, YELLOW_SMOOTH_SAND_STONE_STAIR, YELLOW_SMOOTH_SAND_STONE_SLAB, YELLOW_SMOOTH_SAND_STONE_FENCE, YELLOW_SMOOTH_SAND_STONE_FENCE_GATE, "yellow_smooth_sand_stone");
        allVariantCraftingTable(exporter, YELLOW_SAND_STONE.asItem(), YELLOW_SAND_STONE_WALL, YELLOW_SAND_STONE_STAIR, YELLOW_SAND_STONE_SLAB, YELLOW_SAND_STONE_FENCE, YELLOW_SAND_STONE_FENCE_GATE, "yellow_sand_stone");
        // Wooden Things
        allVariantCraftingTable(exporter, Items.ACACIA_LOG, ACACIA_LOG_WALL, ACACIA_LOG_STAIR, ACACIA_LOG_SLAB, ACACIA_LOG_FENCE, ACACIA_LOG_FENCE_GATE, "acacia_log");
        allVariantCraftingTable(exporter, Items.ACACIA_WOOD, ACACIA_WOOD_WALL, ACACIA_WOOD_STAIR, ACACIA_WOOD_SLAB, ACACIA_WOOD_FENCE, ACACIA_WOOD_FENCE_GATE, "acacia_wood");
        allVariantCraftingTable(exporter, Items.STRIPPED_ACACIA_LOG, STRIPPED_ACACIA_LOG_WALL, STRIPPED_ACACIA_LOG_STAIR, STRIPPED_ACACIA_LOG_SLAB, STRIPPED_ACACIA_LOG_FENCE, STRIPPED_ACACIA_LOG_FENCE_GATE, "stripped_acacia_log");
        allVariantCraftingTable(exporter, Items.STRIPPED_ACACIA_WOOD, STRIPPED_ACACIA_WOOD_WALL, STRIPPED_ACACIA_WOOD_STAIR, STRIPPED_ACACIA_WOOD_SLAB, STRIPPED_ACACIA_WOOD_FENCE, STRIPPED_ACACIA_WOOD_FENCE_GATE, "stripped_acacia_wood");
        allVariantCraftingTable(exporter, Items.BIRCH_LOG, BIRCH_LOG_WALL, BIRCH_LOG_STAIR, BIRCH_LOG_SLAB, BIRCH_LOG_FENCE, BIRCH_LOG_FENCE_GATE, "birch_log");
        allVariantCraftingTable(exporter, Items.BIRCH_WOOD, BIRCH_WOOD_WALL, BIRCH_WOOD_STAIR, BIRCH_WOOD_SLAB, BIRCH_WOOD_FENCE, BIRCH_WOOD_FENCE_GATE, "birch_wood");
        allVariantCraftingTable(exporter, Items.STRIPPED_BIRCH_LOG, STRIPPED_BIRCH_LOG_WALL, STRIPPED_BIRCH_LOG_STAIR, STRIPPED_BIRCH_LOG_SLAB, STRIPPED_BIRCH_LOG_FENCE, STRIPPED_BIRCH_LOG_FENCE_GATE, "stripped_birch_log");
        allVariantCraftingTable(exporter, Items.STRIPPED_BIRCH_WOOD, STRIPPED_BIRCH_WOOD_WALL, STRIPPED_BIRCH_WOOD_STAIR, STRIPPED_BIRCH_WOOD_SLAB, STRIPPED_BIRCH_WOOD_FENCE, STRIPPED_BIRCH_WOOD_FENCE_GATE, "stripped_birch_wood");
        allVariantCraftingTable(exporter, Items.CHERRY_LOG, CHERRY_LOG_WALL, CHERRY_LOG_STAIR, CHERRY_LOG_SLAB, CHERRY_LOG_FENCE, CHERRY_LOG_FENCE_GATE, "cherry_log");
        allVariantCraftingTable(exporter, Items.CHERRY_WOOD, CHERRY_WOOD_WALL, CHERRY_WOOD_STAIR, CHERRY_WOOD_SLAB, CHERRY_WOOD_FENCE, CHERRY_WOOD_FENCE_GATE, "cherry_wood");
        allVariantCraftingTable(exporter, Items.STRIPPED_CHERRY_LOG, STRIPPED_CHERRY_LOG_WALL, STRIPPED_CHERRY_LOG_STAIR, STRIPPED_CHERRY_LOG_SLAB, STRIPPED_CHERRY_LOG_FENCE, STRIPPED_CHERRY_LOG_FENCE_GATE, "stripped_cherry_log");
        allVariantCraftingTable(exporter, Items.STRIPPED_CHERRY_WOOD, STRIPPED_CHERRY_WOOD_WALL, STRIPPED_CHERRY_WOOD_STAIR, STRIPPED_CHERRY_WOOD_SLAB, STRIPPED_CHERRY_WOOD_FENCE, STRIPPED_CHERRY_WOOD_FENCE_GATE, "stripped_cherry_wood");
        allVariantCraftingTable(exporter, Items.DARK_OAK_LOG, DARK_OAK_LOG_WALL, DARK_OAK_LOG_STAIR, DARK_OAK_LOG_SLAB, DARK_OAK_LOG_FENCE, DARK_OAK_LOG_FENCE_GATE, "dark_oak_log");
        allVariantCraftingTable(exporter, Items.DARK_OAK_WOOD, DARK_OAK_WOOD_WALL, DARK_OAK_WOOD_STAIR, DARK_OAK_WOOD_SLAB, DARK_OAK_WOOD_FENCE, DARK_OAK_WOOD_FENCE_GATE, "dark_oak_wood");
        allVariantCraftingTable(exporter, Items.STRIPPED_DARK_OAK_LOG, STRIPPED_DARK_OAK_LOG_WALL, STRIPPED_DARK_OAK_LOG_STAIR, STRIPPED_DARK_OAK_LOG_SLAB, STRIPPED_DARK_OAK_LOG_FENCE, STRIPPED_DARK_OAK_LOG_FENCE_GATE, "stripped_dark_oak_log");
        allVariantCraftingTable(exporter, Items.STRIPPED_DARK_OAK_WOOD, STRIPPED_DARK_OAK_WOOD_WALL, STRIPPED_DARK_OAK_WOOD_STAIR, STRIPPED_DARK_OAK_WOOD_SLAB, STRIPPED_DARK_OAK_WOOD_FENCE, STRIPPED_DARK_OAK_WOOD_FENCE_GATE, "stripped_dark_oak_wood");
        allVariantCraftingTable(exporter, Items.OAK_LOG, OAK_LOG_WALL, OAK_LOG_STAIR, OAK_LOG_SLAB, OAK_LOG_FENCE, OAK_LOG_FENCE_GATE, "oak_log");
        allVariantCraftingTable(exporter, Items.OAK_WOOD, OAK_WOOD_WALL, OAK_WOOD_STAIR, OAK_WOOD_SLAB, OAK_WOOD_FENCE, OAK_WOOD_FENCE_GATE, "oak_wood");
        allVariantCraftingTable(exporter, Items.STRIPPED_OAK_LOG, STRIPPED_OAK_LOG_WALL, STRIPPED_OAK_LOG_STAIR, STRIPPED_OAK_LOG_SLAB, STRIPPED_OAK_LOG_FENCE, STRIPPED_OAK_LOG_FENCE_GATE, "stripped_oak_log");
        allVariantCraftingTable(exporter, Items.STRIPPED_OAK_WOOD, STRIPPED_OAK_WOOD_WALL, STRIPPED_OAK_WOOD_STAIR, STRIPPED_OAK_WOOD_SLAB, STRIPPED_OAK_WOOD_FENCE, STRIPPED_OAK_WOOD_FENCE_GATE, "stripped_oak_wood");
        allVariantCraftingTable(exporter, Items.JUNGLE_LOG, JUNGLE_LOG_WALL, JUNGLE_LOG_STAIR, JUNGLE_LOG_SLAB, JUNGLE_LOG_FENCE, JUNGLE_LOG_FENCE_GATE, "jungle_log");
        allVariantCraftingTable(exporter, Items.JUNGLE_WOOD, JUNGLE_WOOD_WALL, JUNGLE_WOOD_STAIR, JUNGLE_WOOD_SLAB, JUNGLE_WOOD_FENCE, JUNGLE_WOOD_FENCE_GATE, "jungle_wood");
        allVariantCraftingTable(exporter, Items.STRIPPED_JUNGLE_LOG, STRIPPED_JUNGLE_LOG_WALL, STRIPPED_JUNGLE_LOG_STAIR, STRIPPED_JUNGLE_LOG_SLAB, STRIPPED_JUNGLE_LOG_FENCE, STRIPPED_JUNGLE_LOG_FENCE_GATE, "stripped_jungle_log");
        allVariantCraftingTable(exporter, Items.STRIPPED_JUNGLE_WOOD, STRIPPED_JUNGLE_WOOD_WALL, STRIPPED_JUNGLE_WOOD_STAIR, STRIPPED_JUNGLE_WOOD_SLAB, STRIPPED_JUNGLE_WOOD_FENCE, STRIPPED_JUNGLE_WOOD_FENCE_GATE, "stripped_jungle_wood");
        allVariantCraftingTable(exporter, Items.MANGROVE_LOG, MANGROVE_LOG_WALL, MANGROVE_LOG_STAIR, MANGROVE_LOG_SLAB, MANGROVE_LOG_FENCE, MANGROVE_LOG_FENCE_GATE, "mangrove_log");
        allVariantCraftingTable(exporter, Items.MANGROVE_WOOD, MANGROVE_WOOD_WALL, MANGROVE_WOOD_STAIR, MANGROVE_WOOD_SLAB, MANGROVE_WOOD_FENCE, MANGROVE_WOOD_FENCE_GATE, "mangrove_wood");
        allVariantCraftingTable(exporter, Items.STRIPPED_MANGROVE_LOG, STRIPPED_MANGROVE_LOG_WALL, STRIPPED_MANGROVE_LOG_STAIR, STRIPPED_MANGROVE_LOG_SLAB, STRIPPED_MANGROVE_LOG_FENCE, STRIPPED_MANGROVE_LOG_FENCE_GATE, "stripped_mangrove_log");
        allVariantCraftingTable(exporter, Items.STRIPPED_MANGROVE_WOOD, STRIPPED_MANGROVE_WOOD_WALL, STRIPPED_MANGROVE_WOOD_STAIR, STRIPPED_MANGROVE_WOOD_SLAB, STRIPPED_MANGROVE_WOOD_FENCE, STRIPPED_MANGROVE_WOOD_FENCE_GATE, "stripped_mangrove_wood");
        allVariantCraftingTable(exporter, Items.SPRUCE_LOG, SPRUCE_LOG_WALL, SPRUCE_LOG_STAIR, SPRUCE_LOG_SLAB, SPRUCE_LOG_FENCE, SPRUCE_LOG_FENCE_GATE, "spruce_log");
        allVariantCraftingTable(exporter, Items.SPRUCE_WOOD, SPRUCE_WOOD_WALL, SPRUCE_WOOD_STAIR, SPRUCE_WOOD_SLAB, SPRUCE_WOOD_FENCE, SPRUCE_WOOD_FENCE_GATE, "spruce_wood");
        allVariantCraftingTable(exporter, Items.STRIPPED_SPRUCE_LOG, STRIPPED_SPRUCE_LOG_WALL, STRIPPED_SPRUCE_LOG_STAIR, STRIPPED_SPRUCE_LOG_SLAB, STRIPPED_SPRUCE_LOG_FENCE, STRIPPED_SPRUCE_LOG_FENCE_GATE, "stripped_spruce_log");
        allVariantCraftingTable(exporter, Items.STRIPPED_SPRUCE_WOOD, STRIPPED_SPRUCE_WOOD_WALL, STRIPPED_SPRUCE_WOOD_STAIR, STRIPPED_SPRUCE_WOOD_SLAB, STRIPPED_SPRUCE_WOOD_FENCE, STRIPPED_SPRUCE_WOOD_FENCE_GATE, "stripped_spruce_wood");
        allVariantCraftingTable(exporter, Items.CRIMSON_STEM, CRIMSON_STEM_WALL, CRIMSON_STEM_STAIR, CRIMSON_STEM_SLAB, CRIMSON_STEM_FENCE, CRIMSON_STEM_FENCE_GATE, "crimson_stem");
        allVariantCraftingTable(exporter, Items.CRIMSON_HYPHAE, CRIMSON_HYPHAE_WALL, CRIMSON_HYPHAE_STAIR, CRIMSON_HYPHAE_SLAB, CRIMSON_HYPHAE_FENCE, CRIMSON_HYPHAE_FENCE_GATE, "crimson_hyphae");
        allVariantCraftingTable(exporter, Items.STRIPPED_CRIMSON_STEM, STRIPPED_CRIMSON_STEM_WALL, STRIPPED_CRIMSON_STEM_STAIR, STRIPPED_CRIMSON_STEM_SLAB, STRIPPED_CRIMSON_STEM_FENCE, STRIPPED_CRIMSON_STEM_FENCE_GATE, "stripped_crimson_stem");
        allVariantCraftingTable(exporter, Items.STRIPPED_CRIMSON_HYPHAE, STRIPPED_CRIMSON_HYPHAE_WALL, STRIPPED_CRIMSON_HYPHAE_STAIR, STRIPPED_CRIMSON_HYPHAE_SLAB, STRIPPED_CRIMSON_HYPHAE_FENCE, STRIPPED_CRIMSON_HYPHAE_FENCE_GATE, "stripped_crimson_hyphae");
        allVariantCraftingTable(exporter, Items.WARPED_STEM, WARPED_STEM_WALL, WARPED_STEM_STAIR, WARPED_STEM_SLAB, WARPED_STEM_FENCE, WARPED_STEM_FENCE_GATE, "warped_stem");
        allVariantCraftingTable(exporter, Items.WARPED_HYPHAE, WARPED_HYPHAE_WALL, WARPED_HYPHAE_STAIR, WARPED_HYPHAE_SLAB, WARPED_HYPHAE_FENCE, WARPED_HYPHAE_FENCE_GATE, "warped_hyphae");
        allVariantCraftingTable(exporter, Items.STRIPPED_WARPED_STEM, STRIPPED_WARPED_STEM_WALL, STRIPPED_WARPED_STEM_STAIR, STRIPPED_WARPED_STEM_SLAB, STRIPPED_WARPED_STEM_FENCE, STRIPPED_WARPED_STEM_FENCE_GATE, "stripped_warped_stem");
        allVariantCraftingTable(exporter, Items.STRIPPED_WARPED_HYPHAE, STRIPPED_WARPED_HYPHAE_WALL, STRIPPED_WARPED_HYPHAE_STAIR, STRIPPED_WARPED_HYPHAE_SLAB, STRIPPED_WARPED_HYPHAE_FENCE, STRIPPED_WARPED_HYPHAE_FENCE_GATE, "stripped_warped_hyphae");
        allVariantCraftingTable(exporter, Items.BLACK_CONCRETE, BLACK_CONCRETE_WALL, BLACK_CONCRETE_STAIR, BLACK_CONCRETE_SLAB, BLACK_CONCRETE_FENCE, BLACK_CONCRETE_FENCE_GATE, "black_concrete");
        allVariantCraftingTable(exporter, Items.BLUE_CONCRETE, BLUE_CONCRETE_WALL, BLUE_CONCRETE_STAIR, BLUE_CONCRETE_SLAB, BLUE_CONCRETE_FENCE, BLUE_CONCRETE_FENCE_GATE, "blue_concrete");
        allVariantCraftingTable(exporter, Items.BROWN_CONCRETE, BROWN_CONCRETE_WALL, BROWN_CONCRETE_STAIR, BROWN_CONCRETE_SLAB, BROWN_CONCRETE_FENCE, BROWN_CONCRETE_FENCE_GATE, "brown_concrete");
        allVariantCraftingTable(exporter, Items.CYAN_CONCRETE, CYAN_CONCRETE_WALL, CYAN_CONCRETE_STAIR, CYAN_CONCRETE_SLAB, CYAN_CONCRETE_FENCE, CYAN_CONCRETE_FENCE_GATE, "cyan_concrete");
        allVariantCraftingTable(exporter, Items.GRAY_CONCRETE, GRAY_CONCRETE_WALL, GRAY_CONCRETE_STAIR, GRAY_CONCRETE_SLAB, GRAY_CONCRETE_FENCE, GRAY_CONCRETE_FENCE_GATE, "gray_concrete");
        allVariantCraftingTable(exporter, Items.GREEN_CONCRETE, GREEN_CONCRETE_WALL, GREEN_CONCRETE_STAIR, GREEN_CONCRETE_SLAB, GREEN_CONCRETE_FENCE, GREEN_CONCRETE_FENCE_GATE, "green_concrete");
        allVariantCraftingTable(exporter, Items.LIGHT_BLUE_CONCRETE, LIGHT_BLUE_CONCRETE_WALL, LIGHT_BLUE_CONCRETE_STAIR, LIGHT_BLUE_CONCRETE_SLAB, LIGHT_BLUE_CONCRETE_FENCE, LIGHT_BLUE_CONCRETE_FENCE_GATE, "light_blue_concrete");
        allVariantCraftingTable(exporter, Items.LIGHT_GRAY_CONCRETE, LIGHT_GRAY_CONCRETE_WALL, LIGHT_GRAY_CONCRETE_STAIR, LIGHT_GRAY_CONCRETE_SLAB, LIGHT_GRAY_CONCRETE_FENCE, LIGHT_GRAY_CONCRETE_FENCE_GATE, "light_gray_concrete");
        allVariantCraftingTable(exporter, Items.LIME_CONCRETE, LIME_CONCRETE_WALL, LIME_CONCRETE_STAIR, LIME_CONCRETE_SLAB, LIME_CONCRETE_FENCE, LIME_CONCRETE_FENCE_GATE, "lime_concrete");
        allVariantCraftingTable(exporter, Items.MAGENTA_CONCRETE, MAGENTA_CONCRETE_WALL, MAGENTA_CONCRETE_STAIR, MAGENTA_CONCRETE_SLAB, MAGENTA_CONCRETE_FENCE, MAGENTA_CONCRETE_FENCE_GATE, "magenta_concrete");
        allVariantCraftingTable(exporter, Items.ORANGE_CONCRETE, ORANGE_CONCRETE_WALL, ORANGE_CONCRETE_STAIR, ORANGE_CONCRETE_SLAB, ORANGE_CONCRETE_FENCE, ORANGE_CONCRETE_FENCE_GATE, "orange_concrete");
        allVariantCraftingTable(exporter, Items.PINK_CONCRETE, PINK_CONCRETE_WALL, PINK_CONCRETE_STAIR, PINK_CONCRETE_SLAB, PINK_CONCRETE_FENCE, PINK_CONCRETE_FENCE_GATE, "pink_concrete");
        allVariantCraftingTable(exporter, Items.PURPLE_CONCRETE, PURPLE_CONCRETE_WALL, PURPLE_CONCRETE_STAIR, PURPLE_CONCRETE_SLAB, PURPLE_CONCRETE_FENCE, PURPLE_CONCRETE_FENCE_GATE, "purple_concrete");
        allVariantCraftingTable(exporter, Items.RED_CONCRETE, RED_CONCRETE_WALL, RED_CONCRETE_STAIR, RED_CONCRETE_SLAB, RED_CONCRETE_FENCE, RED_CONCRETE_FENCE_GATE, "red_concrete");
        allVariantCraftingTable(exporter, Items.WHITE_CONCRETE, WHITE_CONCRETE_WALL, WHITE_CONCRETE_STAIR, WHITE_CONCRETE_SLAB, WHITE_CONCRETE_FENCE, WHITE_CONCRETE_FENCE_GATE, "white_concrete");
        allVariantCraftingTable(exporter, Items.YELLOW_CONCRETE, YELLOW_CONCRETE_WALL, YELLOW_CONCRETE_STAIR, YELLOW_CONCRETE_SLAB, YELLOW_CONCRETE_FENCE, YELLOW_CONCRETE_FENCE_GATE, "yellow_concrete");
        allVariantCraftingTable(exporter, Items.ACACIA_LEAVES, ACACIA_HEDGE, ACACIA_LEAF_STAIR, ACACIA_LEAF_SLAB, ACACIA_LEAF_FENCE, ACACIA_LEAF_FENCE_GATE, "acacia_leaves");
        allVariantCraftingTable(exporter, Items.AZALEA_LEAVES, AZALEA_HEDGE, AZALEA_LEAF_STAIR, AZALEA_LEAF_SLAB, AZALEA_LEAF_FENCE, AZALEA_LEAF_FENCE_GATE, "azalea_leaves");
        allVariantCraftingTable(exporter, Items.BIRCH_LEAVES, BIRCH_HEDGE, BIRCH_LEAF_STAIR, BIRCH_LEAF_SLAB, BIRCH_LEAF_FENCE, BIRCH_LEAF_FENCE_GATE, "birch_leaves");
        allVariantCraftingTable(exporter, Items.CHERRY_LEAVES, CHERRY_HEDGE, CHERRY_LEAF_STAIR, CHERRY_LEAF_SLAB, CHERRY_LEAF_FENCE, CHERRY_LEAF_FENCE_GATE, "cherry_leaves");
        allVariantCraftingTable(exporter, Items.DARK_OAK_LEAVES, DARK_OAK_HEDGE, DARK_OAK_LEAF_STAIR, DARK_OAK_LEAF_SLAB, DARK_OAK_LEAF_FENCE, DARK_OAK_LEAF_FENCE_GATE, "dark_oak_leaves");
        allVariantCraftingTable(exporter, Items.FLOWERING_AZALEA_LEAVES, FLOWERING_AZALEA_HEDGE, FLOWERING_AZALEA_LEAF_STAIR, FLOWERING_AZALEA_LEAF_SLAB, FLOWERING_AZALEA_LEAF_FENCE, FLOWERING_AZALEA_LEAF_FENCE_GATE, "flowering_azalea_leaves");
        allVariantCraftingTable(exporter, Items.JUNGLE_LEAVES, JUNGLE_HEDGE, JUNGLE_LEAF_STAIR, JUNGLE_LEAF_SLAB, JUNGLE_LEAF_FENCE, JUNGLE_LEAF_FENCE_GATE, "jungle_leaves");
        allVariantCraftingTable(exporter, Items.MANGROVE_LEAVES, MANGROVE_HEDGE, MANGROVE_LEAF_STAIR, MANGROVE_LEAF_SLAB, MANGROVE_LEAF_FENCE, MANGROVE_LEAF_FENCE_GATE, "mangrove_leaves");
        allVariantCraftingTable(exporter, Items.OAK_LEAVES, OAK_HEDGE, OAK_LEAF_STAIR, OAK_LEAF_SLAB, OAK_LEAF_FENCE, OAK_LEAF_FENCE_GATE, "oak_leaves");
        allVariantCraftingTable(exporter, Items.SPRUCE_LEAVES, SPRUCE_HEDGE, SPRUCE_LEAF_STAIR, SPRUCE_LEAF_SLAB, SPRUCE_LEAF_FENCE, SPRUCE_LEAF_FENCE_GATE, "spruce_leaves");
        reversedAllVariantCraftingTable(exporter, Items.GLOWSTONE, Items.GLOWSTONE_DUST, 4, GLOWSTONE_WALL, GLOWSTONE_STAIR, GLOWSTONE_SLAB, GLOWSTONE_FENCE, GLOWSTONE_FENCE_GATE, "glowstone");
        allVariantCraftingTable(exporter, Items.BASALT, COBBLED_BASALT_WALL, COBBLED_BASALT_STAIR, null, COBBLED_BASALT_FENCE, COBBLED_BASALT_FENCE_GATE, "cobbled_basalt");
        allVariantCraftingTable(exporter, Items.BASALT, null, null, BASALT_SLAB, null, null, "basalt");
        allVariantCraftingTable(exporter, Items.SMOOTH_BASALT, SMOOTH_BASALT_WALL, SMOOTH_BASALT_STAIR, SMOOTH_BASALT_SLAB, SMOOTH_BASALT_FENCE,SMOOTH_BASALT_FENCE_GATE, "smooth_basalt");
        allVariantCraftingTable(exporter, Items.POLISHED_BASALT, POLISHED_BASALT_WALL, POLISHED_BASALT_STAIR, POLISHED_BASALT_SLAB, POLISHED_BASALT_FENCE, POLISHED_BASALT_FENCE_GATE, "polished_basalt");
        allVariantCraftingTable(exporter, Items.END_STONE, END_STONE_WALL, END_STONE_STAIR, END_STONE_SLAB, END_STONE_FENCE, END_STONE_FENCE_GATE, "end_stone");
        allVariantCraftingTable(exporter, Items.DRIPSTONE_BLOCK, DRIPSTONE_WALL, DRIPSTONE_STAIR, DRIPSTONE_SLAB, DRIPSTONE_FENCE, DRIPSTONE_FENCE_GATE, "dripstone");
        allVariantCraftingTable(exporter, Items.CRACKED_POLISHED_BLACKSTONE_BRICKS, CRACKED_POLISHED_BLACKSTONE_BRICK_WALL, CRACKED_POLISHED_BLACKSTONE_BRICK_STAIR, CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE, CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE_GATE, "cracked_polished_blackstone_brick");
        allVariantCraftingTable(exporter, Items.RAW_GOLD_BLOCK, RAW_GOLD_WALL, RAW_GOLD_STAIR, RAW_GOLD_SLAB, RAW_GOLD_FENCE, RAW_GOLD_FENCE_GATE, "raw_gold");
        allVariantCraftingTable(exporter, Items.RAW_COPPER_BLOCK, RAW_COPPER_WALL, RAW_COPPER_STAIR, RAW_COPPER_SLAB, RAW_COPPER_FENCE, RAW_COPPER_FENCE_GATE, "raw_copper");
        allVariantCraftingTable(exporter, Items.RAW_IRON_BLOCK, RAW_IRON_WALL, RAW_IRON_STAIR, RAW_IRON_SLAB, RAW_IRON_FENCE, RAW_IRON_FENCE_GATE, "raw_iron");
        allVariantCraftingTable(exporter, Items.PURPUR_BLOCK, PURPUR_BLOCK_WALL, null, null, PURPUR_BLOCK_FENCE, PURPUR_BLOCK_FENCE_GATE, "purpur_block");
        allVariantCraftingTable(exporter, Items.COAL_BLOCK, COAL_BLOCK_WALL, COAL_BLOCK_STAIR, COAL_BLOCK_SLAB, COAL_BLOCK_FENCE, COAL_BLOCK_FENCE_GATE, "coal_block");
        allVariantCraftingTable(exporter, Items.CHISELED_POLISHED_BLACKSTONE, CHISELED_POLISHED_BLACKSTONE_WALL, CHISELED_POLISHED_BLACKSTONE_STAIR, CHISELED_POLISHED_BLACKSTONE_SLAB, CHISELED_POLISHED_BLACKSTONE_FENCE, CHISELED_POLISHED_BLACKSTONE_FENCE_GATE, "chiseled_polished_blackstone");
        allVariantCraftingTable(exporter, Items.BONE_BLOCK, BONE_BLOCK_WALL, BONE_BLOCK_STAIR, BONE_BLOCK_SLAB, BONE_BLOCK_FENCE, BONE_BLOCK_FENCE_GATE, "bone_block");
        reversedAllVariantCraftingTable(exporter, Items.DRIED_KELP_BLOCK, Items.DRIED_KELP, 9, DRIED_KELP_WALL, DRIED_KELP_STAIR, DRIED_KELP_SLAB, DRIED_KELP_FENCE, DRIED_KELP_FENCE_GATE, "dried_kelp");
        allVariantCraftingTable(exporter, Items.NETHERRACK, NETHERRACK_WALL, NETHERRACK_STAIR, NETHERRACK_SLAB, NETHERRACK_FENCE, NETHERRACK_FENCE_GATE, "netherrack");
        allVariantCraftingTable(exporter, Items.SHROOMLIGHT, SHROOMLIGHT_WALL, SHROOMLIGHT_STAIR, SHROOMLIGHT_SLAB, SHROOMLIGHT_FENCE, SHROOMLIGHT_FENCE_GATE, "shroomlight");
        allVariantCraftingTable(exporter, Items.MAGMA_BLOCK, MAGMA_BLOCK_WALL, MAGMA_BLOCK_STAIR, MAGMA_BLOCK_SLAB, MAGMA_BLOCK_FENCE, MAGMA_BLOCK_FENCE_GATE, "magma_block");
        allVariantCraftingTable(exporter, Items.NETHER_BRICKS, null, null, null, null, NETHERBRICK_FENCE_GATE, "nether_brick");
        allVariantCraftingTable(exporter, Items.RED_NETHER_BRICKS, null, null, null, RED_NETHERBRICK_FENCE, RED_NETHERBRICK_FENCE_GATE, "red_nether_brick");
        allVariantCraftingTable(exporter, Items.SCULK, SCULK_WALL, SCULK_STAIR, SCULK_SLAB, SCULK_FENCE, SCULK_FENCE_GATE_BLOCK, "sculk");
        allVariantCraftingTable(exporter, Items.PACKED_MUD, PACKED_MUD_WALL, PACKED_MUD_STAIR, PACKED_MUD_SLAB, PACKED_MUD_FENCE, PACKED_MUD_FENCE_GATE_BLOCK, "packed_mud");
        allVariantCraftingTable(exporter, Items.MUDDY_MANGROVE_ROOTS, MUDDY_MANGROVE_ROOT_WALL, MUDDY_MANGROVE_ROOT_STAIR, MUDDY_MANGROVE_ROOT_SLAB, MUDDY_MANGROVE_ROOT_FENCE, MUDDY_MANGROVE_ROOT_FENCE_GATE, "muddy_mangrove_root");
        reversedAllVariantCraftingTable(exporter, Items.MANGROVE_ROOTS, Items.STICK, 3, MANGROVE_ROOT_WALL, MANGROVE_ROOT_STAIR, MANGROVE_ROOT_SLAB, MANGROVE_ROOT_FENCE, MANGROVE_ROOT_FENCE_GATE, "mangrove_root");
        allVariantCraftingTable(exporter, Items.OCHRE_FROGLIGHT, OCHRE_FROGLIGHT_WALL, OCHRE_FROGLIGHT_STAIR, OCHRE_FROGLIGHT_SLAB, OCHRE_FROGLIGHT_FENCE, OCHRE_FROGLIGHT_FENCE_GATE, "ochre_froglight");
        allVariantCraftingTable(exporter, Items.VERDANT_FROGLIGHT, VERDANT_FROGLIGHT_WALL, VERDANT_FROGLIGHT_STAIR, VERDANT_FROGLIGHT_SLAB, VERDANT_FROGLIGHT_FENCE, VERDANT_FROGLIGHT_FENCE_GATE, "verdant_froglight");
        allVariantCraftingTable(exporter, Items.PEARLESCENT_FROGLIGHT, PEARLESCENT_FROGLIGHT_WALL, PEARLESCENT_FROGLIGHT_STAIR, PEARLESCENT_FROGLIGHT_SLAB, PEARLESCENT_FROGLIGHT_FENCE, PEARLESCENT_FROGLIGHT_FENCE_GATE, "pearlescent_froglight");

        allVariantCraftingTable(exporter, Items.TERRACOTTA, TERRACOTTA_WALL, TERRACOTTA_STAIR, TERRACOTTA_SLAB, TERRACOTTA_FENCE, TERRACOTTA_FENCE_GATE, "terracotta");
        allVariantCraftingTable(exporter, Items.BLACK_TERRACOTTA, BLACK_TERRACOTTA_WALL, BLACK_TERRACOTTA_STAIR, BLACK_TERRACOTTA_SLAB, BLACK_TERRACOTTA_FENCE, BLACK_TERRACOTTA_FENCE_GATE, "black_terracotta");
        allVariantCraftingTable(exporter, Items.BLUE_TERRACOTTA, BLUE_TERRACOTTA_WALL, BLUE_TERRACOTTA_STAIR, BLUE_TERRACOTTA_SLAB, BLUE_TERRACOTTA_FENCE, BLUE_TERRACOTTA_FENCE_GATE, "blue_terracotta");
    }
    private void reversedAllVariantCraftingTable(RecipeExporter exporter, Item baseItem, Item reverseTarget, int reclaimMultiplier, WallBlock wallBlock, StairsBlock stairsBlock, SlabBlock slabBlock, FenceBlock fenceBlock, FenceGateBlock fenceGateBlock, String pathKey) {
        if (wallBlock != null) { reversed(exporter, wallBlock.asItem(), reverseTarget, reclaimMultiplier, "table/reversed/" + pathKey + "_wall"); }
        if (slabBlock != null) { reversed(exporter, slabBlock.asItem(), reverseTarget, reclaimMultiplier, "table/reversed/" + pathKey + "_slab"); }
        if (stairsBlock != null) { reversed(exporter, stairsBlock.asItem(), reverseTarget, reclaimMultiplier, "table/reversed/" + pathKey + "_stair"); }
        if (fenceBlock != null) { reversed(exporter, fenceBlock.asItem(), reverseTarget, reclaimMultiplier, "table/reversed/" + pathKey + "_fence"); }
        if (fenceGateBlock != null) { reversed(exporter, fenceGateBlock.asItem(), reverseTarget, reclaimMultiplier, "table/reversed/" + pathKey + "_fence_gate"); }
        allVariantCraftingTable(exporter, baseItem, wallBlock, stairsBlock, slabBlock, fenceBlock, fenceGateBlock, pathKey);
    }
    private void allVariantCraftingTable(RecipeExporter exporter, Item baseItem, WallBlock wallBlock, StairsBlock stairsBlock, SlabBlock slabBlock, FenceBlock fenceBlock, FenceGateBlock fenceGateBlock, String pathKey) {
        if (wallBlock != null) { variantWall(exporter, baseItem, wallBlock.asItem(), "table/walls/" + pathKey + "_wall"); }
        if (slabBlock != null) { variantSlab(exporter, baseItem, slabBlock.asItem(), "table/slabs/" + pathKey + "_slab"); }
        if (stairsBlock != null) { variantStair(exporter, baseItem, stairsBlock.asItem(), "table/stairs/" + pathKey + "_stair"); }
        if (fenceBlock != null) { variantFence(exporter, baseItem, fenceBlock.asItem(), "table/fences/" + pathKey + "_fence"); }
        if (fenceGateBlock != null) { variantFenceGate(exporter, baseItem, fenceGateBlock.asItem(), "table/fence_gates/" + pathKey + "_fence_gate"); }
    }
    private void variantWall(RecipeExporter exporter, Item baseItem, Item wallItem, String path) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, wallItem, 6).group("walls").pattern("xxx").pattern("xxx").input('x', baseItem).criterion(hasItem(baseItem), conditionsFromItem(baseItem)).offerTo(exporter, Identifier.of(Delbase.Delbase_ID, path));
    }
    private void variantSlab(RecipeExporter exporter, Item baseItem, Item slabItem, String path) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, slabItem, 6).group("slabs").pattern("xxx").input('x', baseItem).criterion(hasItem(baseItem), conditionsFromItem(baseItem)).offerTo(exporter, Identifier.of(Delbase.Delbase_ID, path));
    }
    private void variantStair(RecipeExporter exporter, Item baseItem, Item stairItem, String path) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, stairItem, 4).group("stairs").pattern("x  ").pattern("xx ").pattern("xxx").input('x', baseItem).criterion(hasItem(baseItem), conditionsFromItem(baseItem)).offerTo(exporter, Identifier.of(Delbase.Delbase_ID, path));
    }
    private void variantFence(RecipeExporter exporter, Item baseItem, Item fenceItem, String path) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, fenceItem, 3).group("fences").pattern("xsx").pattern("xsx").input('x', baseItem).input('s', Items.STICK).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).criterion(hasItem(baseItem), conditionsFromItem(baseItem)).offerTo(exporter, Identifier.of(Delbase.Delbase_ID, path));
    }
    private void variantFenceGate(RecipeExporter exporter, Item baseItem, Item fenceGateItem, String path) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, fenceGateItem, 1).group("fence_gates").pattern("sxs").pattern("sxs").input('x', baseItem).input('s', Items.STICK).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).criterion(hasItem(baseItem), conditionsFromItem(baseItem)).offerTo(exporter, Identifier.of(Delbase.Delbase_ID, path));
    }
    private void reversed(RecipeExporter exporter, Item baseItem, Item Target, int count, String path) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Target, count).criterion(hasItem(baseItem), conditionsFromItem(baseItem)).offerTo(exporter, Identifier.of(Delbase.Delbase_ID, path));
    }
}