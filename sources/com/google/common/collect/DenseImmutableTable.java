package com.google.common.collect;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.C16147b2;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;
import com.google.errorprone.annotations.Immutable;
import java.lang.reflect.Array;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable(containerOf = {"R", "C", "V"})
final class DenseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {
    private final int[] cellColumnIndices;
    private final int[] cellRowIndices;
    /* access modifiers changed from: private */
    public final int[] columnCounts;
    /* access modifiers changed from: private */
    public final ImmutableMap<C, Integer> columnKeyToIndex;
    private final ImmutableMap<C, ImmutableMap<R, V>> columnMap;
    /* access modifiers changed from: private */
    public final int[] rowCounts;
    /* access modifiers changed from: private */
    public final ImmutableMap<R, Integer> rowKeyToIndex;
    private final ImmutableMap<R, ImmutableMap<C, V>> rowMap;
    /* access modifiers changed from: private */
    public final V[][] values;

    public final class Column extends ImmutableArrayMap<R, V> {
        private final int columnIndex;

        public Column(int i) {
            super(DenseImmutableTable.this.columnCounts[i]);
            this.columnIndex = i;
        }

        public V getValue(int i) {
            return DenseImmutableTable.this.values[i][this.columnIndex];
        }

        public boolean isPartialView() {
            return true;
        }

        public ImmutableMap<R, Integer> keyToIndex() {
            return DenseImmutableTable.this.rowKeyToIndex;
        }
    }

    public final class ColumnMap extends ImmutableArrayMap<C, ImmutableMap<R, V>> {
        public ColumnMap(C15932a aVar) {
            super(DenseImmutableTable.this.columnCounts.length);
        }

        public boolean isPartialView() {
            return false;
        }

        public ImmutableMap<C, Integer> keyToIndex() {
            return DenseImmutableTable.this.columnKeyToIndex;
        }

        public ImmutableMap<R, V> getValue(int i) {
            return new Column(i);
        }
    }

    public static abstract class ImmutableArrayMap<K, V> extends ImmutableMap.IteratorBasedImmutableMap<K, V> {
        private final int size;

        /* renamed from: com.google.common.collect.DenseImmutableTable$ImmutableArrayMap$a */
        public class C15931a extends AbstractIterator<Map.Entry<K, V>> {

            /* renamed from: d */
            public int f35845d = -1;

            /* renamed from: e */
            public final int f35846e;

            public C15931a() {
                this.f35846e = ImmutableArrayMap.this.keyToIndex().size();
            }

            /* renamed from: a */
            public final Object mo56053a() {
                Object value;
                do {
                    int i = this.f35845d + 1;
                    this.f35845d = i;
                    if (i < this.f35846e) {
                        value = ImmutableArrayMap.this.getValue(i);
                    } else {
                        this.f35745b = AbstractIterator.State.DONE;
                        return null;
                    }
                } while (value == null);
                return new ImmutableEntry(ImmutableArrayMap.this.getKey(this.f35845d), value);
            }
        }

        public ImmutableArrayMap(int i) {
            this.size = i;
        }

        public ImmutableSet<K> createKeySet() {
            return this.size == keyToIndex().size() ? keyToIndex().keySet() : super.createKeySet();
        }

        public C16170f2<Map.Entry<K, V>> entryIterator() {
            return new C15931a();
        }

        public V get(@NullableDecl Object obj) {
            Integer num = (Integer) keyToIndex().get(obj);
            if (num == null) {
                return null;
            }
            return getValue(num.intValue());
        }

        public K getKey(int i) {
            return keyToIndex().keySet().asList().get(i);
        }

        @NullableDecl
        public abstract V getValue(int i);

        public abstract ImmutableMap<K, Integer> keyToIndex();

        public int size() {
            return this.size;
        }
    }

    public final class Row extends ImmutableArrayMap<C, V> {
        private final int rowIndex;

        public Row(int i) {
            super(DenseImmutableTable.this.rowCounts[i]);
            this.rowIndex = i;
        }

        public V getValue(int i) {
            return DenseImmutableTable.this.values[this.rowIndex][i];
        }

        public boolean isPartialView() {
            return true;
        }

        public ImmutableMap<C, Integer> keyToIndex() {
            return DenseImmutableTable.this.columnKeyToIndex;
        }
    }

    public final class RowMap extends ImmutableArrayMap<R, ImmutableMap<C, V>> {
        public RowMap(C15932a aVar) {
            super(DenseImmutableTable.this.rowCounts.length);
        }

        public boolean isPartialView() {
            return false;
        }

        public ImmutableMap<R, Integer> keyToIndex() {
            return DenseImmutableTable.this.rowKeyToIndex;
        }

        public ImmutableMap<C, V> getValue(int i) {
            return new Row(i);
        }
    }

    public DenseImmutableTable(ImmutableList<C16147b2.C16148a<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        int size = immutableSet.size();
        int[] iArr = new int[2];
        iArr[1] = immutableSet2.size();
        iArr[0] = size;
        this.values = (Object[][]) Array.newInstance(Object.class, iArr);
        ImmutableMap<R, Integer> c = Maps.m26055c(immutableSet);
        this.rowKeyToIndex = c;
        ImmutableMap<C, Integer> c2 = Maps.m26055c(immutableSet2);
        this.columnKeyToIndex = c2;
        this.rowCounts = new int[c.size()];
        this.columnCounts = new int[c2.size()];
        int[] iArr2 = new int[immutableList.size()];
        int[] iArr3 = new int[immutableList.size()];
        for (int i = 0; i < immutableList.size(); i++) {
            C16147b2.C16148a aVar = immutableList.get(i);
            Object rowKey = aVar.getRowKey();
            Object columnKey = aVar.getColumnKey();
            int intValue = this.rowKeyToIndex.get(rowKey).intValue();
            int intValue2 = this.columnKeyToIndex.get(columnKey).intValue();
            checkNoDuplicate(rowKey, columnKey, this.values[intValue][intValue2], aVar.getValue());
            this.values[intValue][intValue2] = aVar.getValue();
            int[] iArr4 = this.rowCounts;
            iArr4[intValue] = iArr4[intValue] + 1;
            int[] iArr5 = this.columnCounts;
            iArr5[intValue2] = iArr5[intValue2] + 1;
            iArr2[i] = intValue;
            iArr3[i] = intValue2;
        }
        this.cellRowIndices = iArr2;
        this.cellColumnIndices = iArr3;
        this.rowMap = new RowMap((C15932a) null);
        this.columnMap = new ColumnMap((C15932a) null);
    }

    public ImmutableTable.SerializedForm createSerializedForm() {
        return ImmutableTable.SerializedForm.create(this, this.cellRowIndices, this.cellColumnIndices);
    }

    public V get(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Integer num = this.rowKeyToIndex.get(obj);
        Integer num2 = this.columnKeyToIndex.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return this.values[num.intValue()][num2.intValue()];
    }

    public C16147b2.C16148a<R, C, V> getCell(int i) {
        int i2 = this.cellRowIndices[i];
        int i3 = this.cellColumnIndices[i];
        return ImmutableTable.cellOf(rowKeySet().asList().get(i2), columnKeySet().asList().get(i3), this.values[i2][i3]);
    }

    public V getValue(int i) {
        return this.values[this.cellRowIndices[i]][this.cellColumnIndices[i]];
    }

    public int size() {
        return this.cellRowIndices.length;
    }

    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.copyOf(this.columnMap);
    }

    public ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.copyOf(this.rowMap);
    }
}
