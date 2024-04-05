package com.paypal.pyplcheckout.shippingcallbacks;

import com.paypal.checkout.order.PurchaseUnit;
import com.paypal.pyplcheckout.interfaces.ShippingCallbackListener;
import com.paypal.pyplcheckout.pojo.ShippingCallbackRequestType;
import java.util.List;
import kotlin.jvm.internal.C19383o;

public final class ShippingCallbackHandler$setupListeners$4 implements ShippingCallbackListener {
    public final /* synthetic */ ShippingCallbackHandler this$0;

    public ShippingCallbackHandler$setupListeners$4(ShippingCallbackHandler shippingCallbackHandler) {
        this.this$0 = shippingCallbackHandler;
    }

    public void onFailure(String str, ShippingCallbackRequestType shippingCallbackRequestType) {
        C19383o.m32797g(str, "reason");
        C19383o.m32797g(shippingCallbackRequestType, "shippingCallbackRequestType");
        this.this$0.handleShippingCallbackBehaviour(shippingCallbackRequestType, false, false);
    }

    public void onSuccess(boolean z) {
        this.this$0.handleShippingCallbackBehaviour((ShippingCallbackRequestType) null, true, z);
    }

    public void onSuccess(boolean z, String str, List<PurchaseUnit> list) {
        C19383o.m32797g(str, "upgradedAccessToken");
        C19383o.m32797g(list, "purchaseUnit");
        ShippingCallbackHandler shippingCallbackHandler = this.this$0;
        shippingCallbackHandler.updateOrder(z, shippingCallbackHandler.accessToken, list);
    }
}
