package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.r1 */
public interface C16217r1<K, V> extends C16154c1<K, V> {
    Set<Map.Entry<K, V>> entries();

    Set<V> get(@NullableDecl K k);

    @CanIgnoreReturnValue
    Set<V> removeAll(@NullableDecl Object obj);

    @CanIgnoreReturnValue
    Set<V> replaceValues(K k, Iterable<? extends V> iterable);
}
