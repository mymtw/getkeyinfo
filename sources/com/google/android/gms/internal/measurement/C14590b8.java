package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.b8 */
public final class C14590b8 implements C14577a8 {

    /* renamed from: a */
    public static final C14677i4 f32761a;

    /* renamed from: b */
    public static final C14677i4 f32762b;

    /* renamed from: c */
    public static final C14677i4 f32763c;

    /* renamed from: d */
    public static final C14677i4 f32764d;

    /* renamed from: e */
    public static final C14677i4 f32765e;

    static {
        C14716l4 l4Var = new C14716l4(C14638f4.m23568a(), true);
        f32761a = l4Var.mo50656c("measurement.adid_zero.app_instance_id_fix", true);
        f32762b = l4Var.mo50656c("measurement.adid_zero.service", false);
        f32763c = l4Var.mo50656c("measurement.adid_zero.adid_uid", false);
        l4Var.mo50654a(0, "measurement.id.adid_zero.service");
        f32764d = l4Var.mo50656c("measurement.adid_zero.remove_lair_if_adidzero_false", true);
        f32765e = l4Var.mo50656c("measurement.adid_zero.remove_lair_if_userid_cleared", true);
    }

    public final void zza() {
    }

    public final boolean zzb() {
        return ((Boolean) f32761a.mo50725b()).booleanValue();
    }

    public final boolean zzc() {
        return ((Boolean) f32762b.mo50725b()).booleanValue();
    }

    public final boolean zzd() {
        return ((Boolean) f32763c.mo50725b()).booleanValue();
    }

    public final boolean zze() {
        return ((Boolean) f32764d.mo50725b()).booleanValue();
    }

    public final boolean zzf() {
        return ((Boolean) f32765e.mo50725b()).booleanValue();
    }
}
