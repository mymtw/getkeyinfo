package com.paypal.checkout.order;

import dagger.internal.C17555d;
import kotlinx.coroutines.CoroutineDispatcher;
import p740eq.C19011a;

public final class AuthorizeOrderAction_Factory implements C17555d<AuthorizeOrderAction> {
    private final C19011a<CoroutineDispatcher> defaultDispatcherProvider;
    private final C19011a<UpdateOrderStatusAction> updateOrderStatusActionProvider;

    public AuthorizeOrderAction_Factory(C19011a<UpdateOrderStatusAction> aVar, C19011a<CoroutineDispatcher> aVar2) {
        this.updateOrderStatusActionProvider = aVar;
        this.defaultDispatcherProvider = aVar2;
    }

    public static AuthorizeOrderAction_Factory create(C19011a<UpdateOrderStatusAction> aVar, C19011a<CoroutineDispatcher> aVar2) {
        return new AuthorizeOrderAction_Factory(aVar, aVar2);
    }

    public static AuthorizeOrderAction newInstance(UpdateOrderStatusAction updateOrderStatusAction, CoroutineDispatcher coroutineDispatcher) {
        return new AuthorizeOrderAction(updateOrderStatusAction, coroutineDispatcher);
    }

    public AuthorizeOrderAction get() {
        return newInstance(this.updateOrderStatusActionProvider.get(), this.defaultDispatcherProvider.get());
    }
}
