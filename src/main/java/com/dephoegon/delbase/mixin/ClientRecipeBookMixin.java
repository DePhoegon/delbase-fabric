package com.dephoegon.delbase.mixin;

import net.minecraft.client.recipebook.ClientRecipeBook;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ClientRecipeBook.class)
public class ClientRecipeBookMixin {
    // Commented out - Block cutting station not in place
    /*
    @Inject(method = "getGroupForRecipe", at = @At("HEAD"), cancellable = true)
    private static void injectGetGroupForRecipe(@NotNull Recipe<?> recipe, CallbackInfoReturnable<RecipeBookGroup> cir) {
        if (recipe.getId().getNamespace().equals(Delbase.Delbase_ID)) {
            cir.setReturnValue(RecipeBookGroup.UNKNOWN);
            cir.cancel();
        }
    }
    */
}