package com.dephoegon.delbase.recipe;

import net.minecraft.item.ItemStack;
import net.minecraft.recipe.input.RecipeInput;
import org.jetbrains.annotations.Nullable;

public record cutterRecipeInput(ItemStack input, ItemStack planSlot) implements RecipeInput {
    public @Nullable ItemStack getStackInSlot(int slot) {
        return switch (slot) {
            case 0 -> planSlot;
            case 1 -> input;
            default -> null;
        };
    }
    public int getSize() { return 2; }
}