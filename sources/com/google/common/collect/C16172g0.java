package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.g0 */
public abstract class C16172g0<E> extends C16164e0<E> implements SortedSet<E> {
    public Comparator<? super E> comparator() {
        return delegate().comparator();
    }

    public abstract SortedSet<E> delegate();

    public E first() {
        return delegate().first();
    }

    public SortedSet<E> headSet(E e) {
        return delegate().headSet(e);
    }

    public E last() {
        return delegate().last();
    }

    public boolean standardContains(@NullableDecl Object obj) {
        try {
            Object first = tailSet(obj).first();
            Comparator comparator = comparator();
            return (comparator == null ? ((Comparable) first).compareTo(obj) : comparator.compare(first, obj)) == 0;
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
        }
    }

    public boolean standardRemove(@NullableDecl Object obj) {
        try {
            Iterator it = tailSet(obj).iterator();
            if (!it.hasNext()) {
                return false;
            }
            Object next = it.next();
            Comparator comparator = comparator();
            if ((comparator == null ? ((Comparable) next).compareTo(obj) : comparator.compare(next, obj)) != 0) {
                return false;
            }
            it.remove();
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public SortedSet<E> standardSubSet(E e, E e2) {
        return tailSet(e).headSet(e2);
    }

    public SortedSet<E> subSet(E e, E e2) {
        return delegate().subSet(e, e2);
    }

    public SortedSet<E> tailSet(E e) {
        return delegate().tailSet(e);
    }
}
