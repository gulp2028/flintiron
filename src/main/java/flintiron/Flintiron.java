package flintiron;

import flintiron.blocks.ModBlocks;
import flintiron.items.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Flintiron implements ModInitializer {

	public static final String MOD_ID = "flintiron";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}

	public class LOGGER {
	}
}