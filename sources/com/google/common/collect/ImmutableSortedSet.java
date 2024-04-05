package com.google.common.collect;

import com.google.common.base.C15794l;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class ImmutableSortedSet<E> extends ImmutableSortedSetFauxverideShim<E> implements NavigableSet<E>, C16228u1<E> {
    public final transient Comparator<? super E> comparator;
    @LazyInit
    public transient ImmutableSortedSet<E> descendingSet;

    public static class SerializedForm<E> implements Serializable {
        private static final long serialVersionUID = 0;
        public final Comparator<? super E> comparator;
        public final Object[] elements;

        public SerializedForm(Comparator<? super E> comparator2, Object[] objArr) {
            this.comparator = comparator2;
            this.elements = objArr;
        }

        public Object readResolve() {
            C15981a aVar = new C15981a(this.comparator);
            Object[] objArr = this.elements;
            if (aVar.f35950d != null) {
                for (Object d : objArr) {
                    aVar.mo56784d(d);
                }
            } else {
                C16188j1.m26182a(objArr.length, objArr);
                aVar.mo56634c(aVar.f35899b + objArr.length);
                System.arraycopy(objArr, 0, aVar.f35898a, aVar.f35899b, objArr.length);
                aVar.f35899b += objArr.length;
            }
            return aVar.mo56786f();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSortedSet$a */
    public static final class C15981a<E> extends ImmutableSet.C15974a<E> {

        /* renamed from: f */
        public final Comparator<? super E> f35971f;

        public C15981a(Comparator<? super E> comparator) {
            comparator.getClass();
            this.f35971f = comparator;
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public final ImmutableSet.C15974a mo56784d(Object obj) {
            super.mo56784d(obj);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: e */
        public final ImmutableSet.C15974a mo56785e(Iterator it) {
            throw null;
        }

        @CanIgnoreReturnValue
        /* renamed from: g */
        public final void mo56833g(Iterator it) {
            super.mo56785e(it);
        }

        /* renamed from: h */
        public final ImmutableSortedSet<E> mo56786f() {
            ImmutableSortedSet<E> construct = ImmutableSortedSet.construct(this.f35971f, this.f35899b, this.f35898a);
            this.f35899b = construct.size();
            this.f35900c = true;
            return construct;
        }
    }

    public ImmutableSortedSet(Comparator<? super E> comparator2) {
        this.comparator = comparator2;
    }

    public static <E> ImmutableSortedSet<E> construct(Comparator<? super E> comparator2, int i, E... eArr) {
        if (i == 0) {
            return emptySet(comparator2);
        }
        C16188j1.m26182a(i, eArr);
        Arrays.sort(eArr, 0, i, comparator2);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            E e = eArr[i3];
            if (comparator2.compare(e, eArr[i2 - 1]) != 0) {
                eArr[i2] = e;
                i2++;
            }
        }
        Arrays.fill(eArr, i2, i, (Object) null);
        if (i2 < eArr.length / 2) {
            eArr = Arrays.copyOf(eArr, i2);
        }
        return new RegularImmutableSortedSet(ImmutableList.asImmutableList(eArr, i2), comparator2);
    }

    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> copyOf(E[] eArr) {
        return construct(Ordering.natural(), eArr.length, (Object[]) eArr.clone());
    }

    public static <E> ImmutableSortedSet<E> copyOfSorted(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator2 = sortedSet.comparator();
        if (comparator2 == null) {
            comparator2 = Ordering.natural();
        }
        ImmutableList<E> copyOf = ImmutableList.copyOf(sortedSet);
        return copyOf.isEmpty() ? emptySet(comparator2) : new RegularImmutableSortedSet(copyOf, comparator2);
    }

    public static <E> RegularImmutableSortedSet<E> emptySet(Comparator<? super E> comparator2) {
        return Ordering.natural().equals(comparator2) ? RegularImmutableSortedSet.NATURAL_EMPTY_SET : new RegularImmutableSortedSet<>(ImmutableList.m25826of(), comparator2);
    }

    public static <E extends Comparable<?>> C15981a<E> naturalOrder() {
        return new C15981a<>(Ordering.natural());
    }

    /* renamed from: of */
    public static <E> ImmutableSortedSet<E> m25958of() {
        return RegularImmutableSortedSet.NATURAL_EMPTY_SET;
    }

    public static <E> C15981a<E> orderedBy(Comparator<E> comparator2) {
        return new C15981a<>(comparator2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<?>> C15981a<E> reverseOrder() {
        return new C15981a<>(Collections.reverseOrder());
    }

    public E ceiling(E e) {
        return Iterators.m25981d((String) null, tailSet(e, true).iterator());
    }

    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    public abstract ImmutableSortedSet<E> createDescendingSet();

    public abstract C16170f2<E> descendingIterator();

    public E first() {
        return iterator().next();
    }

    public E floor(E e) {
        return Iterators.m25981d((String) null, headSet(e, true).descendingIterator());
    }

    public abstract ImmutableSortedSet<E> headSetImpl(E e, boolean z);

    public E higher(E e) {
        return Iterators.m25981d((String) null, tailSet(e, false).iterator());
    }

    public abstract int indexOf(@NullableDecl Object obj);

    public abstract C16170f2<E> iterator();

    public E last() {
        return descendingIterator().next();
    }

    public E lower(E e) {
        return Iterators.m25981d((String) null, headSet(e, false).descendingIterator());
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    public abstract ImmutableSortedSet<E> subSetImpl(E e, boolean z, E e2, boolean z2);

    public abstract ImmutableSortedSet<E> tailSetImpl(E e, boolean z);

    public int unsafeCompare(Object obj, Object obj2) {
        return unsafeCompare(this.comparator, obj, obj2);
    }

    public Object writeReplace() {
        return new SerializedForm(this.comparator, toArray());
    }

    public static <E> ImmutableSortedSet<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf(Ordering.natural(), iterable);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m25959of(E e) {
        return new RegularImmutableSortedSet(ImmutableList.m25827of(e), Ordering.natural());
    }

    public static int unsafeCompare(Comparator<?> comparator2, Object obj, Object obj2) {
        return comparator2.compare(obj, obj2);
    }

    public ImmutableSortedSet<E> descendingSet() {
        ImmutableSortedSet<E> immutableSortedSet = this.descendingSet;
        if (immutableSortedSet != null) {
            return immutableSortedSet;
        }
        ImmutableSortedSet<E> createDescendingSet = createDescendingSet();
        this.descendingSet = createDescendingSet;
        createDescendingSet.descendingSet = this;
        return createDescendingSet;
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m25960of(E e, E e2) {
        return construct(Ordering.natural(), 2, e, e2);
    }

    public ImmutableSortedSet<E> headSet(E e) {
        return headSet(e, false);
    }

    public ImmutableSortedSet<E> subSet(E e, E e2) {
        return subSet(e, true, e2, false);
    }

    public ImmutableSortedSet<E> tailSet(E e) {
        return tailSet(e, true);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Collection<? extends E> collection) {
        return copyOf(Ordering.natural(), collection);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m25961of(E e, E e2, E e3) {
        return construct(Ordering.natural(), 3, e, e2, e3);
    }

    public ImmutableSortedSet<E> headSet(E e, boolean z) {
        e.getClass();
        return headSetImpl(e, z);
    }

    public ImmutableSortedSet<E> subSet(E e, boolean z, E e2, boolean z2) {
        e.getClass();
        e2.getClass();
        C15794l.m25613g(this.comparator.compare(e, e2) <= 0);
        return subSetImpl(e, z, e2, z2);
    }

    public ImmutableSortedSet<E> tailSet(E e, boolean z) {
        e.getClass();
        return tailSetImpl(e, z);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m25962of(E e, E e2, E e3, E e4) {
        return construct(Ordering.natural(), 4, e, e2, e3, e4);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Iterator<? extends E> it) {
        return copyOf(Ordering.natural(), it);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m25963of(E e, E e2, E e3, E e4, E e5) {
        return construct(Ordering.natural(), 5, e, e2, e3, e4, e5);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m25964of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        int length = eArr.length + 6;
        Comparable[] comparableArr = new Comparable[length];
        comparableArr[0] = e;
        comparableArr[1] = e2;
        comparableArr[2] = e3;
        comparableArr[3] = e4;
        comparableArr[4] = e5;
        comparableArr[5] = e6;
        System.arraycopy(eArr, 0, comparableArr, 6, eArr.length);
        return construct(Ordering.natural(), length, comparableArr);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator2, Iterator<? extends E> it) {
        C15981a aVar = new C15981a(comparator2);
        aVar.mo56833g(it);
        return aVar.mo56786f();
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator2, Collection<? extends E> collection) {
        return copyOf(comparator2, collection);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Iterable<? extends E>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOf(java.util.Comparator<? super E> r2, java.lang.Iterable<? extends E> r3) {
        /*
            r2.getClass()
            boolean r0 = p514bk.C14088a.m21786n(r3, r2)
            if (r0 == 0) goto L_0x0017
            boolean r0 = r3 instanceof com.google.common.collect.ImmutableSortedSet
            if (r0 == 0) goto L_0x0017
            r0 = r3
            com.google.common.collect.ImmutableSortedSet r0 = (com.google.common.collect.ImmutableSortedSet) r0
            boolean r1 = r0.isPartialView()
            if (r1 != 0) goto L_0x0017
            return r0
        L_0x0017:
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x001e
            java.util.Collection r3 = (java.util.Collection) r3
            goto L_0x0026
        L_0x001e:
            java.util.Iterator r3 = r3.iterator()
            java.util.ArrayList r3 = com.google.common.collect.Lists.m25993b(r3)
        L_0x0026:
            java.lang.Object[] r3 = r3.toArray()
            int r0 = r3.length
            com.google.common.collect.ImmutableSortedSet r2 = construct(r2, r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableSortedSet.copyOf(java.util.Comparator, java.lang.Iterable):com.google.common.collect.ImmutableSortedSet");
    }
}
