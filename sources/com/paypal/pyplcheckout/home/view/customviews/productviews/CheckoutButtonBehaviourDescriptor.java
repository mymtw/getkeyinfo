package com.paypal.pyplcheckout.home.view.customviews.productviews;

import kotlin.jvm.internal.C19383o;

public final class CheckoutButtonBehaviourDescriptor {
    private final Type checkoutButtonBehaviour;

    public enum Type {
        PAY_NOW_BEHAVIOUR,
        ADD_CARD_BEHAVIOUR,
        OTHER
    }

    public CheckoutButtonBehaviourDescriptor(Type type) {
        C19383o.m32797g(type, "checkoutButtonBehaviour");
        this.checkoutButtonBehaviour = type;
    }

    public final Type getCheckoutButtonBehaviour() {
        return this.checkoutButtonBehaviour;
    }
}
