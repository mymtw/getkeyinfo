package com.paypal.pyplcheckout.utils;

import android.content.Context;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class AmplitudeUtils_Factory implements C17555d<AmplitudeUtils> {
    private final C19011a<Context> contextProvider;
    private final C19011a<Boolean> is1pProvider;
    private final C19011a<Boolean> isDebugProvider;

    public AmplitudeUtils_Factory(C19011a<Context> aVar, C19011a<Boolean> aVar2, C19011a<Boolean> aVar3) {
        this.contextProvider = aVar;
        this.is1pProvider = aVar2;
        this.isDebugProvider = aVar3;
    }

    public static AmplitudeUtils_Factory create(C19011a<Context> aVar, C19011a<Boolean> aVar2, C19011a<Boolean> aVar3) {
        return new AmplitudeUtils_Factory(aVar, aVar2, aVar3);
    }

    public static AmplitudeUtils newInstance(Context context, boolean z, boolean z2) {
        return new AmplitudeUtils(context, z, z2);
    }

    public AmplitudeUtils get() {
        return newInstance(this.contextProvider.get(), this.is1pProvider.get().booleanValue(), this.isDebugProvider.get().booleanValue());
    }
}
