package net.nutcraft.main;

import net.fabricmc.api.ModInitializer;
import net.nutcraft.init.ModBlocks;
import net.nutcraft.init.ModEntities;

public class Main implements ModInitializer {
	@Override
	public void onInitialize() {
		// Init anything not strictly client sided(this is used most often)
		ModBlocks.init();
		ModEntities.init();
	}
}
