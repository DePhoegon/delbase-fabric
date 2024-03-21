package com.dephoegon.delbase.aid.recipe;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.items.compoundPlans;
import com.dephoegon.delbase.aid.items.cutterPlans;
import com.google.gson.JsonObject;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.block.entity.blockCuttingStationEntity.inputSlot;
import static com.dephoegon.delbase.block.entity.blockCuttingStationEntity.planSlot;

public class blockCutterStationRecipes implements Recipe<SimpleInventory> {
    private final Identifier id;
    private final ItemStack output;
    private final ItemStack plan;
    private final ItemStack input;
    public @NotNull ItemStack getOutput(@NotNull DynamicRegistryManager registryManager) { return this.output.copy(); }
    public @NotNull ItemStack getOutput() { return this.output.copy(); }
    public ItemStack getPlans() { return this.plan; }
    public ItemStack getInput() { return this.input; }
    private @NotNull ItemStack getDefault(@NotNull ItemStack input) { return input.getItem().getDefaultStack(); }
    public static final String id_name = "block_cutting";
    public blockCutterStationRecipes(Identifier id, ItemStack output, ItemStack plan, ItemStack input) {
        this.id = id;
        this.output = output;
        this.plan = plan;
        this.input = input;
    }
    public boolean matches(@NotNull SimpleInventory pContainer, @NotNull World pLevel) {
        if (getInput().equals(ItemStack.EMPTY) || getPlans().equals(ItemStack.EMPTY)) { return false; }
        boolean inputs = getDefault(getInput()).toString().equals(getDefault(pContainer.getStack(inputSlot)).toString());
        boolean outputs = false;
        boolean hold = false;
        if (inputs) { outputs = getDefault(getPlans()).toString().equals(getDefault(pContainer.getStack(planSlot)).toString()); }
        if (inputs && outputs) {
            int planSlots = getPlans().getItem() instanceof compoundPlans ? getPlans().getCount() : 1;
            hold = planSlots <= pContainer.getStack(planSlot).getCount() && getInput().getCount() <= pContainer.getStack(inputSlot).getCount();
        }
        return hold;
    }
    public ItemStack craft(SimpleInventory inventory, DynamicRegistryManager registryManager) { return output.copy(); }
    public boolean fits(int width, int height) { return true; }
    public Identifier getId() { return this.id; }
    public RecipeSerializer<?> getSerializer() { return Serializer.INSTANCE; }
    public RecipeType<?> getType() { return Type.INSTANCE; }
    public static class Type implements RecipeType<blockCutterStationRecipes> {
        public static final Type INSTANCE = new Type();
        public static final Identifier ID =  new Identifier(Delbase.Delbase_ID, blockCutterStationRecipes.id_name);
    }
    public static class Serializer implements RecipeSerializer<blockCutterStationRecipes> {
        public static final Serializer INSTANCE = new Serializer();
        public static final Identifier ID = new Identifier(Delbase.Delbase_ID, blockCutterStationRecipes.id_name);
        public @NotNull blockCutterStationRecipes read(@NotNull Identifier id, @NotNull JsonObject json) {
            ItemStack output = ShapedRecipe.outputFromJson(JsonHelper.getObject(json, "output"));
            ItemStack input = ShapedRecipe.outputFromJson(JsonHelper.getObject(json, "input"));
            ItemStack plan = ShapedRecipe.outputFromJson(JsonHelper.getObject(json, "plans"));
            if (plan.getItem() instanceof cutterPlans) { plan.setCount(1); }

            return new blockCutterStationRecipes(id, output, plan, input);
        }
        public blockCutterStationRecipes read(@NotNull Identifier id, @NotNull PacketByteBuf buf) {
            ItemStack output = buf.readItemStack();
            ItemStack plans = buf.readItemStack();
            ItemStack inputs = buf.readItemStack();
            if (plans.getItem() instanceof cutterPlans) { plans.setCount(1); }
            return new blockCutterStationRecipes(id, output, plans, inputs);
        }
        public void write(@NotNull PacketByteBuf buf, @NotNull blockCutterStationRecipes recipe) {
            buf.writeItemStack(recipe.output);
            if (recipe.getPlans().getItem() instanceof cutterPlans) { recipe.plan.setCount(1); }
            buf.writeItemStack(recipe.plan);
            buf.writeItemStack(recipe.input);
        }
    }
}