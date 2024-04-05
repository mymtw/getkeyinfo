package com.paypal.pyplcheckout.home.view.customviews;

import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class PayPalTopBannerView$initViewModelObservers$1$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ PayPalTopBannerView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalTopBannerView$initViewModelObservers$1$1(PayPalTopBannerView payPalTopBannerView) {
        super(0);
        this.this$0 = payPalTopBannerView;
    }

    public final void invoke() {
        this.this$0.bannerImage.setVisibility(8);
        this.this$0.getViewModel().setShouldWaitForStartupAnimation(false);
        this.this$0.getViewModel().setFetchingUserDataCompletedFlag(true);
        DebugConfigManager.getInstance().setOnboardingComplete(true);
        PLog.transition$default(PEnums.TransitionName.FINAL_LOADING_ANIMATION, PEnums.Outcome.FINISHED, (PEnums.EventCode) null, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16380, (Object) null);
    }
}
