package com.paypal.pyplcheckout.home.view.interfaces;

import android.view.View;

public interface PayPalExpandedCartDetailsViewListener {
    void onCartDetailsArrowClick(View view, int i, int i2);

    void onEmptyCartDetailsReceived();

    void setUpInvoiceSummaryTotal(String str, boolean z);
}
