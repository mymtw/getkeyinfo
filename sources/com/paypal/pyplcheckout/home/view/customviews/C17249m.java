package com.paypal.pyplcheckout.home.view.customviews;

import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.userprofile.usecase.GetUserUseCase;

/* renamed from: com.paypal.pyplcheckout.home.view.customviews.m */
public final /* synthetic */ class C17249m implements EventListener {

    /* renamed from: a */
    public final /* synthetic */ int f37771a;

    /* renamed from: b */
    public final /* synthetic */ Object f37772b;

    public /* synthetic */ C17249m(Object obj, int i) {
        this.f37771a = i;
        this.f37772b = obj;
    }

    public final void onEvent(EventType eventType, ResultData resultData) {
        switch (this.f37771a) {
            case 0:
                PayPalLogoutSpinner.m35336initViewModelObservers$lambda0((PayPalLogoutSpinner) this.f37772b, eventType, resultData);
                return;
            case 1:
                ShippingView.m35379initEvents$lambda12((ShippingView) this.f37772b, eventType, resultData);
                return;
            default:
                GetUserUseCase.m35448fetchUserCompleteListener$lambda0((GetUserUseCase) this.f37772b, eventType, resultData);
                return;
        }
    }
}
