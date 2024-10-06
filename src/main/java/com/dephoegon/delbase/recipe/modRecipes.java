package com.dephoegon.delbase.recipe;

import com.dephoegon.delbase.Delbase;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class modRecipes {
    public static final RecipeSerializer<cutterRecipe> CUTTER_RECIPE_RECIPE_SERIALIZER = Registry.register(Registries.RECIPE_SERIALIZER, Identifier.of(Delbase.Delbase_ID, cutterRecipe.id_name), new cutterRecipe.Serializer());
    public static final RecipeType<cutterRecipe> CUTTER_RECIPE_RECIPE_TYPE = Registry.register(Registries.RECIPE_TYPE, Identifier.of(Delbase.Delbase_ID, cutterRecipe.id_name), new RecipeType<>() {
        public String toString() { return cutterRecipe.id_name; }
    });

    public static void registerRecipes() {
        Delbase.LOGGER.info("Registering Custom Recipes for " + Delbase.Delbase_ID);
    }
}