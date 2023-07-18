package com.dephoegon.delbase;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import static com.dephoegon.delbase.aid.util.regLists.RegisterClientFirst;

@Environment(EnvType.CLIENT)
public class DelbaseClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        RegisterClientFirst();
    }
}
