package com.dephoegon.delbase.block;

import com.dephoegon.delbase.Delbase;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class baseModBlocks {
    protected static Block registerBlock(String name, Block block) { return registerBlock(name, block, false, 0, 0, 0); }
    protected static Block registerBlock(String name, Block block, int burnChance, int burnSpread) { return registerBlock(name, block, true, 0, burnChance, burnSpread); }
    protected static Block registerBlock(String name, Block block, int fuelTime) { return registerBlock(name, block, false, fuelTime, 0, 0); }
    protected static Block registerBlock(String name, Block block, boolean burnable, int fuelTime, int burnChance, int burnSpread) {
        if (fuelTime > 0) { registerBlockItem(name, block, fuelTime); } else { registerBlockItem(name, block); }
        Block hold = Registry.register(Registries.BLOCK, Identifier.of(Delbase.Delbase_ID, name), block);
        if (burnable) { FlammableBlockRegistry.getDefaultInstance().add(hold, burnChance, burnSpread); }
        return hold;
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(Delbase.Delbase_ID, name), new BlockItem(block, new Item.Settings()));
    }
    private static void registerBlockItem(String name, Block block, int fuelTime) {
        Item hold = registerBlockItem(name, block);
        FuelRegistry.INSTANCE.add(hold, fuelTime);
    }
    public static boolean never(BlockState p_50806_, BlockView p_50807_, BlockPos p_50808_) { return false; }
}
