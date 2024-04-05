package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.z5 */
public final class C15145z5 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f34044b = 0;

    /* renamed from: c */
    public final /* synthetic */ Object f34045c;

    /* renamed from: d */
    public final /* synthetic */ Object f34046d;

    /* renamed from: e */
    public final /* synthetic */ Object f34047e;

    public C15145z5(C14999i6 i6Var, zzp zzp, Bundle bundle) {
        this.f34047e = i6Var;
        this.f34045c = zzp;
        this.f34046d = bundle;
    }

    public final void run() {
        switch (this.f34044b) {
            case 0:
                C14999i6 i6Var = (C14999i6) this.f34047e;
                zzeb zzeb = i6Var.f33574e;
                if (zzeb == null) {
                    ((C15103u3) i6Var.f33681b).mo52016b().f33724g.mo52237a("Failed to send default event parameters to service");
                    return;
                }
                try {
                    Preconditions.checkNotNull((zzp) this.f34045c);
                    zzeb.zzr((Bundle) this.f34046d, (zzp) this.f34045c);
                    return;
                } catch (RemoteException e) {
                    ((C15103u3) ((C14999i6) this.f34047e).f33681b).mo52016b().f33724g.mo52238b(e, "Failed to send default event parameters to service");
                    return;
                }
            default:
                C15044n6 n6Var = (C15044n6) this.f34045c;
                n6Var.getClass();
                ((C15049o2) this.f34046d).f33732o.mo52237a("AppMeasurementJobService processed last upload request.");
                ((C15035m6) n6Var.f33709a).zzb((JobParameters) this.f34047e, false);
                return;
        }
    }

    public /* synthetic */ C15145z5(C15044n6 n6Var, C15049o2 o2Var, JobParameters jobParameters) {
        this.f34045c = n6Var;
        this.f34046d = o2Var;
        this.f34047e = jobParameters;
    }
}
