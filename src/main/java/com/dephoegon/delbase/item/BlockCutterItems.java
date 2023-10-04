package com.dephoegon.delbase.item;

import com.dephoegon.delbase.Delbase;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class BlockCutterItems extends BaseItems {
    public static final Item ARMOR_COMPOUND = blockCutterItemHelper("armor_compound", 64);
    public static final Item WALL_PLANS = blockCutterItemHelper("wall_plans", 1);
    public static final Item SLAB_PLANS = blockCutterItemHelper("slab_plans", 1);
    public static final Item FENCE_PLANS = blockCutterItemHelper("fence_plans", 1);
    public static final Item FENCE_GATE_PLANS = blockCutterItemHelper("fence_gate_plans", 1);
    public static final Item STAIR_PLANS = blockCutterItemHelper("stair_plans", 1);
    private static Item blockCutterItemHelper(String name, int maxCount) { return registerItem(name, new Item(new FabricItemSettings().maxCount(maxCount))); }
    public static void registerItems() {
        Delbase.LOGGER.info("Registering "+Delbase.Delbase_ID+" BlockCutter Items");
    }
}
