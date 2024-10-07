package com.dephoegon.delbase.compat;

import com.dephoegon.delbase.block.general.machineBlock;
import com.dephoegon.delbase.recipe.cutterRecipe;
import com.dephoegon.delbase.recipe.modRecipes;
import com.dephoegon.delbase.screen.blockCuttingStationScreen;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.client.registry.screen.ScreenRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import org.jetbrains.annotations.NotNull;


public class delbaseREIClient implements REIClientPlugin {
    public void registerCategories(@NotNull CategoryRegistry registry) {
        registry.add(new cutterCategory());

        registry.addWorkstations(cutterCategory.CUTTER_DISPLAY_CATEGORY_IDENTIFIER, EntryStacks.of(machineBlock.BLOCK_CUTTER_STATION));
    }

    public void registerDisplays(DisplayRegistry registry) {
        registry.registerRecipeFiller(cutterRecipe.class, modRecipes.CUTTER_RECIPE_RECIPE_TYPE, cutterDisplay::new);
    }
    public void registerScreens(ScreenRegistry registry) {
        registry.registerClickArea(screen -> new Rectangle(((screen.width -76) /2)+8, ((screen.height - 166) / 2)+6, 76-16, 70-14), blockCuttingStationScreen.class, cutterCategory.CUTTER_DISPLAY_CATEGORY_IDENTIFIER);
    }
}