package com.paypal.pyplcheckout.p539ab.featureflag;

import android.content.Context;
import dagger.internal.C17555d;
import p740eq.C19011a;

/* renamed from: com.paypal.pyplcheckout.ab.featureflag.DeveloperSettingsFFCache_Factory */
public final class DeveloperSettingsFFCache_Factory implements C17555d<DeveloperSettingsFFCache> {
    private final C19011a<Context> contextProvider;

    public DeveloperSettingsFFCache_Factory(C19011a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static DeveloperSettingsFFCache_Factory create(C19011a<Context> aVar) {
        return new DeveloperSettingsFFCache_Factory(aVar);
    }

    public static DeveloperSettingsFFCache newInstance(Context context) {
        return new DeveloperSettingsFFCache(context);
    }

    public DeveloperSettingsFFCache get() {
        return newInstance(this.contextProvider.get());
    }
}
