package com.etsy.android.lib.logger;

import com.etsy.android.lib.logger.AnalyticsLog;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import p628nj.C18263b;

/* renamed from: com.etsy.android.lib.logger.e */
public final class C8677e extends AnalyticsLog {

    /* renamed from: com.etsy.android.lib.logger.e$a */
    public interface C8678a {
        /* renamed from: a */
        String mo21123a();

        /* renamed from: b */
        String mo21124b();

        /* renamed from: c */
        String mo21125c();

        /* renamed from: e */
        String mo21126e();

        /* renamed from: f */
        List<C8678a> mo21128f();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8677e(C8678a aVar, C8672b bVar) {
        super("config_flag_checked", C18263b.f40057V);
        AnalyticsLog.LogType logType = AnalyticsLog.LogType.VIEW;
        mo21281a(PlatformAnalyticsProperty.PAGE_GUID, bVar.f19059a);
        mo21281a(PlatformAnalyticsProperty.CONTEXT_NAME, bVar.f19060b);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.mo21125c(), Arrays.asList(new String[]{aVar.mo21126e(), aVar.mo21124b()}));
        for (C8678a next : aVar.mo21128f()) {
            String a = next.mo21123a();
            if (a != null) {
                hashMap.put(next.mo21125c(), Arrays.asList(new String[]{next.mo21126e(), next.mo21124b(), a}));
            } else {
                hashMap.put(next.mo21125c(), Arrays.asList(new String[]{next.mo21126e(), next.mo21124b()}));
            }
        }
        mo21281a(PlatformAnalyticsProperty.AB, hashMap);
        mo21281a(PlatformAnalyticsProperty.CONFIG_HASH, aVar.mo21123a());
    }
}
