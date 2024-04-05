package com.etsy.android.lib.models.apiv3;

public enum CancellationType {
    TYPE_CANCEL_WITHIN_HOURS("hours"),
    TYPE_CANCEL_BEFORE_SHIPPED("until_shipped");
    
    private final String value;

    private CancellationType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
