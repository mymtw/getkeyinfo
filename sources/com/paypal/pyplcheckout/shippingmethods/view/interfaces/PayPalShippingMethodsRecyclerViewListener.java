package com.paypal.pyplcheckout.shippingmethods.view.interfaces;

import com.paypal.pyplcheckout.pojo.ShippingMethodType;

public interface PayPalShippingMethodsRecyclerViewListener {
    void onPayPalShippingMethodSelected(int i, ShippingMethodType shippingMethodType);
}
