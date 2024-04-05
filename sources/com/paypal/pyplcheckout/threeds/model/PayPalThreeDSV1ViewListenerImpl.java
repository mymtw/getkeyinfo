package com.paypal.pyplcheckout.threeds.model;

import com.paypal.pyplcheckout.threeds.view.interfaces.PayPalThreeDSV1HeaderViewListener;
import com.paypal.pyplcheckout.threeds.view.interfaces.PayPalThreeDSV1StepUpViewListener;
import com.paypal.pyplcheckout.threeds.view.interfaces.PayPalThreeDSV1ViewListener;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PayPalThreeDSV1ViewListenerImpl implements PayPalThreeDSV1ViewListener {
    private PayPalThreeDSV1HeaderViewListener payPalThreeDSV1HeaderViewListener;
    private PayPalThreeDSV1StepUpViewListener payPalThreeDSV1StepUpViewListener;

    public PayPalThreeDSV1ViewListenerImpl() {
        this((PayPalThreeDSV1HeaderViewListener) null, (PayPalThreeDSV1StepUpViewListener) null, 3, (DefaultConstructorMarker) null);
    }

    public PayPalThreeDSV1ViewListenerImpl(PayPalThreeDSV1HeaderViewListener payPalThreeDSV1HeaderViewListener2, PayPalThreeDSV1StepUpViewListener payPalThreeDSV1StepUpViewListener2) {
        this.payPalThreeDSV1HeaderViewListener = payPalThreeDSV1HeaderViewListener2;
        this.payPalThreeDSV1StepUpViewListener = payPalThreeDSV1StepUpViewListener2;
    }

    public void onPayPalBackArrowClick() {
        PayPalThreeDSV1HeaderViewListener payPalThreeDSV1HeaderViewListener2 = this.payPalThreeDSV1HeaderViewListener;
        if (payPalThreeDSV1HeaderViewListener2 != null) {
            payPalThreeDSV1HeaderViewListener2.onPayPalBackArrowClick();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalThreeDSV1ViewListenerImpl(PayPalThreeDSV1HeaderViewListener payPalThreeDSV1HeaderViewListener2, PayPalThreeDSV1StepUpViewListener payPalThreeDSV1StepUpViewListener2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : payPalThreeDSV1HeaderViewListener2, (i & 2) != 0 ? null : payPalThreeDSV1StepUpViewListener2);
    }
}
