package com.paypal.pyplcheckout.services.mutations;

public final class SetCurrencyConversionTypeMutation {
    public static final SetCurrencyConversionTypeMutation INSTANCE = new SetCurrencyConversionTypeMutation();

    private SetCurrencyConversionTypeMutation() {
    }

    public final String get() {
        return "mutation UPDATE_CURRENCY_CONVERSION( \n    $token: String! \n    $conversionType: CheckoutCurrencyConversionType!\n) {\n    updateCurrencyConversionType(\n        token: $token, \n        conversionType: $conversionType\n) {\n    fundingOptions {\n        fundingOptionId   \n        name  \n        type \n        lastDigits \n        isPreferred \n        amount {currencyCode} \n        currencyConversion { \n            type \n            rateisReadOnly \n            issuedDate {dateTimeShort} \n            convertedCartTotal {currencyFormatSymbolISOCurrency}\n            from {currencyFormatSymbolISOCurrency} \n            to {currencyFormatSymbolISOCurrency} \n        }\n        plans { \n            soloPlan { \n                planId\n                backupFundingOption {\n                    name \n                    lastDigits \n                }\n            }\n            splitPlans { \n                planId \n                secondaryFundingOption { \n                    amount { \n                        currencyCode \n                        currencyFormat \n                    }\n                }\n            } \n        }\n    }\n}";
    }
}
