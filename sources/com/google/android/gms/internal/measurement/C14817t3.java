package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.t3 */
public final class C14817t3 extends C14819t5<C14817t3, C14793r3> implements C14808s6 {
    /* access modifiers changed from: private */
    public static final C14817t3 zza;
    private int zze;
    private int zzf;
    private C14891z5<C14817t3> zzg = C14576a7.f32742e;
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    static {
        C14817t3 t3Var = new C14817t3();
        zza = t3Var;
        C14819t5.m23959l(C14817t3.class, t3Var);
    }

    /* renamed from: A */
    public final int mo50857A() {
        int i;
        int i2 = this.zzf;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* renamed from: q */
    public final Object mo50282q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C14589b7(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", C14805s3.f33081a, "zzg", C14817t3.class, "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new C14817t3();
        } else {
            if (i2 == 4) {
                return new C14793r3();
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: r */
    public final double mo50858r() {
        return this.zzk;
    }

    /* renamed from: t */
    public final String mo50859t() {
        return this.zzh;
    }

    /* renamed from: u */
    public final String mo50860u() {
        return this.zzi;
    }

    /* renamed from: v */
    public final List<C14817t3> mo50861v() {
        return this.zzg;
    }

    /* renamed from: w */
    public final boolean mo50862w() {
        return this.zzj;
    }

    /* renamed from: x */
    public final boolean mo50863x() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: y */
    public final boolean mo50864y() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: z */
    public final boolean mo50865z() {
        return (this.zze & 4) != 0;
    }
}
