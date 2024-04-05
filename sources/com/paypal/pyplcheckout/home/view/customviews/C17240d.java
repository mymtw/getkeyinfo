package com.paypal.pyplcheckout.home.view.customviews;

import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.home.view.customviews.availablebalance.AvailableBalanceViewModel;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;

/* renamed from: com.paypal.pyplcheckout.home.view.customviews.d */
public final /* synthetic */ class C17240d implements EventListener {

    /* renamed from: a */
    public final /* synthetic */ int f37753a;

    /* renamed from: b */
    public final /* synthetic */ Object f37754b;

    public /* synthetic */ C17240d(Object obj, int i) {
        this.f37753a = i;
        this.f37754b = obj;
    }

    public final void onEvent(EventType eventType, ResultData resultData) {
        switch (this.f37753a) {
            case 0:
                AddCardView.m35283nativeAddCardClickListener$lambda4((AddCardView) this.f37754b, eventType, resultData);
                return;
            case 1:
                PayPalCompoundHeaderView.m35289initEvents$lambda9((PayPalCompoundHeaderView) this.f37754b, eventType, resultData);
                return;
            case 2:
                PayPalSnappingRecyclerView.m35362initEvents$lambda20((PayPalSnappingRecyclerView) this.f37754b, eventType, resultData);
                return;
            case 3:
                ShippingView.m35384initEvents$lambda17((ShippingView) this.f37754b, eventType, resultData);
                return;
            case 4:
                AvailableBalanceViewModel.m35401initEventListeners$lambda5((AvailableBalanceViewModel) this.f37754b, eventType, resultData);
                return;
            default:
                ((MainPaysheetViewModel) this.f37754b).lambda$onLifeCycleCreate$11(eventType, resultData);
                return;
        }
    }
}
