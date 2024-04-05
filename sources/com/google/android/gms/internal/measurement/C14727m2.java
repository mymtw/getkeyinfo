package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.m2 */
public final class C14727m2 extends C14819t5<C14727m2, C14714l2> implements C14808s6 {
    /* access modifiers changed from: private */
    public static final C14727m2 zza;
    private int zze;
    private int zzf;
    private C14650g3 zzg;
    private C14650g3 zzh;
    private boolean zzi;

    static {
        C14727m2 m2Var = new C14727m2();
        zza = m2Var;
        C14819t5.m23959l(C14727m2.class, m2Var);
    }

    /* renamed from: s */
    public static C14714l2 m23715s() {
        return (C14714l2) zza.mo50871m();
    }

    /* renamed from: w */
    public static /* synthetic */ void m23717w(C14727m2 m2Var, int i) {
        m2Var.zze |= 1;
        m2Var.zzf = i;
    }

    /* renamed from: x */
    public static /* synthetic */ void m23718x(C14727m2 m2Var, C14650g3 g3Var) {
        m2Var.zzg = g3Var;
        m2Var.zze |= 2;
    }

    /* renamed from: y */
    public static /* synthetic */ void m23719y(C14727m2 m2Var, C14650g3 g3Var) {
        m2Var.zzh = g3Var;
        m2Var.zze |= 4;
    }

    /* renamed from: z */
    public static /* synthetic */ void m23720z(C14727m2 m2Var, boolean z) {
        m2Var.zze |= 8;
        m2Var.zzi = z;
    }

    /* renamed from: A */
    public final boolean mo50670A() {
        return this.zzi;
    }

    /* renamed from: B */
    public final boolean mo50671B() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: C */
    public final boolean mo50672C() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: D */
    public final boolean mo50673D() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: q */
    public final Object mo50282q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C14589b7(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C14727m2();
        } else {
            if (i2 == 4) {
                return new C14714l2(0);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: r */
    public final int mo50674r() {
        return this.zzf;
    }

    /* renamed from: u */
    public final C14650g3 mo50675u() {
        C14650g3 g3Var = this.zzg;
        return g3Var == null ? C14650g3.m23589y() : g3Var;
    }

    /* renamed from: v */
    public final C14650g3 mo50676v() {
        C14650g3 g3Var = this.zzh;
        return g3Var == null ? C14650g3.m23589y() : g3Var;
    }
}
