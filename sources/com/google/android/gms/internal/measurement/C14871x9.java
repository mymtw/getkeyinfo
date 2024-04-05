package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.x9 */
public final class C14871x9 implements C14859w9 {

    /* renamed from: a */
    public static final C14677i4 f33165a;

    /* renamed from: b */
    public static final C14677i4 f33166b;

    static {
        C14716l4 l4Var = new C14716l4(C14638f4.m23568a(), false);
        f33165a = l4Var.mo50656c("measurement.sdk.collection.enable_extend_user_property_size", true);
        l4Var.mo50656c("measurement.sdk.collection.last_deep_link_referrer2", true);
        f33166b = l4Var.mo50656c("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        l4Var.mo50654a(0, "measurement.id.sdk.collection.last_deep_link_referrer2");
    }

    public final boolean zza() {
        return ((Boolean) f33165a.mo50725b()).booleanValue();
    }

    public final boolean zzb() {
        return ((Boolean) f33166b.mo50725b()).booleanValue();
    }
}
