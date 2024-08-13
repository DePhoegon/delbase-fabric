package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.stock.wallBlock;
import com.dephoegon.delbase.block.baseModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.WallBlock;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.*;

public class hedgeLeaves extends baseModBlocks {
    public static final WallBlock OAK_HEDGE = noToolTipAid("oak_hedge", OAK_LEAVES);
    public static final WallBlock JUNGLE_HEDGE = noToolTipAid("jungle_hedge", JUNGLE_LEAVES);
    public static final WallBlock BIRCH_HEDGE = noToolTipAid("birch_hedge", BIRCH_LEAVES);
    public static final WallBlock SPRUCE_HEDGE = noToolTipAid("spruce_hedge", SPRUCE_LEAVES);
    public static final WallBlock ACACIA_HEDGE = noToolTipAid("acacia_hedge", ACACIA_LEAVES);
    public static final WallBlock DARK_OAK_HEDGE = noToolTipAid("dark_oak_hedge", DARK_OAK_LEAVES);
    public static final WallBlock AZALEA_HEDGE = noToolTipAid("azalea_hedge", AZALEA_LEAVES, BlockSoundGroup.AZALEA_LEAVES);
    public static final WallBlock FLOWERING_AZALEA_HEDGE = noToolTipAid("flowering_azalea_hedge", FLOWERING_AZALEA_LEAVES, BlockSoundGroup.FLOWERING_AZALEA);
    public static final WallBlock MANGROVE_HEDGE = noToolTipAid("mangrove_hedge", MANGROVE_LEAVES, BlockSoundGroup.GLASS);
    public static final WallBlock CHERRY_HEDGE = noToolTipAid("cherry_hedge", MANGROVE_LEAVES, BlockSoundGroup.CHERRY_LEAVES);

    private static WallBlock noToolTipAid(String name, Block block) { return leafWallHelper(name, block, BlockSoundGroup.GLASS, "", "", ""); }
    private static WallBlock noToolTipAid(String name, Block block, BlockSoundGroup group) { return leafWallHelper(name, block, group, "", "", ""); }
    private static WallBlock leafWallHelper(String name, Block block, BlockSoundGroup group, String norm, String Shift, String Ctrl) { return (WallBlock) registerBlock(name, new wallBlock(AbstractBlock.Settings.copy(block).sounds(group), norm, Shift, Ctrl, null), 30, 60); }
    public static void registerLeafSlabs() { Delbase.LOGGER.info("Registering Leaf Hedges for "+Delbase.Delbase_ID); }
}