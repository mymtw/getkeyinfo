package com.paypal.android.platform.authsdk.splitlogin.p534ui;

import com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent;
import com.paypal.android.platform.authsdk.splitlogin.tracking.ISplitLoginTracker;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginHandler$handleChallenge$splitLoginFragment$1$1 */
public final class SplitLoginHandler$handleChallenge$splitLoginFragment$1$1 implements ISplitLoginTracker {
    public final /* synthetic */ SplitLoginHandler this$0;

    public SplitLoginHandler$handleChallenge$splitLoginFragment$1$1(SplitLoginHandler splitLoginHandler) {
        this.this$0 = splitLoginHandler;
    }

    public void onTrack(TrackingEvent trackingEvent) {
        C19383o.m32797g(trackingEvent, "trackingEvent");
        this.this$0.iTracker.onTrackEvent(trackingEvent);
    }
}
