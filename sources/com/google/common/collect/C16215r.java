package com.google.common.collect;

import com.google.common.collect.C16178h1;
import com.google.common.collect.C16234w1;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

/* renamed from: com.google.common.collect.r */
public abstract class C16215r<E> extends C16145b0<E> implements C16231v1<E> {
    @MonotonicNonNullDecl

    /* renamed from: b */
    public transient Ordering f36315b;
    @MonotonicNonNullDecl

    /* renamed from: c */
    public transient C16234w1.C16236b f36316c;
    @MonotonicNonNullDecl

    /* renamed from: d */
    public transient C16211q f36317d;

    public final Comparator<? super E> comparator() {
        Ordering ordering = this.f36315b;
        if (ordering != null) {
            return ordering;
        }
        Ordering reverse = Ordering.from(C16175h.this.comparator()).reverse();
        this.f36315b = reverse;
        return reverse;
    }

    public final C16178h1<E> delegate() {
        return C16175h.this;
    }

    public final C16231v1<E> descendingMultiset() {
        return C16175h.this;
    }

    public final Set<C16178h1.C16179a<E>> entrySet() {
        C16211q qVar = this.f36317d;
        if (qVar != null) {
            return qVar;
        }
        C16211q qVar2 = new C16211q(this);
        this.f36317d = qVar2;
        return qVar2;
    }

    public final C16178h1.C16179a<E> firstEntry() {
        return C16175h.this.lastEntry();
    }

    public final C16231v1<E> headMultiset(E e, BoundType boundType) {
        return C16175h.this.tailMultiset(e, boundType).descendingMultiset();
    }

    public final C16178h1.C16179a<E> lastEntry() {
        return C16175h.this.firstEntry();
    }

    public final C16178h1.C16179a<E> pollFirstEntry() {
        return C16175h.this.pollLastEntry();
    }

    public final C16178h1.C16179a<E> pollLastEntry() {
        return C16175h.this.pollFirstEntry();
    }

    public final C16231v1<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2) {
        return C16175h.this.subMultiset(e2, boundType2, e, boundType).descendingMultiset();
    }

    public final C16231v1<E> tailMultiset(E e, BoundType boundType) {
        return C16175h.this.headMultiset(e, boundType).descendingMultiset();
    }

    public final Object[] toArray() {
        return standardToArray();
    }

    public final String toString() {
        return entrySet().toString();
    }

    public final NavigableSet<E> elementSet() {
        C16234w1.C16236b bVar = this.f36316c;
        if (bVar != null) {
            return bVar;
        }
        C16234w1.C16236b bVar2 = new C16234w1.C16236b(this);
        this.f36316c = bVar2;
        return bVar2;
    }

    public final <T> T[] toArray(T[] tArr) {
        return standardToArray(tArr);
    }

    /* renamed from: delegate  reason: collision with other method in class */
    public final Object m35108delegate() {
        return C16175h.this;
    }

    /* renamed from: delegate  reason: collision with other method in class */
    public final Collection m35109delegate() {
        return C16175h.this;
    }
}
