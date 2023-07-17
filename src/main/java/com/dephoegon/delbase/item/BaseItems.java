package com.dephoegon.delbase.item;

import com.dephoegon.delbase.Delbase;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BaseItems {
    protected static Item registerItem(String name, Item item) { return Registry.register(Registry.ITEM, new Identifier(Delbase.Delbase_ID, name), item); }
    protected static Item registerItem(String name, Item item, int burnTime) {
        Item out = registerItem(name, item);
        FuelRegistry.INSTANCE.add(out, burnTime);
        return out;
    }
}
