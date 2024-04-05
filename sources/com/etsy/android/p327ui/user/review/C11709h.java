package com.etsy.android.p327ui.user.review;

import androidx.lifecycle.C2843a0;
import com.paypal.android.platform.authsdk.authcommon.p531ui.webview.Result;
import com.paypal.android.platform.authsdk.captcha.analytics.CaptchaAnalyticsViewModel;
import com.paypal.android.platform.authsdk.captcha.p532ui.CaptchaEvent;
import com.paypal.android.platform.authsdk.stepup.p535ui.StepUpChallengeFragment;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsInfoHeader;
import com.paypal.pyplcheckout.home.view.customviews.PayPalCompoundHeaderView;
import com.paypal.pyplcheckout.home.view.customviews.ShippingView;
import com.paypal.pyplcheckout.home.view.fragments.HomeFragment;
import com.paypal.pyplcheckout.pojo.ShippingMethods;
import com.paypal.pyplcheckout.threeds.model.ThreeDSTopBanner;
import com.paypal.pyplcheckout.userprofile.model.UserState;
import com.paypal.pyplcheckout.userprofile.view.customviews.PayPalProfileInfoView;

/* renamed from: com.etsy.android.ui.user.review.h */
public final /* synthetic */ class C11709h implements C2843a0 {

    /* renamed from: b */
    public final /* synthetic */ int f26059b;

    /* renamed from: c */
    public final /* synthetic */ Object f26060c;

    public /* synthetic */ C11709h(Object obj, int i) {
        this.f26059b = i;
        this.f26060c = obj;
    }

    public final void onChanged(Object obj) {
        switch (this.f26059b) {
            case 0:
                CreateReviewActivity.m35074onCreate$lambda12((CreateReviewActivity) this.f26060c, (Boolean) obj);
                return;
            case 1:
                CaptchaAnalyticsViewModel.m35124registerEvent$lambda0((CaptchaAnalyticsViewModel) this.f26060c, (CaptchaEvent) obj);
                return;
            case 2:
                StepUpChallengeFragment.m35144addObserver$lambda3((StepUpChallengeFragment) this.f26060c, (Result) obj);
                return;
            case 3:
                PayPalBillingAgreementsInfoHeader.m35216listenForShowEvents$lambda5((PayPalBillingAgreementsInfoHeader) this.f26060c, (Boolean) obj);
                return;
            case 4:
                PayPalCompoundHeaderView.m35292initViewModelObservers$lambda2((PayPalCompoundHeaderView) this.f26060c, (Boolean) obj);
                return;
            case 5:
                ShippingView.m35391initViewModelObservers$lambda2((ShippingView) this.f26060c, (ShippingMethods) obj);
                return;
            case 6:
                HomeFragment.m35415onCreate$lambda3((HomeFragment) this.f26060c, (ThreeDSTopBanner) obj);
                return;
            default:
                PayPalProfileInfoView.m35456initViewModelObservers$lambda0((PayPalProfileInfoView) this.f26060c, (UserState) obj);
                return;
        }
    }
}
