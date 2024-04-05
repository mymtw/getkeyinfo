package com.paypal.checkout.paymentbutton;

import com.paypal.pyplcheckout.C17165R;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import p568fn.C17782b;
import p753kq.C19846a;

public final class PaymentButtonContainer$paymentButtons$2 extends Lambda implements C19846a<List<? extends PaymentButton<?>>> {
    public final /* synthetic */ PaymentButtonContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentButtonContainer$paymentButtons$2(PaymentButtonContainer paymentButtonContainer) {
        super(0);
        this.this$0 = paymentButtonContainer;
    }

    public final List<PaymentButton<?>> invoke() {
        return C17782b.m29865e0((PayPalButton) this.this$0._$_findCachedViewById(C17165R.C17167id.payPalButton), (PayPalCreditButton) this.this$0._$_findCachedViewById(C17165R.C17167id.payPalCreditButton), (PayLaterButton) this.this$0._$_findCachedViewById(C17165R.C17167id.payLaterButton));
    }
}
