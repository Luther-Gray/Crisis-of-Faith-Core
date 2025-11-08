package net.otherheaven;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class COFMain implements ModInitializer {
	public static final String MOD_ID = "faith-core";
	
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Crisis of Faith initialized.");
		// World Gen Init
		
	}
}