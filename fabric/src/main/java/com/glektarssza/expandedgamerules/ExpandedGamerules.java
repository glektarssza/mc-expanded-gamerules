package com.glektarssza.expandedgamerules;

import net.fabricmc.api.ModInitializer;

public class ExpandedGamerules implements ModInitializer {
    @Override
    public void onInitialize() {
        Constants.LOG.info("Hello Fabric world!");
        CommonClass.init();
    }
}
