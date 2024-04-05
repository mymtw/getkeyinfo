package com.google.common.collect;

import com.google.common.base.C15803r;
import com.google.common.collect.C16147b2;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

abstract class RegularImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {

    public final class CellSet extends IndexedImmutableSet<C16147b2.C16148a<R, C, V>> {
        public CellSet(C16081a aVar) {
        }

        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof C16147b2.C16148a)) {
                return false;
            }
            C16147b2.C16148a aVar = (C16147b2.C16148a) obj;
            Object obj2 = RegularImmutableTable.this.get(aVar.getRowKey(), aVar.getColumnKey());
            return obj2 != null && obj2.equals(aVar.getValue());
        }

        public boolean isPartialView() {
            return false;
        }

        public int size() {
            return RegularImmutableTable.this.size();
        }

        public C16147b2.C16148a<R, C, V> get(int i) {
            return RegularImmutableTable.this.getCell(i);
        }
    }

    public final class Values extends ImmutableList<V> {
        public Values(C16081a aVar) {
        }

        public V get(int i) {
            return RegularImmutableTable.this.getValue(i);
        }

        public boolean isPartialView() {
            return true;
        }

        public int size() {
            return RegularImmutableTable.this.size();
        }
    }

    /* renamed from: com.google.common.collect.RegularImmutableTable$a */
    public static class C16081a implements Comparator<C16147b2.C16148a<R, C, V>> {

        /* renamed from: b */
        public final /* synthetic */ Comparator f36142b;

        /* renamed from: c */
        public final /* synthetic */ Comparator f36143c;

        public C16081a(Comparator comparator, Comparator comparator2) {
            this.f36142b = comparator;
            this.f36143c = comparator2;
        }

        public final int compare(Object obj, Object obj2) {
            C16147b2.C16148a aVar = (C16147b2.C16148a) obj;
            C16147b2.C16148a aVar2 = (C16147b2.C16148a) obj2;
            Comparator comparator = this.f36142b;
            int i = 0;
            int compare = comparator == null ? 0 : comparator.compare(aVar.getRowKey(), aVar2.getRowKey());
            if (compare != 0) {
                return compare;
            }
            Comparator comparator2 = this.f36143c;
            if (comparator2 != null) {
                i = comparator2.compare(aVar.getColumnKey(), aVar2.getColumnKey());
            }
            return i;
        }
    }

    /* renamed from: a */
    public static <R, C, V> RegularImmutableTable<R, C, V> m26090a(Iterable<C16147b2.C16148a<R, C, V>> iterable, @NullableDecl Comparator<? super R> comparator, @NullableDecl Comparator<? super C> comparator2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ImmutableList<E> copyOf = ImmutableList.copyOf(iterable);
        for (C16147b2.C16148a next : iterable) {
            linkedHashSet.add(next.getRowKey());
            linkedHashSet2.add(next.getColumnKey());
        }
        return forOrderedComponents(copyOf, comparator == null ? ImmutableSet.copyOf(linkedHashSet) : ImmutableSet.copyOf(ImmutableList.sortedCopyOf(comparator, linkedHashSet)), comparator2 == null ? ImmutableSet.copyOf(linkedHashSet2) : ImmutableSet.copyOf(ImmutableList.sortedCopyOf(comparator2, linkedHashSet2)));
    }

    public static <R, C, V> RegularImmutableTable<R, C, V> forCells(Iterable<C16147b2.C16148a<R, C, V>> iterable) {
        return m26090a(iterable, (Comparator) null, (Comparator) null);
    }

    public static <R, C, V> RegularImmutableTable<R, C, V> forOrderedComponents(ImmutableList<C16147b2.C16148a<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        return ((long) immutableList.size()) > (((long) immutableSet.size()) * ((long) immutableSet2.size())) / 2 ? new DenseImmutableTable(immutableList, immutableSet, immutableSet2) : new SparseImmutableTable(immutableList, immutableSet, immutableSet2);
    }

    public final void checkNoDuplicate(R r, C c, V v, V v2) {
        if (!(v == null)) {
            throw new IllegalArgumentException(C15803r.m25628a("Duplicate key: (row=%s, column=%s), values: [%s, %s].", r, c, v2, v));
        }
    }

    public abstract C16147b2.C16148a<R, C, V> getCell(int i);

    public abstract V getValue(int i);

    public abstract /* synthetic */ int size();

    public static <R, C, V> RegularImmutableTable<R, C, V> forCells(List<C16147b2.C16148a<R, C, V>> list, @NullableDecl Comparator<? super R> comparator, @NullableDecl Comparator<? super C> comparator2) {
        list.getClass();
        if (!(comparator == null && comparator2 == null)) {
            Collections.sort(list, new C16081a(comparator, comparator2));
        }
        return m26090a(list, comparator, comparator2);
    }

    public final ImmutableSet<C16147b2.C16148a<R, C, V>> createCellSet() {
        return isEmpty() ? ImmutableSet.m25894of() : new CellSet((C16081a) null);
    }

    public final ImmutableCollection<V> createValues() {
        return isEmpty() ? ImmutableList.m25826of() : new Values((C16081a) null);
    }
}
