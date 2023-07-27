package com.dephoegon.delbase.block.slabs;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.slab.terracottaSlab;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.*;

public class slabTerracotta extends baseModBlocks {
    public static final SlabBlock WHITE_TERRACOTTA_SLAB = noToolTipAid("white_terracotta_slab", WHITE_TERRACOTTA);
    public static final SlabBlock ORANGE_TERRACOTTA_SLAB = noToolTipAid("orange_terracotta_slab", ORANGE_TERRACOTTA);
    public static final SlabBlock MAGENTA_TERRACOTTA_SLAB = noToolTipAid("magenta_terracotta_slab", MAGENTA_TERRACOTTA);
    public static final SlabBlock LIGHT_BLUE_TERRACOTTA_SLAB = noToolTipAid("light_blue_terracotta_slab", LIGHT_BLUE_TERRACOTTA);
    public static final SlabBlock YELLOW_TERRACOTTA_SLAB = noToolTipAid("yellow_terracotta_slab", YELLOW_TERRACOTTA);
    public static final SlabBlock LIME_TERRACOTTA_SLAB = noToolTipAid("lime_terracotta_slab", LIME_TERRACOTTA);
    public static final SlabBlock PINK_TERRACOTTA_SLAB = noToolTipAid("pink_terracotta_slab", PINK_TERRACOTTA);
    public static final SlabBlock GRAY_TERRACOTTA_SLAB = noToolTipAid("gray_terracotta_slab", GRAY_TERRACOTTA);
    public static final SlabBlock LIGHT_GRAY_TERRACOTTA_SLAB = noToolTipAid("light_gray_terracotta_slab", LIGHT_GRAY_TERRACOTTA);
    public static final SlabBlock CYAN_TERRACOTTA_SLAB = noToolTipAid("cyan_terracotta_slab", CYAN_TERRACOTTA);
    public static final SlabBlock PURPLE_TERRACOTTA_SLAB = noToolTipAid("purple_terracotta_slab", PURPLE_TERRACOTTA);
    public static final SlabBlock BLUE_TERRACOTTA_SLAB = noToolTipAid("blue_terracotta_slab", BLUE_TERRACOTTA);
    public static final SlabBlock BROWN_TERRACOTTA_SLAB = noToolTipAid("brown_terracotta_slab", BROWN_TERRACOTTA);
    public static final SlabBlock GREEN_TERRACOTTA_SLAB = noToolTipAid("green_terracotta_slab", GREEN_TERRACOTTA);
    public static final SlabBlock RED_TERRACOTTA_SLAB = noToolTipAid("red_terracotta_slab", RED_TERRACOTTA);
    public static final SlabBlock BLACK_TERRACOTTA_SLAB = noToolTipAid("black_terracotta_slab", BLACK_TERRACOTTA);
    public static final SlabBlock TERRACOTTA_SLAB = noToolTipAid("terracotta_slab", TERRACOTTA);

    private static SlabBlock noToolTipAid(String name, Block block) { return terracottaHelper(name, block, "", "", ""); }
    private static SlabBlock terracottaHelper(String name, Block block, String norm, String Shift, String Ctrl) { return (SlabBlock) registerBlock(name, new terracottaSlab(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.CALCITE), norm, Shift, Ctrl)); }
    public static void registerTerracottaSlab() { Delbase.LOGGER.info("Registering Terracotta Slabs for "+Delbase.Delbase_ID); }
}