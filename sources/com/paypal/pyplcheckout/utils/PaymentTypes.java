package com.paypal.pyplcheckout.utils;

import com.paypal.pyplcheckout.home.view.customviews.CardUiModel;

public enum PaymentTypes {
    AMERICAN_EXPRESS("American Express"),
    AMEX("AMEX"),
    BALANCE_USD("BALANCEUSD"),
    ADD_CARD("Add_Card"),
    PAYPAL_CREDIT_OFFER("PPC"),
    GLOBAL_PAY_LATER("GPL"),
    PAYPAL_CREDIT("PAYPAL_CREDIT"),
    BALANCE("BALANCE"),
    CREDIT_CARD("CREDIT_CARD"),
    BANK_ACCOUNT(CardUiModel.PaymentSourceUiModel.BANK_ACCOUNT),
    PAYPAL_BALANCE("PayPal Balance"),
    CRYPTOCURRENCY(CardUiModel.PaymentSourceUiModel.CRYPTOCURRENCY);
    
    private String cardBrandName;

    private PaymentTypes(String str) {
        this.cardBrandName = str;
    }

    public boolean equals(String str, boolean z) {
        return z ? this.cardBrandName.equalsIgnoreCase(str) : this.cardBrandName.equals(str);
    }

    public String toString() {
        return this.cardBrandName;
    }
}
