package com.paypal.pyplcheckout.utils;

public enum CrashLoggerKey {
    BUTTON_SESSION_ID("xo_button_session_id"),
    BUYER_COUNTRY("xo_buyer_country"),
    CACHED_BUTTON_SESSION_ID("xo_cached_button_session_id");
    
    private final String key;

    private CrashLoggerKey(String str) {
        this.key = str;
    }

    public final String getKey() {
        return this.key;
    }
}
