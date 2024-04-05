package com.paypal.checkout.order;

import com.google.gson.C16708i;
import com.paypal.checkout.merchanttoken.GetLsatTokenAction;
import com.paypal.checkout.merchanttoken.UpgradeLsatTokenAction;
import dagger.internal.C17555d;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.C20009t;
import p740eq.C19011a;

public final class GetOrderAction_Factory implements C17555d<GetOrderAction> {
    private final C19011a<CoroutineDispatcher> defaultDispatcherProvider;
    private final C19011a<GetLsatTokenAction> getLsatTokenActionProvider;
    private final C19011a<GetOrderRequestFactory> getOrderRequestFactoryProvider;
    private final C19011a<C16708i> gsonProvider;
    private final C19011a<C20009t> okHttpClientProvider;
    private final C19011a<UpgradeLsatTokenAction> upgradeLsatTokenActionProvider;

    public GetOrderAction_Factory(C19011a<CoroutineDispatcher> aVar, C19011a<GetLsatTokenAction> aVar2, C19011a<UpgradeLsatTokenAction> aVar3, C19011a<GetOrderRequestFactory> aVar4, C19011a<C20009t> aVar5, C19011a<C16708i> aVar6) {
        this.defaultDispatcherProvider = aVar;
        this.getLsatTokenActionProvider = aVar2;
        this.upgradeLsatTokenActionProvider = aVar3;
        this.getOrderRequestFactoryProvider = aVar4;
        this.okHttpClientProvider = aVar5;
        this.gsonProvider = aVar6;
    }

    public static GetOrderAction_Factory create(C19011a<CoroutineDispatcher> aVar, C19011a<GetLsatTokenAction> aVar2, C19011a<UpgradeLsatTokenAction> aVar3, C19011a<GetOrderRequestFactory> aVar4, C19011a<C20009t> aVar5, C19011a<C16708i> aVar6) {
        return new GetOrderAction_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static GetOrderAction newInstance(CoroutineDispatcher coroutineDispatcher, GetLsatTokenAction getLsatTokenAction, UpgradeLsatTokenAction upgradeLsatTokenAction, GetOrderRequestFactory getOrderRequestFactory, C20009t tVar, C16708i iVar) {
        return new GetOrderAction(coroutineDispatcher, getLsatTokenAction, upgradeLsatTokenAction, getOrderRequestFactory, tVar, iVar);
    }

    public GetOrderAction get() {
        return newInstance(this.defaultDispatcherProvider.get(), this.getLsatTokenActionProvider.get(), this.upgradeLsatTokenActionProvider.get(), this.getOrderRequestFactoryProvider.get(), this.okHttpClientProvider.get(), this.gsonProvider.get());
    }
}
