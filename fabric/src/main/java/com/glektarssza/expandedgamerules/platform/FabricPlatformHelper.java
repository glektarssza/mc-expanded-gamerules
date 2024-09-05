package com.glektarssza.expandedgamerules.platform;

import com.glektarssza.expandedgamerules.platform.services.IPlatformHelper;

import net.fabricmc.loader.api.FabricLoader;

/**
 * The Fabric-specific implementation of the platform helper.
 */
public class FabricPlatformHelper implements IPlatformHelper {

    /**
     * Get the name of the platform.
     *
     * @return The name of the platform.
     */
    @Override
    public String getPlatformName() {
        return "Fabric";
    }

    /**
     * Check if a mod is loaded.
     *
     * @param modId The ID of the mod to check.
     *
     * @return `true` if the mod is loaded; `false` otherwise.
     */
    @Override
    public boolean isModLoaded(String modId) {
        return FabricLoader.getInstance().isModLoaded(modId);
    }

    /**
     * Check if the current environment is a development environment.
     *
     * @return `true` if the current environment is a development environment;
     * `false` otherwise.
     */
    @Override
    public boolean isDevelopmentEnvironment() {
        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }
}
