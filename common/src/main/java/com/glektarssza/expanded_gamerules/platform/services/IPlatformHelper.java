package com.glektarssza.expanded_gamerules.platform.services;

import org.jetbrains.annotations.NotNull;

/**
 * An interface which defines the shape of a service which can interface with
 * the mod loader platform.
 */
public interface IPlatformHelper {

    /**
     * Gets the name of the current environment type.
     *
     * @return The name of the current environment type.
     */
    @NotNull
    public default String getEnvironmentName() {
        return isDevelopmentEnvironment() ? "development" : "production";
    }

    /**
     * Gets the name of the current mod loader platform
     *
     * @return The name of the current mod loader platform.
     */
    @NotNull
    public String getPlatformName();

    /**
     * Check if the game is currently in a development environment.
     *
     * @return {@code true} if the game is running in a development environment,
     *         {@code false} otherwise.
     */
    public boolean isDevelopmentEnvironment();

    /**
     * Check if a mod with the given id is loaded.
     *
     * @param modId The mod ID to check for the presence of..
     *
     * @return {@code true} if a mod with the given ID is loaded, {@code false}
     *         otherwise.
     */
    public boolean isModLoaded(String modId);
}
