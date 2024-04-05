package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.m3 */
public final class C14728m3 extends C14819t5<C14728m3, C14715l3> implements C14808s6 {
    /* access modifiers changed from: private */
    public static final C14728m3 zza;
    private C14891z5<C14754o3> zze = C14576a7.f32742e;

    static {
        C14728m3 m3Var = new C14728m3();
        zza = m3Var;
        C14819t5.m23959l(C14728m3.class, m3Var);
    }

    /* renamed from: t */
    public static C14728m3 m23730t() {
        return zza;
    }

    /* renamed from: q */
    public final Object mo50282q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C14589b7(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C14754o3.class});
        } else if (i2 == 3) {
            return new C14728m3();
        } else {
            if (i2 == 4) {
                return new C14715l3();
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: r */
    public final int mo50677r() {
        return this.zze.size();
    }

    /* renamed from: u */
    public final C14891z5 mo50678u() {
        return this.zze;
    }
}
