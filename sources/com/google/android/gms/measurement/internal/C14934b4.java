package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.b4 */
public final class C14934b4 implements Callable<List<zzab>> {

    /* renamed from: b */
    public final /* synthetic */ String f33281b;

    /* renamed from: c */
    public final /* synthetic */ String f33282c;

    /* renamed from: d */
    public final /* synthetic */ String f33283d;

    /* renamed from: e */
    public final /* synthetic */ zzgn f33284e;

    public C14934b4(zzgn zzgn, String str, String str2, String str3) {
        this.f33284e = zzgn;
        this.f33281b = str;
        this.f33282c = str2;
        this.f33283d = str3;
    }

    public final Object call() throws Exception {
        this.f33284e.zza.mo52019e();
        C14983h hVar = this.f33284e.zza.f33488d;
        C14973f7.m24287I(hVar);
        return hVar.mo52061K(this.f33281b, this.f33282c, this.f33283d);
    }
}
