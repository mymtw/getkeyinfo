package com.paypal.checkout.createorder.p536ba;

import com.paypal.pyplcheckout.model.DebugConfigManager;
import dagger.internal.C17555d;
import okhttp3.C20011u;
import p740eq.C19011a;

/* renamed from: com.paypal.checkout.createorder.ba.BaTokenToEcTokenRequestFactory_Factory */
public final class BaTokenToEcTokenRequestFactory_Factory implements C17555d<BaTokenToEcTokenRequestFactory> {
    private final C19011a<DebugConfigManager> debugConfigManagerProvider;
    private final C19011a<C20011u.C20012a> requestBuilderProvider;

    public BaTokenToEcTokenRequestFactory_Factory(C19011a<DebugConfigManager> aVar, C19011a<C20011u.C20012a> aVar2) {
        this.debugConfigManagerProvider = aVar;
        this.requestBuilderProvider = aVar2;
    }

    public static BaTokenToEcTokenRequestFactory_Factory create(C19011a<DebugConfigManager> aVar, C19011a<C20011u.C20012a> aVar2) {
        return new BaTokenToEcTokenRequestFactory_Factory(aVar, aVar2);
    }

    public static BaTokenToEcTokenRequestFactory newInstance(DebugConfigManager debugConfigManager, C20011u.C20012a aVar) {
        return new BaTokenToEcTokenRequestFactory(debugConfigManager, aVar);
    }

    public BaTokenToEcTokenRequestFactory get() {
        return newInstance(this.debugConfigManagerProvider.get(), this.requestBuilderProvider.get());
    }
}
