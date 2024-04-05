package com.google.common.collect;

import com.etsy.android.lib.models.ResponseConstants;
import com.google.common.base.C15791j;
import com.google.common.collect.C16178h1;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.b0 */
public abstract class C16145b0<E> extends C16229v<E> implements C16178h1<E> {
    @CanIgnoreReturnValue
    public int add(E e, int i) {
        return delegate().add(e, i);
    }

    public int count(Object obj) {
        return delegate().count(obj);
    }

    public abstract C16178h1<E> delegate();

    public Set<E> elementSet() {
        return delegate().elementSet();
    }

    public Set<C16178h1.C16179a<E>> entrySet() {
        return delegate().entrySet();
    }

    public boolean equals(@NullableDecl Object obj) {
        return obj == this || delegate().equals(obj);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    @CanIgnoreReturnValue
    public int remove(Object obj, int i) {
        return delegate().remove(obj, i);
    }

    @CanIgnoreReturnValue
    public int setCount(E e, int i) {
        return delegate().setCount(e, i);
    }

    public boolean standardAdd(E e) {
        add(e, 1);
        return true;
    }

    public boolean standardAddAll(Collection<? extends E> collection) {
        return Multisets.m26078a(this, collection);
    }

    public void standardClear() {
        Iterators.m25979b(entrySet().iterator());
    }

    public boolean standardContains(@NullableDecl Object obj) {
        return count(obj) > 0;
    }

    public int standardCount(@NullableDecl Object obj) {
        for (C16178h1.C16179a aVar : entrySet()) {
            if (C15791j.m25606a(aVar.getElement(), obj)) {
                return aVar.getCount();
            }
        }
        return 0;
    }

    public boolean standardEquals(@NullableDecl Object obj) {
        return Multisets.m26079b(this, obj);
    }

    public int standardHashCode() {
        return entrySet().hashCode();
    }

    public Iterator<E> standardIterator() {
        return Multisets.m26081d(this);
    }

    public boolean standardRemove(Object obj) {
        return remove(obj, 1) > 0;
    }

    public boolean standardRemoveAll(Collection<?> collection) {
        if (collection instanceof C16178h1) {
            collection = ((C16178h1) collection).elementSet();
        }
        return elementSet().removeAll(collection);
    }

    public boolean standardRetainAll(Collection<?> collection) {
        collection.getClass();
        if (collection instanceof C16178h1) {
            collection = ((C16178h1) collection).elementSet();
        }
        return elementSet().retainAll(collection);
    }

    public int standardSetCount(E e, int i) {
        C16203o.m26215b(i, ResponseConstants.COUNT);
        int count = count(e);
        int i2 = i - count;
        if (i2 > 0) {
            add(e, i2);
        } else if (i2 < 0) {
            remove(e, -i2);
        }
        return count;
    }

    public int standardSize() {
        long j = 0;
        for (C16178h1.C16179a count : entrySet()) {
            j += (long) count.getCount();
        }
        return Ints.m26384b(j);
    }

    public String standardToString() {
        return entrySet().toString();
    }

    @CanIgnoreReturnValue
    public boolean setCount(E e, int i, int i2) {
        return delegate().setCount(e, i, i2);
    }

    public boolean standardSetCount(E e, int i, int i2) {
        C16203o.m26215b(i, "oldCount");
        C16203o.m26215b(i2, "newCount");
        if (count(e) != i) {
            return false;
        }
        setCount(e, i2);
        return true;
    }
}
