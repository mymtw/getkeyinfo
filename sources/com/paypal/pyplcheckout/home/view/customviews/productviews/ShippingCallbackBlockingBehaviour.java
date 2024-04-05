package com.paypal.pyplcheckout.home.view.customviews.productviews;

import kotlin.jvm.internal.C19383o;

public final class ShippingCallbackBlockingBehaviour {
    private final Type shippingBlockingBehaviour;

    public enum Type {
        NEW_SHIPPING_ADDRESS_SELECTED,
        INVALID_SHIPPING_ADDRESS,
        REFRESH_IS_PENDING,
        REFRESH_IS_COMPLETED,
        INVALID_SHIPPING_METHOD
    }

    public ShippingCallbackBlockingBehaviour(Type type) {
        C19383o.m32797g(type, "shippingBlockingBehaviour");
        this.shippingBlockingBehaviour = type;
    }

    public final Type getShippingBlockingBehaviour() {
        return this.shippingBlockingBehaviour;
    }
}
