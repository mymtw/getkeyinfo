package com.bugsnag.android;

import com.bugsnag.android.internal.C5763c;
import java.util.Map;

/* renamed from: com.bugsnag.android.e1 */
public final class C5737e1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C5922v0 f12216b;

    /* renamed from: c */
    public final /* synthetic */ C5744f1 f12217c;

    public C5737e1(C5744f1 f1Var, C5922v0 v0Var) {
        this.f12217c = f1Var;
        this.f12216b = v0Var;
    }

    public final void run() {
        try {
            this.f12217c.f12240a.mo16604d("InternalReportDelegate - sending internal event");
            C5763c cVar = this.f12217c.f12241b;
            C5731d0 d0Var = cVar.f12325o;
            C5747g0 a = cVar.mo16544a(this.f12216b);
            if (d0Var instanceof C5725c0) {
                Map map = (Map) a.f12256b;
                map.put("Bugsnag-Internal-Error", "bugsnag-android");
                map.remove("Bugsnag-Api-Key");
                ((C5725c0) d0Var).mo16487c(a.f12255a, this.f12216b, map);
            }
        } catch (Exception e) {
            this.f12217c.f12240a.mo16602b("Failed to report internal event to Bugsnag", e);
        }
    }
}
