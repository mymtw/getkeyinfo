package com.paypal.pyplcheckout.utils;

import kotlin.jvm.internal.C19383o;

public final class NetworkUtils {
    public static final NetworkUtils INSTANCE = new NetworkUtils();
    private static String connectionType = "";
    private static boolean isNetworkConnected = true;

    private NetworkUtils() {
    }

    public final String getConnectionType() {
        return connectionType;
    }

    public final boolean isNetworkConnected() {
        return isNetworkConnected;
    }

    public final void setConnectionType(String str) {
        C19383o.m32797g(str, "<set-?>");
        connectionType = str;
    }

    public final void setNetworkConnected(boolean z) {
        isNetworkConnected = z;
    }
}
