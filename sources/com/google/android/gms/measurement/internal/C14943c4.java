package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.c4 */
public final class C14943c4 implements Callable<List<zzab>> {

    /* renamed from: b */
    public final /* synthetic */ String f33319b;

    /* renamed from: c */
    public final /* synthetic */ String f33320c;

    /* renamed from: d */
    public final /* synthetic */ String f33321d;

    /* renamed from: e */
    public final /* synthetic */ zzgn f33322e;

    public C14943c4(zzgn zzgn, String str, String str2, String str3) {
        this.f33322e = zzgn;
        this.f33319b = str;
        this.f33320c = str2;
        this.f33321d = str3;
    }

    public final Object call() throws Exception {
        this.f33322e.zza.mo52019e();
        C14983h hVar = this.f33322e.zza.f33488d;
        C14973f7.m24287I(hVar);
        return hVar.mo52061K(this.f33319b, this.f33320c, this.f33321d);
    }
}
