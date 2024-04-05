package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.e3 */
public final class C14624e3 extends C14819t5<C14624e3, C14585b3> implements C14808s6 {
    /* access modifiers changed from: private */
    public static final C14624e3 zza;
    private int zze;
    private int zzf = 1;
    private C14891z5<C14804s2> zzg = C14576a7.f32742e;

    static {
        C14624e3 e3Var = new C14624e3();
        zza = e3Var;
        C14819t5.m23959l(C14624e3.class, e3Var);
    }

    /* renamed from: q */
    public final Object mo50282q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C14589b7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", C14611d3.f32802a, "zzg", C14804s2.class});
        } else if (i2 == 3) {
            return new C14624e3();
        } else {
            if (i2 == 4) {
                return new C14585b3(0);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
