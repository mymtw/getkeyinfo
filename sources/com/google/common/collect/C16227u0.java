package com.google.common.collect;

import com.google.common.base.C15784e;
import com.google.common.collect.Maps;
import java.util.Map;

/* renamed from: com.google.common.collect.u0 */
public final class C16227u0 implements C15784e<Map.Entry<Object, Object>, Map.Entry<Object, Object>> {

    /* renamed from: b */
    public final /* synthetic */ Maps.C16041c f36331b;

    public C16227u0(Maps.C16041c cVar) {
        this.f36331b = cVar;
    }

    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Maps.C16041c cVar = this.f36331b;
        cVar.getClass();
        entry.getClass();
        return new C16223t0(cVar, entry);
    }
}
