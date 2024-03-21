package com.dephoegon.delbase.item;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.items.compoundPlans;
import com.dephoegon.delbase.aid.items.cutterPlans;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class BlockCutterItems extends BaseItems {
    public static final Item ARMOR_COMPOUND = compoundItemHelper("armor_compound", 64);
    public static final Item WALL_PLANS = cutterItemHelper("wall_plans", 1);
    public static final Item SLAB_PLANS = cutterItemHelper("slab_plans", 1);
    public static final Item FENCE_PLANS = cutterItemHelper("fence_plans", 1);
    public static final Item FENCE_GATE_PLANS = cutterItemHelper("fence_gate_plans", 1);
    public static final Item STAIR_PLANS = cutterItemHelper("stair_plans", 1);
    private static Item cutterItemHelper(String name, int maxCount) { return registerItem(name, new cutterPlans(new FabricItemSettings().maxCount(maxCount))); }
    private static Item compoundItemHelper(String name, int maxCount) { return registerItem(name, new compoundPlans(new FabricItemSettings().maxCount(maxCount))); }
    public static void registerItems() {
        Delbase.LOGGER.info("Registering "+Delbase.Delbase_ID+" BlockCutter Items");
    }
}
