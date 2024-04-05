package com.google.common.collect;

import com.google.common.collect.AbstractIterator;
import java.util.Iterator;

/* renamed from: com.google.common.collect.s1 */
public final class C16220s1 extends AbstractIterator<Object> {

    /* renamed from: d */
    public final Iterator<Object> f36321d;

    /* renamed from: e */
    public final /* synthetic */ C16224t1 f36322e;

    public C16220s1(C16224t1 t1Var) {
        this.f36322e = t1Var;
        this.f36321d = t1Var.f36327b.iterator();
    }

    /* renamed from: a */
    public final Object mo56053a() {
        while (this.f36321d.hasNext()) {
            Object next = this.f36321d.next();
            if (this.f36322e.f36328c.contains(next)) {
                return next;
            }
        }
        this.f35745b = AbstractIterator.State.DONE;
        return null;
    }
}
