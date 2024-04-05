package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.s2 */
public final class C14804s2 extends C14819t5<C14804s2, C14792r2> implements C14808s6 {
    /* access modifiers changed from: private */
    public static final C14804s2 zza;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        C14804s2 s2Var = new C14804s2();
        zza = s2Var;
        C14819t5.m23959l(C14804s2.class, s2Var);
    }

    /* renamed from: q */
    public final Object mo50282q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C14589b7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C14804s2();
        } else {
            if (i2 == 4) {
                return new C14792r2(0);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
