package com.etsy.android.p327ui.shop;

/* renamed from: com.etsy.android.ui.shop.ReviewsModelVariant */
public enum ReviewsModelVariant {
    CONTROL("Control");
    
    private final String value;

    private ReviewsModelVariant(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
