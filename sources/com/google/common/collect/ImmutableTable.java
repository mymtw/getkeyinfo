package com.google.common.collect;

import com.google.common.base.C15788i;
import com.google.common.base.C15794l;
import com.google.common.collect.C16147b2;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Tables;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class ImmutableTable<R, C, V> extends C16180i<R, C, V> implements Serializable {

    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final int[] cellColumnIndices;
        private final int[] cellRowIndices;
        private final Object[] cellValues;
        private final Object[] columnKeys;
        private final Object[] rowKeys;

        public SerializedForm(Object[] objArr, Object[] objArr2, Object[] objArr3, int[] iArr, int[] iArr2) {
            this.rowKeys = objArr;
            this.columnKeys = objArr2;
            this.cellValues = objArr3;
            this.cellRowIndices = iArr;
            this.cellColumnIndices = iArr2;
        }

        public static SerializedForm create(ImmutableTable<?, ?, ?> immutableTable, int[] iArr, int[] iArr2) {
            return new SerializedForm(immutableTable.rowKeySet().toArray(), immutableTable.columnKeySet().toArray(), immutableTable.values().toArray(), iArr, iArr2);
        }

        public Object readResolve() {
            Object[] objArr = this.cellValues;
            if (objArr.length == 0) {
                return ImmutableTable.m25976of();
            }
            int i = 0;
            if (objArr.length == 1) {
                return ImmutableTable.m25977of(this.rowKeys[0], this.columnKeys[0], objArr[0]);
            }
            int length = objArr.length;
            C16203o.m26215b(length, "initialCapacity");
            Object[] objArr2 = new Object[length];
            int i2 = 0;
            while (true) {
                Object[] objArr3 = this.cellValues;
                if (i >= objArr3.length) {
                    return RegularImmutableTable.forOrderedComponents(ImmutableList.asImmutableList(objArr2, i2), ImmutableSet.copyOf((E[]) this.rowKeys), ImmutableSet.copyOf((E[]) this.columnKeys));
                }
                C16147b2.C16148a cellOf = ImmutableTable.cellOf(this.rowKeys[this.cellRowIndices[i]], this.columnKeys[this.cellColumnIndices[i]], objArr3[i]);
                cellOf.getClass();
                int i3 = i2 + 1;
                if (objArr2.length < i3) {
                    objArr2 = Arrays.copyOf(objArr2, ImmutableCollection.C15950b.m25825a(objArr2.length, i3));
                }
                objArr2[i2] = cellOf;
                i++;
                i2 = i3;
            }
        }
    }

    /* renamed from: com.google.common.collect.ImmutableTable$a */
    public static final class C15982a<R, C, V> {

        /* renamed from: a */
        public final ArrayList f35972a = new ArrayList();
    }

    public static <R, C, V> C15982a<R, C, V> builder() {
        return new C15982a<>();
    }

    public static <R, C, V> C16147b2.C16148a<R, C, V> cellOf(R r, C c, V v) {
        if (r == null) {
            throw new NullPointerException("rowKey");
        } else if (c == null) {
            throw new NullPointerException("columnKey");
        } else if (v != null) {
            return new Tables.ImmutableCell(r, c, v);
        } else {
            throw new NullPointerException("value");
        }
    }

    public static <R, C, V> ImmutableTable<R, C, V> copyOf(C16147b2<? extends R, ? extends C, ? extends V> b2Var) {
        if (b2Var instanceof ImmutableTable) {
            return (ImmutableTable) b2Var;
        }
        Set<C16147b2.C16148a<? extends R, ? extends C, ? extends V>> cellSet = b2Var.cellSet();
        C15982a builder = builder();
        for (C16147b2.C16148a aVar : cellSet) {
            builder.getClass();
            if (aVar instanceof Tables.ImmutableCell) {
                C15794l.m25617k(aVar.getRowKey(), "row");
                C15794l.m25617k(aVar.getColumnKey(), "column");
                C15794l.m25617k(aVar.getValue(), "value");
                builder.f35972a.add(aVar);
            } else {
                builder.f35972a.add(cellOf(aVar.getRowKey(), aVar.getColumnKey(), aVar.getValue()));
            }
        }
        int size = builder.f35972a.size();
        return size != 0 ? size != 1 ? RegularImmutableTable.forCells(builder.f35972a, (Comparator) null, (Comparator) null) : new SingletonImmutableTable((C16147b2.C16148a) C16201n0.m26212c(builder.f35972a)) : m25976of();
    }

    /* renamed from: of */
    public static <R, C, V> ImmutableTable<R, C, V> m25976of() {
        return SparseImmutableTable.EMPTY;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract ImmutableMap<C, Map<R, V>> columnMap();

    public boolean contains(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return get(obj, obj2) != null;
    }

    public /* bridge */ /* synthetic */ boolean containsColumn(@NullableDecl Object obj) {
        return super.containsColumn(obj);
    }

    public /* bridge */ /* synthetic */ boolean containsRow(@NullableDecl Object obj) {
        return super.containsRow(obj);
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    public abstract ImmutableSet<C16147b2.C16148a<R, C, V>> createCellSet();

    public abstract SerializedForm createSerializedForm();

    public abstract ImmutableCollection<V> createValues();

    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ Object get(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.get(obj, obj2);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final V put(R r, C c, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(C16147b2<? extends R, ? extends C, ? extends V> b2Var) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final V remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public abstract ImmutableMap<R, Map<C, V>> rowMap();

    public abstract /* synthetic */ int size();

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public final Iterator<V> valuesIterator() {
        throw new AssertionError("should never be called");
    }

    public final Object writeReplace() {
        return createSerializedForm();
    }

    /* renamed from: of */
    public static <R, C, V> ImmutableTable<R, C, V> m25977of(R r, C c, V v) {
        return new SingletonImmutableTable(r, c, v);
    }

    public final C16170f2<C16147b2.C16148a<R, C, V>> cellIterator() {
        throw new AssertionError("should never be called");
    }

    public ImmutableSet<C16147b2.C16148a<R, C, V>> cellSet() {
        return (ImmutableSet) super.cellSet();
    }

    public ImmutableMap<R, V> column(C c) {
        if (c != null) {
            return (ImmutableMap) C15788i.m25602a((ImmutableMap) columnMap().get(c), ImmutableMap.m25853of());
        }
        throw new NullPointerException("columnKey");
    }

    public ImmutableSet<C> columnKeySet() {
        return columnMap().keySet();
    }

    public ImmutableMap<C, V> row(R r) {
        if (r != null) {
            return (ImmutableMap) C15788i.m25602a((ImmutableMap) rowMap().get(r), ImmutableMap.m25853of());
        }
        throw new NullPointerException("rowKey");
    }

    public ImmutableSet<R> rowKeySet() {
        return rowMap().keySet();
    }

    public ImmutableCollection<V> values() {
        return (ImmutableCollection) super.values();
    }
}
