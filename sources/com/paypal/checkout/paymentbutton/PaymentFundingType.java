package com.paypal.checkout.paymentbutton;

import com.paypal.pyplcheckout.home.view.customviews.CardUiModel;

public enum PaymentFundingType {
    PAYPAL(CardUiModel.PaymentSourceUiModel.PAYPAL),
    PAYPAL_CREDIT("PAYPAL_CREDIT"),
    PAY_LATER("PAY_LATER");
    
    private final String fundingType;

    private PaymentFundingType(String str) {
        this.fundingType = str;
    }

    public final String getFundingType() {
        return this.fundingType;
    }
}
