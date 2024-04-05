package com.paypal.checkout.shipping;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19861p;

public final class OnShippingChange$Companion$invoke$1 implements OnShippingChange {
    public final /* synthetic */ C19861p<ShippingChangeData, ShippingChangeActions, C19394m> $onShippingChanged;

    public OnShippingChange$Companion$invoke$1(C19861p<? super ShippingChangeData, ? super ShippingChangeActions, C19394m> pVar) {
        this.$onShippingChanged = pVar;
    }

    public void onShippingChanged(ShippingChangeData shippingChangeData, ShippingChangeActions shippingChangeActions) {
        C19383o.m32797g(shippingChangeData, "shippingChangeData");
        C19383o.m32797g(shippingChangeActions, "shippingChangeActions");
        this.$onShippingChanged.invoke(shippingChangeData, shippingChangeActions);
    }
}
