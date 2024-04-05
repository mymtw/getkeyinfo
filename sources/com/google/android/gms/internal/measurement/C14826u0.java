package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* renamed from: com.google.android.gms.internal.measurement.u0 */
public final class C14826u0 extends C14635f1 {

    /* renamed from: f */
    public final /* synthetic */ int f33090f = 1;

    /* renamed from: g */
    public final /* synthetic */ Object f33091g;

    /* renamed from: h */
    public final /* synthetic */ Object f33092h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14826u0(C14713l1 l1Var, Activity activity) {
        super(l1Var.f32930b, true);
        this.f33092h = l1Var;
        this.f33091g = activity;
    }

    /* renamed from: a */
    public final void mo50280a() {
        switch (this.f33090f) {
            case 0:
                ((zzcc) Preconditions.checkNotNull(((C14726m1) this.f33092h).f32950f)).getGmpAppId((zzbz) this.f33091g);
                return;
            default:
                ((zzcc) Preconditions.checkNotNull(((C14713l1) this.f33092h).f32930b.f32950f)).onActivityDestroyed(ObjectWrapper.wrap((Activity) this.f33091g), this.f32833c);
                return;
        }
    }

    /* renamed from: b */
    public final void mo50397b() {
        switch (this.f33090f) {
            case 0:
                ((zzbz) this.f33091g).zzd((Bundle) null);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14826u0(C14726m1 m1Var, zzbz zzbz) {
        super(m1Var, true);
        this.f33092h = m1Var;
        this.f33091g = zzbz;
    }
}
