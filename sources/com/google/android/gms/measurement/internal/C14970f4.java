package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C14722la;

/* renamed from: com.google.android.gms.measurement.internal.f4 */
public final class C14970f4 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zzat f33469b;

    /* renamed from: c */
    public final /* synthetic */ zzp f33470c;

    /* renamed from: d */
    public final /* synthetic */ zzgn f33471d;

    public C14970f4(zzgn zzgn, zzat zzat, zzp zzp) {
        this.f33471d = zzgn;
        this.f33469b = zzat;
        this.f33470c = zzp;
    }

    public final void run() {
        zzat zzb = this.f33471d.zzb(this.f33469b, this.f33470c);
        C14722la.m23700b();
        if (this.f33471d.zza.mo52008K().mo51973p((String) null, C14959e2.f33426q0)) {
            this.f33471d.zzw(zzb, this.f33470c);
        } else {
            this.f33471d.zzB(zzb, this.f33470c);
        }
    }
}
