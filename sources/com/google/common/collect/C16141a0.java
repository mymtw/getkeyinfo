package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.a0 */
public abstract class C16141a0<K, V> extends C16153c0 implements C16154c1<K, V> {
    public Map<K, Collection<V>> asMap() {
        return delegate().asMap();
    }

    public void clear() {
        delegate().clear();
    }

    public boolean containsEntry(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return delegate().containsEntry(obj, obj2);
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return delegate().containsKey(obj);
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return delegate().containsValue(obj);
    }

    public abstract C16154c1<K, V> delegate();

    public Collection<Map.Entry<K, V>> entries() {
        return delegate().entries();
    }

    public boolean equals(@NullableDecl Object obj) {
        return obj == this || delegate().equals(obj);
    }

    public Collection<V> get(@NullableDecl K k) {
        return delegate().get(k);
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

    public C16178h1<K> keys() {
        return delegate().keys();
    }

    @CanIgnoreReturnValue
    public boolean put(K k, V v) {
        return delegate().put(k, v);
    }

    @CanIgnoreReturnValue
    public boolean putAll(K k, Iterable<? extends V> iterable) {
        return delegate().putAll(k, iterable);
    }

    @CanIgnoreReturnValue
    public boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return delegate().remove(obj, obj2);
    }

    @CanIgnoreReturnValue
    public Collection<V> removeAll(@NullableDecl Object obj) {
        return delegate().removeAll(obj);
    }

    @CanIgnoreReturnValue
    public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return delegate().replaceValues(k, iterable);
    }

    public int size() {
        return delegate().size();
    }

    public Collection<V> values() {
        return delegate().values();
    }

    @CanIgnoreReturnValue
    public boolean putAll(C16154c1<? extends K, ? extends V> c1Var) {
        return delegate().putAll(c1Var);
    }
}
