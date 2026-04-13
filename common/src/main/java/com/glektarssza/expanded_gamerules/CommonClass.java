package com.glektarssza.expanded_gamerules;

// import com.glektarssza.expanded_gamerules.platform.Services;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Items;

/**
 * The common class.
 *
 * Provides logic common to startup and tear down between all mod loaders.
 */
public final class CommonClass {
    /**
     * Create a new instance.
     */
    public CommonClass() {
        // -- Does nothing
    }

    /**
     * Initialize the shaded logic.
     */
    public static void init() {
        // Constants.ROOT_LOGGER.info("Hello from common initialization code for
        // {}!", Services.PLATFORM.getPlatformName());
        // Constants.ROOT_LOGGER.info("We're currently running in a {}
        // environment!", Services.PLATFORM.getEnvironmentName());
        Constants.ROOT_LOGGER.info("The ID for diamonds is {}",
            BuiltInRegistries.ITEM.getKey(Items.DIAMOND));
    }
}
