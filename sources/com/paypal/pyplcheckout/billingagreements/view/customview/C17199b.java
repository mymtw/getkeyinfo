package com.paypal.pyplcheckout.billingagreements.view.customview;

import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.home.view.customviews.PayPalTopBannerView;
import com.paypal.pyplcheckout.home.view.customviews.ShippingView;
import com.paypal.pyplcheckout.home.view.interfaces.UpdateClientConfigListener;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;

/* renamed from: com.paypal.pyplcheckout.billingagreements.view.customview.b */
public final /* synthetic */ class C17199b implements EventListener {

    /* renamed from: a */
    public final /* synthetic */ int f37711a;

    /* renamed from: b */
    public final /* synthetic */ Object f37712b;

    public /* synthetic */ C17199b(Object obj, int i) {
        this.f37711a = i;
        this.f37712b = obj;
    }

    public final void onEvent(EventType eventType, ResultData resultData) {
        switch (this.f37711a) {
            case 0:
                PayPalBillingAgreementsTextView.m35225initEvents$lambda5((PayPalBillingAgreementsTextView) this.f37712b, eventType, resultData);
                return;
            case 1:
                PayPalTopBannerView.m35371initViewModelObservers$lambda0((PayPalTopBannerView) this.f37712b, eventType, resultData);
                return;
            case 2:
                ShippingView.m35378initEvents$lambda11((ShippingView) this.f37712b, eventType, resultData);
                return;
            case 3:
                ((UpdateClientConfigListener) this.f37712b).onUpdateClientConfig();
                return;
            default:
                ((MainPaysheetViewModel) this.f37712b).lambda$createPlanningCallEventListener$19(eventType, resultData);
                return;
        }
    }
}
