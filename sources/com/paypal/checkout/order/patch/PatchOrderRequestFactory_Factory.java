package com.paypal.checkout.order.patch;

import com.google.gson.C16796j;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class PatchOrderRequestFactory_Factory implements C17555d<PatchOrderRequestFactory> {
    private final C19011a<C16796j> gsonBuilderProvider;

    public PatchOrderRequestFactory_Factory(C19011a<C16796j> aVar) {
        this.gsonBuilderProvider = aVar;
    }

    public static PatchOrderRequestFactory_Factory create(C19011a<C16796j> aVar) {
        return new PatchOrderRequestFactory_Factory(aVar);
    }

    public static PatchOrderRequestFactory newInstance(C16796j jVar) {
        return new PatchOrderRequestFactory(jVar);
    }

    public PatchOrderRequestFactory get() {
        return newInstance(this.gsonBuilderProvider.get());
    }
}
