package com.dephoegon.delbase;

import com.dephoegon.delbase.aid.util.regLists;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Delbase implements ModInitializer {
	public static final String Delbase_ID = "delbase";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger(Delbase_ID);

	@Override
	public void onInitialize() {
		regLists.RegisterFirstList();
		regLists.RegisterSecondList();
	}
}