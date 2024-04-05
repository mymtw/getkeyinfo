package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.q2 */
public final class C14779q2 extends C14819t5<C14779q2, C14766p2> implements C14808s6 {
    /* access modifiers changed from: private */
    public static final C14779q2 zza;
    private int zze;
    private C14891z5<C14828u2> zzf = C14576a7.f32742e;
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        C14779q2 q2Var = new C14779q2();
        zza = q2Var;
        C14819t5.m23959l(C14779q2.class, q2Var);
    }

    /* renamed from: A */
    public static /* synthetic */ void m23872A(C14779q2 q2Var, int i, C14828u2 u2Var) {
        q2Var.mo50794L();
        q2Var.zzf.set(i, u2Var);
    }

    /* renamed from: B */
    public static /* synthetic */ void m23873B(C14779q2 q2Var, C14828u2 u2Var) {
        q2Var.mo50794L();
        q2Var.zzf.add(u2Var);
    }

    /* renamed from: C */
    public static /* synthetic */ void m23874C(C14779q2 q2Var, Iterable iterable) {
        q2Var.mo50794L();
        C14818t4.m23952g(iterable, q2Var.zzf);
    }

    /* renamed from: D */
    public static void m23875D(C14779q2 q2Var) {
        q2Var.zzf = C14576a7.f32742e;
    }

    /* renamed from: E */
    public static /* synthetic */ void m23876E(C14779q2 q2Var, int i) {
        q2Var.mo50794L();
        q2Var.zzf.remove(i);
    }

    /* renamed from: F */
    public static /* synthetic */ void m23877F(C14779q2 q2Var, String str) {
        str.getClass();
        q2Var.zze |= 1;
        q2Var.zzg = str;
    }

    /* renamed from: G */
    public static /* synthetic */ void m23878G(long j, C14779q2 q2Var) {
        q2Var.zze |= 2;
        q2Var.zzh = j;
    }

    /* renamed from: H */
    public static /* synthetic */ void m23879H(long j, C14779q2 q2Var) {
        q2Var.zze |= 4;
        q2Var.zzi = j;
    }

    /* renamed from: v */
    public static C14766p2 m23880v() {
        return (C14766p2) zza.mo50871m();
    }

    /* renamed from: I */
    public final boolean mo50791I() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: J */
    public final boolean mo50792J() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: K */
    public final boolean mo50793K() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: L */
    public final void mo50794L() {
        C14891z5<C14828u2> z5Var = this.zzf;
        if (!z5Var.zzc()) {
            this.zzf = C14819t5.m23957j(z5Var);
        }
    }

    /* renamed from: q */
    public final Object mo50282q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C14589b7(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", C14828u2.class, "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C14779q2();
        } else {
            if (i2 == 4) {
                return new C14766p2(0);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: r */
    public final int mo50795r() {
        return this.zzj;
    }

    /* renamed from: s */
    public final int mo50796s() {
        return this.zzf.size();
    }

    /* renamed from: t */
    public final long mo50797t() {
        return this.zzi;
    }

    /* renamed from: u */
    public final long mo50798u() {
        return this.zzh;
    }

    /* renamed from: x */
    public final C14828u2 mo50799x(int i) {
        return this.zzf.get(i);
    }

    /* renamed from: y */
    public final String mo50800y() {
        return this.zzg;
    }

    /* renamed from: z */
    public final C14891z5 mo50801z() {
        return this.zzf;
    }
}
