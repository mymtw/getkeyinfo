package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.c1 */
public interface C16154c1<K, V> {
    Map<K, Collection<V>> asMap();

    void clear();

    boolean containsEntry(@NullableDecl @CompatibleWith("K") Object obj, @NullableDecl @CompatibleWith("V") Object obj2);

    boolean containsKey(@NullableDecl @CompatibleWith("K") Object obj);

    boolean containsValue(@NullableDecl @CompatibleWith("V") Object obj);

    Collection<Map.Entry<K, V>> entries();

    boolean equals(@NullableDecl Object obj);

    Collection<V> get(@NullableDecl K k);

    int hashCode();

    boolean isEmpty();

    Set<K> keySet();

    C16178h1<K> keys();

    @CanIgnoreReturnValue
    boolean put(@NullableDecl K k, @NullableDecl V v);

    @CanIgnoreReturnValue
    boolean putAll(C16154c1<? extends K, ? extends V> c1Var);

    @CanIgnoreReturnValue
    boolean putAll(@NullableDecl K k, Iterable<? extends V> iterable);

    @CanIgnoreReturnValue
    boolean remove(@NullableDecl @CompatibleWith("K") Object obj, @NullableDecl @CompatibleWith("V") Object obj2);

    @CanIgnoreReturnValue
    Collection<V> removeAll(@NullableDecl @CompatibleWith("K") Object obj);

    @CanIgnoreReturnValue
    Collection<V> replaceValues(@NullableDecl K k, Iterable<? extends V> iterable);

    int size();

    Collection<V> values();
}
