package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* renamed from: com.google.android.gms.internal.measurement.g1 */
public final class C14648g1 extends C14635f1 {

    /* renamed from: f */
    public final /* synthetic */ Bundle f32845f;

    /* renamed from: g */
    public final /* synthetic */ Activity f32846g;

    /* renamed from: h */
    public final /* synthetic */ C14713l1 f32847h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14648g1(C14713l1 l1Var, Bundle bundle, Activity activity) {
        super(l1Var.f32930b, true);
        this.f32847h = l1Var;
        this.f32845f = bundle;
        this.f32846g = activity;
    }

    /* renamed from: a */
    public final void mo50280a() throws RemoteException {
        Bundle bundle;
        if (this.f32845f != null) {
            bundle = new Bundle();
            if (this.f32845f.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f32845f.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((zzcc) Preconditions.checkNotNull(this.f32847h.f32930b.f32950f)).onActivityCreated(ObjectWrapper.wrap(this.f32846g), bundle, this.f32833c);
    }
}
