package kotlin.collections;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.random.Random;
import kotlin.reflect.C19421p;
import kotlin.sequences.C19432h;
import p568fn.C17782b;
import p753kq.C19857l;

/* renamed from: kotlin.collections.t */
public class C19327t extends C19325r {
    /* renamed from: O0 */
    public static final C19326s m32633O0(Iterable iterable) {
        C19383o.m32797g(iterable, "<this>");
        return new C19326s(iterable);
    }

    /* renamed from: P0 */
    public static final boolean m32634P0(Object obj, Iterable iterable) {
        int i;
        C19383o.m32797g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (i2 < 0) {
                    C17782b.m29877o0();
                    throw null;
                } else if (C19383o.m32792b(obj, next)) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            i = ((List) iterable).indexOf(obj);
        }
        return i >= 0;
    }

    /* renamed from: Q0 */
    public static final List m32635Q0(List list) {
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return m32657m1(list, size);
    }

    /* renamed from: R0 */
    public static final ArrayList m32636R0(Collection collection) {
        C19383o.m32797g(collection, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: S0 */
    public static final <T> T m32637S0(Iterable<? extends T> iterable) {
        C19383o.m32797g(iterable, "<this>");
        if (iterable instanceof List) {
            return m32638T0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: T0 */
    public static final <T> T m32638T0(List<? extends T> list) {
        C19383o.m32797g(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: U0 */
    public static final <T> T m32639U0(Iterable<? extends T> iterable) {
        C19383o.m32797g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    /* renamed from: V0 */
    public static final <T> T m32640V0(List<? extends T> list) {
        C19383o.m32797g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: W0 */
    public static final Object m32641W0(int i, List list) {
        C19383o.m32797g(list, "<this>");
        if (i < 0 || i > C17782b.m29859Y(list)) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: X0 */
    public static final void m32642X0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C19857l lVar) {
        C19383o.m32797g(iterable, "<this>");
        C19383o.m32797g(charSequence, "separator");
        C19383o.m32797g(charSequence2, "prefix");
        C19383o.m32797g(charSequence3, "postfix");
        C19383o.m32797g(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object next : iterable) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C19382n.m32709G(appendable, next, lVar);
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    /* renamed from: Z0 */
    public static String m32644Z0(Iterable iterable, String str, String str2, String str3, C19857l lVar, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        int i2 = (i & 8) != 0 ? -1 : 0;
        String str7 = (i & 16) != 0 ? "..." : null;
        C19857l lVar2 = (i & 32) != 0 ? null : lVar;
        C19383o.m32797g(iterable, "<this>");
        C19383o.m32797g(str4, "separator");
        C19383o.m32797g(str5, "prefix");
        C19383o.m32797g(str6, "postfix");
        C19383o.m32797g(str7, "truncated");
        StringBuilder sb = new StringBuilder();
        m32642X0(iterable, sb, str4, str5, str6, i2, str7, lVar2);
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: a1 */
    public static final <T> T m32645a1(List<? extends T> list) {
        C19383o.m32797g(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(C17782b.m29859Y(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: b1 */
    public static final <T> T m32646b1(List<? extends T> list) {
        C19383o.m32797g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* renamed from: c1 */
    public static final Float m32647c1(Collection collection) {
        C19383o.m32797g(collection, "<this>");
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: d1 */
    public static final Float m32648d1(Collection collection) {
        C19383o.m32797g(collection, "<this>");
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: e1 */
    public static final ArrayList m32649e1(Object obj, List list) {
        C19383o.m32797g(list, "<this>");
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(list));
        boolean z = false;
        for (Object next : list) {
            boolean z2 = true;
            if (!z && C19383o.m32792b(next, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: f1 */
    public static final ArrayList m32650f1(Iterable iterable, Collection collection) {
        C19383o.m32797g(collection, "<this>");
        C19383o.m32797g(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        C19324q.m32628J0(iterable, arrayList2);
        return arrayList2;
    }

    /* renamed from: g1 */
    public static final ArrayList m32651g1(List list, Object obj) {
        C19383o.m32797g(list, "<this>");
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(obj);
        return arrayList;
    }

    /* renamed from: h1 */
    public static final Object m32652h1(ArrayList arrayList, Random.Default defaultR) {
        C19383o.m32797g(defaultR, "random");
        if (!arrayList.isEmpty()) {
            return arrayList.get(defaultR.nextInt(arrayList.size()));
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: i1 */
    public static final List m32653i1(Collection collection) {
        C19383o.m32797g(collection, "<this>");
        if (collection.size() <= 1) {
            return m32660p1(collection);
        }
        List r1 = m32662r1(collection);
        Collections.reverse(r1);
        return r1;
    }

    /* renamed from: j1 */
    public static final Object m32654j1(Collection collection) {
        C19383o.m32797g(collection, "<this>");
        if (collection instanceof List) {
            List list = (List) collection;
            int size = list.size();
            if (size == 0) {
                throw new NoSuchElementException("List is empty.");
            } else if (size == 1) {
                return list.get(0);
            } else {
                throw new IllegalArgumentException("List has more than one element.");
            }
        } else {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (!it.hasNext()) {
                    return next;
                }
                throw new IllegalArgumentException("Collection has more than one element.");
            }
            throw new NoSuchElementException("Collection is empty.");
        }
    }

    /* renamed from: k1 */
    public static final List m32655k1(Collection collection) {
        C19383o.m32797g(collection, "<this>");
        if (collection.size() <= 1) {
            return m32660p1(collection);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        C19383o.m32795e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return C19318k.m32599Q0(comparableArr);
    }

    /* renamed from: l1 */
    public static final List m32656l1(List list, Comparator comparator) {
        C19383o.m32797g(list, "<this>");
        if (list.size() <= 1) {
            return m32660p1(list);
        }
        Object[] array = list.toArray(new Object[0]);
        C19383o.m32795e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return C19318k.m32599Q0(array);
    }

    /* renamed from: m1 */
    public static final <T> List<T> m32657m1(Iterable<? extends T> iterable, int i) {
        C19383o.m32797g(iterable, "<this>");
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(C0069a.m175f("Requested element count ", i, " is less than zero.").toString());
        } else if (i == 0) {
            return EmptyList.INSTANCE;
        } else {
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return m32660p1(iterable);
                }
                if (i == 1) {
                    return C17782b.m29864d0(m32637S0(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            for (Object add : iterable) {
                arrayList.add(add);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return C17782b.m29867g0(arrayList);
        }
    }

    /* renamed from: n1 */
    public static final void m32658n1(Iterable iterable, Collection collection) {
        C19383o.m32797g(iterable, "<this>");
        C19383o.m32797g(collection, "destination");
        for (Object add : iterable) {
            collection.add(add);
        }
    }

    /* renamed from: o1 */
    public static final int[] m32659o1(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    /* renamed from: p1 */
    public static final <T> List<T> m32660p1(Iterable<? extends T> iterable) {
        C19383o.m32797g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C17782b.m29867g0(m32662r1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return EmptyList.INSTANCE;
        }
        if (size != 1) {
            return m32661q1(collection);
        }
        return C17782b.m29864d0(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* renamed from: q1 */
    public static final ArrayList m32661q1(Collection collection) {
        C19383o.m32797g(collection, "<this>");
        return new ArrayList(collection);
    }

    /* renamed from: r1 */
    public static final <T> List<T> m32662r1(Iterable<? extends T> iterable) {
        C19383o.m32797g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m32661q1((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m32658n1(iterable, arrayList);
        return arrayList;
    }

    /* renamed from: s1 */
    public static final Set m32663s1(Collection collection) {
        C19383o.m32797g(collection, "<this>");
        return new LinkedHashSet(collection);
    }

    /* renamed from: t1 */
    public static final <T> Set<T> m32664t1(Iterable<? extends T> iterable) {
        C19383o.m32797g(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return EmptySet.INSTANCE;
            }
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(C19421p.m32930T(collection.size()));
                m32658n1(iterable, linkedHashSet);
                return linkedHashSet;
            }
            return C19382n.m32702C0(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        m32658n1(iterable, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        return size2 != 0 ? size2 != 1 ? linkedHashSet2 : C19382n.m32702C0(linkedHashSet2.iterator().next()) : EmptySet.INSTANCE;
    }

    /* renamed from: u1 */
    public static final Set m32665u1(Set set, Iterable iterable) {
        C19383o.m32797g(set, "<this>");
        C19383o.m32797g(iterable, "other");
        Set s1 = m32663s1(set);
        C19324q.m32628J0(iterable, s1);
        return s1;
    }

    /* renamed from: v1 */
    public static final ArrayList m32666v1(Iterable iterable, int i, boolean z) {
        Iterator it;
        C19383o.m32797g(iterable, "<this>");
        if (!(i > 0)) {
            throw new IllegalArgumentException((2 != i ? C0070b.m183e("Both size ", 2, " and step ", i, " must be greater than zero.") : "size 2 must be greater than zero.").toString());
        } else if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = iterable.iterator();
            C19383o.m32797g(it2, "iterator");
            if (!it2.hasNext()) {
                it = C19329v.f43189b;
            } else {
                SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(2, i, it2, false, z, (C19340c<? super SlidingWindowKt$windowedIterator$1>) null);
                C19432h hVar = new C19432h();
                hVar.f43358e = C19388s.m32843R(slidingWindowKt$windowedIterator$1, hVar, hVar);
                it = hVar;
            }
            while (it.hasNext()) {
                arrayList.add((List) it.next());
            }
            return arrayList;
        } else {
            List list = (List) iterable;
            int size = list.size();
            ArrayList arrayList2 = new ArrayList((size / i) + (size % i == 0 ? 0 : 1));
            int i2 = 0;
            while (true) {
                if (i2 >= 0 && i2 < size) {
                    int i3 = size - i2;
                    if (2 <= i3) {
                        i3 = 2;
                    }
                    if (i3 < 2 && !z) {
                        break;
                    }
                    ArrayList arrayList3 = new ArrayList(i3);
                    for (int i4 = 0; i4 < i3; i4++) {
                        arrayList3.add(list.get(i4 + i2));
                    }
                    arrayList2.add(arrayList3);
                    i2 += i;
                } else {
                    break;
                }
            }
            return arrayList2;
        }
    }

    /* renamed from: w1 */
    public static final ArrayList m32667w1(List list, List list2) {
        C19383o.m32797g(list, "<this>");
        C19383o.m32797g(list2, "other");
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C19322o.m32624F0(list), C19322o.m32624F0(list2)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }
}
