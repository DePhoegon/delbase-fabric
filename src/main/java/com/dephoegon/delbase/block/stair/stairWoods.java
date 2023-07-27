package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.alt.woodStair;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;

import static com.dephoegon.delbase.block.stair.stairStrippedWoods.*;
import static net.minecraft.block.Blocks.*;
import static net.minecraft.block.Blocks.BIRCH_WOOD;

public class stairWoods extends baseModBlocks {
    public static final StairsBlock SPRUCE_WOOD_STAIR = noTooltipHelper("spruce_wood_stair", SPRUCE_WOOD, STRIPPED_SPRUCE_WOOD_STAIR, true);
    public static final StairsBlock SPRUCE_LOG_STAIR = noTooltipHelper("spruce_log_stair", SPRUCE_WOOD, STRIPPED_SPRUCE_LOG_STAIR, true);
    public static final StairsBlock OAK_WOOD_STAIR = noTooltipHelper("oak_wood_stair", OAK_WOOD, STRIPPED_OAK_WOOD_STAIR, true);
    public static final StairsBlock OAK_LOG_STAIR = noTooltipHelper("oak_log_stair", OAK_WOOD, STRIPPED_OAK_LOG_STAIR, true);
    public static final StairsBlock WARPED_HYPHAE_STAIR = noTooltipHelper("warped_hyphae_stair", WARPED_HYPHAE, STRIPPED_WARPED_HYPHAE_STAIR, false);
    public static final StairsBlock WARPED_STEM_STAIR = noTooltipHelper("warped_stem_stair", WARPED_HYPHAE, STRIPPED_WARPED_STEM_STAIR, false);
    public static final StairsBlock CRIMSON_HYPHAE_STAIR = noTooltipHelper("crimson_hyphae_stair", CRIMSON_HYPHAE, STRIPPED_CRIMSON_HYPHAE_STAIR, false);
    public static final StairsBlock CRIMSON_STEM_STAIR = noTooltipHelper("crimson_stem_stair", CRIMSON_HYPHAE, STRIPPED_CRIMSON_STEM_STAIR, false);
    public static final StairsBlock DARK_OAK_WOOD_STAIR = noTooltipHelper("dark_oak_wood_stair", DARK_OAK_WOOD, STRIPPED_DARK_OAK_WOOD_STAIR, true);
    public static final StairsBlock DARK_OAK_LOG_STAIR = noTooltipHelper("dark_oak_log_stair", DARK_OAK_WOOD, STRIPPED_DARK_OAK_LOG_STAIR, true);
    public static final StairsBlock ACACIA_WOOD_STAIR = noTooltipHelper("acacia_wood_stair", ACACIA_WOOD, STRIPPED_ACACIA_WOOD_STAIR, true);
    public static final StairsBlock ACACIA_LOG_STAIR = noTooltipHelper("acacia_log_stair", ACACIA_WOOD, STRIPPED_ACACIA_LOG_STAIR, true);
    public static final StairsBlock JUNGLE_WOOD_STAIR = noTooltipHelper("jungle_wood_stair", JUNGLE_WOOD, STRIPPED_JUNGLE_WOOD_STAIR, true);
    public static final StairsBlock JUNGLE_LOG_STAIR = noTooltipHelper("jungle_log_stair", JUNGLE_WOOD, STRIPPED_JUNGLE_LOG_STAIR, true);
    public static final StairsBlock BIRCH_WOOD_STAIR = noTooltipHelper("birch_wood_stair", BIRCH_WOOD, STRIPPED_BIRCH_WOOD_STAIR, true);
    public static final StairsBlock BIRCH_LOG_STAIR = noTooltipHelper("birch_log_stair", BIRCH_WOOD, STRIPPED_BIRCH_LOG_STAIR, true);

    private static StairsBlock noTooltipHelper(String name, Block block, StairsBlock strippedState, boolean Burns) {
        if (Burns) { return woodStairHelper(name, block, "", "", "", strippedState, 3001, 5, 10); }
        return woodStairHelper(name, block, "", "", "", strippedState);
    }
    @SuppressWarnings("SameParameterValue")
    private static StairsBlock woodStairHelper(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip, StairsBlock strippedStair) { return woodStairHelper(name, block, NormToolTip, ShiftToolTip, CtrlToolTip, strippedStair, 0, 0, 0); }
    @SuppressWarnings("SameParameterValue")
    private static StairsBlock woodStairHelper(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip, StairsBlock strippedStair, int fuelTime, int burnChance, int burnSpread) {
        StairsBlock hold;
        if (fuelTime > 0) {
            hold = (StairsBlock) registerBlock(name,
                    new woodStair(block.getDefaultState(), FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.WOOD), NormToolTip, ShiftToolTip, CtrlToolTip, strippedStair), true, fuelTime, burnChance, burnSpread);
        } else {
            hold = (StairsBlock) registerBlock(name,
                    new woodStair(block.getDefaultState(), FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.WOOD), NormToolTip, ShiftToolTip, CtrlToolTip, strippedStair)
            );
        }
        return hold;
    }
    public static void registerWoodStairs() { Delbase.LOGGER.info("Registering Wood Stairs for "+Delbase.Delbase_ID); }
}