package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.internal.measurement.x0 */
public final class C14862x0 extends C14635f1 {

    /* renamed from: f */
    public final /* synthetic */ zzbz f33152f;

    /* renamed from: g */
    public final /* synthetic */ C14726m1 f33153g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14862x0(C14726m1 m1Var, zzbz zzbz) {
        super(m1Var, true);
        this.f33153g = m1Var;
        this.f33152f = zzbz;
    }

    /* renamed from: a */
    public final void mo50280a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f33153g.f32950f)).getCurrentScreenName(this.f33152f);
    }

    /* renamed from: b */
    public final void mo50397b() {
        this.f33152f.zzd((Bundle) null);
    }
}
