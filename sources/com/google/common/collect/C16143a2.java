package com.google.common.collect;

import com.google.common.collect.Synchronized;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.common.collect.a2 */
public final class C16143a2 extends C16243z<Object, Collection<Object>> {

    /* renamed from: b */
    public final /* synthetic */ Map.Entry f36245b;

    /* renamed from: c */
    public final /* synthetic */ Synchronized.SynchronizedAsMapEntries.C16112a f36246c;

    public C16143a2(Synchronized.SynchronizedAsMapEntries.C16112a aVar, Map.Entry entry) {
        this.f36246c = aVar;
        this.f36245b = entry;
    }

    public final Object delegate() {
        return this.f36245b;
    }

    /* renamed from: e */
    public final Map.Entry<Object, Collection<Object>> mo56041e() {
        return this.f36245b;
    }

    public final Object getValue() {
        return Synchronized.m26114b((Collection) this.f36245b.getValue(), Synchronized.SynchronizedAsMapEntries.this.mutex);
    }
}
