package com.etsy.android.p327ui;

import androidx.lifecycle.C2843a0;
import com.etsy.android.p327ui.conversation.details.C9559o;
import com.etsy.android.p327ui.conversation.details.ccm.ConversationDetailsFragment;
import com.etsy.android.p327ui.user.review.C11700a;
import com.etsy.android.p327ui.user.review.CreateReviewActivity;
import com.paypal.android.platform.authsdk.otplogin.p533ui.error.OtpErrorFragment;
import com.paypal.android.platform.authsdk.otplogin.p533ui.error.OtpErrorViewModel;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalAddressBookInfoView;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressSearchView;
import com.paypal.pyplcheckout.addshipping.model.AddressAutoCompletePlaceIdResponse;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsInfoHeader;
import com.paypal.pyplcheckout.events.model.ContingencyEventsModel;
import com.paypal.pyplcheckout.home.view.customviews.PayPalCurrencyConversionView;
import com.paypal.pyplcheckout.home.view.customviews.ShippingView;
import com.paypal.pyplcheckout.shippingmethods.view.customviews.PayPalShippingMethodsInfoView;
import java.util.List;

/* renamed from: com.etsy.android.ui.j */
public final /* synthetic */ class C10077j implements C2843a0 {

    /* renamed from: b */
    public final /* synthetic */ int f22210b;

    /* renamed from: c */
    public final /* synthetic */ Object f22211c;

    public /* synthetic */ C10077j(Object obj, int i) {
        this.f22210b = i;
        this.f22211c = obj;
    }

    public final void onChanged(Object obj) {
        switch (this.f22210b) {
            case 0:
                ((BOEActivity) this.f22211c).lambda$requestPushOptInPermissions$5((Boolean) obj);
                return;
            case 1:
                ConversationDetailsFragment.m34938onViewCreated$lambda9$lambda5((ConversationDetailsFragment) this.f22211c, (C9559o[]) obj);
                return;
            case 2:
                CreateReviewActivity.m35077onCreate$lambda15((CreateReviewActivity) this.f22211c, (C11700a) obj);
                return;
            case 3:
                OtpErrorFragment.m35128onCreateView$lambda4((OtpErrorFragment) this.f22211c, (OtpErrorViewModel.OtpErrorViewState) obj);
                return;
            case 4:
                PayPalAddressBookInfoView.m35162initViewModelObservers$lambda2((PayPalAddressBookInfoView) this.f22211c, (List) obj);
                return;
            case 5:
                PayPalNewShippingAddressSearchView.m35182initViewModelObservers$lambda9((PayPalNewShippingAddressSearchView) this.f22211c, (AddressAutoCompletePlaceIdResponse) obj);
                return;
            case 6:
                PayPalBillingAgreementsInfoHeader.m35214listenForLogoutEvent$lambda4((PayPalBillingAgreementsInfoHeader) this.f22211c, (Boolean) obj);
                return;
            case 7:
                PayPalCurrencyConversionView.m35310initViewModelObservers$lambda0((PayPalCurrencyConversionView) this.f22211c, (Boolean) obj);
                return;
            case 8:
                ShippingView.m35394initViewModelObservers$lambda6((ShippingView) this.f22211c, (ContingencyEventsModel) obj);
                return;
            default:
                PayPalShippingMethodsInfoView.m35440initViewModelObservers$lambda0((PayPalShippingMethodsInfoView) this.f22211c, (List) obj);
                return;
        }
    }
}
