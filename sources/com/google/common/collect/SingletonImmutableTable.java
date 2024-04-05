package com.google.common.collect;

import com.google.common.collect.C16147b2;
import com.google.common.collect.ImmutableTable;
import java.util.Map;

class SingletonImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {
    public final C singleColumnKey;
    public final R singleRowKey;
    public final V singleValue;

    public SingletonImmutableTable(R r, C c, V v) {
        r.getClass();
        this.singleRowKey = r;
        c.getClass();
        this.singleColumnKey = c;
        v.getClass();
        this.singleValue = v;
    }

    public ImmutableTable.SerializedForm createSerializedForm() {
        return ImmutableTable.SerializedForm.create(this, new int[]{0}, new int[]{0});
    }

    public int size() {
        return 1;
    }

    public ImmutableMap<R, V> column(C c) {
        c.getClass();
        if (containsColumn(c)) {
            return ImmutableMap.m25854of(this.singleRowKey, this.singleValue);
        }
        return ImmutableMap.m25853of();
    }

    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.m25854of(this.singleColumnKey, ImmutableMap.m25854of(this.singleRowKey, this.singleValue));
    }

    public ImmutableSet<C16147b2.C16148a<R, C, V>> createCellSet() {
        return ImmutableSet.m25895of(ImmutableTable.cellOf(this.singleRowKey, this.singleColumnKey, this.singleValue));
    }

    public ImmutableCollection<V> createValues() {
        return ImmutableSet.m25895of(this.singleValue);
    }

    public ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.m25854of(this.singleRowKey, ImmutableMap.m25854of(this.singleColumnKey, this.singleValue));
    }

    public SingletonImmutableTable(C16147b2.C16148a<R, C, V> aVar) {
        this(aVar.getRowKey(), aVar.getColumnKey(), aVar.getValue());
    }
}
