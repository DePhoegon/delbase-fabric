package com.dephoegon.delbase;

import com.dephoegon.delbase.aid.util.regLists;
import com.dephoegon.delbase.block.general.machineBlock;
import com.dephoegon.delbase.item.BlockCutterItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Delbase implements ModInitializer {
	public static final String Delbase_ID = "delbase";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger(Delbase_ID);
	public static final ItemGroup DELBASE_BLOCKS = FabricItemGroupBuilder.build(new Identifier(Delbase_ID, "dephoegon_blocks"),
			() -> new ItemStack(machineBlock.BLOCK_CUTTER_BLOCK));
	public static final ItemGroup DELBASE_ITEMS = FabricItemGroupBuilder.build(new Identifier(Delbase_ID, "dephoegon_items"),
			() -> new ItemStack(BlockCutterItems.ARMOR_COMPOUND));

	@Override
	public void onInitialize() {
		regLists.RegisterBaseEvents();
		regLists.RegisterFirstList();
		regLists.RegisterSecondList();
	}
}