package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.internal.measurement.n0 */
public final class C14738n0 extends C14635f1 {

    /* renamed from: f */
    public final /* synthetic */ String f32958f;

    /* renamed from: g */
    public final /* synthetic */ String f32959g;

    /* renamed from: h */
    public final /* synthetic */ zzbz f32960h;

    /* renamed from: i */
    public final /* synthetic */ C14726m1 f32961i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14738n0(C14726m1 m1Var, String str, String str2, zzbz zzbz) {
        super(m1Var, true);
        this.f32961i = m1Var;
        this.f32958f = str;
        this.f32959g = str2;
        this.f32960h = zzbz;
    }

    /* renamed from: a */
    public final void mo50280a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f32961i.f32950f)).getConditionalUserProperties(this.f32958f, this.f32959g, this.f32960h);
    }

    /* renamed from: b */
    public final void mo50397b() {
        this.f32960h.zzd((Bundle) null);
    }
}
