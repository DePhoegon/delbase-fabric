package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.alt.strippedWoodWall;
import com.dephoegon.delbase.block.baseModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.WallBlock;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.*;

public class wallStrippedWoods extends baseModBlocks {
    public static final WallBlock STRIPPED_SPRUCE_WOOD_WALL = noTooltipHelper("stripped_spruce_wood_wall", SPRUCE_WOOD, true);
    public static final WallBlock STRIPPED_SPRUCE_LOG_WALL = noTooltipHelper("stripped_spruce_log_wall", SPRUCE_WOOD, true);
    public static final WallBlock STRIPPED_OAK_WOOD_WALL = noTooltipHelper("stripped_oak_wood_wall", OAK_WOOD, true);
    public static final WallBlock STRIPPED_OAK_LOG_WALL = noTooltipHelper("stripped_oak_log_wall", OAK_WOOD, true);
    public static final WallBlock STRIPPED_WARPED_HYPHAE_WALL = noTooltipHelper("stripped_warped_hyphae_wall", WARPED_HYPHAE, false);
    public static final WallBlock STRIPPED_WARPED_STEM_WALL = noTooltipHelper("stripped_warped_stem_wall", WARPED_HYPHAE, false);
    public static final WallBlock STRIPPED_CRIMSON_HYPHAE_WALL = noTooltipHelper("stripped_crimson_hyphae_wall", CRIMSON_HYPHAE, false);
    public static final WallBlock STRIPPED_CRIMSON_STEM_WALL = noTooltipHelper("stripped_crimson_stem_wall", CRIMSON_HYPHAE, false);
    public static final WallBlock STRIPPED_DARK_OAK_WOOD_WALL = noTooltipHelper("stripped_dark_oak_wood_wall", DARK_OAK_WOOD, true);
    public static final WallBlock STRIPPED_DARK_OAK_LOG_WALL = noTooltipHelper("stripped_dark_oak_log_wall", DARK_OAK_WOOD, true);
    public static final WallBlock STRIPPED_ACACIA_WOOD_WALL = noTooltipHelper("stripped_acacia_wood_wall", ACACIA_WOOD, true);
    public static final WallBlock STRIPPED_ACACIA_LOG_WALL = noTooltipHelper("stripped_acacia_log_wall", ACACIA_WOOD, true);
    public static final WallBlock STRIPPED_JUNGLE_WOOD_WALL = noTooltipHelper("stripped_jungle_wood_wall", JUNGLE_WOOD, true);
    public static final WallBlock STRIPPED_JUNGLE_LOG_WALL = noTooltipHelper("stripped_jungle_log_wall", JUNGLE_WOOD, true);
    public static final WallBlock STRIPPED_BIRCH_WOOD_WALL = noTooltipHelper("stripped_birch_wood_wall", BIRCH_WOOD, true);
    public static final WallBlock STRIPPED_BIRCH_LOG_WALL = noTooltipHelper("stripped_birch_log_wall", BIRCH_WOOD, true);
    public static final WallBlock STRIPPED_MANGROVE_WOOD_WALL = noTooltipHelper("stripped_mangrove_wood_wall", MANGROVE_WOOD, true);
    public static final WallBlock STRIPPED_MANGROVE_LOG_WALL = noTooltipHelper("stripped_mangrove_log_wall", MANGROVE_WOOD, true);
    public static final WallBlock STRIPPED_CHERRY_WOOD_WALL = noTooltipHelper("stripped_cherry_wood_wall", CHERRY_WOOD, true);
    public static final WallBlock STRIPPED_CHERRY_LOG_WALL = noTooltipHelper("stripped_cherry_log_wall", CHERRY_WOOD, true);
    public static final WallBlock STRIPPED_BAMBOO_WALL = noTooltipHelper("stripped_bamboo_wall", OAK_WOOD, true);
    public static final WallBlock STRIPPED_BAMBOO_MOSAIC_WALL = noTooltipHelper("stripped_bamboo_mosaic_wall", OAK_WOOD, true);
    public static final WallBlock STRIPPED_BAMBOO_PLANK_WALL = noTooltipHelper("stripped_bamboo_plank_wall", OAK_WOOD, true);

    private static WallBlock noTooltipHelper(String name, Block block, boolean Burns) {
        if (Burns) { return woodWallHelper(name, block, "", "", "", null, 3001, 5, 10); }
        return woodWallHelper(name, block, "", "", "", null);
    }
    @SuppressWarnings("SameParameterValue")
    private static WallBlock woodWallHelper(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip, WallBlock strippedWall) { return woodWallHelper(name, block, NormToolTip, ShiftToolTip, CtrlToolTip, strippedWall, 0, 0, 0); }
    @SuppressWarnings("SameParameterValue")
    private static WallBlock woodWallHelper(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip, WallBlock strippedWall, int fuelTime, int burnChance, int burnSpread) {
        WallBlock hold;
        if (fuelTime > 0) {
            hold = (WallBlock) registerBlock(name,
                    new strippedWoodWall(AbstractBlock.Settings.copy(block).sounds(BlockSoundGroup.WOOD), NormToolTip, ShiftToolTip, CtrlToolTip, strippedWall), true, fuelTime, burnChance, burnSpread);
        } else {
            hold = (WallBlock) registerBlock(name,
                    new strippedWoodWall(AbstractBlock.Settings.copy(block).sounds(BlockSoundGroup.WOOD), NormToolTip, ShiftToolTip, CtrlToolTip, strippedWall)
            );
        }
        return hold;
    }
    public static void registerWoodWalls() { Delbase.LOGGER.info("Registering Stripped Wood Walls for "+Delbase.Delbase_ID); }
}