package com.etsy.android.p327ui.conversation.list.ccm;

import androidx.lifecycle.C2843a0;
import com.etsy.android.p327ui.user.review.C11719r;
import com.etsy.android.p327ui.user.review.CreateReviewActivity;
import com.paypal.android.platform.authsdk.stepup.analytics.StepUpAnalyticsViewModel;
import com.paypal.android.platform.authsdk.stepup.p535ui.StepUpEvent;
import com.paypal.pyplcheckout.addcard.AddCardViewModel;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsInfoHeader;
import com.paypal.pyplcheckout.events.SingleLiveEvent;
import com.paypal.pyplcheckout.events.model.ContingencyEventsModel;
import com.paypal.pyplcheckout.home.view.customviews.PayPalCompoundHeaderView;
import com.paypal.pyplcheckout.home.view.customviews.ShippingView;
import com.paypal.pyplcheckout.home.view.fragments.HomeFragment;
import com.paypal.pyplcheckout.pojo.ShippingAddress;
import com.paypal.pyplcheckout.userprofile.model.UserState;
import com.paypal.pyplcheckout.userprofile.view.customviews.PayPalProfileHeaderView;

/* renamed from: com.etsy.android.ui.conversation.list.ccm.d */
public final /* synthetic */ class C9580d implements C2843a0 {

    /* renamed from: b */
    public final /* synthetic */ int f21247b;

    /* renamed from: c */
    public final /* synthetic */ Object f21248c;

    public /* synthetic */ C9580d(Object obj, int i) {
        this.f21247b = i;
        this.f21248c = obj;
    }

    public final void onChanged(Object obj) {
        switch (this.f21247b) {
            case 0:
                ConversationListFragment.m34958onViewCreated$lambda1((ConversationListFragment) this.f21248c, (C9587h) obj);
                return;
            case 1:
                CreateReviewActivity.m35073onCreate$lambda11((CreateReviewActivity) this.f21248c, (C11719r) obj);
                return;
            case 2:
                StepUpAnalyticsViewModel.m35143registerEvent$lambda0((StepUpAnalyticsViewModel) this.f21248c, (StepUpEvent) obj);
                return;
            case 3:
                PayPalBillingAgreementsInfoHeader.m35218listenForThreeDs$lambda3((PayPalBillingAgreementsInfoHeader) this.f21248c, (ContingencyEventsModel) obj);
                return;
            case 4:
                SingleLiveEvent.m35253observeForever$lambda2((SingleLiveEvent) this.f21248c, obj);
                return;
            case 5:
                PayPalCompoundHeaderView.m35291initViewModelObservers$lambda1((PayPalCompoundHeaderView) this.f21248c, (UserState) obj);
                return;
            case 6:
                ShippingView.m35390initViewModelObservers$lambda1((ShippingView) this.f21248c, (ShippingAddress) obj);
                return;
            case 7:
                HomeFragment.m35414onCreate$lambda2((HomeFragment) this.f21248c, (AddCardViewModel.AddCardAlertUiModel) obj);
                return;
            default:
                PayPalProfileHeaderView.m35453initViewModelObservers$lambda0((PayPalProfileHeaderView) this.f21248c, (UserState) obj);
                return;
        }
    }
}
