package com.dephoegon.delbase.block.general;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.alt.craftingStationBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.dephoegon.delbase.aid.util.itemGroupLogic.DELBASE_ITEMS;

public class machineBlock {
    public static final Block BLOCK_CUTTER_STATION = registerBlock(
            new craftingStationBlock(FabricBlockSettings.of(Material.METAL).nonOpaque()));

    private static Block registerBlock(Block block) {
        registerBlockItem(block);
        return Registry.register(Registries.BLOCK, new Identifier(Delbase.Delbase_ID, "block_cutting_station"), block);
    }

    private static void registerBlockItem(Block block) {
        Item hold =  Registry.register(Registries.ITEM, new Identifier(Delbase.Delbase_ID, "block_cutting_station"),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(DELBASE_ITEMS).register(entries -> entries.add(hold));
    }
    public static void registerModBlocks() {
        Delbase.LOGGER.info("Registering MachineBlocks for " + Delbase.Delbase_ID);
    }
}
