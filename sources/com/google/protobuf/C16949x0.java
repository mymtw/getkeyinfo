package com.google.protobuf;

import com.google.protobuf.C16925r;
import com.google.protobuf.C16935v;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.x0 */
public final class C16949x0 {

    /* renamed from: a */
    public static final Class<?> f37313a;

    /* renamed from: b */
    public static final C16871b1<?, ?> f37314b = m28415A(false);

    /* renamed from: c */
    public static final C16871b1<?, ?> f37315c = m28415A(true);

    /* renamed from: d */
    public static final C16880d1 f37316d = new C16880d1();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f37313a = cls;
    }

    /* renamed from: A */
    public static C16871b1<?, ?> m28415A(boolean z) {
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
            return (C16871b1) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: B */
    public static <T, FT extends C16925r.C16927b<FT>> void m28416B(C16918o<FT> oVar, T t, T t2) {
        C16925r<FT> c = oVar.mo60013c(t2);
        if (!c.mo60024h()) {
            C16925r<FT> d = oVar.mo60014d(t);
            d.getClass();
            for (int i = 0; i < c.f37284a.mo60081d(); i++) {
                d.mo60028l(c.f37284a.mo60078c(i));
            }
            for (Map.Entry<T, Object> l : c.f37284a.mo60082e()) {
                d.mo60028l(l);
            }
        }
    }

    /* renamed from: C */
    public static boolean m28417C(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: D */
    public static <UT, UB> UB m28418D(int i, int i2, UB ub, C16871b1<UT, UB> b1Var) {
        if (ub == null) {
            ub = b1Var.mo59856h();
        }
        b1Var.mo59850b(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: E */
    public static void m28419E(int i, List list, C16905j jVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                jVar.f37242a.mo59726Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).booleanValue();
                    Logger logger = CodedOutputStream.f37140b;
                    i3++;
                }
                jVar.f37242a.mo59728S(i3);
                while (i2 < list.size()) {
                    jVar.f37242a.mo59731z(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            jVar.getClass();
            while (i2 < list.size()) {
                jVar.f37242a.mo59710A(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    /* renamed from: F */
    public static void m28420F(int i, List list, C16905j jVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            jVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                jVar.f37242a.mo59712C(i, (ByteString) list.get(i2));
            }
        }
    }

    /* renamed from: G */
    public static void m28421G(int i, List list, C16905j jVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                jVar.f37242a.mo59726Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).doubleValue();
                    Logger logger = CodedOutputStream.f37140b;
                    i3 += 8;
                }
                jVar.f37242a.mo59728S(i3);
                while (i2 < list.size()) {
                    CodedOutputStream codedOutputStream = jVar.f37242a;
                    double doubleValue = ((Double) list.get(i2)).doubleValue();
                    codedOutputStream.getClass();
                    codedOutputStream.mo59717H(Double.doubleToRawLongBits(doubleValue));
                    i2++;
                }
                return;
            }
            jVar.getClass();
            while (i2 < list.size()) {
                CodedOutputStream codedOutputStream2 = jVar.f37242a;
                double doubleValue2 = ((Double) list.get(i2)).doubleValue();
                codedOutputStream2.getClass();
                codedOutputStream2.mo59716G(i, Double.doubleToRawLongBits(doubleValue2));
                i2++;
            }
        }
    }

    /* renamed from: H */
    public static void m28422H(int i, List list, C16905j jVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                jVar.f37242a.mo59726Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.m27887l(((Integer) list.get(i4)).intValue());
                }
                jVar.f37242a.mo59728S(i3);
                while (i2 < list.size()) {
                    jVar.f37242a.mo59719J(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            jVar.getClass();
            while (i2 < list.size()) {
                jVar.f37242a.mo59718I(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: I */
    public static void m28423I(int i, List list, C16905j jVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                jVar.f37242a.mo59726Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    Logger logger = CodedOutputStream.f37140b;
                    i3 += 4;
                }
                jVar.f37242a.mo59728S(i3);
                while (i2 < list.size()) {
                    jVar.f37242a.mo59715F(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            jVar.getClass();
            while (i2 < list.size()) {
                jVar.f37242a.mo59714E(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: J */
    public static void m28424J(int i, List list, C16905j jVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                jVar.f37242a.mo59726Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    Logger logger = CodedOutputStream.f37140b;
                    i3 += 8;
                }
                jVar.f37242a.mo59728S(i3);
                while (i2 < list.size()) {
                    jVar.f37242a.mo59717H(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            jVar.getClass();
            while (i2 < list.size()) {
                jVar.f37242a.mo59716G(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: K */
    public static void m28425K(int i, List list, C16905j jVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                jVar.f37242a.mo59726Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).floatValue();
                    Logger logger = CodedOutputStream.f37140b;
                    i3 += 4;
                }
                jVar.f37242a.mo59728S(i3);
                while (i2 < list.size()) {
                    CodedOutputStream codedOutputStream = jVar.f37242a;
                    float floatValue = ((Float) list.get(i2)).floatValue();
                    codedOutputStream.getClass();
                    codedOutputStream.mo59715F(Float.floatToRawIntBits(floatValue));
                    i2++;
                }
                return;
            }
            jVar.getClass();
            while (i2 < list.size()) {
                CodedOutputStream codedOutputStream2 = jVar.f37242a;
                float floatValue2 = ((Float) list.get(i2)).floatValue();
                codedOutputStream2.getClass();
                codedOutputStream2.mo59714E(i, Float.floatToRawIntBits(floatValue2));
                i2++;
            }
        }
    }

    /* renamed from: L */
    public static void m28426L(int i, List list, C16905j jVar, C16947w0 w0Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            jVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                jVar.mo59958h(i, w0Var, list.get(i2));
            }
        }
    }

    /* renamed from: M */
    public static void m28427M(int i, List list, C16905j jVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                jVar.f37242a.mo59726Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.m27887l(((Integer) list.get(i4)).intValue());
                }
                jVar.f37242a.mo59728S(i3);
                while (i2 < list.size()) {
                    jVar.f37242a.mo59719J(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            jVar.getClass();
            while (i2 < list.size()) {
                jVar.f37242a.mo59718I(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: N */
    public static void m28428N(int i, List list, C16905j jVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                jVar.f37242a.mo59726Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.m27900y(((Long) list.get(i4)).longValue());
                }
                jVar.f37242a.mo59728S(i3);
                while (i2 < list.size()) {
                    jVar.f37242a.mo59730U(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            jVar.getClass();
            while (i2 < list.size()) {
                jVar.f37242a.mo59729T(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: O */
    public static void m28429O(int i, List list, C16905j jVar, C16947w0 w0Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            jVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                jVar.mo59961k(i, w0Var, list.get(i2));
            }
        }
    }

    /* renamed from: P */
    public static void m28430P(int i, List list, C16905j jVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                jVar.f37242a.mo59726Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    Logger logger = CodedOutputStream.f37140b;
                    i3 += 4;
                }
                jVar.f37242a.mo59728S(i3);
                while (i2 < list.size()) {
                    jVar.f37242a.mo59715F(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            jVar.getClass();
            while (i2 < list.size()) {
                jVar.f37242a.mo59714E(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: Q */
    public static void m28431Q(int i, List list, C16905j jVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                jVar.f37242a.mo59726Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    Logger logger = CodedOutputStream.f37140b;
                    i3 += 8;
                }
                jVar.f37242a.mo59728S(i3);
                while (i2 < list.size()) {
                    jVar.f37242a.mo59717H(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            jVar.getClass();
            while (i2 < list.size()) {
                jVar.f37242a.mo59716G(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: R */
    public static void m28432R(int i, List list, C16905j jVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                jVar.f37242a.mo59726Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue = ((Integer) list.get(i4)).intValue();
                    i3 += CodedOutputStream.m27898w((intValue >> 31) ^ (intValue << 1));
                }
                jVar.f37242a.mo59728S(i3);
                while (i2 < list.size()) {
                    CodedOutputStream codedOutputStream = jVar.f37242a;
                    int intValue2 = ((Integer) list.get(i2)).intValue();
                    codedOutputStream.mo59728S((intValue2 >> 31) ^ (intValue2 << 1));
                    i2++;
                }
                return;
            }
            jVar.getClass();
            while (i2 < list.size()) {
                CodedOutputStream codedOutputStream2 = jVar.f37242a;
                int intValue3 = ((Integer) list.get(i2)).intValue();
                codedOutputStream2.mo59727R(i, (intValue3 >> 31) ^ (intValue3 << 1));
                i2++;
            }
        }
    }

    /* renamed from: S */
    public static void m28433S(int i, List list, C16905j jVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                jVar.f37242a.mo59726Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Long) list.get(i4)).longValue();
                    i3 += CodedOutputStream.m27900y((longValue >> 63) ^ (longValue << 1));
                }
                jVar.f37242a.mo59728S(i3);
                while (i2 < list.size()) {
                    CodedOutputStream codedOutputStream = jVar.f37242a;
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    codedOutputStream.mo59730U((longValue2 >> 63) ^ (longValue2 << 1));
                    i2++;
                }
                return;
            }
            jVar.getClass();
            while (i2 < list.size()) {
                CodedOutputStream codedOutputStream2 = jVar.f37242a;
                long longValue3 = ((Long) list.get(i2)).longValue();
                codedOutputStream2.mo59729T(i, (longValue3 >> 63) ^ (longValue3 << 1));
                i2++;
            }
        }
    }

    /* renamed from: T */
    public static void m28434T(int i, List list, C16905j jVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            jVar.getClass();
            int i2 = 0;
            if (list instanceof C16952z) {
                C16952z zVar = (C16952z) list;
                while (i2 < list.size()) {
                    Object k = zVar.mo59888k(i2);
                    if (k instanceof String) {
                        jVar.f37242a.mo59724O(i, (String) k);
                    } else {
                        jVar.f37242a.mo59712C(i, (ByteString) k);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                jVar.f37242a.mo59724O(i, (String) list.get(i2));
                i2++;
            }
        }
    }

    /* renamed from: U */
    public static void m28435U(int i, List list, C16905j jVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                jVar.f37242a.mo59726Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.m27898w(((Integer) list.get(i4)).intValue());
                }
                jVar.f37242a.mo59728S(i3);
                while (i2 < list.size()) {
                    jVar.f37242a.mo59728S(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            jVar.getClass();
            while (i2 < list.size()) {
                jVar.f37242a.mo59727R(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: V */
    public static void m28436V(int i, List list, C16905j jVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                jVar.f37242a.mo59726Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.m27900y(((Long) list.get(i4)).longValue());
                }
                jVar.f37242a.mo59728S(i3);
                while (i2 < list.size()) {
                    jVar.f37242a.mo59730U(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            jVar.getClass();
            while (i2 < list.size()) {
                jVar.f37242a.mo59729T(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: a */
    public static int m28437a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.m27878c(i) * size;
    }

    /* renamed from: b */
    public static int m28438b(List<?> list) {
        return list.size();
    }

    /* renamed from: c */
    public static int m28439c(int i, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int u = CodedOutputStream.m27896u(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int size2 = list.get(i2).size();
            u += CodedOutputStream.m27898w(size2) + size2;
        }
        return u;
    }

    /* renamed from: d */
    public static int m28440d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m27896u(i) * size) + m28441e(list);
    }

    /* renamed from: e */
    public static int m28441e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C16933u) {
            C16933u uVar = (C16933u) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m27887l(uVar.mo60044g(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m27887l(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    public static int m28442f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.m27882g(i) * size;
    }

    /* renamed from: g */
    public static int m28443g(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    public static int m28444h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.m27883h(i) * size;
    }

    /* renamed from: i */
    public static int m28445i(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    public static int m28446j(int i, List<C16906j0> list, C16947w0 w0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += CodedOutputStream.m27885j(i, list.get(i3), w0Var);
        }
        return i2;
    }

    /* renamed from: k */
    public static int m28447k(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m27896u(i) * size) + m28448l(list);
    }

    /* renamed from: l */
    public static int m28448l(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C16933u) {
            C16933u uVar = (C16933u) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m27887l(uVar.mo60044g(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m27887l(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: m */
    public static int m28449m(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (CodedOutputStream.m27896u(i) * list.size()) + m28450n(list);
    }

    /* renamed from: n */
    public static int m28450n(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C16870b0) {
            C16870b0 b0Var = (C16870b0) list;
            i = 0;
            while (i2 < size) {
                b0Var.mo59839e(i2);
                i += CodedOutputStream.m27900y(b0Var.f37180c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m27900y(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: o */
    public static int m28451o(int i, C16947w0 w0Var, Object obj) {
        if (obj instanceof C16948x) {
            return CodedOutputStream.m27889n((C16948x) obj) + CodedOutputStream.m27896u(i);
        }
        int u = CodedOutputStream.m27896u(i);
        C16863a aVar = (C16863a) ((C16906j0) obj);
        int g = aVar.mo59749g();
        if (g == -1) {
            g = w0Var.mo59992d(aVar);
            aVar.mo59754r(g);
        }
        return CodedOutputStream.m27898w(g) + g + u;
    }

    /* renamed from: p */
    public static int m28452p(int i, List<?> list, C16947w0 w0Var) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int u = CodedOutputStream.m27896u(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C16948x) {
                i2 = CodedOutputStream.m27889n((C16948x) obj);
            } else {
                C16863a aVar = (C16863a) ((C16906j0) obj);
                int g = aVar.mo59749g();
                if (g == -1) {
                    g = w0Var.mo59992d(aVar);
                    aVar.mo59754r(g);
                }
                i2 = CodedOutputStream.m27898w(g) + g;
            }
            u += i2;
        }
        return u;
    }

    /* renamed from: q */
    public static int m28453q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m27896u(i) * size) + m28454r(list);
    }

    /* renamed from: r */
    public static int m28454r(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C16933u) {
            C16933u uVar = (C16933u) list;
            i = 0;
            while (i2 < size) {
                int g = uVar.mo60044g(i2);
                i += CodedOutputStream.m27898w((g >> 31) ^ (g << 1));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i3 = i + CodedOutputStream.m27898w((intValue >> 31) ^ (intValue << 1));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: s */
    public static int m28455s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m27896u(i) * size) + m28456t(list);
    }

    /* renamed from: t */
    public static int m28456t(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C16870b0) {
            C16870b0 b0Var = (C16870b0) list;
            i = 0;
            while (i2 < size) {
                b0Var.mo59839e(i2);
                long j = b0Var.f37180c[i2];
                i += CodedOutputStream.m27900y((j >> 63) ^ (j << 1));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i3 = i + CodedOutputStream.m27900y((longValue >> 63) ^ (longValue << 1));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: u */
    public static int m28457u(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int u = CodedOutputStream.m27896u(i) * size;
        if (list instanceof C16952z) {
            C16952z zVar = (C16952z) list;
            while (i4 < size) {
                Object k = zVar.mo59888k(i4);
                if (k instanceof ByteString) {
                    int size2 = ((ByteString) k).size();
                    i3 = CodedOutputStream.m27898w(size2) + size2;
                } else {
                    i3 = CodedOutputStream.m27895t((String) k);
                }
                u += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof ByteString) {
                    int size3 = ((ByteString) obj).size();
                    i2 = CodedOutputStream.m27898w(size3) + size3;
                } else {
                    i2 = CodedOutputStream.m27895t((String) obj);
                }
                u += i2;
                i4++;
            }
        }
        return u;
    }

    /* renamed from: v */
    public static int m28458v(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m27896u(i) * size) + m28459w(list);
    }

    /* renamed from: w */
    public static int m28459w(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C16933u) {
            C16933u uVar = (C16933u) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m27898w(uVar.mo60044g(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m27898w(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: x */
    public static int m28460x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m27896u(i) * size) + m28461y(list);
    }

    /* renamed from: y */
    public static int m28461y(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C16870b0) {
            C16870b0 b0Var = (C16870b0) list;
            i = 0;
            while (i2 < size) {
                b0Var.mo59839e(i2);
                i += CodedOutputStream.m27900y(b0Var.f37180c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m27900y(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: z */
    public static <UT, UB> UB m28462z(int i, List<Integer> list, C16935v.C16938c cVar, UB ub, C16871b1<UT, UB> b1Var) {
        if (cVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (cVar.mo55639a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m28418D(i, intValue, ub, b1Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!cVar.mo55639a(intValue2)) {
                    ub = m28418D(i, intValue2, ub, b1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
