package com.dephoegon.delbase.block.slabs;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.alt.woodSlab;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;

import static com.dephoegon.delbase.block.slabs.slabStrippedWoods.*;
import static net.minecraft.block.Blocks.*;

public class slabWood extends baseModBlocks {
    public static final SlabBlock SPRUCE_WOOD_SLAB = noTooltipHelper("spruce_wood_slab", SPRUCE_WOOD, STRIPPED_SPRUCE_WOOD_SLAB, true);
    public static final SlabBlock SPRUCE_LOG_SLAB = noTooltipHelper("spruce_log_slab", SPRUCE_WOOD, STRIPPED_SPRUCE_LOG_SLAB, true);
    public static final SlabBlock OAK_WOOD_SLAB = noTooltipHelper("oak_wood_slab", OAK_WOOD, STRIPPED_OAK_WOOD_SLAB, true);
    public static final SlabBlock OAK_LOG_SLAB = noTooltipHelper("oak_log_slab", OAK_WOOD, STRIPPED_OAK_LOG_SLAB, true);
    public static final SlabBlock WARPED_HYPHAE_SLAB = noTooltipHelper("warped_hyphae_slab", WARPED_HYPHAE, STRIPPED_WARPED_HYPHAE_SLAB, false);
    public static final SlabBlock WARPED_STEM_SLAB = noTooltipHelper("warped_stem_slab", WARPED_HYPHAE, STRIPPED_WARPED_STEM_SLAB, false);
    public static final SlabBlock CRIMSON_HYPHAE_SLAB = noTooltipHelper("crimson_hyphae_slab", CRIMSON_HYPHAE, STRIPPED_CRIMSON_HYPHAE_SLAB, false);
    public static final SlabBlock CRIMSON_STEM_SLAB = noTooltipHelper("crimson_stem_slab", CRIMSON_HYPHAE, STRIPPED_CRIMSON_STEM_SLAB, false);
    public static final SlabBlock DARK_OAK_WOOD_SLAB = noTooltipHelper("dark_oak_wood_slab", DARK_OAK_WOOD, STRIPPED_DARK_OAK_WOOD_SLAB, true);
    public static final SlabBlock DARK_OAK_LOG_SLAB = noTooltipHelper("dark_oak_log_slab", DARK_OAK_WOOD, STRIPPED_DARK_OAK_LOG_SLAB, true);
    public static final SlabBlock ACACIA_WOOD_SLAB = noTooltipHelper("acacia_wood_slab", ACACIA_WOOD, STRIPPED_ACACIA_WOOD_SLAB, true);
    public static final SlabBlock ACACIA_LOG_SLAB = noTooltipHelper("acacia_log_slab", ACACIA_WOOD, STRIPPED_ACACIA_LOG_SLAB, true);
    public static final SlabBlock JUNGLE_WOOD_SLAB = noTooltipHelper("jungle_wood_slab", JUNGLE_WOOD, STRIPPED_JUNGLE_WOOD_SLAB, true);
    public static final SlabBlock JUNGLE_LOG_SLAB = noTooltipHelper("jungle_log_slab", JUNGLE_WOOD, STRIPPED_JUNGLE_LOG_SLAB, true);
    public static final SlabBlock BIRCH_WOOD_SLAB = noTooltipHelper("birch_wood_slab", BIRCH_WOOD, STRIPPED_BIRCH_WOOD_SLAB, true);
    public static final SlabBlock BIRCH_LOG_SLAB = noTooltipHelper("birch_log_slab", BIRCH_WOOD, STRIPPED_BIRCH_LOG_SLAB, true);

    private static SlabBlock noTooltipHelper(String name, Block block, SlabBlock strippedState, boolean Burns) {
        if (Burns) { return woodSlabHelper(name, block, "", "", "", strippedState, 3001, 5, 10); }
        return woodSlabHelper(name, block, "", "", "", strippedState);
    }
    @SuppressWarnings("SameParameterValue")
    private static SlabBlock woodSlabHelper(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip, SlabBlock strippedSlab) { return woodSlabHelper(name, block, NormToolTip, ShiftToolTip, CtrlToolTip, strippedSlab, 0, 0, 0); }
    @SuppressWarnings("SameParameterValue")
    private static SlabBlock woodSlabHelper(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip, SlabBlock strippedSlab, int fuelTime, int burnChance, int burnSpread) {
        SlabBlock hold;
        if (fuelTime > 0) {
            hold = (SlabBlock) registerBlock(name,
                    new woodSlab(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.WOOD), NormToolTip, ShiftToolTip, CtrlToolTip, strippedSlab), true, fuelTime, burnChance, burnSpread);
        } else {
            hold = (SlabBlock) registerBlock(name,
                    new woodSlab(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.WOOD), NormToolTip, ShiftToolTip, CtrlToolTip, strippedSlab)
            );
        }
        return hold;
    }
    public static void registerWoodSlabs() { Delbase.LOGGER.info("Registering Wood Slabs for "+Delbase.Delbase_ID); }
}
