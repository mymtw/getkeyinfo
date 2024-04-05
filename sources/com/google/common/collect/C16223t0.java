package com.google.common.collect;

import com.google.common.collect.Maps;
import java.util.Map;

/* renamed from: com.google.common.collect.t0 */
public final class C16223t0 extends C16144b<Object, Object> {

    /* renamed from: b */
    public final /* synthetic */ Map.Entry f36325b;

    /* renamed from: c */
    public final /* synthetic */ Maps.C16041c f36326c;

    public C16223t0(Maps.C16041c cVar, Map.Entry entry) {
        this.f36325b = entry;
        this.f36326c = cVar;
    }

    public final Object getKey() {
        return this.f36325b.getKey();
    }

    public final Object getValue() {
        Maps.C16041c cVar = this.f36326c;
        this.f36325b.getKey();
        return cVar.mo57120a(this.f36325b.getValue());
    }
}
