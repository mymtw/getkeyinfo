package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.o1 */
public final class C14752o1 extends C14819t5<C14752o1, C14739n1> implements C14808s6 {
    /* access modifiers changed from: private */
    public static final C14752o1 zza;
    private int zze;
    private int zzf;
    private C14891z5<C14863x1> zzg;
    private C14891z5<C14778q1> zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        C14752o1 o1Var = new C14752o1();
        zza = o1Var;
        C14819t5.m23959l(C14752o1.class, o1Var);
    }

    public C14752o1() {
        C14576a7<Object> a7Var = C14576a7.f32742e;
        this.zzg = a7Var;
        this.zzh = a7Var;
    }

    /* renamed from: A */
    public static /* synthetic */ void m23794A(C14752o1 o1Var, int i, C14778q1 q1Var) {
        C14891z5<C14778q1> z5Var = o1Var.zzh;
        if (!z5Var.zzc()) {
            o1Var.zzh = C14819t5.m23957j(z5Var);
        }
        o1Var.zzh.set(i, q1Var);
    }

    /* renamed from: z */
    public static /* synthetic */ void m23796z(C14752o1 o1Var, int i, C14863x1 x1Var) {
        C14891z5<C14863x1> z5Var = o1Var.zzg;
        if (!z5Var.zzc()) {
            o1Var.zzg = C14819t5.m23957j(z5Var);
        }
        o1Var.zzg.set(i, x1Var);
    }

    /* renamed from: B */
    public final boolean mo50746B() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: q */
    public final Object mo50282q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C14589b7(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", C14863x1.class, "zzh", C14778q1.class, "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C14752o1();
        } else {
            if (i2 == 4) {
                return new C14739n1(0);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: r */
    public final int mo50747r() {
        return this.zzf;
    }

    /* renamed from: s */
    public final int mo50748s() {
        return this.zzh.size();
    }

    /* renamed from: t */
    public final int mo50749t() {
        return this.zzg.size();
    }

    /* renamed from: v */
    public final C14778q1 mo50750v(int i) {
        return this.zzh.get(i);
    }

    /* renamed from: w */
    public final C14863x1 mo50751w(int i) {
        return this.zzg.get(i);
    }

    /* renamed from: x */
    public final C14891z5 mo50752x() {
        return this.zzh;
    }

    /* renamed from: y */
    public final C14891z5 mo50753y() {
        return this.zzg;
    }
}
