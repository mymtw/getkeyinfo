package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ka */
public final class C14709ka implements C14696ja {

    /* renamed from: a */
    public static final C14677i4 f32920a;

    /* renamed from: b */
    public static final C14690j4 f32921b;

    /* renamed from: c */
    public static final C14664h4 f32922c;

    /* renamed from: d */
    public static final C14664h4 f32923d;

    /* renamed from: e */
    public static final C14703k4 f32924e;

    static {
        C14716l4 l4Var = new C14716l4(C14638f4.m23568a(), false);
        f32920a = l4Var.mo50656c("measurement.test.boolean_flag", false);
        f32921b = new C14690j4(l4Var, Double.valueOf(-3.0d));
        f32922c = l4Var.mo50654a(-2, "measurement.test.int_flag");
        f32923d = l4Var.mo50654a(-1, "measurement.test.long_flag");
        f32924e = new C14703k4(l4Var, "measurement.test.string_flag", "---");
    }

    public final double zza() {
        return ((Double) f32921b.mo50725b()).doubleValue();
    }

    public final long zzb() {
        return ((Long) f32922c.mo50725b()).longValue();
    }

    public final long zzc() {
        return ((Long) f32923d.mo50725b()).longValue();
    }

    public final String zzd() {
        return (String) f32924e.mo50725b();
    }

    public final boolean zze() {
        return ((Boolean) f32920a.mo50725b()).booleanValue();
    }
}
