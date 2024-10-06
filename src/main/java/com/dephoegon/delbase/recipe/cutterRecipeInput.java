package com.dephoegon.delbase.recipe;

import net.minecraft.item.ItemStack;
import net.minecraft.recipe.input.RecipeInput;
import org.jetbrains.annotations.Nullable;

public record cutterRecipeInput(ItemStack input, ItemStack plans) implements RecipeInput {
    public static final int inputSlot = 0;
    public static final int planSlot = 1;
    public @Nullable ItemStack getStackInSlot(int slot) {
        return switch (slot) {
            case planSlot -> plans;
            case inputSlot -> input;
            default -> null;
        };
    }
    public int getSize() { return 2; }
    public boolean isEmpty() { return this.input.isEmpty() && this.plans.isEmpty(); }
}