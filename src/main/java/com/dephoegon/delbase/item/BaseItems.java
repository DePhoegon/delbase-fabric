package com.dephoegon.delbase.item;

import com.dephoegon.delbase.Delbase;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.dephoegon.delbase.aid.util.itemGroupLogic.DELBASE_ITEMS;

public class BaseItems {
    protected static Item registerItem(String name, Item item) {
        Item hold = Registry.register(Registries.ITEM, new Identifier(Delbase.Delbase_ID, name), item);
        ItemGroupEvents.modifyEntriesEvent(DELBASE_ITEMS).register(entries -> entries.add(hold));
        return hold;
    }
    protected static Item registerItem(String name, Item item, int burnTime) {
        Item out = registerItem(name, item);
        FuelRegistry.INSTANCE.add(out, burnTime);
        return out;
    }
}
