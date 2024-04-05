package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzci;

/* renamed from: com.google.android.gms.measurement.internal.l7 */
public final class C15027l7 implements C15060p4 {

    /* renamed from: a */
    public final zzci f33666a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f33667b;

    public C15027l7(AppMeasurementDynamiteService appMeasurementDynamiteService, zzci zzci) {
        this.f33667b = appMeasurementDynamiteService;
        this.f33666a = zzci;
    }

    /* renamed from: a */
    public final void mo52234a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f33666a.zze(str, str2, bundle, j);
        } catch (RemoteException e) {
            C15103u3 u3Var = this.f33667b.zza;
            if (u3Var != null) {
                u3Var.mo52016b().f33727j.mo52238b(e, "Event listener threw exception");
            }
        }
    }
}
