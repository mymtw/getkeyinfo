package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* renamed from: com.google.android.gms.internal.measurement.s0 */
public final class C14802s0 extends C14635f1 {

    /* renamed from: f */
    public final /* synthetic */ int f33078f = 1;

    /* renamed from: g */
    public final /* synthetic */ Object f33079g;

    /* renamed from: h */
    public final /* synthetic */ Object f33080h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14802s0(C14713l1 l1Var, Activity activity) {
        super(l1Var.f32930b, true);
        this.f33080h = l1Var;
        this.f33079g = activity;
    }

    /* renamed from: a */
    public final void mo50280a() {
        switch (this.f33078f) {
            case 0:
                ((zzcc) Preconditions.checkNotNull(((C14726m1) this.f33080h).f32950f)).beginAdUnitExposure((String) this.f33079g, this.f32833c);
                return;
            default:
                ((zzcc) Preconditions.checkNotNull(((C14713l1) this.f33080h).f32930b.f32950f)).onActivityStopped(ObjectWrapper.wrap((Activity) this.f33079g), this.f32833c);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14802s0(C14726m1 m1Var, String str) {
        super(m1Var, true);
        this.f33080h = m1Var;
        this.f33079g = str;
    }
}
