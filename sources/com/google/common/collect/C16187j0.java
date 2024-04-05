package com.google.common.collect;

import java.util.Map;

/* renamed from: com.google.common.collect.j0 */
public final class C16187j0 extends C16144b<Object, ImmutableSet<Object>> {

    /* renamed from: b */
    public final /* synthetic */ Map.Entry f36278b;

    public C16187j0(Map.Entry entry) {
        this.f36278b = entry;
    }

    public final Object getKey() {
        return this.f36278b.getKey();
    }

    public final Object getValue() {
        return ImmutableSet.m25895of(this.f36278b.getValue());
    }
}
