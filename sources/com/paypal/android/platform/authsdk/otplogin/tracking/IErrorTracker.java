package com.paypal.android.platform.authsdk.otplogin.tracking;

import com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent;

public interface IErrorTracker {
    void onTrack(TrackingEvent trackingEvent);
}
