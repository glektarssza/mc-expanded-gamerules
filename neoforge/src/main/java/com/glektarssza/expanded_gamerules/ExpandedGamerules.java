package com.glektarssza.expanded_gamerules;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

/**
 * The NeoForge mod loader entry class.
 */
@Mod(Constants.MOD_ID)
public class ExpandedGamerules {
    /**
     * Create a new instance.
     *
     * @param eventBus The event bus to attach to.
     */
    public ExpandedGamerules(IEventBus eventBus) {
        Constants.ROOT_LOGGER.info("Hello world from NeoForge!");
        CommonClass.init();

    }
}
