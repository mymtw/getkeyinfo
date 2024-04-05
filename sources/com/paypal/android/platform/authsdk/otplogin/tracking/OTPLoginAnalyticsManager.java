package com.paypal.android.platform.authsdk.otplogin.tracking;

import com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent;
import kotlin.jvm.internal.C19383o;

public final class OTPLoginAnalyticsManager {
    private final IOTPLoginTracker tracker;

    public OTPLoginAnalyticsManager(IOTPLoginTracker iOTPLoginTracker) {
        C19383o.m32797g(iOTPLoginTracker, "tracker");
        this.tracker = iOTPLoginTracker;
    }

    public final void trackEvent$auth_sdk_thirdPartyRelease(TrackingEvent trackingEvent) {
        C19383o.m32797g(trackingEvent, "event");
        this.tracker.onTrack(trackingEvent);
    }
}
