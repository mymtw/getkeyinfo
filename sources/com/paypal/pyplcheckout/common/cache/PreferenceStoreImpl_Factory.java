package com.paypal.pyplcheckout.common.cache;

import android.content.Context;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class PreferenceStoreImpl_Factory implements C17555d<PreferenceStoreImpl> {
    private final C19011a<Context> contextProvider;

    public PreferenceStoreImpl_Factory(C19011a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static PreferenceStoreImpl_Factory create(C19011a<Context> aVar) {
        return new PreferenceStoreImpl_Factory(aVar);
    }

    public static PreferenceStoreImpl newInstance(Context context) {
        return new PreferenceStoreImpl(context);
    }

    public PreferenceStoreImpl get() {
        return newInstance(this.contextProvider.get());
    }
}
