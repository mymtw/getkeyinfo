package com.paypal.pyplcheckout.p543di;

import dagger.internal.C17555d;
import java.util.Locale;
import p568fn.C17782b;

/* renamed from: com.paypal.pyplcheckout.di.DeviceModule_ProvidesDeviceLocaleFactory */
public final class DeviceModule_ProvidesDeviceLocaleFactory implements C17555d<Locale> {
    private final DeviceModule module;

    public DeviceModule_ProvidesDeviceLocaleFactory(DeviceModule deviceModule) {
        this.module = deviceModule;
    }

    public static DeviceModule_ProvidesDeviceLocaleFactory create(DeviceModule deviceModule) {
        return new DeviceModule_ProvidesDeviceLocaleFactory(deviceModule);
    }

    public static Locale providesDeviceLocale(DeviceModule deviceModule) {
        Locale providesDeviceLocale = deviceModule.providesDeviceLocale();
        C17782b.m29841G(providesDeviceLocale);
        return providesDeviceLocale;
    }

    public Locale get() {
        return providesDeviceLocale(this.module);
    }
}
