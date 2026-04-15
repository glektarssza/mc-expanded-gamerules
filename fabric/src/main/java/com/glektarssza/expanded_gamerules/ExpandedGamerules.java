package com.glektarssza.expanded_gamerules;

import net.fabricmc.api.ModInitializer;

/**
 * The Fabric mod loader entry class.
 */
public class ExpandedGamerules implements ModInitializer {
    /**
     * Create a new instance.
     */
    public ExpandedGamerules() {
        // -- Do nothing
    }

    /**
     * The initialization handler callback.
     */
    @Override
    public void onInitialize() {
        Constants.ROOT_LOGGER.info("Hello Fabric world!");
        CommonClass.init();
    }
}
