package com.dephoegon.delbase.block.slabs;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.slab.sandStoneSlab;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;

import static com.dephoegon.delbase.block.general.genSandStones.*;

public class slabSandStones extends baseModBlocks {
    public static final SlabBlock BLOOD_SAND_STONE_SLAB = noToolTipAid("blood_sand_stone_slab", BLOOD_SAND_STONE);
    public static final SlabBlock WHITE_SAND_STONE_SLAB = noToolTipAid("white_sand_stone_slab", WHITE_SAND_STONE);
    public static final SlabBlock ORANGE_SAND_STONE_SLAB = noToolTipAid("orange_sand_stone_slab", ORANGE_SAND_STONE);
    public static final SlabBlock MAGENTA_SAND_STONE_SLAB = noToolTipAid("magenta_sand_stone_slab", MAGENTA_SAND_STONE);
    public static final SlabBlock LIGHT_BLUE_SAND_STONE_SLAB = noToolTipAid("light_blue_sand_stone_slab", LIGHT_BLUE_SAND_STONE);
    public static final SlabBlock YELLOW_SAND_STONE_SLAB = noToolTipAid("yellow_sand_stone_slab", YELLOW_SAND_STONE);
    public static final SlabBlock LIME_SAND_STONE_SLAB = noToolTipAid("lime_sand_stone_slab", LIME_SAND_STONE);
    public static final SlabBlock PINK_SAND_STONE_SLAB = noToolTipAid("pink_sand_stone_slab", PINK_SAND_STONE);
    public static final SlabBlock GRAY_SAND_STONE_SLAB = noToolTipAid("gray_sand_stone_slab", GREEN_SAND_STONE);
    public static final SlabBlock LIGHT_GRAY_SAND_STONE_SLAB = noToolTipAid("light_gray_sand_stone_slab", LIGHT_GRAY_SAND_STONE);
    public static final SlabBlock CYAN_SAND_STONE_SLAB = noToolTipAid("cyan_sand_stone_slab", CYAN_SAND_STONE);
    public static final SlabBlock PURPLE_SAND_STONE_SLAB = noToolTipAid("purple_sand_stone_slab", PURPLE_SAND_STONE);
    public static final SlabBlock BLUE_SAND_STONE_SLAB = noToolTipAid("blue_sand_stone_slab", BLUE_SAND_STONE);
    public static final SlabBlock GREEN_SAND_STONE_SLAB = noToolTipAid("green_sand_stone_slab", GREEN_SAND_STONE);
    public static final SlabBlock BROWN_SAND_STONE_SLAB = noToolTipAid("brown_sand_stone_slab", BROWN_SAND_STONE);
    public static final SlabBlock BLACK_SAND_STONE_SLAB = noToolTipAid("black_sand_stone_slab", BLACK_SAND_STONE);

    private static SlabBlock noToolTipAid(String name, Block block) { return cutSandStoneHelper(name, block, "", "", ""); }
    private static SlabBlock cutSandStoneHelper(String name, Block block, String norm, String Shift, String Ctrl) { return (SlabBlock) registerBlock(name, new sandStoneSlab(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.STONE), norm, Shift, Ctrl)); }
    public static void registerCutSandStoneSlabs() { Delbase.LOGGER.info("Registering SandStone Slabs for "+Delbase.Delbase_ID); }
}