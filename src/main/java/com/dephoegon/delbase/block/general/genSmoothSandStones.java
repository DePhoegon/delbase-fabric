package com.dephoegon.delbase.block.general;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.gen.smoothSandStone;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.STONE;

public class genSmoothSandStones extends baseModBlocks {

    private static Block noToolTipAid(String name) { return smoothSandStoneRegAid(name, "", "", ""); }
    @SuppressWarnings("SameParameterValue")
    private static Block smoothSandStoneRegAid(String name, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return registerBlock(name, new smoothSandStone(FabricBlockSettings.copyOf(STONE).sounds(BlockSoundGroup.STONE), NormToolTip, ShiftToolTip, CtrlToolTip));
    }
    public static void registerSmoothSandStoneBlock() { Delbase.LOGGER.info("Registering Smooth Sandstones for "+Delbase.Delbase_ID); }
}
