package com.paypal.android.platform.authsdk.stepup.p535ui;

import com.paypal.android.platform.authsdk.authcommon.analytics.ITracker;
import com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent;
import com.paypal.android.platform.authsdk.stepup.analytics.IStepUpTracker;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.android.platform.authsdk.stepup.ui.StepUpChallengeHandler$getStepUpChallengeFragment$bundle$1$1 */
public final class StepUpChallengeHandler$getStepUpChallengeFragment$bundle$1$1 implements IStepUpTracker {
    public final /* synthetic */ StepUpChallengeHandler this$0;

    public StepUpChallengeHandler$getStepUpChallengeFragment$bundle$1$1(StepUpChallengeHandler stepUpChallengeHandler) {
        this.this$0 = stepUpChallengeHandler;
    }

    public void onTrack(TrackingEvent trackingEvent) {
        C19383o.m32797g(trackingEvent, "event");
        ITracker access$getTracker$p = this.this$0.tracker;
        if (access$getTracker$p != null) {
            access$getTracker$p.onTrackEvent(trackingEvent);
        }
    }
}
