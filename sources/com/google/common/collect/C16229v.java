package com.google.common.collect;

import com.etsy.android.lib.models.ResponseConstants;
import com.google.common.base.C15791j;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p628nj.C18263b;

/* renamed from: com.google.common.collect.v */
public abstract class C16229v<E> extends C16153c0 implements Collection<E> {
    @CanIgnoreReturnValue
    public boolean add(E e) {
        return delegate().add(e);
    }

    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
        return delegate().addAll(collection);
    }

    public void clear() {
        delegate().clear();
    }

    public boolean contains(Object obj) {
        return delegate().contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return delegate().containsAll(collection);
    }

    public abstract Collection<E> delegate();

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Iterator<E> iterator() {
        return delegate().iterator();
    }

    @CanIgnoreReturnValue
    public boolean remove(Object obj) {
        return delegate().remove(obj);
    }

    @CanIgnoreReturnValue
    public boolean removeAll(Collection<?> collection) {
        return delegate().removeAll(collection);
    }

    @CanIgnoreReturnValue
    public boolean retainAll(Collection<?> collection) {
        return delegate().retainAll(collection);
    }

    public int size() {
        return delegate().size();
    }

    public boolean standardAddAll(Collection<? extends E> collection) {
        return Iterators.m25978a(this, collection.iterator());
    }

    public void standardClear() {
        Iterators.m25979b(iterator());
    }

    public boolean standardContains(@NullableDecl Object obj) {
        return Iterators.m25980c(obj, iterator());
    }

    public boolean standardContainsAll(Collection<?> collection) {
        return C18263b.m30809D(this, collection);
    }

    public boolean standardIsEmpty() {
        return !iterator().hasNext();
    }

    public boolean standardRemove(@NullableDecl Object obj) {
        Iterator it = iterator();
        while (it.hasNext()) {
            if (C15791j.m25606a(it.next(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean standardRemoveAll(Collection<?> collection) {
        return Iterators.m25984g(collection, iterator());
    }

    public boolean standardRetainAll(Collection<?> collection) {
        Iterator it = iterator();
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public Object[] standardToArray() {
        return toArray(new Object[size()]);
    }

    public String standardToString() {
        int size = size();
        C16203o.m26215b(size, ResponseConstants.SIZE);
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
        sb.append('[');
        boolean z = true;
        for (Object next : this) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            if (next == this) {
                sb.append("(this Collection)");
            } else {
                sb.append(next);
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public Object[] toArray() {
        return delegate().toArray();
    }

    @CanIgnoreReturnValue
    public <T> T[] toArray(T[] tArr) {
        return delegate().toArray(tArr);
    }

    public <T> T[] standardToArray(T[] tArr) {
        return C16188j1.m26184c(this, tArr);
    }
}
