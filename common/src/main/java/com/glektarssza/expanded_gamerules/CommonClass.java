package com.glektarssza.expanded_gamerules;

// import com.example.examplemod.platform.Services;
// import net.minecraft.core.registries.BuiltInRegistries;
// import net.minecraft.world.item.Items;

/**
 * The common class.
 *
 * @apiNote Provides logic common to startup and tear down between all mod
 * loaders.
 */
public class CommonClass {
    /**
     * Initialize the shaded logic.
     */
    public static void init() {
        // Constants.LOGGER.info("Hello from common initialization code for {}!", Services.PLATFORM.getPlatformName());
        // Constants.LOGGER.info("We're currently running in a {} environment!", Services.PLATFORM.getEnvironmentName());
        Constants.LOGGER.info("The ID for diamonds is {}", BuiltInRegistries.ITEM.getKey(Items.DIAMOND));
    }
}
