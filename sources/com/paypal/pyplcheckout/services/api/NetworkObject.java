package com.paypal.pyplcheckout.services.api;

import kotlin.C19285c;
import kotlin.C19350d;
import okhttp3.C20009t;

public final class NetworkObject {
    public static final NetworkObject INSTANCE = new NetworkObject();
    private static final C19285c okHttpClient$delegate = C19350d.m32677b(NetworkObject$okHttpClient$2.INSTANCE);

    private NetworkObject() {
    }

    public final C20009t getOkHttpClient() {
        return (C20009t) okHttpClient$delegate.getValue();
    }
}
