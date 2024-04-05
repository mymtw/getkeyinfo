package com.paypal.pyplcheckout.conversionrate.model;

import com.paypal.pyplcheckout.conversionrate.view.interfaces.ConversionRateViewListener;
import com.paypal.pyplcheckout.conversionrate.view.interfaces.PayPalConversionRateHeaderViewListener;
import com.paypal.pyplcheckout.conversionrate.view.interfaces.PayPalConversionRateInfoViewListener;
import com.paypal.pyplcheckout.utils.CurrencyConversionType;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ConversionRateViewListenerImpl implements ConversionRateViewListener {
    private PayPalConversionRateHeaderViewListener payPalConversionRateHeaderViewListener;
    private PayPalConversionRateInfoViewListener payPalConversionRateInfoViewListener;

    public ConversionRateViewListenerImpl() {
        this((PayPalConversionRateHeaderViewListener) null, (PayPalConversionRateInfoViewListener) null, 3, (DefaultConstructorMarker) null);
    }

    public ConversionRateViewListenerImpl(PayPalConversionRateHeaderViewListener payPalConversionRateHeaderViewListener2, PayPalConversionRateInfoViewListener payPalConversionRateInfoViewListener2) {
        this.payPalConversionRateHeaderViewListener = payPalConversionRateHeaderViewListener2;
        this.payPalConversionRateInfoViewListener = payPalConversionRateInfoViewListener2;
    }

    public void onPayPalBackArrowClick() {
        PayPalConversionRateHeaderViewListener payPalConversionRateHeaderViewListener2 = this.payPalConversionRateHeaderViewListener;
        if (payPalConversionRateHeaderViewListener2 != null) {
            payPalConversionRateHeaderViewListener2.onPayPalBackArrowClick();
        }
    }

    public void onPayPalConversionRateClicked(CurrencyConversionType currencyConversionType, boolean z) {
        PayPalConversionRateInfoViewListener payPalConversionRateInfoViewListener2 = this.payPalConversionRateInfoViewListener;
        if (payPalConversionRateInfoViewListener2 != null) {
            payPalConversionRateInfoViewListener2.onPayPalConversionRateClicked(currencyConversionType, z);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConversionRateViewListenerImpl(PayPalConversionRateHeaderViewListener payPalConversionRateHeaderViewListener2, PayPalConversionRateInfoViewListener payPalConversionRateInfoViewListener2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : payPalConversionRateHeaderViewListener2, (i & 2) != 0 ? null : payPalConversionRateInfoViewListener2);
    }
}
