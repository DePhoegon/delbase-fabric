package com.dephoegon.delbase.compat;

import com.dephoegon.delbase.recipe.cutterRecipe;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.recipe.RecipeEntry;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class cutterDisplay extends BasicDisplay {
    public cutterDisplay(@NotNull RecipeEntry<cutterRecipe> recipeEntry) {
        super(EntryIngredients.ofIngredients(recipeEntry.value().getIngredients()), List.of(EntryIngredient.of(EntryStacks.of(recipeEntry.value().getResult(null))))); // No 'List.of()' for the inputs, as getIngredients is a list of 2, while get result isn't a list
    }
    public CategoryIdentifier<?> getCategoryIdentifier() { return cutterCategory.CUTTER_DISPLAY_CATEGORY_IDENTIFIER; }
}