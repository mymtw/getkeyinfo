package com.google.common.collect;

import com.google.common.base.C15784e;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.common.collect.l0 */
public final class C16194l0 extends C16221t<Object> {

    /* renamed from: c */
    public final /* synthetic */ Iterable f36294c;

    /* renamed from: d */
    public final /* synthetic */ C15784e f36295d;

    public C16194l0(Collection collection, C15784e eVar) {
        this.f36294c = collection;
        this.f36295d = eVar;
    }

    public final Iterator<Object> iterator() {
        Iterator it = this.f36294c.iterator();
        C15784e eVar = this.f36295d;
        eVar.getClass();
        return new C16209p0(it, eVar);
    }
}
