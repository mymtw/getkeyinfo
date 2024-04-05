package com.paypal.android.platform.authsdk.authcommon.network.model;

import androidx.compose.animation.C0391c;

public class TokenData {
    private final int expirationInSeconds;
    private final String expires;
    private final String objectType;
    private final String tokenType;
    private final String tokenValue;

    public TokenData(String str, String str2, String str3, int i, String str4) {
        C0391c.m1060g(str, "tokenType", str2, "tokenValue", str3, "expires", str4, "objectType");
        this.tokenType = str;
        this.tokenValue = str2;
        this.expires = str3;
        this.expirationInSeconds = i;
        this.objectType = str4;
    }

    public int getExpirationInSeconds() {
        return this.expirationInSeconds;
    }

    public String getExpires() {
        return this.expires;
    }

    public String getObjectType() {
        return this.objectType;
    }

    public String getTokenType() {
        return this.tokenType;
    }

    public String getTokenValue() {
        return this.tokenValue;
    }
}
