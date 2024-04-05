package com.google.common.collect;

import com.google.common.base.C15784e;
import com.google.common.base.C15794l;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.SortedLists;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public class ImmutableRangeMap<K extends Comparable<?>, V> implements C16202n1<K, V>, Serializable {

    /* renamed from: d */
    public static final ImmutableRangeMap<Comparable<?>, Object> f35935d = new ImmutableRangeMap<>(ImmutableList.m25826of(), ImmutableList.m25826of());
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    public final transient ImmutableList<Range<K>> f35936b;

    /* renamed from: c */
    public final transient ImmutableList<V> f35937c;

    public static class SerializedForm<K extends Comparable<?>, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final ImmutableMap<Range<K>, V> mapOfRanges;

        public SerializedForm(ImmutableMap<Range<K>, V> immutableMap) {
            this.mapOfRanges = immutableMap;
        }

        public Object createRangeMap() {
            ArrayList arrayList = new ArrayList();
            C16170f2<Map.Entry<Range<K>, V>> it = this.mapOfRanges.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                Range range = (Range) next.getKey();
                Object value = next.getValue();
                range.getClass();
                value.getClass();
                C15794l.m25612f(range, "Range must not be empty, but was %s", !range.isEmpty());
                arrayList.add(new ImmutableEntry(range, value));
            }
            Collections.sort(arrayList, Range.rangeLexOrdering().onKeys());
            int size = arrayList.size();
            C16203o.m26215b(size, "initialCapacity");
            Object[] objArr = new Object[size];
            int size2 = arrayList.size();
            C16203o.m26215b(size2, "initialCapacity");
            Object[] objArr2 = new Object[size2];
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < arrayList.size()) {
                Range range2 = (Range) ((Map.Entry) arrayList.get(i)).getKey();
                if (i > 0) {
                    Range range3 = (Range) ((Map.Entry) arrayList.get(i - 1)).getKey();
                    if (range2.isConnected(range3) && !range2.intersection(range3).isEmpty()) {
                        throw new IllegalArgumentException("Overlapping ranges: range " + range3 + " overlaps with entry " + range2);
                    }
                }
                range2.getClass();
                int i4 = i2 + 1;
                if (objArr.length < i4) {
                    objArr = Arrays.copyOf(objArr, ImmutableCollection.C15950b.m25825a(objArr.length, i4));
                }
                objArr[i2] = range2;
                Object value2 = ((Map.Entry) arrayList.get(i)).getValue();
                value2.getClass();
                int i5 = i3 + 1;
                if (objArr2.length < i5) {
                    objArr2 = Arrays.copyOf(objArr2, ImmutableCollection.C15950b.m25825a(objArr2.length, i5));
                }
                objArr2[i3] = value2;
                i++;
                i3 = i5;
                i2 = i4;
            }
            return new ImmutableRangeMap(ImmutableList.asImmutableList(objArr, i2), ImmutableList.asImmutableList(objArr2, i3));
        }

        public Object readResolve() {
            return this.mapOfRanges.isEmpty() ? ImmutableRangeMap.m25887of() : createRangeMap();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableRangeMap$a */
    public static final class C15969a<K extends Comparable<?>, V> {
        public C15969a() {
            new ArrayList();
        }
    }

    public ImmutableRangeMap(ImmutableList<Range<K>> immutableList, ImmutableList<V> immutableList2) {
        this.f35936b = immutableList;
        this.f35937c = immutableList2;
    }

    public static <K extends Comparable<?>, V> C15969a<K, V> builder() {
        return new C15969a<>();
    }

    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> copyOf(C16202n1<K, ? extends V> n1Var) {
        if (n1Var instanceof ImmutableRangeMap) {
            return (ImmutableRangeMap) n1Var;
        }
        Map<Range<K>, ? extends V> asMapOfRanges = n1Var.asMapOfRanges();
        int size = asMapOfRanges.size();
        C16203o.m26215b(size, "initialCapacity");
        Object[] objArr = new Object[size];
        int size2 = asMapOfRanges.size();
        C16203o.m26215b(size2, "initialCapacity");
        Object[] objArr2 = new Object[size2];
        int i = 0;
        int i2 = 0;
        for (Map.Entry next : asMapOfRanges.entrySet()) {
            Object key = next.getKey();
            key.getClass();
            int i3 = i + 1;
            if (objArr.length < i3) {
                objArr = Arrays.copyOf(objArr, ImmutableCollection.C15950b.m25825a(objArr.length, i3));
            }
            objArr[i] = key;
            Object value = next.getValue();
            value.getClass();
            int i4 = i2 + 1;
            if (objArr2.length < i4) {
                objArr2 = Arrays.copyOf(objArr2, ImmutableCollection.C15950b.m25825a(objArr2.length, i4));
            }
            objArr2[i2] = value;
            i2 = i4;
            i = i3;
        }
        return new ImmutableRangeMap<>(ImmutableList.asImmutableList(objArr, i), ImmutableList.asImmutableList(objArr2, i2));
    }

    /* renamed from: of */
    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> m25887of() {
        return f35935d;
    }

    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof C16202n1) {
            return asMapOfRanges().equals(((C16202n1) obj).asMapOfRanges());
        }
        return false;
    }

    @NullableDecl
    public V get(K k) {
        int a = SortedLists.m26097a(this.f35936b, Range.lowerBoundFn(), Cut.belowValue(k), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (a != -1 && this.f35936b.get(a).contains(k)) {
            return this.f35937c.get(a);
        }
        return null;
    }

    @NullableDecl
    public Map.Entry<Range<K>, V> getEntry(K k) {
        int a = SortedLists.m26097a(this.f35936b, Range.lowerBoundFn(), Cut.belowValue(k), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (a == -1) {
            return null;
        }
        Range range = this.f35936b.get(a);
        if (range.contains(k)) {
            return new ImmutableEntry(range, this.f35937c.get(a));
        }
        return null;
    }

    public int hashCode() {
        return asMapOfRanges().hashCode();
    }

    @Deprecated
    public void put(Range<K> range, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public void putAll(C16202n1<K, V> n1Var) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public void putCoalescing(Range<K> range, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public void remove(Range<K> range) {
        throw new UnsupportedOperationException();
    }

    public Range<K> span() {
        if (!this.f35936b.isEmpty()) {
            ImmutableList<Range<K>> immutableList = this.f35936b;
            return Range.create(this.f35936b.get(0).lowerBound, immutableList.get(immutableList.size() - 1).upperBound);
        }
        throw new NoSuchElementException();
    }

    public String toString() {
        return asMapOfRanges().toString();
    }

    public Object writeReplace() {
        return new SerializedForm(asMapOfRanges());
    }

    /* renamed from: of */
    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> m25888of(Range<K> range, V v) {
        return new ImmutableRangeMap<>(ImmutableList.m25827of(range), ImmutableList.m25827of(v));
    }

    public ImmutableMap<Range<K>, V> asDescendingMapOfRanges() {
        if (this.f35936b.isEmpty()) {
            return ImmutableMap.m25853of();
        }
        return new ImmutableSortedMap(new RegularImmutableSortedSet(this.f35936b.reverse(), Range.rangeLexOrdering().reverse()), this.f35937c.reverse());
    }

    public ImmutableMap<Range<K>, V> asMapOfRanges() {
        if (this.f35936b.isEmpty()) {
            return ImmutableMap.m25853of();
        }
        return new ImmutableSortedMap(new RegularImmutableSortedSet(this.f35936b, Range.rangeLexOrdering()), this.f35937c);
    }

    public ImmutableRangeMap<K, V> subRangeMap(final Range<K> range) {
        range.getClass();
        if (range.isEmpty()) {
            return m25887of();
        }
        if (this.f35936b.isEmpty() || range.encloses(span())) {
            return this;
        }
        ImmutableList<Range<K>> immutableList = this.f35936b;
        C15784e upperBoundFn = Range.upperBoundFn();
        Cut<C> cut = range.lowerBound;
        SortedLists.KeyPresentBehavior keyPresentBehavior = SortedLists.KeyPresentBehavior.FIRST_AFTER;
        SortedLists.KeyAbsentBehavior keyAbsentBehavior = SortedLists.KeyAbsentBehavior.NEXT_HIGHER;
        final int a = SortedLists.m26097a(immutableList, upperBoundFn, cut, keyPresentBehavior, keyAbsentBehavior);
        int a2 = SortedLists.m26097a(this.f35936b, Range.lowerBoundFn(), range.upperBound, SortedLists.KeyPresentBehavior.ANY_PRESENT, keyAbsentBehavior);
        if (a >= a2) {
            return m25887of();
        }
        final int i = a2 - a;
        final Range<K> range2 = range;
        return new ImmutableRangeMap<K, V>(new ImmutableList<Range<K>>() {
            public boolean isPartialView() {
                return true;
            }

            public int size() {
                return i;
            }

            public Range<K> get(int i) {
                C15794l.m25616j(i, i);
                if (i == 0 || i == i - 1) {
                    return ((Range) ImmutableRangeMap.this.f35936b.get(i + a)).intersection(range);
                }
                return (Range) ImmutableRangeMap.this.f35936b.get(i + a);
            }
        }, this.f35937c.subList(a, a2)) {
            public /* bridge */ /* synthetic */ Map asDescendingMapOfRanges() {
                return ImmutableRangeMap.super.asDescendingMapOfRanges();
            }

            public /* bridge */ /* synthetic */ Map asMapOfRanges() {
                return ImmutableRangeMap.super.asMapOfRanges();
            }

            public ImmutableRangeMap<K, V> subRangeMap(Range<K> range) {
                if (range2.isConnected(range)) {
                    return this.subRangeMap(range.intersection(range2));
                }
                return ImmutableRangeMap.m25887of();
            }
        };
    }
}
