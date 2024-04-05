package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* renamed from: com.google.android.gms.measurement.internal.k6 */
public final /* synthetic */ class C15017k6 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C15044n6 f33631b;

    /* renamed from: c */
    public final /* synthetic */ int f33632c;

    /* renamed from: d */
    public final /* synthetic */ C15049o2 f33633d;

    /* renamed from: e */
    public final /* synthetic */ Intent f33634e;

    public /* synthetic */ C15017k6(C15044n6 n6Var, int i, C15049o2 o2Var, Intent intent) {
        this.f33631b = n6Var;
        this.f33632c = i;
        this.f33633d = o2Var;
        this.f33634e = intent;
    }

    public final void run() {
        C15044n6 n6Var = this.f33631b;
        int i = this.f33632c;
        C15049o2 o2Var = this.f33633d;
        Intent intent = this.f33634e;
        if (((C15035m6) n6Var.f33709a).zzc(i)) {
            o2Var.f33732o.mo52238b(Integer.valueOf(i), "Local AppMeasurementService processed last upload request. StartId");
            n6Var.mo52268c().f33732o.mo52237a("Completed wakeful intent.");
            ((C15035m6) n6Var.f33709a).zza(intent);
        }
    }
}
