package com.paypal.pyplcheckout.billingagreements.viewmodel;

import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.fundingOptions.usecase.GetSelectedFundingOptionUseCase;
import com.paypal.pyplcheckout.home.view.customviews.AddCardView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalCompoundHeaderView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalExpandedCartDetails;
import com.paypal.pyplcheckout.home.view.customviews.PayPalPoliciesAndRightsLinkView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalSnappingRecyclerView;
import com.paypal.pyplcheckout.home.view.customviews.availablebalance.AvailableBalanceViewModel;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.userprofile.viewModel.UserViewModel;

/* renamed from: com.paypal.pyplcheckout.billingagreements.viewmodel.a */
public final /* synthetic */ class C17203a implements EventListener {

    /* renamed from: a */
    public final /* synthetic */ int f37713a;

    /* renamed from: b */
    public final /* synthetic */ Object f37714b;

    public /* synthetic */ C17203a(Object obj, int i) {
        this.f37713a = i;
        this.f37714b = obj;
    }

    public final void onEvent(EventType eventType, ResultData resultData) {
        switch (this.f37713a) {
            case 0:
                BillingAgreementsViewModel.m35236userCheckoutEventListener$lambda2((BillingAgreementsViewModel) this.f37714b, eventType, resultData);
                return;
            case 1:
                GetSelectedFundingOptionUseCase.m35256fundingInstrumentEventListener$lambda3((GetSelectedFundingOptionUseCase) this.f37714b, eventType, resultData);
                return;
            case 2:
                AddCardView.m35271carouselFundingInstrumentListener$lambda2((AddCardView) this.f37714b, eventType, resultData);
                return;
            case 3:
                PayPalCompoundHeaderView.m35287initEvents$lambda7((PayPalCompoundHeaderView) this.f37714b, eventType, resultData);
                return;
            case 4:
                PayPalExpandedCartDetails.m35322initEvents$lambda11((PayPalExpandedCartDetails) this.f37714b, eventType, resultData);
                return;
            case 5:
                PayPalPoliciesAndRightsLinkView.m35338initEvents$lambda10((PayPalPoliciesAndRightsLinkView) this.f37714b, eventType, resultData);
                return;
            case 6:
                PayPalSnappingRecyclerView.m35360initEvents$lambda16((PayPalSnappingRecyclerView) this.f37714b, eventType, resultData);
                return;
            case 7:
                AvailableBalanceViewModel.m35399initEventListeners$lambda3((AvailableBalanceViewModel) this.f37714b, eventType, resultData);
                return;
            case 8:
                ((MainPaysheetViewModel) this.f37714b).lambda$onLifeCycleCreate$9(eventType, resultData);
                return;
            default:
                UserViewModel.m35460userLogoutListener$lambda1((UserViewModel) this.f37714b, eventType, resultData);
                return;
        }
    }
}
