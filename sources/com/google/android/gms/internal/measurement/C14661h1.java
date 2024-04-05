package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* renamed from: com.google.android.gms.internal.measurement.h1 */
public final class C14661h1 extends C14635f1 {

    /* renamed from: f */
    public final /* synthetic */ Activity f32860f;

    /* renamed from: g */
    public final /* synthetic */ C14713l1 f32861g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14661h1(C14713l1 l1Var, Activity activity) {
        super(l1Var.f32930b, true);
        this.f32861g = l1Var;
        this.f32860f = activity;
    }

    /* renamed from: a */
    public final void mo50280a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f32861g.f32930b.f32950f)).onActivityStarted(ObjectWrapper.wrap(this.f32860f), this.f32833c);
    }
}
