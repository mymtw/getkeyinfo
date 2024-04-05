package com.paypal.android.platform.authsdk.captcha.analytics;

import com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent;

public interface ICaptchaTracker {
    void onTrack(TrackingEvent trackingEvent);
}
