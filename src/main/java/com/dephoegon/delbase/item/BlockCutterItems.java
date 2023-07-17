package com.dephoegon.delbase.item;

import com.dephoegon.delbase.Delbase;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BlockCutterItems extends BaseItems {
    public static final Item ARMOR_COMPOUND = registerItem("armor_compound", new Item(new FabricItemSettings().maxCount(64).group(ItemGroup.MISC)));
    public static void registerItems() {
        Delbase.LOGGER.info("Registering "+Delbase.Delbase_ID+" BlockCutter Items");
    }
}
