package com.paypal.pyplcheckout.utils;

import p010a9.C0048b;

public final class PayPalConstants {
    private static final String CRYPTO_POLICY_URL = "https://www.paypal.com/us/webapps/mpp/ua/cryptocurrencies-tnc";
    private static final String CRYPTO_RATES_FEES_URL = "https://www.paypal.com/us/webapps/mpp/paypal-fees";
    public static final PayPalConstants INSTANCE = new PayPalConstants();
    private static final String POLICY_URL = "https://www.paypal.com/webapps/mpp/popup/about-payment-methods";
    private static final String PRIVACY_URL = "https://www.paypal.com/webapps/mpp/ua/privacy-full";
    private static final String TERMS_URL = "https://www.paypal.com/webapps/mpp/ua/legalhub-full";
    private static final String USER_AGREEMENT_URL = "https://www.paypal.com/webapps/mpp/ua/useragreement-full";

    private PayPalConstants() {
    }

    public static final String getCryptoPolicyUrl(String str, String str2) {
        return C0048b.m164c(CRYPTO_POLICY_URL, "?country.x=", str2, "&locale.x=", str);
    }

    public static final String getCryptoRatesAndFeesUrl(String str, String str2) {
        return C0048b.m164c(CRYPTO_RATES_FEES_URL, "?country.x=", str2, "&locale.x=", str);
    }

    public static final String getPolicyUrl(String str, String str2) {
        return C0048b.m164c(POLICY_URL, "?country.x=", str2, "&locale.x=", str);
    }

    public static final String getPrivacyUrl(String str, String str2) {
        return C0048b.m164c(PRIVACY_URL, "?country.x=", str2, "&locale.x=", str);
    }

    public static final String getTermsUrl(String str, String str2) {
        return C0048b.m164c(TERMS_URL, "?country.x=", str2, "&locale.x=", str);
    }

    public static final String getUserAgreementUrl(String str, String str2) {
        return C0048b.m164c(USER_AGREEMENT_URL, "?country.x=", str2, "&locale.x=", str);
    }
}
