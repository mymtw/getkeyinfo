package com.google.common.collect;

import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

abstract class AbstractSortedSetMultimap<K, V> extends AbstractSetMultimap<K, V> implements C16239x1<K, V> {
    private static final long serialVersionUID = 430848587173315748L;

    public AbstractSortedSetMultimap(Map<K, Collection<V>> map) {
        super(map);
    }

    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    public abstract SortedSet<V> createCollection();

    public abstract /* synthetic */ Comparator<? super V> valueComparator();

    public Collection<V> values() {
        return super.values();
    }

    public Collection<V> wrapCollection(K k, Collection<V> collection) {
        return collection instanceof NavigableSet ? new AbstractMapBasedMultimap.C15902m(k, (NavigableSet) collection, (AbstractMapBasedMultimap<K, V>.k) null) : new AbstractMapBasedMultimap.C15904o(k, (SortedSet) collection, (AbstractMapBasedMultimap<K, V>.k) null);
    }

    public <E> SortedSet<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        if (collection instanceof NavigableSet) {
            return Sets.m26096f((NavigableSet) collection);
        }
        return Collections.unmodifiableSortedSet((SortedSet) collection);
    }

    public SortedSet<V> createUnmodifiableEmptyCollection() {
        return unmodifiableCollectionSubclass((Collection) createCollection());
    }

    public SortedSet<V> get(@NullableDecl K k) {
        return (SortedSet) super.get((Object) k);
    }

    @CanIgnoreReturnValue
    public SortedSet<V> removeAll(@NullableDecl Object obj) {
        return (SortedSet) super.removeAll(obj);
    }

    @CanIgnoreReturnValue
    public SortedSet<V> replaceValues(@NullableDecl K k, Iterable<? extends V> iterable) {
        return (SortedSet) super.replaceValues((Object) k, (Iterable) iterable);
    }
}
