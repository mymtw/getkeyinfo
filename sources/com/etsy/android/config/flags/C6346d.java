package com.etsy.android.config.flags;

import androidx.lifecycle.C2843a0;
import com.etsy.android.p327ui.home.tabs.C10067m;
import com.etsy.android.p327ui.home.tabs.HomePagerFragment;
import com.etsy.android.util.C12059p;
import com.paypal.android.platform.authsdk.authcommon.p531ui.webview.WebViewFragment;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsTextView;
import com.paypal.pyplcheckout.events.model.ContingencyEventsModel;
import com.paypal.pyplcheckout.home.view.customviews.PayPalPoliciesAndRightsLinkView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalSnappingRecyclerView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalTopBannerView;
import com.paypal.pyplcheckout.home.view.customviews.availablebalance.AvailablePpBalanceView;
import com.paypal.pyplcheckout.info.view.customviews.PYPLTransactionDetailsView;

/* renamed from: com.etsy.android.config.flags.d */
public final /* synthetic */ class C6346d implements C2843a0 {

    /* renamed from: b */
    public final /* synthetic */ int f14139b;

    /* renamed from: c */
    public final /* synthetic */ Object f14140c;

    public /* synthetic */ C6346d(Object obj, int i) {
        this.f14139b = i;
        this.f14140c = obj;
    }

    public final void onChanged(Object obj) {
        switch (this.f14139b) {
            case 0:
                ((ConfigFlagsFragment) this.f14140c).handleSideEffect((C12059p) obj);
                return;
            case 1:
                HomePagerFragment.m35004onViewCreated$lambda5((HomePagerFragment) this.f14140c, (C10067m) obj);
                return;
            case 2:
                WebViewFragment.m35118addObserver$lambda6((WebViewFragment) this.f14140c, (Boolean) obj);
                return;
            case 3:
                PayPalBillingAgreementsTextView.m35227initViewModelObservers$lambda2((PayPalBillingAgreementsTextView) this.f14140c, (ContingencyEventsModel) obj);
                return;
            case 4:
                PayPalPoliciesAndRightsLinkView.m35345initViewModelObservers$lambda0((PayPalPoliciesAndRightsLinkView) this.f14140c, (Boolean) obj);
                return;
            case 5:
                PayPalSnappingRecyclerView.m35356fetchingUserDataCompletedFlagObserver$lambda1((PayPalSnappingRecyclerView) this.f14140c, (Boolean) obj);
                return;
            case 6:
                PayPalTopBannerView.m35373initViewModelObservers$lambda2((PayPalTopBannerView) this.f14140c, (Boolean) obj);
                return;
            case 7:
                AvailablePpBalanceView.m35407initViewModelObservers$lambda4((AvailablePpBalanceView) this.f14140c, (ContingencyEventsModel) obj);
                return;
            default:
                PYPLTransactionDetailsView.m35419initViewModelObservers$lambda1((PYPLTransactionDetailsView) this.f14140c, (String) obj);
                return;
        }
    }
}
