package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.internal.measurement.y0 */
public final class C14874y0 extends C14635f1 {

    /* renamed from: f */
    public final /* synthetic */ zzbz f33169f;

    /* renamed from: g */
    public final /* synthetic */ C14726m1 f33170g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14874y0(C14726m1 m1Var, zzbz zzbz) {
        super(m1Var, true);
        this.f33170g = m1Var;
        this.f33169f = zzbz;
    }

    /* renamed from: a */
    public final void mo50280a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f33170g.f32950f)).getCurrentScreenClass(this.f33169f);
    }

    /* renamed from: b */
    public final void mo50397b() {
        this.f33169f.zzd((Bundle) null);
    }
}
