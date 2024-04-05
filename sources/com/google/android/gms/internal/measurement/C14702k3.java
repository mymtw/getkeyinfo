package com.google.android.gms.internal.measurement;

import com.google.android.material.shadow.ShadowDrawableWrapper;

/* renamed from: com.google.android.gms.internal.measurement.k3 */
public final class C14702k3 extends C14819t5<C14702k3, C14689j3> implements C14808s6 {
    /* access modifiers changed from: private */
    public static final C14702k3 zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        C14702k3 k3Var = new C14702k3();
        zza = k3Var;
        C14819t5.m23959l(C14702k3.class, k3Var);
    }

    /* renamed from: A */
    public static /* synthetic */ void m23664A(C14702k3 k3Var, String str) {
        str.getClass();
        k3Var.zze |= 4;
        k3Var.zzh = str;
    }

    /* renamed from: B */
    public static /* synthetic */ void m23665B(C14702k3 k3Var) {
        k3Var.zze &= -5;
        k3Var.zzh = zza.zzh;
    }

    /* renamed from: C */
    public static /* synthetic */ void m23666C(C14702k3 k3Var, long j) {
        k3Var.zze |= 8;
        k3Var.zzi = j;
    }

    /* renamed from: D */
    public static /* synthetic */ void m23667D(C14702k3 k3Var) {
        k3Var.zze &= -9;
        k3Var.zzi = 0;
    }

    /* renamed from: E */
    public static /* synthetic */ void m23668E(C14702k3 k3Var, double d) {
        k3Var.zze |= 32;
        k3Var.zzk = d;
    }

    /* renamed from: F */
    public static /* synthetic */ void m23669F(C14702k3 k3Var) {
        k3Var.zze &= -33;
        k3Var.zzk = ShadowDrawableWrapper.COS_45;
    }

    /* renamed from: u */
    public static C14689j3 m23670u() {
        return (C14689j3) zza.mo50871m();
    }

    /* renamed from: y */
    public static /* synthetic */ void m23672y(C14702k3 k3Var, long j) {
        k3Var.zze |= 1;
        k3Var.zzf = j;
    }

    /* renamed from: z */
    public static /* synthetic */ void m23673z(C14702k3 k3Var, String str) {
        str.getClass();
        k3Var.zze |= 2;
        k3Var.zzg = str;
    }

    /* renamed from: G */
    public final boolean mo50622G() {
        return (this.zze & 32) != 0;
    }

    /* renamed from: H */
    public final boolean mo50623H() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: I */
    public final boolean mo50624I() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: J */
    public final boolean mo50625J() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: q */
    public final Object mo50282q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C14589b7(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new C14702k3();
        } else {
            if (i2 == 4) {
                return new C14689j3(0);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: r */
    public final double mo50626r() {
        return this.zzk;
    }

    /* renamed from: s */
    public final long mo50627s() {
        return this.zzi;
    }

    /* renamed from: t */
    public final long mo50628t() {
        return this.zzf;
    }

    /* renamed from: w */
    public final String mo50629w() {
        return this.zzg;
    }

    /* renamed from: x */
    public final String mo50630x() {
        return this.zzh;
    }
}
