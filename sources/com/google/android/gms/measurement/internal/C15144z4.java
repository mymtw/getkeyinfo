package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.z4 */
public final class C15144z4 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f34041b;

    /* renamed from: c */
    public final /* synthetic */ Object f34042c;

    /* renamed from: d */
    public final /* synthetic */ C14933b3 f34043d;

    public /* synthetic */ C15144z4(C14933b3 b3Var, Object obj, int i) {
        this.f34041b = i;
        this.f34043d = b3Var;
        this.f34042c = obj;
    }

    public final void run() {
        switch (this.f34041b) {
            case 0:
                synchronized (((AtomicReference) this.f34042c)) {
                    try {
                        C14933b3 b3Var = this.f34043d;
                        ((AtomicReference) this.f34042c).set(Boolean.valueOf(((C15103u3) ((C15007j5) b3Var).f33681b).f33878h.mo51973p(((C15103u3) ((C15007j5) b3Var).f33681b).mo52327n().mo52046l(), C14959e2.f33377K)));
                        ((AtomicReference) this.f34042c).notify();
                    } catch (Throwable th) {
                        ((AtomicReference) this.f34042c).notify();
                        throw th;
                    }
                }
                return;
            default:
                C14999i6 i6Var = (C14999i6) this.f34043d;
                zzeb zzeb = i6Var.f33574e;
                if (zzeb == null) {
                    ((C15103u3) i6Var.f33681b).mo52016b().f33724g.mo52237a("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    Preconditions.checkNotNull((zzp) this.f34042c);
                    zzeb.zzs((zzp) this.f34042c);
                    ((C14999i6) this.f34043d).mo52132r();
                    return;
                } catch (RemoteException e) {
                    ((C15103u3) ((C14999i6) this.f34043d).f33681b).mo52016b().f33724g.mo52238b(e, "Failed to send measurementEnabled to the service");
                    return;
                }
        }
    }
}
