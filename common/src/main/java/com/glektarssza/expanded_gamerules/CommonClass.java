package com.glektarssza.expanded_gamerules;

import com.glektarssza.expanded_gamerules.platform.Services;

/**
 * The common class.
 *
 * Provides logic common to startup and tear down between all mod loaders.
 */
public final class CommonClass {
    /**
     * Initialize the shaded logic.
     */
    public static void init() {
        Constants.ROOT_LOGGER.info(
            "Hello from common initialization code for {}!",
            Services.PLATFORM.getPlatformName());
        Constants.ROOT_LOGGER.info(
            "We're currently running in a {} environment!",
            Services.PLATFORM.getEnvironmentName());
    }

    /**
     * Create a new instance.
     */
    public CommonClass() {
        // -- Does nothing
    }
}
