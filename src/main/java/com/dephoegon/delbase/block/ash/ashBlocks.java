package com.dephoegon.delbase.block.ash;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.stock.genBlock;
import com.dephoegon.delbase.aid.block.stock.slabBlock;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;

public class ashBlocks extends baseModBlocks {
    private static final AbstractBlock.Settings ashBlock = FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD);
    public static final SlabBlock ASH_SLAB = (SlabBlock) registerBlock("ash_slab", new slabBlock(ashBlock, "", "", "", null), ItemGroup.BUILDING_BLOCKS, 8000);
    public static final Block ASH_BLOCK = registerBlock("ash_block", new genBlock(ashBlock,"", "", ""), ItemGroup.BUILDING_BLOCKS, 16000);
    public static void registerAshBlocks() { Delbase.LOGGER.info("Registering Ash Blocks for "+Delbase.Delbase_ID); }
}
