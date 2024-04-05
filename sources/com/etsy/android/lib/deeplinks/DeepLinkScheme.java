package com.etsy.android.lib.deeplinks;

public enum DeepLinkScheme {
    SCHEME_ETSY("etsy"),
    SCHEME_ETSY_BETA("etsybeta"),
    SCHEME_WEB("http"),
    SCHEME_WEB_SAFE("https");
    
    private final String type;

    private DeepLinkScheme(String str) {
        this.type = str;
    }

    public final String getType() {
        return this.type;
    }
}
