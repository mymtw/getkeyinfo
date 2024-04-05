package com.paypal.pyplcheckout.userprofile.model;

import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.addressbook.model.AddressBookViewListenerImpl;
import com.paypal.pyplcheckout.addressbook.model.NewShippingAddressReviewViewListenerImpl;
import com.paypal.pyplcheckout.addressbook.model.NewShippingAddressViewListenerImpl;
import com.paypal.pyplcheckout.conversionrate.model.ConversionRateViewListenerImpl;
import com.paypal.pyplcheckout.conversionrateprotection.model.RateProtectionViewListenerImpl;
import com.paypal.pyplcheckout.crypto.model.CryptoConsentViewListenerImpl;
import com.paypal.pyplcheckout.home.model.HomeViewListenerImpl;
import com.paypal.pyplcheckout.navigation.ContentPage;
import com.paypal.pyplcheckout.navigation.NavigationUtils;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.shippingmethods.model.ShippingMethodsViewListenerImpl;
import com.paypal.pyplcheckout.threeds.model.PayPalThreeDSV1ViewListenerImpl;
import com.paypal.pyplcheckout.userprofile.view.customviews.PayPalLegalAgreementsView;
import com.paypal.pyplcheckout.userprofile.view.customviews.PayPalLogoutView;
import com.paypal.pyplcheckout.userprofile.view.customviews.PayPalPoliciesView;
import com.paypal.pyplcheckout.userprofile.view.customviews.PayPalPrivacyView;
import com.paypal.pyplcheckout.userprofile.view.customviews.PayPalProfileHeaderView;
import com.paypal.pyplcheckout.userprofile.view.customviews.PayPalProfileInfoView;
import com.paypal.pyplcheckout.userprofile.view.customviews.PayPalTermsView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class UserProfileViewContentPageConfig extends ContentPage {
    public UserProfileViewContentPageConfig(Context context, Fragment fragment, UserProfileViewListenerImpl userProfileViewListenerImpl, ContentPage contentPage) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(fragment, "fragment");
        if (contentPage == null) {
            this.headerContentViewsList = new ArrayList();
            this.bodyContentViewsList = new ArrayList();
            this.footerContentViewsList = new ArrayList();
            Context context2 = context;
            Fragment fragment2 = fragment;
            this.headerContentViewsList.add(new PayPalProfileHeaderView(context2, (AttributeSet) null, 0, fragment2, userProfileViewListenerImpl, 6, (DefaultConstructorMarker) null));
            this.bodyContentViewsList.add(new PayPalProfileInfoView(context2, (AttributeSet) null, 0, fragment2, 6, (DefaultConstructorMarker) null));
            this.bodyContentViewsList.add(new PayPalLegalAgreementsView(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
            Fragment fragment3 = fragment;
            UserProfileViewListenerImpl userProfileViewListenerImpl2 = userProfileViewListenerImpl;
            this.bodyContentViewsList.add(new PayPalPoliciesView(context2, (AttributeSet) null, 0, fragment3, userProfileViewListenerImpl2, 6, (DefaultConstructorMarker) null));
            this.bodyContentViewsList.add(new PayPalTermsView(context2, (AttributeSet) null, 0, fragment3, userProfileViewListenerImpl2, 6, (DefaultConstructorMarker) null));
            this.bodyContentViewsList.add(new PayPalPrivacyView(context2, (AttributeSet) null, 0, fragment3, userProfileViewListenerImpl2, 6, (DefaultConstructorMarker) null));
            this.footerContentViewsList.add(new PayPalLogoutView(context2, (AttributeSet) null, 0, fragment3, userProfileViewListenerImpl2, 6, (DefaultConstructorMarker) null));
            return;
        }
        List<ContentView> headerContentViewsList = contentPage.getHeaderContentViewsList();
        C19383o.m32796f(headerContentViewsList, "contentPage.headerContentViewsList");
        Context context3 = context;
        Fragment fragment4 = fragment;
        UserProfileViewListenerImpl userProfileViewListenerImpl3 = userProfileViewListenerImpl;
        this.headerContentViewsList = NavigationUtils.createContentViewNewInstance$default(headerContentViewsList, context3, fragment4, userProfileViewListenerImpl3, (AddressBookViewListenerImpl) null, (ConversionRateViewListenerImpl) null, (RateProtectionViewListenerImpl) null, (HomeViewListenerImpl) null, (ShippingMethodsViewListenerImpl) null, (PayPalThreeDSV1ViewListenerImpl) null, (NewShippingAddressViewListenerImpl) null, (NewShippingAddressReviewViewListenerImpl) null, (CryptoConsentViewListenerImpl) null, 8176, (Object) null);
        List<ContentView> bodyContentViewsList = contentPage.getBodyContentViewsList();
        C19383o.m32796f(bodyContentViewsList, "contentPage.bodyContentViewsList");
        this.bodyContentViewsList = NavigationUtils.createContentViewNewInstance$default(bodyContentViewsList, context3, fragment4, userProfileViewListenerImpl3, (AddressBookViewListenerImpl) null, (ConversionRateViewListenerImpl) null, (RateProtectionViewListenerImpl) null, (HomeViewListenerImpl) null, (ShippingMethodsViewListenerImpl) null, (PayPalThreeDSV1ViewListenerImpl) null, (NewShippingAddressViewListenerImpl) null, (NewShippingAddressReviewViewListenerImpl) null, (CryptoConsentViewListenerImpl) null, 8176, (Object) null);
        List<ContentView> footerContentViewsList = contentPage.getFooterContentViewsList();
        C19383o.m32796f(footerContentViewsList, "contentPage.footerContentViewsList");
        this.footerContentViewsList = NavigationUtils.createContentViewNewInstance$default(footerContentViewsList, context3, fragment4, userProfileViewListenerImpl3, (AddressBookViewListenerImpl) null, (ConversionRateViewListenerImpl) null, (RateProtectionViewListenerImpl) null, (HomeViewListenerImpl) null, (ShippingMethodsViewListenerImpl) null, (PayPalThreeDSV1ViewListenerImpl) null, (NewShippingAddressViewListenerImpl) null, (NewShippingAddressReviewViewListenerImpl) null, (CryptoConsentViewListenerImpl) null, 8176, (Object) null);
    }
}
