package com.etsy.android.lib.logger;

import android.content.Context;
import com.etsy.android.lib.logger.AnalyticsLog;
import com.etsy.android.lib.logger.perf.C8709f;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p628nj.C18263b;

/* renamed from: com.etsy.android.lib.logger.q */
public final class C8711q extends AnalyticsLog {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8711q(C8693g gVar) {
        super(C0023f.m110k(new StringBuilder(), gVar.getAnalyticsContext().f19060b, "_perf"), C18263b.f40057V);
        C19383o.m32797g(gVar, "view");
        AnalyticsLog.LogType logType = AnalyticsLog.LogType.VIEW;
        C8709f performanceTracker = gVar.getPerformanceTracker();
        if (performanceTracker != null) {
            performanceTracker.mo21329b(this);
        }
        mo21281a(PlatformAnalyticsProperty.NATIVE_PERF, Boolean.TRUE);
        mo21281a(PlatformAnalyticsProperty.PAGE_GUID, gVar.getAnalyticsContext().f19059a);
        Context androidContext = gVar.getAndroidContext();
        if (androidContext != null) {
            mo21282b(androidContext);
        }
        if (gVar.getAnalyticsContext().f19107e != null) {
            mo21281a(PlatformAnalyticsProperty.PARENT_PAGE_GUID, gVar.getAnalyticsContext().f19107e);
        }
    }
}
