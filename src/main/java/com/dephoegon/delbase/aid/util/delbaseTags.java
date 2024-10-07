package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.Delbase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class delbaseTags {
    public static class Blocks {
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Delbase.Delbase_ID, name));
        }
    }
    public static class Items {
        public static final TagKey<Item> BASE_SAND_STONE_SET = createTag("base_sand_stone_set");
        public static final TagKey<Item> BLACK_SAND_STONE_SET = createTag("black_sand_stone_set");
        public static final TagKey<Item> BLUE_SAND_STONE_SET = createTag("blue_sand_stone_set");
        public static final TagKey<Item> BROWN_SAND_STONE_SET = createTag("brown_sand_stone_set");
        public static final TagKey<Item> CYAN_SAND_STONE_SET = createTag("cyan_sand_stone_set");
        public static final TagKey<Item> DARK_RED_SAND_STONE_SET = createTag("dark_red_sand_stone_set");
        public static final TagKey<Item> GRAY_SAND_STONE_SET = createTag("gray_sand_stone_set");
        public static final TagKey<Item> GREEN_SAND_STONE_SET = createTag("green_sand_stone_set");
        public static final TagKey<Item> LIGHT_BLUE_SAND_STONE_SET = createTag("light_blue_sand_stone_set");
        public static final TagKey<Item> LIGHT_GRAY_SAND_STONE_SET = createTag("light_gray_sand_stone_set");
        public static final TagKey<Item> LIME_SAND_STONE_SET = createTag("lime_sand_stone_set");
        public static final TagKey<Item> MAGENTA_SAND_STONE_SET = createTag("magenta_sand_stone_set");
        public static final TagKey<Item> ORANGE_SAND_STONE_SET = createTag("orange_sand_stone_set");
        public static final TagKey<Item> PINK_SAND_STONE_SET = createTag("pink_sand_stone_set");
        public static final TagKey<Item> PURPLE_SAND_STONE_SET = createTag("purple_sand_stone_set");
        public static final TagKey<Item> RED_SAND_STONE_SET = createTag("red_sand_stone_set");
        public static final TagKey<Item> WHITE_SAND_STONE_SET = createTag("white_sand_stone_set");
        public static final TagKey<Item> YELLOW_SAND_STONE_SET = createTag("yellow_sand_stone_set");
        public static final TagKey<Item> BASALT_BLOCKS = createTag("basalt_blocks");
        public static final TagKey<Item> BASE_WOOD_FENCE_GATES = createTag("base_wood_fence_gate");
        public static final TagKey<Item> BASE_WOOD_FENCES = createTag("base_wood_fences");
        public static final TagKey<Item> BASE_WOOD_SLABS = createTag("base_wood_slabs");
        public static final TagKey<Item> BASE_WOOD_STAIRS = createTag("base_wood_stairs");
        public static final TagKey<Item> BLACKSTONE_BLOCKS = createTag("blackstone_blocks");
        public static final TagKey<Item> COMPOUND = createTag("compound");
        public static final TagKey<Item> DEEPSLATE_BLOCKS = createTag("deepslate_blocks");
        public static final TagKey<Item> DELBASE_WOOD_FENCE_GATE = createTag("delbase_wood_fence_gate");
        public static final TagKey<Item> DELBASE_WOOD_FENCES = createTag("delbase_wood_fences");
        public static final TagKey<Item> DELBASE_WOOD_SLABS = createTag("delbase_wood_slabs");
        public static final TagKey<Item> DELBASE_WOOD_STAIRS = createTag("delbase_wood_stairs");
        public static final TagKey<Item> DELBASE_WOOD_WALLS = createTag("delbase_wood_walls");
        public static final TagKey<Item> DYES = createTag("dyes");
        public static final TagKey<Item> LOGS = createTag("logs");
        public static final TagKey<Item> QUARTZ_BLOCKS = createTag("quartz_blocks");
        public static final TagKey<Item> RAW_FOODS = createTag("raw_foods");
        public static final TagKey<Item> SANDS = createTag("sands");
        public static final TagKey<Item> SHIFTING_DYES = createTag("shifting_dyes");
        public static final TagKey<Item> STONE_BLOCKS = createTag("stone_blocks");
        public static final TagKey<Item> WOODS = createTag("woods");
        public static final TagKey<Item> ASH_BLOCK = createTag("ash_block");
        public static final TagKey<Item> ASH_FENCE = createTag("ash_fence");
        public static final TagKey<Item> ASH_FENCE_GATE = createTag("ash_fence_gate");
        public static final TagKey<Item> ASH_SLAB = createTag("ash_slab");
        public static final TagKey<Item> ASH_STAIR = createTag("ash_stair");
        public static final TagKey<Item> ASH_WALL = createTag("ash_wall");
        public static final TagKey<Item> ENERGY_DUST = createTag("energy_dust");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Delbase.Delbase_ID, name));
        }
    }
}