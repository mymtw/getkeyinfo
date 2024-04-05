package com.paypal.checkout;

import com.paypal.checkout.createorder.OrderCreateResult;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class PayPalCheckout$handleLaunchOrder$1 extends Lambda implements C19857l<OrderCreateResult, C19394m> {
    public final /* synthetic */ String $startFunction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalCheckout$handleLaunchOrder$1(String str) {
        super(1);
        this.$startFunction = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((OrderCreateResult) obj);
        return C19394m.f43287a;
    }

    public final void invoke(OrderCreateResult orderCreateResult) {
        if (orderCreateResult instanceof OrderCreateResult.Success) {
            SdkComponent.Companion.getInstance().getRepository().fetchCancelURL();
            PayPalCheckout.INSTANCE.startInitiateCheckoutActivity(this.$startFunction);
        } else if (orderCreateResult instanceof OrderCreateResult.Error) {
            PayPalCheckout.INSTANCE.onOrderApiFailed(((OrderCreateResult.Error) orderCreateResult).getException());
        }
    }
}
