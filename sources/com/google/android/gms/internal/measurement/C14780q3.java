package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.q3 */
public final class C14780q3 extends C14819t5<C14780q3, C14767p3> implements C14808s6 {
    /* access modifiers changed from: private */
    public static final C14780q3 zza;
    private int zze;
    private C14891z5<C14817t3> zzf = C14576a7.f32742e;
    private C14728m3 zzg;

    static {
        C14780q3 q3Var = new C14780q3();
        zza = q3Var;
        C14819t5.m23959l(C14780q3.class, q3Var);
    }

    /* renamed from: q */
    public final Object mo50282q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C14589b7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", C14817t3.class, "zzg"});
        } else if (i2 == 3) {
            return new C14780q3();
        } else {
            if (i2 == 4) {
                return new C14767p3();
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: r */
    public final C14728m3 mo50802r() {
        C14728m3 m3Var = this.zzg;
        return m3Var == null ? C14728m3.m23730t() : m3Var;
    }

    /* renamed from: t */
    public final C14891z5 mo50803t() {
        return this.zzf;
    }
}
