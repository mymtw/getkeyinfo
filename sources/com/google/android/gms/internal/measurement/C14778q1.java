package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.q1 */
public final class C14778q1 extends C14819t5<C14778q1, C14765p1> implements C14808s6 {
    /* access modifiers changed from: private */
    public static final C14778q1 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private C14891z5<C14803s1> zzh = C14576a7.f32742e;
    private boolean zzi;
    private C14839v1 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        C14778q1 q1Var = new C14778q1();
        zza = q1Var;
        C14819t5.m23959l(C14778q1.class, q1Var);
    }

    /* renamed from: A */
    public static /* synthetic */ void m23855A(C14778q1 q1Var, int i, C14803s1 s1Var) {
        C14891z5<C14803s1> z5Var = q1Var.zzh;
        if (!z5Var.zzc()) {
            q1Var.zzh = C14819t5.m23957j(z5Var);
        }
        q1Var.zzh.set(i, s1Var);
    }

    /* renamed from: t */
    public static C14765p1 m23856t() {
        return (C14765p1) zza.mo50871m();
    }

    /* renamed from: z */
    public static /* synthetic */ void m23858z(C14778q1 q1Var, String str) {
        q1Var.zze |= 2;
        q1Var.zzg = str;
    }

    /* renamed from: B */
    public final boolean mo50779B() {
        return this.zzk;
    }

    /* renamed from: C */
    public final boolean mo50780C() {
        return this.zzl;
    }

    /* renamed from: D */
    public final boolean mo50781D() {
        return this.zzm;
    }

    /* renamed from: E */
    public final boolean mo50782E() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: F */
    public final boolean mo50783F() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: G */
    public final boolean mo50784G() {
        return (this.zze & 64) != 0;
    }

    /* renamed from: q */
    public final Object mo50282q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C14589b7(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", C14803s1.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        } else if (i2 == 3) {
            return new C14778q1();
        } else {
            if (i2 == 4) {
                return new C14765p1(0);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: r */
    public final int mo50785r() {
        return this.zzh.size();
    }

    /* renamed from: s */
    public final int mo50786s() {
        return this.zzf;
    }

    /* renamed from: v */
    public final C14803s1 mo50787v(int i) {
        return this.zzh.get(i);
    }

    /* renamed from: w */
    public final C14839v1 mo50788w() {
        C14839v1 v1Var = this.zzj;
        return v1Var == null ? C14839v1.m24054s() : v1Var;
    }

    /* renamed from: x */
    public final String mo50789x() {
        return this.zzg;
    }

    /* renamed from: y */
    public final C14891z5 mo50790y() {
        return this.zzh;
    }
}
