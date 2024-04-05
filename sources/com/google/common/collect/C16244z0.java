package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.common.collect.z0 */
public final class C16244z0 extends C16170f2<Map.Entry<Object, Object>> {

    /* renamed from: b */
    public final /* synthetic */ Iterator f36337b;

    public C16244z0(Iterator it) {
        this.f36337b = it;
    }

    public final boolean hasNext() {
        return this.f36337b.hasNext();
    }

    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f36337b.next();
        entry.getClass();
        return new C16241y0(entry);
    }
}
