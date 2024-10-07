package com.dephoegon.delbase.datagen;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.item.BlockCutterItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class modSalvageRecipeGenerator extends FabricRecipeProvider {
    public modSalvageRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        GenSalvage(exporter, Items.CHAIN, Items.CHAINMAIL_CHESTPLATE, 7, "salvage/armor/chest/salvage_chainmail_chestplate");
        GenSalvage(exporter, Items.CHAIN, Items.CHAINMAIL_LEGGINGS, 6, "salvage/armor/leg/salvage_chainmail_legging");
        GenSalvage(exporter, Items.CHAIN, Items.CHAINMAIL_HELMET, 4, "salvage/armor/head/salvage_chainmail_helmet");
        GenSalvage(exporter, Items.CHAIN, Items.CHAINMAIL_BOOTS, 3, "salvage/armor/foot/salvage_chainmail_boots");
        GenSalvage(exporter, Items.IRON_INGOT, Items.IRON_CHESTPLATE, 5, "salvage/armor/chest/salvage_iron_chestplate");
        GenSalvage(exporter, Items.IRON_INGOT, Items.IRON_LEGGINGS, 4, "salvage/armor/leg/salvage_iron_legging");
        GenSalvage(exporter, Items.IRON_INGOT, Items.IRON_HELMET, 3, "salvage/armor/head/salvage_iron_helmet");
        GenSalvage(exporter, Items.IRON_INGOT, Items.IRON_BOOTS, 2, "salvage/armor/foot/salvage_iron_boots");
        GenSalvage(exporter, Items.IRON_INGOT, Items.IRON_HORSE_ARMOR, 5, "salvage/armor/horse/salvage_iron_horse_armor");
        GenSalvage(exporter, Items.LEATHER, Items.LEATHER_CHESTPLATE, 5, "salvage/armor/chest/salvage_leather_chestplate");
        GenSalvage(exporter, Items.LEATHER, Items.LEATHER_LEGGINGS, 4, "salvage/armor/leg/salvage_leather_legging");
        GenSalvage(exporter, Items.LEATHER, Items.LEATHER_HELMET, 3, "salvage/armor/head/salvage_leather_helmet");
        GenSalvage(exporter, Items.LEATHER, Items.LEATHER_BOOTS, 2, "salvage/armor/foot/salvage_leather_boots");
        GenSalvage(exporter, Items.LEATHER, Items.LEATHER_HORSE_ARMOR, 5, "salvage/armor/horse/salvage_leather_horse_armor");
        GenSalvage(exporter, Items.GOLD_INGOT, Items.GOLDEN_CHESTPLATE, 5, "salvage/armor/chest/salvage_golden_chestplate");
        GenSalvage(exporter, Items.GOLD_INGOT, Items.GOLDEN_LEGGINGS, 4, "salvage/armor/leg/salvage_golden_legging");
        GenSalvage(exporter, Items.GOLD_INGOT, Items.GOLDEN_HELMET, 3, "salvage/armor/head/salvage_golden_helmet");
        GenSalvage(exporter, Items.GOLD_INGOT, Items.GOLDEN_BOOTS, 2, "salvage/armor/foot/salvage_golden_boots");
        GenSalvage(exporter, Items.GOLD_INGOT, Items.GOLDEN_HORSE_ARMOR, 5, "salvage/armor/foot/salvage_golden_horse_armor");
        GenSalvage(exporter, Items.DIAMOND, Items.DIAMOND_CHESTPLATE, 5, "salvage/armor/chest/salvage_diamond_chestplate");
        GenSalvage(exporter, Items.DIAMOND, Items.DIAMOND_LEGGINGS, 4, "salvage/armor/leg/salvage_diamond_legging");
        GenSalvage(exporter, Items.DIAMOND, Items.DIAMOND_HELMET, 3, "salvage/armor/head/salvage_diamond_helmet");
        GenSalvage(exporter, Items.DIAMOND, Items.DIAMOND_BOOTS, 2, "salvage/armor/foot/salvage_diamond_boots");
        GenSalvage(exporter, Items.DIAMOND, Items.DIAMOND_HORSE_ARMOR, 5, "salvage/armor/horse/salvage_diamond_horse_armor");
        GenSalvage(exporter, Items.NETHERITE_INGOT, Items.NETHERITE_CHESTPLATE, 1, "salvage/armor/chest/salvage_netherite_chestplate");
        GenSalvage(exporter, Items.NETHERITE_INGOT, Items.NETHERITE_LEGGINGS, 1, "salvage/armor/leg/salvage_netherite_legging");
        GenSalvage(exporter, Items.NETHERITE_INGOT, Items.NETHERITE_HELMET, 1, "salvage/armor/head/salvage_netherite_helmet");
        GenSalvage(exporter, Items.NETHERITE_INGOT, Items.NETHERITE_BOOTS, 1, "salvage/armor/foot/salvage_netherite_boots");

        GenSalvageTag(exporter, Items.GRAVEL, ItemTags.STONE_CRAFTING_MATERIALS,2, "salvage/blocks/salvage_stone");
        GenSalvage(exporter, Items.SAND, Items.GRAVEL,2, "salvage/blocks/salvage_gravel");


    }
    private void GenSalvage(RecipeExporter exporter, Item target, Item toSalvage, int count, String path) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, target, count).group("salvage").input(BlockCutterItems.ARMOR_COMPOUND).input(toSalvage).criterion(hasItem(BlockCutterItems.ARMOR_COMPOUND), conditionsFromItem(BlockCutterItems.ARMOR_COMPOUND)).criterion(hasItem(toSalvage), conditionsFromItem(toSalvage)).offerTo(exporter, Identifier.of(Delbase.Delbase_ID, path));
    }
    @SuppressWarnings("SameParameterValue")
    private void GenSalvageTag(RecipeExporter exporter, Item target, TagKey<Item> toSalvage, int count, String path) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, target, count).group("salvage").input(BlockCutterItems.ARMOR_COMPOUND).input(toSalvage).criterion(hasItem(BlockCutterItems.ARMOR_COMPOUND), conditionsFromItem(BlockCutterItems.ARMOR_COMPOUND)).offerTo(exporter, Identifier.of(Delbase.Delbase_ID, path));
    }
}