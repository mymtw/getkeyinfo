package com.google.common.collect;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

class ImmutableEntry<K, V> extends C16144b<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    @NullableDecl
    public final K key;
    @NullableDecl
    public final V value;

    public ImmutableEntry(@NullableDecl K k, @NullableDecl V v) {
        this.key = k;
        this.value = v;
    }

    @NullableDecl
    public final K getKey() {
        return this.key;
    }

    @NullableDecl
    public final V getValue() {
        return this.value;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
