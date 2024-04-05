package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

abstract class AbstractSortedKeySortedSetMultimap<K, V> extends AbstractSortedSetMultimap<K, V> {
    public AbstractSortedKeySortedSetMultimap(SortedMap<K, Collection<V>> sortedMap) {
        super(sortedMap);
    }

    public Set<K> createKeySet() {
        return createMaybeNavigableKeySet();
    }

    public abstract /* synthetic */ Comparator<? super V> valueComparator();

    public SortedMap<K, Collection<V>> asMap() {
        return (SortedMap) super.asMap();
    }

    public SortedMap<K, Collection<V>> backingMap() {
        return (SortedMap) super.backingMap();
    }

    public SortedSet<K> keySet() {
        return (SortedSet) super.keySet();
    }
}
