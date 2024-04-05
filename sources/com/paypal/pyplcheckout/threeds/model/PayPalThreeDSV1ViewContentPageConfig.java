package com.paypal.pyplcheckout.threeds.model;

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
import com.paypal.pyplcheckout.threeds.view.customviews.PayPalThreeDSV1HeaderView;
import com.paypal.pyplcheckout.threeds.view.customviews.PayPalThreeDSV1StepUpView;
import com.paypal.pyplcheckout.userprofile.model.UserProfileViewListenerImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PayPalThreeDSV1ViewContentPageConfig extends ContentPage {
    public PayPalThreeDSV1ViewContentPageConfig(Context context, Fragment fragment, PayPalThreeDSV1ViewListenerImpl payPalThreeDSV1ViewListenerImpl, ContentPage contentPage) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(fragment, "fragment");
        if (contentPage == null) {
            this.headerContentViewsList = new ArrayList();
            this.bodyContentViewsList = new ArrayList();
            this.footerContentViewsList = new ArrayList();
            Context context2 = context;
            Fragment fragment2 = fragment;
            PayPalThreeDSV1ViewListenerImpl payPalThreeDSV1ViewListenerImpl2 = payPalThreeDSV1ViewListenerImpl;
            this.headerContentViewsList.add(new PayPalThreeDSV1HeaderView(context2, (AttributeSet) null, 0, fragment2, payPalThreeDSV1ViewListenerImpl2, 6, (DefaultConstructorMarker) null));
            this.bodyContentViewsList.add(new PayPalThreeDSV1StepUpView(context2, (AttributeSet) null, 0, fragment2, payPalThreeDSV1ViewListenerImpl2, 6, (DefaultConstructorMarker) null));
            return;
        }
        List<ContentView> headerContentViewsList = contentPage.getHeaderContentViewsList();
        C19383o.m32796f(headerContentViewsList, "contentPage.headerContentViewsList");
        Context context3 = context;
        Fragment fragment3 = fragment;
        PayPalThreeDSV1ViewListenerImpl payPalThreeDSV1ViewListenerImpl3 = payPalThreeDSV1ViewListenerImpl;
        this.headerContentViewsList = NavigationUtils.createContentViewNewInstance$default(headerContentViewsList, context3, fragment3, (UserProfileViewListenerImpl) null, (AddressBookViewListenerImpl) null, (ConversionRateViewListenerImpl) null, (RateProtectionViewListenerImpl) null, (HomeViewListenerImpl) null, (ShippingMethodsViewListenerImpl) null, payPalThreeDSV1ViewListenerImpl3, (NewShippingAddressViewListenerImpl) null, (NewShippingAddressReviewViewListenerImpl) null, (CryptoConsentViewListenerImpl) null, 7672, (Object) null);
        List<ContentView> bodyContentViewsList = contentPage.getBodyContentViewsList();
        C19383o.m32796f(bodyContentViewsList, "contentPage.bodyContentViewsList");
        this.bodyContentViewsList = NavigationUtils.createContentViewNewInstance$default(bodyContentViewsList, context3, fragment3, (UserProfileViewListenerImpl) null, (AddressBookViewListenerImpl) null, (ConversionRateViewListenerImpl) null, (RateProtectionViewListenerImpl) null, (HomeViewListenerImpl) null, (ShippingMethodsViewListenerImpl) null, payPalThreeDSV1ViewListenerImpl3, (NewShippingAddressViewListenerImpl) null, (NewShippingAddressReviewViewListenerImpl) null, (CryptoConsentViewListenerImpl) null, 7672, (Object) null);
        List<ContentView> footerContentViewsList = contentPage.getFooterContentViewsList();
        C19383o.m32796f(footerContentViewsList, "contentPage.footerContentViewsList");
        this.footerContentViewsList = NavigationUtils.createContentViewNewInstance$default(footerContentViewsList, context3, fragment3, (UserProfileViewListenerImpl) null, (AddressBookViewListenerImpl) null, (ConversionRateViewListenerImpl) null, (RateProtectionViewListenerImpl) null, (HomeViewListenerImpl) null, (ShippingMethodsViewListenerImpl) null, payPalThreeDSV1ViewListenerImpl3, (NewShippingAddressViewListenerImpl) null, (NewShippingAddressReviewViewListenerImpl) null, (CryptoConsentViewListenerImpl) null, 7672, (Object) null);
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
