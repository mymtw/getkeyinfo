package com.paypal.pyplcheckout.addressbook.view.fragments;

import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.home.view.customviews.PayPalCompoundHeaderView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalCurrencyConversionView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalExpandedCartDetails;
import com.paypal.pyplcheckout.home.view.customviews.PayPalPoliciesAndRightsLinkView;
import com.paypal.pyplcheckout.shippingcallbacks.ShippingCallbackHandler;

/* renamed from: com.paypal.pyplcheckout.addressbook.view.fragments.g */
public final /* synthetic */ class C17189g implements EventListener {

    /* renamed from: a */
    public final /* synthetic */ int f37697a;

    /* renamed from: b */
    public final /* synthetic */ Object f37698b;

    public /* synthetic */ C17189g(Object obj, int i) {
        this.f37697a = i;
        this.f37698b = obj;
    }

    public final void onEvent(EventType eventType, ResultData resultData) {
        switch (this.f37697a) {
            case 0:
                PYPLNewShippingAddressReviewFragment.m35194shippingAddressEventListener$lambda5((PYPLNewShippingAddressReviewFragment) this.f37698b, eventType, resultData);
                return;
            case 1:
                PayPalCompoundHeaderView.m35290initViewModelObservers$lambda0((PayPalCompoundHeaderView) this.f37698b, eventType, resultData);
                return;
            case 2:
                PayPalCurrencyConversionView.m35302initEvents$lambda10((PayPalCurrencyConversionView) this.f37698b, eventType, resultData);
                return;
            case 3:
                PayPalExpandedCartDetails.m35325initEvents$lambda6((PayPalExpandedCartDetails) this.f37698b, eventType, resultData);
                return;
            case 4:
                PayPalPoliciesAndRightsLinkView.m35340initEvents$lambda5((PayPalPoliciesAndRightsLinkView) this.f37698b, eventType, resultData);
                return;
            default:
                ShippingCallbackHandler.m35435setupListeners$lambda1((ShippingCallbackHandler) this.f37698b, eventType, resultData);
                return;
        }
    }
}
