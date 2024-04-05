package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.aa */
public final class C14579aa implements C14895z9 {

    /* renamed from: a */
    public static final C14677i4 f32747a;

    /* renamed from: b */
    public static final C14677i4 f32748b;

    static {
        C14716l4 l4Var = new C14716l4(C14638f4.m23568a(), false);
        l4Var.mo50654a(0, "measurement.id.lifecycle.app_in_background_parameter");
        f32747a = l4Var.mo50656c("measurement.lifecycle.app_backgrounded_engagement", false);
        l4Var.mo50656c("measurement.lifecycle.app_backgrounded_tracking", true);
        f32748b = l4Var.mo50656c("measurement.lifecycle.app_in_background_parameter", false);
        l4Var.mo50654a(0, "measurement.id.lifecycle.app_backgrounded_tracking");
    }

    public final boolean zza() {
        return ((Boolean) f32747a.mo50725b()).booleanValue();
    }

    public final boolean zzb() {
        return ((Boolean) f32748b.mo50725b()).booleanValue();
    }
}
