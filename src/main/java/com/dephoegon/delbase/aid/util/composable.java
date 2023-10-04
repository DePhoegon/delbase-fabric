package com.dephoegon.delbase.aid.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

import static net.minecraft.block.ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE;

public class composable {
    private static final Block[] mangroveLeaves = blockArrayList.getMangroveLeaves();
    private static final Block[] nonColoredLeaves = blockArrayList.getNonColoredLeaves();
    private static final Block[] misc = blockArrayList.getMiscCutout();
    private static final Block[] coloredLeaves = blockArrayList.getColoredLeaves();
    private static final Block[] spruceLeaves = blockArrayList.getSpruceLeaves();
    private static void compost() {
        ITEM_TO_LEVEL_INCREASE_CHANCE.defaultReturnValue();
        float f = 0.3F;
        float f1 = 0.5F;
        float f2 = 0.65F;
        float f3 = 0.85F;
        float f4 = 1.0F;
        Arrays.stream(mangroveLeaves).forEach(block -> add(f, block.asItem()));
        Arrays.stream(nonColoredLeaves).forEach(block -> add(f, block.asItem()));
        Arrays.stream(coloredLeaves).forEach(block -> add(f, block.asItem()));
        Arrays.stream(spruceLeaves).forEach(block -> add(f, block.asItem()));
        Arrays.stream(misc).forEach(block -> add(f, block.asItem()));
        add(f2, Items.ROTTEN_FLESH);
        add(f2, Items.SPIDER_EYE);
        add(f3, Items.COD);
        add(f3, Items.SALMON);
        add(f3, Items.TROPICAL_FISH);
        add(f3, Items.PUFFERFISH);
        add(f3, Items.BEEF);
        add(f3, Items.CHICKEN);
        add(f3, Items.RABBIT);
        add(f3, Items.MUTTON);
        add(f3, Items.COOKED_BEEF);
        add(f3, Items.COOKED_COD);
        add(f3, Items.COOKED_CHICKEN);
        add(f3, Items.COOKED_RABBIT);
        add(f3, Items.COOKED_MUTTON);
    }
    private static void add(float pChance, @NotNull Item pItem) { if (!ITEM_TO_LEVEL_INCREASE_CHANCE.containsKey(pItem.asItem())) { ITEM_TO_LEVEL_INCREASE_CHANCE.put(pItem.asItem(), pChance); } }
    public static void addToList(){ compost(); }
}