package com.paypal.android.platform.authsdk.authcommon.model;

import kotlin.jvm.internal.C19383o;

public final class UserAccessToken extends Token {
    private final String authenticationTier;
    private final String authenticationType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserAccessToken(String str, String str2, String str3, int i, String str4, String str5) {
        super(str, str2, str3, i);
        C19383o.m32797g(str, "tokenType");
        C19383o.m32797g(str2, "tokenValue");
        C19383o.m32797g(str3, "expires");
        C19383o.m32797g(str4, "authenticationTier");
        C19383o.m32797g(str5, "authenticationType");
        this.authenticationTier = str4;
        this.authenticationType = str5;
    }

    public final String getAuthenticationTier() {
        return this.authenticationTier;
    }

    public final String getAuthenticationType() {
        return this.authenticationType;
    }
}
