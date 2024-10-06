package com.dephoegon.delbase.recipe;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public record cutterRecipe(Ingredient InputItem, Ingredient planItem, ItemStack outPut) implements Recipe<cutterRecipeInput> {
    public static final String id_name = "block_cutting";


    public @NotNull DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.InputItem);
        list.add(this.planItem);
        return list;
    }
    public boolean matches(cutterRecipeInput input, @NotNull World world) {
        if (world.isClient()) { return false; }
        return InputItem.test(input.getStackInSlot(cutterRecipeInput.inputSlot)) && planItem.test(input.getStackInSlot(cutterRecipeInput.planSlot));
    }
    public ItemStack craft(cutterRecipeInput input, RegistryWrapper.WrapperLookup lookup) { return outPut.copy(); }
    public boolean fits(int width, int height) { return true; }

    @Override
    public ItemStack getResult(RegistryWrapper.WrapperLookup registriesLookup) {
        return outPut;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return modRecipes.CUTTER_RECIPE_RECIPE_SERIALIZER;
    }

    @Override
    public RecipeType<?> getType() {
        return modRecipes.CUTTER_RECIPE_RECIPE_TYPE;
    }
    public static class Serializer implements RecipeSerializer<cutterRecipe> {
        public static final MapCodec<cutterRecipe> CODEC = RecordCodecBuilder.mapCodec(cutterRecipeInstance -> cutterRecipeInstance.group(Ingredient.DISALLOW_EMPTY_CODEC.fieldOf("ingredient").forGetter(cutterRecipe::InputItem), Ingredient.DISALLOW_EMPTY_CODEC.fieldOf("planslot").forGetter(cutterRecipe::planItem), ItemStack.CODEC.fieldOf("output").forGetter(cutterRecipe::outPut)).apply(cutterRecipeInstance, cutterRecipe::new));
        public static final PacketCodec<RegistryByteBuf, cutterRecipe> STREAM_CODEC = PacketCodec.tuple(Ingredient.PACKET_CODEC, cutterRecipe::InputItem, Ingredient.PACKET_CODEC, cutterRecipe::planItem, ItemStack.PACKET_CODEC, cutterRecipe::outPut, cutterRecipe::new);

        public MapCodec<cutterRecipe> codec() { return CODEC; }
        public PacketCodec<RegistryByteBuf, cutterRecipe> packetCodec() { return STREAM_CODEC; }
    }
}