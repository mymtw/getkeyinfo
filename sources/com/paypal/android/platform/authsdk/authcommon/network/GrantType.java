package com.paypal.android.platform.authsdk.authcommon.network;

import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;

public enum GrantType {
    CLIENTCREDENTIALS("client_credentials"),
    PASSWORD("password"),
    OTP(ConstantsKt.OTP);
    
    private final String value;

    private GrantType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
