package com.etsy.android.lib.logger;

import android.content.Context;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.network.C8725c;
import com.etsy.android.lib.util.C8883c0;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p409o9.C13138q;
import p425q9.C13265p;
import p425q9.C13267q;
import p628nj.C18263b;

public abstract class AnalyticsLog {

    /* renamed from: a */
    public String f19035a;

    /* renamed from: b */
    public boolean f19036b;

    /* renamed from: c */
    public String f19037c;

    /* renamed from: d */
    public HashMap<String, Object> f19038d;

    /* renamed from: e */
    public final C13265p f19039e;

    public enum LogType {
        VIEW,
        RESUME_VIEW,
        CONFIG_FLAG,
        VIEW_CLICK,
        AD_HOC,
        PERF
    }

    public AnalyticsLog(String str, C13265p pVar) {
        this(str, false, (Map) null, pVar);
    }

    /* renamed from: c */
    public static String m17042c(long j) {
        return new DecimalFormat("##########.####", new DecimalFormatSymbols(Locale.ROOT)).format(((double) j) / 1000.0d);
    }

    /* renamed from: a */
    public final void mo21281a(AnalyticsProperty analyticsProperty, Object obj) {
        this.f19038d.put(analyticsProperty.readPropertyName(), obj);
    }

    /* renamed from: b */
    public final void mo21282b(Context context) {
        DefaultAnalyticsProperty defaultAnalyticsProperty = DefaultAnalyticsProperty.ORIENTATION;
        int i = context.getResources().getConfiguration().orientation;
        char c = i == 1 ? 1 : i == 2 ? (char) 0 : 65535;
        mo21281a(defaultAnalyticsProperty, c != 0 ? c != 1 ? "undefined" : "portrait" : "landscape");
    }

    public AnalyticsLog(String str, boolean z, Map map, C13265p pVar) {
        this.f19035a = str;
        this.f19037c = C8883c0.m17315a();
        this.f19036b = z;
        this.f19038d = new HashMap<>();
        this.f19039e = pVar;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                mo21281a((AnalyticsProperty) entry.getKey(), entry.getValue());
            }
        }
        mo21281a(DefaultAnalyticsProperty.EVENT_TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
        mo21281a(DefaultAnalyticsProperty.EVENT_SOURCE, "android");
        mo21281a(DefaultAnalyticsProperty.EVENT_LOGGER, "native");
        mo21281a(DefaultAnalyticsProperty.PRIMARY_EVENT, Boolean.valueOf(this.f19036b));
        mo21281a(DefaultAnalyticsProperty.BROWSER_ID, C13138q.m20808a().f28895a);
        mo21281a(DefaultAnalyticsProperty.EVENT_NAME, this.f19035a);
        mo21281a(DefaultAnalyticsProperty.GUID, this.f19037c);
        mo21281a(DefaultAnalyticsProperty.ADVERTISING_ID, C13138q.m20808a().f28898d);
        long j = 0;
        mo21281a(DefaultAnalyticsProperty.SERVER_TIMESTAMP_OFFSET, Long.valueOf(this.f19039e.f29135a.f19584a.getLong("ServerTimestampOffset", 0)));
        C13267q qVar = C18263b.f40054R;
        if (qVar.f29158d < 0) {
            qVar.f29155a.getClass();
            qVar.f29158d = System.currentTimeMillis();
        }
        if (qVar.f29159e < 0) {
            qVar.f29155a.getClass();
            qVar.f29159e = System.currentTimeMillis();
        }
        mo21281a(DefaultAnalyticsProperty.APP_INITIAL_START_TIME, m17042c(qVar.f29157c));
        mo21281a(DefaultAnalyticsProperty.APP_START_TIME, m17042c(qVar.f29158d));
        mo21281a(DefaultAnalyticsProperty.APP_FOREGROUND_TIME, m17042c(qVar.f29159e));
        mo21281a(DefaultAnalyticsProperty.APP_IN_BACKGROUND, C8725c.f19171b.toString());
        mo21281a(DefaultAnalyticsProperty.APP_VERSION, C13138q.m20808a().f28896b);
        mo21281a(DefaultAnalyticsProperty.APP_NAME, C13138q.m20808a().f28897c);
        HashMap<String, Object> hashMap = this.f19038d;
        PlatformAnalyticsProperty platformAnalyticsProperty = PlatformAnalyticsProperty.USER_ID;
        if (hashMap.get(platformAnalyticsProperty.readPropertyName()) == null) {
            EtsyId c = this.f19039e.mo45958c();
            if (this.f19039e.mo45960e() && c.hasId()) {
                j = c.getIdAsLong();
            }
            mo21281a(platformAnalyticsProperty, Long.valueOf(j));
        }
    }
}
