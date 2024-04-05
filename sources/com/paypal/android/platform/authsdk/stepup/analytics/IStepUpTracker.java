package com.paypal.android.platform.authsdk.stepup.analytics;

import com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent;

public interface IStepUpTracker {
    void onTrack(TrackingEvent trackingEvent);
}
