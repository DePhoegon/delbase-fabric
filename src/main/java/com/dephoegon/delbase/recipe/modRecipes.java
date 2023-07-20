package com.dephoegon.delbase.recipe;

import com.dephoegon.delbase.Delbase;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class modRecipes {
    public static void registerRecipes() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Delbase.Delbase_ID, blockCutterStationRecipes.Serializer.ID), blockCutterStationRecipes.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(Delbase.Delbase_ID, blockCutterStationRecipes.Type.ID), blockCutterStationRecipes.Type.INSTANCE);
    }
}
