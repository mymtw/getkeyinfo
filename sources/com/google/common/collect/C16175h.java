package com.google.common.collect;

import com.google.common.collect.C16178h1;
import com.google.common.collect.C16234w1;
import com.google.common.collect.Multisets;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.h */
public abstract class C16175h<E> extends C16156d<E> implements C16231v1<E> {
    public final Comparator<? super E> comparator;
    @MonotonicNonNullDecl

    /* renamed from: d */
    public transient C16231v1<E> f36269d;

    /* renamed from: com.google.common.collect.h$a */
    public class C16176a extends C16215r<E> {
        public C16176a() {
        }

        public final Iterator<E> iterator() {
            return C16175h.this.descendingIterator();
        }
    }

    public C16175h() {
        this(Ordering.natural());
    }

    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    public C16231v1<E> createDescendingMultiset() {
        return new C16176a();
    }

    public abstract Iterator<C16178h1.C16179a<E>> descendingEntryIterator();

    /* access modifiers changed from: package-private */
    public Iterator<E> descendingIterator() {
        return Multisets.m26081d(descendingMultiset());
    }

    public C16231v1<E> descendingMultiset() {
        C16231v1<E> v1Var = this.f36269d;
        if (v1Var != null) {
            return v1Var;
        }
        C16231v1<E> createDescendingMultiset = createDescendingMultiset();
        this.f36269d = createDescendingMultiset;
        return createDescendingMultiset;
    }

    public C16178h1.C16179a<E> firstEntry() {
        Iterator entryIterator = entryIterator();
        if (entryIterator.hasNext()) {
            return (C16178h1.C16179a) entryIterator.next();
        }
        return null;
    }

    public C16178h1.C16179a<E> lastEntry() {
        Iterator descendingEntryIterator = descendingEntryIterator();
        if (descendingEntryIterator.hasNext()) {
            return (C16178h1.C16179a) descendingEntryIterator.next();
        }
        return null;
    }

    public C16178h1.C16179a<E> pollFirstEntry() {
        Iterator entryIterator = entryIterator();
        if (!entryIterator.hasNext()) {
            return null;
        }
        C16178h1.C16179a aVar = (C16178h1.C16179a) entryIterator.next();
        Multisets.ImmutableEntry immutableEntry = new Multisets.ImmutableEntry(aVar.getElement(), aVar.getCount());
        entryIterator.remove();
        return immutableEntry;
    }

    public C16178h1.C16179a<E> pollLastEntry() {
        Iterator descendingEntryIterator = descendingEntryIterator();
        if (!descendingEntryIterator.hasNext()) {
            return null;
        }
        C16178h1.C16179a aVar = (C16178h1.C16179a) descendingEntryIterator.next();
        Multisets.ImmutableEntry immutableEntry = new Multisets.ImmutableEntry(aVar.getElement(), aVar.getCount());
        descendingEntryIterator.remove();
        return immutableEntry;
    }

    public C16231v1<E> subMultiset(@NullableDecl E e, BoundType boundType, @NullableDecl E e2, BoundType boundType2) {
        boundType.getClass();
        boundType2.getClass();
        return tailMultiset(e, boundType).headMultiset(e2, boundType2);
    }

    public C16175h(Comparator<? super E> comparator2) {
        comparator2.getClass();
        this.comparator = comparator2;
    }

    public NavigableSet<E> createElementSet() {
        return new C16234w1.C16236b(this);
    }

    public NavigableSet<E> elementSet() {
        return (NavigableSet) super.elementSet();
    }
}
