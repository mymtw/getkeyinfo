package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.s0 */
public interface C16219s0<K, V> extends C16154c1<K, V> {
    List<V> get(@NullableDecl K k);

    @CanIgnoreReturnValue
    List<V> removeAll(@NullableDecl Object obj);

    @CanIgnoreReturnValue
    List<V> replaceValues(K k, Iterable<? extends V> iterable);
}
