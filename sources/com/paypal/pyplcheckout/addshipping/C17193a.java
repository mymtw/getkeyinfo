package com.paypal.pyplcheckout.addshipping;

import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.fundingOptions.usecase.GetSelectedFundingOptionUseCase;
import com.paypal.pyplcheckout.home.view.customviews.AddCardView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalCurrencyConversionView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalExpandedCartDetails;
import com.paypal.pyplcheckout.home.view.customviews.PayPalPoliciesAndRightsLinkView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalSnappingRecyclerView;
import com.paypal.pyplcheckout.home.view.customviews.availablebalance.AvailableBalanceViewModel;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;

/* renamed from: com.paypal.pyplcheckout.addshipping.a */
public final /* synthetic */ class C17193a implements EventListener {

    /* renamed from: a */
    public final /* synthetic */ int f37701a;

    /* renamed from: b */
    public final /* synthetic */ Object f37702b;

    public /* synthetic */ C17193a(Object obj, int i) {
        this.f37701a = i;
        this.f37702b = obj;
    }

    public final void onEvent(EventType eventType, ResultData resultData) {
        switch (this.f37701a) {
            case 0:
                AddressAutoCompleteViewModel.m35197validateAddressRequestedListener$lambda1((AddressAutoCompleteViewModel) this.f37702b, eventType, resultData);
                return;
            case 1:
                GetSelectedFundingOptionUseCase.m35255creditsOfferEventListener$lambda1((GetSelectedFundingOptionUseCase) this.f37702b, eventType, resultData);
                return;
            case 2:
                AddCardView.m35270carouselCreditOfferListener$lambda0((AddCardView) this.f37702b, eventType, resultData);
                return;
            case 3:
                PayPalCurrencyConversionView.m35305initEvents$lambda13((PayPalCurrencyConversionView) this.f37702b, eventType, resultData);
                return;
            case 4:
                PayPalExpandedCartDetails.m35328initEvents$lambda9((PayPalExpandedCartDetails) this.f37702b, eventType, resultData);
                return;
            case 5:
                PayPalPoliciesAndRightsLinkView.m35343initEvents$lambda8((PayPalPoliciesAndRightsLinkView) this.f37702b, eventType, resultData);
                return;
            case 6:
                PayPalSnappingRecyclerView.m35357initEvents$lambda13((PayPalSnappingRecyclerView) this.f37702b, eventType, resultData);
                return;
            case 7:
                AvailableBalanceViewModel.m35397initEventListeners$lambda1((AvailableBalanceViewModel) this.f37702b, eventType, resultData);
                return;
            default:
                ((MainPaysheetViewModel) this.f37702b).lambda$onLifeCycleCreate$7(eventType, resultData);
                return;
        }
    }
}
