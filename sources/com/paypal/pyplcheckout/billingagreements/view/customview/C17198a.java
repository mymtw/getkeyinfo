package com.paypal.pyplcheckout.billingagreements.view.customview;

import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.home.view.activities.PYPLHomeActivity;
import com.paypal.pyplcheckout.home.view.customviews.AddCardView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalCompoundHeaderView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalPoliciesAndRightsLinkView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalSnappingRecyclerView;
import com.paypal.pyplcheckout.home.view.customviews.ShippingView;
import com.paypal.pyplcheckout.home.view.customviews.availablebalance.AvailableBalanceViewModel;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.services.api.CryptoQuoteTimer;
import com.paypal.pyplcheckout.userprofile.viewModel.UserViewModel;

/* renamed from: com.paypal.pyplcheckout.billingagreements.view.customview.a */
public final /* synthetic */ class C17198a implements EventListener {

    /* renamed from: a */
    public final /* synthetic */ int f37709a;

    /* renamed from: b */
    public final /* synthetic */ Object f37710b;

    public /* synthetic */ C17198a(Object obj, int i) {
        this.f37709a = i;
        this.f37710b = obj;
    }

    public final void onEvent(EventType eventType, ResultData resultData) {
        switch (this.f37709a) {
            case 0:
                PayPalBillingAgreementsInfoHeader.m35215listenForPayPalButtonEvent$lambda1((PayPalBillingAgreementsInfoHeader) this.f37710b, eventType, resultData);
                return;
            case 1:
                PYPLHomeActivity.m35261updatePaySheetVisibilityListener$lambda0((PYPLHomeActivity) this.f37710b, eventType, resultData);
                return;
            case 2:
                AddCardView.m35269carouselAddCardListener$lambda3((AddCardView) this.f37710b, eventType, resultData);
                return;
            case 3:
                PayPalCompoundHeaderView.m35288initEvents$lambda8((PayPalCompoundHeaderView) this.f37710b, eventType, resultData);
                return;
            case 4:
                PayPalPoliciesAndRightsLinkView.m35339initEvents$lambda11((PayPalPoliciesAndRightsLinkView) this.f37710b, eventType, resultData);
                return;
            case 5:
                PayPalSnappingRecyclerView.m35361initEvents$lambda17((PayPalSnappingRecyclerView) this.f37710b, eventType, resultData);
                return;
            case 6:
                ShippingView.m35386initEvents$lambda7((ShippingView) this.f37710b, eventType, resultData);
                return;
            case 7:
                AvailableBalanceViewModel.m35400initEventListeners$lambda4((AvailableBalanceViewModel) this.f37710b, eventType, resultData);
                return;
            case 8:
                ((MainPaysheetViewModel) this.f37710b).lambda$onLifeCycleCreate$10(eventType, resultData);
                return;
            case 9:
                CryptoQuoteTimer.m35423listener$lambda0((CryptoQuoteTimer) this.f37710b, eventType, resultData);
                return;
            default:
                UserViewModel.m35458fetchUserAttemptedListener$lambda2((UserViewModel) this.f37710b, eventType, resultData);
                return;
        }
    }
}
