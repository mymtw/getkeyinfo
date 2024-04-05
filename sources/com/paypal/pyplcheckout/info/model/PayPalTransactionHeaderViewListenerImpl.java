package com.paypal.pyplcheckout.info.model;

import com.paypal.pyplcheckout.interfaces.PayPalTransactionDetailsHeaderViewListener;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PayPalTransactionHeaderViewListenerImpl implements PayPalTransactionDetailsHeaderViewListener {
    private PayPalTransactionDetailsHeaderViewListener payPalTransactionDetailsHeaderViewListener;

    public PayPalTransactionHeaderViewListenerImpl() {
        this((PayPalTransactionDetailsHeaderViewListener) null, 1, (DefaultConstructorMarker) null);
    }

    public PayPalTransactionHeaderViewListenerImpl(PayPalTransactionDetailsHeaderViewListener payPalTransactionDetailsHeaderViewListener2) {
        this.payPalTransactionDetailsHeaderViewListener = payPalTransactionDetailsHeaderViewListener2;
    }

    public void onPayPalBackArrowClick() {
        PayPalTransactionDetailsHeaderViewListener payPalTransactionDetailsHeaderViewListener2 = this.payPalTransactionDetailsHeaderViewListener;
        if (payPalTransactionDetailsHeaderViewListener2 != null) {
            payPalTransactionDetailsHeaderViewListener2.onPayPalBackArrowClick();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalTransactionHeaderViewListenerImpl(PayPalTransactionDetailsHeaderViewListener payPalTransactionDetailsHeaderViewListener2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : payPalTransactionDetailsHeaderViewListener2);
    }
}
