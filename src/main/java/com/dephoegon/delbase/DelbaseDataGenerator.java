package com.dephoegon.delbase;

import com.dephoegon.delbase.datagen.modItemTagProvider;
import com.dephoegon.delbase.datagen.modSalvageRecipeGenerator;
import com.dephoegon.delbase.datagen.modVariantCraftGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.jetbrains.annotations.NotNull;

public class DelbaseDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(@NotNull FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(modSalvageRecipeGenerator::new);
        pack.addProvider(modItemTagProvider::new);
        pack.addProvider(modVariantCraftGenerator::new);
    }
}
