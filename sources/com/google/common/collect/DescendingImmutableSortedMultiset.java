package com.google.common.collect;

import com.google.common.collect.C16178h1;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class DescendingImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {

    /* renamed from: e */
    public final transient ImmutableSortedMultiset<E> f35848e;

    public DescendingImmutableSortedMultiset(ImmutableSortedMultiset<E> immutableSortedMultiset) {
        this.f35848e = immutableSortedMultiset;
    }

    public int count(@NullableDecl Object obj) {
        return this.f35848e.count(obj);
    }

    public C16178h1.C16179a<E> firstEntry() {
        return this.f35848e.lastEntry();
    }

    public C16178h1.C16179a<E> getEntry(int i) {
        return this.f35848e.entrySet().asList().reverse().get(i);
    }

    public boolean isPartialView() {
        return this.f35848e.isPartialView();
    }

    public C16178h1.C16179a<E> lastEntry() {
        return this.f35848e.firstEntry();
    }

    public int size() {
        return this.f35848e.size();
    }

    public ImmutableSortedMultiset<E> descendingMultiset() {
        return this.f35848e;
    }

    public ImmutableSortedMultiset<E> headMultiset(E e, BoundType boundType) {
        return this.f35848e.tailMultiset(e, boundType).descendingMultiset();
    }

    public ImmutableSortedMultiset<E> tailMultiset(E e, BoundType boundType) {
        return this.f35848e.headMultiset(e, boundType).descendingMultiset();
    }

    public ImmutableSortedSet<E> elementSet() {
        return this.f35848e.elementSet().descendingSet();
    }
}
