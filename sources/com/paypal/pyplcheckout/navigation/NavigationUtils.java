package com.paypal.pyplcheckout.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addressbook.model.AddressBookViewListenerImpl;
import com.paypal.pyplcheckout.addressbook.model.NewShippingAddressReviewViewListenerImpl;
import com.paypal.pyplcheckout.addressbook.model.NewShippingAddressViewListenerImpl;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalAddressBookHeaderView;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalAddressBookInfoView;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressHeaderView;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressReviewView;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressSearchView;
import com.paypal.pyplcheckout.addressbook.view.interfaces.PayPalNewShippingAddressViewListener;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsInfoHeader;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsTermsBodyView;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsTermsFooterLink;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsTermsHeaderView;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsTextView;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsToggle;
import com.paypal.pyplcheckout.conversionrate.model.ConversionRateViewListenerImpl;
import com.paypal.pyplcheckout.conversionrate.view.customviews.PayPalConversionRateHeaderView;
import com.paypal.pyplcheckout.conversionrate.view.customviews.PayPalConversionRateInfoView;
import com.paypal.pyplcheckout.conversionrateprotection.model.RateProtectionViewListenerImpl;
import com.paypal.pyplcheckout.conversionrateprotection.view.customviews.PayPalRateProtectionHeaderView;
import com.paypal.pyplcheckout.conversionrateprotection.view.customviews.PayPalRateProtectionInfoView;
import com.paypal.pyplcheckout.crypto.model.CryptoConsentViewListenerImpl;
import com.paypal.pyplcheckout.crypto.view.customviews.PayPalCryptoConsentHeaderView;
import com.paypal.pyplcheckout.crypto.view.customviews.PayPalCryptoConsentInfoView;
import com.paypal.pyplcheckout.home.model.HomeViewListenerImpl;
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
import com.paypal.pyplcheckout.home.view.interfaces.PayPalCompoundHeaderViewListener;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.shippingmethods.model.ShippingMethodsViewListenerImpl;
import com.paypal.pyplcheckout.shippingmethods.view.customviews.PayPalShippingMethodsHeaderView;
import com.paypal.pyplcheckout.shippingmethods.view.customviews.PayPalShippingMethodsInfoView;
import com.paypal.pyplcheckout.threeds.model.PayPalThreeDSV1ViewListenerImpl;
import com.paypal.pyplcheckout.threeds.view.customviews.PayPalThreeDSV1HeaderView;
import com.paypal.pyplcheckout.threeds.view.customviews.PayPalThreeDSV1StepUpView;
import com.paypal.pyplcheckout.userprofile.model.UserProfileViewListenerImpl;
import com.paypal.pyplcheckout.userprofile.view.customviews.PayPalLegalAgreementsView;
import com.paypal.pyplcheckout.userprofile.view.customviews.PayPalLogoutView;
import com.paypal.pyplcheckout.userprofile.view.customviews.PayPalPoliciesView;
import com.paypal.pyplcheckout.userprofile.view.customviews.PayPalPrivacyView;
import com.paypal.pyplcheckout.userprofile.view.customviews.PayPalProfileHeaderView;
import com.paypal.pyplcheckout.userprofile.view.customviews.PayPalProfileInfoView;
import com.paypal.pyplcheckout.userprofile.view.customviews.PayPalTermsView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class NavigationUtils {
    public static final NavigationUtils INSTANCE = new NavigationUtils();
    private static final C19285c viewsId$delegate = C19350d.m32677b(NavigationUtils$viewsId$2.INSTANCE);

    private NavigationUtils() {
    }

    public static final List<ContentView> createContentViewNewInstance(List<? extends ContentView> list, Context context, Fragment fragment, UserProfileViewListenerImpl userProfileViewListenerImpl, AddressBookViewListenerImpl addressBookViewListenerImpl, ConversionRateViewListenerImpl conversionRateViewListenerImpl, RateProtectionViewListenerImpl rateProtectionViewListenerImpl, HomeViewListenerImpl homeViewListenerImpl, ShippingMethodsViewListenerImpl shippingMethodsViewListenerImpl, PayPalThreeDSV1ViewListenerImpl payPalThreeDSV1ViewListenerImpl, NewShippingAddressViewListenerImpl newShippingAddressViewListenerImpl, NewShippingAddressReviewViewListenerImpl newShippingAddressReviewViewListenerImpl, CryptoConsentViewListenerImpl cryptoConsentViewListenerImpl) {
        C19383o.m32797g(list, "originalContentViewList");
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(fragment, "fragment");
        ArrayList arrayList = new ArrayList();
        for (ContentView contentView : list) {
            if (INSTANCE.getViewsId().contains(contentView.getViewId())) {
                contentView.removeListeners();
            }
            arrayList.add(getContentViewById(contentView, context, fragment, userProfileViewListenerImpl, addressBookViewListenerImpl, conversionRateViewListenerImpl, rateProtectionViewListenerImpl, homeViewListenerImpl, shippingMethodsViewListenerImpl, payPalThreeDSV1ViewListenerImpl, newShippingAddressViewListenerImpl, newShippingAddressReviewViewListenerImpl, cryptoConsentViewListenerImpl));
        }
        return arrayList;
    }

    public static /* synthetic */ List createContentViewNewInstance$default(List list, Context context, Fragment fragment, UserProfileViewListenerImpl userProfileViewListenerImpl, AddressBookViewListenerImpl addressBookViewListenerImpl, ConversionRateViewListenerImpl conversionRateViewListenerImpl, RateProtectionViewListenerImpl rateProtectionViewListenerImpl, HomeViewListenerImpl homeViewListenerImpl, ShippingMethodsViewListenerImpl shippingMethodsViewListenerImpl, PayPalThreeDSV1ViewListenerImpl payPalThreeDSV1ViewListenerImpl, NewShippingAddressViewListenerImpl newShippingAddressViewListenerImpl, NewShippingAddressReviewViewListenerImpl newShippingAddressReviewViewListenerImpl, CryptoConsentViewListenerImpl cryptoConsentViewListenerImpl, int i, Object obj) {
        int i2 = i;
        return createContentViewNewInstance(list, context, fragment, (i2 & 8) != 0 ? null : userProfileViewListenerImpl, (i2 & 16) != 0 ? null : addressBookViewListenerImpl, (i2 & 32) != 0 ? null : conversionRateViewListenerImpl, (i2 & 64) != 0 ? null : rateProtectionViewListenerImpl, (i2 & 128) != 0 ? null : homeViewListenerImpl, (i2 & 256) != 0 ? null : shippingMethodsViewListenerImpl, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? null : payPalThreeDSV1ViewListenerImpl, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? null : newShippingAddressViewListenerImpl, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? null : newShippingAddressReviewViewListenerImpl, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : cryptoConsentViewListenerImpl);
    }

    @SuppressLint({"NewApi"})
    public static final ContentView getContentViewById(ContentView contentView, Context context, Fragment fragment, UserProfileViewListenerImpl userProfileViewListenerImpl, AddressBookViewListenerImpl addressBookViewListenerImpl, ConversionRateViewListenerImpl conversionRateViewListenerImpl, RateProtectionViewListenerImpl rateProtectionViewListenerImpl, HomeViewListenerImpl homeViewListenerImpl, ShippingMethodsViewListenerImpl shippingMethodsViewListenerImpl, PayPalThreeDSV1ViewListenerImpl payPalThreeDSV1ViewListenerImpl, NewShippingAddressViewListenerImpl newShippingAddressViewListenerImpl, NewShippingAddressReviewViewListenerImpl newShippingAddressReviewViewListenerImpl, CryptoConsentViewListenerImpl cryptoConsentViewListenerImpl) {
        ContentView contentView2 = contentView;
        Context context2 = context;
        Fragment fragment2 = fragment;
        C19383o.m32797g(contentView, "contentView");
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(fragment, "fragment");
        String viewId = contentView.getViewId();
        if (C19383o.m32792b(viewId, PayPalProfileHeaderView.TAG)) {
            return new PayPalProfileHeaderView(context, (AttributeSet) null, 0, fragment, userProfileViewListenerImpl, 6, (DefaultConstructorMarker) null);
        }
        if (C19383o.m32792b(viewId, PayPalProfileInfoView.TAG)) {
            return new PayPalProfileInfoView(context, (AttributeSet) null, 0, fragment, 6, (DefaultConstructorMarker) null);
        }
        if (C19383o.m32792b(viewId, PayPalLegalAgreementsView.TAG)) {
            return new PayPalLegalAgreementsView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        }
        if (C19383o.m32792b(viewId, PayPalPoliciesView.TAG)) {
            return new PayPalPoliciesView(context, (AttributeSet) null, 0, fragment, userProfileViewListenerImpl, 6, (DefaultConstructorMarker) null);
        }
        if (C19383o.m32792b(viewId, PayPalTermsView.TAG)) {
            return new PayPalTermsView(context, (AttributeSet) null, 0, fragment, userProfileViewListenerImpl, 6, (DefaultConstructorMarker) null);
        }
        if (C19383o.m32792b(viewId, PayPalPrivacyView.TAG)) {
            return new PayPalPrivacyView(context, (AttributeSet) null, 0, fragment, userProfileViewListenerImpl, 6, (DefaultConstructorMarker) null);
        }
        if (C19383o.m32792b(viewId, PayPalLogoutView.TAG)) {
            return new PayPalLogoutView(context, (AttributeSet) null, 0, fragment, userProfileViewListenerImpl, 6, (DefaultConstructorMarker) null);
        }
        if (C19383o.m32792b(viewId, PayPalTopBannerView.TAG)) {
            return new PayPalTopBannerView(context, (AttributeSet) null, 0, fragment, (PayPalCompoundHeaderViewListener) null, 22, (DefaultConstructorMarker) null);
        }
        if (C19383o.m32792b(viewId, PayPalShippingMethodsHeaderView.TAG)) {
            return new PayPalShippingMethodsHeaderView(context, (AttributeSet) null, 0, fragment, shippingMethodsViewListenerImpl, 6, (DefaultConstructorMarker) null);
        }
        if (C19383o.m32792b(viewId, PayPalShippingMethodsInfoView.TAG)) {
            return new PayPalShippingMethodsInfoView(context, (AttributeSet) null, 0, fragment, shippingMethodsViewListenerImpl, 6, (DefaultConstructorMarker) null);
        }
        if (C19383o.m32792b(viewId, PayPalAddressBookHeaderView.Companion.getTAG())) {
            return new PayPalAddressBookHeaderView(context, (AttributeSet) null, 0, fragment, addressBookViewListenerImpl, 6, (DefaultConstructorMarker) null);
        }
        if (C19383o.m32792b(viewId, PayPalAddressBookInfoView.Companion.getTAG())) {
            return new PayPalAddressBookInfoView(context, (AttributeSet) null, 0, fragment, addressBookViewListenerImpl, 6, (DefaultConstructorMarker) null);
        }
        if (C19383o.m32792b(viewId, PayPalNewShippingAddressHeaderView.Companion.getTAG())) {
            return new PayPalNewShippingAddressHeaderView(context, (AttributeSet) null, 0, fragment, newShippingAddressViewListenerImpl, 6, (DefaultConstructorMarker) null);
        }
        if (C19383o.m32792b(viewId, PayPalNewShippingAddressSearchView.Companion.getTAG())) {
            return new PayPalNewShippingAddressSearchView(context, (AttributeSet) null, 0, fragment, (PayPalNewShippingAddressViewListener) null, 22, (DefaultConstructorMarker) null);
        }
        if (C19383o.m32792b(viewId, PayPalNewShippingAddressReviewView.Companion.getTAG())) {
            return new PayPalNewShippingAddressReviewView(context, (AttributeSet) null, 0, fragment, 6, (DefaultConstructorMarker) null);
        }
        if (C19383o.m32792b(viewId, PayPalRateProtectionHeaderView.TAG)) {
            return new PayPalRateProtectionHeaderView(context, (AttributeSet) null, 0, fragment, rateProtectionViewListenerImpl, 6, (DefaultConstructorMarker) null);
        }
        if (C19383o.m32792b(viewId, PayPalRateProtectionInfoView.TAG)) {
            return new PayPalRateProtectionInfoView(context, (AttributeSet) null, 0, fragment, rateProtectionViewListenerImpl, 6, (DefaultConstructorMarker) null);
        }
        if (C19383o.m32792b(viewId, PayPalConversionRateHeaderView.Companion.getTAG())) {
            return new PayPalConversionRateHeaderView(context, (AttributeSet) null, 0, fragment, conversionRateViewListenerImpl, 6, (DefaultConstructorMarker) null);
        }
        if (C19383o.m32792b(viewId, PayPalConversionRateInfoView.Companion.getTAG())) {
            return new PayPalConversionRateInfoView(context, (AttributeSet) null, 0, fragment, conversionRateViewListenerImpl, 6, (DefaultConstructorMarker) null);
        }
        if (C19383o.m32792b(viewId, PayPalEnterLoadingSpinner.TAG)) {
            return new PayPalEnterLoadingSpinner(context, (AttributeSet) null, fragment, 0, 10, (DefaultConstructorMarker) null);
        }
        if (C19383o.m32792b(viewId, PayPalExitLoadingSpinner.TAG)) {
            return new PayPalExitLoadingSpinner(context, (AttributeSet) null, fragment, 0, 10, (DefaultConstructorMarker) null);
        }
        if (C19383o.m32792b(viewId, PayPalLogoutSpinner.TAG)) {
            return new PayPalLogoutSpinner(context, (AttributeSet) null, fragment, 0, 10, (DefaultConstructorMarker) null);
        }
        if (C19383o.m32792b(viewId, PayPalSnappingRecyclerView.Companion.getTAG())) {
            return new PayPalSnappingRecyclerView(context, fragment, homeViewListenerImpl);
        }
        HomeViewListenerImpl homeViewListenerImpl2 = homeViewListenerImpl;
        if (C19383o.m32792b(viewId, PayPalExpandedCartDetails.Companion.getTAG())) {
            return new PayPalExpandedCartDetails(context, (AttributeSet) null, 0, fragment, homeViewListenerImpl, 6, (DefaultConstructorMarker) null);
        }
        if (C19383o.m32792b(viewId, PayPalCompoundHeaderView.TAG)) {
            return new PayPalCompoundHeaderView(context, (AttributeSet) null, 0, fragment, homeViewListenerImpl, 6, (DefaultConstructorMarker) null);
        }
        if (C19383o.m32792b(viewId, AvailablePpBalanceView.TAG)) {
            return new AvailablePpBalanceView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        }
        if (C19383o.m32792b(viewId, PayPalCurrencyConversionView.TAG)) {
            return new PayPalCurrencyConversionView(context, (AttributeSet) null, 0, fragment, homeViewListenerImpl, 6, (DefaultConstructorMarker) null);
        }
        if (C19383o.m32792b(viewId, PayPalPoliciesAndRightsLinkView.TAG)) {
            return new PayPalPoliciesAndRightsLinkView(context, (AttributeSet) null, 0, fragment, homeViewListenerImpl, 6, (DefaultConstructorMarker) null);
        }
        if (!C19383o.m32792b(viewId, PayPalContinueButton.TAG)) {
            return C19383o.m32792b(viewId, ShippingView.TAG) ? new ShippingView(context, (AttributeSet) null, 0, fragment, homeViewListenerImpl, 6, (DefaultConstructorMarker) null) : C19383o.m32792b(viewId, PayPalThreeDSV1StepUpView.TAG) ? new PayPalThreeDSV1StepUpView(context, (AttributeSet) null, 0, fragment, payPalThreeDSV1ViewListenerImpl, 6, (DefaultConstructorMarker) null) : C19383o.m32792b(viewId, PayPalThreeDSV1HeaderView.TAG) ? new PayPalThreeDSV1HeaderView(context, (AttributeSet) null, 0, fragment, payPalThreeDSV1ViewListenerImpl, 6, (DefaultConstructorMarker) null) : C19383o.m32792b(viewId, AddCardView.TAG) ? new AddCardView(context, (AttributeSet) null, 0, fragment, 6, (DefaultConstructorMarker) null) : C19383o.m32792b(viewId, PayPalBillingAgreementsTextView.Companion.getTAG()) ? new PayPalBillingAgreementsTextView(context, (AttributeSet) null, 2, (DefaultConstructorMarker) null) : C19383o.m32792b(viewId, PayPalBillingAgreementsTermsHeaderView.Companion.getTAG()) ? new PayPalBillingAgreementsTermsHeaderView(context, (AttributeSet) null, fragment, 2, (DefaultConstructorMarker) null) : C19383o.m32792b(viewId, PayPalBillingAgreementsTermsBodyView.Companion.getTAG()) ? new PayPalBillingAgreementsTermsBodyView(context, (AttributeSet) null, 2, (DefaultConstructorMarker) null) : C19383o.m32792b(viewId, PayPalBillingAgreementsTermsFooterLink.Companion.getTAG()) ? new PayPalBillingAgreementsTermsFooterLink(context, (AttributeSet) null, 2, (DefaultConstructorMarker) null) : C19383o.m32792b(viewId, PayPalBillingAgreementsInfoHeader.Companion.getTAG()) ? new PayPalBillingAgreementsInfoHeader(context, (AttributeSet) null, 2, (DefaultConstructorMarker) null) : C19383o.m32792b(viewId, PayPalBillingAgreementsToggle.Companion.getTAG()) ? new PayPalBillingAgreementsToggle(context, (AttributeSet) null, 2, (DefaultConstructorMarker) null) : C19383o.m32792b(viewId, PayPalCryptoConsentHeaderView.TAG) ? new PayPalCryptoConsentHeaderView(context, (AttributeSet) null, 0, fragment, 6, (DefaultConstructorMarker) null) : C19383o.m32792b(viewId, PayPalCryptoConsentInfoView.TAG) ? new PayPalCryptoConsentInfoView(context, (AttributeSet) null, 0, fragment, cryptoConsentViewListenerImpl, 6, (DefaultConstructorMarker) null) : contentView2;
        }
        return new PayPalContinueButton(context, (AttributeSet) null, 0, context.getResources().getString(C17165R.string.paypal_checkout_complete_purchase_order), fragment, ((PayPalContinueButton) contentView2).getButtonShape(), homeViewListenerImpl, 6, (DefaultConstructorMarker) null);
    }

    private final HashSet<String> getViewsId() {
        return (HashSet) viewsId$delegate.getValue();
    }
}
