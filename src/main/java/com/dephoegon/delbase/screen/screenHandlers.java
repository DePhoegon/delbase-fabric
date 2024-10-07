package com.dephoegon.delbase.screen;

import com.dephoegon.delbase.Delbase;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class screenHandlers {
    public static final ScreenHandlerType<blockCuttingStationScreenHandler> BLOCK_CUTTING_STATION_SCREEN_HANDLER = Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Delbase.Delbase_ID, "block_cutting_station"), new ExtendedScreenHandlerType<>(blockCuttingStationScreenHandler::new, BlockPos.PACKET_CODEC));

    public static void registerScreenHandlers() {  Delbase.LOGGER.info("Registering ScreenHandlers");  }
}
