package com.paypal.android.platform.authsdk.captcha.analytics;

import com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent;
import kotlin.jvm.internal.C19383o;

public final class CaptchaAnalyticsManager {
    private final ICaptchaTracker tracker;

    public CaptchaAnalyticsManager(ICaptchaTracker iCaptchaTracker) {
        C19383o.m32797g(iCaptchaTracker, "tracker");
        this.tracker = iCaptchaTracker;
    }

    public final void trackEvent$auth_sdk_thirdPartyRelease(TrackingEvent trackingEvent) {
        C19383o.m32797g(trackingEvent, "event");
        this.tracker.onTrack(trackingEvent);
    }
}
