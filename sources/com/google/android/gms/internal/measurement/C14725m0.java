package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.internal.measurement.m0 */
public final class C14725m0 extends C14635f1 {

    /* renamed from: f */
    public final /* synthetic */ String f32940f;

    /* renamed from: g */
    public final /* synthetic */ String f32941g;

    /* renamed from: h */
    public final /* synthetic */ Bundle f32942h;

    /* renamed from: i */
    public final /* synthetic */ C14726m1 f32943i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14725m0(C14726m1 m1Var, String str, String str2, Bundle bundle) {
        super(m1Var, true);
        this.f32943i = m1Var;
        this.f32940f = str;
        this.f32941g = str2;
        this.f32942h = bundle;
    }

    /* renamed from: a */
    public final void mo50280a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f32943i.f32950f)).clearConditionalUserProperty(this.f32940f, this.f32941g, this.f32942h);
    }
}
