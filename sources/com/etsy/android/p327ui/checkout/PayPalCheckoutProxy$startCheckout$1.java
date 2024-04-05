package com.etsy.android.p327ui.checkout;

import com.paypal.checkout.createorder.CreateOrderActions;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.checkout.PayPalCheckoutProxy$startCheckout$1 */
final class PayPalCheckoutProxy$startCheckout$1 extends Lambda implements C19857l<CreateOrderActions, C19394m> {
    public final /* synthetic */ String $orderId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalCheckoutProxy$startCheckout$1(String str) {
        super(1);
        this.$orderId = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CreateOrderActions) obj);
        return C19394m.f43287a;
    }

    public final void invoke(CreateOrderActions createOrderActions) {
        C19383o.m32797g(createOrderActions, "createOrderActions");
        createOrderActions.set(this.$orderId);
    }
}
