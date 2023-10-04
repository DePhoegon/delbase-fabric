package com.dephoegon.delbase.aid.world;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.util.composable;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;

public class serverAccess {
    public static void init() {
        Delbase.LOGGER.info("(DelBase Mod) - Server Access initialized");
        ServerLifecycleEvents.SERVER_STARTED.register(server -> composable.addToList());
    }
}