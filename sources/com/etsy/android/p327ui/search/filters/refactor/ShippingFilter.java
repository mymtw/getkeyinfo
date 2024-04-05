package com.etsy.android.p327ui.search.filters.refactor;

/* renamed from: com.etsy.android.ui.search.filters.refactor.ShippingFilter */
public enum ShippingFilter {
    ONE_DAY_SHIPPING(1),
    THREE_DAY_SHIPPING(3);
    
    private final int days;

    private ShippingFilter(int i) {
        this.days = i;
    }

    public final int getDays() {
        return this.days;
    }
}
