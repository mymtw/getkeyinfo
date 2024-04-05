package com.etsy.android.lib.logger;

import android.content.Context;
import com.etsy.android.lib.logger.perf.C8709f;

/* renamed from: com.etsy.android.lib.logger.g */
public interface C8693g {
    C8703p getAnalyticsContext();

    Context getAndroidContext();

    String getDefaultName();

    C8709f getPerformanceTracker() {
        return null;
    }

    String getTrackingName();

    C8693g getTrackingParent();
}
