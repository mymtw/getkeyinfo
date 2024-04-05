package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.y5 */
public final class C15137y5 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f33995b;

    /* renamed from: c */
    public final /* synthetic */ zzp f33996c;

    /* renamed from: d */
    public final /* synthetic */ C14999i6 f33997d;

    public C15137y5(C14999i6 i6Var, AtomicReference atomicReference, zzp zzp) {
        this.f33997d = i6Var;
        this.f33995b = atomicReference;
        this.f33996c = zzp;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f33995b) {
            try {
                if (!((C15103u3) this.f33997d.f33681b).mo52330q().mo51955m().mo51987f()) {
                    ((C15103u3) this.f33997d.f33681b).mo52016b().f33729l.mo52237a("Analytics storage consent denied; will not get app instance id");
                    ((C15103u3) this.f33997d.f33681b).mo52331s().f33602h.set((Object) null);
                    ((C15103u3) this.f33997d.f33681b).mo52330q().f33302g.mo51938b((String) null);
                    this.f33995b.set((Object) null);
                    this.f33995b.notify();
                    return;
                }
                C14999i6 i6Var = this.f33997d;
                zzeb zzeb = i6Var.f33574e;
                if (zzeb == null) {
                    ((C15103u3) i6Var.f33681b).mo52016b().f33724g.mo52237a("Failed to get app instance id");
                    this.f33995b.notify();
                    return;
                }
                Preconditions.checkNotNull(this.f33996c);
                this.f33995b.set(zzeb.zzd(this.f33996c));
                String str = (String) this.f33995b.get();
                if (str != null) {
                    ((C15103u3) this.f33997d.f33681b).mo52331s().f33602h.set(str);
                    ((C15103u3) this.f33997d.f33681b).mo52330q().f33302g.mo51938b(str);
                }
                this.f33997d.mo52132r();
                atomicReference = this.f33995b;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    ((C15103u3) this.f33997d.f33681b).mo52016b().f33724g.mo52238b(e, "Failed to get app instance id");
                    atomicReference = this.f33995b;
                } catch (Throwable th) {
                    this.f33995b.notify();
                    throw th;
                }
            }
        }
    }
}
