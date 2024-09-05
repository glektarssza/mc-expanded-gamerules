package com.glektarssza.expandedgamerules.platform.services;

/**
 * An interface which defines the shape of a platform-specific helper.
 */
public interface IPlatformHelper {

    /**
     * Get the name of the platform.
     *
     * @return The name of the platform.
     */
    String getPlatformName();

    /**
     * Check if a mod is loaded.
     *
     * @param modId The ID of the mod to check.
     *
     * @return `true` if the mod is loaded; `false` otherwise.
     */
    boolean isModLoaded(String modId);

    /**
     * Check if the current environment is a development environment.
     *
     * @return `true` if the current environment is a development environment;
     * `false` otherwise.
     */
    boolean isDevelopmentEnvironment();

    /**
     * Get the name of the current environment.
     *
     * @return The name of the current environment.
     */
    default String getEnvironmentName() {
        return isDevelopmentEnvironment() ? "development" : "production";
    }
}
