package com.google.common.collect;

import com.google.common.collect.ArrayTable;

/* renamed from: com.google.common.collect.k */
public final class C16189k extends C16144b<Object, Object> {

    /* renamed from: b */
    public final /* synthetic */ int f36279b;

    /* renamed from: c */
    public final /* synthetic */ ArrayTable.C15910c f36280c;

    public C16189k(ArrayTable.C15910c cVar, int i) {
        this.f36280c = cVar;
        this.f36279b = i;
    }

    public final Object getKey() {
        ArrayTable.C15910c cVar = this.f36280c;
        return cVar.f35793b.keySet().asList().get(this.f36279b);
    }

    public final Object getValue() {
        return this.f36280c.mo56289c(this.f36279b);
    }

    public final Object setValue(Object obj) {
        return this.f36280c.mo56292d(this.f36279b, obj);
    }
}
