package com.google.common.collect;

import com.google.common.collect.C16178h1;
import com.google.common.collect.Multisets;
import java.util.Comparator;
import java.util.NavigableSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

final class UnmodifiableSortedMultiset<E> extends Multisets.UnmodifiableMultiset<E> implements C16231v1<E> {
    private static final long serialVersionUID = 0;
    @MonotonicNonNullDecl

    /* renamed from: b */
    public transient UnmodifiableSortedMultiset<E> f36241b;

    public UnmodifiableSortedMultiset(C16231v1<E> v1Var) {
        super(v1Var);
    }

    public Comparator<? super E> comparator() {
        return delegate().comparator();
    }

    public C16231v1<E> descendingMultiset() {
        UnmodifiableSortedMultiset<E> unmodifiableSortedMultiset = this.f36241b;
        if (unmodifiableSortedMultiset != null) {
            return unmodifiableSortedMultiset;
        }
        UnmodifiableSortedMultiset<E> unmodifiableSortedMultiset2 = new UnmodifiableSortedMultiset<>(delegate().descendingMultiset());
        unmodifiableSortedMultiset2.f36241b = this;
        this.f36241b = unmodifiableSortedMultiset2;
        return unmodifiableSortedMultiset2;
    }

    public C16178h1.C16179a<E> firstEntry() {
        return delegate().firstEntry();
    }

    public C16231v1<E> headMultiset(E e, BoundType boundType) {
        C16231v1 headMultiset = delegate().headMultiset(e, boundType);
        headMultiset.getClass();
        return new UnmodifiableSortedMultiset(headMultiset);
    }

    public C16178h1.C16179a<E> lastEntry() {
        return delegate().lastEntry();
    }

    public C16178h1.C16179a<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    public C16178h1.C16179a<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    public C16231v1<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2) {
        C16231v1 subMultiset = delegate().subMultiset(e, boundType, e2, boundType2);
        subMultiset.getClass();
        return new UnmodifiableSortedMultiset(subMultiset);
    }

    public C16231v1<E> tailMultiset(E e, BoundType boundType) {
        C16231v1 tailMultiset = delegate().tailMultiset(e, boundType);
        tailMultiset.getClass();
        return new UnmodifiableSortedMultiset(tailMultiset);
    }

    public NavigableSet<E> createElementSet() {
        return Sets.m26096f(delegate().elementSet());
    }

    public NavigableSet<E> elementSet() {
        return (NavigableSet) super.elementSet();
    }

    public C16231v1<E> delegate() {
        return (C16231v1) super.delegate();
    }
}
