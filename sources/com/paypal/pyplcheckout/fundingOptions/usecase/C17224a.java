package com.paypal.pyplcheckout.fundingOptions.usecase;

import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.home.view.customviews.PayPalCurrencyConversionView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalExpandedCartDetails;
import com.paypal.pyplcheckout.home.view.customviews.PayPalPoliciesAndRightsLinkView;
import com.paypal.pyplcheckout.home.view.customviews.availablebalance.AvailableBalanceViewModel;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.shippingcallbacks.ShippingCallbackHandler;

/* renamed from: com.paypal.pyplcheckout.fundingOptions.usecase.a */
public final /* synthetic */ class C17224a implements EventListener {

    /* renamed from: a */
    public final /* synthetic */ int f37738a;

    /* renamed from: b */
    public final /* synthetic */ Object f37739b;

    public /* synthetic */ C17224a(Object obj, int i) {
        this.f37738a = i;
        this.f37739b = obj;
    }

    public final void onEvent(EventType eventType, ResultData resultData) {
        switch (this.f37738a) {
            case 0:
                GetSelectedFundingOptionUseCase.m35254addCardEventListener$lambda0((GetSelectedFundingOptionUseCase) this.f37739b, eventType, resultData);
                return;
            case 1:
                PayPalCurrencyConversionView.m35304initEvents$lambda12((PayPalCurrencyConversionView) this.f37739b, eventType, resultData);
                return;
            case 2:
                PayPalExpandedCartDetails.m35327initEvents$lambda8((PayPalExpandedCartDetails) this.f37739b, eventType, resultData);
                return;
            case 3:
                PayPalPoliciesAndRightsLinkView.m35342initEvents$lambda7((PayPalPoliciesAndRightsLinkView) this.f37739b, eventType, resultData);
                return;
            case 4:
                AvailableBalanceViewModel.m35396initEventListeners$lambda0((AvailableBalanceViewModel) this.f37739b, eventType, resultData);
                return;
            case 5:
                ((MainPaysheetViewModel) this.f37739b).lambda$onLifeCycleCreate$6(eventType, resultData);
                return;
            default:
                ShippingCallbackHandler.m35437setupListeners$lambda3((ShippingCallbackHandler) this.f37739b, eventType, resultData);
                return;
        }
    }
}
