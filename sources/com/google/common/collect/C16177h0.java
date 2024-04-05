package com.google.common.collect;

import com.google.common.collect.C16147b2;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.collect.h0 */
public abstract class C16177h0<R, C, V> extends C16153c0 implements C16147b2<R, C, V> {
    public Set<C16147b2.C16148a<R, C, V>> cellSet() {
        return delegate().cellSet();
    }

    public void clear() {
        delegate().clear();
    }

    public Map<R, V> column(C c) {
        return delegate().column(c);
    }

    public Set<C> columnKeySet() {
        return delegate().columnKeySet();
    }

    public Map<C, Map<R, V>> columnMap() {
        return delegate().columnMap();
    }

    public boolean contains(Object obj, Object obj2) {
        return delegate().contains(obj, obj2);
    }

    public boolean containsColumn(Object obj) {
        return delegate().containsColumn(obj);
    }

    public boolean containsRow(Object obj) {
        return delegate().containsRow(obj);
    }

    public boolean containsValue(Object obj) {
        return delegate().containsValue(obj);
    }

    public abstract C16147b2<R, C, V> delegate();

    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    public V get(Object obj, Object obj2) {
        return delegate().get(obj, obj2);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    @CanIgnoreReturnValue
    public V put(R r, C c, V v) {
        return delegate().put(r, c, v);
    }

    public void putAll(C16147b2<? extends R, ? extends C, ? extends V> b2Var) {
        delegate().putAll(b2Var);
    }

    @CanIgnoreReturnValue
    public V remove(Object obj, Object obj2) {
        return delegate().remove(obj, obj2);
    }

    public Map<C, V> row(R r) {
        return delegate().row(r);
    }

    public Set<R> rowKeySet() {
        return delegate().rowKeySet();
    }

    public Map<R, Map<C, V>> rowMap() {
        return delegate().rowMap();
    }

    public int size() {
        return delegate().size();
    }

    public Collection<V> values() {
        return delegate().values();
    }
}
