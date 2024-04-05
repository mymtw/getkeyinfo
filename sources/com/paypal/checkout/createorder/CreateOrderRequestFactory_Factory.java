package com.paypal.checkout.createorder;

import com.google.gson.C16708i;
import dagger.internal.C17555d;
import okhttp3.C20011u;
import p740eq.C19011a;

public final class CreateOrderRequestFactory_Factory implements C17555d<CreateOrderRequestFactory> {
    private final C19011a<C16708i> gsonProvider;
    private final C19011a<C20011u.C20012a> requestBuilderProvider;

    public CreateOrderRequestFactory_Factory(C19011a<C20011u.C20012a> aVar, C19011a<C16708i> aVar2) {
        this.requestBuilderProvider = aVar;
        this.gsonProvider = aVar2;
    }

    public static CreateOrderRequestFactory_Factory create(C19011a<C20011u.C20012a> aVar, C19011a<C16708i> aVar2) {
        return new CreateOrderRequestFactory_Factory(aVar, aVar2);
    }

    public static CreateOrderRequestFactory newInstance(C20011u.C20012a aVar, C16708i iVar) {
        return new CreateOrderRequestFactory(aVar, iVar);
    }

    public CreateOrderRequestFactory get() {
        return newInstance(this.requestBuilderProvider.get(), this.gsonProvider.get());
    }
}
