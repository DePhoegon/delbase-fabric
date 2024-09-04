package com.dephoegon.delbase.recipe;

public class blockCutterStationRecipes  {
    // implements Recipe<SimpleInventory>
    /*
    private static final int jsonIngredientItem = 1;
    private static final int jsonPlanItem = 0;
    private final Identifier id;
    private final ItemStack output;
    private final DefaultedList<Ingredient> recipeItems;
    public static final String id_name = "block_cutting";
    public blockCutterStationRecipes(Identifier id, ItemStack output, DefaultedList<Ingredient> recipeItems) {
        this.id = id;
        this.output = output;
        this.recipeItems = recipeItems;
    }
    @Override
    public boolean matches(@NotNull SimpleInventory inventory, @NotNull World world) {
        if (world.isClient()) { return false; }
        return (recipeItems.get(jsonIngredientItem).test(inventory.getStack(blockCuttingStationEntity.inputSlot)) && recipeItems.get(jsonPlanItem).test(inventory.getStack(blockCuttingStationEntity.planSlot)));
    }

    @Override
    public ItemStack craft(SimpleInventory inventory, RegistryWrapper.WrapperLookup registryManager) { return output; }
    @Override
    public boolean fits(int width, int height) { return true; }

    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.ofSize(this.recipeItems.size());
        list.addAll(recipeItems);
        return list;
    }
    public ItemStack getResult(RegistryWrapper.WrapperLookup registriesLookup) { return output.copy(); }
    @Override
    public Identifier getId() { return this.id; }
    @Override
    public RecipeSerializer<?> getSerializer() { return Serializer.INSTANCE; }
    @Override
    public RecipeType<?> getType() { return Type.INSTANCE; }
    public static class Type implements RecipeType<blockCutterStationRecipes> {
        public static final Type INSTANCE = new Type();
        public static final Identifier ID =  Identifier.of(Delbase.Delbase_ID, blockCutterStationRecipes.id_name);
    }
    public static class Serializer implements RecipeSerializer<blockCutterStationRecipes> {

        public static final Serializer INSTANCE = new Serializer();
        public static final Identifier ID = Identifier.of(Delbase.Delbase_ID, blockCutterStationRecipes.id_name);
        @Override
        public @NotNull blockCutterStationRecipes read(@NotNull Identifier id, @NotNull JsonObject json) {
            ItemStack output = ShapedRecipe.outputFromJson(JsonHelper.getObject(json, "output"));

            JsonArray ingredients = JsonHelper.getArray(json, "ingredients");
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(2, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); ++i) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }
            return new blockCutterStationRecipes(id, output, inputs);
        }
        @Override
        public blockCutterStationRecipes read(@NotNull Identifier id, @NotNull PacketByteBuf buf) {
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(buf.readInt(), Ingredient.EMPTY);
            inputs.replaceAll(ignored -> Ingredient.fromPacket(buf));
            ItemStack output = buf.readItemStack();
            return new blockCutterStationRecipes(id, output, inputs);
        }
        @Override
        public void write(@NotNull PacketByteBuf buf, @NotNull blockCutterStationRecipes recipe) {
            buf.writeInt(recipe.getIngredients().size());
            for (Ingredient ing : recipe.getIngredients()) {
                ing.write(buf);
            }
            buf.writeItemStack(recipe.getResult(null));
        }

        @Override
        public MapCodec<blockCutterStationRecipes> codec() {
            return null;
        }

        @Override
        public PacketCodec<RegistryByteBuf, blockCutterStationRecipes> packetCodec() {
            return null;
        }
    }
     */
}
