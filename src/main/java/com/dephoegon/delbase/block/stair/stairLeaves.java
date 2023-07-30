package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.stock.stairBlock;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;
import org.jetbrains.annotations.NotNull;

import static net.minecraft.block.Blocks.*;

public class stairLeaves extends baseModBlocks {
    public static final StairsBlock OAK_LEAF_STAIR = noToolTipAid("oak_leaf_stair", OAK_LEAVES);
    public static final StairsBlock JUNGLE_LEAF_STAIR = noToolTipAid("jungle_leaf_stair", JUNGLE_LEAVES);
    public static final StairsBlock BIRCH_LEAF_STAIR = noToolTipAid("birch_leaf_stair", BIRCH_LEAVES);
    public static final StairsBlock SPRUCE_LEAF_STAIR = noToolTipAid("spruce_leaf_stair", SPRUCE_LEAVES);
    public static final StairsBlock ACACIA_LEAF_STAIR = noToolTipAid("acacia_leaf_stair", ACACIA_LEAVES);
    public static final StairsBlock DARK_OAK_LEAF_STAIR = noToolTipAid("dark_oak_leaf_stair", DARK_OAK_LEAVES);
    public static final StairsBlock AZALEA_LEAF_STAIR = noToolTipAid("azalea_leaf_stair", AZALEA_LEAVES);
    public static final StairsBlock FLOWERING_AZALEA_LEAF_STAIR = noToolTipAid("flowering_azalea_leaf_stair", FLOWERING_AZALEA_LEAVES);

    private static StairsBlock noToolTipAid(String name, Block block) { return leafStairHelper(name, block, "", "", ""); }
    private static StairsBlock leafStairHelper(String name, @NotNull Block block, String norm, String Shift, String Ctrl) { return (StairsBlock) registerBlock(name, new stairBlock(block.getDefaultState(), FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.GRASS), norm, Shift, Ctrl, null), 30, 60); }
    public static void registerLeafStairs() { Delbase.LOGGER.info("Registering Leaf Stairs for "+Delbase.Delbase_ID); }
}