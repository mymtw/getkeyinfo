package com.google.common.collect;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.e */
public abstract class C16162e<K, V> extends Maps.C16042d<K, V> implements NavigableMap<K, V> {

    /* renamed from: com.google.common.collect.e$a */
    public final class C16163a extends Maps.C16039a<K, V> {
        public C16163a() {
        }
    }

    /* renamed from: b */
    public abstract Iterator<Map.Entry<K, V>> mo57544b();

    @NullableDecl
    public final Map.Entry<K, V> ceilingEntry(K k) {
        return tailMap(k, true).firstEntry();
    }

    public final K ceilingKey(K k) {
        return Maps.m26056d(ceilingEntry(k));
    }

    public final NavigableSet<K> descendingKeySet() {
        return new C16163a().navigableKeySet();
    }

    public final NavigableMap<K, V> descendingMap() {
        return new C16163a();
    }

    @NullableDecl
    public final Map.Entry<K, V> firstEntry() {
        return (Map.Entry) Iterators.m25981d((String) null, mo56287a());
    }

    public final K firstKey() {
        Map.Entry firstEntry = firstEntry();
        if (firstEntry != null) {
            return firstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @NullableDecl
    public final Map.Entry<K, V> floorEntry(K k) {
        return headMap(k, true).lastEntry();
    }

    public final K floorKey(K k) {
        return Maps.m26056d(floorEntry(k));
    }

    public final SortedMap<K, V> headMap(K k) {
        return headMap(k, false);
    }

    @NullableDecl
    public final Map.Entry<K, V> higherEntry(K k) {
        return tailMap(k, false).firstEntry();
    }

    public final K higherKey(K k) {
        return Maps.m26056d(higherEntry(k));
    }

    public final Set<K> keySet() {
        return new Maps.C16045f(this);
    }

    @NullableDecl
    public final Map.Entry<K, V> lastEntry() {
        return (Map.Entry) Iterators.m25981d((String) null, mo57544b());
    }

    public final K lastKey() {
        Map.Entry lastEntry = lastEntry();
        if (lastEntry != null) {
            return lastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @NullableDecl
    public final Map.Entry<K, V> lowerEntry(K k) {
        return headMap(k, false).lastEntry();
    }

    public final K lowerKey(K k) {
        return Maps.m26056d(lowerEntry(k));
    }

    public final NavigableSet<K> navigableKeySet() {
        return new Maps.C16045f(this);
    }

    @NullableDecl
    public final Map.Entry<K, V> pollFirstEntry() {
        return (Map.Entry) Iterators.m25983f(mo56287a());
    }

    @NullableDecl
    public final Map.Entry<K, V> pollLastEntry() {
        return (Map.Entry) Iterators.m25983f(mo57544b());
    }

    public final SortedMap<K, V> subMap(K k, K k2) {
        return subMap(k, true, k2, false);
    }

    public final SortedMap<K, V> tailMap(K k) {
        return tailMap(k, true);
    }
}
