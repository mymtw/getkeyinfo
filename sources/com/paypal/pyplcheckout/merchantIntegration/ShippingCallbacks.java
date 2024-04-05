package com.paypal.pyplcheckout.merchantIntegration;

import com.paypal.pyplcheckout.interfaces.ShippingCallbackListener;
import com.paypal.pyplcheckout.pojo.ShippingData;

public interface ShippingCallbacks {
    void onShippingChange(ShippingData shippingData, ShippingCallbackListener shippingCallbackListener);
}
