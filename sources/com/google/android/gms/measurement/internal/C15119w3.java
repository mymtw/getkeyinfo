package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.w3 */
public final class C15119w3 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zzab f33945b;

    /* renamed from: c */
    public final /* synthetic */ zzp f33946c;

    /* renamed from: d */
    public final /* synthetic */ zzgn f33947d;

    public C15119w3(zzgn zzgn, zzab zzab, zzp zzp) {
        this.f33947d = zzgn;
        this.f33945b = zzab;
        this.f33946c = zzp;
    }

    public final void run() {
        this.f33947d.zza.mo52019e();
        if (this.f33945b.zzc.zza() == null) {
            this.f33947d.zza.mo52028n(this.f33945b, this.f33946c);
        } else {
            this.f33947d.zza.mo52031q(this.f33945b, this.f33946c);
        }
    }
}
