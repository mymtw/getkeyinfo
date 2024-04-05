package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.o3 */
public final class C14754o3 extends C14819t5<C14754o3, C14741n3> implements C14808s6 {
    /* access modifiers changed from: private */
    public static final C14754o3 zza;
    private int zze;
    private String zzf = "";
    private C14891z5<C14817t3> zzg = C14576a7.f32742e;

    static {
        C14754o3 o3Var = new C14754o3();
        zza = o3Var;
        C14819t5.m23959l(C14754o3.class, o3Var);
    }

    /* renamed from: q */
    public final Object mo50282q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C14589b7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", C14817t3.class});
        } else if (i2 == 3) {
            return new C14754o3();
        } else {
            if (i2 == 4) {
                return new C14741n3();
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: s */
    public final String mo50758s() {
        return this.zzf;
    }

    /* renamed from: t */
    public final C14891z5 mo50759t() {
        return this.zzg;
    }
}
