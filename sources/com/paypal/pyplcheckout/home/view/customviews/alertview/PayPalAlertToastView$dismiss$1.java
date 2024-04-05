package com.paypal.pyplcheckout.home.view.customviews.alertview;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class PayPalAlertToastView$dismiss$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ PayPalAlertToastView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalAlertToastView$dismiss$1(PayPalAlertToastView payPalAlertToastView) {
        super(0);
        this.this$0 = payPalAlertToastView;
    }

    public final void invoke() {
        this.this$0.consumeQueue();
    }
}
