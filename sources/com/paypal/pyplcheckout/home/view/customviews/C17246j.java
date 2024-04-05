package com.paypal.pyplcheckout.home.view.customviews;

import android.view.ViewGroup;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;

/* renamed from: com.paypal.pyplcheckout.home.view.customviews.j */
public final /* synthetic */ class C17246j implements EventListener {

    /* renamed from: a */
    public final /* synthetic */ int f37765a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f37766b;

    public /* synthetic */ C17246j(ViewGroup viewGroup, int i) {
        this.f37765a = i;
        this.f37766b = viewGroup;
    }

    public final void onEvent(EventType eventType, ResultData resultData) {
        switch (this.f37765a) {
            case 0:
                PayPalCurrencyConversionView.m35307initEvents$lambda6((PayPalCurrencyConversionView) this.f37766b, eventType, resultData);
                return;
            case 1:
                PayPalExitLoadingSpinner.m35320initViewModelObservers$lambda3((PayPalExitLoadingSpinner) this.f37766b, eventType, resultData);
                return;
            default:
                ShippingView.m35381initEvents$lambda14((ShippingView) this.f37766b, eventType, resultData);
                return;
        }
    }
}
