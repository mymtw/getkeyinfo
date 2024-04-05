package com.etsy.android.p327ui.conversation.details.ccm;

import androidx.lifecycle.C2843a0;
import com.etsy.android.lib.models.apiv3.Alert;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.UiState;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.summary.SummaryFragment;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsTermsFooterLink;
import com.paypal.pyplcheckout.billingagreements.viewmodel.BaTermsFooterState;
import com.paypal.pyplcheckout.conversionrate.view.customviews.PayPalConversionRateInfoView;
import com.paypal.pyplcheckout.events.model.ContingencyEventsModel;
import com.paypal.pyplcheckout.home.view.activities.PYPLHomeActivity;
import com.paypal.pyplcheckout.home.view.customviews.PayPalCurrencyConversionView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalExpandedCartDetails;

/* renamed from: com.etsy.android.ui.conversation.details.ccm.i */
public final /* synthetic */ class C9500i implements C2843a0 {

    /* renamed from: b */
    public final /* synthetic */ int f21062b;

    /* renamed from: c */
    public final /* synthetic */ Object f21063c;

    public /* synthetic */ C9500i(Object obj, int i) {
        this.f21062b = i;
        this.f21063c = obj;
    }

    public final void onChanged(Object obj) {
        switch (this.f21062b) {
            case 0:
                ConversationDetailsFragment.m34941onViewCreated$lambda9$lambda8((ConversationDetailsFragment) this.f21063c, (Alert) obj);
                return;
            case 1:
                SummaryFragment.m35014onViewCreated$lambda0((SummaryFragment) this.f21063c, (UiState) obj);
                return;
            case 2:
                PayPalBillingAgreementsTermsFooterLink.m35221initViewModelObservers$lambda1((PayPalBillingAgreementsTermsFooterLink) this.f21063c, (BaTermsFooterState) obj);
                return;
            case 3:
                PayPalConversionRateInfoView.m35239initViewModelObservers$lambda1((PayPalConversionRateInfoView) this.f21063c, (String) obj);
                return;
            case 4:
                PYPLHomeActivity.m35259onCreate$lambda2((PYPLHomeActivity) this.f21063c, ((Boolean) obj).booleanValue());
                return;
            case 5:
                PayPalCurrencyConversionView.m35313initViewModelObservers$lambda3((PayPalCurrencyConversionView) this.f21063c, (Boolean) obj);
                return;
            default:
                PayPalExpandedCartDetails.m35331initViewModelObservers$lambda3((PayPalExpandedCartDetails) this.f21063c, (ContingencyEventsModel) obj);
                return;
        }
    }
}
