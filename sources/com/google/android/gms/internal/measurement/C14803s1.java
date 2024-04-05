package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.s1 */
public final class C14803s1 extends C14819t5<C14803s1, C14791r1> implements C14808s6 {
    /* access modifiers changed from: private */
    public static final C14803s1 zza;
    private int zze;
    private C14571a2 zzf;
    private C14839v1 zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        C14803s1 s1Var = new C14803s1();
        zza = s1Var;
        C14819t5.m23959l(C14803s1.class, s1Var);
    }

    /* renamed from: s */
    public static C14803s1 m23917s() {
        return zza;
    }

    /* renamed from: w */
    public static /* synthetic */ void m23918w(C14803s1 s1Var, String str) {
        s1Var.zze |= 8;
        s1Var.zzi = str;
    }

    /* renamed from: A */
    public final boolean mo50834A() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: B */
    public final boolean mo50835B() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: q */
    public final Object mo50282q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C14589b7(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C14803s1();
        } else {
            if (i2 == 4) {
                return new C14791r1(0);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: t */
    public final C14839v1 mo50836t() {
        C14839v1 v1Var = this.zzg;
        return v1Var == null ? C14839v1.m24054s() : v1Var;
    }

    /* renamed from: u */
    public final C14571a2 mo50837u() {
        C14571a2 a2Var = this.zzf;
        return a2Var == null ? C14571a2.m23241t() : a2Var;
    }

    /* renamed from: v */
    public final String mo50838v() {
        return this.zzi;
    }

    /* renamed from: x */
    public final boolean mo50839x() {
        return this.zzh;
    }

    /* renamed from: y */
    public final boolean mo50840y() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: z */
    public final boolean mo50841z() {
        return (this.zze & 2) != 0;
    }
}
