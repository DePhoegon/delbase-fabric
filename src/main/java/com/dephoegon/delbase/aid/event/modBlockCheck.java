package com.dephoegon.delbase.aid.event;

import com.dephoegon.delbase.aid.block.stock.*;
import net.minecraft.block.Block;

public class modBlockCheck {
    public static boolean isModBlock(Block block) {
        boolean out = block instanceof modPillarBlock;
        if (block instanceof modSlabBlock) { out = true; }
        if (block instanceof fenceBlock) { out = true; }
        if (block instanceof modFenceGate) { out = true; }
        if (block instanceof modGenBlock) { out = true; }
        if (block instanceof modColoredFallingBlock) { out = true; }
        if (block instanceof stairBlock) { out = true; }
        if (block instanceof wallBlock) { out = true; }
        return out;
    }
}
