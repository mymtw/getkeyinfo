package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.i4 */
public final class C14997i4 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zzkv f33566b;

    /* renamed from: c */
    public final /* synthetic */ zzp f33567c;

    /* renamed from: d */
    public final /* synthetic */ zzgn f33568d;

    public C14997i4(zzgn zzgn, zzkv zzkv, zzp zzp) {
        this.f33568d = zzgn;
        this.f33566b = zzkv;
        this.f33567c = zzp;
    }

    public final void run() {
        this.f33568d.zza.mo52019e();
        if (this.f33566b.zza() == null) {
            this.f33568d.zza.mo52029o(this.f33566b, this.f33567c);
        } else {
            this.f33568d.zza.mo52033s(this.f33566b, this.f33567c);
        }
    }
}
