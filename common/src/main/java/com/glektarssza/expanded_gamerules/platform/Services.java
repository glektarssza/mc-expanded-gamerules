package com.glektarssza.expanded_gamerules.platform;

import java.util.ServiceLoader;

import org.jetbrains.annotations.NotNull;

import com.glektarssza.expanded_gamerules.Constants;
import com.glektarssza.expanded_gamerules.platform.services.IPlatformHelper;
import com.glektarssza.expanded_gamerules.utils.TypeUtilities;

/**
 * A class that provides a way to access services.
 */
public final class Services {
    /**
     * The platform service.
     */
    @NotNull
    public static final IPlatformHelper PLATFORM = load(IPlatformHelper.class);

    /**
     * Load the service described by the given class.
     *
     * @param <T> The type of the service class to load.
     * @param clazz The class describing the service to load.
     *
     * @return The loaded service.
     */
    @NotNull
    private static <T> T load(Class<T> clazz) throws NullPointerException {
        final T loadedService = ServiceLoader.load(clazz)
            .findFirst()
            .orElseThrow(() -> new NullPointerException(
                "Failed to load service for class " + clazz.getName()));
        Constants.ROOT_LOGGER.debug("Loaded instance {} for service {}",
            loadedService, clazz);
        return TypeUtilities.castAsNotNull(loadedService);
    }

    /**
     * Create a new instance.
     */
    public Services() {
        // -- Does nothing
    }
}
