package com.paypal.pyplcheckout.shippingmethods.model;

import com.paypal.pyplcheckout.pojo.ShippingMethodType;
import com.paypal.pyplcheckout.shippingmethods.view.interfaces.PayPalShippingMethodsHeaderViewListener;
import com.paypal.pyplcheckout.shippingmethods.view.interfaces.PayPalShippingMethodsRecyclerViewListener;
import com.paypal.pyplcheckout.shippingmethods.view.interfaces.ShippingMethodsViewListener;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ShippingMethodsViewListenerImpl implements ShippingMethodsViewListener {
    private PayPalShippingMethodsHeaderViewListener mPayPalShippingMethodsHeaderViewListener;
    private PayPalShippingMethodsRecyclerViewListener mPayPalShippingMethodsRecyclerViewListener;

    public ShippingMethodsViewListenerImpl() {
        this((PayPalShippingMethodsHeaderViewListener) null, (PayPalShippingMethodsRecyclerViewListener) null, 3, (DefaultConstructorMarker) null);
    }

    public ShippingMethodsViewListenerImpl(PayPalShippingMethodsHeaderViewListener payPalShippingMethodsHeaderViewListener, PayPalShippingMethodsRecyclerViewListener payPalShippingMethodsRecyclerViewListener) {
        this.mPayPalShippingMethodsHeaderViewListener = payPalShippingMethodsHeaderViewListener;
        this.mPayPalShippingMethodsRecyclerViewListener = payPalShippingMethodsRecyclerViewListener;
    }

    public void onPayPalBackArrowClick() {
        PayPalShippingMethodsHeaderViewListener payPalShippingMethodsHeaderViewListener = this.mPayPalShippingMethodsHeaderViewListener;
        if (payPalShippingMethodsHeaderViewListener != null) {
            payPalShippingMethodsHeaderViewListener.onPayPalBackArrowClick();
        }
    }

    public void onPayPalShippingMethodSelected(int i, ShippingMethodType shippingMethodType) {
        C19383o.m32797g(shippingMethodType, "selectedShippingMethodType");
        PayPalShippingMethodsRecyclerViewListener payPalShippingMethodsRecyclerViewListener = this.mPayPalShippingMethodsRecyclerViewListener;
        if (payPalShippingMethodsRecyclerViewListener != null) {
            payPalShippingMethodsRecyclerViewListener.onPayPalShippingMethodSelected(i, shippingMethodType);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShippingMethodsViewListenerImpl(PayPalShippingMethodsHeaderViewListener payPalShippingMethodsHeaderViewListener, PayPalShippingMethodsRecyclerViewListener payPalShippingMethodsRecyclerViewListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : payPalShippingMethodsHeaderViewListener, (i & 2) != 0 ? null : payPalShippingMethodsRecyclerViewListener);
    }
}
