package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.f2 */
public final class C14636f2 extends C14819t5<C14636f2, C14623e2> implements C14808s6 {
    /* access modifiers changed from: private */
    public static final C14636f2 zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private int zzh;
    private C14891z5<C14662h2> zzi;
    private C14891z5<C14610d2> zzj;
    private C14891z5<C14752o1> zzk;
    private String zzl;
    private boolean zzm;
    private C14891z5<C14780q3> zzn;

    static {
        C14636f2 f2Var = new C14636f2();
        zza = f2Var;
        C14819t5.m23959l(C14636f2.class, f2Var);
    }

    public C14636f2() {
        C14576a7<Object> a7Var = C14576a7.f32742e;
        this.zzi = a7Var;
        this.zzj = a7Var;
        this.zzk = a7Var;
        this.zzl = "";
        this.zzn = a7Var;
    }

    /* renamed from: C */
    public static /* synthetic */ void m23547C(C14636f2 f2Var, int i, C14610d2 d2Var) {
        C14891z5<C14610d2> z5Var = f2Var.zzj;
        if (!z5Var.zzc()) {
            f2Var.zzj = C14819t5.m23957j(z5Var);
        }
        f2Var.zzj.set(i, d2Var);
    }

    /* renamed from: D */
    public static void m23548D(C14636f2 f2Var) {
        f2Var.zzk = C14576a7.f32742e;
    }

    /* renamed from: v */
    public static C14623e2 m23549v() {
        return (C14623e2) zza.mo50871m();
    }

    /* renamed from: x */
    public static C14636f2 m23551x() {
        return zza;
    }

    /* renamed from: A */
    public final C14891z5 mo50504A() {
        return this.zzn;
    }

    /* renamed from: B */
    public final List<C14662h2> mo50505B() {
        return this.zzi;
    }

    /* renamed from: E */
    public final boolean mo50506E() {
        return this.zzm;
    }

    /* renamed from: F */
    public final boolean mo50507F() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: G */
    public final boolean mo50508G() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: q */
    public final Object mo50282q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C14589b7(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C14662h2.class, "zzj", C14610d2.class, "zzk", C14752o1.class, "zzl", "zzm", "zzn", C14780q3.class});
        } else if (i2 == 3) {
            return new C14636f2();
        } else {
            if (i2 == 4) {
                return new C14623e2(0);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: r */
    public final int mo50509r() {
        return this.zzn.size();
    }

    /* renamed from: s */
    public final int mo50510s() {
        return this.zzj.size();
    }

    /* renamed from: t */
    public final long mo50511t() {
        return this.zzf;
    }

    /* renamed from: u */
    public final C14610d2 mo50512u(int i) {
        return this.zzj.get(i);
    }

    /* renamed from: y */
    public final String mo50513y() {
        return this.zzg;
    }

    /* renamed from: z */
    public final C14891z5 mo50514z() {
        return this.zzk;
    }
}
