package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2621s;
import androidx.datastore.preferences.protobuf.C2631w;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.z0 */
public final class C2644z0 {

    /* renamed from: a */
    public static final Class<?> f5984a;

    /* renamed from: b */
    public static final C2570d1<?, ?> f5985b = m6342A(false);

    /* renamed from: c */
    public static final C2570d1<?, ?> f5986c = m6342A(true);

    /* renamed from: d */
    public static final C2578f1 f5987d = new C2578f1();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f5984a = cls;
    }

    /* renamed from: A */
    public static C2570d1<?, ?> m6342A(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (C2570d1) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: B */
    public static <T, FT extends C2621s.C2623b<FT>> void m6343B(C2614p<FT> pVar, T t, T t2) {
        C2621s<FT> c = pVar.mo9867c(t2);
        if (!c.mo9881h()) {
            C2621s<FT> d = pVar.mo9868d(t);
            d.getClass();
            for (int i = 0; i < c.f5957a.mo9560d(); i++) {
                d.mo9885l(c.f5957a.mo9557c(i));
            }
            for (Map.Entry<T, Object> l : c.f5957a.mo9561e()) {
                d.mo9885l(l);
            }
        }
    }

    /* renamed from: C */
    public static boolean m6344C(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: D */
    public static <UT, UB> UB m6345D(int i, int i2, UB ub, C2570d1<UT, UB> d1Var) {
        if (ub == null) {
            ub = d1Var.mo9634m();
        }
        d1Var.mo9626e(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: E */
    public static void m6346E(int i, List list, C2601k kVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                kVar.f5918a.mo9432R(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).booleanValue();
                    Logger logger = CodedOutputStream.f5781b;
                    i3++;
                }
                kVar.f5918a.mo9434T(i3);
                while (i2 < list.size()) {
                    kVar.f5918a.mo9415A(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            kVar.getClass();
            while (i2 < list.size()) {
                kVar.f5918a.mo9416B(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    /* renamed from: F */
    public static void m6347F(int i, List list, C2601k kVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            kVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                kVar.f5918a.mo9418D(i, (ByteString) list.get(i2));
            }
        }
    }

    /* renamed from: G */
    public static void m6348G(int i, List list, C2601k kVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                kVar.f5918a.mo9432R(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).doubleValue();
                    Logger logger = CodedOutputStream.f5781b;
                    i3 += 8;
                }
                kVar.f5918a.mo9434T(i3);
                while (i2 < list.size()) {
                    CodedOutputStream codedOutputStream = kVar.f5918a;
                    double doubleValue = ((Double) list.get(i2)).doubleValue();
                    codedOutputStream.getClass();
                    codedOutputStream.mo9423I(Double.doubleToRawLongBits(doubleValue));
                    i2++;
                }
                return;
            }
            kVar.getClass();
            while (i2 < list.size()) {
                CodedOutputStream codedOutputStream2 = kVar.f5918a;
                double doubleValue2 = ((Double) list.get(i2)).doubleValue();
                codedOutputStream2.getClass();
                codedOutputStream2.mo9422H(i, Double.doubleToRawLongBits(doubleValue2));
                i2++;
            }
        }
    }

    /* renamed from: H */
    public static void m6349H(int i, List list, C2601k kVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                kVar.f5918a.mo9432R(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.m5506l(((Integer) list.get(i4)).intValue());
                }
                kVar.f5918a.mo9434T(i3);
                while (i2 < list.size()) {
                    kVar.f5918a.mo9425K(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            kVar.getClass();
            while (i2 < list.size()) {
                kVar.f5918a.mo9424J(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: I */
    public static void m6350I(int i, List list, C2601k kVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                kVar.f5918a.mo9432R(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    Logger logger = CodedOutputStream.f5781b;
                    i3 += 4;
                }
                kVar.f5918a.mo9434T(i3);
                while (i2 < list.size()) {
                    kVar.f5918a.mo9421G(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            kVar.getClass();
            while (i2 < list.size()) {
                kVar.f5918a.mo9420F(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: J */
    public static void m6351J(int i, List list, C2601k kVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                kVar.f5918a.mo9432R(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    Logger logger = CodedOutputStream.f5781b;
                    i3 += 8;
                }
                kVar.f5918a.mo9434T(i3);
                while (i2 < list.size()) {
                    kVar.f5918a.mo9423I(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            kVar.getClass();
            while (i2 < list.size()) {
                kVar.f5918a.mo9422H(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: K */
    public static void m6352K(int i, List list, C2601k kVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                kVar.f5918a.mo9432R(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).floatValue();
                    Logger logger = CodedOutputStream.f5781b;
                    i3 += 4;
                }
                kVar.f5918a.mo9434T(i3);
                while (i2 < list.size()) {
                    CodedOutputStream codedOutputStream = kVar.f5918a;
                    float floatValue = ((Float) list.get(i2)).floatValue();
                    codedOutputStream.getClass();
                    codedOutputStream.mo9421G(Float.floatToRawIntBits(floatValue));
                    i2++;
                }
                return;
            }
            kVar.getClass();
            while (i2 < list.size()) {
                CodedOutputStream codedOutputStream2 = kVar.f5918a;
                float floatValue2 = ((Float) list.get(i2)).floatValue();
                codedOutputStream2.getClass();
                codedOutputStream2.mo9420F(i, Float.floatToRawIntBits(floatValue2));
                i2++;
            }
        }
    }

    /* renamed from: L */
    public static void m6353L(int i, List list, C2601k kVar, C2642y0 y0Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            kVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                kVar.mo9805h(i, y0Var, list.get(i2));
            }
        }
    }

    /* renamed from: M */
    public static void m6354M(int i, List list, C2601k kVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                kVar.f5918a.mo9432R(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.m5506l(((Integer) list.get(i4)).intValue());
                }
                kVar.f5918a.mo9434T(i3);
                while (i2 < list.size()) {
                    kVar.f5918a.mo9425K(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            kVar.getClass();
            while (i2 < list.size()) {
                kVar.f5918a.mo9424J(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: N */
    public static void m6355N(int i, List list, C2601k kVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                kVar.f5918a.mo9432R(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.m5519y(((Long) list.get(i4)).longValue());
                }
                kVar.f5918a.mo9434T(i3);
                while (i2 < list.size()) {
                    kVar.f5918a.mo9436V(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            kVar.getClass();
            while (i2 < list.size()) {
                kVar.f5918a.mo9435U(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: O */
    public static void m6356O(int i, List list, C2601k kVar, C2642y0 y0Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            kVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                kVar.mo9808k(i, y0Var, list.get(i2));
            }
        }
    }

    /* renamed from: P */
    public static void m6357P(int i, List list, C2601k kVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                kVar.f5918a.mo9432R(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    Logger logger = CodedOutputStream.f5781b;
                    i3 += 4;
                }
                kVar.f5918a.mo9434T(i3);
                while (i2 < list.size()) {
                    kVar.f5918a.mo9421G(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            kVar.getClass();
            while (i2 < list.size()) {
                kVar.f5918a.mo9420F(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: Q */
    public static void m6358Q(int i, List list, C2601k kVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                kVar.f5918a.mo9432R(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    Logger logger = CodedOutputStream.f5781b;
                    i3 += 8;
                }
                kVar.f5918a.mo9434T(i3);
                while (i2 < list.size()) {
                    kVar.f5918a.mo9423I(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            kVar.getClass();
            while (i2 < list.size()) {
                kVar.f5918a.mo9422H(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: R */
    public static void m6359R(int i, List list, C2601k kVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                kVar.f5918a.mo9432R(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue = ((Integer) list.get(i4)).intValue();
                    i3 += CodedOutputStream.m5517w((intValue >> 31) ^ (intValue << 1));
                }
                kVar.f5918a.mo9434T(i3);
                while (i2 < list.size()) {
                    CodedOutputStream codedOutputStream = kVar.f5918a;
                    int intValue2 = ((Integer) list.get(i2)).intValue();
                    codedOutputStream.mo9434T((intValue2 >> 31) ^ (intValue2 << 1));
                    i2++;
                }
                return;
            }
            kVar.getClass();
            while (i2 < list.size()) {
                CodedOutputStream codedOutputStream2 = kVar.f5918a;
                int intValue3 = ((Integer) list.get(i2)).intValue();
                codedOutputStream2.mo9433S(i, (intValue3 >> 31) ^ (intValue3 << 1));
                i2++;
            }
        }
    }

    /* renamed from: S */
    public static void m6360S(int i, List list, C2601k kVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                kVar.f5918a.mo9432R(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Long) list.get(i4)).longValue();
                    i3 += CodedOutputStream.m5519y((longValue >> 63) ^ (longValue << 1));
                }
                kVar.f5918a.mo9434T(i3);
                while (i2 < list.size()) {
                    CodedOutputStream codedOutputStream = kVar.f5918a;
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    codedOutputStream.mo9436V((longValue2 >> 63) ^ (longValue2 << 1));
                    i2++;
                }
                return;
            }
            kVar.getClass();
            while (i2 < list.size()) {
                CodedOutputStream codedOutputStream2 = kVar.f5918a;
                long longValue3 = ((Long) list.get(i2)).longValue();
                codedOutputStream2.mo9435U(i, (longValue3 >> 63) ^ (longValue3 << 1));
                i2++;
            }
        }
    }

    /* renamed from: T */
    public static void m6361T(int i, List list, C2601k kVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            kVar.getClass();
            int i2 = 0;
            if (list instanceof C2548a0) {
                C2548a0 a0Var = (C2548a0) list;
                while (i2 < list.size()) {
                    Object k = a0Var.mo9549k(i2);
                    if (k instanceof String) {
                        kVar.f5918a.mo9430P(i, (String) k);
                    } else {
                        kVar.f5918a.mo9418D(i, (ByteString) k);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kVar.f5918a.mo9430P(i, (String) list.get(i2));
                i2++;
            }
        }
    }

    /* renamed from: U */
    public static void m6362U(int i, List list, C2601k kVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                kVar.f5918a.mo9432R(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.m5517w(((Integer) list.get(i4)).intValue());
                }
                kVar.f5918a.mo9434T(i3);
                while (i2 < list.size()) {
                    kVar.f5918a.mo9434T(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            kVar.getClass();
            while (i2 < list.size()) {
                kVar.f5918a.mo9433S(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: V */
    public static void m6363V(int i, List list, C2601k kVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                kVar.f5918a.mo9432R(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.m5519y(((Long) list.get(i4)).longValue());
                }
                kVar.f5918a.mo9434T(i3);
                while (i2 < list.size()) {
                    kVar.f5918a.mo9436V(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            kVar.getClass();
            while (i2 < list.size()) {
                kVar.f5918a.mo9435U(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: a */
    public static int m6364a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.m5497c(i) * size;
    }

    /* renamed from: b */
    public static int m6365b(List<?> list) {
        return list.size();
    }

    /* renamed from: c */
    public static int m6366c(int i, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int u = CodedOutputStream.m5515u(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int size2 = list.get(i2).size();
            u += CodedOutputStream.m5517w(size2) + size2;
        }
        return u;
    }

    /* renamed from: d */
    public static int m6367d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m5515u(i) * size) + m6368e(list);
    }

    /* renamed from: e */
    public static int m6368e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2629v) {
            C2629v vVar = (C2629v) list;
            i = 0;
            while (i2 < size) {
                vVar.mo9898e(i2);
                i += CodedOutputStream.m5506l(vVar.f5968c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m5506l(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    public static int m6369f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.m5501g(i) * size;
    }

    /* renamed from: g */
    public static int m6370g(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    public static int m6371h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.m5502h(i) * size;
    }

    /* renamed from: i */
    public static int m6372i(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    public static int m6373j(int i, List<C2602k0> list, C2642y0 y0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += CodedOutputStream.m5504j(i, list.get(i3), y0Var);
        }
        return i2;
    }

    /* renamed from: k */
    public static int m6374k(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m5515u(i) * size) + m6375l(list);
    }

    /* renamed from: l */
    public static int m6375l(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2629v) {
            C2629v vVar = (C2629v) list;
            i = 0;
            while (i2 < size) {
                vVar.mo9898e(i2);
                i += CodedOutputStream.m5506l(vVar.f5968c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m5506l(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: m */
    public static int m6376m(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (CodedOutputStream.m5515u(i) * list.size()) + m6377n(list);
    }

    /* renamed from: n */
    public static int m6377n(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2564c0) {
            C2564c0 c0Var = (C2564c0) list;
            i = 0;
            while (i2 < size) {
                c0Var.mo9610e(i2);
                i += CodedOutputStream.m5519y(c0Var.f5842c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m5519y(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: o */
    public static int m6378o(int i, C2642y0 y0Var, Object obj) {
        if (obj instanceof C2641y) {
            return CodedOutputStream.m5508n((C2641y) obj) + CodedOutputStream.m5515u(i);
        }
        int u = CodedOutputStream.m5515u(i);
        int g = ((C2546a) ((C2602k0) obj)).mo9543g(y0Var);
        return CodedOutputStream.m5517w(g) + g + u;
    }

    /* renamed from: p */
    public static int m6379p(int i, List<?> list, C2642y0 y0Var) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int u = CodedOutputStream.m5515u(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C2641y) {
                i2 = CodedOutputStream.m5508n((C2641y) obj);
            } else {
                int g = ((C2546a) ((C2602k0) obj)).mo9543g(y0Var);
                i2 = g + CodedOutputStream.m5517w(g);
            }
            u += i2;
        }
        return u;
    }

    /* renamed from: q */
    public static int m6380q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m5515u(i) * size) + m6381r(list);
    }

    /* renamed from: r */
    public static int m6381r(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2629v) {
            C2629v vVar = (C2629v) list;
            i = 0;
            while (i2 < size) {
                vVar.mo9898e(i2);
                int i3 = vVar.f5968c[i2];
                i += CodedOutputStream.m5517w((i3 >> 31) ^ (i3 << 1));
                i2++;
            }
        } else {
            int i4 = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i4 = i + CodedOutputStream.m5517w((intValue >> 31) ^ (intValue << 1));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: s */
    public static int m6382s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m5515u(i) * size) + m6383t(list);
    }

    /* renamed from: t */
    public static int m6383t(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2564c0) {
            C2564c0 c0Var = (C2564c0) list;
            i = 0;
            while (i2 < size) {
                c0Var.mo9610e(i2);
                long j = c0Var.f5842c[i2];
                i += CodedOutputStream.m5519y((j >> 63) ^ (j << 1));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i3 = i + CodedOutputStream.m5519y((longValue >> 63) ^ (longValue << 1));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: u */
    public static int m6384u(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int u = CodedOutputStream.m5515u(i) * size;
        if (list instanceof C2548a0) {
            C2548a0 a0Var = (C2548a0) list;
            while (i4 < size) {
                Object k = a0Var.mo9549k(i4);
                if (k instanceof ByteString) {
                    int size2 = ((ByteString) k).size();
                    i3 = CodedOutputStream.m5517w(size2) + size2;
                } else {
                    i3 = CodedOutputStream.m5514t((String) k);
                }
                u += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof ByteString) {
                    int size3 = ((ByteString) obj).size();
                    i2 = CodedOutputStream.m5517w(size3) + size3;
                } else {
                    i2 = CodedOutputStream.m5514t((String) obj);
                }
                u += i2;
                i4++;
            }
        }
        return u;
    }

    /* renamed from: v */
    public static int m6385v(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m5515u(i) * size) + m6386w(list);
    }

    /* renamed from: w */
    public static int m6386w(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2629v) {
            C2629v vVar = (C2629v) list;
            i = 0;
            while (i2 < size) {
                vVar.mo9898e(i2);
                i += CodedOutputStream.m5517w(vVar.f5968c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m5517w(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: x */
    public static int m6387x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m5515u(i) * size) + m6388y(list);
    }

    /* renamed from: y */
    public static int m6388y(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2564c0) {
            C2564c0 c0Var = (C2564c0) list;
            i = 0;
            while (i2 < size) {
                c0Var.mo9610e(i2);
                i += CodedOutputStream.m5519y(c0Var.f5842c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m5519y(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: z */
    public static <UT, UB> UB m6389z(int i, List<Integer> list, C2631w.C2634c cVar, UB ub, C2570d1<UT, UB> d1Var) {
        if (cVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (cVar.mo9451a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m6345D(i, intValue, ub, d1Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!cVar.mo9451a(intValue2)) {
                    ub = m6345D(i, intValue2, ub, d1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
