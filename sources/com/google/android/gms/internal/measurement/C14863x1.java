package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.x1 */
public final class C14863x1 extends C14819t5<C14863x1, C14851w1> implements C14808s6 {
    /* access modifiers changed from: private */
    public static final C14863x1 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private C14803s1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        C14863x1 x1Var = new C14863x1();
        zza = x1Var;
        C14819t5.m23959l(C14863x1.class, x1Var);
    }

    /* renamed from: t */
    public static C14851w1 m24113t() {
        return (C14851w1) zza.mo50871m();
    }

    /* renamed from: w */
    public static /* synthetic */ void m24115w(C14863x1 x1Var, String str) {
        x1Var.zze |= 2;
        x1Var.zzg = str;
    }

    /* renamed from: A */
    public final boolean mo50961A() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: B */
    public final boolean mo50962B() {
        return (this.zze & 32) != 0;
    }

    /* renamed from: q */
    public final Object mo50282q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C14589b7(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new C14863x1();
        } else {
            if (i2 == 4) {
                return new C14851w1(0);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: r */
    public final int mo50963r() {
        return this.zzf;
    }

    /* renamed from: s */
    public final C14803s1 mo50964s() {
        C14803s1 s1Var = this.zzh;
        return s1Var == null ? C14803s1.m23917s() : s1Var;
    }

    /* renamed from: v */
    public final String mo50965v() {
        return this.zzg;
    }

    /* renamed from: x */
    public final boolean mo50966x() {
        return this.zzi;
    }

    /* renamed from: y */
    public final boolean mo50967y() {
        return this.zzj;
    }

    /* renamed from: z */
    public final boolean mo50968z() {
        return this.zzk;
    }
}
