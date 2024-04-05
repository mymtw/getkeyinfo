package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.measurement.l1 */
public final class C14713l1 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b */
    public final /* synthetic */ C14726m1 f32930b;

    public C14713l1(C14726m1 m1Var) {
        this.f32930b = m1Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f32930b.mo50666b(new C14648g1(this, bundle, activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f32930b.mo50666b(new C14826u0(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        this.f32930b.mo50666b(new C14674i1(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        this.f32930b.mo50666b(new C14777q0(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzbz zzbz = new zzbz();
        this.f32930b.mo50666b(new C14700k1(this, activity, zzbz));
        Bundle zzb = zzbz.zzb(50);
        if (zzb != null) {
            bundle.putAll(zzb);
        }
    }

    public final void onActivityStarted(Activity activity) {
        this.f32930b.mo50666b(new C14661h1(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        this.f32930b.mo50666b(new C14802s0(this, activity));
    }
}
