package com.etsy.android.p327ui.listing.p329ui.buyitnow;

import com.etsy.android.R;

/* renamed from: com.etsy.android.ui.listing.ui.buyitnow.CardType */
public enum CardType {
    VISA(R.drawable.clg_payment_card_visa),
    MASTERCARD(R.drawable.clg_payment_card_mastercard),
    AMEX(R.drawable.clg_payment_card_amex),
    DISCOVER(R.drawable.clg_payment_card_discover),
    GENERIC(R.drawable.clg_icon_core_creditcard_v1);
    
    private final int iconResId;

    private CardType(int i) {
        this.iconResId = i;
    }

    public final int getIconResId() {
        return this.iconResId;
    }
}
