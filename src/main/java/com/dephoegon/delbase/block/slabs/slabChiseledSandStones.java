package com.dephoegon.delbase.block.slabs;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.stock.energySlab;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.SAND;

public class slabChiseledSandStones extends baseModBlocks {

    private static SlabBlock energySandSlabHelper(String name) { return (SlabBlock) registerBlock(name, new energySlab(FabricBlockSettings.copyOf(SAND).sounds(BlockSoundGroup.SAND), "","","", null)); }
    public static void registerCutSandStoneSlabs() { Delbase.LOGGER.info("Registering Cut SandStone Slabs for "+Delbase.Delbase_ID); }
}
