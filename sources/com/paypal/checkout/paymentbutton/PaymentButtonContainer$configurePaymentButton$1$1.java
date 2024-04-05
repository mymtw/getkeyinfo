package com.paypal.checkout.paymentbutton;

import android.util.Log;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class PaymentButtonContainer$configurePaymentButton$1$1 extends Lambda implements C19857l<PaymentButtonEligibilityStatus, C19394m> {
    public final /* synthetic */ PaymentButton<?> $paymentButton;
    public final /* synthetic */ PaymentButtonContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentButtonContainer$configurePaymentButton$1$1(PaymentButton<?> paymentButton, PaymentButtonContainer paymentButtonContainer) {
        super(1);
        this.$paymentButton = paymentButton;
        this.this$0 = paymentButtonContainer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PaymentButtonEligibilityStatus) obj);
        return C19394m.f43287a;
    }

    public final void invoke(PaymentButtonEligibilityStatus paymentButtonEligibilityStatus) {
        C19383o.m32797g(paymentButtonEligibilityStatus, "buttonEligibilityStatus");
        String str = PaymentButtonContainer.TAG;
        PaymentButton<?> paymentButton = this.$paymentButton;
        Log.d(str, paymentButton + " : " + paymentButtonEligibilityStatus);
        PaymentButtonContainer paymentButtonContainer = this.this$0;
        PaymentButton<?> paymentButton2 = this.$paymentButton;
        C19383o.m32796f(paymentButton2, "paymentButton");
        paymentButtonContainer.updatePaymentButtonContainer(paymentButton2);
    }
}
