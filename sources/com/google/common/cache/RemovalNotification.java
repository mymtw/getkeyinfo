package com.google.common.cache;

import java.util.AbstractMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class RemovalNotification<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {
    private static final long serialVersionUID = 0;
    private final RemovalCause cause;

    public RemovalNotification(@NullableDecl K k, @NullableDecl V v, RemovalCause removalCause) {
        super(k, v);
        removalCause.getClass();
        this.cause = removalCause;
    }

    public static <K, V> RemovalNotification<K, V> create(@NullableDecl K k, @NullableDecl V v, RemovalCause removalCause) {
        return new RemovalNotification<>(k, v, removalCause);
    }

    public RemovalCause getCause() {
        return this.cause;
    }

    public boolean wasEvicted() {
        return this.cause.wasEvicted();
    }
}
