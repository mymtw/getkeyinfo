package com.etsy.android.p327ui.cart;

/* renamed from: com.etsy.android.ui.cart.OnCartPageChangedListener */
public interface OnCartPageChangedListener {

    /* renamed from: com.etsy.android.ui.cart.OnCartPageChangedListener$Page */
    public enum Page {
        CART,
        SAVED
    }

    void onCartPageChanged(Page page);
}
