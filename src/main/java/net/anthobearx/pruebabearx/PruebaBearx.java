package net.anthobearx.pruebabearx;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PruebaBearx implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("pruebabearx");

	@Override
	public void onInitialize() {
		//idk bro
		LOGGER.info("Hello Fabric world!");
	}
}
