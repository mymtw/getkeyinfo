package com.etsy.android.p327ui.conversation.details.ccm;

import androidx.lifecycle.C2843a0;
import com.etsy.android.p327ui.home.landingpage.C10035h;
import com.etsy.android.p327ui.home.landingpage.LandingPageFragment;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressSearchView;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsTermsBodyView;
import com.paypal.pyplcheckout.billingagreements.viewmodel.BaTermsState;
import com.paypal.pyplcheckout.conversionrate.view.customviews.PayPalConversionRateInfoView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalCurrencyConversionView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalExpandedCartDetails;

/* renamed from: com.etsy.android.ui.conversation.details.ccm.h */
public final /* synthetic */ class C9499h implements C2843a0 {

    /* renamed from: b */
    public final /* synthetic */ int f21060b;

    /* renamed from: c */
    public final /* synthetic */ Object f21061c;

    public /* synthetic */ C9499h(Object obj, int i) {
        this.f21060b = i;
        this.f21061c = obj;
    }

    public final void onChanged(Object obj) {
        switch (this.f21060b) {
            case 0:
                ConversationDetailsFragment.m34940onViewCreated$lambda9$lambda7((ConversationDetailsFragment) this.f21061c, (String) obj);
                return;
            case 1:
                LandingPageFragment.m34995onViewCreated$lambda1((LandingPageFragment) this.f21061c, (C10035h) obj);
                return;
            case 2:
                PayPalNewShippingAddressSearchView.m35180initViewModelObservers$lambda12((PayPalNewShippingAddressSearchView) this.f21061c, (Boolean) obj);
                return;
            case 3:
                PayPalBillingAgreementsTermsBodyView.m35220initViewModelObservers$lambda0((PayPalBillingAgreementsTermsBodyView) this.f21061c, (BaTermsState) obj);
                return;
            case 4:
                PayPalConversionRateInfoView.m35238initViewModelObservers$lambda0((PayPalConversionRateInfoView) this.f21061c, (String) obj);
                return;
            case 5:
                PayPalCurrencyConversionView.m35312initViewModelObservers$lambda2((PayPalCurrencyConversionView) this.f21061c, (Boolean) obj);
                return;
            default:
                PayPalExpandedCartDetails.m35330initViewModelObservers$lambda1((PayPalExpandedCartDetails) this.f21061c, (Boolean) obj);
                return;
        }
    }
}
