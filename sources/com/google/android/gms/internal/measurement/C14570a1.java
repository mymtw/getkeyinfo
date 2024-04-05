package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* renamed from: com.google.android.gms.internal.measurement.a1 */
public final class C14570a1 extends C14635f1 {

    /* renamed from: f */
    public final /* synthetic */ String f32734f = "Error with data collection. Data lost.";

    /* renamed from: g */
    public final /* synthetic */ Object f32735g;

    /* renamed from: h */
    public final /* synthetic */ C14726m1 f32736h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14570a1(C14726m1 m1Var, Object obj) {
        super(m1Var, false);
        this.f32736h = m1Var;
        this.f32735g = obj;
    }

    /* renamed from: a */
    public final void mo50280a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f32736h.f32950f)).logHealthData(5, this.f32734f, ObjectWrapper.wrap(this.f32735g), ObjectWrapper.wrap(null), ObjectWrapper.wrap(null));
    }
}
