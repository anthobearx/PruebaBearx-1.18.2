package net.anthobearx.pruebabearx;

import net.anthobearx.pruebabearx.itembearx.ItemBearx;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PruebaBearx implements ModInitializer {

	public static final String MOD_ID = "pruebabearx";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ItemBearx.registerModItems();
	}
}
