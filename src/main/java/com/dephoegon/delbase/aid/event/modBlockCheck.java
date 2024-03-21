package com.dephoegon.delbase.aid.event;

import com.dephoegon.delbase.aid.block.stock.*;
import net.minecraft.block.*;

public class modBlockCheck {
    public static boolean hasAshBlock(Block block) {
        boolean out = block instanceof axisBlock;
        if (block instanceof SlabBlock) { out = true; }
        if (block instanceof FenceBlock) { out = true; }
        if (block instanceof FenceGateBlock) { out = true; }
        if (block instanceof genBlock) { out = true; }
        if (block instanceof PillarBlock) { out = true; }
        if (block instanceof SandBlock) { out = true; }
        if (block instanceof StairsBlock) { out = true; }
        if (block instanceof WallBlock) { out = true; }
        return out;
    }
}