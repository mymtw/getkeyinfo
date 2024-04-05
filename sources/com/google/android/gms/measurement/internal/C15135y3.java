package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.y3 */
public final class C15135y3 implements Callable<List<C15000i7>> {

    /* renamed from: b */
    public final /* synthetic */ String f33988b;

    /* renamed from: c */
    public final /* synthetic */ String f33989c;

    /* renamed from: d */
    public final /* synthetic */ String f33990d;

    /* renamed from: e */
    public final /* synthetic */ zzgn f33991e;

    public C15135y3(zzgn zzgn, String str, String str2, String str3) {
        this.f33991e = zzgn;
        this.f33988b = str;
        this.f33989c = str2;
        this.f33990d = str3;
    }

    public final Object call() throws Exception {
        this.f33991e.zza.mo52019e();
        C14983h hVar = this.f33991e.zza.f33488d;
        C14973f7.m24287I(hVar);
        return hVar.mo52064N(this.f33988b, this.f33989c, this.f33990d);
    }
}
