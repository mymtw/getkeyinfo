package com.paypal.pyplcheckout.interfaces;

import com.paypal.pyplcheckout.exception.CheckoutCancelReason;
import java.util.HashMap;

public interface PayPalCheckoutCompleteListener {
    void onCheckoutCancelled(CheckoutCancelReason checkoutCancelReason, String str);

    void onCheckoutComplete(HashMap<String, String> hashMap);
}
