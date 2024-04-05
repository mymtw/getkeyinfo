package com.google.common.collect;

import com.google.common.base.C15791j;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.y */
public abstract class C16240y<K, V> extends C16153c0 implements Map<K, V> {
    public void clear() {
        delegate().clear();
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return delegate().containsKey(obj);
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return delegate().containsValue(obj);
    }

    public abstract Map<K, V> delegate();

    public Set<Map.Entry<K, V>> entrySet() {
        return delegate().entrySet();
    }

    public boolean equals(@NullableDecl Object obj) {
        return obj == this || delegate().equals(obj);
    }

    public V get(@NullableDecl Object obj) {
        return delegate().get(obj);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Set<K> keySet() {
        return delegate().keySet();
    }

    @CanIgnoreReturnValue
    public V put(K k, V v) {
        return delegate().put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    @CanIgnoreReturnValue
    public V remove(Object obj) {
        return delegate().remove(obj);
    }

    public int size() {
        return delegate().size();
    }

    public void standardClear() {
        Iterators.m25979b(entrySet().iterator());
    }

    public boolean standardContainsKey(@NullableDecl Object obj) {
        return Iterators.m25980c(obj, new C16230v0(entrySet().iterator()));
    }

    public boolean standardContainsValue(@NullableDecl Object obj) {
        return Iterators.m25980c(obj, new C16233w0(entrySet().iterator()));
    }

    public boolean standardEquals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public int standardHashCode() {
        return Sets.m26092b(entrySet());
    }

    public boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    public void standardPutAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public V standardRemove(@NullableDecl Object obj) {
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (C15791j.m25606a(entry.getKey(), obj)) {
                V value = entry.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    public String standardToString() {
        return Maps.m26058f(this);
    }

    public Collection<V> values() {
        return delegate().values();
    }
}
