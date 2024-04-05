package kotlin.jvm.internal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import p010a9.C0048b;
import p755lq.C19875a;
import p755lq.C19876b;
import p755lq.C19877c;
import p755lq.C19878d;

/* renamed from: kotlin.jvm.internal.t */
public final class C19389t {
    /* renamed from: a */
    public static Collection m32907a(Collection collection) {
        if (!(collection instanceof C19875a) || (collection instanceof C19876b)) {
            return collection;
        }
        m32911e(collection, "kotlin.collections.MutableCollection");
        throw null;
    }

    /* renamed from: b */
    public static List m32908b(Object obj) {
        if (!(obj instanceof C19875a) || (obj instanceof C19877c)) {
            try {
                return (List) obj;
            } catch (ClassCastException e) {
                C19383o.m32801k(C19389t.class.getName(), e);
                throw e;
            }
        } else {
            m32911e(obj, "kotlin.collections.MutableList");
            throw null;
        }
    }

    /* renamed from: c */
    public static Map m32909c(Map map) {
        if (!(map instanceof C19875a) || (map instanceof C19878d)) {
            return map;
        }
        m32911e(map, "kotlin.collections.MutableMap");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00b9, code lost:
        if ((r4 instanceof kotlin.jvm.internal.C19381m ? ((kotlin.jvm.internal.C19381m) r4).getArity() : r4 instanceof p753kq.C19846a ? 0 : r4 instanceof p753kq.C19857l ? 1 : r4 instanceof p753kq.C19861p ? 2 : r4 instanceof p753kq.C19862q ? 3 : r4 instanceof p753kq.C19863r ? 4 : r4 instanceof p753kq.C19864s ? 5 : r4 instanceof p753kq.C19865t ? 6 : r4 instanceof p753kq.C19866u ? 7 : r4 instanceof p753kq.C19867v ? 8 : r4 instanceof p753kq.C19868w ? 9 : r4 instanceof p753kq.C19847b ? 10 : r4 instanceof p753kq.C19848c ? 11 : r4 instanceof p753kq.C19849d ? 12 : r4 instanceof p753kq.C19850e ? 13 : r4 instanceof p753kq.C19851f ? 14 : r4 instanceof p753kq.C19852g ? 15 : r4 instanceof p753kq.C19853h ? 16 : r4 instanceof p753kq.C19854i ? 17 : r4 instanceof p753kq.C19855j ? 18 : r4 instanceof p753kq.C19856k ? 19 : r4 instanceof p753kq.C19858m ? 20 : r4 instanceof p753kq.C19859n ? 21 : r4 instanceof p753kq.C19860o ? 22 : -1) == r3) goto L_0x00bd;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m32910d(int r3, java.lang.Object r4) {
        /*
            if (r4 == 0) goto L_0x00d6
            boolean r0 = r4 instanceof kotlin.C19283a
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00bc
            boolean r0 = r4 instanceof kotlin.jvm.internal.C19381m
            if (r0 == 0) goto L_0x0015
            r0 = r4
            kotlin.jvm.internal.m r0 = (kotlin.jvm.internal.C19381m) r0
            int r0 = r0.getArity()
            goto L_0x00b9
        L_0x0015:
            boolean r0 = r4 instanceof p753kq.C19846a
            if (r0 == 0) goto L_0x001c
            r0 = r2
            goto L_0x00b9
        L_0x001c:
            boolean r0 = r4 instanceof p753kq.C19857l
            if (r0 == 0) goto L_0x0023
            r0 = r1
            goto L_0x00b9
        L_0x0023:
            boolean r0 = r4 instanceof p753kq.C19861p
            if (r0 == 0) goto L_0x002a
            r0 = 2
            goto L_0x00b9
        L_0x002a:
            boolean r0 = r4 instanceof p753kq.C19862q
            if (r0 == 0) goto L_0x0031
            r0 = 3
            goto L_0x00b9
        L_0x0031:
            boolean r0 = r4 instanceof p753kq.C19863r
            if (r0 == 0) goto L_0x0038
            r0 = 4
            goto L_0x00b9
        L_0x0038:
            boolean r0 = r4 instanceof p753kq.C19864s
            if (r0 == 0) goto L_0x003f
            r0 = 5
            goto L_0x00b9
        L_0x003f:
            boolean r0 = r4 instanceof p753kq.C19865t
            if (r0 == 0) goto L_0x0046
            r0 = 6
            goto L_0x00b9
        L_0x0046:
            boolean r0 = r4 instanceof p753kq.C19866u
            if (r0 == 0) goto L_0x004d
            r0 = 7
            goto L_0x00b9
        L_0x004d:
            boolean r0 = r4 instanceof p753kq.C19867v
            if (r0 == 0) goto L_0x0055
            r0 = 8
            goto L_0x00b9
        L_0x0055:
            boolean r0 = r4 instanceof p753kq.C19868w
            if (r0 == 0) goto L_0x005d
            r0 = 9
            goto L_0x00b9
        L_0x005d:
            boolean r0 = r4 instanceof p753kq.C19847b
            if (r0 == 0) goto L_0x0064
            r0 = 10
            goto L_0x00b9
        L_0x0064:
            boolean r0 = r4 instanceof p753kq.C19848c
            if (r0 == 0) goto L_0x006b
            r0 = 11
            goto L_0x00b9
        L_0x006b:
            boolean r0 = r4 instanceof p753kq.C19849d
            if (r0 == 0) goto L_0x0072
            r0 = 12
            goto L_0x00b9
        L_0x0072:
            boolean r0 = r4 instanceof p753kq.C19850e
            if (r0 == 0) goto L_0x0079
            r0 = 13
            goto L_0x00b9
        L_0x0079:
            boolean r0 = r4 instanceof p753kq.C19851f
            if (r0 == 0) goto L_0x0080
            r0 = 14
            goto L_0x00b9
        L_0x0080:
            boolean r0 = r4 instanceof p753kq.C19852g
            if (r0 == 0) goto L_0x0087
            r0 = 15
            goto L_0x00b9
        L_0x0087:
            boolean r0 = r4 instanceof p753kq.C19853h
            if (r0 == 0) goto L_0x008e
            r0 = 16
            goto L_0x00b9
        L_0x008e:
            boolean r0 = r4 instanceof p753kq.C19854i
            if (r0 == 0) goto L_0x0095
            r0 = 17
            goto L_0x00b9
        L_0x0095:
            boolean r0 = r4 instanceof p753kq.C19855j
            if (r0 == 0) goto L_0x009c
            r0 = 18
            goto L_0x00b9
        L_0x009c:
            boolean r0 = r4 instanceof p753kq.C19856k
            if (r0 == 0) goto L_0x00a3
            r0 = 19
            goto L_0x00b9
        L_0x00a3:
            boolean r0 = r4 instanceof p753kq.C19858m
            if (r0 == 0) goto L_0x00aa
            r0 = 20
            goto L_0x00b9
        L_0x00aa:
            boolean r0 = r4 instanceof p753kq.C19859n
            if (r0 == 0) goto L_0x00b1
            r0 = 21
            goto L_0x00b9
        L_0x00b1:
            boolean r0 = r4 instanceof p753kq.C19860o
            if (r0 == 0) goto L_0x00b8
            r0 = 22
            goto L_0x00b9
        L_0x00b8:
            r0 = -1
        L_0x00b9:
            if (r0 != r3) goto L_0x00bc
            goto L_0x00bd
        L_0x00bc:
            r1 = r2
        L_0x00bd:
            if (r1 == 0) goto L_0x00c0
            goto L_0x00d6
        L_0x00c0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "kotlin.jvm.functions.Function"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            m32911e(r4, r3)
            r3 = 0
            throw r3
        L_0x00d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C19389t.m32910d(int, java.lang.Object):void");
    }

    /* renamed from: e */
    public static void m32911e(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(C0048b.m163a(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        C19383o.m32801k(C19389t.class.getName(), classCastException);
        throw classCastException;
    }
}
