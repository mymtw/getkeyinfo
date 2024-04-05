package com.google.common.collect;

import android.support.p013v4.media.C0072d;
import com.google.common.base.C15784e;
import com.google.common.base.C15791j;
import com.google.common.collect.C16147b2;
import com.google.common.collect.Maps;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class Tables {

    /* renamed from: a */
    public static final C16117a f36183a = new C16117a();

    public static final class ImmutableCell<R, C, V> extends C16118b<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;
        @NullableDecl
        private final C columnKey;
        @NullableDecl
        private final R rowKey;
        @NullableDecl
        private final V value;

        public ImmutableCell(@NullableDecl R r, @NullableDecl C c, @NullableDecl V v) {
            this.rowKey = r;
            this.columnKey = c;
            this.value = v;
        }

        public C getColumnKey() {
            return this.columnKey;
        }

        public R getRowKey() {
            return this.rowKey;
        }

        public V getValue() {
            return this.value;
        }
    }

    public static final class UnmodifiableRowSortedMap<R, C, V> extends UnmodifiableTable<R, C, V> implements C16210p1<R, C, V> {
        private static final long serialVersionUID = 0;

        public UnmodifiableRowSortedMap(C16210p1<R, ? extends C, ? extends V> p1Var) {
            super(p1Var);
        }

        public SortedSet<R> rowKeySet() {
            return Collections.unmodifiableSortedSet(delegate().rowKeySet());
        }

        public SortedMap<R, Map<C, V>> rowMap() {
            return Collections.unmodifiableSortedMap(new Maps.C16048i(delegate().rowMap(), new C16142a1(Tables.f36183a)));
        }

        public C16210p1<R, C, V> delegate() {
            return (C16210p1) super.delegate();
        }
    }

    public static class UnmodifiableTable<R, C, V> extends C16177h0<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final C16147b2<? extends R, ? extends C, ? extends V> delegate;

        public UnmodifiableTable(C16147b2<? extends R, ? extends C, ? extends V> b2Var) {
            b2Var.getClass();
            this.delegate = b2Var;
        }

        public Set<C16147b2.C16148a<R, C, V>> cellSet() {
            return Collections.unmodifiableSet(super.cellSet());
        }

        public void clear() {
            throw new UnsupportedOperationException();
        }

        public Map<R, V> column(@NullableDecl C c) {
            return Collections.unmodifiableMap(super.column(c));
        }

        public Set<C> columnKeySet() {
            return Collections.unmodifiableSet(super.columnKeySet());
        }

        public Map<C, Map<R, V>> columnMap() {
            return Collections.unmodifiableMap(Maps.m26059g(super.columnMap(), Tables.f36183a));
        }

        public V put(@NullableDecl R r, @NullableDecl C c, @NullableDecl V v) {
            throw new UnsupportedOperationException();
        }

        public void putAll(C16147b2<? extends R, ? extends C, ? extends V> b2Var) {
            throw new UnsupportedOperationException();
        }

        public V remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
            throw new UnsupportedOperationException();
        }

        public Map<C, V> row(@NullableDecl R r) {
            return Collections.unmodifiableMap(super.row(r));
        }

        public Set<R> rowKeySet() {
            return Collections.unmodifiableSet(super.rowKeySet());
        }

        public Map<R, Map<C, V>> rowMap() {
            return Collections.unmodifiableMap(Maps.m26059g(super.rowMap(), Tables.f36183a));
        }

        public Collection<V> values() {
            return Collections.unmodifiableCollection(super.values());
        }

        public C16147b2<R, C, V> delegate() {
            return this.delegate;
        }
    }

    /* renamed from: com.google.common.collect.Tables$a */
    public static class C16117a implements C15784e<Map<Object, Object>, Map<Object, Object>> {
        public final Object apply(Object obj) {
            return Collections.unmodifiableMap((Map) obj);
        }
    }

    /* renamed from: com.google.common.collect.Tables$b */
    public static abstract class C16118b<R, C, V> implements C16147b2.C16148a<R, C, V> {
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C16147b2.C16148a)) {
                return false;
            }
            C16147b2.C16148a aVar = (C16147b2.C16148a) obj;
            return C15791j.m25606a(getRowKey(), aVar.getRowKey()) && C15791j.m25606a(getColumnKey(), aVar.getColumnKey()) && C15791j.m25606a(getValue(), aVar.getValue());
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{getRowKey(), getColumnKey(), getValue()});
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("(");
            h.append(getRowKey());
            h.append(",");
            h.append(getColumnKey());
            h.append(")=");
            h.append(getValue());
            return h.toString();
        }
    }
}
