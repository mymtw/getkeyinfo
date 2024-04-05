package com.paypal.pyplcheckout.addressbook.model;

import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressHeaderView;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressReviewView;
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

public final class ShippingAddressReviewViewContentPageConfig extends ContentPage {
    public ShippingAddressReviewViewContentPageConfig(Context context, Fragment fragment, NewShippingAddressReviewViewListenerImpl newShippingAddressReviewViewListenerImpl, ContentPage contentPage) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(fragment, "fragment");
        if (contentPage == null) {
            this.headerContentViewsList = new ArrayList();
            this.bodyContentViewsList = new ArrayList();
            this.footerContentViewsList = new ArrayList();
            Context context2 = context;
            Fragment fragment2 = fragment;
            this.headerContentViewsList.add(new PayPalNewShippingAddressHeaderView(context2, (AttributeSet) null, 0, fragment2, newShippingAddressReviewViewListenerImpl, 6, (DefaultConstructorMarker) null));
            this.bodyContentViewsList.add(new PayPalNewShippingAddressReviewView(context2, (AttributeSet) null, 0, fragment2, 6, (DefaultConstructorMarker) null));
            return;
        }
        List<ContentView> headerContentViewsList = contentPage.getHeaderContentViewsList();
        C19383o.m32796f(headerContentViewsList, "contentPage.headerContentViewsList");
        Context context3 = context;
        Fragment fragment3 = fragment;
        NewShippingAddressReviewViewListenerImpl newShippingAddressReviewViewListenerImpl2 = newShippingAddressReviewViewListenerImpl;
        this.headerContentViewsList = NavigationUtils.createContentViewNewInstance$default(headerContentViewsList, context3, fragment3, (UserProfileViewListenerImpl) null, (AddressBookViewListenerImpl) null, (ConversionRateViewListenerImpl) null, (RateProtectionViewListenerImpl) null, (HomeViewListenerImpl) null, (ShippingMethodsViewListenerImpl) null, (PayPalThreeDSV1ViewListenerImpl) null, (NewShippingAddressViewListenerImpl) null, newShippingAddressReviewViewListenerImpl2, (CryptoConsentViewListenerImpl) null, 6136, (Object) null);
        List<ContentView> bodyContentViewsList = contentPage.getBodyContentViewsList();
        C19383o.m32796f(bodyContentViewsList, "contentPage.bodyContentViewsList");
        this.bodyContentViewsList = NavigationUtils.createContentViewNewInstance$default(bodyContentViewsList, context3, fragment3, (UserProfileViewListenerImpl) null, (AddressBookViewListenerImpl) null, (ConversionRateViewListenerImpl) null, (RateProtectionViewListenerImpl) null, (HomeViewListenerImpl) null, (ShippingMethodsViewListenerImpl) null, (PayPalThreeDSV1ViewListenerImpl) null, (NewShippingAddressViewListenerImpl) null, newShippingAddressReviewViewListenerImpl2, (CryptoConsentViewListenerImpl) null, 6136, (Object) null);
    }

    public final void clearHomeScreenViews() {
        List<ContentView> list = this.headerContentViewsList;
        C19383o.m32796f(list, "headerContentViewsList");
        for (ContentView contentViewVisibility : list) {
            contentViewVisibility.setContentViewVisibility(8);
        }
        List<ContentView> list2 = this.bodyContentViewsList;
        C19383o.m32796f(list2, "bodyContentViewsList");
        for (ContentView contentViewVisibility2 : list2) {
            contentViewVisibility2.setContentViewVisibility(8);
        }
        List<ContentView> list3 = this.footerContentViewsList;
        C19383o.m32796f(list3, "footerContentViewsList");
        for (ContentView contentViewVisibility3 : list3) {
            contentViewVisibility3.setContentViewVisibility(8);
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
