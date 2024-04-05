package com.etsy.android.lib.logger.analytics;

public final class AnalyticsQueueTooLongException extends IllegalStateException {
    public static final int $stable = 0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnalyticsQueueTooLongException(long r3, long r5) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Too many analytics events ["
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "] awaiting upload.  ANALYTICS_QUEUE_ALERT_THRESHOLD is set to ["
            r0.append(r3)
            r3 = 93
            java.lang.String r3 = p003a2.C0015b.m91j(r0, r5, r3)
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.logger.analytics.AnalyticsQueueTooLongException.<init>(long, long):void");
    }
}
