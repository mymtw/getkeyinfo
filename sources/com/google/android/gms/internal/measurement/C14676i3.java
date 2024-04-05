package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.i3 */
public final class C14676i3 extends C14819t5<C14676i3, C14663h3> implements C14808s6 {
    /* access modifiers changed from: private */
    public static final C14676i3 zza;
    private int zze;
    private int zzf;
    private C14879y5 zzg = C14666h6.f32866e;

    static {
        C14676i3 i3Var = new C14676i3();
        zza = i3Var;
        C14819t5.m23959l(C14676i3.class, i3Var);
    }

    /* renamed from: u */
    public static C14663h3 m23626u() {
        return (C14663h3) zza.mo50871m();
    }

    /* renamed from: x */
    public static /* synthetic */ void m23628x(C14676i3 i3Var, int i) {
        i3Var.zze |= 1;
        i3Var.zzf = i;
    }

    /* renamed from: y */
    public static void m23629y(C14676i3 i3Var, List list) {
        C14879y5 y5Var = i3Var.zzg;
        if (!((C14830u4) y5Var).f33094b) {
            i3Var.zzg = C14819t5.m23961p(y5Var);
        }
        C14818t4.m23952g(list, i3Var.zzg);
    }

    /* renamed from: q */
    public final Object mo50282q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C14589b7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C14676i3();
        } else {
            if (i2 == 4) {
                return new C14663h3(0);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: r */
    public final int mo50584r() {
        return ((C14666h6) this.zzg).f32868d;
    }

    /* renamed from: s */
    public final int mo50585s() {
        return this.zzf;
    }

    /* renamed from: t */
    public final long mo50586t(int i) {
        C14666h6 h6Var = (C14666h6) this.zzg;
        h6Var.mo50564g(i);
        return h6Var.f32867c[i];
    }

    /* renamed from: w */
    public final C14879y5 mo50587w() {
        return this.zzg;
    }

    /* renamed from: z */
    public final boolean mo50588z() {
        return (this.zze & 1) != 0;
    }
}
