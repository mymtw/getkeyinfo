package com.google.common.collect;

import com.google.common.base.C15794l;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.f0 */
public abstract class C16168f0<K, V> extends C16240y<K, V> implements SortedMap<K, V> {
    public Comparator<? super K> comparator() {
        return delegate().comparator();
    }

    public abstract SortedMap<K, V> delegate();

    public K firstKey() {
        return delegate().firstKey();
    }

    public SortedMap<K, V> headMap(K k) {
        return delegate().headMap(k);
    }

    public K lastKey() {
        return delegate().lastKey();
    }

    public boolean standardContainsKey(@NullableDecl Object obj) {
        try {
            Object firstKey = tailMap(obj).firstKey();
            Comparator comparator = comparator();
            return (comparator == null ? ((Comparable) firstKey).compareTo(obj) : comparator.compare(firstKey, obj)) == 0;
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
        }
    }

    public SortedMap<K, V> standardSubMap(K k, K k2) {
        Comparator comparator = comparator();
        C15794l.m25614h((comparator == null ? ((Comparable) k).compareTo(k2) : comparator.compare(k, k2)) <= 0, "fromKey must be <= toKey");
        return tailMap(k).headMap(k2);
    }

    public SortedMap<K, V> subMap(K k, K k2) {
        return delegate().subMap(k, k2);
    }

    public SortedMap<K, V> tailMap(K k) {
        return delegate().tailMap(k);
    }
}
