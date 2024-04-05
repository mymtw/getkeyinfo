package com.paypal.pyplcheckout.utils;

import com.paypal.pyplcheckout.home.view.customviews.CardUiModel;

public enum CurrencyConversionType {
    VENDOR("VENDOR"),
    PAYPAL(CardUiModel.PaymentSourceUiModel.PAYPAL);
    
    private String currencyConversionType;

    private CurrencyConversionType(String str) {
        this.currencyConversionType = str;
    }

    public String toString() {
        return this.currencyConversionType;
    }
}
