package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.u4 */
public final class C15104u4 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ long f33897b;

    /* renamed from: c */
    public final /* synthetic */ C15007j5 f33898c;

    public C15104u4(C15007j5 j5Var, long j) {
        this.f33898c = j5Var;
        this.f33897b = j;
    }

    public final void run() {
        ((C15103u3) this.f33898c.f33681b).mo52330q().f33306k.mo52364b(this.f33897b);
        ((C15103u3) this.f33898c.f33681b).mo52016b().f33731n.mo52238b(Long.valueOf(this.f33897b), "Session timeout duration set");
    }
}
