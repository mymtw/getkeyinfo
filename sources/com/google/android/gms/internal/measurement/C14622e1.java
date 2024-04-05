package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* renamed from: com.google.android.gms.internal.measurement.e1 */
public final class C14622e1 extends C14635f1 {

    /* renamed from: f */
    public final /* synthetic */ String f32818f;

    /* renamed from: g */
    public final /* synthetic */ String f32819g;

    /* renamed from: h */
    public final /* synthetic */ Object f32820h;

    /* renamed from: i */
    public final /* synthetic */ boolean f32821i;

    /* renamed from: j */
    public final /* synthetic */ C14726m1 f32822j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14622e1(C14726m1 m1Var, String str, String str2, Object obj, boolean z) {
        super(m1Var, true);
        this.f32822j = m1Var;
        this.f32818f = str;
        this.f32819g = str2;
        this.f32820h = obj;
        this.f32821i = z;
    }

    /* renamed from: a */
    public final void mo50280a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f32822j.f32950f)).setUserProperty(this.f32818f, this.f32819g, ObjectWrapper.wrap(this.f32820h), this.f32821i, this.f32832b);
    }
}
