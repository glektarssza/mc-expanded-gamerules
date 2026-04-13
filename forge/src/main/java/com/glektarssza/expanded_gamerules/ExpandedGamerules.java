package com.glektarssza.expanded_gamerules;

import net.minecraftforge.fml.common.Mod;

/**
 * The Forge mod loader entry class.
 */
@Mod(Constants.MOD_ID)
public class ExpandedGamerules {
    /**
     * Create a new instance.
     */
    public ExpandedGamerules() {
        Constants.ROOT_LOGGER.info("Hello world from Forge!");
        CommonClass.init();
    }
}
