package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.internal.measurement.c1 */
public final class C14596c1 extends C14635f1 {

    /* renamed from: f */
    public final /* synthetic */ String f32771f;

    /* renamed from: g */
    public final /* synthetic */ zzbz f32772g;

    /* renamed from: h */
    public final /* synthetic */ C14726m1 f32773h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14596c1(C14726m1 m1Var, String str, zzbz zzbz) {
        super(m1Var, true);
        this.f32773h = m1Var;
        this.f32771f = str;
        this.f32772g = zzbz;
    }

    /* renamed from: a */
    public final void mo50280a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f32773h.f32950f)).getMaxUserProperties(this.f32771f, this.f32772g);
    }

    /* renamed from: b */
    public final void mo50397b() {
        this.f32772g.zzd((Bundle) null);
    }
}
