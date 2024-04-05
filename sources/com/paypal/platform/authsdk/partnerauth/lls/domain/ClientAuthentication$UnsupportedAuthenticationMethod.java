package com.paypal.platform.authsdk.partnerauth.lls.domain;

import kotlin.jvm.internal.C19383o;

public final class ClientAuthentication$UnsupportedAuthenticationMethod extends Exception {
    private final String unsupportedAuthenticationMethod;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClientAuthentication$UnsupportedAuthenticationMethod(String str) {
        super("Unsupported client authentication method: " + str);
        C19383o.m32797g(str, "unsupportedAuthenticationMethod");
        this.unsupportedAuthenticationMethod = str;
    }

    public final String getUnsupportedAuthenticationMethod() {
        return this.unsupportedAuthenticationMethod;
    }
}
