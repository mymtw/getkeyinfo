package com.etsy.android.feedback;

import androidx.lifecycle.C2843a0;
import com.etsy.android.p327ui.cart.bottomsheets.applycoupon.ApplyCouponBottomSheetFragment;
import com.etsy.android.p327ui.cart.bottomsheets.applycoupon.C9260e;
import com.etsy.android.p327ui.home.tabs.C10070p;
import com.etsy.android.p327ui.home.tabs.HomePagerFragment;
import com.etsy.android.p327ui.user.help.HelpPhoneNumbersFragment;
import com.etsy.android.util.C12059p;
import com.paypal.android.platform.authsdk.authcommon.p531ui.webview.WebViewFragment;
import com.paypal.pyplcheckout.addressbook.view.AddressRecommendationViewState;
import com.paypal.pyplcheckout.addressbook.view.fragments.PYPLAddressRecommendationFragment;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsTextView;
import com.paypal.pyplcheckout.events.model.ContingencyEventsModel;
import com.paypal.pyplcheckout.home.view.customviews.AddCardView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalContinueButton;
import com.paypal.pyplcheckout.home.view.customviews.PayPalExitLoadingSpinner;
import com.paypal.pyplcheckout.home.view.customviews.PayPalSnappingRecyclerView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalTopBannerView;
import com.paypal.pyplcheckout.home.view.customviews.availablebalance.AvailablePpBalanceView;
import com.paypal.pyplcheckout.model.PaymentProcessors;
import kotlin.C19394m;

/* renamed from: com.etsy.android.feedback.n */
public final /* synthetic */ class C6469n implements C2843a0 {

    /* renamed from: b */
    public final /* synthetic */ int f14365b;

    /* renamed from: c */
    public final /* synthetic */ Object f14366c;

    public /* synthetic */ C6469n(Object obj, int i) {
        this.f14365b = i;
        this.f14366c = obj;
    }

    public final void onChanged(Object obj) {
        switch (this.f14365b) {
            case 0:
                ((ItemReviewsFragment) this.f14366c).handleEvent((C12059p) obj);
                return;
            case 1:
                ApplyCouponBottomSheetFragment.m34925onViewCreated$lambda4((ApplyCouponBottomSheetFragment) this.f14366c, (C9260e.C9261a) obj);
                return;
            case 2:
                HomePagerFragment.m35003onViewCreated$lambda3((HomePagerFragment) this.f14366c, (C10070p) obj);
                return;
            case 3:
                HelpPhoneNumbersFragment.m35062onViewCreated$lambda1((HelpPhoneNumbersFragment) this.f14366c, (C19394m) obj);
                return;
            case 4:
                WebViewFragment.m35117addObserver$lambda5((WebViewFragment) this.f14366c, (Boolean) obj);
                return;
            case 5:
                PYPLAddressRecommendationFragment.m35186addressRecViewStateObserver$lambda0((PYPLAddressRecommendationFragment) this.f14366c, (AddressRecommendationViewState) obj);
                return;
            case 6:
                PayPalBillingAgreementsTextView.m35226initViewModelObservers$lambda0((PayPalBillingAgreementsTextView) this.f14366c, (Boolean) obj);
                return;
            case 7:
                AddCardView.m35276initViewModelObservers$lambda10((AddCardView) this.f14366c, (PaymentProcessors) obj);
                return;
            case 8:
                PayPalContinueButton.m35297initViewModelObservers$lambda3((PayPalContinueButton) this.f14366c, (ContingencyEventsModel) obj);
                return;
            case 9:
                PayPalExitLoadingSpinner.m35318initViewModelObservers$lambda1((PayPalExitLoadingSpinner) this.f14366c, (ContingencyEventsModel) obj);
                return;
            case 10:
                PayPalSnappingRecyclerView.m35354addCardPaymentProcessorObserver$lambda0((PayPalSnappingRecyclerView) this.f14366c, (PaymentProcessors) obj);
                return;
            case 11:
                PayPalTopBannerView.m35372initViewModelObservers$lambda1((PayPalTopBannerView) this.f14366c, (Boolean) obj);
                return;
            default:
                AvailablePpBalanceView.m35406initViewModelObservers$lambda3((AvailablePpBalanceView) this.f14366c, (Boolean) obj);
                return;
        }
    }
}
