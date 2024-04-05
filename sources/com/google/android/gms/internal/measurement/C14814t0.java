package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.internal.measurement.t0 */
public final class C14814t0 extends C14635f1 {

    /* renamed from: f */
    public final /* synthetic */ String f33086f;

    /* renamed from: g */
    public final /* synthetic */ C14726m1 f33087g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14814t0(C14726m1 m1Var, String str) {
        super(m1Var, true);
        this.f33087g = m1Var;
        this.f33086f = str;
    }

    /* renamed from: a */
    public final void mo50280a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f33087g.f32950f)).endAdUnitExposure(this.f33086f, this.f32833c);
    }
}
