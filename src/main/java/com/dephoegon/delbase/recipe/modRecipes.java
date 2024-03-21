package com.dephoegon.delbase.recipe;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.recipe.blockCutterStationRecipes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class modRecipes {
    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(Delbase.Delbase_ID, blockCutterStationRecipes.Serializer.ID), blockCutterStationRecipes.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(Delbase.Delbase_ID, blockCutterStationRecipes.Type.ID), blockCutterStationRecipes.Type.INSTANCE);
    }
}
