package com.dephoegon.delbase.aid.recipe;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class modRecipes {
    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, blockCutterStationRecipes.Serializer.ID, blockCutterStationRecipes.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, blockCutterStationRecipes.Type.ID, blockCutterStationRecipes.Type.INSTANCE);
    }
}