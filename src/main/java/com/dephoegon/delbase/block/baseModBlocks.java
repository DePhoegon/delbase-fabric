package com.dephoegon.delbase.block;

import com.dephoegon.delbase.Delbase;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

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
        return Registry.register(Registry.ITEM, new Identifier(Delbase.Delbase_ID, name), new BlockItem(block, new FabricItemSettings().group(Delbase.DELBASE_BLOCKS)));
    }
    private static void registerBlockItem(String name, Block block, int fuelTime) {
        Item hold = registerBlockItem(name, block);
        FuelRegistry.INSTANCE.add(hold, fuelTime);
    }
    public static boolean never(BlockState p_50806_, BlockView p_50807_, BlockPos p_50808_) { return false; }
}
