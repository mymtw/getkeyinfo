package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.internal.measurement.d1 */
public final class C14609d1 extends C14635f1 {

    /* renamed from: f */
    public final /* synthetic */ Long f32795f = null;

    /* renamed from: g */
    public final /* synthetic */ String f32796g;

    /* renamed from: h */
    public final /* synthetic */ String f32797h;

    /* renamed from: i */
    public final /* synthetic */ Bundle f32798i;

    /* renamed from: j */
    public final /* synthetic */ boolean f32799j;

    /* renamed from: k */
    public final /* synthetic */ boolean f32800k;

    /* renamed from: l */
    public final /* synthetic */ C14726m1 f32801l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14609d1(C14726m1 m1Var, String str, String str2, Bundle bundle, boolean z) {
        super(m1Var, true);
        this.f32801l = m1Var;
        this.f32796g = str;
        this.f32797h = str2;
        this.f32798i = bundle;
        this.f32799j = z;
        this.f32800k = true;
    }

    /* renamed from: a */
    public final void mo50280a() throws RemoteException {
        Long l = this.f32795f;
        ((zzcc) Preconditions.checkNotNull(this.f32801l.f32950f)).logEvent(this.f32796g, this.f32797h, this.f32798i, this.f32799j, this.f32800k, l == null ? this.f32832b : l.longValue());
    }
}
