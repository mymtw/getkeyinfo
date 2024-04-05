package com.google.common.collect;

import com.google.common.collect.C16147b2;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableTable;
import com.google.errorprone.annotations.Immutable;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

@Immutable(containerOf = {"R", "C", "V"})
final class SparseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {
    public static final ImmutableTable<Object, Object, Object> EMPTY = new SparseImmutableTable(ImmutableList.m25826of(), ImmutableSet.m25894of(), ImmutableSet.m25894of());
    private final int[] cellColumnInRowIndices;
    private final int[] cellRowIndices;
    private final ImmutableMap<C, ImmutableMap<R, V>> columnMap;
    private final ImmutableMap<R, ImmutableMap<C, V>> rowMap;

    public SparseImmutableTable(ImmutableList<C16147b2.C16148a<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        ImmutableMap<R, Integer> c = Maps.m26055c(immutableSet);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C16170f2<R> it = immutableSet.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), new LinkedHashMap());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C16170f2<C> it2 = immutableSet2.iterator();
        while (it2.hasNext()) {
            linkedHashMap2.put(it2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        int i = 0;
        for (int i2 = 0; i2 < immutableList.size(); i2++) {
            C16147b2.C16148a aVar = immutableList.get(i2);
            Object rowKey = aVar.getRowKey();
            Object columnKey = aVar.getColumnKey();
            Object value = aVar.getValue();
            iArr[i2] = c.get(rowKey).intValue();
            Map map = (Map) linkedHashMap.get(rowKey);
            iArr2[i2] = map.size();
            checkNoDuplicate(rowKey, columnKey, map.put(columnKey, value), value);
            ((Map) linkedHashMap2.get(columnKey)).put(rowKey, value);
        }
        this.cellRowIndices = iArr;
        this.cellColumnInRowIndices = iArr2;
        Object[] objArr = new Object[(linkedHashMap.size() * 2)];
        int i3 = 0;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ImmutableMap copyOf = ImmutableMap.copyOf((Map) entry.getValue());
            int i4 = (i3 + 1) * 2;
            if (i4 > objArr.length) {
                objArr = Arrays.copyOf(objArr, ImmutableCollection.C15950b.m25825a(objArr.length, i4));
            }
            C16203o.m26214a(key, copyOf);
            objArr[i3 * 2] = key;
            objArr[(i3 * 2) + 1] = copyOf;
            i3++;
        }
        this.rowMap = RegularImmutableMap.create(i3, objArr);
        Object[] objArr2 = new Object[(linkedHashMap2.size() * 2)];
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            Object key2 = entry2.getKey();
            ImmutableMap copyOf2 = ImmutableMap.copyOf((Map) entry2.getValue());
            int i5 = (i + 1) * 2;
            if (i5 > objArr2.length) {
                objArr2 = Arrays.copyOf(objArr2, ImmutableCollection.C15950b.m25825a(objArr2.length, i5));
            }
            C16203o.m26214a(key2, copyOf2);
            objArr2[i * 2] = key2;
            objArr2[(i * 2) + 1] = copyOf2;
            i++;
        }
        this.columnMap = RegularImmutableMap.create(i, objArr2);
    }

    public ImmutableTable.SerializedForm createSerializedForm() {
        ImmutableMap c = Maps.m26055c(columnKeySet());
        int[] iArr = new int[cellSet().size()];
        C16170f2 it = cellSet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) c.get(((C16147b2.C16148a) it.next()).getColumnKey())).intValue();
            i++;
        }
        return ImmutableTable.SerializedForm.create(this, this.cellRowIndices, iArr);
    }

    public C16147b2.C16148a<R, C, V> getCell(int i) {
        Map.Entry entry = this.rowMap.entrySet().asList().get(this.cellRowIndices[i]);
        Map.Entry entry2 = (Map.Entry) ((ImmutableMap) entry.getValue()).entrySet().asList().get(this.cellColumnInRowIndices[i]);
        return ImmutableTable.cellOf(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    public V getValue(int i) {
        int i2 = this.cellRowIndices[i];
        return this.rowMap.values().asList().get(i2).values().asList().get(this.cellColumnInRowIndices[i]);
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
