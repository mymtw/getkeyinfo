package com.paypal.pyplcheckout.navigation;

import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalAddressBookHeaderView;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalAddressBookInfoView;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressReviewView;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressSearchView;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsInfoHeader;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsTermsBodyView;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsTermsFooterLink;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsTermsHeaderView;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsTextView;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsToggle;
import com.paypal.pyplcheckout.conversionrate.view.customviews.PayPalConversionRateHeaderView;
import com.paypal.pyplcheckout.conversionrate.view.customviews.PayPalConversionRateInfoView;
import com.paypal.pyplcheckout.conversionrateprotection.view.customviews.PayPalRateProtectionHeaderView;
import com.paypal.pyplcheckout.conversionrateprotection.view.customviews.PayPalRateProtectionInfoView;
import com.paypal.pyplcheckout.crypto.view.customviews.PayPalCryptoConsentHeaderView;
import com.paypal.pyplcheckout.crypto.view.customviews.PayPalCryptoConsentInfoView;
import com.paypal.pyplcheckout.home.view.customviews.AddCardView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalCompoundHeaderView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalContinueButton;
import com.paypal.pyplcheckout.home.view.customviews.PayPalCurrencyConversionView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalEnterLoadingSpinner;
import com.paypal.pyplcheckout.home.view.customviews.PayPalExitLoadingSpinner;
import com.paypal.pyplcheckout.home.view.customviews.PayPalExpandedCartDetails;
import com.paypal.pyplcheckout.home.view.customviews.PayPalLogoutSpinner;
import com.paypal.pyplcheckout.home.view.customviews.PayPalPoliciesAndRightsLinkView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalSnappingRecyclerView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalTopBannerView;
import com.paypal.pyplcheckout.home.view.customviews.ShippingView;
import com.paypal.pyplcheckout.home.view.customviews.availablebalance.AvailablePpBalanceView;
import com.paypal.pyplcheckout.shippingmethods.view.customviews.PayPalShippingMethodsHeaderView;
import com.paypal.pyplcheckout.shippingmethods.view.customviews.PayPalShippingMethodsInfoView;
import com.paypal.pyplcheckout.threeds.view.customviews.PayPalThreeDSV1HeaderView;
import com.paypal.pyplcheckout.threeds.view.customviews.PayPalThreeDSV1StepUpView;
import com.paypal.pyplcheckout.userprofile.view.customviews.PayPalLegalAgreementsView;
import com.paypal.pyplcheckout.userprofile.view.customviews.PayPalLogoutView;
import com.paypal.pyplcheckout.userprofile.view.customviews.PayPalPoliciesView;
import com.paypal.pyplcheckout.userprofile.view.customviews.PayPalPrivacyView;
import com.paypal.pyplcheckout.userprofile.view.customviews.PayPalProfileHeaderView;
import com.paypal.pyplcheckout.userprofile.view.customviews.PayPalProfileInfoView;
import com.paypal.pyplcheckout.userprofile.view.customviews.PayPalTermsView;
import java.util.HashSet;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class NavigationUtils$viewsId$2 extends Lambda implements C19846a<HashSet<String>> {
    public static final NavigationUtils$viewsId$2 INSTANCE = new NavigationUtils$viewsId$2();

    public NavigationUtils$viewsId$2() {
        super(0);
    }

    public final HashSet<String> invoke() {
        String str = PayPalProfileHeaderView.TAG;
        String str2 = PayPalTopBannerView.TAG;
        return C19382n.m32754j0(PayPalEnterLoadingSpinner.TAG, str, PayPalProfileInfoView.TAG, PayPalLegalAgreementsView.TAG, PayPalPoliciesView.TAG, PayPalTermsView.TAG, PayPalPrivacyView.TAG, PayPalLogoutView.TAG, PayPalLogoutSpinner.TAG, PayPalShippingMethodsHeaderView.TAG, PayPalShippingMethodsInfoView.TAG, PayPalAddressBookHeaderView.Companion.getTAG(), PayPalAddressBookInfoView.Companion.getTAG(), PayPalRateProtectionHeaderView.TAG, PayPalRateProtectionInfoView.TAG, PayPalConversionRateHeaderView.Companion.getTAG(), PayPalConversionRateInfoView.Companion.getTAG(), PayPalSnappingRecyclerView.Companion.getTAG(), PayPalExpandedCartDetails.Companion.getTAG(), PayPalCompoundHeaderView.TAG, AvailablePpBalanceView.TAG, PayPalCurrencyConversionView.TAG, PayPalPoliciesAndRightsLinkView.TAG, PayPalContinueButton.TAG, ShippingView.TAG, PayPalExitLoadingSpinner.TAG, str, PayPalThreeDSV1StepUpView.TAG, PayPalThreeDSV1HeaderView.TAG, PayPalNewShippingAddressSearchView.Companion.getTAG(), PayPalNewShippingAddressReviewView.Companion.getTAG(), AddCardView.TAG, PayPalBillingAgreementsTextView.Companion.getTAG(), PayPalBillingAgreementsTermsFooterLink.Companion.getTAG(), PayPalBillingAgreementsTermsBodyView.Companion.getTAG(), PayPalBillingAgreementsTermsHeaderView.Companion.getTAG(), str2, PayPalBillingAgreementsInfoHeader.Companion.getTAG(), PayPalBillingAgreementsToggle.Companion.getTAG(), str2, PayPalCryptoConsentHeaderView.TAG, PayPalCryptoConsentInfoView.TAG);
    }
}
