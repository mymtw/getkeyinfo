package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.m */
public interface C16196m<K, V> extends Map<K, V> {
    @NullableDecl
    @CanIgnoreReturnValue
    V forcePut(@NullableDecl K k, @NullableDecl V v);

    C16196m<V, K> inverse();

    Set<V> values();
}
