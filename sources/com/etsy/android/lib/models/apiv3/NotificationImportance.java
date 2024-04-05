package com.etsy.android.lib.models.apiv3;

import com.squareup.moshi.C17403o;

@C17403o(generateAdapter = false)
public enum NotificationImportance {
    MIN(1),
    LOW(2),
    DEFAULT(3),
    HIGH(4);
    
    private final int value;

    private NotificationImportance(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
