package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.internal.measurement.v0 */
public final class C14838v0 extends C14635f1 {

    /* renamed from: f */
    public final /* synthetic */ zzbz f33118f;

    /* renamed from: g */
    public final /* synthetic */ C14726m1 f33119g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14838v0(C14726m1 m1Var, zzbz zzbz) {
        super(m1Var, true);
        this.f33119g = m1Var;
        this.f33118f = zzbz;
    }

    /* renamed from: a */
    public final void mo50280a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f33119g.f32950f)).getCachedAppInstanceId(this.f33118f);
    }

    /* renamed from: b */
    public final void mo50397b() {
        this.f33118f.zzd((Bundle) null);
    }
}
