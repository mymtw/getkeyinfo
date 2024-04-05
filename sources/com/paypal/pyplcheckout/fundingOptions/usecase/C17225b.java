package com.paypal.pyplcheckout.fundingOptions.usecase;

import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.home.view.customviews.AddCardView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalCurrencyConversionView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalExpandedCartDetails;
import com.paypal.pyplcheckout.home.view.customviews.PayPalPoliciesAndRightsLinkView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalSnappingRecyclerView;
import com.paypal.pyplcheckout.home.view.customviews.availablebalance.AvailableBalanceViewModel;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.userprofile.viewModel.UserViewModel;

/* renamed from: com.paypal.pyplcheckout.fundingOptions.usecase.b */
public final /* synthetic */ class C17225b implements EventListener {

    /* renamed from: a */
    public final /* synthetic */ int f37740a;

    /* renamed from: b */
    public final /* synthetic */ Object f37741b;

    public /* synthetic */ C17225b(Object obj, int i) {
        this.f37740a = i;
        this.f37741b = obj;
    }

    public final void onEvent(EventType eventType, ResultData resultData) {
        switch (this.f37740a) {
            case 0:
                GetSelectedFundingOptionUseCase.m35257payLaterEventListener$lambda2((GetSelectedFundingOptionUseCase) this.f37741b, eventType, resultData);
                return;
            case 1:
                AddCardView.m35272carouselPayInFourListener$lambda1((AddCardView) this.f37741b, eventType, resultData);
                return;
            case 2:
                PayPalCurrencyConversionView.m35306initEvents$lambda14((PayPalCurrencyConversionView) this.f37741b, eventType, resultData);
                return;
            case 3:
                PayPalExpandedCartDetails.m35321initEvents$lambda10((PayPalExpandedCartDetails) this.f37741b, eventType, resultData);
                return;
            case 4:
                PayPalPoliciesAndRightsLinkView.m35344initEvents$lambda9((PayPalPoliciesAndRightsLinkView) this.f37741b, eventType, resultData);
                return;
            case 5:
                PayPalSnappingRecyclerView.m35358initEvents$lambda15((PayPalSnappingRecyclerView) this.f37741b, eventType, resultData);
                return;
            case 6:
                AvailableBalanceViewModel.m35398initEventListeners$lambda2((AvailableBalanceViewModel) this.f37741b, eventType, resultData);
                return;
            case 7:
                ((MainPaysheetViewModel) this.f37741b).lambda$onLifeCycleCreate$8(eventType, resultData);
                return;
            default:
                UserViewModel.m35459fetchUserCompleteListener$lambda0((UserViewModel) this.f37741b, eventType, resultData);
                return;
        }
    }
}
