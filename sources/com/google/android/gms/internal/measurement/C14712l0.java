package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.internal.measurement.l0 */
public final class C14712l0 extends C14635f1 {

    /* renamed from: f */
    public final /* synthetic */ Bundle f32928f;

    /* renamed from: g */
    public final /* synthetic */ C14726m1 f32929g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14712l0(C14726m1 m1Var, Bundle bundle) {
        super(m1Var, true);
        this.f32929g = m1Var;
        this.f32928f = bundle;
    }

    /* renamed from: a */
    public final void mo50280a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f32929g.f32950f)).setConditionalUserProperty(this.f32928f, this.f32832b);
    }
}
