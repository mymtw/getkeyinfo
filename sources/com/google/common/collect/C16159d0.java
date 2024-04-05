package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.NoSuchElementException;
import java.util.Queue;

/* renamed from: com.google.common.collect.d0 */
public abstract class C16159d0<E> extends C16229v<E> implements Queue<E> {
    public abstract Queue<E> delegate();

    public E element() {
        return delegate().element();
    }

    @CanIgnoreReturnValue
    public boolean offer(E e) {
        return delegate().offer(e);
    }

    public E peek() {
        return delegate().peek();
    }

    @CanIgnoreReturnValue
    public E poll() {
        return delegate().poll();
    }

    @CanIgnoreReturnValue
    public E remove() {
        return delegate().remove();
    }

    public boolean standardOffer(E e) {
        try {
            return add(e);
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public E standardPeek() {
        try {
            return element();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    public E standardPoll() {
        try {
            return remove();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }
}
