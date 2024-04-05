package com.paypal.android.platform.authsdk.otplogin.tracking;

import com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent;
import kotlin.jvm.internal.C19383o;

public final class ErrorAnalyticsManager {
    private final IErrorTracker tracker;

    public ErrorAnalyticsManager(IErrorTracker iErrorTracker) {
        C19383o.m32797g(iErrorTracker, "tracker");
        this.tracker = iErrorTracker;
    }

    public final void trackEvent$auth_sdk_thirdPartyRelease(TrackingEvent trackingEvent) {
        C19383o.m32797g(trackingEvent, "event");
        this.tracker.onTrack(trackingEvent);
    }
}
