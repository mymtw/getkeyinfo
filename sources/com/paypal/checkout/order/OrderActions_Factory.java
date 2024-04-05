package com.paypal.checkout.order;

import com.paypal.checkout.order.actions.PatchAction;
import com.paypal.checkout.order.billingagreements.ExecuteBillingAgreementAction;
import dagger.internal.C17555d;
import kotlin.coroutines.CoroutineContext;
import p740eq.C19011a;

public final class OrderActions_Factory implements C17555d<OrderActions> {
    private final C19011a<AuthorizeOrderAction> authorizeOrderActionProvider;
    private final C19011a<CaptureOrderAction> captureOrderActionProvider;
    private final C19011a<CoroutineContext> coroutineContextProvider;
    private final C19011a<ExecuteBillingAgreementAction> executeBillingAgreementActionProvider;
    private final C19011a<GetOrderAction> getOrderActionProvider;
    private final C19011a<PatchAction> patchActionProvider;

    public OrderActions_Factory(C19011a<CaptureOrderAction> aVar, C19011a<AuthorizeOrderAction> aVar2, C19011a<PatchAction> aVar3, C19011a<ExecuteBillingAgreementAction> aVar4, C19011a<GetOrderAction> aVar5, C19011a<CoroutineContext> aVar6) {
        this.captureOrderActionProvider = aVar;
        this.authorizeOrderActionProvider = aVar2;
        this.patchActionProvider = aVar3;
        this.executeBillingAgreementActionProvider = aVar4;
        this.getOrderActionProvider = aVar5;
        this.coroutineContextProvider = aVar6;
    }

    public static OrderActions_Factory create(C19011a<CaptureOrderAction> aVar, C19011a<AuthorizeOrderAction> aVar2, C19011a<PatchAction> aVar3, C19011a<ExecuteBillingAgreementAction> aVar4, C19011a<GetOrderAction> aVar5, C19011a<CoroutineContext> aVar6) {
        return new OrderActions_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static OrderActions newInstance(CaptureOrderAction captureOrderAction, AuthorizeOrderAction authorizeOrderAction, PatchAction patchAction, ExecuteBillingAgreementAction executeBillingAgreementAction, GetOrderAction getOrderAction, CoroutineContext coroutineContext) {
        return new OrderActions(captureOrderAction, authorizeOrderAction, patchAction, executeBillingAgreementAction, getOrderAction, coroutineContext);
    }

    public OrderActions get() {
        return newInstance(this.captureOrderActionProvider.get(), this.authorizeOrderActionProvider.get(), this.patchActionProvider.get(), this.executeBillingAgreementActionProvider.get(), this.getOrderActionProvider.get(), this.coroutineContextProvider.get());
    }
}
