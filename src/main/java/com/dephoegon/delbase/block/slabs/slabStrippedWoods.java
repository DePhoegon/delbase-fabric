package com.dephoegon.delbase.block.slabs;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.alt.strippedWoodSlab;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.*;

public class slabStrippedWoods extends baseModBlocks {
    public static final SlabBlock STRIPPED_SPRUCE_WOOD_SLAB = noTooltipHelper("stripped_spruce_wood_slab", SPRUCE_WOOD, true);
    public static final SlabBlock STRIPPED_SPRUCE_LOG_SLAB = noTooltipHelper("stripped_spruce_log_slab", SPRUCE_WOOD, true);
    public static final SlabBlock STRIPPED_OAK_WOOD_SLAB = noTooltipHelper("stripped_oak_wood_slab", OAK_WOOD, true);
    public static final SlabBlock STRIPPED_OAK_LOG_SLAB = noTooltipHelper("stripped_oak_log_slab", OAK_WOOD, true);
    public static final SlabBlock STRIPPED_WARPED_HYPHAE_SLAB = noTooltipHelper("stripped_warped_hyphae_slab", WARPED_HYPHAE, false);
    public static final SlabBlock STRIPPED_WARPED_STEM_SLAB = noTooltipHelper("stripped_warped_stem_slab", WARPED_HYPHAE, false);
    public static final SlabBlock STRIPPED_CRIMSON_HYPHAE_SLAB = noTooltipHelper("stripped_crimson_hyphae_slab", CRIMSON_HYPHAE, false);
    public static final SlabBlock STRIPPED_CRIMSON_STEM_SLAB = noTooltipHelper("stripped_crimson_stem_slab", CRIMSON_HYPHAE, false);
    public static final SlabBlock STRIPPED_DARK_OAK_WOOD_SLAB = noTooltipHelper("stripped_dark_oak_wood_slab", DARK_OAK_WOOD, true);
    public static final SlabBlock STRIPPED_DARK_OAK_LOG_SLAB = noTooltipHelper("stripped_dark_oak_log_slab", DARK_OAK_WOOD, true);
    public static final SlabBlock STRIPPED_ACACIA_WOOD_SLAB = noTooltipHelper("stripped_acacia_wood_slab", ACACIA_WOOD, true);
    public static final SlabBlock STRIPPED_ACACIA_LOG_SLAB = noTooltipHelper("stripped_acacia_log_slab", ACACIA_WOOD, true);
    public static final SlabBlock STRIPPED_JUNGLE_WOOD_SLAB = noTooltipHelper("stripped_jungle_wood_slab", JUNGLE_WOOD, true);
    public static final SlabBlock STRIPPED_JUNGLE_LOG_SLAB = noTooltipHelper("stripped_jungle_log_slab", JUNGLE_WOOD, true);
    public static final SlabBlock STRIPPED_BIRCH_WOOD_SLAB = noTooltipHelper("stripped_birch_wood_slab", BIRCH_WOOD, true);
    public static final SlabBlock STRIPPED_BIRCH_LOG_SLAB = noTooltipHelper("stripped_birch_log_slab", BIRCH_WOOD, true);
    public static final SlabBlock STRIPPED_MANGROVE_WOOD_SLAB = noTooltipHelper("stripped_mangrove_wood_slab", MANGROVE_WOOD, true);
    public static final SlabBlock STRIPPED_MANGROVE_LOG_SLAB = noTooltipHelper("stripped_mangrove_log_slab", MANGROVE_WOOD, true);

    private static SlabBlock noTooltipHelper(String name, Block block, boolean Burns) {
        if (Burns) { return woodSlabHelper(name, block, "", "", "", null, 3001, 5, 10); }
        return woodSlabHelper(name, block, "", "", "", null);
    }
    @SuppressWarnings("SameParameterValue")
    private static SlabBlock woodSlabHelper(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip, SlabBlock strippedSlab) { return woodSlabHelper(name, block, NormToolTip, ShiftToolTip, CtrlToolTip, strippedSlab, 0, 0, 0); }
    @SuppressWarnings("SameParameterValue")
    private static SlabBlock woodSlabHelper(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip, SlabBlock strippedSlab, int fuelTime, int burnChance, int burnSpread) {
        SlabBlock hold;
        if (fuelTime > 0) {
            hold = (SlabBlock) registerBlock(name,
                    new strippedWoodSlab(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.WOOD), NormToolTip, ShiftToolTip, CtrlToolTip, strippedSlab), true, fuelTime, burnChance, burnSpread);
        } else {
            hold = (SlabBlock) registerBlock(name,
                    new strippedWoodSlab(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.WOOD), NormToolTip, ShiftToolTip, CtrlToolTip, strippedSlab)
            );
        }
        return hold;
    }
    public static void registerWoodSlabs() { Delbase.LOGGER.info("Registering Stripped Wood Slabs for "+Delbase.Delbase_ID); }
}