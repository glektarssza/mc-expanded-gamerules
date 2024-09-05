package com.glektarssza.expandedgamerules;

import com.glektarssza.expandedgamerules.platform.Services;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Items;

/**
 * A common utility class for the mod.
 */
public class CommonClass {
    /**
     * Common initialization routine for the mod.
     */
    public static void init() {
        Constants.LOG.info("Hello from Common init on {}! we are currently in a {} environment!",
                Services.PLATFORM.getPlatformName(), Services.PLATFORM.getEnvironmentName());
        Constants.LOG.info("The ID for diamonds is {}", BuiltInRegistries.ITEM.getKey(Items.DIAMOND));
        if (Services.PLATFORM.isModLoaded("expandedgamerules")) {
            Constants.LOG.info("Hello to expandedgamerules");
        }
    }
}
