package com.paypal.pyplcheckout.p539ab.featureflag;

/* renamed from: com.paypal.pyplcheckout.ab.featureflag.Feature */
public enum Feature {
    ADD_SHIPPING("ADD_SHIPPING"),
    ADD_CARD("ADD_CARD"),
    SHIPPING_CALLBACK("SHIPPING_CALLBACK"),
    AMPLITUDE_REST_API("AMPLITUDE_REST_API"),
    NATIVE_BA("NATIVE_BILLING_AGREEMENTS"),
    CRYPTO_PAYMENTS("CRYPTO_PAYMENTS"),
    THIRD_PARTY_3DS("THIRD_PARTY_3DS"),
    ADD_CARD_3DS("ADD_CARD_3DS"),
    ADDRESS_SUGGESTION("ADDRESS_SUGGESTION");
    
    private final String feature;

    private Feature(String str) {
        this.feature = str;
    }

    public final String getFeature() {
        return this.feature;
    }
}
