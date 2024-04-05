package com.paypal.pyplcheckout.addressbook.view.fragments;

import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsToggle;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.home.view.customviews.PayPalCurrencyConversionView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalExpandedCartDetails;
import com.paypal.pyplcheckout.home.view.customviews.PayPalPoliciesAndRightsLinkView;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.shippingcallbacks.ShippingCallbackHandler;

/* renamed from: com.paypal.pyplcheckout.addressbook.view.fragments.h */
public final /* synthetic */ class C17190h implements EventListener {

    /* renamed from: a */
    public final /* synthetic */ int f37699a;

    /* renamed from: b */
    public final /* synthetic */ Object f37700b;

    public /* synthetic */ C17190h(Object obj, int i) {
        this.f37699a = i;
        this.f37700b = obj;
    }

    public final void onEvent(EventType eventType, ResultData resultData) {
        switch (this.f37699a) {
            case 0:
                PYPLNewShippingAddressReviewFragment.m35192addNewAddressRequestListener$lambda7((PYPLNewShippingAddressReviewFragment) this.f37700b, eventType, resultData);
                return;
            case 1:
                PayPalBillingAgreementsToggle.m35230listenForPayPalButtonEvent$lambda1((PayPalBillingAgreementsToggle) this.f37700b, eventType, resultData);
                return;
            case 2:
                PayPalCurrencyConversionView.m35303initEvents$lambda11((PayPalCurrencyConversionView) this.f37700b, eventType, resultData);
                return;
            case 3:
                PayPalExpandedCartDetails.m35326initEvents$lambda7((PayPalExpandedCartDetails) this.f37700b, eventType, resultData);
                return;
            case 4:
                PayPalPoliciesAndRightsLinkView.m35341initEvents$lambda6((PayPalPoliciesAndRightsLinkView) this.f37700b, eventType, resultData);
                return;
            case 5:
                ((MainPaysheetViewModel) this.f37700b).lambda$onLifeCycleCreate$16(eventType, resultData);
                return;
            default:
                ShippingCallbackHandler.m35436setupListeners$lambda2((ShippingCallbackHandler) this.f37700b, eventType, resultData);
                return;
        }
    }
}
