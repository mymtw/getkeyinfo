package com.google.common.collect;

import com.google.common.collect.C16178h1;
import com.google.common.collect.Multisets;
import com.google.j2objc.annotations.Weak;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* renamed from: com.google.common.collect.w1 */
public final class C16234w1 {

    /* renamed from: com.google.common.collect.w1$a */
    public static class C16235a<E> extends Multisets.C16065b<E> implements SortedSet<E> {
        @Weak

        /* renamed from: b */
        public final C16231v1<E> f36332b;

        public C16235a(C16231v1<E> v1Var) {
            this.f36332b = v1Var;
        }

        /* renamed from: a */
        public final C16178h1 mo57194a() {
            return this.f36332b;
        }

        public final Comparator<? super E> comparator() {
            return this.f36332b.comparator();
        }

        public final E first() {
            C16178h1.C16179a<E> firstEntry = this.f36332b.firstEntry();
            if (firstEntry != null) {
                return firstEntry.getElement();
            }
            throw new NoSuchElementException();
        }

        public final SortedSet<E> headSet(E e) {
            return this.f36332b.headMultiset(e, BoundType.OPEN).elementSet();
        }

        public final Iterator<E> iterator() {
            return new C16185i1(this.f36332b.entrySet().iterator());
        }

        public final E last() {
            C16178h1.C16179a<E> lastEntry = this.f36332b.lastEntry();
            if (lastEntry != null) {
                return lastEntry.getElement();
            }
            throw new NoSuchElementException();
        }

        public final SortedSet<E> subSet(E e, E e2) {
            return this.f36332b.subMultiset(e, BoundType.CLOSED, e2, BoundType.OPEN).elementSet();
        }

        public final SortedSet<E> tailSet(E e) {
            return this.f36332b.tailMultiset(e, BoundType.CLOSED).elementSet();
        }
    }

    /* renamed from: com.google.common.collect.w1$b */
    public static class C16236b<E> extends C16235a<E> implements NavigableSet<E> {
        public C16236b(C16231v1<E> v1Var) {
            super(v1Var);
        }

        public final E ceiling(E e) {
            return C16234w1.m26258a(this.f36332b.tailMultiset(e, BoundType.CLOSED).firstEntry());
        }

        public final Iterator<E> descendingIterator() {
            return ((C16235a) descendingSet()).iterator();
        }

        public final NavigableSet<E> descendingSet() {
            return new C16236b(this.f36332b.descendingMultiset());
        }

        public final E floor(E e) {
            return C16234w1.m26258a(this.f36332b.headMultiset(e, BoundType.CLOSED).lastEntry());
        }

        public final NavigableSet<E> headSet(E e, boolean z) {
            return new C16236b(this.f36332b.headMultiset(e, BoundType.forBoolean(z)));
        }

        public final E higher(E e) {
            return C16234w1.m26258a(this.f36332b.tailMultiset(e, BoundType.OPEN).firstEntry());
        }

        public final E lower(E e) {
            return C16234w1.m26258a(this.f36332b.headMultiset(e, BoundType.OPEN).lastEntry());
        }

        public final E pollFirst() {
            return C16234w1.m26258a(this.f36332b.pollFirstEntry());
        }

        public final E pollLast() {
            return C16234w1.m26258a(this.f36332b.pollLastEntry());
        }

        public final NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return new C16236b(this.f36332b.subMultiset(e, BoundType.forBoolean(z), e2, BoundType.forBoolean(z2)));
        }

        public final NavigableSet<E> tailSet(E e, boolean z) {
            return new C16236b(this.f36332b.tailMultiset(e, BoundType.forBoolean(z)));
        }
    }

    /* renamed from: a */
    public static Object m26258a(C16178h1.C16179a aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.getElement();
    }
}
