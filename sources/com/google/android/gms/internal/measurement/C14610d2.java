package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.d2 */
public final class C14610d2 extends C14819t5<C14610d2, C14584b2> implements C14808s6 {
    /* access modifiers changed from: private */
    public static final C14610d2 zza;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        C14610d2 d2Var = new C14610d2();
        zza = d2Var;
        C14819t5.m23959l(C14610d2.class, d2Var);
    }

    /* renamed from: u */
    public static /* synthetic */ void m23428u(C14610d2 d2Var, String str) {
        str.getClass();
        d2Var.zze |= 1;
        d2Var.zzf = str;
    }

    /* renamed from: q */
    public final Object mo50282q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C14589b7(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C14610d2();
        } else {
            if (i2 == 4) {
                return new C14584b2(0);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: r */
    public final int mo50447r() {
        return this.zzi;
    }

    /* renamed from: t */
    public final String mo50448t() {
        return this.zzf;
    }

    /* renamed from: v */
    public final boolean mo50449v() {
        return this.zzg;
    }

    /* renamed from: w */
    public final boolean mo50450w() {
        return this.zzh;
    }

    /* renamed from: x */
    public final boolean mo50451x() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: y */
    public final boolean mo50452y() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: z */
    public final boolean mo50453z() {
        return (this.zze & 8) != 0;
    }
}
