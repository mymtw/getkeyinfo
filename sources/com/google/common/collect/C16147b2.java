package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.b2 */
public interface C16147b2<R, C, V> {

    /* renamed from: com.google.common.collect.b2$a */
    public interface C16148a<R, C, V> {
        @NullableDecl
        C getColumnKey();

        @NullableDecl
        R getRowKey();

        @NullableDecl
        V getValue();
    }

    Set<C16148a<R, C, V>> cellSet();

    void clear();

    Map<R, V> column(C c);

    Set<C> columnKeySet();

    Map<C, Map<R, V>> columnMap();

    boolean contains(@NullableDecl @CompatibleWith("R") Object obj, @NullableDecl @CompatibleWith("C") Object obj2);

    boolean containsColumn(@NullableDecl @CompatibleWith("C") Object obj);

    boolean containsRow(@NullableDecl @CompatibleWith("R") Object obj);

    boolean containsValue(@NullableDecl @CompatibleWith("V") Object obj);

    boolean equals(@NullableDecl Object obj);

    V get(@NullableDecl @CompatibleWith("R") Object obj, @NullableDecl @CompatibleWith("C") Object obj2);

    int hashCode();

    boolean isEmpty();

    @NullableDecl
    @CanIgnoreReturnValue
    V put(R r, C c, V v);

    void putAll(C16147b2<? extends R, ? extends C, ? extends V> b2Var);

    @NullableDecl
    @CanIgnoreReturnValue
    V remove(@NullableDecl @CompatibleWith("R") Object obj, @NullableDecl @CompatibleWith("C") Object obj2);

    Map<C, V> row(R r);

    Set<R> rowKeySet();

    Map<R, Map<C, V>> rowMap();

    int size();

    Collection<V> values();
}
