package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import androidx.compose.runtime.C1339j1;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.k4 */
public final class C15015k4 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f33628b;

    /* renamed from: c */
    public final /* synthetic */ Object f33629c;

    /* renamed from: d */
    public final /* synthetic */ Object f33630d;

    public /* synthetic */ C15015k4(int i, Object obj, Object obj2) {
        this.f33628b = i;
        this.f33630d = obj;
        this.f33629c = obj2;
    }

    public final void run() {
        C1339j1 j1Var;
        switch (this.f33628b) {
            case 0:
                ((zzgn) this.f33630d).zza.mo52019e();
                ((zzgn) this.f33630d).zza.mo52027m((zzp) this.f33629c);
                return;
            case 1:
                C14999i6 i6Var = (C14999i6) this.f33630d;
                zzeb zzeb = i6Var.f33574e;
                if (zzeb == null) {
                    ((C15103u3) i6Var.f33681b).mo52016b().f33724g.mo52237a("Failed to send consent settings to service");
                    return;
                }
                try {
                    Preconditions.checkNotNull((zzp) this.f33629c);
                    zzeb.zzp((zzp) this.f33629c);
                    ((C14999i6) this.f33630d).mo52132r();
                    return;
                } catch (RemoteException e) {
                    ((C15103u3) ((C14999i6) this.f33630d).f33681b).mo52016b().f33724g.mo52238b(e, "Failed to send consent settings to the service");
                    return;
                }
            default:
                C15007j5 s = ((AppMeasurementDynamiteService) this.f33630d).zza.mo52331s();
                C1339j1 j1Var2 = (C1339j1) this.f33629c;
                s.mo51995g();
                s.mo51946h();
                if (!(j1Var2 == null || j1Var2 == (j1Var = s.f33599e))) {
                    Preconditions.checkState(j1Var == null, "EventInterceptor already set.");
                }
                s.f33599e = j1Var2;
                return;
        }
    }
}
