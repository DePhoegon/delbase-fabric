package com.dephoegon.delbase.block.general;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.alt.craftingStationBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class machineBlock {
    public static final Block BLOCK_CUTTER_BLOCK = registerBlock(
            new craftingStationBlock(FabricBlockSettings.of(Material.METAL).nonOpaque()));

    private static Block registerBlock(Block block) {
        registerBlockItem(block);
        return Registry.register(Registry.BLOCK, new Identifier(Delbase.Delbase_ID, "block_cutting_station"), block);
    }

    private static void registerBlockItem(Block block) {
        Registry.register(Registry.ITEM, new Identifier(Delbase.Delbase_ID, "block_cutting_station"),
                new BlockItem(block, new FabricItemSettings().group(Delbase.DELBASE_ITEMS)) {
                    @Override
                    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                        tooltip.add(new TranslatableText("block.delbase.block_cutting_station_tooltip"));
                    }
                });
    }
    public static void registerModBlocks() {
        Delbase.LOGGER.info("Registering MachineBlocks for " + Delbase.Delbase_ID);
    }
}
