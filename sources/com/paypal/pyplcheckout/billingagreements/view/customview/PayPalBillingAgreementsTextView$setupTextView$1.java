package com.paypal.pyplcheckout.billingagreements.view.customview;

import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class PayPalBillingAgreementsTextView$setupTextView$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ PayPalBillingAgreementsTextView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalBillingAgreementsTextView$setupTextView$1(PayPalBillingAgreementsTextView payPalBillingAgreementsTextView) {
        super(0);
        this.this$0 = payPalBillingAgreementsTextView;
    }

    public final void invoke() {
        PLog.click$default(PEnums.TransitionName.BA_AUTHORIZATION_INFO_CLICKED, PEnums.Outcome.CLICKED, PEnums.EventCode.E101, PEnums.StateName.REVIEW, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 496, (Object) null);
        this.this$0.getViewModel().openTermsFragment();
    }
}
