package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.p7 */
public final class C14771p7 extends C14745n7<C14758o7, C14758o7> {
    /* renamed from: a */
    public final /* synthetic */ int mo50736a(Object obj) {
        return ((C14758o7) obj).mo50761a();
    }

    /* renamed from: b */
    public final int mo50737b(Object obj) {
        C14758o7 o7Var = (C14758o7) obj;
        int i = o7Var.f33024d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < o7Var.f33021a; i3++) {
            int i4 = o7Var.f33022b[i3];
            int a = C14613d5.m23437a(8);
            int zzd = ((zzix) o7Var.f33023c[i3]).zzd();
            i2 += C14613d5.m23437a(zzd) + zzd + C14613d5.m23437a(24) + C14613d5.m23437a(i4 >>> 3) + C14613d5.m23437a(16) + a + a;
        }
        o7Var.f33024d = i2;
        return i2;
    }

    /* renamed from: c */
    public final /* synthetic */ C14758o7 mo50738c(Object obj) {
        return ((C14819t5) obj).zzc;
    }

    /* renamed from: d */
    public final Object mo50739d(Object obj, Object obj2) {
        C14758o7 o7Var = (C14758o7) obj2;
        if (o7Var.equals(C14758o7.f33020f)) {
            return obj;
        }
        C14758o7 o7Var2 = (C14758o7) obj;
        int i = o7Var2.f33021a + o7Var.f33021a;
        int[] copyOf = Arrays.copyOf(o7Var2.f33022b, i);
        System.arraycopy(o7Var.f33022b, 0, copyOf, o7Var2.f33021a, o7Var.f33021a);
        Object[] copyOf2 = Arrays.copyOf(o7Var2.f33023c, i);
        System.arraycopy(o7Var.f33023c, 0, copyOf2, o7Var2.f33021a, o7Var.f33021a);
        return new C14758o7(i, copyOf, copyOf2, true);
    }

    /* renamed from: e */
    public final /* synthetic */ C14758o7 mo50740e() {
        return C14758o7.m23822b();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo50741f(Object obj, int i, long j) {
        ((C14758o7) obj).mo50762c(i << 3, Long.valueOf(j));
    }

    /* renamed from: g */
    public final void mo50742g(Object obj) {
        ((C14819t5) obj).zzc.f33025e = false;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo50743h(Object obj, Object obj2) {
        ((C14819t5) obj).zzc = (C14758o7) obj2;
    }

    /* renamed from: i */
    public final /* synthetic */ void mo50744i(Object obj, C14626e5 e5Var) throws IOException {
        ((C14758o7) obj).mo50763d(e5Var);
    }
}
