package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f9 */
public final class C14643f9 implements C14630e9 {

    /* renamed from: a */
    public static final C14677i4 f32841a;

    /* renamed from: b */
    public static final C14677i4 f32842b;

    static {
        C14716l4 l4Var = new C14716l4(C14638f4.m23568a(), false);
        f32841a = l4Var.mo50656c("measurement.client.consent.suppress_1p_in_ga4f_install", true);
        f32842b = l4Var.mo50656c("measurement.client.consent.gmpappid_worker_thread_fix", true);
    }

    public final void zza() {
    }

    public final boolean zzb() {
        return ((Boolean) f32841a.mo50725b()).booleanValue();
    }

    public final boolean zzc() {
        return ((Boolean) f32842b.mo50725b()).booleanValue();
    }
}
