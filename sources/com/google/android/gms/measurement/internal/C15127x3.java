package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.x3 */
public final class C15127x3 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f33969b;

    /* renamed from: c */
    public final /* synthetic */ Object f33970c;

    /* renamed from: d */
    public final /* synthetic */ Object f33971d;

    public /* synthetic */ C15127x3(int i, Object obj, Object obj2) {
        this.f33969b = i;
        this.f33971d = obj;
        this.f33970c = obj2;
    }

    public final void run() {
        switch (this.f33969b) {
            case 0:
                ((zzgn) this.f33971d).zza.mo52019e();
                if (((zzab) this.f33970c).zzc.zza() == null) {
                    C14973f7 zzc = ((zzgn) this.f33971d).zza;
                    zzab zzab = (zzab) this.f33970c;
                    zzc.getClass();
                    zzp y = zzc.mo52037y((String) Preconditions.checkNotNull(zzab.zza));
                    if (y != null) {
                        zzc.mo52028n(zzab, y);
                        return;
                    }
                    return;
                }
                C14973f7 zzc2 = ((zzgn) this.f33971d).zza;
                zzab zzab2 = (zzab) this.f33970c;
                zzc2.getClass();
                zzp y2 = zzc2.mo52037y((String) Preconditions.checkNotNull(zzab2.zza));
                if (y2 != null) {
                    zzc2.mo52031q(zzab2, y2);
                    return;
                }
                return;
            default:
                synchronized (((AtomicReference) this.f33970c)) {
                    try {
                        Object obj = this.f33971d;
                        ((AtomicReference) this.f33970c).set(Long.valueOf(((C15103u3) ((C15007j5) obj).f33681b).f33878h.mo51970m(((C15103u3) ((C15007j5) obj).f33681b).mo52327n().mo52046l(), C14959e2.f33379M)));
                        ((AtomicReference) this.f33970c).notify();
                    } catch (Throwable th) {
                        ((AtomicReference) this.f33970c).notify();
                        throw th;
                    }
                }
                return;
        }
    }
}
