package com.etsy.android.feedback;

import androidx.lifecycle.C2843a0;
import com.etsy.android.lib.models.apiv3.Alert;
import com.etsy.android.p327ui.conversation.details.ccm.C9502k;
import com.etsy.android.p327ui.conversation.details.ccm.ConversationDetailsFragment;
import com.etsy.android.p327ui.core.review.C9711b;
import com.etsy.android.p327ui.core.review.ListingReviewPagerFragment;
import com.etsy.android.p327ui.listing.ListingFragment;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.login.ThirdPartySignInFragment;
import com.etsy.android.p327ui.user.review.CreateReviewActivity;
import com.etsy.android.util.C12059p;
import com.paypal.android.platform.authsdk.authcommon.p531ui.webview.Result;
import com.paypal.android.platform.authsdk.captcha.p532ui.CaptchaChallengeFragment;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalAddressBookInfoView;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsInfoHeader;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsToggle;
import com.paypal.pyplcheckout.billingagreements.viewmodel.BaInfoHeaderState;
import com.paypal.pyplcheckout.home.view.customviews.PayPalCompoundHeaderView;
import com.paypal.pyplcheckout.home.view.customviews.ShippingView;
import java.util.List;
import p499zd.C13950a;

/* renamed from: com.etsy.android.feedback.a */
public final /* synthetic */ class C6456a implements C2843a0 {

    /* renamed from: b */
    public final /* synthetic */ int f14309b;

    /* renamed from: c */
    public final /* synthetic */ Object f14310c;

    public /* synthetic */ C6456a(Object obj, int i) {
        this.f14309b = i;
        this.f14310c = obj;
    }

    public final void onChanged(Object obj) {
        switch (this.f14309b) {
            case 0:
                ((FeedbackFragment) this.f14310c).handleEvent((C12059p) obj);
                return;
            case 1:
                ConversationDetailsFragment.m34936onViewCreated$lambda9$lambda3((ConversationDetailsFragment) this.f14310c, (C9502k) obj);
                return;
            case 2:
                ListingReviewPagerFragment.m34963onViewCreated$lambda1((ListingReviewPagerFragment) this.f14310c, (C9711b.C9712a) obj);
                return;
            case 3:
                ((ListingFragment) this.f14310c).handleState((ListingViewState) obj);
                return;
            case 4:
                ThirdPartySignInFragment.m35016onCreateView$lambda2((ThirdPartySignInFragment) this.f14310c, (C13950a) obj);
                return;
            case 5:
                CreateReviewActivity.m35075onCreate$lambda13((CreateReviewActivity) this.f14310c, (Alert) obj);
                return;
            case 6:
                CaptchaChallengeFragment.m35125addObserver$lambda0((CaptchaChallengeFragment) this.f14310c, (Result) obj);
                return;
            case 7:
                PayPalAddressBookInfoView.m35160initViewModelObservers$lambda0((PayPalAddressBookInfoView) this.f14310c, (List) obj);
                return;
            case 8:
                PayPalBillingAgreementsInfoHeader.m35217listenForShowEvents$lambda6((PayPalBillingAgreementsInfoHeader) this.f14310c, (BaInfoHeaderState) obj);
                return;
            case 9:
                PayPalBillingAgreementsToggle.m35229listenForLogoutEvent$lambda4((PayPalBillingAgreementsToggle) this.f14310c, (Boolean) obj);
                return;
            case 10:
                PayPalCompoundHeaderView.m35293initViewModelObservers$lambda3((PayPalCompoundHeaderView) this.f14310c, (Boolean) obj);
                return;
            default:
                ShippingView.m35392initViewModelObservers$lambda3((ShippingView) this.f14310c, (Boolean) obj);
                return;
        }
    }
}
