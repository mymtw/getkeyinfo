package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* renamed from: com.google.android.gms.internal.measurement.k1 */
public final class C14700k1 extends C14635f1 {

    /* renamed from: f */
    public final /* synthetic */ Activity f32905f;

    /* renamed from: g */
    public final /* synthetic */ zzbz f32906g;

    /* renamed from: h */
    public final /* synthetic */ C14713l1 f32907h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14700k1(C14713l1 l1Var, Activity activity, zzbz zzbz) {
        super(l1Var.f32930b, true);
        this.f32907h = l1Var;
        this.f32905f = activity;
        this.f32906g = zzbz;
    }

    /* renamed from: a */
    public final void mo50280a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f32907h.f32930b.f32950f)).onActivitySaveInstanceState(ObjectWrapper.wrap(this.f32905f), this.f32906g, this.f32833c);
    }
}
