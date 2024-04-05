package com.paypal.checkout.paymentbutton;

import android.view.ViewGroup;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsTextView;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.home.view.customviews.ShippingView;

/* renamed from: com.paypal.checkout.paymentbutton.b */
public final /* synthetic */ class C17144b implements EventListener {

    /* renamed from: a */
    public final /* synthetic */ int f37522a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f37523b;

    public /* synthetic */ C17144b(ViewGroup viewGroup, int i) {
        this.f37522a = i;
        this.f37523b = viewGroup;
    }

    public final void onEvent(EventType eventType, ResultData resultData) {
        switch (this.f37522a) {
            case 0:
                PaymentButton.m35149networkEventListener$lambda1((PaymentButton) this.f37523b, eventType, resultData);
                return;
            case 1:
                PayPalBillingAgreementsTextView.m35224initEvents$lambda4((PayPalBillingAgreementsTextView) this.f37523b, eventType, resultData);
                return;
            default:
                ShippingView.m35377initEvents$lambda10((ShippingView) this.f37523b, eventType, resultData);
                return;
        }
    }
}
