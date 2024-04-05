package com.paypal.pyplcheckout.billingagreements.view.config;

import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.addressbook.model.AddressBookViewListenerImpl;
import com.paypal.pyplcheckout.addressbook.model.NewShippingAddressReviewViewListenerImpl;
import com.paypal.pyplcheckout.addressbook.model.NewShippingAddressViewListenerImpl;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsTermsBodyView;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsTermsFooterLink;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsTermsHeaderView;
import com.paypal.pyplcheckout.conversionrate.model.ConversionRateViewListenerImpl;
import com.paypal.pyplcheckout.conversionrateprotection.model.RateProtectionViewListenerImpl;
import com.paypal.pyplcheckout.crypto.model.CryptoConsentViewListenerImpl;
import com.paypal.pyplcheckout.home.model.HomeViewListenerImpl;
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

public final class BillingAgreementsTermsPageConfig extends ContentPage {
    public BillingAgreementsTermsPageConfig(Context context, Fragment fragment, ContentPage contentPage) {
        Context context2 = context;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        C19383o.m32797g(fragment, "fragment");
        if (contentPage == null) {
            this.bodyContentViewsList = new ArrayList();
            this.headerContentViewsList = new ArrayList();
            this.footerContentViewsList = new ArrayList();
            this.headerContentViewsList.add(new PayPalBillingAgreementsTermsHeaderView(context, (AttributeSet) null, fragment, 2, (DefaultConstructorMarker) null));
            this.bodyContentViewsList.add(new PayPalBillingAgreementsTermsBodyView(context2, (AttributeSet) null, 2, (DefaultConstructorMarker) null));
            this.footerContentViewsList.add(new PayPalBillingAgreementsTermsFooterLink(context2, (AttributeSet) null, 2, (DefaultConstructorMarker) null));
            return;
        }
        List<ContentView> headerContentViewsList = contentPage.getHeaderContentViewsList();
        C19383o.m32796f(headerContentViewsList, "contentPage.headerContentViewsList");
        Fragment fragment2 = fragment;
        this.headerContentViewsList = NavigationUtils.createContentViewNewInstance$default(headerContentViewsList, context, fragment2, (UserProfileViewListenerImpl) null, (AddressBookViewListenerImpl) null, (ConversionRateViewListenerImpl) null, (RateProtectionViewListenerImpl) null, (HomeViewListenerImpl) null, (ShippingMethodsViewListenerImpl) null, (PayPalThreeDSV1ViewListenerImpl) null, (NewShippingAddressViewListenerImpl) null, (NewShippingAddressReviewViewListenerImpl) null, (CryptoConsentViewListenerImpl) null, 8184, (Object) null);
        List<ContentView> bodyContentViewsList = contentPage.getBodyContentViewsList();
        C19383o.m32796f(bodyContentViewsList, "contentPage.bodyContentViewsList");
        this.bodyContentViewsList = NavigationUtils.createContentViewNewInstance$default(bodyContentViewsList, context, fragment2, (UserProfileViewListenerImpl) null, (AddressBookViewListenerImpl) null, (ConversionRateViewListenerImpl) null, (RateProtectionViewListenerImpl) null, (HomeViewListenerImpl) null, (ShippingMethodsViewListenerImpl) null, (PayPalThreeDSV1ViewListenerImpl) null, (NewShippingAddressViewListenerImpl) null, (NewShippingAddressReviewViewListenerImpl) null, (CryptoConsentViewListenerImpl) null, 8184, (Object) null);
        List<ContentView> footerContentViewsList = contentPage.getFooterContentViewsList();
        C19383o.m32796f(footerContentViewsList, "contentPage.footerContentViewsList");
        this.footerContentViewsList = NavigationUtils.createContentViewNewInstance$default(footerContentViewsList, context, fragment2, (UserProfileViewListenerImpl) null, (AddressBookViewListenerImpl) null, (ConversionRateViewListenerImpl) null, (RateProtectionViewListenerImpl) null, (HomeViewListenerImpl) null, (ShippingMethodsViewListenerImpl) null, (PayPalThreeDSV1ViewListenerImpl) null, (NewShippingAddressViewListenerImpl) null, (NewShippingAddressReviewViewListenerImpl) null, (CryptoConsentViewListenerImpl) null, 8184, (Object) null);
    }
}
