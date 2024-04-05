package com.paypal.pyplcheckout.home.view.customviews;

import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.threeds.usecase.ThreeDSUseCase;

/* renamed from: com.paypal.pyplcheckout.home.view.customviews.l */
public final /* synthetic */ class C17248l implements EventListener {

    /* renamed from: a */
    public final /* synthetic */ int f37769a;

    /* renamed from: b */
    public final /* synthetic */ Object f37770b;

    public /* synthetic */ C17248l(Object obj, int i) {
        this.f37769a = i;
        this.f37770b = obj;
    }

    public final void onEvent(EventType eventType, ResultData resultData) {
        switch (this.f37769a) {
            case 0:
                PayPalHomeBodyContainer.m35335paypalButtonClickedEventListener$lambda0((PayPalHomeBodyContainer) this.f37770b, eventType, resultData);
                return;
            case 1:
                ShippingView.m35387initEvents$lambda8((ShippingView) this.f37770b, eventType, resultData);
                return;
            case 2:
                ((MainPaysheetViewModel) this.f37770b).lambda$onLifeCycleCreate$13(eventType, resultData);
                return;
            default:
                ThreeDSUseCase.m35443contingencyEventListener$lambda2((ThreeDSUseCase) this.f37770b, eventType, resultData);
                return;
        }
    }
}
