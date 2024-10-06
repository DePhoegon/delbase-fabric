package com.dephoegon.delbase.block.general;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.alt.craftingStationBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.IRON_BLOCK;

public class machineBlock {
    public static final Block BLOCK_CUTTER_STATION = registerBlock(
            new craftingStationBlock(AbstractBlock.Settings.copy(IRON_BLOCK).nonOpaque()));

    private static Block registerBlock(Block block) {
        registerBlockItem(block);
        return Registry.register(Registries.BLOCK, Identifier.of(Delbase.Delbase_ID, "block_cutting_station"), block);
    }

    private static void registerBlockItem(Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Delbase.Delbase_ID, "block_cutting_station"),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks() {
        Delbase.LOGGER.info("Registering MachineBlocks for " + Delbase.Delbase_ID);
    }
}
