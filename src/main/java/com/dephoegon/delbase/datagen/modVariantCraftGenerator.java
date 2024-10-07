package com.dephoegon.delbase.datagen;

import com.dephoegon.delbase.Delbase;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.*;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

import static com.dephoegon.delbase.block.axis.axisCutSandStones.*;
import static com.dephoegon.delbase.block.fence.chiseledSandStoneFences.*;
import static com.dephoegon.delbase.block.fence.cutSandStoneFence.*;
import static com.dephoegon.delbase.block.fence.sandFences.*;
import static com.dephoegon.delbase.block.fence.sandStoneFences.*;
import static com.dephoegon.delbase.block.fence.smoothSandStoneFences.*;
import static com.dephoegon.delbase.block.general.genChiseledSandStones.*;
import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.block.general.genSmoothSandStones.*;
import static com.dephoegon.delbase.block.gravity.gravColorSolidSand.*;
import static com.dephoegon.delbase.block.slabs.slabChiseledSandStones.*;
import static com.dephoegon.delbase.block.slabs.slabCutSandStones.*;
import static com.dephoegon.delbase.block.slabs.slabSandStones.*;
import static com.dephoegon.delbase.block.slabs.slabSands.*;
import static com.dephoegon.delbase.block.slabs.slabSmoothSandStones.*;
import static com.dephoegon.delbase.block.stair.stairChiseledSandStones.*;
import static com.dephoegon.delbase.block.stair.stairCutSandStones.*;
import static com.dephoegon.delbase.block.stair.stairSandStones.*;
import static com.dephoegon.delbase.block.stair.stairSands.*;
import static com.dephoegon.delbase.block.stair.stairSmoothSandStones.*;
import static com.dephoegon.delbase.block.wall.wallChiseledSandStones.*;
import static com.dephoegon.delbase.block.wall.wallCutSandStones.*;
import static com.dephoegon.delbase.block.wall.wallSandStones.*;
import static com.dephoegon.delbase.block.wall.wallSands.*;
import static com.dephoegon.delbase.block.wall.wallSmoothSandStones.*;

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
}