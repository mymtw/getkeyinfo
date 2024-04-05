package com.paypal.pyplcheckout.p543di;

import java.util.Locale;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.pyplcheckout.di.DeviceModule */
public final class DeviceModule {
    public final Locale providesDeviceLocale() {
        Locale locale = Locale.getDefault();
        C19383o.m32796f(locale, "getDefault()");
        return locale;
    }
}
