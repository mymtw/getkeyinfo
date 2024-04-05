package com.paypal.checkout.order.patch;

import com.google.gson.C16708i;
import com.paypal.checkout.merchanttoken.UpgradeLsatTokenAction;
import dagger.internal.C17555d;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.C20009t;
import p740eq.C19011a;

public final class PatchOrderAction_Factory implements C17555d<PatchOrderAction> {
    private final C19011a<C16708i> gsonProvider;
    private final C19011a<CoroutineDispatcher> ioDispatcherProvider;
    private final C19011a<C20009t> okHttpClientProvider;
    private final C19011a<PatchOrderRequestFactory> patchOrderRequestFactoryProvider;
    private final C19011a<UpgradeLsatTokenAction> upgradeLsatTokenActionProvider;

    public PatchOrderAction_Factory(C19011a<PatchOrderRequestFactory> aVar, C19011a<UpgradeLsatTokenAction> aVar2, C19011a<C20009t> aVar3, C19011a<C16708i> aVar4, C19011a<CoroutineDispatcher> aVar5) {
        this.patchOrderRequestFactoryProvider = aVar;
        this.upgradeLsatTokenActionProvider = aVar2;
        this.okHttpClientProvider = aVar3;
        this.gsonProvider = aVar4;
        this.ioDispatcherProvider = aVar5;
    }

    public static PatchOrderAction_Factory create(C19011a<PatchOrderRequestFactory> aVar, C19011a<UpgradeLsatTokenAction> aVar2, C19011a<C20009t> aVar3, C19011a<C16708i> aVar4, C19011a<CoroutineDispatcher> aVar5) {
        return new PatchOrderAction_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static PatchOrderAction newInstance(PatchOrderRequestFactory patchOrderRequestFactory, UpgradeLsatTokenAction upgradeLsatTokenAction, C20009t tVar, C16708i iVar, CoroutineDispatcher coroutineDispatcher) {
        return new PatchOrderAction(patchOrderRequestFactory, upgradeLsatTokenAction, tVar, iVar, coroutineDispatcher);
    }

    public PatchOrderAction get() {
        return newInstance(this.patchOrderRequestFactoryProvider.get(), this.upgradeLsatTokenActionProvider.get(), this.okHttpClientProvider.get(), this.gsonProvider.get(), this.ioDispatcherProvider.get());
    }
}
