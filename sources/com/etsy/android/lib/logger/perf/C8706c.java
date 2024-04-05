package com.etsy.android.lib.logger.perf;

import java.io.IOException;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19944e;
import okhttp3.C19989m;

/* renamed from: com.etsy.android.lib.logger.perf.c */
public final class C8706c extends C19989m {

    /* renamed from: b */
    public final C8707d f19126b;

    public C8706c(C8707d dVar) {
        C19383o.m32797g(dVar, "performanceTimer");
        this.f19126b = dVar;
    }

    /* renamed from: a */
    public final void mo21375a(C19944e eVar) {
        C19383o.m32797g(eVar, "call");
        this.f19126b.mo21377a();
    }

    /* renamed from: b */
    public final void mo21376b(C19944e eVar, IOException iOException) {
        C19383o.m32797g(eVar, "call");
        this.f19126b.mo21377a();
    }
}
