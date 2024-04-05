package com.paypal.android.platform.authsdk.authcommon;

import kotlin.jvm.internal.C19383o;

public final class GRCWebViewLoaderKt {
    private static final String TAG = "GRCWebViewLoader";

    public static final String toAdsChallengeID(String str) {
        C19383o.m32797g(str, "<this>");
        return "auth-" + str;
    }
}
