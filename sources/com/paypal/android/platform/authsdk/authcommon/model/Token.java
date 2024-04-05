package com.paypal.android.platform.authsdk.authcommon.model;

import p010a9.C0048b;

public class Token {
    private final int expirationInSeconds;
    private final String expires;
    private final String tokenType;
    private final String tokenValue;

    public Token(String str, String str2, String str3, int i) {
        C0048b.m167f(str, "tokenType", str2, "tokenValue", str3, "expires");
        this.tokenType = str;
        this.tokenValue = str2;
        this.expires = str3;
        this.expirationInSeconds = i;
    }

    public int getExpirationInSeconds() {
        return this.expirationInSeconds;
    }

    public String getExpires() {
        return this.expires;
    }

    public String getTokenType() {
        return this.tokenType;
    }

    public String getTokenValue() {
        return this.tokenValue;
    }
}
