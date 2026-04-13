package com.glektarssza.expanded_gamerules.platform;

import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLLoader;

import com.glektarssza.expanded_gamerules.platform.services.IPlatformHelper;

/**
 * The platform helper for the NeoForge mod loader.
 */
public class NeoForgePlatformHelper implements IPlatformHelper {
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
        return !FMLLoader.getCurrent().isProduction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isModLoaded(String modId) {
        return ModList.get().isLoaded(modId);
    }
}
