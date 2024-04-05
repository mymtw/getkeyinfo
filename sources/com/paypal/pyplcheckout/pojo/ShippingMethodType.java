package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class ShippingMethodType {
    private final boolean isShipping;
    @C18417a("shippingMethodType")
    private final Type shippingMethodType;

    public enum Type {
        SHIPPING,
        PICKUP,
        SHIPPING_AND_PICKUP,
        NONE
    }

    public ShippingMethodType(Type type) {
        C19383o.m32797g(type, "shippingMethodType");
        this.shippingMethodType = type;
        this.isShipping = type == Type.SHIPPING;
    }

    public final Type getShippingMethodType() {
        return this.shippingMethodType;
    }

    public final boolean isShipping() {
        return this.isShipping;
    }
}
