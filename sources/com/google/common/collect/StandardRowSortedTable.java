package com.google.common.collect;

import com.google.common.base.C15804s;
import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

class StandardRowSortedTable<R, C, V> extends StandardTable<R, C, V> implements C16210p1<R, C, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: com.google.common.collect.StandardRowSortedTable$a */
    public class C16093a extends StandardTable<R, C, V>.g implements SortedMap<R, Map<C, V>> {
        public C16093a() {
            super();
        }

        /* renamed from: b */
        public final Set mo56115b() {
            return new Maps.C16046g(this);
        }

        public final Comparator<? super R> comparator() {
            return StandardRowSortedTable.access$100(StandardRowSortedTable.this).comparator();
        }

        public final R firstKey() {
            return StandardRowSortedTable.access$100(StandardRowSortedTable.this).firstKey();
        }

        public final SortedMap<R, Map<C, V>> headMap(R r) {
            r.getClass();
            return new StandardRowSortedTable(StandardRowSortedTable.access$100(StandardRowSortedTable.this).headMap(r), StandardRowSortedTable.this.factory).rowMap();
        }

        public final Set keySet() {
            return (SortedSet) super.keySet();
        }

        public final R lastKey() {
            return StandardRowSortedTable.access$100(StandardRowSortedTable.this).lastKey();
        }

        public final SortedMap<R, Map<C, V>> subMap(R r, R r2) {
            r.getClass();
            r2.getClass();
            return new StandardRowSortedTable(StandardRowSortedTable.access$100(StandardRowSortedTable.this).subMap(r, r2), StandardRowSortedTable.this.factory).rowMap();
        }

        public final SortedMap<R, Map<C, V>> tailMap(R r) {
            r.getClass();
            return new StandardRowSortedTable(StandardRowSortedTable.access$100(StandardRowSortedTable.this).tailMap(r), StandardRowSortedTable.this.factory).rowMap();
        }
    }

    public StandardRowSortedTable(SortedMap<R, Map<C, V>> sortedMap, C15804s<? extends Map<C, V>> sVar) {
        super(sortedMap, sVar);
    }

    public static SortedMap access$100(StandardRowSortedTable standardRowSortedTable) {
        return (SortedMap) standardRowSortedTable.backingMap;
    }

    public SortedMap<R, Map<C, V>> createRowMap() {
        return new C16093a();
    }

    public SortedSet<R> rowKeySet() {
        return (SortedSet) rowMap().keySet();
    }

    public SortedMap<R, Map<C, V>> rowMap() {
        return (SortedMap) super.rowMap();
    }
}
