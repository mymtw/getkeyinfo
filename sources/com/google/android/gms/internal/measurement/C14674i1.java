package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* renamed from: com.google.android.gms.internal.measurement.i1 */
public final class C14674i1 extends C14635f1 {

    /* renamed from: f */
    public final /* synthetic */ Activity f32876f;

    /* renamed from: g */
    public final /* synthetic */ C14713l1 f32877g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14674i1(C14713l1 l1Var, Activity activity) {
        super(l1Var.f32930b, true);
        this.f32877g = l1Var;
        this.f32876f = activity;
    }

    /* renamed from: a */
    public final void mo50280a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f32877g.f32930b.f32950f)).onActivityPaused(ObjectWrapper.wrap(this.f32876f), this.f32833c);
    }
}
