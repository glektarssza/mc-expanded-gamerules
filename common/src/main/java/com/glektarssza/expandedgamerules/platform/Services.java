package com.glektarssza.expandedgamerules.platform;

import java.util.ServiceLoader;

import com.glektarssza.expandedgamerules.Constants;
import com.glektarssza.expandedgamerules.platform.services.IPlatformHelper;

/**
 * A static utility class holding general mod services.
 */
public class Services {

    /**
     * The platform helper service
     */
    public static final IPlatformHelper PLATFORM = load(IPlatformHelper.class);

    /**
     * Load a service from the service loader.
     *
     * @param <T> The type of the service to load.
     * @param clazz The class of the service to load.
     *
     * @return The loaded service.
     */
    public static <T> T load(Class<T> clazz) {
        final T loadedService = ServiceLoader.load(clazz)
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        Constants.LOG.debug("Loaded {} for service {}", loadedService, clazz);
        return loadedService;
    }
}
