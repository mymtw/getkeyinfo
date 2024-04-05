package com.paypal.checkout.order;

import com.paypal.pyplcheckout.model.DebugConfigManager;
import dagger.internal.C17555d;
import okhttp3.C20011u;
import p740eq.C19011a;

public final class GetOrderRequestFactory_Factory implements C17555d<GetOrderRequestFactory> {
    private final C19011a<DebugConfigManager> configManagerProvider;
    private final C19011a<C20011u.C20012a> requestBuilderProvider;

    public GetOrderRequestFactory_Factory(C19011a<DebugConfigManager> aVar, C19011a<C20011u.C20012a> aVar2) {
        this.configManagerProvider = aVar;
        this.requestBuilderProvider = aVar2;
    }

    public static GetOrderRequestFactory_Factory create(C19011a<DebugConfigManager> aVar, C19011a<C20011u.C20012a> aVar2) {
        return new GetOrderRequestFactory_Factory(aVar, aVar2);
    }

    public static GetOrderRequestFactory newInstance(DebugConfigManager debugConfigManager, C20011u.C20012a aVar) {
        return new GetOrderRequestFactory(debugConfigManager, aVar);
    }

    public GetOrderRequestFactory get() {
        return newInstance(this.configManagerProvider.get(), this.requestBuilderProvider.get());
    }
}
