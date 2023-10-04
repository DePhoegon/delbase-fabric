package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.block.general.machineBlock;
import com.dephoegon.delbase.item.BlockCutterItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class itemGroupLogic {
    public static ItemGroup DELBASE_BLOCKS;
    public static ItemGroup DELBASE_ITEMS;

    public static void registerItemGroups() {
        DELBASE_BLOCKS = FabricItemGroup.builder(new Identifier(Delbase.Delbase_ID, "dephoegon_blocks")).displayName(Text.translatable("itemGroup.dephoegon_blocks")).icon(() -> new ItemStack(machineBlock.BLOCK_CUTTER_STATION)).build();
        DELBASE_ITEMS = FabricItemGroup.builder(new Identifier(Delbase.Delbase_ID, "dephoegon_items")).displayName(Text.translatable("itemGroup.dephoegon_items")).icon(() -> new ItemStack(BlockCutterItems.WALL_PLANS)).build();
    }
    public static void addItemToAdditionalGroup(ItemGroup group, Item item) { ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item)); }
}