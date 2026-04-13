package com.glektarssza.expanded_gamerules.platform;

import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLEnvironment;

import com.glektarssza.expanded_gamerules.platform.services.IPlatformHelper;

/**
 * The platform helper for the NeoForge mod loader.
 */
public class NeoForgePlatformHelper implements IPlatformHelper {
    /**
     * Create a new instance.
     */
    public NeoForgePlatformHelper() {
        // -- Does nothing
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getPlatformName() {
        return "NeoForge";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isDevelopmentEnvironment() {
        return !FMLEnvironment.production;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isModLoaded(String modId) {
        return ModList.get().isLoaded(modId);
    }
}
