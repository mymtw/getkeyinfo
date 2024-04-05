package com.etsy.android.p327ui.conversation.details.ccm;

import androidx.lifecycle.C2843a0;
import com.etsy.android.p327ui.core.review.C9716f;
import com.etsy.android.p327ui.core.review.ListingVideoReviewFragment;
import com.etsy.android.p327ui.home.recentlyviewedpage.RecentlyViewedPageFragment;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.NativeBuyItNowSubscreenFragment;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.UiState;
import com.etsy.android.p327ui.user.inappnotifications.C11544b0;
import com.etsy.android.p327ui.user.inappnotifications.InAppNotificationsFragment;
import com.etsy.android.p327ui.user.review.C11745t;
import com.etsy.android.p327ui.user.review.CreateReviewActivity;
import com.etsy.android.util.C12059p;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalAddressBookInfoView;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressSearchView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalCurrencyConversionView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalExpandedCartDetails;
import com.paypal.pyplcheckout.pojo.ShippingMethods;
import com.paypal.pyplcheckout.shippingmethods.view.customviews.PayPalShippingMethodsInfoView;
import com.paypal.pyplcheckout.utils.CurrencyConversionType;
import java.util.List;

/* renamed from: com.etsy.android.ui.conversation.details.ccm.g */
public final /* synthetic */ class C9498g implements C2843a0 {

    /* renamed from: b */
    public final /* synthetic */ int f21058b;

    /* renamed from: c */
    public final /* synthetic */ Object f21059c;

    public /* synthetic */ C9498g(Object obj, int i) {
        this.f21058b = i;
        this.f21059c = obj;
    }

    public final void onChanged(Object obj) {
        switch (this.f21058b) {
            case 0:
                ConversationDetailsFragment.m34939onViewCreated$lambda9$lambda6((ConversationDetailsFragment) this.f21059c, (Boolean) obj);
                return;
            case 1:
                ListingVideoReviewFragment.m34964onCreate$lambda0((ListingVideoReviewFragment) this.f21059c, (C9716f) obj);
                return;
            case 2:
                RecentlyViewedPageFragment.m34998onViewCreated$lambda1((RecentlyViewedPageFragment) this.f21059c, (C12059p) obj);
                return;
            case 3:
                NativeBuyItNowSubscreenFragment.m35012onViewCreated$lambda0((NativeBuyItNowSubscreenFragment) this.f21059c, (UiState) obj);
                return;
            case 4:
                InAppNotificationsFragment.m35063onStart$lambda0((InAppNotificationsFragment) this.f21059c, (C11544b0) obj);
                return;
            case 5:
                CreateReviewActivity.m35078onCreate$lambda16((CreateReviewActivity) this.f21059c, (C11745t) obj);
                return;
            case 6:
                PayPalAddressBookInfoView.m35163initViewModelObservers$lambda3((PayPalAddressBookInfoView) this.f21059c, (ShippingMethods) obj);
                return;
            case 7:
                PayPalNewShippingAddressSearchView.m35179initViewModelObservers$lambda11((PayPalNewShippingAddressSearchView) this.f21059c, (List) obj);
                return;
            case 8:
                PayPalCurrencyConversionView.m35311initViewModelObservers$lambda1((PayPalCurrencyConversionView) this.f21059c, (CurrencyConversionType) obj);
                return;
            case 9:
                PayPalExpandedCartDetails.m35329initViewModelObservers$lambda0((PayPalExpandedCartDetails) this.f21059c, (Boolean) obj);
                return;
            default:
                PayPalShippingMethodsInfoView.m35441initViewModelObservers$lambda1((PayPalShippingMethodsInfoView) this.f21059c, (ShippingMethods) obj);
                return;
        }
    }
}
