package com.paypal.pyplcheckout.common.instrumentation.amplitude.dao;

import android.content.Context;
import com.google.gson.C16708i;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class SharedPrefAmplitudeDao_Factory implements C17555d<SharedPrefAmplitudeDao> {
    private final C19011a<Context> contextProvider;
    private final C19011a<C16708i> gsonProvider;

    public SharedPrefAmplitudeDao_Factory(C19011a<Context> aVar, C19011a<C16708i> aVar2) {
        this.contextProvider = aVar;
        this.gsonProvider = aVar2;
    }

    public static SharedPrefAmplitudeDao_Factory create(C19011a<Context> aVar, C19011a<C16708i> aVar2) {
        return new SharedPrefAmplitudeDao_Factory(aVar, aVar2);
    }

    public static SharedPrefAmplitudeDao newInstance(Context context, C16708i iVar) {
        return new SharedPrefAmplitudeDao(context, iVar);
    }

    public SharedPrefAmplitudeDao get() {
        return newInstance(this.contextProvider.get(), this.gsonProvider.get());
    }
}
