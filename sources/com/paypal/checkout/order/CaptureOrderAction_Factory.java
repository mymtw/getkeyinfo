package com.paypal.checkout.order;

import dagger.internal.C17555d;
import kotlinx.coroutines.CoroutineDispatcher;
import p740eq.C19011a;

public final class CaptureOrderAction_Factory implements C17555d<CaptureOrderAction> {
    private final C19011a<CoroutineDispatcher> defaultDispatcherProvider;
    private final C19011a<UpdateOrderStatusAction> updateOrderStatusActionProvider;

    public CaptureOrderAction_Factory(C19011a<UpdateOrderStatusAction> aVar, C19011a<CoroutineDispatcher> aVar2) {
        this.updateOrderStatusActionProvider = aVar;
        this.defaultDispatcherProvider = aVar2;
    }

    public static CaptureOrderAction_Factory create(C19011a<UpdateOrderStatusAction> aVar, C19011a<CoroutineDispatcher> aVar2) {
        return new CaptureOrderAction_Factory(aVar, aVar2);
    }

    public static CaptureOrderAction newInstance(UpdateOrderStatusAction updateOrderStatusAction, CoroutineDispatcher coroutineDispatcher) {
        return new CaptureOrderAction(updateOrderStatusAction, coroutineDispatcher);
    }

    public CaptureOrderAction get() {
        return newInstance(this.updateOrderStatusActionProvider.get(), this.defaultDispatcherProvider.get());
    }
}
