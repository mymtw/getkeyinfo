package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class Sets {

    /* renamed from: com.google.common.collect.Sets$a */
    public static abstract class C16082a<E> extends AbstractSet<E> {
        public boolean removeAll(Collection<?> collection) {
            return Sets.m26094d(this, collection);
        }

        public boolean retainAll(Collection<?> collection) {
            collection.getClass();
            return super.retainAll(collection);
        }
    }

    /* renamed from: com.google.common.collect.Sets$b */
    public static abstract class C16083b<E> extends AbstractSet<E> {
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @CanIgnoreReturnValue
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @CanIgnoreReturnValue
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @CanIgnoreReturnValue
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @CanIgnoreReturnValue
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public static boolean m26091a(Set<?> set, @NullableDecl Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static int m26092b(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* renamed from: c */
    public static C16224t1 m26093c(ImmutableSet immutableSet, ImmutableSet immutableSet2) {
        if (immutableSet == null) {
            throw new NullPointerException("set1");
        } else if (immutableSet2 != null) {
            return new C16224t1(immutableSet, immutableSet2);
        } else {
            throw new NullPointerException("set2");
        }
    }

    /* renamed from: d */
    public static boolean m26094d(Set<?> set, Collection<?> collection) {
        collection.getClass();
        if (collection instanceof C16178h1) {
            collection = ((C16178h1) collection).elementSet();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? m26095e(set, collection.iterator()) : Iterators.m25984g(collection, set.iterator());
    }

    /* renamed from: e */
    public static boolean m26095e(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    /* renamed from: f */
    public static <E> NavigableSet<E> m26096f(NavigableSet<E> navigableSet) {
        return ((navigableSet instanceof ImmutableCollection) || (navigableSet instanceof UnmodifiableNavigableSet)) ? navigableSet : new UnmodifiableNavigableSet(navigableSet);
    }

    public static final class UnmodifiableNavigableSet<E> extends C16172g0<E> implements NavigableSet<E>, Serializable {
        private static final long serialVersionUID = 0;
        @MonotonicNonNullDecl

        /* renamed from: b */
        public transient UnmodifiableNavigableSet<E> f36144b;
        private final NavigableSet<E> delegate;
        private final SortedSet<E> unmodifiableDelegate;

        public UnmodifiableNavigableSet(NavigableSet<E> navigableSet) {
            navigableSet.getClass();
            this.delegate = navigableSet;
            this.unmodifiableDelegate = Collections.unmodifiableSortedSet(navigableSet);
        }

        public E ceiling(E e) {
            return this.delegate.ceiling(e);
        }

        public Iterator<E> descendingIterator() {
            return Iterators.m25986i(this.delegate.descendingIterator());
        }

        public NavigableSet<E> descendingSet() {
            UnmodifiableNavigableSet<E> unmodifiableNavigableSet = this.f36144b;
            if (unmodifiableNavigableSet != null) {
                return unmodifiableNavigableSet;
            }
            UnmodifiableNavigableSet<E> unmodifiableNavigableSet2 = new UnmodifiableNavigableSet<>(this.delegate.descendingSet());
            this.f36144b = unmodifiableNavigableSet2;
            unmodifiableNavigableSet2.f36144b = this;
            return unmodifiableNavigableSet2;
        }

        public E floor(E e) {
            return this.delegate.floor(e);
        }

        public NavigableSet<E> headSet(E e, boolean z) {
            return Sets.m26096f(this.delegate.headSet(e, z));
        }

        public E higher(E e) {
            return this.delegate.higher(e);
        }

        public E lower(E e) {
            return this.delegate.lower(e);
        }

        public E pollFirst() {
            throw new UnsupportedOperationException();
        }

        public E pollLast() {
            throw new UnsupportedOperationException();
        }

        public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return Sets.m26096f(this.delegate.subSet(e, z, e2, z2));
        }

        public NavigableSet<E> tailSet(E e, boolean z) {
            return Sets.m26096f(this.delegate.tailSet(e, z));
        }

        public SortedSet<E> delegate() {
            return this.unmodifiableDelegate;
        }
    }
}
