package com.etsy.android.lib.logger.perf;

import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.lib.logger.perf.a */
public final class C8704a implements C8710g {

    /* renamed from: a */
    public final C8709f f19119a;

    /* renamed from: b */
    public C8707d f19120b;

    /* renamed from: c */
    public C8707d f19121c;

    /* renamed from: d */
    public boolean f19122d;

    /* renamed from: e */
    public boolean f19123e;

    public C8704a(C8709f fVar) {
        C19383o.m32797g(fVar, "performanceTracker");
        this.f19119a = fVar;
    }

    /* renamed from: a */
    public final C8707d mo21369a() {
        if (this.f19122d && this.f19121c == null) {
            this.f19121c = this.f19119a.mo21328a(TimedMetric.BLOCKING_NETWORK);
        }
        return this.f19121c;
    }

    /* renamed from: b */
    public final void mo21370b() {
        C8707d dVar = this.f19121c;
        if (dVar != null) {
            dVar.mo21377a();
        }
    }

    /* renamed from: c */
    public final void mo21371c() {
        this.f19123e = true;
    }

    /* renamed from: d */
    public final C8707d mo21372d(boolean z) {
        this.f19122d = z;
        if (z && this.f19120b == null) {
            this.f19120b = this.f19119a.mo21328a(TimedMetric.TIME_TO_FIRST_CONTENT);
        }
        return this.f19120b;
    }

    /* renamed from: e */
    public final boolean mo21373e() {
        C8707d dVar = this.f19120b;
        if (dVar == null || !this.f19123e) {
            return false;
        }
        if (dVar != null) {
            dVar.mo21377a();
        }
        return true;
    }

    public final C8709f getPerformanceTracker() {
        return this.f19119a;
    }
}
