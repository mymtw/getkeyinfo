package com.paypal.pyplcheckout.crypto.model;

import com.paypal.pyplcheckout.crypto.view.interfaces.PayPalCryptoConsentListener;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CryptoConsentViewListenerImpl implements PayPalCryptoConsentListener {
    private PayPalCryptoConsentListener payPalCryptoConsentListener;

    public CryptoConsentViewListenerImpl() {
        this((PayPalCryptoConsentListener) null, 1, (DefaultConstructorMarker) null);
    }

    public CryptoConsentViewListenerImpl(PayPalCryptoConsentListener payPalCryptoConsentListener2) {
        this.payPalCryptoConsentListener = payPalCryptoConsentListener2;
    }

    public void onPayPalCryptoActionButtonClickListener() {
        PayPalCryptoConsentListener payPalCryptoConsentListener2 = this.payPalCryptoConsentListener;
        if (payPalCryptoConsentListener2 != null) {
            payPalCryptoConsentListener2.onPayPalCryptoActionButtonClickListener();
        }
    }

    public void onPayPalCryptoTermsAndConditionsClick() {
        PayPalCryptoConsentListener payPalCryptoConsentListener2 = this.payPalCryptoConsentListener;
        if (payPalCryptoConsentListener2 != null) {
            payPalCryptoConsentListener2.onPayPalCryptoTermsAndConditionsClick();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CryptoConsentViewListenerImpl(PayPalCryptoConsentListener payPalCryptoConsentListener2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : payPalCryptoConsentListener2);
    }
}
