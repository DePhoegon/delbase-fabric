package com.dephoegon.delbase.block;

import com.dephoegon.delbase.Delbase;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;

public class baseModBlocks {
    protected static Block registerBlock(String name, Block block) { return registerBlock(name, block, false, 0, 0, 0); }
    protected static Block registerBlock(String name, Block block, int burnChance, int burnSpread) { return registerBlock(name, block, true, 0, burnChance, burnSpread); }
    protected static Block registerBlock(String name, Block block, int fuelTime) { return registerBlock(name, block, false, fuelTime, 0, 0); }
    protected static Block registerBlock(String name, Block block, boolean burnable, int fuelTime, int burnChance, int burnSpread) {
        if (fuelTime > 0) { registerBlockItem(name, block, fuelTime); } else { registerBlockItem(name, block); }
        Block hold = Registry.register(Registry.BLOCK, new Identifier(Delbase.Delbase_ID, name), block);
        if (burnable) { FlammableBlockRegistry.getDefaultInstance().add(hold, burnChance, burnSpread); }
        return hold;
    }
    private static Item registerBlockItem(String name, Block block) {
        ItemGroup group = isAltGroup(name) ? Delbase.DELBASE_ITEMS : Delbase.DELBASE_BLOCKS;
        return Registry.register(Registry.ITEM, new Identifier(Delbase.Delbase_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));
    }
    @SuppressWarnings("UnusedReturnValue")
    private static Item registerBlockItem(String name, Block block, int fuelTime) {
        Item hold = registerBlockItem(name, block);
        FuelRegistry.INSTANCE.add(hold, fuelTime);
        return hold;
    }
    private static boolean isAltGroup(String name) {
        ArrayList<String> check = new ArrayList<>();
        check.add("block_cutting_station");
        return check.contains(name);
    }
}
