package kotlin.collections;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p504ai.C13983i;

/* renamed from: kotlin.collections.b0 */
public class C19294b0 extends C19421p {
    /* renamed from: A0 */
    public static final LinkedHashMap m32558A0(Map map) {
        C19383o.m32797g(map, "<this>");
        return new LinkedHashMap(map);
    }

    /* renamed from: p0 */
    public static final Map m32559p0() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        C19383o.m32795e(emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    /* renamed from: q0 */
    public static final Object m32560q0(Object obj, Map map) {
        C19383o.m32797g(map, "<this>");
        if (map instanceof C19288a0) {
            return ((C19288a0) map).mo71576o();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException(C13983i.m21494m("Key ", obj, " is missing in the map."));
    }

    /* renamed from: r0 */
    public static final HashMap m32561r0(Pair... pairArr) {
        HashMap hashMap = new HashMap(C19421p.m32930T(pairArr.length));
        m32566w0(hashMap, pairArr);
        return hashMap;
    }

    /* renamed from: s0 */
    public static final Map m32562s0(Pair... pairArr) {
        if (pairArr.length <= 0) {
            return m32559p0();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C19421p.m32930T(pairArr.length));
        m32566w0(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    /* renamed from: t0 */
    public static final LinkedHashMap m32563t0(Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C19421p.m32930T(pairArr.length));
        m32566w0(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    /* renamed from: u0 */
    public static final LinkedHashMap m32564u0(Map map, Map map2) {
        C19383o.m32797g(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* renamed from: v0 */
    public static final Map m32565v0(Map map, Pair pair) {
        if (map.isEmpty()) {
            return C19421p.m32931U(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.getFirst(), pair.getSecond());
        return linkedHashMap;
    }

    /* renamed from: w0 */
    public static final void m32566w0(AbstractMap abstractMap, Pair[] pairArr) {
        for (Pair pair : pairArr) {
            abstractMap.put(pair.component1(), pair.component2());
        }
    }

    /* renamed from: x0 */
    public static final Map m32567x0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return m32559p0();
        }
        if (size == 1) {
            return C19421p.m32931U((Pair) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C19421p.m32930T(arrayList.size()));
        m32569z0(arrayList, linkedHashMap);
        return linkedHashMap;
    }

    /* renamed from: y0 */
    public static final Map m32568y0(Map map) {
        C19383o.m32797g(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? m32558A0(map) : C19421p.m32941i0(map) : m32559p0();
    }

    /* renamed from: z0 */
    public static final void m32569z0(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put(pair.component1(), pair.component2());
        }
    }
}
