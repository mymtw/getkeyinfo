package com.google.common.collect;

import java.util.Iterator;

/* renamed from: com.google.common.collect.c2 */
public abstract class C16155c2<F, T> implements Iterator<T> {

    /* renamed from: b */
    public final Iterator<? extends F> f36255b;

    public C16155c2(Iterator<? extends F> it) {
        it.getClass();
        this.f36255b = it;
    }

    /* renamed from: a */
    public abstract T mo56891a(F f);

    public final boolean hasNext() {
        return this.f36255b.hasNext();
    }

    public final T next() {
        return mo56891a(this.f36255b.next());
    }

    public final void remove() {
        this.f36255b.remove();
    }
}
