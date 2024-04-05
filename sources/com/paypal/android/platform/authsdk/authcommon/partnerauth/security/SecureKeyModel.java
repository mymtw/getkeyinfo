package com.paypal.android.platform.authsdk.authcommon.partnerauth.security;

import kotlin.jvm.internal.C19383o;

public final class SecureKeyModel {
    private String keyStoreProvider;
    private String publicKey;

    public final String getKeyStoreProvider() {
        return this.keyStoreProvider;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public final void setKeyStoreProvider(String str) {
        C19383o.m32797g(str, "keyStoreProvider");
        this.keyStoreProvider = str;
    }

    public final void setPublicKey(String str) {
        C19383o.m32797g(str, "publicKey");
        this.publicKey = str;
    }
}
