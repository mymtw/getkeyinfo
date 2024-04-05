package com.google.common.collect;

import com.google.common.base.C15784e;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.common.collect.x0 */
public final class C16238x0 extends C16155c2<Object, Map.Entry<Object, Object>> {

    /* renamed from: c */
    public final /* synthetic */ C15784e f36333c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16238x0(Iterator it, C15784e eVar) {
        super(it);
        this.f36333c = eVar;
    }

    /* renamed from: a */
    public final Object mo56891a(Object obj) {
        return new ImmutableEntry(obj, this.f36333c.apply(obj));
    }
}
