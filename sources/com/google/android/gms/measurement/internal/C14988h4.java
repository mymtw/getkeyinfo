package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.h4 */
public final class C14988h4 implements Callable<byte[]> {

    /* renamed from: b */
    public final /* synthetic */ zzgn f33555b;

    public C14988h4(zzgn zzgn, zzat zzat, String str) {
        this.f33555b = zzgn;
    }

    public final Object call() throws Exception {
        this.f33555b.zza.mo52019e();
        C15052o5 o5Var = this.f33555b.zza.f33493i;
        C14973f7.m24287I(o5Var);
        o5Var.mo51995g();
        throw new IllegalStateException("Unexpected call on client side");
    }
}
