package com.paypal.pyplcheckout.userprofile.view.customviews;

import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.squareup.picasso.C17439e;

public final class PayPalProfileHeaderView$showProfileImage$1 implements C17439e {
    public final /* synthetic */ String $userProfileInitialName;
    public final /* synthetic */ PayPalProfileHeaderView this$0;

    public PayPalProfileHeaderView$showProfileImage$1(PayPalProfileHeaderView payPalProfileHeaderView, String str) {
        this.this$0 = payPalProfileHeaderView;
        this.$userProfileInitialName = str;
    }

    public void onError(Exception exc) {
        this.this$0.userProfileCircleIv.setVisibility(8);
        this.this$0.userProfileInitialCircleTv.setText(this.$userProfileInitialName);
        this.this$0.userProfileInitialCircleTv.setVisibility(0);
        PLog.e$default(PayPalProfileHeaderView.TAG, exc == null ? null : exc.getMessage(), (Throwable) null, 0, 12, (Object) null);
    }

    public void onSuccess() {
    }
}
