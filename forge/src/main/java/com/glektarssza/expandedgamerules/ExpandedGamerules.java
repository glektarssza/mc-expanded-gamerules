package com.glektarssza.expandedgamerules;

import net.minecraftforge.fml.common.Mod;

/**
 * The main class for the mod.
 */
@Mod(Constants.MOD_ID)
public class ExpandedGamerules {

    /**
     * Create a new instance.
     */
    public ExpandedGamerules() {
        CommonClass.init();
        Constants.LOG.info("Initializing Forge code for mod \"{}\"", Constants.MOD_NAME);
        // TODO: Add Forge initialization code here
    }
}
