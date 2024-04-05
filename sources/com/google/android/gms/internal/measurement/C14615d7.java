package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.d7 */
public final class C14615d7 {

    /* renamed from: a */
    public static final Class<?> f32807a;

    /* renamed from: b */
    public static final C14745n7<?, ?> f32808b = m23501v(false);

    /* renamed from: c */
    public static final C14745n7<?, ?> f32809c = m23501v(true);

    /* renamed from: d */
    public static final C14771p7 f32810d = new C14771p7();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f32807a = cls;
    }

    /* renamed from: A */
    public static int m23460A(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C14613d5.m23437a(i << 3) + 4) * size;
    }

    /* renamed from: B */
    public static int m23461B(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: C */
    public static int m23462C(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C14613d5.m23437a(i << 3) + 8) * size;
    }

    /* renamed from: D */
    public static int m23463D(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: E */
    public static int m23464E(int i, List<C14796r6> list, C14602c7 c7Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C14613d5.m23439r(i, list.get(i3), c7Var);
        }
        return i2;
    }

    /* renamed from: F */
    public static int m23465F(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C14613d5.m23442u(i) * size) + m23466G(list);
    }

    /* renamed from: G */
    public static int m23466G(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C14831u5) {
            C14831u5 u5Var = (C14831u5) list;
            i = 0;
            while (i2 < size) {
                u5Var.mo50901g(i2);
                i += C14613d5.m23440s(u5Var.f33096c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C14613d5.m23440s(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    public static int m23467H(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C14613d5.m23442u(i) * list.size()) + m23468I(list);
    }

    /* renamed from: I */
    public static int m23468I(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C14666h6) {
            C14666h6 h6Var = (C14666h6) list;
            i = 0;
            while (i2 < size) {
                h6Var.mo50564g(i2);
                i += C14613d5.m23438b(h6Var.f32867c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C14613d5.m23438b(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: J */
    public static int m23469J(int i, C14602c7 c7Var, Object obj) {
        if (obj instanceof C14588b6) {
            C14588b6 b6Var = (C14588b6) obj;
            int a = C14613d5.m23437a(i << 3);
            int length = b6Var.f32756b != null ? ((zziv) b6Var.f32756b).zza.length : b6Var.f32755a != null ? b6Var.f32755a.mo50826c() : 0;
            return C14613d5.m23437a(length) + length + a;
        }
        int a2 = C14613d5.m23437a(i << 3);
        C14818t4 t4Var = (C14818t4) ((C14796r6) obj);
        int e = t4Var.mo50866e();
        if (e == -1) {
            e = c7Var.mo50438d(t4Var);
            t4Var.mo50867h(e);
        }
        return C14613d5.m23437a(e) + e + a2;
    }

    /* renamed from: K */
    public static int m23470K(int i, List<?> list, C14602c7 c7Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int u = C14613d5.m23442u(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C14588b6) {
                C14588b6 b6Var = (C14588b6) obj;
                int length = b6Var.f32756b != null ? ((zziv) b6Var.f32756b).zza.length : b6Var.f32755a != null ? b6Var.f32755a.mo50826c() : 0;
                u = C14613d5.m23437a(length) + length + u;
            } else {
                C14818t4 t4Var = (C14818t4) ((C14796r6) obj);
                int e = t4Var.mo50866e();
                if (e == -1) {
                    e = c7Var.mo50438d(t4Var);
                    t4Var.mo50867h(e);
                }
                u = C14613d5.m23437a(e) + e + u;
            }
        }
        return u;
    }

    /* renamed from: L */
    public static int m23471L(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C14613d5.m23442u(i) * size) + m23472M(list);
    }

    /* renamed from: M */
    public static int m23472M(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C14831u5) {
            C14831u5 u5Var = (C14831u5) list;
            i = 0;
            while (i2 < size) {
                u5Var.mo50901g(i2);
                int i3 = u5Var.f33096c[i2];
                i += C14613d5.m23437a((i3 >> 31) ^ (i3 + i3));
                i2++;
            }
        } else {
            int i4 = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i4 = i + C14613d5.m23437a((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: N */
    public static int m23473N(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C14613d5.m23442u(i) * size) + m23474O(list);
    }

    /* renamed from: O */
    public static int m23474O(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C14666h6) {
            C14666h6 h6Var = (C14666h6) list;
            i = 0;
            while (i2 < size) {
                h6Var.mo50564g(i2);
                long j = h6Var.f32867c[i2];
                i += C14613d5.m23438b((j >> 63) ^ (j + j));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i3 = i + C14613d5.m23438b((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: P */
    public static int m23475P(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int u = C14613d5.m23442u(i) * size;
        if (list instanceof C14614d6) {
            C14614d6 d6Var = (C14614d6) list;
            while (i4 < size) {
                Object x = d6Var.mo50432x(i4);
                if (x instanceof zzix) {
                    int zzd = ((zzix) x).zzd();
                    i3 = C14613d5.m23437a(zzd) + zzd;
                } else {
                    i3 = C14613d5.m23441t((String) x);
                }
                u += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzix) {
                    int zzd2 = ((zzix) obj).zzd();
                    i2 = C14613d5.m23437a(zzd2) + zzd2;
                } else {
                    i2 = C14613d5.m23441t((String) obj);
                }
                u += i2;
                i4++;
            }
        }
        return u;
    }

    /* renamed from: Q */
    public static int m23476Q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C14613d5.m23442u(i) * size) + m23477R(list);
    }

    /* renamed from: R */
    public static int m23477R(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C14831u5) {
            C14831u5 u5Var = (C14831u5) list;
            i = 0;
            while (i2 < size) {
                u5Var.mo50901g(i2);
                i += C14613d5.m23437a(u5Var.f33096c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C14613d5.m23437a(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: S */
    public static int m23478S(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C14613d5.m23442u(i) * size) + m23479T(list);
    }

    /* renamed from: T */
    public static int m23479T(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C14666h6) {
            C14666h6 h6Var = (C14666h6) list;
            i = 0;
            while (i2 < size) {
                h6Var.mo50564g(i2);
                i += C14613d5.m23438b(h6Var.f32867c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C14613d5.m23438b(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static Object m23480a(int i, C14891z5 z5Var, C14855w5 w5Var, C14758o7 o7Var, C14745n7 n7Var) {
        if (w5Var == null) {
            return o7Var;
        }
        if (z5Var instanceof RandomAccess) {
            int size = z5Var.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) z5Var.get(i3)).intValue();
                if (w5Var.zza(intValue)) {
                    if (i3 != i2) {
                        z5Var.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    if (o7Var == null) {
                        o7Var = n7Var.mo50740e();
                    }
                    n7Var.mo50741f(o7Var, i, (long) intValue);
                }
            }
            if (i2 != size) {
                z5Var.subList(i2, size).clear();
                return o7Var;
            }
        } else {
            Iterator it = z5Var.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!w5Var.zza(intValue2)) {
                    if (o7Var == null) {
                        o7Var = n7Var.mo50740e();
                    }
                    n7Var.mo50741f(o7Var, i, (long) intValue2);
                    it.remove();
                }
            }
        }
        return o7Var;
    }

    /* renamed from: b */
    public static boolean m23481b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: c */
    public static void m23482c(int i, List<Boolean> list, C14626e5 e5Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                e5Var.f32825a.mo50417m(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).booleanValue();
                    i3++;
                }
                e5Var.f32825a.mo50419o(i3);
                while (i2 < list.size()) {
                    e5Var.f32825a.mo50407c(list.get(i2).booleanValue() ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            e5Var.getClass();
            while (i2 < list.size()) {
                e5Var.f32825a.mo50408d(i, list.get(i2).booleanValue());
                i2++;
            }
        }
    }

    /* renamed from: d */
    public static void m23483d(int i, List<zzix> list, C14626e5 e5Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            e5Var.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                e5Var.f32825a.mo50409e(i, list.get(i2));
            }
        }
    }

    /* renamed from: e */
    public static void m23484e(int i, List<Double> list, C14626e5 e5Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                e5Var.f32825a.mo50417m(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).doubleValue();
                    i3 += 8;
                }
                e5Var.f32825a.mo50419o(i3);
                while (i2 < list.size()) {
                    e5Var.f32825a.mo50413i(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                    i2++;
                }
                return;
            }
            e5Var.getClass();
            while (i2 < list.size()) {
                e5Var.f32825a.mo50412h(i, Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
        }
    }

    /* renamed from: f */
    public static void m23485f(int i, List<Integer> list, C14626e5 e5Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                e5Var.f32825a.mo50417m(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C14613d5.m23440s(list.get(i4).intValue());
                }
                e5Var.f32825a.mo50419o(i3);
                while (i2 < list.size()) {
                    e5Var.f32825a.mo50415k(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            e5Var.getClass();
            while (i2 < list.size()) {
                e5Var.f32825a.mo50414j(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: g */
    public static void m23486g(int i, List<Integer> list, C14626e5 e5Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                e5Var.f32825a.mo50417m(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).intValue();
                    i3 += 4;
                }
                e5Var.f32825a.mo50419o(i3);
                while (i2 < list.size()) {
                    e5Var.f32825a.mo50411g(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            e5Var.getClass();
            while (i2 < list.size()) {
                e5Var.f32825a.mo50410f(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: h */
    public static void m23487h(int i, List<Long> list, C14626e5 e5Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                e5Var.f32825a.mo50417m(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).longValue();
                    i3 += 8;
                }
                e5Var.f32825a.mo50419o(i3);
                while (i2 < list.size()) {
                    e5Var.f32825a.mo50413i(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            e5Var.getClass();
            while (i2 < list.size()) {
                e5Var.f32825a.mo50412h(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: i */
    public static void m23488i(int i, List<Float> list, C14626e5 e5Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                e5Var.f32825a.mo50417m(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).floatValue();
                    i3 += 4;
                }
                e5Var.f32825a.mo50419o(i3);
                while (i2 < list.size()) {
                    e5Var.f32825a.mo50411g(Float.floatToRawIntBits(list.get(i2).floatValue()));
                    i2++;
                }
                return;
            }
            e5Var.getClass();
            while (i2 < list.size()) {
                e5Var.f32825a.mo50410f(i, Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
        }
    }

    /* renamed from: j */
    public static void m23489j(int i, List<?> list, C14626e5 e5Var, C14602c7 c7Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                e5Var.mo50469l(i, c7Var, list.get(i2));
            }
        }
    }

    /* renamed from: k */
    public static void m23490k(int i, List<Integer> list, C14626e5 e5Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                e5Var.f32825a.mo50417m(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C14613d5.m23440s(list.get(i4).intValue());
                }
                e5Var.f32825a.mo50419o(i3);
                while (i2 < list.size()) {
                    e5Var.f32825a.mo50415k(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            e5Var.getClass();
            while (i2 < list.size()) {
                e5Var.f32825a.mo50414j(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: l */
    public static void m23491l(int i, List<Long> list, C14626e5 e5Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                e5Var.f32825a.mo50417m(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C14613d5.m23438b(list.get(i4).longValue());
                }
                e5Var.f32825a.mo50419o(i3);
                while (i2 < list.size()) {
                    e5Var.f32825a.mo50421q(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            e5Var.getClass();
            while (i2 < list.size()) {
                e5Var.f32825a.mo50420p(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: m */
    public static void m23492m(int i, List<?> list, C14626e5 e5Var, C14602c7 c7Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                e5Var.mo50472o(i, c7Var, list.get(i2));
            }
        }
    }

    /* renamed from: n */
    public static void m23493n(int i, List<Integer> list, C14626e5 e5Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                e5Var.f32825a.mo50417m(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).intValue();
                    i3 += 4;
                }
                e5Var.f32825a.mo50419o(i3);
                while (i2 < list.size()) {
                    e5Var.f32825a.mo50411g(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            e5Var.getClass();
            while (i2 < list.size()) {
                e5Var.f32825a.mo50410f(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: o */
    public static void m23494o(int i, List<Long> list, C14626e5 e5Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                e5Var.f32825a.mo50417m(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).longValue();
                    i3 += 8;
                }
                e5Var.f32825a.mo50419o(i3);
                while (i2 < list.size()) {
                    e5Var.f32825a.mo50413i(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            e5Var.getClass();
            while (i2 < list.size()) {
                e5Var.f32825a.mo50412h(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: p */
    public static void m23495p(int i, List<Integer> list, C14626e5 e5Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                e5Var.f32825a.mo50417m(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue = list.get(i4).intValue();
                    i3 += C14613d5.m23437a((intValue >> 31) ^ (intValue + intValue));
                }
                e5Var.f32825a.mo50419o(i3);
                while (i2 < list.size()) {
                    C14613d5 d5Var = e5Var.f32825a;
                    int intValue2 = list.get(i2).intValue();
                    d5Var.mo50419o((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i2++;
                }
                return;
            }
            e5Var.getClass();
            while (i2 < list.size()) {
                C14613d5 d5Var2 = e5Var.f32825a;
                int intValue3 = list.get(i2).intValue();
                d5Var2.mo50418n(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
        }
    }

    /* renamed from: q */
    public static void m23496q(int i, List<Long> list, C14626e5 e5Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                e5Var.f32825a.mo50417m(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = list.get(i4).longValue();
                    i3 += C14613d5.m23438b((longValue >> 63) ^ (longValue + longValue));
                }
                e5Var.f32825a.mo50419o(i3);
                while (i2 < list.size()) {
                    C14613d5 d5Var = e5Var.f32825a;
                    long longValue2 = list.get(i2).longValue();
                    d5Var.mo50421q((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i2++;
                }
                return;
            }
            e5Var.getClass();
            while (i2 < list.size()) {
                C14613d5 d5Var2 = e5Var.f32825a;
                long longValue3 = list.get(i2).longValue();
                d5Var2.mo50420p(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
        }
    }

    /* renamed from: r */
    public static void m23497r(int i, List<String> list, C14626e5 e5Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            e5Var.getClass();
            int i2 = 0;
            if (list instanceof C14614d6) {
                C14614d6 d6Var = (C14614d6) list;
                while (i2 < list.size()) {
                    Object x = d6Var.mo50432x(i2);
                    if (x instanceof String) {
                        e5Var.f32825a.mo50416l(i, (String) x);
                    } else {
                        e5Var.f32825a.mo50409e(i, (zzix) x);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                e5Var.f32825a.mo50416l(i, list.get(i2));
                i2++;
            }
        }
    }

    /* renamed from: s */
    public static void m23498s(int i, List<Integer> list, C14626e5 e5Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                e5Var.f32825a.mo50417m(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C14613d5.m23437a(list.get(i4).intValue());
                }
                e5Var.f32825a.mo50419o(i3);
                while (i2 < list.size()) {
                    e5Var.f32825a.mo50419o(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            e5Var.getClass();
            while (i2 < list.size()) {
                e5Var.f32825a.mo50418n(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: t */
    public static int m23499t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C14613d5.m23437a(i << 3) + 1) * size;
    }

    /* renamed from: u */
    public static void m23500u(int i, List<Long> list, C14626e5 e5Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                e5Var.f32825a.mo50417m(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C14613d5.m23438b(list.get(i4).longValue());
                }
                e5Var.f32825a.mo50419o(i3);
                while (i2 < list.size()) {
                    e5Var.f32825a.mo50421q(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            e5Var.getClass();
            while (i2 < list.size()) {
                e5Var.f32825a.mo50420p(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: v */
    public static C14745n7<?, ?> m23501v(boolean z) {
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
            return (C14745n7) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: w */
    public static int m23502w(List<?> list) {
        return list.size();
    }

    /* renamed from: x */
    public static int m23503x(int i, List<zzix> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int u = C14613d5.m23442u(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int zzd = list.get(i2).zzd();
            u += C14613d5.m23437a(zzd) + zzd;
        }
        return u;
    }

    /* renamed from: y */
    public static int m23504y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C14613d5.m23442u(i) * size) + m23505z(list);
    }

    /* renamed from: z */
    public static int m23505z(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C14831u5) {
            C14831u5 u5Var = (C14831u5) list;
            i = 0;
            while (i2 < size) {
                u5Var.mo50901g(i2);
                i += C14613d5.m23440s(u5Var.f33096c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C14613d5.m23440s(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }
}
