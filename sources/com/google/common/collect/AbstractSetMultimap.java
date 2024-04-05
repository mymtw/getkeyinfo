package com.google.common.collect;

import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

abstract class AbstractSetMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements C16217r1<K, V> {
    private static final long serialVersionUID = 7431625294878419160L;

    public AbstractSetMultimap(Map<K, Collection<V>> map) {
        super(map);
    }

    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    public abstract Set<V> createCollection();

    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @CanIgnoreReturnValue
    public boolean put(@NullableDecl K k, @NullableDecl V v) {
        return super.put(k, v);
    }

    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    public Collection<V> wrapCollection(K k, Collection<V> collection) {
        return new AbstractMapBasedMultimap.C15903n(k, (Set) collection);
    }

    public Set<V> createUnmodifiableEmptyCollection() {
        return Collections.emptySet();
    }

    public Set<Map.Entry<K, V>> entries() {
        return (Set) super.entries();
    }

    public Set<V> get(@NullableDecl K k) {
        return (Set) super.get(k);
    }

    @CanIgnoreReturnValue
    public Set<V> removeAll(@NullableDecl Object obj) {
        return (Set) super.removeAll(obj);
    }

    @CanIgnoreReturnValue
    public Set<V> replaceValues(@NullableDecl K k, Iterable<? extends V> iterable) {
        return (Set) super.replaceValues(k, iterable);
    }
}
