package p389lc;

import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.C8694h;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p346fa.C12703a;

/* renamed from: lc.b */
public final class C13011b {

    /* renamed from: d */
    public static boolean f28663d;

    /* renamed from: e */
    public static boolean f28664e;

    /* renamed from: a */
    public final C8694h f28665a;

    /* renamed from: b */
    public final C12703a f28666b;

    /* renamed from: c */
    public final C8672b f28667c;

    public C13011b(C8694h hVar, C12703a aVar, C8672b bVar) {
        C19383o.m32797g(hVar, "logCat");
        C19383o.m32797g(aVar, "grafana");
        C19383o.m32797g(bVar, "analyticsTracker");
        this.f28665a = hVar;
        this.f28666b = aVar;
        this.f28667c = bVar;
    }

    /* renamed from: a */
    public final void mo45808a(boolean z) {
        if (z) {
            this.f28667c.mo21333d("dark_mode_turned_on", (Map<? extends AnalyticsProperty, Object>) null);
        } else {
            this.f28667c.mo21333d("dark_mode_turned_off", (Map<? extends AnalyticsProperty, Object>) null);
        }
    }
}
