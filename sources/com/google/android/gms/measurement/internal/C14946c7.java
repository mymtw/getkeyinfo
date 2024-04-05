package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.c7 */
public final class C14946c7 implements Callable<String> {

    /* renamed from: b */
    public final /* synthetic */ zzp f33331b;

    /* renamed from: c */
    public final /* synthetic */ C14973f7 f33332c;

    public C14946c7(C14973f7 f7Var, zzp zzp) {
        this.f33332c = f7Var;
        this.f33331b = zzp;
    }

    public final Object call() throws Exception {
        if (this.f33332c.mo52009L((String) Preconditions.checkNotNull(this.f33331b.zza)).mo51987f() && C14956e.m24275b(this.f33331b.zzv).mo51987f()) {
            return this.f33332c.mo52007J(this.f33331b).mo52400y();
        }
        this.f33332c.mo52016b().f33732o.mo52237a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
