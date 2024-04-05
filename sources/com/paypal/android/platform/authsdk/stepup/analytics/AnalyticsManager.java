package com.paypal.android.platform.authsdk.stepup.analytics;

import com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent;
import kotlin.jvm.internal.C19383o;

public final class AnalyticsManager {
    private final IStepUpTracker tracker;

    public AnalyticsManager(IStepUpTracker iStepUpTracker) {
        C19383o.m32797g(iStepUpTracker, "tracker");
        this.tracker = iStepUpTracker;
    }

    public final void trackEvent$auth_sdk_thirdPartyRelease(TrackingEvent trackingEvent) {
        C19383o.m32797g(trackingEvent, "event");
        this.tracker.onTrack(trackingEvent);
    }
}
