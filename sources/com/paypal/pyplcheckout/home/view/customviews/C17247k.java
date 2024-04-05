package com.paypal.pyplcheckout.home.view.customviews;

import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.home.view.fragments.HomeFragment;
import com.paypal.pyplcheckout.shippingcallbacks.ShippingCallbackHandler;

/* renamed from: com.paypal.pyplcheckout.home.view.customviews.k */
public final /* synthetic */ class C17247k implements EventListener {

    /* renamed from: a */
    public final /* synthetic */ int f37767a;

    /* renamed from: b */
    public final /* synthetic */ Object f37768b;

    public /* synthetic */ C17247k(Object obj, int i) {
        this.f37767a = i;
        this.f37768b = obj;
    }

    public final void onEvent(EventType eventType, ResultData resultData) {
        switch (this.f37767a) {
            case 0:
                PayPalCurrencyConversionView.m35308initEvents$lambda8((PayPalCurrencyConversionView) this.f37768b, eventType, resultData);
                return;
            case 1:
                PayPalExpandedCartDetails.m35323initEvents$lambda4((PayPalExpandedCartDetails) this.f37768b, eventType, resultData);
                return;
            case 2:
                HomeFragment.m35412initPYPLHomeViewModelObservers$lambda8((HomeFragment) this.f37768b, eventType, resultData);
                return;
            default:
                ShippingCallbackHandler.m35433createShippingChangeErrorListener$lambda4((ShippingCallbackHandler) this.f37768b, eventType, resultData);
                return;
        }
    }
}
