package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.w4 */
public final class C15120w4 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f33948b;

    /* renamed from: c */
    public final /* synthetic */ String f33949c;

    /* renamed from: d */
    public final /* synthetic */ Object f33950d;

    /* renamed from: e */
    public final /* synthetic */ long f33951e;

    /* renamed from: f */
    public final /* synthetic */ C15007j5 f33952f;

    public C15120w4(C15007j5 j5Var, String str, String str2, Object obj, long j) {
        this.f33952f = j5Var;
        this.f33948b = str;
        this.f33949c = str2;
        this.f33950d = obj;
        this.f33951e = j;
    }

    public final void run() {
        C15007j5 j5Var = this.f33952f;
        String str = this.f33948b;
        String str2 = this.f33949c;
        j5Var.mo52160v(str, this.f33951e, this.f33950d, str2);
    }
}
