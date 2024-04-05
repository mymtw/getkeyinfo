package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C16521r;
import com.google.crypto.tink.shaded.protobuf.C16531v;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* renamed from: com.google.crypto.tink.shaded.protobuf.y0 */
public final class C16544y0 {

    /* renamed from: a */
    public static final Class<?> f36715a;

    /* renamed from: b */
    public static final C16473c1<?, ?> f36716b = m27299A(false);

    /* renamed from: c */
    public static final C16473c1<?, ?> f36717c = m27299A(true);

    /* renamed from: d */
    public static final C16480e1 f36718d = new C16480e1();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f36715a = cls;
    }

    /* renamed from: A */
    public static C16473c1<?, ?> m27299A(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (C16473c1) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: B */
    public static <T, FT extends C16521r.C16523b<FT>> void m27300B(C16514o<FT> oVar, T t, T t2) {
        C16521r<FT> c = oVar.mo58927c(t2);
        if (!c.mo58941h()) {
            C16521r<FT> d = oVar.mo58928d(t);
            d.getClass();
            for (int i = 0; i < c.f36688a.mo58615d(); i++) {
                d.mo58945l(c.f36688a.mo58612c(i));
            }
            for (Map.Entry<T, Object> l : c.f36688a.mo58616e()) {
                d.mo58945l(l);
            }
        }
    }

    /* renamed from: C */
    public static boolean m27301C(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: D */
    public static <UT, UB> UB m27302D(int i, int i2, UB ub, C16473c1<UT, UB> c1Var) {
        if (ub == null) {
            ub = c1Var.mo58691m();
        }
        c1Var.mo58683e(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: E */
    public static void m27303E(int i, List list, C16505k kVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                kVar.f36650a.mo58502M(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).booleanValue();
                    Logger logger = CodedOutputStream.f36529b;
                    i3++;
                }
                kVar.f36650a.mo58504O(i3);
                while (i2 < list.size()) {
                    kVar.f36650a.mo58507z(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            kVar.getClass();
            while (i2 < list.size()) {
                kVar.f36650a.mo58490A(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    /* renamed from: F */
    public static void m27304F(int i, List list, C16505k kVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            kVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                kVar.f36650a.mo58491B(i, (ByteString) list.get(i2));
            }
        }
    }

    /* renamed from: G */
    public static void m27305G(int i, List list, C16505k kVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                kVar.f36650a.mo58502M(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).doubleValue();
                    Logger logger = CodedOutputStream.f36529b;
                    i3 += 8;
                }
                kVar.f36650a.mo58504O(i3);
                while (i2 < list.size()) {
                    CodedOutputStream codedOutputStream = kVar.f36650a;
                    double doubleValue = ((Double) list.get(i2)).doubleValue();
                    codedOutputStream.getClass();
                    codedOutputStream.mo58495F(Double.doubleToRawLongBits(doubleValue));
                    i2++;
                }
                return;
            }
            kVar.getClass();
            while (i2 < list.size()) {
                CodedOutputStream codedOutputStream2 = kVar.f36650a;
                double doubleValue2 = ((Double) list.get(i2)).doubleValue();
                codedOutputStream2.getClass();
                codedOutputStream2.mo58494E(i, Double.doubleToRawLongBits(doubleValue2));
                i2++;
            }
        }
    }

    /* renamed from: H */
    public static void m27306H(int i, List list, C16505k kVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                kVar.f36650a.mo58502M(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.m26571l(((Integer) list.get(i4)).intValue());
                }
                kVar.f36650a.mo58504O(i3);
                while (i2 < list.size()) {
                    kVar.f36650a.mo58497H(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            kVar.getClass();
            while (i2 < list.size()) {
                kVar.f36650a.mo58496G(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: I */
    public static void m27307I(int i, List list, C16505k kVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                kVar.f36650a.mo58502M(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    Logger logger = CodedOutputStream.f36529b;
                    i3 += 4;
                }
                kVar.f36650a.mo58504O(i3);
                while (i2 < list.size()) {
                    kVar.f36650a.mo58493D(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            kVar.getClass();
            while (i2 < list.size()) {
                kVar.f36650a.mo58492C(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: J */
    public static void m27308J(int i, List list, C16505k kVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                kVar.f36650a.mo58502M(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    Logger logger = CodedOutputStream.f36529b;
                    i3 += 8;
                }
                kVar.f36650a.mo58504O(i3);
                while (i2 < list.size()) {
                    kVar.f36650a.mo58495F(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            kVar.getClass();
            while (i2 < list.size()) {
                kVar.f36650a.mo58494E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: K */
    public static void m27309K(int i, List list, C16505k kVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                kVar.f36650a.mo58502M(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).floatValue();
                    Logger logger = CodedOutputStream.f36529b;
                    i3 += 4;
                }
                kVar.f36650a.mo58504O(i3);
                while (i2 < list.size()) {
                    CodedOutputStream codedOutputStream = kVar.f36650a;
                    float floatValue = ((Float) list.get(i2)).floatValue();
                    codedOutputStream.getClass();
                    codedOutputStream.mo58493D(Float.floatToRawIntBits(floatValue));
                    i2++;
                }
                return;
            }
            kVar.getClass();
            while (i2 < list.size()) {
                CodedOutputStream codedOutputStream2 = kVar.f36650a;
                float floatValue2 = ((Float) list.get(i2)).floatValue();
                codedOutputStream2.getClass();
                codedOutputStream2.mo58492C(i, Float.floatToRawIntBits(floatValue2));
                i2++;
            }
        }
    }

    /* renamed from: L */
    public static void m27310L(int i, List list, C16505k kVar, C16542x0 x0Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            kVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                kVar.mo58865h(i, x0Var, list.get(i2));
            }
        }
    }

    /* renamed from: M */
    public static void m27311M(int i, List list, C16505k kVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                kVar.f36650a.mo58502M(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.m26571l(((Integer) list.get(i4)).intValue());
                }
                kVar.f36650a.mo58504O(i3);
                while (i2 < list.size()) {
                    kVar.f36650a.mo58497H(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            kVar.getClass();
            while (i2 < list.size()) {
                kVar.f36650a.mo58496G(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: N */
    public static void m27312N(int i, List list, C16505k kVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                kVar.f36650a.mo58502M(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.m26584y(((Long) list.get(i4)).longValue());
                }
                kVar.f36650a.mo58504O(i3);
                while (i2 < list.size()) {
                    kVar.f36650a.mo58506Q(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            kVar.getClass();
            while (i2 < list.size()) {
                kVar.f36650a.mo58505P(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: O */
    public static void m27313O(int i, List list, C16505k kVar, C16542x0 x0Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            kVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                kVar.mo58868k(i, x0Var, list.get(i2));
            }
        }
    }

    /* renamed from: P */
    public static void m27314P(int i, List list, C16505k kVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                kVar.f36650a.mo58502M(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    Logger logger = CodedOutputStream.f36529b;
                    i3 += 4;
                }
                kVar.f36650a.mo58504O(i3);
                while (i2 < list.size()) {
                    kVar.f36650a.mo58493D(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            kVar.getClass();
            while (i2 < list.size()) {
                kVar.f36650a.mo58492C(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: Q */
    public static void m27315Q(int i, List list, C16505k kVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                kVar.f36650a.mo58502M(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    Logger logger = CodedOutputStream.f36529b;
                    i3 += 8;
                }
                kVar.f36650a.mo58504O(i3);
                while (i2 < list.size()) {
                    kVar.f36650a.mo58495F(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            kVar.getClass();
            while (i2 < list.size()) {
                kVar.f36650a.mo58494E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: R */
    public static void m27316R(int i, List list, C16505k kVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                kVar.f36650a.mo58502M(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue = ((Integer) list.get(i4)).intValue();
                    i3 += CodedOutputStream.m26582w((intValue >> 31) ^ (intValue << 1));
                }
                kVar.f36650a.mo58504O(i3);
                while (i2 < list.size()) {
                    CodedOutputStream codedOutputStream = kVar.f36650a;
                    int intValue2 = ((Integer) list.get(i2)).intValue();
                    codedOutputStream.mo58504O((intValue2 >> 31) ^ (intValue2 << 1));
                    i2++;
                }
                return;
            }
            kVar.getClass();
            while (i2 < list.size()) {
                CodedOutputStream codedOutputStream2 = kVar.f36650a;
                int intValue3 = ((Integer) list.get(i2)).intValue();
                codedOutputStream2.mo58503N(i, (intValue3 >> 31) ^ (intValue3 << 1));
                i2++;
            }
        }
    }

    /* renamed from: S */
    public static void m27317S(int i, List list, C16505k kVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                kVar.f36650a.mo58502M(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Long) list.get(i4)).longValue();
                    i3 += CodedOutputStream.m26584y((longValue >> 63) ^ (longValue << 1));
                }
                kVar.f36650a.mo58504O(i3);
                while (i2 < list.size()) {
                    CodedOutputStream codedOutputStream = kVar.f36650a;
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    codedOutputStream.mo58506Q((longValue2 >> 63) ^ (longValue2 << 1));
                    i2++;
                }
                return;
            }
            kVar.getClass();
            while (i2 < list.size()) {
                CodedOutputStream codedOutputStream2 = kVar.f36650a;
                long longValue3 = ((Long) list.get(i2)).longValue();
                codedOutputStream2.mo58505P(i, (longValue3 >> 63) ^ (longValue3 << 1));
                i2++;
            }
        }
    }

    /* renamed from: T */
    public static void m27318T(int i, List list, C16505k kVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            kVar.getClass();
            int i2 = 0;
            if (list instanceof C16545z) {
                C16545z zVar = (C16545z) list;
                while (i2 < list.size()) {
                    Object k = zVar.mo58723k(i2);
                    if (k instanceof String) {
                        kVar.f36650a.mo58501L(i, (String) k);
                    } else {
                        kVar.f36650a.mo58491B(i, (ByteString) k);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kVar.f36650a.mo58501L(i, (String) list.get(i2));
                i2++;
            }
        }
    }

    /* renamed from: U */
    public static void m27319U(int i, List list, C16505k kVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                kVar.f36650a.mo58502M(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.m26582w(((Integer) list.get(i4)).intValue());
                }
                kVar.f36650a.mo58504O(i3);
                while (i2 < list.size()) {
                    kVar.f36650a.mo58504O(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            kVar.getClass();
            while (i2 < list.size()) {
                kVar.f36650a.mo58503N(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: V */
    public static void m27320V(int i, List list, C16505k kVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                kVar.f36650a.mo58502M(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.m26584y(((Long) list.get(i4)).longValue());
                }
                kVar.f36650a.mo58504O(i3);
                while (i2 < list.size()) {
                    kVar.f36650a.mo58506Q(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            kVar.getClass();
            while (i2 < list.size()) {
                kVar.f36650a.mo58505P(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: a */
    public static int m27321a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.m26562c(i) * size;
    }

    /* renamed from: b */
    public static int m27322b(List<?> list) {
        return list.size();
    }

    /* renamed from: c */
    public static int m27323c(int i, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int u = CodedOutputStream.m26580u(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int size2 = list.get(i2).size();
            u += CodedOutputStream.m26582w(size2) + size2;
        }
        return u;
    }

    /* renamed from: d */
    public static int m27324d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m26580u(i) * size) + m27325e(list);
    }

    /* renamed from: e */
    public static int m27325e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C16529u) {
            C16529u uVar = (C16529u) list;
            i = 0;
            while (i2 < size) {
                uVar.mo58958e(i2);
                i += CodedOutputStream.m26571l(uVar.f36699c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m26571l(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    public static int m27326f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.m26566g(i) * size;
    }

    /* renamed from: g */
    public static int m27327g(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    public static int m27328h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.m26567h(i) * size;
    }

    /* renamed from: i */
    public static int m27329i(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    public static int m27330j(int i, List<C16503j0> list, C16542x0 x0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += CodedOutputStream.m26569j(i, list.get(i3), x0Var);
        }
        return i2;
    }

    /* renamed from: k */
    public static int m27331k(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m26580u(i) * size) + m27332l(list);
    }

    /* renamed from: l */
    public static int m27332l(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C16529u) {
            C16529u uVar = (C16529u) list;
            i = 0;
            while (i2 < size) {
                uVar.mo58958e(i2);
                i += CodedOutputStream.m26571l(uVar.f36699c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m26571l(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: m */
    public static int m27333m(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (CodedOutputStream.m26580u(i) * list.size()) + m27334n(list);
    }

    /* renamed from: n */
    public static int m27334n(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C16467b0) {
            C16467b0 b0Var = (C16467b0) list;
            i = 0;
            while (i2 < size) {
                b0Var.mo58657e(i2);
                i += CodedOutputStream.m26584y(b0Var.f36581c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m26584y(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: o */
    public static int m27335o(int i, C16542x0 x0Var, Object obj) {
        if (obj instanceof C16541x) {
            return CodedOutputStream.m26573n((C16541x) obj) + CodedOutputStream.m26580u(i);
        }
        int u = CodedOutputStream.m26580u(i);
        C16452a aVar = (C16452a) ((C16503j0) obj);
        int e = aVar.mo58526e();
        if (e == -1) {
            e = x0Var.mo58902d(aVar);
            aVar.mo58533k(e);
        }
        return CodedOutputStream.m26582w(e) + e + u;
    }

    /* renamed from: p */
    public static int m27336p(int i, List<?> list, C16542x0 x0Var) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int u = CodedOutputStream.m26580u(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C16541x) {
                i2 = CodedOutputStream.m26573n((C16541x) obj);
            } else {
                C16452a aVar = (C16452a) ((C16503j0) obj);
                int e = aVar.mo58526e();
                if (e == -1) {
                    e = x0Var.mo58902d(aVar);
                    aVar.mo58533k(e);
                }
                i2 = CodedOutputStream.m26582w(e) + e;
            }
            u += i2;
        }
        return u;
    }

    /* renamed from: q */
    public static int m27337q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m26580u(i) * size) + m27338r(list);
    }

    /* renamed from: r */
    public static int m27338r(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C16529u) {
            C16529u uVar = (C16529u) list;
            i = 0;
            while (i2 < size) {
                uVar.mo58958e(i2);
                int i3 = uVar.f36699c[i2];
                i += CodedOutputStream.m26582w((i3 >> 31) ^ (i3 << 1));
                i2++;
            }
        } else {
            int i4 = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i4 = i + CodedOutputStream.m26582w((intValue >> 31) ^ (intValue << 1));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: s */
    public static int m27339s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m26580u(i) * size) + m27340t(list);
    }

    /* renamed from: t */
    public static int m27340t(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C16467b0) {
            C16467b0 b0Var = (C16467b0) list;
            i = 0;
            while (i2 < size) {
                b0Var.mo58657e(i2);
                long j = b0Var.f36581c[i2];
                i += CodedOutputStream.m26584y((j >> 63) ^ (j << 1));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i3 = i + CodedOutputStream.m26584y((longValue >> 63) ^ (longValue << 1));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: u */
    public static int m27341u(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int u = CodedOutputStream.m26580u(i) * size;
        if (list instanceof C16545z) {
            C16545z zVar = (C16545z) list;
            while (i4 < size) {
                Object k = zVar.mo58723k(i4);
                if (k instanceof ByteString) {
                    int size2 = ((ByteString) k).size();
                    i3 = CodedOutputStream.m26582w(size2) + size2;
                } else {
                    i3 = CodedOutputStream.m26579t((String) k);
                }
                u += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof ByteString) {
                    int size3 = ((ByteString) obj).size();
                    i2 = CodedOutputStream.m26582w(size3) + size3;
                } else {
                    i2 = CodedOutputStream.m26579t((String) obj);
                }
                u += i2;
                i4++;
            }
        }
        return u;
    }

    /* renamed from: v */
    public static int m27342v(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m26580u(i) * size) + m27343w(list);
    }

    /* renamed from: w */
    public static int m27343w(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C16529u) {
            C16529u uVar = (C16529u) list;
            i = 0;
            while (i2 < size) {
                uVar.mo58958e(i2);
                i += CodedOutputStream.m26582w(uVar.f36699c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m26582w(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: x */
    public static int m27344x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m26580u(i) * size) + m27345y(list);
    }

    /* renamed from: y */
    public static int m27345y(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C16467b0) {
            C16467b0 b0Var = (C16467b0) list;
            i = 0;
            while (i2 < size) {
                b0Var.mo58657e(i2);
                i += CodedOutputStream.m26584y(b0Var.f36581c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m26584y(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: z */
    public static <UT, UB> UB m27346z(int i, List<Integer> list, C16531v.C16534c cVar, UB ub, C16473c1<UT, UB> c1Var) {
        if (cVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (cVar.mo58426a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m27302D(i, intValue, ub, c1Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!cVar.mo58426a(intValue2)) {
                    ub = m27302D(i, intValue2, ub, c1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
