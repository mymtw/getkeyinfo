package com.paypal.checkout.createorder;

import com.google.gson.C16708i;
import com.paypal.checkout.merchanttoken.CreateLsatTokenAction;
import com.paypal.pyplcheckout.services.Repository;
import dagger.internal.C17555d;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.C20009t;
import p740eq.C19011a;

public final class CreateOrderAction_Factory implements C17555d<CreateOrderAction> {
    private final C19011a<CreateLsatTokenAction> createLsatTokenActionProvider;
    private final C19011a<CreateOrderRequestFactory> createOrderRequestFactoryProvider;
    private final C19011a<C16708i> gsonProvider;
    private final C19011a<CoroutineDispatcher> ioDispatcherProvider;
    private final C19011a<C20009t> okHttpClientProvider;
    private final C19011a<Repository> repositoryProvider;

    public CreateOrderAction_Factory(C19011a<CreateOrderRequestFactory> aVar, C19011a<C20009t> aVar2, C19011a<C16708i> aVar3, C19011a<CreateLsatTokenAction> aVar4, C19011a<Repository> aVar5, C19011a<CoroutineDispatcher> aVar6) {
        this.createOrderRequestFactoryProvider = aVar;
        this.okHttpClientProvider = aVar2;
        this.gsonProvider = aVar3;
        this.createLsatTokenActionProvider = aVar4;
        this.repositoryProvider = aVar5;
        this.ioDispatcherProvider = aVar6;
    }

    public static CreateOrderAction_Factory create(C19011a<CreateOrderRequestFactory> aVar, C19011a<C20009t> aVar2, C19011a<C16708i> aVar3, C19011a<CreateLsatTokenAction> aVar4, C19011a<Repository> aVar5, C19011a<CoroutineDispatcher> aVar6) {
        return new CreateOrderAction_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static CreateOrderAction newInstance(CreateOrderRequestFactory createOrderRequestFactory, C20009t tVar, C16708i iVar, CreateLsatTokenAction createLsatTokenAction, Repository repository, CoroutineDispatcher coroutineDispatcher) {
        return new CreateOrderAction(createOrderRequestFactory, tVar, iVar, createLsatTokenAction, repository, coroutineDispatcher);
    }

    public CreateOrderAction get() {
        return newInstance(this.createOrderRequestFactoryProvider.get(), this.okHttpClientProvider.get(), this.gsonProvider.get(), this.createLsatTokenActionProvider.get(), this.repositoryProvider.get(), this.ioDispatcherProvider.get());
    }
}
