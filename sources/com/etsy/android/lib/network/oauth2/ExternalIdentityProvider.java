package com.etsy.android.lib.network.oauth2;

import com.etsy.android.lib.models.PaymentMethod;

public enum ExternalIdentityProvider {
    GOOGLE(PaymentMethod.TYPE_GOOGLE_WALLET),
    FACEBOOK("facebook");
    
    private final String providerName;

    private ExternalIdentityProvider(String str) {
        this.providerName = str;
    }

    public final String getProviderName() {
        return this.providerName;
    }
}
