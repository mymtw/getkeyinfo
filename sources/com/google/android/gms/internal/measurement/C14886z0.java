package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.internal.measurement.z0 */
public final class C14886z0 extends C14635f1 {

    /* renamed from: f */
    public final /* synthetic */ String f33178f;

    /* renamed from: g */
    public final /* synthetic */ String f33179g;

    /* renamed from: h */
    public final /* synthetic */ boolean f33180h;

    /* renamed from: i */
    public final /* synthetic */ zzbz f33181i;

    /* renamed from: j */
    public final /* synthetic */ C14726m1 f33182j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14886z0(C14726m1 m1Var, String str, String str2, boolean z, zzbz zzbz) {
        super(m1Var, true);
        this.f33182j = m1Var;
        this.f33178f = str;
        this.f33179g = str2;
        this.f33180h = z;
        this.f33181i = zzbz;
    }

    /* renamed from: a */
    public final void mo50280a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f33182j.f32950f)).getUserProperties(this.f33178f, this.f33179g, this.f33180h, this.f33181i);
    }

    /* renamed from: b */
    public final void mo50397b() {
        this.f33181i.zzd((Bundle) null);
    }
}
