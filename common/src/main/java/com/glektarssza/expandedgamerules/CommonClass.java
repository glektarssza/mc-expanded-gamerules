package com.glektarssza.expandedgamerules;

import com.glektarssza.expandedgamerules.platform.Services;

/**
 * A common utility class for the mod.
 */
public class CommonClass {

    /**
     * Common initialization routine for the mod.
     */
    public static void init() {
        Constants.LOG.info("Initializing common code for mod \"{}\"", Constants.MOD_NAME);
        Constants.LOG.info("Running in a {} environment", Services.PLATFORM.getEnvironmentName());
        // TODO: Add common initialization code here
    }
}
