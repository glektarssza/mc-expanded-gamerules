package com.glektarssza.expanded_gamerules.platform;

import org.jetbrains.annotations.NotNull;

import net.fabricmc.loader.api.FabricLoader;

import com.glektarssza.expanded_gamerules.platform.services.IPlatformHelper;

/**
 * The platform helper for the Fabric mod loader.
 */
public class FabricPlatformHelper implements IPlatformHelper {
    /**
     * {@inheritDoc}
     */
    @Override
    @NotNull
    public String getPlatformName() {
        return "Fabric";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isDevelopmentEnvironment() {
        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isModLoaded(String modId) {
        return FabricLoader.getInstance().isModLoaded(modId);
    }
}
