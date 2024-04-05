package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.g3 */
public final class C14650g3 extends C14819t5<C14650g3, C14637f3> implements C14808s6 {
    /* access modifiers changed from: private */
    public static final C14650g3 zza;
    private C14879y5 zze;
    private C14879y5 zzf;
    private C14891z5<C14753o2> zzg;
    private C14891z5<C14676i3> zzh;

    static {
        C14650g3 g3Var = new C14650g3();
        zza = g3Var;
        C14819t5.m23959l(C14650g3.class, g3Var);
    }

    public C14650g3() {
        C14666h6 h6Var = C14666h6.f32866e;
        this.zze = h6Var;
        this.zzf = h6Var;
        C14576a7<Object> a7Var = C14576a7.f32742e;
        this.zzg = a7Var;
        this.zzh = a7Var;
    }

    /* renamed from: E */
    public static void m23579E(C14650g3 g3Var, List list) {
        C14879y5 y5Var = g3Var.zze;
        if (!((C14830u4) y5Var).f33094b) {
            g3Var.zze = C14819t5.m23961p(y5Var);
        }
        C14818t4.m23952g(list, g3Var.zze);
    }

    /* renamed from: F */
    public static void m23580F(C14650g3 g3Var) {
        g3Var.zze = C14666h6.f32866e;
    }

    /* renamed from: G */
    public static void m23581G(C14650g3 g3Var, List list) {
        C14879y5 y5Var = g3Var.zzf;
        if (!((C14830u4) y5Var).f33094b) {
            g3Var.zzf = C14819t5.m23961p(y5Var);
        }
        C14818t4.m23952g(list, g3Var.zzf);
    }

    /* renamed from: H */
    public static void m23582H(C14650g3 g3Var) {
        g3Var.zzf = C14666h6.f32866e;
    }

    /* renamed from: I */
    public static void m23583I(C14650g3 g3Var, ArrayList arrayList) {
        C14891z5<C14753o2> z5Var = g3Var.zzg;
        if (!z5Var.zzc()) {
            g3Var.zzg = C14819t5.m23957j(z5Var);
        }
        C14818t4.m23952g(arrayList, g3Var.zzg);
    }

    /* renamed from: J */
    public static void m23584J(C14650g3 g3Var, int i) {
        C14891z5<C14753o2> z5Var = g3Var.zzg;
        if (!z5Var.zzc()) {
            g3Var.zzg = C14819t5.m23957j(z5Var);
        }
        g3Var.zzg.remove(i);
    }

    /* renamed from: K */
    public static void m23585K(C14650g3 g3Var, List list) {
        C14891z5<C14676i3> z5Var = g3Var.zzh;
        if (!z5Var.zzc()) {
            g3Var.zzh = C14819t5.m23957j(z5Var);
        }
        C14818t4.m23952g(list, g3Var.zzh);
    }

    /* renamed from: L */
    public static void m23586L(C14650g3 g3Var, int i) {
        C14891z5<C14676i3> z5Var = g3Var.zzh;
        if (!z5Var.zzc()) {
            g3Var.zzh = C14819t5.m23957j(z5Var);
        }
        g3Var.zzh.remove(i);
    }

    /* renamed from: w */
    public static C14637f3 m23587w() {
        return (C14637f3) zza.mo50871m();
    }

    /* renamed from: y */
    public static C14650g3 m23589y() {
        return zza;
    }

    /* renamed from: A */
    public final C14891z5 mo50539A() {
        return this.zzg;
    }

    /* renamed from: B */
    public final List<Long> mo50540B() {
        return this.zzf;
    }

    /* renamed from: C */
    public final C14891z5 mo50541C() {
        return this.zzh;
    }

    /* renamed from: D */
    public final C14879y5 mo50542D() {
        return this.zze;
    }

    /* renamed from: q */
    public final Object mo50282q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C14589b7(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", C14753o2.class, "zzh", C14676i3.class});
        } else if (i2 == 3) {
            return new C14650g3();
        } else {
            if (i2 == 4) {
                return new C14637f3(0);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: r */
    public final int mo50543r() {
        return this.zzg.size();
    }

    /* renamed from: s */
    public final int mo50544s() {
        return ((C14666h6) this.zzf).f32868d;
    }

    /* renamed from: t */
    public final int mo50545t() {
        return this.zzh.size();
    }

    /* renamed from: u */
    public final int mo50546u() {
        return ((C14666h6) this.zze).f32868d;
    }

    /* renamed from: v */
    public final C14753o2 mo50547v(int i) {
        return this.zzg.get(i);
    }

    /* renamed from: z */
    public final C14676i3 mo50548z(int i) {
        return this.zzh.get(i);
    }
}
