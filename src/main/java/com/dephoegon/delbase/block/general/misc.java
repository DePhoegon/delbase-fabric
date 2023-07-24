package com.dephoegon.delbase.block.general;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.stock.genBlock;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.STONE;

public class misc extends baseModBlocks {
    public static Block HARDENED_OAK_PLANKS = noToolTipAid("hardened_oak_planks");

    private static Block noToolTipAid(String name) { return genBlockRegAid(name, "", "", ""); }
    @SuppressWarnings("SameParameterValue")
    private static Block genBlockRegAid(String name, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return registerBlock(name, new genBlock(FabricBlockSettings.copyOf(STONE).sounds(BlockSoundGroup.STONE), NormToolTip, ShiftToolTip, CtrlToolTip, null));
    }
    public static void registerMiscBlock() { Delbase.LOGGER.info("Registering Misc Blocks for "+Delbase.Delbase_ID); }
}
