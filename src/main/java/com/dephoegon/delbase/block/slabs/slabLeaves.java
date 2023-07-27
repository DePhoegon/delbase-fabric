package com.dephoegon.delbase.block.slabs;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.stock.slabBlock;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.*;

public class slabLeaves extends baseModBlocks {
    public static final SlabBlock OAK_LEAF_SLAB = noToolTipAid("oak_leaf_slab", OAK_LEAVES);
    public static final SlabBlock JUNGLE_LEAF_SLAB = noToolTipAid("jungle_leaf_slab", JUNGLE_LEAVES);
    public static final SlabBlock BIRCH_LEAF_SLAB = noToolTipAid("birch_leaf_slab", BIRCH_LEAVES);
    public static final SlabBlock ACACIA_LEAF_SLAB = noToolTipAid("acacia_leaf_slab", ACACIA_LEAVES);
    public static final SlabBlock DARK_OAK_LEAF_SLAB = noToolTipAid("dark_oak_leaf_slab", DARK_OAK_LEAVES);
    public static final SlabBlock AZALEA_LEAF_SLAB = noToolTipAid("azalea_leaf_slab", AZALEA_LEAVES);
    public static final SlabBlock FLOWERING_AZALEA_LEAF_SLAB = noToolTipAid("flowering_azalea_leaf_slab", FLOWERING_AZALEA_LEAVES);

    private static SlabBlock noToolTipAid(String name, Block block) { return cutSandStoneHelper(name, block, "", "", ""); }
    private static SlabBlock cutSandStoneHelper(String name, Block block, String norm, String Shift, String Ctrl) { return (SlabBlock) registerBlock(name, new slabBlock(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.GRASS), norm, Shift, Ctrl, null), 5, 10); }
    public static void registerLeafSlabs() { Delbase.LOGGER.info("Registering Leaf Slabs for "+Delbase.Delbase_ID); }
}