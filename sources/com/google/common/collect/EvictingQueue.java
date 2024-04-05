package com.google.common.collect;

import com.google.common.base.C15794l;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

public final class EvictingQueue<E> extends C16159d0<E> implements Serializable {
    private static final long serialVersionUID = 0;
    private final Queue<E> delegate;
    public final int maxSize;

    public EvictingQueue(int i) {
        C15794l.m25609c(i, "maxSize (%s) must >= 0", i >= 0);
        this.delegate = new ArrayDeque(i);
        this.maxSize = i;
    }

    public static <E> EvictingQueue<E> create(int i) {
        return new EvictingQueue<>(i);
    }

    @CanIgnoreReturnValue
    public boolean add(E e) {
        e.getClass();
        if (this.maxSize == 0) {
            return true;
        }
        if (size() == this.maxSize) {
            this.delegate.remove();
        }
        this.delegate.add(e);
        return true;
    }

    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        if (size < this.maxSize) {
            return standardAddAll(collection);
        }
        clear();
        int i = size - this.maxSize;
        C15794l.m25614h(i >= 0, "number to skip cannot be negative");
        return C16201n0.m26210a(new C16197m0(collection, i), this);
    }

    public boolean contains(Object obj) {
        Queue delegate2 = delegate();
        obj.getClass();
        return delegate2.contains(obj);
    }

    @CanIgnoreReturnValue
    public boolean offer(E e) {
        return add(e);
    }

    public int remainingCapacity() {
        return this.maxSize - size();
    }

    @CanIgnoreReturnValue
    public boolean remove(Object obj) {
        Queue delegate2 = delegate();
        obj.getClass();
        return delegate2.remove(obj);
    }

    public Queue<E> delegate() {
        return this.delegate;
    }
}
