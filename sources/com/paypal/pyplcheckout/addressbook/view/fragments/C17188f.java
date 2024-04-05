package com.paypal.pyplcheckout.addressbook.view.fragments;

import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.home.view.customviews.PayPalCurrencyConversionView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalExpandedCartDetails;
import com.paypal.pyplcheckout.home.view.customviews.ShippingView;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.shippingcallbacks.ShippingCallbackHandler;
import p753kq.C19846a;

/* renamed from: com.paypal.pyplcheckout.addressbook.view.fragments.f */
public final /* synthetic */ class C17188f implements EventListener {

    /* renamed from: a */
    public final /* synthetic */ int f37695a;

    /* renamed from: b */
    public final /* synthetic */ Object f37696b;

    public /* synthetic */ C17188f(Object obj, int i) {
        this.f37695a = i;
        this.f37696b = obj;
    }

    public final void onEvent(EventType eventType, ResultData resultData) {
        switch (this.f37695a) {
            case 0:
                PYPLNewShippingAddressReviewFragment.m35195startFragmentListener$lambda2((PYPLNewShippingAddressReviewFragment) this.f37696b, eventType, resultData);
                return;
            case 1:
                PayPalCurrencyConversionView.m35309initEvents$lambda9((PayPalCurrencyConversionView) this.f37696b, eventType, resultData);
                return;
            case 2:
                PayPalExpandedCartDetails.m35324initEvents$lambda5((PayPalExpandedCartDetails) this.f37696b, eventType, resultData);
                return;
            case 3:
                ShippingView.m35383initEvents$lambda16((C19846a) this.f37696b, eventType, resultData);
                return;
            case 4:
                ((MainPaysheetViewModel) this.f37696b).lambda$onLifeCycleCreate$15(eventType, resultData);
                return;
            default:
                ShippingCallbackHandler.m35434setupListeners$lambda0((ShippingCallbackHandler) this.f37696b, eventType, resultData);
                return;
        }
    }
}
