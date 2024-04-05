package com.paypal.checkout.createorder;

import com.paypal.checkout.createorder.p536ba.BaTokenToEcTokenAction;
import com.paypal.pyplcheckout.services.Repository;
import dagger.internal.C17555d;
import kotlin.coroutines.CoroutineContext;
import p740eq.C19011a;

public final class CreateOrderActions_Factory implements C17555d<CreateOrderActions> {
    private final C19011a<BaTokenToEcTokenAction> baTokenToEcTokenActionProvider;
    private final C19011a<CoroutineContext> coroutineContextProvider;
    private final C19011a<CreateOrderAction> createOrderActionProvider;
    private final C19011a<Repository> repoProvider;

    public CreateOrderActions_Factory(C19011a<CoroutineContext> aVar, C19011a<CreateOrderAction> aVar2, C19011a<BaTokenToEcTokenAction> aVar3, C19011a<Repository> aVar4) {
        this.coroutineContextProvider = aVar;
        this.createOrderActionProvider = aVar2;
        this.baTokenToEcTokenActionProvider = aVar3;
        this.repoProvider = aVar4;
    }

    public static CreateOrderActions_Factory create(C19011a<CoroutineContext> aVar, C19011a<CreateOrderAction> aVar2, C19011a<BaTokenToEcTokenAction> aVar3, C19011a<Repository> aVar4) {
        return new CreateOrderActions_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static CreateOrderActions newInstance(CoroutineContext coroutineContext, CreateOrderAction createOrderAction, BaTokenToEcTokenAction baTokenToEcTokenAction, Repository repository) {
        return new CreateOrderActions(coroutineContext, createOrderAction, baTokenToEcTokenAction, repository);
    }

    public CreateOrderActions get() {
        return newInstance(this.coroutineContextProvider.get(), this.createOrderActionProvider.get(), this.baTokenToEcTokenActionProvider.get(), this.repoProvider.get());
    }
}
