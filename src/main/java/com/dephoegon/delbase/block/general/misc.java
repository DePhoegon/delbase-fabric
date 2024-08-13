package com.dephoegon.delbase.block.general;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.stock.modGenBlock;
import com.dephoegon.delbase.block.baseModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.STONE;

public class misc extends baseModBlocks {
    public static final Block HARDENED_OAK_PLANKS = noToolTipAid("hardened_oak_planks");

    private static Block noToolTipAid(String name) { return genBlockRegAid(name, "", "", ""); }
    @SuppressWarnings("SameParameterValue")
    private static Block genBlockRegAid(String name, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return registerBlock(name, new modGenBlock(AbstractBlock.Settings.copy(STONE).sounds(BlockSoundGroup.STONE), NormToolTip, ShiftToolTip, CtrlToolTip, null));
    }
    public static void registerMiscBlock() { Delbase.LOGGER.info("Registering Misc Blocks for "+Delbase.Delbase_ID); }
}
