package com.glektarssza.expanded_gamerules;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.glektarssza.expanded_gamerules.utils.TypeUtilities;

/**
 * The global constants used across the mod.
 */
public final class Constants {
    /**
     * The mod ID.
     */
    @NotNull
    public static final String MOD_ID = "expanded_gamerules";

    /**
     * The mod name.
     */
    @NotNull
    public static final String MOD_NAME = "Expanded Gamerules";

    /**
     * The root logger for the mod.
     */
    @NotNull
    public static final Logger ROOT_LOGGER = TypeUtilities
        .castAsNotNull(LoggerFactory.getLogger(MOD_NAME));

    /**
     * Create a new instance.
     */
    public Constants() {
        // -- Does nothing
    }
}
