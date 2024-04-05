package com.etsy.android.lib.logger;

public final class ViewClickAnalyticsLog extends AnalyticsLog {

    public enum ViewAction {
        clicked,
        long_clicked,
        tapped,
        checked,
        unchecked
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ViewClickAnalyticsLog(java.lang.String r4, com.etsy.android.lib.logger.ViewClickAnalyticsLog.ViewAction r5, java.util.HashMap<com.etsy.android.lib.logger.AnalyticsProperty, java.lang.Object> r6, com.etsy.android.lib.logger.C8703p r7) {
        /*
            r3 = this;
            com.etsy.android.lib.logger.AnalyticsLog$LogType r0 = com.etsy.android.lib.logger.AnalyticsLog.LogType.VIEW
            java.lang.String r0 = "_"
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0073e.m211k(r4, r0)
            java.lang.String r1 = r5.name()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            q9.p r1 = p628nj.C18263b.f40057V
            r2 = 0
            r3.<init>(r0, r2, r6, r1)
            com.etsy.android.lib.logger.PlatformAnalyticsProperty r6 = com.etsy.android.lib.logger.PlatformAnalyticsProperty.VIEW_NAME
            r3.mo21281a(r6, r4)
            com.etsy.android.lib.logger.PlatformAnalyticsProperty r4 = com.etsy.android.lib.logger.PlatformAnalyticsProperty.VIEW_ACTION
            java.lang.String r5 = r5.name()
            r3.mo21281a(r4, r5)
            com.etsy.android.lib.logger.PlatformAnalyticsProperty r4 = com.etsy.android.lib.logger.PlatformAnalyticsProperty.PAGE_GUID
            java.lang.String r5 = r7.f19059a
            r3.mo21281a(r4, r5)
            com.etsy.android.lib.logger.PlatformAnalyticsProperty r4 = com.etsy.android.lib.logger.PlatformAnalyticsProperty.CONTEXT_NAME
            java.lang.String r5 = r7.f19060b
            r3.mo21281a(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.logger.ViewClickAnalyticsLog.<init>(java.lang.String, com.etsy.android.lib.logger.ViewClickAnalyticsLog$ViewAction, java.util.HashMap, com.etsy.android.lib.logger.p):void");
    }
}
