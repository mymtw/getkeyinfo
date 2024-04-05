package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.g6 */
public final class C14981g6 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zzeb f33536b;

    /* renamed from: c */
    public final /* synthetic */ zzjn f33537c;

    public C14981g6(zzjn zzjn, zzeb zzeb) {
        this.f33537c = zzjn;
        this.f33536b = zzeb;
    }

    public final void run() {
        synchronized (this.f33537c) {
            try {
                this.f33537c.zzb = false;
                if (!this.f33537c.zza.mo52127m()) {
                    ((C15103u3) this.f33537c.zza.f33681b).mo52016b().f33731n.mo52237a("Connected to remote service");
                    C14999i6 i6Var = this.f33537c.zza;
                    zzeb zzeb = this.f33536b;
                    i6Var.mo51995g();
                    Preconditions.checkNotNull(zzeb);
                    i6Var.f33574e = zzeb;
                    i6Var.mo52132r();
                    i6Var.mo52131q();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
