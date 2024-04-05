package com.paypal.pyplcheckout.home.view.customviews;

import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class PayPalContinueButton$initEvents$2$onEvent$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ PayPalContinueButton this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalContinueButton$initEvents$2$onEvent$1(PayPalContinueButton payPalContinueButton) {
        super(0);
        this.this$0 = payPalContinueButton;
    }

    public final void invoke() {
        this.this$0.showOfferDialog(C17165R.string.paypal_checkout_paypal_credit_apply, C17165R.string.paypal_checkout_apply_for_paypal_credit, PEnums.TransitionName.PAYPAL_CREDIT_DIALOG, PYPLCheckoutUtils.FallbackScenario.PAYPAL_CREDIT);
    }
}
