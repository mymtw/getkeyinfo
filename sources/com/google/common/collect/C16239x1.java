package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Comparator;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.x1 */
public interface C16239x1<K, V> extends C16217r1<K, V> {
    SortedSet<V> get(@NullableDecl K k);

    @CanIgnoreReturnValue
    SortedSet<V> removeAll(@NullableDecl Object obj);

    @CanIgnoreReturnValue
    SortedSet<V> replaceValues(K k, Iterable<? extends V> iterable);

    Comparator<? super V> valueComparator();
}
