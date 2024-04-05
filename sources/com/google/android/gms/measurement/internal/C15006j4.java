package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.j4 */
public final class C15006j4 implements Callable<List<C15000i7>> {

    /* renamed from: b */
    public final /* synthetic */ String f33596b;

    /* renamed from: c */
    public final /* synthetic */ zzgn f33597c;

    public C15006j4(zzgn zzgn, String str) {
        this.f33597c = zzgn;
        this.f33596b = str;
    }

    public final Object call() throws Exception {
        this.f33597c.zza.mo52019e();
        C14983h hVar = this.f33597c.zza.f33488d;
        C14973f7.m24287I(hVar);
        return hVar.mo52063M(this.f33596b);
    }
}
