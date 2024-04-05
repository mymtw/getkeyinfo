package com.paypal.pyplcheckout.shippingcallbacks;

import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.exception.PYPLException;
import com.paypal.pyplcheckout.interfaces.UpdateOrderFinishListener;
import com.paypal.pyplcheckout.pojo.ShippingCallbackRequestType;
import kotlin.jvm.internal.C19383o;

public final class ShippingCallbackHandler$updateOrder$1 implements UpdateOrderFinishListener {
    public final /* synthetic */ boolean $refreshData;
    public final /* synthetic */ ShippingCallbackHandler this$0;

    public ShippingCallbackHandler$updateOrder$1(ShippingCallbackHandler shippingCallbackHandler, boolean z) {
        this.this$0 = shippingCallbackHandler;
        this.$refreshData = z;
    }

    public void onFailure(PYPLException pYPLException) {
        C19383o.m32797g(pYPLException, "exception");
        PLog.m28733eR(ShippingCallbackHandler.Companion.getTAG(), "Orders update exception", pYPLException);
        this.this$0.handleShippingCallbackBehaviour((ShippingCallbackRequestType) null, true, this.$refreshData);
    }

    public void onSuccess(String str) {
        C19383o.m32797g(str, "result");
        this.this$0.handleShippingCallbackBehaviour((ShippingCallbackRequestType) null, true, this.$refreshData);
    }
}
