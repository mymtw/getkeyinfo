package com.paypal.android.platform.authsdk.splitlogin.tracking;

import com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent;

public interface ISplitLoginTracker {
    void onTrack(TrackingEvent trackingEvent);
}
