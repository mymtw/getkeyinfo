package com.etsy.android.lib.deeplinks;

public enum DeepLinkHost {
    WEB_FULL("www.etsy.com"),
    WEB("etsy.com"),
    WEB_ALT("etsy.me"),
    WEB_BUTTON("etsy.bttn.io");
    
    private final String hostName;

    private DeepLinkHost(String str) {
        this.hostName = str;
    }

    public final String getHostName() {
        return this.hostName;
    }
}
