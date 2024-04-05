package com.google.common.collect;

import com.google.common.base.C15795m;
import com.google.common.collect.AbstractIterator;
import java.util.Iterator;

/* renamed from: com.google.common.collect.o0 */
public final class C16204o0 extends AbstractIterator<Object> {

    /* renamed from: d */
    public final /* synthetic */ Iterator f36304d;

    /* renamed from: e */
    public final /* synthetic */ C15795m f36305e;

    public C16204o0(Iterator it, C15795m mVar) {
        this.f36304d = it;
        this.f36305e = mVar;
    }

    /* renamed from: a */
    public final Object mo56053a() {
        while (this.f36304d.hasNext()) {
            Object next = this.f36304d.next();
            if (this.f36305e.apply(next)) {
                return next;
            }
        }
        this.f35745b = AbstractIterator.State.DONE;
        return null;
    }
}
