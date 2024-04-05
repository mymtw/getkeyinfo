package com.paypal.android.platform.authsdk.otplogin.p533ui;

import com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent;
import com.paypal.android.platform.authsdk.otplogin.tracking.IOTPLoginTracker;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginHandler$returnOTPLoginFragment$otpLoginFragment$1$1 */
public final class OTPLoginHandler$returnOTPLoginFragment$otpLoginFragment$1$1 implements IOTPLoginTracker {
    public final /* synthetic */ OTPLoginHandler this$0;

    public OTPLoginHandler$returnOTPLoginFragment$otpLoginFragment$1$1(OTPLoginHandler oTPLoginHandler) {
        this.this$0 = oTPLoginHandler;
    }

    public void onTrack(TrackingEvent trackingEvent) {
        C19383o.m32797g(trackingEvent, "trackingEvent");
        this.this$0.iTracker.onTrackEvent(trackingEvent);
    }
}
