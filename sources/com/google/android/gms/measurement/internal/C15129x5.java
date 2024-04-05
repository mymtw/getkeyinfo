package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.x5 */
public final class C15129x5 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zzp f33975b;

    /* renamed from: c */
    public final /* synthetic */ boolean f33976c;

    /* renamed from: d */
    public final /* synthetic */ zzkv f33977d;

    /* renamed from: e */
    public final /* synthetic */ C14999i6 f33978e;

    public C15129x5(C14999i6 i6Var, zzp zzp, boolean z, zzkv zzkv) {
        this.f33978e = i6Var;
        this.f33975b = zzp;
        this.f33976c = z;
        this.f33977d = zzkv;
    }

    public final void run() {
        C14999i6 i6Var = this.f33978e;
        zzeb zzeb = i6Var.f33574e;
        if (zzeb == null) {
            ((C15103u3) i6Var.f33681b).mo52016b().f33724g.mo52237a("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.f33975b);
        this.f33978e.mo52125k(zzeb, this.f33976c ? null : this.f33977d, this.f33975b);
        this.f33978e.mo52132r();
    }
}
