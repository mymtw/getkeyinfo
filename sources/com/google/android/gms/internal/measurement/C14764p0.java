package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* renamed from: com.google.android.gms.internal.measurement.p0 */
public final class C14764p0 extends C14635f1 {

    /* renamed from: f */
    public final /* synthetic */ Activity f33041f;

    /* renamed from: g */
    public final /* synthetic */ String f33042g;

    /* renamed from: h */
    public final /* synthetic */ String f33043h;

    /* renamed from: i */
    public final /* synthetic */ C14726m1 f33044i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14764p0(C14726m1 m1Var, Activity activity, String str, String str2) {
        super(m1Var, true);
        this.f33044i = m1Var;
        this.f33041f = activity;
        this.f33042g = str;
        this.f33043h = str2;
    }

    /* renamed from: a */
    public final void mo50280a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f33044i.f32950f)).setCurrentScreen(ObjectWrapper.wrap(this.f33041f), this.f33042g, this.f33043h, this.f32832b);
    }
}
