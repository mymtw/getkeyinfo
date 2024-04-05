package com.google.common.collect;

import com.google.common.collect.Tables;

/* renamed from: com.google.common.collect.j */
public final class C16186j extends Tables.C16118b<Object, Object, Object> {

    /* renamed from: b */
    public final int f36275b;

    /* renamed from: c */
    public final int f36276c;

    /* renamed from: d */
    public final /* synthetic */ ArrayTable f36277d;

    public C16186j(ArrayTable arrayTable, int i) {
        this.f36277d = arrayTable;
        this.f36275b = i / arrayTable.columnList.size();
        this.f36276c = i % arrayTable.columnList.size();
    }

    public final Object getColumnKey() {
        return this.f36277d.columnList.get(this.f36276c);
    }

    public final Object getRowKey() {
        return this.f36277d.rowList.get(this.f36275b);
    }

    public final Object getValue() {
        return this.f36277d.mo56255at(this.f36275b, this.f36276c);
    }
}
