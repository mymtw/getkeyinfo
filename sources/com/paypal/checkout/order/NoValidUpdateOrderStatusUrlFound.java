package com.paypal.checkout.order;

import kotlin.jvm.internal.C19383o;

public final class NoValidUpdateOrderStatusUrlFound extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoValidUpdateOrderStatusUrlFound(OrderContext orderContext) {
        super("Unable to create a valid UpdateOrderStatusRequest as no valid URL was found: " + orderContext);
        C19383o.m32797g(orderContext, "orderContext");
    }
}
