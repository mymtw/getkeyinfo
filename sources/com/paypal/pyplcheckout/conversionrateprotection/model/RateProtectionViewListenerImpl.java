package com.paypal.pyplcheckout.conversionrateprotection.model;

import com.paypal.pyplcheckout.conversionrateprotection.view.interfaces.PayPalRateProtectionHeaderViewListener;
import com.paypal.pyplcheckout.conversionrateprotection.view.interfaces.PayPalRateProtectionInfoViewListener;
import com.paypal.pyplcheckout.conversionrateprotection.view.interfaces.RateProtectionViewListener;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class RateProtectionViewListenerImpl implements RateProtectionViewListener {
    private PayPalRateProtectionHeaderViewListener payPalRateProtectionHeaderViewListener;
    private PayPalRateProtectionInfoViewListener payPalRateProtectionInfoViewListener;

    public RateProtectionViewListenerImpl() {
        this((PayPalRateProtectionHeaderViewListener) null, (PayPalRateProtectionInfoViewListener) null, 3, (DefaultConstructorMarker) null);
    }

    public RateProtectionViewListenerImpl(PayPalRateProtectionHeaderViewListener payPalRateProtectionHeaderViewListener2, PayPalRateProtectionInfoViewListener payPalRateProtectionInfoViewListener2) {
        this.payPalRateProtectionHeaderViewListener = payPalRateProtectionHeaderViewListener2;
        this.payPalRateProtectionInfoViewListener = payPalRateProtectionInfoViewListener2;
    }

    public void onOKClicked() {
        PayPalRateProtectionInfoViewListener payPalRateProtectionInfoViewListener2 = this.payPalRateProtectionInfoViewListener;
        if (payPalRateProtectionInfoViewListener2 != null) {
            payPalRateProtectionInfoViewListener2.onOKClicked();
        }
    }

    public void onPayPalBackArrowClick() {
        PayPalRateProtectionHeaderViewListener payPalRateProtectionHeaderViewListener2 = this.payPalRateProtectionHeaderViewListener;
        if (payPalRateProtectionHeaderViewListener2 != null) {
            payPalRateProtectionHeaderViewListener2.onPayPalBackArrowClick();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RateProtectionViewListenerImpl(PayPalRateProtectionHeaderViewListener payPalRateProtectionHeaderViewListener2, PayPalRateProtectionInfoViewListener payPalRateProtectionInfoViewListener2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : payPalRateProtectionHeaderViewListener2, (i & 2) != 0 ? null : payPalRateProtectionInfoViewListener2);
    }
}
