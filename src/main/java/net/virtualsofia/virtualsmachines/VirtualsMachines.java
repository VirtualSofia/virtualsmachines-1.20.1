package net.virtualsofia.virtualsmachines;

import net.fabricmc.api.ModInitializer;

import net.virtualsofia.virtualsmachines.block.ModBlocks;
import net.virtualsofia.virtualsmachines.item.ModItemGroups;
import net.virtualsofia.virtualsmachines.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VirtualsMachines implements ModInitializer {

	public static final String MOD_ID = "virtualsmachines";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world! Initializing Virtual's Machines");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}