package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.alt.woodWall;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.WallBlock;
import net.minecraft.sound.BlockSoundGroup;

import static com.dephoegon.delbase.block.wall.wallStrippedWoods.*;
import static net.minecraft.block.Blocks.*;

public class wallWoods extends baseModBlocks {
    public static final WallBlock SPRUCE_WOOD_WALL = noTooltipHelper("spruce_wood_wall", SPRUCE_WOOD, STRIPPED_SPRUCE_WOOD_WALL, true);
    public static final WallBlock SPRUCE_LOG_WALL = noTooltipHelper("spruce_log_wall", SPRUCE_WOOD, STRIPPED_SPRUCE_LOG_WALL, true);
    public static final WallBlock OAK_WOOD_WALL = noTooltipHelper("oak_wood_wall", OAK_WOOD, STRIPPED_OAK_WOOD_WALL, true);
    public static final WallBlock OAK_LOG_WALL = noTooltipHelper("oak_log_wall", OAK_WOOD, STRIPPED_OAK_LOG_WALL, true);
    public static final WallBlock WARPED_HYPHAE_WALL = noTooltipHelper("warped_hyphae_wall", WARPED_HYPHAE, STRIPPED_WARPED_HYPHAE_WALL, false);
    public static final WallBlock WARPED_STEM_WALL = noTooltipHelper("warped_stem_wall", WARPED_HYPHAE, STRIPPED_WARPED_STEM_WALL, false);
    public static final WallBlock CRIMSON_HYPHAE_WALL = noTooltipHelper("crimson_hyphae_wall", CRIMSON_HYPHAE, STRIPPED_CRIMSON_HYPHAE_WALL, false);
    public static final WallBlock CRIMSON_STEM_WALL = noTooltipHelper("crimson_stem_wall", CRIMSON_HYPHAE, STRIPPED_CRIMSON_STEM_WALL, false);
    public static final WallBlock DARK_OAK_WOOD_WALL = noTooltipHelper("dark_oak_wood_wall", DARK_OAK_WOOD, STRIPPED_DARK_OAK_WOOD_WALL, true);
    public static final WallBlock DARK_OAK_LOG_WALL = noTooltipHelper("dark_oak_log_wall", DARK_OAK_WOOD, STRIPPED_DARK_OAK_LOG_WALL, true);
    public static final WallBlock ACACIA_WOOD_WALL = noTooltipHelper("acacia_wood_wall", ACACIA_WOOD, STRIPPED_ACACIA_WOOD_WALL, true);
    public static final WallBlock ACACIA_LOG_WALL = noTooltipHelper("acacia_log_wall", ACACIA_WOOD, STRIPPED_ACACIA_LOG_WALL, true);
    public static final WallBlock JUNGLE_WOOD_WALL = noTooltipHelper("jungle_wood_wall", JUNGLE_WOOD, STRIPPED_JUNGLE_WOOD_WALL, true);
    public static final WallBlock JUNGLE_LOG_WALL = noTooltipHelper("jungle_log_wall", JUNGLE_WOOD, STRIPPED_JUNGLE_LOG_WALL, true);
    public static final WallBlock BIRCH_WOOD_WALL = noTooltipHelper("birch_wood_wall", BIRCH_WOOD, STRIPPED_BIRCH_WOOD_WALL, true);
    public static final WallBlock BIRCH_LOG_WALL = noTooltipHelper("birch_log_wall", BIRCH_WOOD, STRIPPED_BIRCH_LOG_WALL, true);

    private static WallBlock noTooltipHelper(String name, Block block, WallBlock strippedState, boolean Burns) {
        if (Burns) { return woodWallHelper(name, block, "", "", "", strippedState, 3001, 5, 10); }
        return woodWallHelper(name, block, "", "", "", strippedState);
    }
    @SuppressWarnings("SameParameterValue")
    private static WallBlock woodWallHelper(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip, WallBlock strippedWall) { return woodWallHelper(name, block, NormToolTip, ShiftToolTip, CtrlToolTip, strippedWall, 0, 0, 0); }
    @SuppressWarnings("SameParameterValue")
    private static WallBlock woodWallHelper(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip, WallBlock strippedWall, int fuelTime, int burnChance, int burnSpread) {
        WallBlock hold;
        if (fuelTime > 0) {
            hold = (WallBlock) registerBlock(name,
                    new woodWall(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.WOOD), NormToolTip, ShiftToolTip, CtrlToolTip, strippedWall), true, fuelTime, burnChance, burnSpread);
        } else {
            hold = (WallBlock) registerBlock(name,
                    new woodWall(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.WOOD), NormToolTip, ShiftToolTip, CtrlToolTip, strippedWall)
            );
        }
        return hold;
    }
    public static void registerWoodWalls() { Delbase.LOGGER.info("Registering Wood Walls for "+Delbase.Delbase_ID); }
}