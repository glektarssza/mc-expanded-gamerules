package com.glektarssza.expanded_gamerules.platform;

import org.jetbrains.annotations.NotNull;

import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLLoader;

import com.glektarssza.expanded_gamerules.platform.services.IPlatformHelper;

/**
 * The platform helper for the Forge mod loader.
 */
public class ForgePlatformHelper implements IPlatformHelper {
    /**
     * {@inheritDoc}
     */
    @Override
    @NotNull
    public String getPlatformName() {
        return "Forge";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isDevelopmentEnvironment() {
        return !FMLLoader.isProduction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isModLoaded(String modId) {
        return ModList.get().isLoaded(modId);
    }
}
