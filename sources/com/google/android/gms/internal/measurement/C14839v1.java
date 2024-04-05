package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.v1 */
public final class C14839v1 extends C14819t5<C14839v1, C14815t1> implements C14808s6 {
    /* access modifiers changed from: private */
    public static final C14839v1 zza;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        C14839v1 v1Var = new C14839v1();
        zza = v1Var;
        C14819t5.m23959l(C14839v1.class, v1Var);
    }

    /* renamed from: s */
    public static C14839v1 m24054s() {
        return zza;
    }

    /* renamed from: A */
    public final boolean mo50933A() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: B */
    public final boolean mo50934B() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: C */
    public final int mo50935C() {
        int i;
        int i2 = this.zzf;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* renamed from: q */
    public final Object mo50282q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C14589b7(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", C14827u1.f33093a, "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C14839v1();
        } else {
            if (i2 == 4) {
                return new C14815t1();
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: t */
    public final String mo50936t() {
        return this.zzh;
    }

    /* renamed from: u */
    public final String mo50937u() {
        return this.zzj;
    }

    /* renamed from: v */
    public final String mo50938v() {
        return this.zzi;
    }

    /* renamed from: w */
    public final boolean mo50939w() {
        return this.zzg;
    }

    /* renamed from: x */
    public final boolean mo50940x() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: y */
    public final boolean mo50941y() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: z */
    public final boolean mo50942z() {
        return (this.zze & 2) != 0;
    }
}
