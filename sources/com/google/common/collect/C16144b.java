package com.google.common.collect;

import com.google.common.base.C15791j;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.b */
public abstract class C16144b<K, V> implements Map.Entry<K, V> {
    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return C15791j.m25606a(getKey(), entry.getKey()) && C15791j.m25606a(getValue(), entry.getValue());
    }

    public abstract K getKey();

    public abstract V getValue();

    public int hashCode() {
        Object key = getKey();
        Object value = getValue();
        int i = 0;
        int hashCode = key == null ? 0 : key.hashCode();
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    public V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return getKey() + "=" + getValue();
    }
}
