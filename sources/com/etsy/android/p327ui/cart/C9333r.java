package com.etsy.android.p327ui.cart;

import com.etsy.android.lib.models.apiv3.cart.CartErrorResolution;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.cart.GooglePayData;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.vespa.PositionList;
import p415of.C13182k;

/* renamed from: com.etsy.android.ui.cart.r */
public interface C9333r extends C13182k {
    void proceedToCheckout(String str, String str2);

    void requestGPay(GooglePayData googlePayData);

    void showAddShopCouponDialog(PositionList positionList, ServerDrivenAction serverDrivenAction);

    void showApplyCouponDialog(CartGroupItem cartGroupItem, PositionList positionList);

    void showSelectShippingDestinationDialog(PositionList positionList, ServerDrivenAction serverDrivenAction, CartErrorResolution cartErrorResolution);

    void showVariationSelectDialog(PositionList positionList, ServerDrivenAction serverDrivenAction);
}
