package com.google.common.collect;

import com.google.common.collect.Iterators;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class EmptyContiguousSet<C extends Comparable> extends ContiguousSet<C> {

    public static final class SerializedForm<C extends Comparable> implements Serializable {
        private static final long serialVersionUID = 0;
        private final DiscreteDomain<C> domain;

        public SerializedForm() {
            throw null;
        }

        public SerializedForm(DiscreteDomain discreteDomain, C15934a aVar) {
            this.domain = discreteDomain;
        }

        private Object readResolve() {
            return new EmptyContiguousSet(this.domain);
        }
    }

    public EmptyContiguousSet(DiscreteDomain<C> discreteDomain) {
        super(discreteDomain);
    }

    public ImmutableList<C> asList() {
        return ImmutableList.m25826of();
    }

    public boolean contains(Object obj) {
        return false;
    }

    public ImmutableSortedSet<C> createDescendingSet() {
        return ImmutableSortedSet.emptySet(Ordering.natural().reverse());
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public ContiguousSet<C> headSetImpl(C c, boolean z) {
        return this;
    }

    public int indexOf(Object obj) {
        return -1;
    }

    public ContiguousSet<C> intersection(ContiguousSet<C> contiguousSet) {
        return this;
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean isHashCodeFast() {
        return true;
    }

    public boolean isPartialView() {
        return false;
    }

    public Range<C> range() {
        throw new NoSuchElementException();
    }

    public int size() {
        return 0;
    }

    public ContiguousSet<C> subSetImpl(C c, boolean z, C c2, boolean z2) {
        return this;
    }

    public ContiguousSet<C> tailSetImpl(C c, boolean z) {
        return this;
    }

    public String toString() {
        return "[]";
    }

    public Object writeReplace() {
        return new SerializedForm(this.domain, (C15934a) null);
    }

    public C16170f2<C> descendingIterator() {
        return Iterators.C15985b.f35974f;
    }

    public C first() {
        throw new NoSuchElementException();
    }

    public C16170f2<C> iterator() {
        return Iterators.C15985b.f35974f;
    }

    public C last() {
        throw new NoSuchElementException();
    }

    public Range<C> range(BoundType boundType, BoundType boundType2) {
        throw new NoSuchElementException();
    }
}
