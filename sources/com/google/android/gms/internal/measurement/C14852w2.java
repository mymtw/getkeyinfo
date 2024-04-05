package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.w2 */
public final class C14852w2 extends C14819t5<C14852w2, C14840v2> implements C14808s6 {
    /* access modifiers changed from: private */
    public static final C14852w2 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private C14701k2 zzh;

    static {
        C14852w2 w2Var = new C14852w2();
        zza = w2Var;
        C14819t5.m23959l(C14852w2.class, w2Var);
    }

    /* renamed from: q */
    public final Object mo50282q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C14589b7(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C14852w2();
        } else {
            if (i2 == 4) {
                return new C14840v2();
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
