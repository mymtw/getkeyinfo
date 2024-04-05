package com.paypal.pyplcheckout.home.model;

import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addressbook.model.AddressBookViewListenerImpl;
import com.paypal.pyplcheckout.addressbook.model.NewShippingAddressReviewViewListenerImpl;
import com.paypal.pyplcheckout.addressbook.model.NewShippingAddressViewListenerImpl;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsInfoHeader;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsTextView;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsToggle;
import com.paypal.pyplcheckout.conversionrate.model.ConversionRateViewListenerImpl;
import com.paypal.pyplcheckout.conversionrateprotection.model.RateProtectionViewListenerImpl;
import com.paypal.pyplcheckout.crypto.model.CryptoConsentViewListenerImpl;
import com.paypal.pyplcheckout.home.view.customviews.ActionButtonShape;
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
import com.paypal.pyplcheckout.navigation.ContentPage;
import com.paypal.pyplcheckout.navigation.NavigationUtils;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.shippingmethods.model.ShippingMethodsViewListenerImpl;
import com.paypal.pyplcheckout.threeds.model.PayPalThreeDSV1ViewListenerImpl;
import com.paypal.pyplcheckout.userprofile.model.UserProfileViewListenerImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class HomeViewContentPageConfig extends ContentPage {
    public HomeViewContentPageConfig(Context context, Fragment fragment, ContentPage contentPage, HomeViewListenerImpl homeViewListenerImpl) {
        Context context2 = context;
        Fragment fragment2 = fragment;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        C19383o.m32797g(fragment2, "fragment");
        if (contentPage == null) {
            this.headerContentViewsList = new ArrayList();
            this.bodyContentViewsList = new ArrayList();
            this.footerContentViewsList = new ArrayList();
            ArrayList arrayList = new ArrayList();
            this.topBannerContentViewList = arrayList;
            Context context3 = context;
            Fragment fragment3 = fragment;
            arrayList.add(new PayPalTopBannerView(context3, (AttributeSet) null, 0, fragment3, (PayPalCompoundHeaderViewListener) null, 22, (DefaultConstructorMarker) null));
            this.headerContentViewsList.add(new PayPalCompoundHeaderView(context3, (AttributeSet) null, 0, fragment3, homeViewListenerImpl, 6, (DefaultConstructorMarker) null));
            Fragment fragment4 = fragment;
            this.bodyContentViewsList.add(new PayPalEnterLoadingSpinner(context3, (AttributeSet) null, fragment4, 0, 10, (DefaultConstructorMarker) null));
            this.bodyContentViewsList.add(new PayPalExitLoadingSpinner(context3, (AttributeSet) null, fragment4, 0, 10, (DefaultConstructorMarker) null));
            this.bodyContentViewsList.add(new PayPalLogoutSpinner(context3, (AttributeSet) null, fragment4, 0, 10, (DefaultConstructorMarker) null));
            this.bodyContentViewsList.add(new PayPalExpandedCartDetails(context3, (AttributeSet) null, 0, fragment, homeViewListenerImpl, 6, (DefaultConstructorMarker) null));
            this.bodyContentViewsList.add(new PayPalBillingAgreementsInfoHeader(context2, (AttributeSet) null, 2, (DefaultConstructorMarker) null));
            this.bodyContentViewsList.add(new PayPalBillingAgreementsToggle(context2, (AttributeSet) null, 2, (DefaultConstructorMarker) null));
            this.bodyContentViewsList.add(new AvailablePpBalanceView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
            this.bodyContentViewsList.add(new PayPalSnappingRecyclerView(context2, fragment2, homeViewListenerImpl));
            Context context4 = context;
            Fragment fragment5 = fragment;
            HomeViewListenerImpl homeViewListenerImpl2 = homeViewListenerImpl;
            this.bodyContentViewsList.add(new PayPalCurrencyConversionView(context4, (AttributeSet) null, 0, fragment5, homeViewListenerImpl2, 6, (DefaultConstructorMarker) null));
            this.bodyContentViewsList.add(new ShippingView(context4, (AttributeSet) null, 0, fragment5, homeViewListenerImpl2, 6, (DefaultConstructorMarker) null));
            this.bodyContentViewsList.add(new PayPalBillingAgreementsTextView(context2, (AttributeSet) null, 2, (DefaultConstructorMarker) null));
            this.bodyContentViewsList.add(new AddCardView(context, (AttributeSet) null, 0, fragment5, 6, (DefaultConstructorMarker) null));
            Context context5 = context;
            this.footerContentViewsList.add(new PayPalContinueButton(context5, (AttributeSet) null, 0, context.getResources().getString(C17165R.string.paypal_checkout_complete_purchase_order), fragment, ActionButtonShape.MATERIAL_DESIGN, homeViewListenerImpl, 6, (DefaultConstructorMarker) null));
            this.footerContentViewsList.add(new PayPalPoliciesAndRightsLinkView(context5, (AttributeSet) null, 0, fragment, homeViewListenerImpl, 6, (DefaultConstructorMarker) null));
            return;
        }
        HomeViewListenerImpl homeViewListenerImpl3 = homeViewListenerImpl;
        List<ContentView> topBannerContentViewsList = contentPage.getTopBannerContentViewsList();
        C19383o.m32796f(topBannerContentViewsList, "contentPage.topBannerContentViewsList");
        Fragment fragment6 = fragment;
        HomeViewListenerImpl homeViewListenerImpl4 = homeViewListenerImpl;
        this.topBannerContentViewList = NavigationUtils.createContentViewNewInstance$default(topBannerContentViewsList, context, fragment6, (UserProfileViewListenerImpl) null, (AddressBookViewListenerImpl) null, (ConversionRateViewListenerImpl) null, (RateProtectionViewListenerImpl) null, homeViewListenerImpl4, (ShippingMethodsViewListenerImpl) null, (PayPalThreeDSV1ViewListenerImpl) null, (NewShippingAddressViewListenerImpl) null, (NewShippingAddressReviewViewListenerImpl) null, (CryptoConsentViewListenerImpl) null, 8056, (Object) null);
        List<ContentView> headerContentViewsList = contentPage.getHeaderContentViewsList();
        C19383o.m32796f(headerContentViewsList, "contentPage.headerContentViewsList");
        this.headerContentViewsList = NavigationUtils.createContentViewNewInstance$default(headerContentViewsList, context, fragment6, (UserProfileViewListenerImpl) null, (AddressBookViewListenerImpl) null, (ConversionRateViewListenerImpl) null, (RateProtectionViewListenerImpl) null, homeViewListenerImpl4, (ShippingMethodsViewListenerImpl) null, (PayPalThreeDSV1ViewListenerImpl) null, (NewShippingAddressViewListenerImpl) null, (NewShippingAddressReviewViewListenerImpl) null, (CryptoConsentViewListenerImpl) null, 8056, (Object) null);
        List<ContentView> bodyContentViewsList = contentPage.getBodyContentViewsList();
        C19383o.m32796f(bodyContentViewsList, "contentPage.bodyContentViewsList");
        this.bodyContentViewsList = NavigationUtils.createContentViewNewInstance$default(bodyContentViewsList, context, fragment6, (UserProfileViewListenerImpl) null, (AddressBookViewListenerImpl) null, (ConversionRateViewListenerImpl) null, (RateProtectionViewListenerImpl) null, homeViewListenerImpl4, (ShippingMethodsViewListenerImpl) null, (PayPalThreeDSV1ViewListenerImpl) null, (NewShippingAddressViewListenerImpl) null, (NewShippingAddressReviewViewListenerImpl) null, (CryptoConsentViewListenerImpl) null, 8056, (Object) null);
        List<ContentView> footerContentViewsList = contentPage.getFooterContentViewsList();
        C19383o.m32796f(footerContentViewsList, "contentPage.footerContentViewsList");
        this.footerContentViewsList = NavigationUtils.createContentViewNewInstance$default(footerContentViewsList, context, fragment6, (UserProfileViewListenerImpl) null, (AddressBookViewListenerImpl) null, (ConversionRateViewListenerImpl) null, (RateProtectionViewListenerImpl) null, homeViewListenerImpl4, (ShippingMethodsViewListenerImpl) null, (PayPalThreeDSV1ViewListenerImpl) null, (NewShippingAddressViewListenerImpl) null, (NewShippingAddressReviewViewListenerImpl) null, (CryptoConsentViewListenerImpl) null, 8056, (Object) null);
    }

    public final void clearHomeScreenViews() {
        List<ContentView> topBannerContentViewsList = getTopBannerContentViewsList();
        C19383o.m32796f(topBannerContentViewsList, "topBannerContentViewsList");
        for (ContentView contentViewVisibility : topBannerContentViewsList) {
            contentViewVisibility.setContentViewVisibility(8);
        }
        List<ContentView> list = this.headerContentViewsList;
        C19383o.m32796f(list, "headerContentViewsList");
        for (ContentView contentViewVisibility2 : list) {
            contentViewVisibility2.setContentViewVisibility(8);
        }
        List<ContentView> list2 = this.bodyContentViewsList;
        C19383o.m32796f(list2, "bodyContentViewsList");
        for (ContentView contentViewVisibility3 : list2) {
            contentViewVisibility3.setContentViewVisibility(8);
        }
        List<ContentView> list3 = this.footerContentViewsList;
        C19383o.m32796f(list3, "footerContentViewsList");
        for (ContentView contentViewVisibility4 : list3) {
            contentViewVisibility4.setContentViewVisibility(8);
        }
    }

    public final void removeContentViewListeners() {
        List<ContentView> list = this.headerContentViewsList;
        C19383o.m32796f(list, "headerContentViewsList");
        for (ContentView removeListeners : list) {
            removeListeners.removeListeners();
        }
        List<ContentView> list2 = this.bodyContentViewsList;
        C19383o.m32796f(list2, "bodyContentViewsList");
        for (ContentView removeListeners2 : list2) {
            removeListeners2.removeListeners();
        }
        List<ContentView> list3 = this.footerContentViewsList;
        C19383o.m32796f(list3, "footerContentViewsList");
        for (ContentView removeListeners3 : list3) {
            removeListeners3.removeListeners();
        }
    }
}
