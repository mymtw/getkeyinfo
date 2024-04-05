package com.paypal.pyplcheckout.utils;

public enum ProviderApps {
    VENICE("com.paypal.android.p2pmobile");
    
    private final String providerApp;

    private ProviderApps(String str) {
        this.providerApp = str;
    }

    public final String getProviderApp() {
        return this.providerApp;
    }
}
