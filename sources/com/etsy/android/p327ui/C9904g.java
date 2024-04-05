package com.etsy.android.p327ui;

import androidx.lifecycle.C2843a0;
import com.etsy.android.p327ui.cart.saved.StandaloneSavedCartItemsFragment;
import com.etsy.android.p327ui.navigation.bottom.C10690g;
import com.etsy.android.util.C12059p;
import com.paypal.android.platform.authsdk.authcommon.p531ui.webview.WebViewFragment;
import com.paypal.pyplcheckout.addcard.AddCardViewModel;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsTextView;
import com.paypal.pyplcheckout.billingagreements.viewmodel.BaTextState;
import com.paypal.pyplcheckout.home.view.customviews.AddCardView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalPoliciesAndRightsLinkView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalSnappingRecyclerView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalTopBannerView;
import com.paypal.pyplcheckout.home.view.customviews.availablebalance.AvailableBalanceState;
import com.paypal.pyplcheckout.home.view.customviews.availablebalance.AvailablePpBalanceView;
import com.paypal.pyplcheckout.info.view.customviews.PYPLTransactionDetailsView;

/* renamed from: com.etsy.android.ui.g */
public final /* synthetic */ class C9904g implements C2843a0 {

    /* renamed from: b */
    public final /* synthetic */ int f21852b;

    /* renamed from: c */
    public final /* synthetic */ Object f21853c;

    public /* synthetic */ C9904g(Object obj, int i) {
        this.f21852b = i;
        this.f21853c = obj;
    }

    public final void onChanged(Object obj) {
        switch (this.f21852b) {
            case 0:
                ((BOEActivity) this.f21853c).lambda$onCreate$1((C10690g) obj);
                return;
            case 1:
                ((EtsyWebFragment) this.f21853c).lambda$onViewCreated$0((C12059p) obj);
                return;
            case 2:
                StandaloneSavedCartItemsFragment.m34929onViewCreated$lambda2((StandaloneSavedCartItemsFragment) this.f21853c, (C12059p) obj);
                return;
            case 3:
                WebViewFragment.m35119addObserver$lambda7((WebViewFragment) this.f21853c, (Boolean) obj);
                return;
            case 4:
                PayPalBillingAgreementsTextView.m35228initViewModelObservers$lambda3((PayPalBillingAgreementsTextView) this.f21853c, (BaTextState) obj);
                return;
            case 5:
                AddCardView.m35284onAttachedToWindow$lambda11((AddCardView) this.f21853c, (AddCardViewModel.AddCardLoadingState) obj);
                return;
            case 6:
                PayPalPoliciesAndRightsLinkView.m35346initViewModelObservers$lambda1((PayPalPoliciesAndRightsLinkView) this.f21853c, (Boolean) obj);
                return;
            case 7:
                PayPalSnappingRecyclerView.m35363logoutCompletedFlagObserver$lambda2((PayPalSnappingRecyclerView) this.f21853c, (Boolean) obj);
                return;
            case 8:
                PayPalTopBannerView.m35374initViewModelObservers$lambda3((PayPalTopBannerView) this.f21853c, (Boolean) obj);
                return;
            case 9:
                AvailablePpBalanceView.m35403_init_$lambda0((AvailablePpBalanceView) this.f21853c, (AvailableBalanceState) obj);
                return;
            default:
                PYPLTransactionDetailsView.m35420initViewModelObservers$lambda2((PYPLTransactionDetailsView) this.f21853c, (String) obj);
                return;
        }
    }
}
