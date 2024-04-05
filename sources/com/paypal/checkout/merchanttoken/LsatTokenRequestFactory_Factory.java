package com.paypal.checkout.merchanttoken;

import com.paypal.pyplcheckout.model.DebugConfigManager;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class LsatTokenRequestFactory_Factory implements C17555d<LsatTokenRequestFactory> {
    private final C19011a<DebugConfigManager> debugConfigManagerProvider;

    public LsatTokenRequestFactory_Factory(C19011a<DebugConfigManager> aVar) {
        this.debugConfigManagerProvider = aVar;
    }

    public static LsatTokenRequestFactory_Factory create(C19011a<DebugConfigManager> aVar) {
        return new LsatTokenRequestFactory_Factory(aVar);
    }

    public static LsatTokenRequestFactory newInstance(DebugConfigManager debugConfigManager) {
        return new LsatTokenRequestFactory(debugConfigManager);
    }

    public LsatTokenRequestFactory get() {
        return newInstance(this.debugConfigManagerProvider.get());
    }
}
