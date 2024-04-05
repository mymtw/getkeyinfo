package com.paypal.pyplcheckout.addressbook.view.fragments;

import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.home.view.customviews.PayPalExitLoadingSpinner;
import com.paypal.pyplcheckout.home.view.customviews.ShippingView;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;

/* renamed from: com.paypal.pyplcheckout.addressbook.view.fragments.c */
public final /* synthetic */ class C17185c implements EventListener {

    /* renamed from: a */
    public final /* synthetic */ int f37690a;

    /* renamed from: b */
    public final /* synthetic */ Object f37691b;

    public /* synthetic */ C17185c(Object obj, int i) {
        this.f37690a = i;
        this.f37691b = obj;
    }

    public final void onEvent(EventType eventType, ResultData resultData) {
        switch (this.f37690a) {
            case 0:
                PYPLNewShippingAddressFragment.m35190startFragmentListener$lambda1((PYPLNewShippingAddressFragment) this.f37691b, eventType, resultData);
                return;
            case 1:
                PayPalExitLoadingSpinner.m35319initViewModelObservers$lambda2((PayPalExitLoadingSpinner) this.f37691b, eventType, resultData);
                return;
            case 2:
                ShippingView.m35380initEvents$lambda13((ShippingView) this.f37691b, eventType, resultData);
                return;
            default:
                ((MainPaysheetViewModel) this.f37691b).lambda$createUserCheckoutEventListener$18(eventType, resultData);
                return;
        }
    }
}
