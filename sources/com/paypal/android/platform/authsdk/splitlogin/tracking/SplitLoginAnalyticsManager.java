package com.paypal.android.platform.authsdk.splitlogin.tracking;

import com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent;
import kotlin.jvm.internal.C19383o;

public final class SplitLoginAnalyticsManager {
    private final ISplitLoginTracker tracker;

    public SplitLoginAnalyticsManager(ISplitLoginTracker iSplitLoginTracker) {
        C19383o.m32797g(iSplitLoginTracker, "tracker");
        this.tracker = iSplitLoginTracker;
    }

    public final void trackEvent$auth_sdk_thirdPartyRelease(TrackingEvent trackingEvent) {
        C19383o.m32797g(trackingEvent, "event");
        this.tracker.onTrack(trackingEvent);
    }
}
