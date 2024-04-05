package com.paypal.checkout.approve;

import com.paypal.checkout.order.OrderActions;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class Approval_Factory implements C17555d<Approval> {
    private final C19011a<OrderActions> orderActionsProvider;

    public Approval_Factory(C19011a<OrderActions> aVar) {
        this.orderActionsProvider = aVar;
    }

    public static Approval_Factory create(C19011a<OrderActions> aVar) {
        return new Approval_Factory(aVar);
    }

    public static Approval newInstance(OrderActions orderActions) {
        return new Approval(orderActions);
    }

    public Approval get() {
        return newInstance(this.orderActionsProvider.get());
    }
}
