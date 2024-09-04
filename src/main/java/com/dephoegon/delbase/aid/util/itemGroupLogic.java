package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.block.wall.wallQuartz;
import com.dephoegon.delbase.item.BlockCutterItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.dephoegon.delbase.aid.event.itemGroupArrays.getDelBlocks;
import static com.dephoegon.delbase.aid.event.itemGroupArrays.getDelItems;


public class itemGroupLogic {
    public static final ItemGroup DELBASE_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Delbase.Delbase_ID, "dephoegon_blocks"), FabricItemGroup.builder().displayName(Text.translatable("itemGroup.dephoegon_blocks")).icon(() -> new ItemStack(wallQuartz.QUARTZ_WALL)).entries((displayContext, entries) -> getDelBlocks().forEach((entries::add))).build());

    public static final ItemGroup DELBASE_ITEMS = Registry.register(Registries.ITEM_GROUP, Identifier.of(Delbase.Delbase_ID, "dephoegon_items"), FabricItemGroup.builder().displayName(Text.translatable("itemGroup.dephoegon_items")).icon(()-> new ItemStack(BlockCutterItems.ARMOR_COMPOUND)).entries(((displayContext, entries) -> getDelItems().forEach(entries::add))).build());


    public static void registerItemGroups() {
        Delbase.LOGGER.info("Registering Item Groups for " + Delbase.Delbase_ID);
    }
}