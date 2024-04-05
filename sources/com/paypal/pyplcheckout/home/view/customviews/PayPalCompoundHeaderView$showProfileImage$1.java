package com.paypal.pyplcheckout.home.view.customviews;

import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.squareup.picasso.C17439e;

public final class PayPalCompoundHeaderView$showProfileImage$1 implements C17439e {
    public final /* synthetic */ String $firstName;
    public final /* synthetic */ String $lastName;
    public final /* synthetic */ PayPalCompoundHeaderView this$0;

    public PayPalCompoundHeaderView$showProfileImage$1(PayPalCompoundHeaderView payPalCompoundHeaderView, String str, String str2) {
        this.this$0 = payPalCompoundHeaderView;
        this.$firstName = str;
        this.$lastName = str2;
    }

    public void onError(Exception exc) {
        PLog.impression$default(PEnums.TransitionName.USER_PROFILE_IMAGE_SHOWN, PEnums.Outcome.FAILED, PEnums.EventCode.E103, PEnums.StateName.REVIEW, exc == null ? null : exc.getMessage(), "review_your_information_screen", "profile_picture_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
        this.this$0.updateInitialCircleView(this.$firstName, this.$lastName);
    }

    public void onSuccess() {
        this.this$0.circleImageView.setVisibility(0);
        PLog.impression$default(PEnums.TransitionName.USER_PROFILE_IMAGE_SHOWN, PEnums.Outcome.SHOWN, PEnums.EventCode.E103, PEnums.StateName.REVIEW, (String) null, "review_your_information_screen", "profile_picture_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
    }
}
