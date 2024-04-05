package com.google.common.collect;

import com.etsy.android.lib.models.ResponseConstants;
import com.google.common.collect.C16178h1;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.d */
public abstract class C16156d<E> extends AbstractCollection<E> implements C16178h1<E> {
    @MonotonicNonNullDecl

    /* renamed from: b */
    public transient Set<E> f36256b;
    @MonotonicNonNullDecl

    /* renamed from: c */
    public transient Set<C16178h1.C16179a<E>> f36257c;

    /* renamed from: com.google.common.collect.d$a */
    public class C16157a extends Multisets.C16065b<E> {
        public C16157a() {
        }

        /* renamed from: a */
        public final C16178h1<E> mo57194a() {
            return C16156d.this;
        }

        public final Iterator<E> iterator() {
            return C16156d.this.elementIterator();
        }
    }

    /* renamed from: com.google.common.collect.d$b */
    public class C16158b extends Multisets.C16066c<E> {
        public C16158b() {
        }

        /* renamed from: a */
        public C16178h1<E> mo56398a() {
            return C16156d.this;
        }

        public final Iterator<C16178h1.C16179a<E>> iterator() {
            return C16156d.this.entryIterator();
        }

        public final int size() {
            return C16156d.this.distinctElements();
        }
    }

    @CanIgnoreReturnValue
    public final boolean add(@NullableDecl E e) {
        add(e, 1);
        return true;
    }

    @CanIgnoreReturnValue
    public final boolean addAll(Collection<? extends E> collection) {
        return Multisets.m26078a(this, collection);
    }

    public abstract void clear();

    public boolean contains(@NullableDecl Object obj) {
        return count(obj) > 0;
    }

    public Set<E> createElementSet() {
        return new C16157a();
    }

    public Set<C16178h1.C16179a<E>> createEntrySet() {
        return new C16158b();
    }

    public abstract int distinctElements();

    public abstract Iterator<E> elementIterator();

    public Set<E> elementSet() {
        Set<E> set = this.f36256b;
        if (set != null) {
            return set;
        }
        Set<E> createElementSet = createElementSet();
        this.f36256b = createElementSet;
        return createElementSet;
    }

    public abstract Iterator<C16178h1.C16179a<E>> entryIterator();

    public Set<C16178h1.C16179a<E>> entrySet() {
        Set<C16178h1.C16179a<E>> set = this.f36257c;
        if (set != null) {
            return set;
        }
        Set<C16178h1.C16179a<E>> createEntrySet = createEntrySet();
        this.f36257c = createEntrySet;
        return createEntrySet;
    }

    public final boolean equals(@NullableDecl Object obj) {
        return Multisets.m26079b(this, obj);
    }

    public final int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @CanIgnoreReturnValue
    public final boolean remove(@NullableDecl Object obj) {
        return remove(obj, 1) > 0;
    }

    @CanIgnoreReturnValue
    public final boolean removeAll(Collection<?> collection) {
        if (collection instanceof C16178h1) {
            collection = ((C16178h1) collection).elementSet();
        }
        return elementSet().removeAll(collection);
    }

    @CanIgnoreReturnValue
    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        if (collection instanceof C16178h1) {
            collection = ((C16178h1) collection).elementSet();
        }
        return elementSet().retainAll(collection);
    }

    @CanIgnoreReturnValue
    public int setCount(@NullableDecl E e, int i) {
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

    public final String toString() {
        return entrySet().toString();
    }

    @CanIgnoreReturnValue
    public int add(@NullableDecl E e, int i) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    public int remove(@NullableDecl Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    public boolean setCount(@NullableDecl E e, int i, int i2) {
        C16203o.m26215b(i, "oldCount");
        C16203o.m26215b(i2, "newCount");
        if (count(e) != i) {
            return false;
        }
        setCount(e, i2);
        return true;
    }
}
