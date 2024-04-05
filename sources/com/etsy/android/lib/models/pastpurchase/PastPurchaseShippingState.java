package com.etsy.android.lib.models.pastpurchase;

import com.etsy.android.R;

public enum PastPurchaseShippingState {
    UNKNOWN(R.string.unknown),
    NOT_SHIPPED(R.string.paid_status),
    SHIPPED(R.string.shipped),
    IN_TRANSIT(R.string.in_transit),
    OUT_FOR_DELIVERY(R.string.out_for_delivery),
    DELIVERED(R.string.delivered);
    
    private final int resId;

    private PastPurchaseShippingState(int i) {
        this.resId = i;
    }

    public final int getResId() {
        return this.resId;
    }
}
