package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.f5 */
public final class C14971f5 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C14956e f33472b;

    /* renamed from: c */
    public final /* synthetic */ int f33473c;

    /* renamed from: d */
    public final /* synthetic */ long f33474d;

    /* renamed from: e */
    public final /* synthetic */ boolean f33475e;

    /* renamed from: f */
    public final /* synthetic */ C15007j5 f33476f;

    public C14971f5(C15007j5 j5Var, C14956e eVar, int i, long j, boolean z) {
        this.f33476f = j5Var;
        this.f33472b = eVar;
        this.f33473c = i;
        this.f33474d = j;
        this.f33475e = z;
    }

    public final void run() {
        this.f33476f.mo52158t(this.f33472b);
        C15007j5.m24433A(this.f33476f, this.f33472b, this.f33473c, this.f33474d, false, this.f33475e);
    }
}
