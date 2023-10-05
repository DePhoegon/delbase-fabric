package com.dephoegon.delbase;

import com.dephoegon.delbase.aid.util.regLists;
import com.dephoegon.delbase.aid.world.config;
import dev.toma.configuration.Configuration;
import dev.toma.configuration.config.format.ConfigFormats;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.dephoegon.delbase.aid.util.regLists.RegisterClientFirst;

public class Delbase implements ModInitializer, ClientModInitializer {
	public static final String Delbase_ID = "delbase";

    public static final Logger LOGGER = LoggerFactory.getLogger(Delbase_ID);
	public static config configHolder;

	public void onInitialize() {
		configHolder = Configuration.registerConfig(config.class, ConfigFormats.yaml()).getConfigInstance();
		regLists.RegisterBaseEvents();
		regLists.RegisterFirstList();
		regLists.RegisterSecondList();
	}
	@Environment(EnvType.CLIENT)
	public void onInitializeClient() { RegisterClientFirst(); }
}