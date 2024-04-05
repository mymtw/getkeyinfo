package com.etsy.android.lib.requests.apiv3;

import com.etsy.android.lib.network.C8731g;
import dagger.internal.C17555d;
import p568fn.C17782b;
import p740eq.C19011a;

public final class ShippingDetailsModule_ProvidesShippingDetailsEndpointFactory implements C17555d<ShippingDetailsEndpoint> {
    private final C19011a<C8731g> configuredRetrofitProvider;
    private final ShippingDetailsModule module;

    public ShippingDetailsModule_ProvidesShippingDetailsEndpointFactory(ShippingDetailsModule shippingDetailsModule, C19011a<C8731g> aVar) {
        this.module = shippingDetailsModule;
        this.configuredRetrofitProvider = aVar;
    }

    public static ShippingDetailsModule_ProvidesShippingDetailsEndpointFactory create(ShippingDetailsModule shippingDetailsModule, C19011a<C8731g> aVar) {
        return new ShippingDetailsModule_ProvidesShippingDetailsEndpointFactory(shippingDetailsModule, aVar);
    }

    public static ShippingDetailsEndpoint providesShippingDetailsEndpoint(ShippingDetailsModule shippingDetailsModule, C8731g gVar) {
        ShippingDetailsEndpoint providesShippingDetailsEndpoint = shippingDetailsModule.providesShippingDetailsEndpoint(gVar);
        C17782b.m29841G(providesShippingDetailsEndpoint);
        return providesShippingDetailsEndpoint;
    }

    public ShippingDetailsEndpoint get() {
        return providesShippingDetailsEndpoint(this.module, this.configuredRetrofitProvider.get());
    }
}
