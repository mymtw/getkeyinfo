package com.google.android.gms.internal.icing;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.icing.n1 */
public final class C14528n1 {

    /* renamed from: a */
    public static final Class<?> f32673a;

    /* renamed from: b */
    public static final C14561x1<?, ?> f32674b = m23124t(false);

    /* renamed from: c */
    public static final C14561x1<?, ?> f32675c = m23124t(true);

    /* renamed from: d */
    public static final C14567z1 f32676d = new C14567z1();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f32673a = cls;
    }

    /* renamed from: A */
    public static int m23086A(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C14495f0) {
            C14495f0 f0Var = (C14495f0) list;
            i = 0;
            while (i2 < size) {
                f0Var.mo49791c(i2);
                i += C14541r.m23161r(f0Var.f32634c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C14541r.m23161r(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: B */
    public static int m23087B(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C14541r.m23160q(i) * size) + m23086A(list);
    }

    /* renamed from: C */
    public static int m23088C(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C14495f0) {
            C14495f0 f0Var = (C14495f0) list;
            i = 0;
            while (i2 < size) {
                f0Var.mo49791c(i2);
                i += C14541r.m23161r(f0Var.f32634c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C14541r.m23161r(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: D */
    public static int m23089D(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C14541r.m23160q(i) * size) + m23088C(list);
    }

    /* renamed from: E */
    public static int m23090E(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C14495f0) {
            C14495f0 f0Var = (C14495f0) list;
            i = 0;
            while (i2 < size) {
                f0Var.mo49791c(i2);
                i += C14541r.m23162s(f0Var.f32634c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C14541r.m23162s(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: F */
    public static int m23091F(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C14541r.m23160q(i) * size) + m23090E(list);
    }

    /* renamed from: G */
    public static int m23092G(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C14495f0) {
            C14495f0 f0Var = (C14495f0) list;
            i = 0;
            while (i2 < size) {
                f0Var.mo49791c(i2);
                int i3 = f0Var.f32634c[i2];
                i += C14541r.m23162s((i3 >> 31) ^ (i3 + i3));
                i2++;
            }
        } else {
            int i4 = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i4 = i + C14541r.m23162s((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    public static int m23093H(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C14541r.m23160q(i) * size) + m23092G(list);
    }

    /* renamed from: I */
    public static int m23094I(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    public static int m23095J(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C14541r.m23162s(i << 3) + 4) * size;
    }

    /* renamed from: K */
    public static int m23096K(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    public static int m23097L(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C14541r.m23162s(i << 3) + 8) * size;
    }

    /* renamed from: M */
    public static int m23098M(List<?> list) {
        return list.size();
    }

    /* renamed from: N */
    public static int m23099N(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C14541r.m23162s(i << 3) + 1) * size;
    }

    /* renamed from: O */
    public static int m23100O(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int q = C14541r.m23160q(i) * size;
        if (list instanceof C14527n0) {
            C14527n0 n0Var = (C14527n0) list;
            while (i4 < size) {
                Object M = n0Var.mo49747M(i4);
                if (M instanceof zzcf) {
                    int zzc = ((zzcf) M).zzc();
                    i3 = C14541r.m23162s(zzc) + zzc;
                } else {
                    i3 = C14541r.m23164u((String) M);
                }
                q += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzcf) {
                    int zzc2 = ((zzcf) obj).zzc();
                    i2 = C14541r.m23162s(zzc2) + zzc2;
                } else {
                    i2 = C14541r.m23164u((String) obj);
                }
                q += i2;
                i4++;
            }
        }
        return q;
    }

    /* renamed from: P */
    public static int m23101P(int i, C14524m1 m1Var, Object obj) {
        if (obj instanceof C14519l0) {
            C14519l0 l0Var = (C14519l0) obj;
            int s = C14541r.m23162s(i << 3);
            int length = l0Var.f32664b != null ? ((zzcd) l0Var.f32664b).zza.length : l0Var.f32663a != null ? l0Var.f32663a.mo49741c() : 0;
            return C14541r.m23162s(length) + length + s;
        }
        int s2 = C14541r.m23162s(i << 3);
        C14506i iVar = (C14506i) ((C14480b1) obj);
        int a = iVar.mo49757a();
        if (a == -1) {
            a = m1Var.mo49764c(iVar);
            iVar.mo49758d(a);
        }
        return C14541r.m23162s(a) + a + s2;
    }

    /* renamed from: Q */
    public static int m23102Q(int i, List<?> list, C14524m1 m1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int q = C14541r.m23160q(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C14519l0) {
                C14519l0 l0Var = (C14519l0) obj;
                int length = l0Var.f32664b != null ? ((zzcd) l0Var.f32664b).zza.length : l0Var.f32663a != null ? l0Var.f32663a.mo49741c() : 0;
                q = C14541r.m23162s(length) + length + q;
            } else {
                C14506i iVar = (C14506i) ((C14480b1) obj);
                int a = iVar.mo49757a();
                if (a == -1) {
                    a = m1Var.mo49764c(iVar);
                    iVar.mo49758d(a);
                }
                q = C14541r.m23162s(a) + a + q;
            }
        }
        return q;
    }

    /* renamed from: R */
    public static int m23103R(int i, List<zzcf> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int q = C14541r.m23160q(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int zzc = list.get(i2).zzc();
            q += C14541r.m23162s(zzc) + zzc;
        }
        return q;
    }

    /* renamed from: S */
    public static int m23104S(int i, List<C14480b1> list, C14524m1 m1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C14541r.m23159a(i, list.get(i3), m1Var);
        }
        return i2;
    }

    /* renamed from: a */
    public static boolean m23105a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static void m23106b(int i, List<Double> list, C14544s sVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                sVar.f32694a.mo49862b(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).doubleValue();
                    i3 += 8;
                }
                sVar.f32694a.mo49873m(i3);
                while (i2 < list.size()) {
                    sVar.f32694a.mo49876p(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                    i2++;
                }
                return;
            }
            sVar.getClass();
            while (i2 < list.size()) {
                sVar.f32694a.mo49867g(i, Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
        }
    }

    /* renamed from: c */
    public static void m23107c(int i, List<Float> list, C14544s sVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                sVar.f32694a.mo49862b(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).floatValue();
                    i3 += 4;
                }
                sVar.f32694a.mo49873m(i3);
                while (i2 < list.size()) {
                    sVar.f32694a.mo49874n(Float.floatToRawIntBits(list.get(i2).floatValue()));
                    i2++;
                }
                return;
            }
            sVar.getClass();
            while (i2 < list.size()) {
                sVar.f32694a.mo49865e(i, Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
        }
    }

    /* renamed from: d */
    public static void m23108d(int i, List<Long> list, C14544s sVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                sVar.f32694a.mo49862b(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C14541r.m23163t(list.get(i4).longValue());
                }
                sVar.f32694a.mo49873m(i3);
                while (i2 < list.size()) {
                    sVar.f32694a.mo49875o(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            sVar.getClass();
            while (i2 < list.size()) {
                sVar.f32694a.mo49866f(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: e */
    public static void m23109e(int i, List<Long> list, C14544s sVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                sVar.f32694a.mo49862b(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C14541r.m23163t(list.get(i4).longValue());
                }
                sVar.f32694a.mo49873m(i3);
                while (i2 < list.size()) {
                    sVar.f32694a.mo49875o(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            sVar.getClass();
            while (i2 < list.size()) {
                sVar.f32694a.mo49866f(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: f */
    public static void m23110f(int i, List<Long> list, C14544s sVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                sVar.f32694a.mo49862b(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = list.get(i4).longValue();
                    i3 += C14541r.m23163t((longValue >> 63) ^ (longValue + longValue));
                }
                sVar.f32694a.mo49873m(i3);
                while (i2 < list.size()) {
                    C14541r rVar = sVar.f32694a;
                    long longValue2 = list.get(i2).longValue();
                    rVar.mo49875o((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i2++;
                }
                return;
            }
            sVar.getClass();
            while (i2 < list.size()) {
                C14541r rVar2 = sVar.f32694a;
                long longValue3 = list.get(i2).longValue();
                rVar2.mo49866f(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
        }
    }

    /* renamed from: g */
    public static void m23111g(int i, List<Long> list, C14544s sVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                sVar.f32694a.mo49862b(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).longValue();
                    i3 += 8;
                }
                sVar.f32694a.mo49873m(i3);
                while (i2 < list.size()) {
                    sVar.f32694a.mo49876p(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            sVar.getClass();
            while (i2 < list.size()) {
                sVar.f32694a.mo49867g(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: h */
    public static void m23112h(int i, List<Long> list, C14544s sVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                sVar.f32694a.mo49862b(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).longValue();
                    i3 += 8;
                }
                sVar.f32694a.mo49873m(i3);
                while (i2 < list.size()) {
                    sVar.f32694a.mo49876p(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            sVar.getClass();
            while (i2 < list.size()) {
                sVar.f32694a.mo49867g(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: i */
    public static void m23113i(int i, List<Integer> list, C14544s sVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                sVar.f32694a.mo49862b(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C14541r.m23161r(list.get(i4).intValue());
                }
                sVar.f32694a.mo49873m(i3);
                while (i2 < list.size()) {
                    sVar.f32694a.mo49872l(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            sVar.getClass();
            while (i2 < list.size()) {
                sVar.f32694a.mo49863c(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: j */
    public static void m23114j(int i, List<Integer> list, C14544s sVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                sVar.f32694a.mo49862b(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C14541r.m23162s(list.get(i4).intValue());
                }
                sVar.f32694a.mo49873m(i3);
                while (i2 < list.size()) {
                    sVar.f32694a.mo49873m(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            sVar.getClass();
            while (i2 < list.size()) {
                sVar.f32694a.mo49864d(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: k */
    public static void m23115k(int i, List<Integer> list, C14544s sVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                sVar.f32694a.mo49862b(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue = list.get(i4).intValue();
                    i3 += C14541r.m23162s((intValue >> 31) ^ (intValue + intValue));
                }
                sVar.f32694a.mo49873m(i3);
                while (i2 < list.size()) {
                    C14541r rVar = sVar.f32694a;
                    int intValue2 = list.get(i2).intValue();
                    rVar.mo49873m((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i2++;
                }
                return;
            }
            sVar.getClass();
            while (i2 < list.size()) {
                C14541r rVar2 = sVar.f32694a;
                int intValue3 = list.get(i2).intValue();
                rVar2.mo49864d(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
        }
    }

    /* renamed from: l */
    public static void m23116l(int i, List<Integer> list, C14544s sVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                sVar.f32694a.mo49862b(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).intValue();
                    i3 += 4;
                }
                sVar.f32694a.mo49873m(i3);
                while (i2 < list.size()) {
                    sVar.f32694a.mo49874n(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            sVar.getClass();
            while (i2 < list.size()) {
                sVar.f32694a.mo49865e(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: m */
    public static void m23117m(int i, List<Integer> list, C14544s sVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                sVar.f32694a.mo49862b(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).intValue();
                    i3 += 4;
                }
                sVar.f32694a.mo49873m(i3);
                while (i2 < list.size()) {
                    sVar.f32694a.mo49874n(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            sVar.getClass();
            while (i2 < list.size()) {
                sVar.f32694a.mo49865e(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: n */
    public static void m23118n(int i, List<Integer> list, C14544s sVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                sVar.f32694a.mo49862b(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C14541r.m23161r(list.get(i4).intValue());
                }
                sVar.f32694a.mo49873m(i3);
                while (i2 < list.size()) {
                    sVar.f32694a.mo49872l(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            sVar.getClass();
            while (i2 < list.size()) {
                sVar.f32694a.mo49863c(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: o */
    public static void m23119o(int i, List<Boolean> list, C14544s sVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                sVar.f32694a.mo49862b(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).booleanValue();
                    i3++;
                }
                sVar.f32694a.mo49873m(i3);
                while (i2 < list.size()) {
                    sVar.f32694a.mo49871k(list.get(i2).booleanValue() ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            sVar.getClass();
            while (i2 < list.size()) {
                sVar.f32694a.mo49868h(i, list.get(i2).booleanValue());
                i2++;
            }
        }
    }

    /* renamed from: p */
    public static void m23120p(int i, List<String> list, C14544s sVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            sVar.getClass();
            int i2 = 0;
            if (list instanceof C14527n0) {
                C14527n0 n0Var = (C14527n0) list;
                while (i2 < list.size()) {
                    Object M = n0Var.mo49747M(i2);
                    if (M instanceof String) {
                        sVar.f32694a.mo49869i(i, (String) M);
                    } else {
                        sVar.f32694a.mo49870j(i, (zzcf) M);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                sVar.f32694a.mo49869i(i, list.get(i2));
                i2++;
            }
        }
    }

    /* renamed from: q */
    public static void m23121q(int i, List<zzcf> list, C14544s sVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            sVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                sVar.f32694a.mo49870j(i, list.get(i2));
            }
        }
    }

    /* renamed from: r */
    public static void m23122r(int i, List<?> list, C14544s sVar, C14524m1 m1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                sVar.mo49910p(i, m1Var, list.get(i2));
            }
        }
    }

    /* renamed from: s */
    public static void m23123s(int i, List<?> list, C14544s sVar, C14524m1 m1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                sVar.mo49911q(i, m1Var, list.get(i2));
            }
        }
    }

    /* renamed from: t */
    public static C14561x1<?, ?> m23124t(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (C14561x1) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: u */
    public static int m23125u(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C14542r0) {
            C14542r0 r0Var = (C14542r0) list;
            i = 0;
            while (i2 < size) {
                r0Var.mo49880c(i2);
                i += C14541r.m23163t(r0Var.f32689c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C14541r.m23163t(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: v */
    public static int m23126v(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C14541r.m23160q(i) * list.size()) + m23125u(list);
    }

    /* renamed from: w */
    public static int m23127w(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C14542r0) {
            C14542r0 r0Var = (C14542r0) list;
            i = 0;
            while (i2 < size) {
                r0Var.mo49880c(i2);
                i += C14541r.m23163t(r0Var.f32689c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C14541r.m23163t(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: x */
    public static int m23128x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C14541r.m23160q(i) * size) + m23127w(list);
    }

    /* renamed from: y */
    public static int m23129y(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C14542r0) {
            C14542r0 r0Var = (C14542r0) list;
            i = 0;
            while (i2 < size) {
                r0Var.mo49880c(i2);
                long j = r0Var.f32689c[i2];
                i += C14541r.m23163t((j >> 63) ^ (j + j));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i3 = i + C14541r.m23163t((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: z */
    public static int m23130z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C14541r.m23160q(i) * size) + m23129y(list);
    }
}
