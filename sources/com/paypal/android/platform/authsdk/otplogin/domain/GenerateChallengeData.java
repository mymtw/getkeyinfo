package com.paypal.android.platform.authsdk.otplogin.domain;

import kotlin.jvm.internal.C19383o;

public final class GenerateChallengeData {
    private final String nonce;

    public GenerateChallengeData(String str) {
        C19383o.m32797g(str, "nonce");
        this.nonce = str;
    }

    public final String getNonce() {
        return this.nonce;
    }
}
