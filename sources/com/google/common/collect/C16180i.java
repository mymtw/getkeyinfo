package com.google.common.collect;

import com.google.common.collect.C16147b2;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.i */
public abstract class C16180i<R, C, V> implements C16147b2<R, C, V> {
    @MonotonicNonNullDecl

    /* renamed from: b */
    public transient Set<C16147b2.C16148a<R, C, V>> f36271b;
    @MonotonicNonNullDecl

    /* renamed from: c */
    public transient Collection<V> f36272c;

    /* renamed from: com.google.common.collect.i$a */
    public class C16181a extends C16155c2<C16147b2.C16148a<R, C, V>, V> {
        public C16181a(Iterator it) {
            super(it);
        }

        /* renamed from: a */
        public final Object mo56891a(Object obj) {
            return ((C16147b2.C16148a) obj).getValue();
        }
    }

    /* renamed from: com.google.common.collect.i$b */
    public class C16182b extends AbstractSet<C16147b2.C16148a<R, C, V>> {
        public C16182b() {
        }

        public final void clear() {
            C16180i.this.clear();
        }

        public final boolean contains(Object obj) {
            boolean z;
            if (!(obj instanceof C16147b2.C16148a)) {
                return false;
            }
            C16147b2.C16148a aVar = (C16147b2.C16148a) obj;
            Map map = (Map) Maps.m26057e(aVar.getRowKey(), C16180i.this.rowMap());
            if (map == null) {
                return false;
            }
            Set entrySet = map.entrySet();
            ImmutableEntry immutableEntry = new ImmutableEntry(aVar.getColumnKey(), aVar.getValue());
            entrySet.getClass();
            try {
                z = entrySet.contains(immutableEntry);
            } catch (ClassCastException | NullPointerException unused) {
                z = false;
            }
            return z;
        }

        public final Iterator<C16147b2.C16148a<R, C, V>> iterator() {
            return C16180i.this.cellIterator();
        }

        public final boolean remove(@NullableDecl Object obj) {
            boolean z;
            if (!(obj instanceof C16147b2.C16148a)) {
                return false;
            }
            C16147b2.C16148a aVar = (C16147b2.C16148a) obj;
            Map map = (Map) Maps.m26057e(aVar.getRowKey(), C16180i.this.rowMap());
            if (map == null) {
                return false;
            }
            Set entrySet = map.entrySet();
            ImmutableEntry immutableEntry = new ImmutableEntry(aVar.getColumnKey(), aVar.getValue());
            entrySet.getClass();
            try {
                z = entrySet.remove(immutableEntry);
            } catch (ClassCastException | NullPointerException unused) {
                z = false;
            }
            return z;
        }

        public final int size() {
            return C16180i.this.size();
        }
    }

    /* renamed from: com.google.common.collect.i$c */
    public class C16183c extends AbstractCollection<V> {
        public C16183c() {
        }

        public final void clear() {
            C16180i.this.clear();
        }

        public final boolean contains(Object obj) {
            return C16180i.this.containsValue(obj);
        }

        public final Iterator<V> iterator() {
            return C16180i.this.valuesIterator();
        }

        public final int size() {
            return C16180i.this.size();
        }
    }

    public abstract Iterator<C16147b2.C16148a<R, C, V>> cellIterator();

    public Set<C16147b2.C16148a<R, C, V>> cellSet() {
        Set<C16147b2.C16148a<R, C, V>> set = this.f36271b;
        if (set != null) {
            return set;
        }
        Set<C16147b2.C16148a<R, C, V>> createCellSet = createCellSet();
        this.f36271b = createCellSet;
        return createCellSet;
    }

    public void clear() {
        Iterators.m25979b(cellSet().iterator());
    }

    public Set<C> columnKeySet() {
        return columnMap().keySet();
    }

    public boolean contains(@NullableDecl Object obj, @NullableDecl Object obj2) {
        boolean z;
        Map map = (Map) Maps.m26057e(obj, rowMap());
        if (map == null) {
            return false;
        }
        try {
            z = map.containsKey(obj2);
        } catch (ClassCastException | NullPointerException unused) {
            z = false;
        }
        return z;
    }

    public boolean containsColumn(@NullableDecl Object obj) {
        Map columnMap = columnMap();
        columnMap.getClass();
        try {
            return columnMap.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public boolean containsRow(@NullableDecl Object obj) {
        Map rowMap = rowMap();
        rowMap.getClass();
        try {
            return rowMap.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public boolean containsValue(@NullableDecl Object obj) {
        for (Map containsValue : rowMap().values()) {
            if (containsValue.containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    public Set<C16147b2.C16148a<R, C, V>> createCellSet() {
        return new C16182b();
    }

    public Collection<V> createValues() {
        return new C16183c();
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16147b2) {
            return cellSet().equals(((C16147b2) obj).cellSet());
        }
        return false;
    }

    public V get(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Map map = (Map) Maps.m26057e(obj, rowMap());
        if (map == null) {
            return null;
        }
        try {
            return map.get(obj2);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public int hashCode() {
        return cellSet().hashCode();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @CanIgnoreReturnValue
    public V put(R r, C c, V v) {
        return row(r).put(c, v);
    }

    public void putAll(C16147b2<? extends R, ? extends C, ? extends V> b2Var) {
        for (C16147b2.C16148a next : b2Var.cellSet()) {
            put(next.getRowKey(), next.getColumnKey(), next.getValue());
        }
    }

    @CanIgnoreReturnValue
    public V remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Map map = (Map) Maps.m26057e(obj, rowMap());
        if (map == null) {
            return null;
        }
        try {
            return map.remove(obj2);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public Set<R> rowKeySet() {
        return rowMap().keySet();
    }

    public String toString() {
        return rowMap().toString();
    }

    public Collection<V> values() {
        Collection<V> collection = this.f36272c;
        if (collection != null) {
            return collection;
        }
        Collection<V> createValues = createValues();
        this.f36272c = createValues;
        return createValues;
    }

    public Iterator<V> valuesIterator() {
        return new C16181a(cellSet().iterator());
    }
}
