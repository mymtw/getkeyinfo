package p334da;

import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.AnalyticsLogDatabaseHelper;
import com.etsy.android.lib.util.CrashUtil;
import kotlin.jvm.internal.C19383o;

/* renamed from: da.a */
public final class C12630a {

    /* renamed from: a */
    public final AnalyticsLogDatabaseHelper f27853a;

    /* renamed from: b */
    public final CrashUtil f27854b;

    /* renamed from: c */
    public final C8618c f27855c;

    public C12630a(AnalyticsLogDatabaseHelper analyticsLogDatabaseHelper, CrashUtil crashUtil, C8618c cVar) {
        C19383o.m32797g(analyticsLogDatabaseHelper, "analyticsDbHelper");
        C19383o.m32797g(crashUtil, "crashUtil");
        C19383o.m32797g(cVar, "configMap");
        this.f27853a = analyticsLogDatabaseHelper;
        this.f27854b = crashUtil;
        this.f27855c = cVar;
    }
}
