package com.glektarssza.expanded_gamerules;

import javax.annotation.Nonnull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The global constants used across the mod.
 */
public class Constants {
    /**
     * The mod ID.
     */
    @Nonnull
	public static final String MOD_ID = "expanded_gamerules";

    /**
     * The mod name.
     */
    @Nonnull
	public static final String MOD_NAME = "Expanded Gamerules";

    /**
     * The root logger for the mod.
     */
    @Nonnull
	public static final Logger ROOT_LOGGER = LoggerFactory.getLogger(MOD_NAME);
}
