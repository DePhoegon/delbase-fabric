package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.alt.strippedWoodStair;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.*;

public class stairStrippedWoods extends baseModBlocks {
    public static final StairsBlock STRIPPED_SPRUCE_WOOD_STAIR = noTooltipHelper("stripped_spruce_wood_stair", SPRUCE_WOOD, true);
    public static final StairsBlock STRIPPED_SPRUCE_LOG_STAIR = noTooltipHelper("stripped_spruce_log_stair", SPRUCE_WOOD, true);
    public static final StairsBlock STRIPPED_OAK_WOOD_STAIR = noTooltipHelper("stripped_oak_wood_stair", OAK_WOOD, true);
    public static final StairsBlock STRIPPED_OAK_LOG_STAIR = noTooltipHelper("stripped_oak_log_stair", OAK_WOOD, true);
    public static final StairsBlock STRIPPED_WARPED_HYPHAE_STAIR = noTooltipHelper("stripped_warped_hyphae_stair", WARPED_HYPHAE, false);
    public static final StairsBlock STRIPPED_WARPED_STEM_STAIR = noTooltipHelper("stripped_warped_stem_stair", WARPED_HYPHAE, false);
    public static final StairsBlock STRIPPED_CRIMSON_HYPHAE_STAIR = noTooltipHelper("stripped_crimson_hyphae_stair", CRIMSON_HYPHAE, false);
    public static final StairsBlock STRIPPED_CRIMSON_STEM_STAIR = noTooltipHelper("stripped_crimson_stem_stair", CRIMSON_HYPHAE, false);
    public static final StairsBlock STRIPPED_DARK_OAK_WOOD_STAIR = noTooltipHelper("stripped_dark_oak_wood_stair", DARK_OAK_WOOD, true);
    public static final StairsBlock STRIPPED_DARK_OAK_LOG_STAIR = noTooltipHelper("stripped_dark_oak_log_stair", DARK_OAK_WOOD, true);
    public static final StairsBlock STRIPPED_ACACIA_WOOD_STAIR = noTooltipHelper("stripped_acacia_wood_stair", ACACIA_WOOD, true);
    public static final StairsBlock STRIPPED_ACACIA_LOG_STAIR = noTooltipHelper("stripped_acacia_log_stair", ACACIA_WOOD, true);
    public static final StairsBlock STRIPPED_JUNGLE_WOOD_STAIR = noTooltipHelper("stripped_jungle_wood_stair", JUNGLE_WOOD, true);
    public static final StairsBlock STRIPPED_JUNGLE_LOG_STAIR = noTooltipHelper("stripped_jungle_log_stair", JUNGLE_WOOD, true);
    public static final StairsBlock STRIPPED_BIRCH_WOOD_STAIR = noTooltipHelper("stripped_birch_wood_stair", BIRCH_WOOD, true);
    public static final StairsBlock STRIPPED_BIRCH_LOG_STAIR = noTooltipHelper("stripped_birch_log_stair", BIRCH_WOOD, true);
    public static final StairsBlock STRIPPED_MANGROVE_WOOD_STAIR = noTooltipHelper("stripped_mangrove_wood_stair", MANGROVE_WOOD, true);
    public static final StairsBlock STRIPPED_MANGROVE_LOG_STAIR = noTooltipHelper("stripped_mangrove_log_stair", MANGROVE_WOOD, true);
    public static final StairsBlock STRIPPED_CHERRY_WOOD_STAIR = noTooltipHelper("stripped_cherry_wood_stair", CHERRY_WOOD, true);
    public static final StairsBlock STRIPPED_CHERRY_LOG_STAIR = noTooltipHelper("stripped_cherry_log_stair", CHERRY_WOOD, true);
    public static final StairsBlock STRIPPED_BAMBOO_BLOCK_STAIR = noTooltipHelper("stripped_bamboo_block_stair", OAK_WOOD, true);

    private static StairsBlock noTooltipHelper(String name, Block block, boolean Burns) {
        if (Burns) { return woodStairHelper(name, block, "", "", "", null, 3001, 5, 10); }
        return woodStairHelper(name, block, "", "", "", null);
    }
    @SuppressWarnings("SameParameterValue")
    private static StairsBlock woodStairHelper(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip, StairsBlock strippedStair) { return woodStairHelper(name, block, NormToolTip, ShiftToolTip, CtrlToolTip, strippedStair, 0, 0, 0); }
    @SuppressWarnings("SameParameterValue")
    private static StairsBlock woodStairHelper(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip, StairsBlock strippedStair, int fuelTime, int burnChance, int burnSpread) {
        StairsBlock hold;
        if (fuelTime > 0) {
            hold = (StairsBlock) registerBlock(name,
                    new strippedWoodStair(block.getDefaultState(), FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.WOOD), NormToolTip, ShiftToolTip, CtrlToolTip, strippedStair), true, fuelTime, burnChance, burnSpread);
        } else {
            hold = (StairsBlock) registerBlock(name,
                    new strippedWoodStair(block.getDefaultState(), FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.WOOD), NormToolTip, ShiftToolTip, CtrlToolTip, strippedStair)
            );
        }
        return hold;
    }
    public static void registerWoodStairs() { Delbase.LOGGER.info("Registering Stripped Wood Stairs for "+Delbase.Delbase_ID); }
}