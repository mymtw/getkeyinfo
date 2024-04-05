package com.google.common.collect;

import com.google.common.collect.StandardTable;
import java.util.Map;

/* renamed from: com.google.common.collect.y1 */
public final class C16242y1 extends C16144b<Object, Object> {

    /* renamed from: b */
    public final /* synthetic */ Map.Entry f36335b;

    /* renamed from: c */
    public final /* synthetic */ StandardTable.C16095b.C16097b f36336c;

    public C16242y1(StandardTable.C16095b.C16097b bVar, Map.Entry entry) {
        this.f36336c = bVar;
        this.f36335b = entry;
    }

    public final Object getKey() {
        return this.f36335b.getKey();
    }

    public final Object getValue() {
        return ((Map) this.f36335b.getValue()).get(StandardTable.C16095b.this.f36153e);
    }

    public final Object setValue(Object obj) {
        C c = StandardTable.C16095b.this.f36153e;
        obj.getClass();
        return ((Map) this.f36335b.getValue()).put(c, obj);
    }
}
