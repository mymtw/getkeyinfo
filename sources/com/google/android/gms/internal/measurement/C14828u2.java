package com.google.android.gms.internal.measurement;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.measurement.u2 */
public final class C14828u2 extends C14819t5<C14828u2, C14816t2> implements C14808s6 {
    /* access modifiers changed from: private */
    public static final C14828u2 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;
    private C14891z5<C14828u2> zzk = C14576a7.f32742e;

    static {
        C14828u2 u2Var = new C14828u2();
        zza = u2Var;
        C14819t5.m23959l(C14828u2.class, u2Var);
    }

    /* renamed from: A */
    public static /* synthetic */ void m23979A(C14828u2 u2Var, String str) {
        str.getClass();
        u2Var.zze |= 1;
        u2Var.zzf = str;
    }

    /* renamed from: B */
    public static /* synthetic */ void m23980B(C14828u2 u2Var, String str) {
        str.getClass();
        u2Var.zze |= 2;
        u2Var.zzg = str;
    }

    /* renamed from: C */
    public static /* synthetic */ void m23981C(C14828u2 u2Var) {
        u2Var.zze &= -3;
        u2Var.zzg = zza.zzg;
    }

    /* renamed from: D */
    public static /* synthetic */ void m23982D(C14828u2 u2Var, long j) {
        u2Var.zze |= 4;
        u2Var.zzh = j;
    }

    /* renamed from: E */
    public static /* synthetic */ void m23983E(C14828u2 u2Var) {
        u2Var.zze &= -5;
        u2Var.zzh = 0;
    }

    /* renamed from: F */
    public static /* synthetic */ void m23984F(C14828u2 u2Var, double d) {
        u2Var.zze |= 16;
        u2Var.zzj = d;
    }

    /* renamed from: G */
    public static /* synthetic */ void m23985G(C14828u2 u2Var) {
        u2Var.zze &= -17;
        u2Var.zzj = ShadowDrawableWrapper.COS_45;
    }

    /* renamed from: H */
    public static void m23986H(C14828u2 u2Var, C14828u2 u2Var2) {
        C14891z5<C14828u2> z5Var = u2Var.zzk;
        if (!z5Var.zzc()) {
            u2Var.zzk = C14819t5.m23957j(z5Var);
        }
        u2Var.zzk.add(u2Var2);
    }

    /* renamed from: I */
    public static void m23987I(C14828u2 u2Var, ArrayList arrayList) {
        C14891z5<C14828u2> z5Var = u2Var.zzk;
        if (!z5Var.zzc()) {
            u2Var.zzk = C14819t5.m23957j(z5Var);
        }
        C14818t4.m23952g(arrayList, u2Var.zzk);
    }

    /* renamed from: J */
    public static void m23988J(C14828u2 u2Var) {
        u2Var.zzk = C14576a7.f32742e;
    }

    /* renamed from: v */
    public static C14816t2 m23989v() {
        return (C14816t2) zza.mo50871m();
    }

    /* renamed from: K */
    public final boolean mo50878K() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: L */
    public final boolean mo50879L() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: M */
    public final boolean mo50880M() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: N */
    public final boolean mo50881N() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: O */
    public final boolean mo50882O() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: q */
    public final Object mo50282q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C14589b7(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C14828u2.class});
        } else if (i2 == 3) {
            return new C14828u2();
        } else {
            if (i2 == 4) {
                return new C14816t2(0);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: r */
    public final double mo50883r() {
        return this.zzj;
    }

    /* renamed from: s */
    public final float mo50884s() {
        return this.zzi;
    }

    /* renamed from: t */
    public final int mo50885t() {
        return this.zzk.size();
    }

    /* renamed from: u */
    public final long mo50886u() {
        return this.zzh;
    }

    /* renamed from: x */
    public final String mo50887x() {
        return this.zzf;
    }

    /* renamed from: y */
    public final String mo50888y() {
        return this.zzg;
    }

    /* renamed from: z */
    public final C14891z5 mo50889z() {
        return this.zzk;
    }
}
