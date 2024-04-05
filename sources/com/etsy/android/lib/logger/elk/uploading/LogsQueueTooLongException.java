package com.etsy.android.lib.logger.elk.uploading;

public final class LogsQueueTooLongException extends IllegalStateException {
    public static final int $stable = 0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LogsQueueTooLongException(long r3, long r5) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Too many logs ["
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "] awaiting upload.  LOG_QUEUE_ALERT_SAMPLE_RATE is set to ["
            r0.append(r3)
            r3 = 93
            java.lang.String r3 = p003a2.C0015b.m91j(r0, r5, r3)
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.logger.elk.uploading.LogsQueueTooLongException.<init>(long, long):void");
    }
}
