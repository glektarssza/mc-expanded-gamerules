package com.glektarssza.expandedgamerules;

import net.fabricmc.api.ModInitializer;

/**
 * The main class for the mod.
 */
public class ExpandedGamerules implements ModInitializer {

    /**
     * Initialize the mod.
     */
    @Override
    public void onInitialize() {
        CommonClass.init();
        Constants.LOG.info("Initializing Fabric code for mod \"{}\"", Constants.MOD_NAME);
        // TODO: Add Fabric initialization code here
    }
}
