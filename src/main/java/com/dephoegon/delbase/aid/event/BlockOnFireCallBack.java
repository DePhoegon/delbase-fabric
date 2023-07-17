package com.dephoegon.delbase.aid.event;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface BlockOnFireCallBack {
    Event<BlockOnFireCallBack> EVENT = EventFactory.createArrayBacked(BlockOnFireCallBack.class,
            (listeners) -> (world, pos, state) -> {
                for (BlockOnFireCallBack listener : listeners) {
                    listener.onBlockOnFire(world, pos, state);
                }
            });

    void onBlockOnFire(World world, BlockPos pos, BlockState state);
}
