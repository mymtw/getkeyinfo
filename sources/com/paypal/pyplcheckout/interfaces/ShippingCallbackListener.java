package com.paypal.pyplcheckout.interfaces;

import com.paypal.checkout.order.PurchaseUnit;
import com.paypal.pyplcheckout.pojo.ShippingCallbackRequestType;
import java.util.List;

public interface ShippingCallbackListener {
    void onFailure(String str, ShippingCallbackRequestType shippingCallbackRequestType);

    void onSuccess(boolean z);

    void onSuccess(boolean z, String str, List<PurchaseUnit> list);
}
