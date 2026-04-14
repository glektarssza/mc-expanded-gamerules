package com.glektarssza.expanded_gamerules.utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A collection of type utilities.
 */
public final class TypeUtilities {
    /**
     * Cast a nullable value to a not nullable value.
     *
     * @param <T> The type of the value being cast.
     * @param value The value being cast.
     *
     * @return The cast value.
     */
    @NotNull
    public static <T> T castAsNotNull(@Nullable T value) {
        if (value == null) {
            throw new NullPointerException(
                "Value that should be not null was null");
        }
        return value;
    }
}
