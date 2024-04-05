package com.etsy.android.feedback;

import androidx.lifecycle.C2843a0;
import com.etsy.android.feedback.FeedbackViewModel;
import com.etsy.android.p327ui.user.privacy.PrivacyFragment;
import com.paypal.pyplcheckout.addressbook.AddressReviewState;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressReviewView;
import com.paypal.pyplcheckout.conversionrate.view.customviews.PayPalConversionRateInfoView;
import com.paypal.pyplcheckout.home.view.customviews.AddCardView;
import p418pa.C13203e;

/* renamed from: com.etsy.android.feedback.k */
public final /* synthetic */ class C6466k implements C2843a0 {

    /* renamed from: b */
    public final /* synthetic */ int f14359b;

    /* renamed from: c */
    public final /* synthetic */ Object f14360c;

    public /* synthetic */ C6466k(Object obj, int i) {
        this.f14359b = i;
        this.f14360c = obj;
    }

    public final void onChanged(Object obj) {
        switch (this.f14359b) {
            case 0:
                ((ItemReviewsFragment) this.f14360c).handleState((FeedbackViewModel.C6440b) obj);
                return;
            case 1:
                PrivacyFragment.m35066initObservers$lambda0((PrivacyFragment) this.f14360c, (C13203e) obj);
                return;
            case 2:
                PayPalNewShippingAddressReviewView.m35168addressReviewStateObserver$lambda0((PayPalNewShippingAddressReviewView) this.f14360c, (AddressReviewState) obj);
                return;
            case 3:
                PayPalConversionRateInfoView.m35241initViewModelObservers$lambda3((PayPalConversionRateInfoView) this.f14360c, (String) obj);
                return;
            default:
                AddCardView.m35278initViewModelObservers$lambda6((AddCardView) this.f14360c, (Boolean) obj);
                return;
        }
    }
}
