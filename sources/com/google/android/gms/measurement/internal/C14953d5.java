package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.d5 */
public final class C14953d5 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C14956e f33352b;

    /* renamed from: c */
    public final /* synthetic */ long f33353c;

    /* renamed from: d */
    public final /* synthetic */ int f33354d;

    /* renamed from: e */
    public final /* synthetic */ long f33355e;

    /* renamed from: f */
    public final /* synthetic */ boolean f33356f;

    /* renamed from: g */
    public final /* synthetic */ C15007j5 f33357g;

    public C14953d5(C15007j5 j5Var, C14956e eVar, long j, int i, long j2, boolean z) {
        this.f33357g = j5Var;
        this.f33352b = eVar;
        this.f33353c = j;
        this.f33354d = i;
        this.f33355e = j2;
        this.f33356f = z;
    }

    public final void run() {
        this.f33357g.mo52158t(this.f33352b);
        this.f33357g.mo52154p(this.f33353c, false);
        C15007j5.m24433A(this.f33357g, this.f33352b, this.f33354d, this.f33355e, true, this.f33356f);
    }
}
