package com.paypal.checkout.shipping;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19861p;

public interface OnShippingChange {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final OnShippingChange invoke(C19861p<? super ShippingChangeData, ? super ShippingChangeActions, C19394m> pVar) {
            C19383o.m32797g(pVar, "onShippingChanged");
            return new OnShippingChange$Companion$invoke$1(pVar);
        }
    }

    void onShippingChanged(ShippingChangeData shippingChangeData, ShippingChangeActions shippingChangeActions);
}
