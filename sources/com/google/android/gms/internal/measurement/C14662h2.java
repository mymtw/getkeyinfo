package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.h2 */
public final class C14662h2 extends C14819t5<C14662h2, C14649g2> implements C14808s6 {
    /* access modifiers changed from: private */
    public static final C14662h2 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        C14662h2 h2Var = new C14662h2();
        zza = h2Var;
        C14819t5.m23959l(C14662h2.class, h2Var);
    }

    /* renamed from: q */
    public final Object mo50282q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C14589b7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C14662h2();
        } else {
            if (i2 == 4) {
                return new C14649g2();
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: s */
    public final String mo50556s() {
        return this.zzf;
    }

    /* renamed from: t */
    public final String mo50557t() {
        return this.zzg;
    }
}
