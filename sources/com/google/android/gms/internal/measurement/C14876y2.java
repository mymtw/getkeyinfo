package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.y2 */
public final class C14876y2 extends C14819t5<C14876y2, C14864x2> implements C14808s6 {
    /* access modifiers changed from: private */
    public static final C14876y2 zza;
    private C14891z5<C14572a3> zze = C14576a7.f32742e;

    static {
        C14876y2 y2Var = new C14876y2();
        zza = y2Var;
        C14819t5.m23959l(C14876y2.class, y2Var);
    }

    /* renamed from: r */
    public static C14864x2 m24167r() {
        return (C14864x2) zza.mo50871m();
    }

    /* renamed from: v */
    public static /* synthetic */ void m24169v(C14876y2 y2Var, C14572a3 a3Var) {
        C14891z5<C14572a3> z5Var = y2Var.zze;
        if (!z5Var.zzc()) {
            y2Var.zze = C14819t5.m23957j(z5Var);
        }
        y2Var.zze.add(a3Var);
    }

    /* renamed from: q */
    public final Object mo50282q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C14589b7(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C14572a3.class});
        } else if (i2 == 3) {
            return new C14876y2();
        } else {
            if (i2 == 4) {
                return new C14864x2(0);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: t */
    public final C14572a3 mo50971t() {
        return this.zze.get(0);
    }

    /* renamed from: u */
    public final C14891z5 mo50972u() {
        return this.zze;
    }
}
