package com.paypal.pyplcheckout.crypto.model;

import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.addressbook.model.AddressBookViewListenerImpl;
import com.paypal.pyplcheckout.addressbook.model.NewShippingAddressReviewViewListenerImpl;
import com.paypal.pyplcheckout.addressbook.model.NewShippingAddressViewListenerImpl;
import com.paypal.pyplcheckout.conversionrate.model.ConversionRateViewListenerImpl;
import com.paypal.pyplcheckout.conversionrateprotection.model.RateProtectionViewListenerImpl;
import com.paypal.pyplcheckout.crypto.view.customviews.PayPalCryptoConsentHeaderView;
import com.paypal.pyplcheckout.crypto.view.customviews.PayPalCryptoConsentInfoView;
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

public final class CryptoConsentViewContentPageConfig extends ContentPage {
    public CryptoConsentViewContentPageConfig(Context context, Fragment fragment, CryptoConsentViewListenerImpl cryptoConsentViewListenerImpl, ContentPage contentPage) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(fragment, "fragment");
        if (contentPage == null) {
            this.headerContentViewsList = new ArrayList();
            this.bodyContentViewsList = new ArrayList();
            this.footerContentViewsList = new ArrayList();
            Context context2 = context;
            Fragment fragment2 = fragment;
            this.headerContentViewsList.add(new PayPalCryptoConsentHeaderView(context2, (AttributeSet) null, 0, fragment2, 6, (DefaultConstructorMarker) null));
            this.bodyContentViewsList.add(new PayPalCryptoConsentInfoView(context2, (AttributeSet) null, 0, fragment2, cryptoConsentViewListenerImpl, 6, (DefaultConstructorMarker) null));
            return;
        }
        List<ContentView> headerContentViewsList = contentPage.getHeaderContentViewsList();
        C19383o.m32796f(headerContentViewsList, "contentPage.headerContentViewsList");
        Context context3 = context;
        Fragment fragment3 = fragment;
        CryptoConsentViewListenerImpl cryptoConsentViewListenerImpl2 = cryptoConsentViewListenerImpl;
        this.headerContentViewsList = NavigationUtils.createContentViewNewInstance$default(headerContentViewsList, context3, fragment3, (UserProfileViewListenerImpl) null, (AddressBookViewListenerImpl) null, (ConversionRateViewListenerImpl) null, (RateProtectionViewListenerImpl) null, (HomeViewListenerImpl) null, (ShippingMethodsViewListenerImpl) null, (PayPalThreeDSV1ViewListenerImpl) null, (NewShippingAddressViewListenerImpl) null, (NewShippingAddressReviewViewListenerImpl) null, cryptoConsentViewListenerImpl2, 4088, (Object) null);
        List<ContentView> bodyContentViewsList = contentPage.getBodyContentViewsList();
        C19383o.m32796f(bodyContentViewsList, "contentPage.bodyContentViewsList");
        this.bodyContentViewsList = NavigationUtils.createContentViewNewInstance$default(bodyContentViewsList, context3, fragment3, (UserProfileViewListenerImpl) null, (AddressBookViewListenerImpl) null, (ConversionRateViewListenerImpl) null, (RateProtectionViewListenerImpl) null, (HomeViewListenerImpl) null, (ShippingMethodsViewListenerImpl) null, (PayPalThreeDSV1ViewListenerImpl) null, (NewShippingAddressViewListenerImpl) null, (NewShippingAddressReviewViewListenerImpl) null, cryptoConsentViewListenerImpl2, 4088, (Object) null);
        List<ContentView> footerContentViewsList = contentPage.getFooterContentViewsList();
        C19383o.m32796f(footerContentViewsList, "contentPage.footerContentViewsList");
        this.footerContentViewsList = NavigationUtils.createContentViewNewInstance$default(footerContentViewsList, context3, fragment3, (UserProfileViewListenerImpl) null, (AddressBookViewListenerImpl) null, (ConversionRateViewListenerImpl) null, (RateProtectionViewListenerImpl) null, (HomeViewListenerImpl) null, (ShippingMethodsViewListenerImpl) null, (PayPalThreeDSV1ViewListenerImpl) null, (NewShippingAddressViewListenerImpl) null, (NewShippingAddressReviewViewListenerImpl) null, cryptoConsentViewListenerImpl2, 4088, (Object) null);
    }
}
