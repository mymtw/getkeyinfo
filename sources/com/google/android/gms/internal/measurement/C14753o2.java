package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.o2 */
public final class C14753o2 extends C14819t5<C14753o2, C14740n2> implements C14808s6 {
    /* access modifiers changed from: private */
    public static final C14753o2 zza;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        C14753o2 o2Var = new C14753o2();
        zza = o2Var;
        C14819t5.m23959l(C14753o2.class, o2Var);
    }

    /* renamed from: t */
    public static C14740n2 m23806t() {
        return (C14740n2) zza.mo50871m();
    }

    /* renamed from: v */
    public static /* synthetic */ void m23808v(C14753o2 o2Var, int i) {
        o2Var.zze |= 1;
        o2Var.zzf = i;
    }

    /* renamed from: w */
    public static /* synthetic */ void m23809w(C14753o2 o2Var, long j) {
        o2Var.zze |= 2;
        o2Var.zzg = j;
    }

    /* renamed from: q */
    public final Object mo50282q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C14589b7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C14753o2();
        } else {
            if (i2 == 4) {
                return new C14740n2(0);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: r */
    public final int mo50754r() {
        return this.zzf;
    }

    /* renamed from: s */
    public final long mo50755s() {
        return this.zzg;
    }

    /* renamed from: x */
    public final boolean mo50756x() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: y */
    public final boolean mo50757y() {
        return (this.zze & 1) != 0;
    }
}
