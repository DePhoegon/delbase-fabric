package com.dephoegon.delbase;

import com.dephoegon.delbase.aid.util.regLists;
import com.dephoegon.delbase.aid.world.config;
import com.dephoegon.delbase.block.general.machineBlock;
import com.dephoegon.delbase.item.BlockCutterItems;
import dev.toma.configuration.Configuration;
import dev.toma.configuration.config.format.ConfigFormats;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.dephoegon.delbase.aid.util.regLists.RegisterClientFirst;

public class Delbase implements ModInitializer, ClientModInitializer {
	public static final String Delbase_ID = "delbase";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger(Delbase_ID);
	public static final ItemGroup DELBASE_BLOCKS = FabricItemGroupBuilder.build(new Identifier(Delbase_ID, "dephoegon_blocks"),
			() -> new ItemStack(machineBlock.BLOCK_CUTTER_BLOCK));
	public static final ItemGroup DELBASE_ITEMS = FabricItemGroupBuilder.build(new Identifier(Delbase_ID, "dephoegon_items"),
			() -> new ItemStack(BlockCutterItems.WALL_PLANS));
	public static config configHolder;

	public void onInitialize() {
		configHolder = Configuration.registerConfig(config.class, ConfigFormats.json()).getConfigInstance();
		regLists.RegisterBaseEvents();
		regLists.RegisterFirstList();
		regLists.RegisterSecondList();
	}
	@Environment(EnvType.CLIENT)
	public void onInitializeClient() { RegisterClientFirst(); }
}