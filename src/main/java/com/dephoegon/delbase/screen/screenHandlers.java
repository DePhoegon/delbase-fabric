package com.dephoegon.delbase.screen;

import com.dephoegon.delbase.Delbase;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class screenHandlers {
    public static final ScreenHandlerType<blockCuttingStationScreenHandler> BLOCK_CUTTING_STATION_SCREEN_HANDLER = Registry.register(Registry.SCREEN_HANDLER, new Identifier(Delbase.Delbase_ID, "block_cutting_station"), new ScreenHandlerType<>(blockCuttingStationScreenHandler::new));
}
