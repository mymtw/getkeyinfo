package com.paypal.pyplcheckout.utils;

import com.paypal.pyplcheckout.BuildConfig;

public final class VersionUtils {
    public static final VersionUtils INSTANCE = new VersionUtils();
    private static final String sdkVersion = BuildConfig.THIRD_PARTY_VERSION;

    private VersionUtils() {
    }

    public final String getSdkVersion() {
        return sdkVersion;
    }
}
