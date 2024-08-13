package com.dephoegon.delbase.item;

import com.dephoegon.delbase.Delbase;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BaseItems {
    protected static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Delbase.Delbase_ID, name), item);
    }
    protected static Item registerItem(String name, Item item, int burnTime) {
        Item out = registerItem(name, item);
        FuelRegistry.INSTANCE.add(out, burnTime);
        return out;
    }
}