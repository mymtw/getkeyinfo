package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class ReverseOrdering<T> extends Ordering<T> implements Serializable {
    private static final long serialVersionUID = 0;
    public final Ordering<? super T> forwardOrder;

    public ReverseOrdering(Ordering<? super T> ordering) {
        ordering.getClass();
        this.forwardOrder = ordering;
    }

    public int compare(T t, T t2) {
        return this.forwardOrder.compare(t2, t);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReverseOrdering) {
            return this.forwardOrder.equals(((ReverseOrdering) obj).forwardOrder);
        }
        return false;
    }

    public int hashCode() {
        return -this.forwardOrder.hashCode();
    }

    public <E extends T> E max(E e, E e2) {
        return this.forwardOrder.min(e, e2);
    }

    public <E extends T> E min(E e, E e2) {
        return this.forwardOrder.max(e, e2);
    }

    public <S extends T> Ordering<S> reverse() {
        return this.forwardOrder;
    }

    public String toString() {
        return this.forwardOrder + ".reverse()";
    }

    public <E extends T> E max(E e, E e2, E e3, E... eArr) {
        return this.forwardOrder.min(e, e2, e3, eArr);
    }

    public <E extends T> E min(E e, E e2, E e3, E... eArr) {
        return this.forwardOrder.max(e, e2, e3, eArr);
    }

    public <E extends T> E max(Iterator<E> it) {
        return this.forwardOrder.min(it);
    }

    public <E extends T> E min(Iterator<E> it) {
        return this.forwardOrder.max(it);
    }

    public <E extends T> E max(Iterable<E> iterable) {
        return this.forwardOrder.min(iterable);
    }

    public <E extends T> E min(Iterable<E> iterable) {
        return this.forwardOrder.max(iterable);
    }
}
