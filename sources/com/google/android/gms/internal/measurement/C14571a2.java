package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.a2 */
public final class C14571a2 extends C14819t5<C14571a2, C14875y1> implements C14808s6 {
    /* access modifiers changed from: private */
    public static final C14571a2 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private boolean zzh;
    private C14891z5<String> zzi = C14576a7.f32742e;

    static {
        C14571a2 a2Var = new C14571a2();
        zza = a2Var;
        C14819t5.m23959l(C14571a2.class, a2Var);
    }

    /* renamed from: t */
    public static C14571a2 m23241t() {
        return zza;
    }

    /* renamed from: A */
    public final int mo50281A() {
        int a = C14866x4.m24128a(this.zzf);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: q */
    public final Object mo50282q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C14589b7(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", C14887z1.f33183a, "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C14571a2();
        } else {
            if (i2 == 4) {
                return new C14875y1();
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: r */
    public final int mo50283r() {
        return this.zzi.size();
    }

    /* renamed from: u */
    public final String mo50284u() {
        return this.zzg;
    }

    /* renamed from: v */
    public final List<String> mo50285v() {
        return this.zzi;
    }

    /* renamed from: w */
    public final boolean mo50286w() {
        return this.zzh;
    }

    /* renamed from: x */
    public final boolean mo50287x() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: y */
    public final boolean mo50288y() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: z */
    public final boolean mo50289z() {
        return (this.zze & 1) != 0;
    }
}
