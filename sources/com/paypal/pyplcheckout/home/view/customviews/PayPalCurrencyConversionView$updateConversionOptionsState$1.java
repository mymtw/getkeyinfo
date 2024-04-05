package com.paypal.pyplcheckout.home.view.customviews;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class PayPalCurrencyConversionView$updateConversionOptionsState$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ PayPalCurrencyConversionView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalCurrencyConversionView$updateConversionOptionsState$1(PayPalCurrencyConversionView payPalCurrencyConversionView) {
        super(0);
        this.this$0 = payPalCurrencyConversionView;
    }

    public final void invoke() {
        this.this$0.conversionOptionsTv.setVisibility(0);
        C19394m unused = this.this$0.resetConversionOptionsTextViewHeight();
    }
}
