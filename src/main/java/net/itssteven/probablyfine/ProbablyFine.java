package net.itssteven.probablyfine;

import net.fabricmc.api.ModInitializer;

import net.itssteven.probablyfine.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProbablyFine implements ModInitializer {
	public static final String MOD_ID = "probably-fine";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();

		LOGGER.info("Hello Fabric world!");
	}
}