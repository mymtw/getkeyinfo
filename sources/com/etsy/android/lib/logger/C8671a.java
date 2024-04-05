package com.etsy.android.lib.logger;

import com.etsy.android.lib.logger.AnalyticsLog;
import java.util.Map;
import p628nj.C18263b;

/* renamed from: com.etsy.android.lib.logger.a */
public final class C8671a extends AnalyticsLog {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8671a(String str, Map<? extends AnalyticsProperty, Object> map, C8672b bVar) {
        super(str, false, map, C18263b.f40057V);
        AnalyticsLog.LogType logType = AnalyticsLog.LogType.VIEW;
        mo21281a(PlatformAnalyticsProperty.PAGE_GUID, bVar.f19059a);
        mo21281a(PlatformAnalyticsProperty.CONTEXT_NAME, bVar.f19060b);
    }
}
