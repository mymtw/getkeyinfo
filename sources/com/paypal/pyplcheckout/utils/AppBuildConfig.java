package com.paypal.pyplcheckout.utils;

import com.paypal.pyplcheckout.BuildConfig;
import kotlin.text.C19459m;

public final class AppBuildConfig {
    public static final AppBuildConfig INSTANCE = new AppBuildConfig();

    private AppBuildConfig() {
    }

    public static final boolean isThreeDsVariant() {
        return C19459m.m33036e1(BuildConfig.FLAVOR_threeDsType, BuildConfig.FLAVOR_threeDsType, false);
    }

    public final boolean getDebug() {
        return false;
    }

    public final boolean getIsShippingCallbackEnabled() {
        return true;
    }
}
