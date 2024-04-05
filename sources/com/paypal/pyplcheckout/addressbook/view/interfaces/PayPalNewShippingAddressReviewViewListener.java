package com.paypal.pyplcheckout.addressbook.view.interfaces;

import com.paypal.pyplcheckout.pojo.ShippingMethodType;

public interface PayPalNewShippingAddressReviewViewListener {
    void onPayPalAddNewAddressReviewClick();

    void onPayPalAddressSelected(int i);

    void onPayPalPickUpSelected(int i, ShippingMethodType shippingMethodType);
}
