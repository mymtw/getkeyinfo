package com.paypal.pyplcheckout.flavorauth;

import android.content.Context;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class FoundationRiskConfig_Factory implements C17555d<FoundationRiskConfig> {
    private final C19011a<Context> contextProvider;

    public FoundationRiskConfig_Factory(C19011a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static FoundationRiskConfig_Factory create(C19011a<Context> aVar) {
        return new FoundationRiskConfig_Factory(aVar);
    }

    public static FoundationRiskConfig newInstance(Context context) {
        return new FoundationRiskConfig(context);
    }

    public FoundationRiskConfig get() {
        return newInstance(this.contextProvider.get());
    }
}
