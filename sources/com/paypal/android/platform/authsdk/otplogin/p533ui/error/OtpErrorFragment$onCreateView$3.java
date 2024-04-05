package com.paypal.android.platform.authsdk.otplogin.p533ui.error;

import com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent;
import com.paypal.android.platform.authsdk.otplogin.tracking.IErrorTracker;
import kotlin.jvm.internal.C19383o;
import p716xo.C18829b;

/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.error.OtpErrorFragment$onCreateView$3 */
public final class OtpErrorFragment$onCreateView$3 implements IErrorTracker {
    public final /* synthetic */ OtpErrorFragment this$0;

    public OtpErrorFragment$onCreateView$3(OtpErrorFragment otpErrorFragment) {
        this.this$0 = otpErrorFragment;
    }

    public void onTrack(TrackingEvent trackingEvent) {
        C19383o.m32797g(trackingEvent, "trackingEvent");
        try {
            C18829b access$getAuthHandlerProviders$p = this.this$0.authHandlerProviders;
            if (access$getAuthHandlerProviders$p != null) {
                access$getAuthHandlerProviders$p.getTracker().onTrackEvent(trackingEvent);
            } else {
                C19383o.m32805o("authHandlerProviders");
                throw null;
            }
        } catch (Exception unused) {
        }
    }
}
