package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* renamed from: com.google.android.gms.internal.measurement.q0 */
public final class C14777q0 extends C14635f1 {

    /* renamed from: f */
    public final /* synthetic */ int f33051f = 1;

    /* renamed from: g */
    public final /* synthetic */ Object f33052g;

    /* renamed from: h */
    public final /* synthetic */ Object f33053h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14777q0(C14713l1 l1Var, Activity activity) {
        super(l1Var.f32930b, true);
        this.f33053h = l1Var;
        this.f33052g = activity;
    }

    /* renamed from: a */
    public final void mo50280a() {
        switch (this.f33051f) {
            case 0:
                if (((Boolean) this.f33052g) != null) {
                    ((zzcc) Preconditions.checkNotNull(((C14726m1) this.f33053h).f32950f)).setMeasurementEnabled(((Boolean) this.f33052g).booleanValue(), this.f32832b);
                    return;
                } else {
                    ((zzcc) Preconditions.checkNotNull(((C14726m1) this.f33053h).f32950f)).clearMeasurementEnabled(this.f32832b);
                    return;
                }
            default:
                ((zzcc) Preconditions.checkNotNull(((C14713l1) this.f33053h).f32930b.f32950f)).onActivityResumed(ObjectWrapper.wrap((Activity) this.f33052g), this.f32833c);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14777q0(C14726m1 m1Var, Boolean bool) {
        super(m1Var, true);
        this.f33053h = m1Var;
        this.f33052g = bool;
    }
}
