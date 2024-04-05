package com.paypal.pyplcheckout.addressbook.view.fragments;

import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.home.view.customviews.ShippingView;
import com.paypal.pyplcheckout.home.view.customviews.availablebalance.AvailableBalanceViewModel;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.threeds.usecase.ThreeDSUseCase;

/* renamed from: com.paypal.pyplcheckout.addressbook.view.fragments.a */
public final /* synthetic */ class C17183a implements EventListener {

    /* renamed from: a */
    public final /* synthetic */ int f37688a;

    /* renamed from: b */
    public final /* synthetic */ Object f37689b;

    public /* synthetic */ C17183a(Object obj, int i) {
        this.f37688a = i;
        this.f37689b = obj;
    }

    public final void onEvent(EventType eventType, ResultData resultData) {
        switch (this.f37688a) {
            case 0:
                PYPLAddressBookFragment.m35184initPYPLAddressBookFragmentObservers$lambda2((PYPLAddressBookFragment) this.f37689b, eventType, resultData);
                return;
            case 1:
                ShippingView.m35385initEvents$lambda18((ShippingView) this.f37689b, eventType, resultData);
                return;
            case 2:
                AvailableBalanceViewModel.m35402initEventListeners$lambda6((AvailableBalanceViewModel) this.f37689b, eventType, resultData);
                return;
            case 3:
                ((MainPaysheetViewModel) this.f37689b).lambda$onLifeCycleCreate$12(eventType, resultData);
                return;
            default:
                ThreeDSUseCase.m35444threeDSCompleteListener$lambda1((ThreeDSUseCase) this.f37689b, eventType, resultData);
                return;
        }
    }
}
