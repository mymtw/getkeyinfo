package com.google.common.collect;

import android.support.p013v4.media.C0072d;
import com.google.common.base.C15794l;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class ImmutableSortedMap<K, V> extends ImmutableSortedMapFauxverideShim<K, V> implements NavigableMap<K, V> {

    /* renamed from: i */
    public static final Ordering f35957i = Ordering.natural();

    /* renamed from: j */
    public static final ImmutableSortedMap<Comparable, Object> f35958j = new ImmutableSortedMap<>(ImmutableSortedSet.emptySet(Ordering.natural()), ImmutableList.m25826of());
    private static final long serialVersionUID = 0;

    /* renamed from: f */
    public final transient RegularImmutableSortedSet<K> f35959f;

    /* renamed from: g */
    public final transient ImmutableList<V> f35960g;

    /* renamed from: h */
    public transient ImmutableSortedMap<K, V> f35961h;

    public static class SerializedForm extends ImmutableMap.SerializedForm {
        private static final long serialVersionUID = 0;
        private final Comparator<Object> comparator;

        public SerializedForm(ImmutableSortedMap<?, ?> immutableSortedMap) {
            super(immutableSortedMap);
            this.comparator = immutableSortedMap.comparator();
        }

        public Object readResolve() {
            return createMap(new C15979b(this.comparator));
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSortedMap$a */
    public static class C15978a implements Comparator<Map.Entry<K, V>> {

        /* renamed from: b */
        public final /* synthetic */ Comparator f35962b;

        public C15978a(Comparator comparator) {
            this.f35962b = comparator;
        }

        public final int compare(Object obj, Object obj2) {
            return this.f35962b.compare(((Map.Entry) obj).getKey(), ((Map.Entry) obj2).getKey());
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSortedMap$b */
    public static class C15979b<K, V> extends ImmutableMap.C15958b<K, V> {

        /* renamed from: c */
        public transient Object[] f35963c = new Object[4];

        /* renamed from: d */
        public transient Object[] f35964d = new Object[4];

        /* renamed from: e */
        public final Comparator<? super K> f35965e;

        public C15979b(Comparator<? super K> comparator) {
            super(4);
            comparator.getClass();
            this.f35965e = comparator;
        }

        /* renamed from: a */
        public final ImmutableMap mo56612a() {
            int i = this.f35915b;
            if (i == 0) {
                return ImmutableSortedMap.emptyMap(this.f35965e);
            }
            if (i == 1) {
                return ImmutableSortedMap.m25917d(this.f35963c[0], this.f35964d[0], this.f35965e);
            }
            Object[] copyOf = Arrays.copyOf(this.f35963c, i);
            Arrays.sort(copyOf, this.f35965e);
            Object[] objArr = new Object[this.f35915b];
            for (int i2 = 0; i2 < this.f35915b; i2++) {
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    if (this.f35965e.compare(copyOf[i3], copyOf[i2]) == 0) {
                        StringBuilder h = C0072d.m201h("keys required to be distinct but compared as equal: ");
                        h.append(copyOf[i3]);
                        h.append(" and ");
                        h.append(copyOf[i2]);
                        throw new IllegalArgumentException(h.toString());
                    }
                }
                objArr[Arrays.binarySearch(copyOf, this.f35963c[i2], this.f35965e)] = this.f35964d[i2];
            }
            return new ImmutableSortedMap(new RegularImmutableSortedSet(ImmutableList.asImmutableList(copyOf), this.f35965e), ImmutableList.asImmutableList(objArr));
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public final ImmutableMap.C15958b mo56613b(Object obj, Object obj2) {
            int i = this.f35915b + 1;
            Object[] objArr = this.f35963c;
            if (i > objArr.length) {
                int a = ImmutableCollection.C15950b.m25825a(objArr.length, i);
                this.f35963c = Arrays.copyOf(this.f35963c, a);
                this.f35964d = Arrays.copyOf(this.f35964d, a);
            }
            C16203o.m26214a(obj, obj2);
            Object[] objArr2 = this.f35963c;
            int i2 = this.f35915b;
            objArr2[i2] = obj;
            this.f35964d[i2] = obj2;
            this.f35915b = i2 + 1;
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public final void mo56614c(Map.Entry entry) {
            super.mo56614c(entry);
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public final ImmutableMap.C15958b mo56615d(Iterable iterable) {
            super.mo56615d(iterable);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: e */
        public final void mo56616e(ImmutableMap immutableMap) {
            super.mo56615d(immutableMap.entrySet());
        }
    }

    public ImmutableSortedMap(RegularImmutableSortedSet<K> regularImmutableSortedSet, ImmutableList<V> immutableList) {
        this(regularImmutableSortedSet, immutableList, (ImmutableSortedMap) null);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Map, java.util.Map<? extends K, ? extends V>] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> m25915a(java.util.Map<? extends K, ? extends V> r3, java.util.Comparator<? super K> r4) {
        /*
            boolean r0 = r3 instanceof java.util.SortedMap
            if (r0 == 0) goto L_0x0018
            r0 = r3
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            java.util.Comparator r0 = r0.comparator()
            if (r0 != 0) goto L_0x0013
            com.google.common.collect.Ordering r0 = f35957i
            if (r4 != r0) goto L_0x0018
            r0 = 1
            goto L_0x0019
        L_0x0013:
            boolean r0 = r4.equals(r0)
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            if (r0 == 0) goto L_0x0029
            boolean r1 = r3 instanceof com.google.common.collect.ImmutableSortedMap
            if (r1 == 0) goto L_0x0029
            r1 = r3
            com.google.common.collect.ImmutableSortedMap r1 = (com.google.common.collect.ImmutableSortedMap) r1
            boolean r2 = r1.isPartialView()
            if (r2 != 0) goto L_0x0029
            return r1
        L_0x0029:
            java.util.Set r3 = r3.entrySet()
            java.util.Map$Entry<?, ?>[] r1 = com.google.common.collect.ImmutableMap.EMPTY_ENTRY_ARRAY
            boolean r2 = r3 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0034
            goto L_0x003c
        L_0x0034:
            java.util.Iterator r3 = r3.iterator()
            java.util.ArrayList r3 = com.google.common.collect.Lists.m25993b(r3)
        L_0x003c:
            java.lang.Object[] r3 = r3.toArray(r1)
            java.util.Map$Entry[] r3 = (java.util.Map.Entry[]) r3
            java.util.Map$Entry[] r3 = (java.util.Map.Entry[]) r3
            int r1 = r3.length
            com.google.common.collect.ImmutableSortedMap r3 = m25916b(r4, r0, r3, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableSortedMap.m25915a(java.util.Map, java.util.Comparator):com.google.common.collect.ImmutableSortedMap");
    }

    /* renamed from: b */
    public static <K, V> ImmutableSortedMap<K, V> m25916b(Comparator<? super K> comparator, boolean z, Map.Entry<K, V>[] entryArr, int i) {
        if (i == 0) {
            return emptyMap(comparator);
        }
        if (i == 1) {
            return m25917d(entryArr[0].getKey(), entryArr[0].getValue(), comparator);
        }
        Object[] objArr = new Object[i];
        Object[] objArr2 = new Object[i];
        if (z) {
            for (int i2 = 0; i2 < i; i2++) {
                K key = entryArr[i2].getKey();
                V value = entryArr[i2].getValue();
                C16203o.m26214a(key, value);
                objArr[i2] = key;
                objArr2[i2] = value;
            }
        } else {
            Arrays.sort(entryArr, 0, i, new C15978a(comparator));
            K key2 = entryArr[0].getKey();
            objArr[0] = key2;
            V value2 = entryArr[0].getValue();
            objArr2[0] = value2;
            C16203o.m26214a(objArr[0], value2);
            int i3 = 1;
            while (i3 < i) {
                K key3 = entryArr[i3].getKey();
                V value3 = entryArr[i3].getValue();
                C16203o.m26214a(key3, value3);
                objArr[i3] = key3;
                objArr2[i3] = value3;
                ImmutableMap.checkNoConflict(comparator.compare(key2, key3) != 0, "key", entryArr[i3 - 1], entryArr[i3]);
                i3++;
                key2 = key3;
            }
        }
        return new ImmutableSortedMap<>(new RegularImmutableSortedSet(ImmutableList.asImmutableList(objArr), comparator), ImmutableList.asImmutableList(objArr2));
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        return m25915a(map, f35957i);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.SortedMap<K, ? extends V>, java.util.SortedMap] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOfSorted(java.util.SortedMap<K, ? extends V> r4) {
        /*
            java.util.Comparator r0 = r4.comparator()
            if (r0 != 0) goto L_0x0008
            com.google.common.collect.Ordering r0 = f35957i
        L_0x0008:
            boolean r1 = r4 instanceof com.google.common.collect.ImmutableSortedMap
            if (r1 == 0) goto L_0x0016
            r1 = r4
            com.google.common.collect.ImmutableSortedMap r1 = (com.google.common.collect.ImmutableSortedMap) r1
            boolean r2 = r1.isPartialView()
            if (r2 != 0) goto L_0x0016
            return r1
        L_0x0016:
            r1 = 1
            java.util.Set r4 = r4.entrySet()
            java.util.Map$Entry<?, ?>[] r2 = com.google.common.collect.ImmutableMap.EMPTY_ENTRY_ARRAY
            boolean r3 = r4 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0022
            goto L_0x002a
        L_0x0022:
            java.util.Iterator r4 = r4.iterator()
            java.util.ArrayList r4 = com.google.common.collect.Lists.m25993b(r4)
        L_0x002a:
            java.lang.Object[] r4 = r4.toArray(r2)
            java.util.Map$Entry[] r4 = (java.util.Map.Entry[]) r4
            java.util.Map$Entry[] r4 = (java.util.Map.Entry[]) r4
            int r2 = r4.length
            com.google.common.collect.ImmutableSortedMap r4 = m25916b(r0, r1, r4, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableSortedMap.copyOfSorted(java.util.SortedMap):com.google.common.collect.ImmutableSortedMap");
    }

    /* renamed from: d */
    public static ImmutableSortedMap m25917d(Object obj, Object obj2, Comparator comparator) {
        ImmutableList of = ImmutableList.m25827of(obj);
        comparator.getClass();
        return new ImmutableSortedMap(new RegularImmutableSortedSet(of, comparator), ImmutableList.m25827of(obj2));
    }

    public static <K, V> ImmutableSortedMap<K, V> emptyMap(Comparator<? super K> comparator) {
        return Ordering.natural().equals(comparator) ? m25918of() : new ImmutableSortedMap<>(ImmutableSortedSet.emptySet(comparator), ImmutableList.m25826of());
    }

    public static <K extends Comparable<?>, V> C15979b<K, V> naturalOrder() {
        return new C15979b<>(Ordering.natural());
    }

    /* renamed from: of */
    public static <K, V> ImmutableSortedMap<K, V> m25918of() {
        return f35958j;
    }

    public static <K, V> C15979b<K, V> orderedBy(Comparator<K> comparator) {
        return new C15979b<>(comparator);
    }

    public static <K extends Comparable<?>, V> C15979b<K, V> reverseOrder() {
        return new C15979b<>(Ordering.natural().reverse());
    }

    /* renamed from: c */
    public final ImmutableSortedMap<K, V> mo56791c(int i, int i2) {
        return (i == 0 && i2 == size()) ? this : i == i2 ? emptyMap(comparator()) : new ImmutableSortedMap<>(this.f35959f.getSubSet(i, i2), this.f35960g.subList(i, i2));
    }

    public Map.Entry<K, V> ceilingEntry(K k) {
        return tailMap(k, true).firstEntry();
    }

    public K ceilingKey(K k) {
        return Maps.m26056d(ceilingEntry(k));
    }

    public Comparator<? super K> comparator() {
        return keySet().comparator();
    }

    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return isEmpty() ? ImmutableSet.m25894of() : new ImmutableMapEntrySet<K, V>() {
            public ImmutableList<Map.Entry<K, V>> createAsList() {
                return new ImmutableList<Map.Entry<K, V>>() {
                    public boolean isPartialView() {
                        return true;
                    }

                    public int size() {
                        return ImmutableSortedMap.this.size();
                    }

                    public Map.Entry<K, V> get(int i) {
                        return new AbstractMap.SimpleImmutableEntry(ImmutableSortedMap.this.f35959f.asList().get(i), ImmutableSortedMap.this.f35960g.get(i));
                    }
                };
            }

            public ImmutableMap<K, V> map() {
                return ImmutableSortedMap.this;
            }

            public C16170f2<Map.Entry<K, V>> iterator() {
                return asList().iterator();
            }
        };
    }

    public ImmutableSet<K> createKeySet() {
        throw new AssertionError("should never be called");
    }

    public ImmutableCollection<V> createValues() {
        throw new AssertionError("should never be called");
    }

    public Map.Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().asList().get(0);
    }

    public K firstKey() {
        return keySet().first();
    }

    public Map.Entry<K, V> floorEntry(K k) {
        return headMap(k, true).lastEntry();
    }

    public K floorKey(K k) {
        return Maps.m26056d(floorEntry(k));
    }

    public V get(@NullableDecl Object obj) {
        int indexOf = this.f35959f.indexOf(obj);
        if (indexOf == -1) {
            return null;
        }
        return this.f35960g.get(indexOf);
    }

    public Map.Entry<K, V> higherEntry(K k) {
        return tailMap(k, false).firstEntry();
    }

    public K higherKey(K k) {
        return Maps.m26056d(higherEntry(k));
    }

    public boolean isPartialView() {
        return this.f35959f.isPartialView() || this.f35960g.isPartialView();
    }

    public Map.Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().asList().get(size() - 1);
    }

    public K lastKey() {
        return keySet().last();
    }

    public Map.Entry<K, V> lowerEntry(K k) {
        return headMap(k, false).lastEntry();
    }

    public K lowerKey(K k) {
        return Maps.m26056d(lowerEntry(k));
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final Map.Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final Map.Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.f35960g.size();
    }

    public Object writeReplace() {
        return new SerializedForm(this);
    }

    public ImmutableSortedMap(RegularImmutableSortedSet<K> regularImmutableSortedSet, ImmutableList<V> immutableList, ImmutableSortedMap<K, V> immutableSortedMap) {
        this.f35959f = regularImmutableSortedSet;
        this.f35960g = immutableList;
        this.f35961h = immutableSortedMap;
    }

    /* renamed from: of */
    public static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> m25919of(K k, V v) {
        return m25917d(k, v, Ordering.natural());
    }

    public ImmutableSortedSet<K> descendingKeySet() {
        return this.f35959f.descendingSet();
    }

    public ImmutableSortedMap<K, V> descendingMap() {
        ImmutableSortedMap<K, V> immutableSortedMap = this.f35961h;
        if (immutableSortedMap != null) {
            return immutableSortedMap;
        }
        if (isEmpty()) {
            return emptyMap(Ordering.from(comparator()).reverse());
        }
        return new ImmutableSortedMap<>((RegularImmutableSortedSet) this.f35959f.descendingSet(), this.f35960g.reverse(), this);
    }

    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    public ImmutableSortedSet<K> navigableKeySet() {
        return this.f35959f;
    }

    public ImmutableCollection<V> values() {
        return this.f35960g;
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return copyOf(iterable, f35957i);
    }

    /* renamed from: of */
    public static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> m25920of(K k, V v, K k2, V v2) {
        return m25916b(Ordering.natural(), false, new Map.Entry[]{ImmutableMap.entryOf(k, v), ImmutableMap.entryOf(k2, v2)}, 2);
    }

    public ImmutableSortedMap<K, V> headMap(K k) {
        return headMap(k, false);
    }

    public ImmutableSortedSet<K> keySet() {
        return this.f35959f;
    }

    public ImmutableSortedMap<K, V> subMap(K k, K k2) {
        return subMap(k, true, k2, false);
    }

    public ImmutableSortedMap<K, V> tailMap(K k) {
        return tailMap(k, true);
    }

    public ImmutableSortedMap<K, V> headMap(K k, boolean z) {
        RegularImmutableSortedSet<K> regularImmutableSortedSet = this.f35959f;
        k.getClass();
        return mo56791c(0, regularImmutableSortedSet.headIndex(k, z));
    }

    public ImmutableSortedMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
        k.getClass();
        k2.getClass();
        C15794l.m25611e(k, "expected fromKey <= toKey but %s > %s", k2, comparator().compare(k, k2) <= 0);
        return headMap(k2, z2).tailMap(k, z);
    }

    public ImmutableSortedMap<K, V> tailMap(K k, boolean z) {
        RegularImmutableSortedSet<K> regularImmutableSortedSet = this.f35959f;
        k.getClass();
        return mo56791c(regularImmutableSortedSet.tailIndex(k, z), size());
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Iterable<? extends java.util.Map$Entry<? extends K, ? extends V>>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r2, java.util.Comparator<? super K> r3) {
        /*
            r3.getClass()
            java.util.Map$Entry<?, ?>[] r0 = com.google.common.collect.ImmutableMap.EMPTY_ENTRY_ARRAY
            boolean r1 = r2 instanceof java.util.Collection
            if (r1 == 0) goto L_0x000c
            java.util.Collection r2 = (java.util.Collection) r2
            goto L_0x0014
        L_0x000c:
            java.util.Iterator r2 = r2.iterator()
            java.util.ArrayList r2 = com.google.common.collect.Lists.m25993b(r2)
        L_0x0014:
            java.lang.Object[] r2 = r2.toArray(r0)
            java.util.Map$Entry[] r2 = (java.util.Map.Entry[]) r2
            java.util.Map$Entry[] r2 = (java.util.Map.Entry[]) r2
            int r0 = r2.length
            r1 = 0
            com.google.common.collect.ImmutableSortedMap r2 = m25916b(r3, r1, r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableSortedMap.copyOf(java.lang.Iterable, java.util.Comparator):com.google.common.collect.ImmutableSortedMap");
    }

    /* renamed from: of */
    public static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> m25921of(K k, V v, K k2, V v2, K k3, V v3) {
        return m25916b(Ordering.natural(), false, new Map.Entry[]{ImmutableMap.entryOf(k, v), ImmutableMap.entryOf(k2, v2), ImmutableMap.entryOf(k3, v3)}, 3);
    }

    /* renamed from: of */
    public static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> m25922of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return m25916b(Ordering.natural(), false, new Map.Entry[]{ImmutableMap.entryOf(k, v), ImmutableMap.entryOf(k2, v2), ImmutableMap.entryOf(k3, v3), ImmutableMap.entryOf(k4, v4)}, 4);
    }

    /* renamed from: of */
    public static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> m25923of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return m25916b(Ordering.natural(), false, new Map.Entry[]{ImmutableMap.entryOf(k, v), ImmutableMap.entryOf(k2, v2), ImmutableMap.entryOf(k3, v3), ImmutableMap.entryOf(k4, v4), ImmutableMap.entryOf(k5, v5)}, 5);
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        comparator.getClass();
        return m25915a(map, comparator);
    }
}
