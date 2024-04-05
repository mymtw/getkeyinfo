package com.google.common.collect;

import java.util.ListIterator;

/* renamed from: com.google.common.collect.d2 */
public abstract class C16161d2<F, T> extends C16155c2<F, T> implements ListIterator<T> {
    public C16161d2(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    public final void add(T t) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasPrevious() {
        return ((ListIterator) this.f36255b).hasPrevious();
    }

    public final int nextIndex() {
        return ((ListIterator) this.f36255b).nextIndex();
    }

    public final T previous() {
        return mo56891a(((ListIterator) this.f36255b).previous());
    }

    public final int previousIndex() {
        return ((ListIterator) this.f36255b).previousIndex();
    }

    public void set(T t) {
        throw new UnsupportedOperationException();
    }
}
