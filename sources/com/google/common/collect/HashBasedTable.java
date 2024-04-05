package com.google.common.collect;

import com.google.common.base.C15804s;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public class HashBasedTable<R, C, V> extends StandardTable<R, C, V> {
    private static final long serialVersionUID = 0;

    public static class Factory<C, V> implements C15804s<Map<C, V>>, Serializable {
        private static final long serialVersionUID = 0;
        public final int expectedSize;

        public Factory(int i) {
            this.expectedSize = i;
        }

        public Map<C, V> get() {
            return new LinkedHashMap(Maps.m26054b(this.expectedSize));
        }
    }

    public HashBasedTable(Map<R, Map<C, V>> map, Factory<C, V> factory) {
        super(map, factory);
    }

    public static <R, C, V> HashBasedTable<R, C, V> create() {
        return new HashBasedTable<>(new LinkedHashMap(), new Factory(0));
    }

    public /* bridge */ /* synthetic */ Set cellSet() {
        return super.cellSet();
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ Map column(Object obj) {
        return super.column(obj);
    }

    public /* bridge */ /* synthetic */ Set columnKeySet() {
        return super.columnKeySet();
    }

    public /* bridge */ /* synthetic */ Map columnMap() {
        return super.columnMap();
    }

    public boolean contains(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.contains(obj, obj2);
    }

    public boolean containsColumn(@NullableDecl Object obj) {
        return super.containsColumn(obj);
    }

    public boolean containsRow(@NullableDecl Object obj) {
        return super.containsRow(obj);
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return super.containsValue(obj);
    }

    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    public V get(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.get(obj, obj2);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2, Object obj3) {
        return super.put(obj, obj2, obj3);
    }

    public /* bridge */ /* synthetic */ void putAll(C16147b2 b2Var) {
        super.putAll(b2Var);
    }

    @CanIgnoreReturnValue
    public V remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.remove(obj, obj2);
    }

    public /* bridge */ /* synthetic */ Map row(Object obj) {
        return super.row(obj);
    }

    public /* bridge */ /* synthetic */ Set rowKeySet() {
        return super.rowKeySet();
    }

    public /* bridge */ /* synthetic */ Map rowMap() {
        return super.rowMap();
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public static <R, C, V> HashBasedTable<R, C, V> create(int i, int i2) {
        C16203o.m26215b(i2, "expectedCellsPerRow");
        return new HashBasedTable<>(new LinkedHashMap(Maps.m26054b(i)), new Factory(i2));
    }

    public static <R, C, V> HashBasedTable<R, C, V> create(C16147b2<? extends R, ? extends C, ? extends V> b2Var) {
        HashBasedTable<R, C, V> create = create();
        create.putAll(b2Var);
        return create;
    }
}
