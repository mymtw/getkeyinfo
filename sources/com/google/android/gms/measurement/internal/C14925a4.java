package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.a4 */
public final class C14925a4 implements Callable<List<C15000i7>> {

    /* renamed from: b */
    public final /* synthetic */ String f33266b;

    /* renamed from: c */
    public final /* synthetic */ String f33267c;

    /* renamed from: d */
    public final /* synthetic */ String f33268d;

    /* renamed from: e */
    public final /* synthetic */ zzgn f33269e;

    public C14925a4(zzgn zzgn, String str, String str2, String str3) {
        this.f33269e = zzgn;
        this.f33266b = str;
        this.f33267c = str2;
        this.f33268d = str3;
    }

    public final Object call() throws Exception {
        this.f33269e.zza.mo52019e();
        C14983h hVar = this.f33269e.zza.f33488d;
        C14973f7.m24287I(hVar);
        return hVar.mo52064N(this.f33266b, this.f33267c, this.f33268d);
    }
}
