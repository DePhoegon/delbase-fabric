package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.stock.wallBlock;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
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
    public static final WallBlock AZALEA_HEDGE = noToolTipAid("azalea_hedge", AZALEA_LEAVES);
    public static final WallBlock FLOWERING_AZALEA_HEDGE = noToolTipAid("flowering_azalea_hedge", FLOWERING_AZALEA_LEAVES);

    private static WallBlock noToolTipAid(String name, Block block) { return cutSandStoneHelper(name, block, "", "", ""); }
    private static WallBlock cutSandStoneHelper(String name, Block block, String norm, String Shift, String Ctrl) { return (WallBlock) registerBlock(name, new wallBlock(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.GRASS), norm, Shift, Ctrl, null), 5, 10); }
    public static void registerLeafSlabs() { Delbase.LOGGER.info("Registering Leaf Hedges for "+Delbase.Delbase_ID); }
}