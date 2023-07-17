package com.dephoegon.delbase.aid.event;

import com.dephoegon.delbase.aid.block.stock.*;
import net.minecraft.block.Block;

public class modBlockCheck {
    public static boolean isModBlock(Block block) {
        boolean out = block instanceof axisBlock;
        if (block instanceof slabBlock) { out = true; }
        if (block instanceof fenceBlock) { out = true; }
        if (block instanceof fenceGateBlock) { out = true; }
        if (block instanceof genBlock) { out = true; }
        if (block instanceof gravBlock) { out = true; }
        if (block instanceof stairBlock) { out = true; }
        if (block instanceof wallBlock) { out = true; }
        return out;
    }
}
