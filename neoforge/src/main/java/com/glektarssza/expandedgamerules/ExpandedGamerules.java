package com.glektarssza.expandedgamerules;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

/**
 * The main class for the mod.
 */
@Mod(Constants.MOD_ID)
public class ExpandedGamerules {

    /**
     * Create a new instance.
     *
     * @param eventBus The event bus.
     */
    public ExpandedGamerules(IEventBus eventBus) {
        CommonClass.init();
        Constants.LOG.info("Initializing NeoForge code for mod \"{}\"", Constants.MOD_NAME);
        // TODO: Add NeoForge initialization code here

    }
}
