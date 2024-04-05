package com.paypal.checkout.createorder.p536ba;

import com.google.gson.C16708i;
import dagger.internal.C17555d;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.C20009t;
import p740eq.C19011a;

/* renamed from: com.paypal.checkout.createorder.ba.BaTokenToEcTokenAction_Factory */
public final class BaTokenToEcTokenAction_Factory implements C17555d<BaTokenToEcTokenAction> {
    private final C19011a<BaTokenToEcTokenRequestFactory> baTokenToEcTokenRequestFactoryProvider;
    private final C19011a<C16708i> gsonProvider;
    private final C19011a<CoroutineDispatcher> ioDispatcherProvider;
    private final C19011a<C20009t> okHttpClientProvider;

    public BaTokenToEcTokenAction_Factory(C19011a<BaTokenToEcTokenRequestFactory> aVar, C19011a<C20009t> aVar2, C19011a<C16708i> aVar3, C19011a<CoroutineDispatcher> aVar4) {
        this.baTokenToEcTokenRequestFactoryProvider = aVar;
        this.okHttpClientProvider = aVar2;
        this.gsonProvider = aVar3;
        this.ioDispatcherProvider = aVar4;
    }

    public static BaTokenToEcTokenAction_Factory create(C19011a<BaTokenToEcTokenRequestFactory> aVar, C19011a<C20009t> aVar2, C19011a<C16708i> aVar3, C19011a<CoroutineDispatcher> aVar4) {
        return new BaTokenToEcTokenAction_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static BaTokenToEcTokenAction newInstance(BaTokenToEcTokenRequestFactory baTokenToEcTokenRequestFactory, C20009t tVar, C16708i iVar, CoroutineDispatcher coroutineDispatcher) {
        return new BaTokenToEcTokenAction(baTokenToEcTokenRequestFactory, tVar, iVar, coroutineDispatcher);
    }

    public BaTokenToEcTokenAction get() {
        return newInstance(this.baTokenToEcTokenRequestFactoryProvider.get(), this.okHttpClientProvider.get(), this.gsonProvider.get(), this.ioDispatcherProvider.get());
    }
}
