package com.google.common.collect;

import com.google.common.base.C15794l;
import com.google.common.collect.C16178h1;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class ImmutableSortedMultiset<E> extends ImmutableSortedMultisetFauxverideShim<E> implements C16231v1<E> {
    @LazyInit
    public transient ImmutableSortedMultiset<E> descendingMultiset;

    public static final class SerializedForm<E> implements Serializable {
        public final Comparator<? super E> comparator;
        public final int[] counts;
        public final E[] elements;

        public SerializedForm(C16231v1<E> v1Var) {
            this.comparator = v1Var.comparator();
            int size = v1Var.entrySet().size();
            this.elements = new Object[size];
            this.counts = new int[size];
            int i = 0;
            for (C16178h1.C16179a next : v1Var.entrySet()) {
                this.elements[i] = next.getElement();
                this.counts[i] = next.getCount();
                i++;
            }
        }

        public Object readResolve() {
            int length = this.elements.length;
            C15980a aVar = new C15980a(this.comparator);
            for (int i = 0; i < length; i++) {
                aVar.mo56826h(this.counts[i], this.elements[i]);
            }
            return aVar.mo56725f();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSortedMultiset$a */
    public static class C15980a<E> extends ImmutableMultiset.C15966b<E> {

        /* renamed from: c */
        public final Comparator<? super E> f35966c;

        /* renamed from: d */
        public E[] f35967d = new Object[4];

        /* renamed from: e */
        public int[] f35968e = new int[4];

        /* renamed from: f */
        public int f35969f;

        /* renamed from: g */
        public boolean f35970g;

        public C15980a(Comparator<? super E> comparator) {
            super((Object) null);
            comparator.getClass();
            this.f35966c = comparator;
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public final ImmutableCollection.C15950b mo56721b(Object obj) {
            mo56826h(1, obj);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public final ImmutableMultiset.C15966b mo56722c(Object obj) {
            mo56826h(1, obj);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public final ImmutableMultiset.C15966b mo56723d(Object[] objArr) {
            for (Object h : objArr) {
                mo56826h(1, h);
            }
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: e */
        public final /* bridge */ /* synthetic */ ImmutableMultiset.C15966b mo56724e(int i, Object obj) {
            mo56826h(i, obj);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: g */
        public final void mo56825g(Iterable iterable) {
            if (iterable instanceof C16178h1) {
                for (C16178h1.C16179a aVar : ((C16178h1) iterable).entrySet()) {
                    mo56826h(aVar.getCount(), aVar.getElement());
                }
                return;
            }
            for (Object h : iterable) {
                mo56826h(1, h);
            }
        }

        @CanIgnoreReturnValue
        /* renamed from: h */
        public final void mo56826h(int i, Object obj) {
            obj.getClass();
            C16203o.m26215b(i, "occurrences");
            if (i != 0) {
                int i2 = this.f35969f;
                E[] eArr = this.f35967d;
                if (i2 == eArr.length) {
                    mo56828j(true);
                } else if (this.f35970g) {
                    this.f35967d = Arrays.copyOf(eArr, eArr.length);
                }
                this.f35970g = false;
                E[] eArr2 = this.f35967d;
                int i3 = this.f35969f;
                eArr2[i3] = obj;
                this.f35968e[i3] = i;
                this.f35969f = i3 + 1;
            }
        }

        /* renamed from: i */
        public final ImmutableSortedMultiset<E> mo56725f() {
            int i;
            mo56828j(false);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                i = this.f35969f;
                if (i2 >= i) {
                    break;
                }
                int[] iArr = this.f35968e;
                int i4 = iArr[i2];
                if (i4 > 0) {
                    E[] eArr = this.f35967d;
                    eArr[i3] = eArr[i2];
                    iArr[i3] = i4;
                    i3++;
                }
                i2++;
            }
            Arrays.fill(this.f35967d, i3, i, (Object) null);
            Arrays.fill(this.f35968e, i3, this.f35969f, 0);
            this.f35969f = i3;
            if (i3 == 0) {
                return ImmutableSortedMultiset.emptyMultiset(this.f35966c);
            }
            RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) ImmutableSortedSet.construct(this.f35966c, i3, this.f35967d);
            long[] jArr = new long[(this.f35969f + 1)];
            int i5 = 0;
            while (i5 < this.f35969f) {
                int i6 = i5 + 1;
                jArr[i6] = jArr[i5] + ((long) this.f35968e[i5]);
                i5 = i6;
            }
            this.f35970g = true;
            return new RegularImmutableSortedMultiset(regularImmutableSortedSet, jArr, 0, this.f35969f);
        }

        /* renamed from: j */
        public final void mo56828j(boolean z) {
            int i = this.f35969f;
            if (i != 0) {
                E[] copyOf = Arrays.copyOf(this.f35967d, i);
                Arrays.sort(copyOf, this.f35966c);
                int i2 = 1;
                for (int i3 = 1; i3 < copyOf.length; i3++) {
                    if (this.f35966c.compare(copyOf[i2 - 1], copyOf[i3]) < 0) {
                        copyOf[i2] = copyOf[i3];
                        i2++;
                    }
                }
                Arrays.fill(copyOf, i2, this.f35969f, (Object) null);
                if (z) {
                    int i4 = i2 * 4;
                    int i5 = this.f35969f;
                    if (i4 > i5 * 3) {
                        copyOf = Arrays.copyOf(copyOf, Ints.m26384b(((long) i5) + ((long) ((i5 / 2) + 1))));
                    }
                }
                int[] iArr = new int[copyOf.length];
                for (int i6 = 0; i6 < this.f35969f; i6++) {
                    int binarySearch = Arrays.binarySearch(copyOf, 0, i2, this.f35967d[i6], this.f35966c);
                    int i7 = this.f35968e[i6];
                    if (i7 >= 0) {
                        iArr[binarySearch] = iArr[binarySearch] + i7;
                    } else {
                        iArr[binarySearch] = ~i7;
                    }
                }
                this.f35967d = copyOf;
                this.f35968e = iArr;
                this.f35969f = i2;
            }
        }
    }

    /* renamed from: c */
    public static ImmutableSortedMultiset m25935c(Comparator comparator, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return emptyMultiset(comparator);
        }
        int size = abstractCollection.size();
        C16203o.m26215b(size, "initialCapacity");
        Object[] objArr = new Object[size];
        long[] jArr = new long[(abstractCollection.size() + 1)];
        Iterator it = abstractCollection.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            C16178h1.C16179a aVar = (C16178h1.C16179a) it.next();
            Object element = aVar.getElement();
            element.getClass();
            int i3 = i + 1;
            if (objArr.length < i3) {
                objArr = Arrays.copyOf(objArr, ImmutableCollection.C15950b.m25825a(objArr.length, i3));
            }
            objArr[i] = element;
            int i4 = i2 + 1;
            jArr[i4] = jArr[i2] + ((long) aVar.getCount());
            i2 = i4;
            i = i3;
        }
        return new RegularImmutableSortedMultiset(new RegularImmutableSortedSet(ImmutableList.asImmutableList(objArr, i), comparator), jArr, 0, abstractCollection.size());
    }

    public static <E extends Comparable<? super E>> ImmutableSortedMultiset<E> copyOf(E[] eArr) {
        return copyOf(Ordering.natural(), Arrays.asList(eArr));
    }

    public static <E> ImmutableSortedMultiset<E> copyOfSorted(C16231v1<E> v1Var) {
        return m25935c(v1Var.comparator(), Lists.m25992a(v1Var.entrySet()));
    }

    public static <E> ImmutableSortedMultiset<E> emptyMultiset(Comparator<? super E> comparator) {
        return Ordering.natural().equals(comparator) ? RegularImmutableSortedMultiset.NATURAL_EMPTY_MULTISET : new RegularImmutableSortedMultiset(comparator);
    }

    public static <E extends Comparable<?>> C15980a<E> naturalOrder() {
        return new C15980a<>(Ordering.natural());
    }

    /* renamed from: of */
    public static <E> ImmutableSortedMultiset<E> m25936of() {
        return RegularImmutableSortedMultiset.NATURAL_EMPTY_MULTISET;
    }

    public static <E> C15980a<E> orderedBy(Comparator<E> comparator) {
        return new C15980a<>(comparator);
    }

    public static <E extends Comparable<?>> C15980a<E> reverseOrder() {
        return new C15980a<>(Ordering.natural().reverse());
    }

    public final Comparator<? super E> comparator() {
        return elementSet().comparator();
    }

    public abstract /* synthetic */ int count(@NullableDecl @CompatibleWith("E") Object obj);

    public abstract ImmutableSortedSet<E> elementSet();

    public abstract /* synthetic */ C16178h1.C16179a<E> firstEntry();

    public abstract ImmutableSortedMultiset<E> headMultiset(E e, BoundType boundType);

    public abstract /* synthetic */ C16178h1.C16179a<E> lastEntry();

    @CanIgnoreReturnValue
    @Deprecated
    public final C16178h1.C16179a<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final C16178h1.C16179a<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    public abstract ImmutableSortedMultiset<E> tailMultiset(E e, BoundType boundType);

    public Object writeReplace() {
        return new SerializedForm(this);
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf(Ordering.natural(), iterable);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedMultiset<E> m25937of(E e) {
        return new RegularImmutableSortedMultiset((RegularImmutableSortedSet) ImmutableSortedSet.m25959of(e), new long[]{0, 1}, 0, 1);
    }

    public ImmutableSortedMultiset<E> descendingMultiset() {
        ImmutableSortedMultiset<E> immutableSortedMultiset = this.descendingMultiset;
        if (immutableSortedMultiset == null) {
            immutableSortedMultiset = isEmpty() ? emptyMultiset(Ordering.from(comparator()).reverse()) : new DescendingImmutableSortedMultiset<>(this);
            this.descendingMultiset = immutableSortedMultiset;
        }
        return immutableSortedMultiset;
    }

    public ImmutableSortedMultiset<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2) {
        C15794l.m25611e(e, "Expected lowerBound <= upperBound but %s > %s", e2, comparator().compare(e, e2) <= 0);
        return tailMultiset(e, boundType).headMultiset(e2, boundType2);
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Iterator<? extends E> it) {
        return copyOf(Ordering.natural(), it);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedMultiset<E> m25938of(E e, E e2) {
        return copyOf(Ordering.natural(), Arrays.asList(new Comparable[]{e, e2}));
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableSortedMultiset) {
            ImmutableSortedMultiset<E> immutableSortedMultiset = (ImmutableSortedMultiset) iterable;
            if (comparator.equals(immutableSortedMultiset.comparator())) {
                return immutableSortedMultiset.isPartialView() ? m25935c(comparator, immutableSortedMultiset.entrySet().asList()) : immutableSortedMultiset;
            }
        }
        C15980a aVar = new C15980a(comparator);
        aVar.mo56825g(iterable);
        return aVar.mo56725f();
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedMultiset<E> m25939of(E e, E e2, E e3) {
        return copyOf(Ordering.natural(), Arrays.asList(new Comparable[]{e, e2, e3}));
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedMultiset<E> m25940of(E e, E e2, E e3, E e4) {
        return copyOf(Ordering.natural(), Arrays.asList(new Comparable[]{e, e2, e3, e4}));
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedMultiset<E> m25941of(E e, E e2, E e3, E e4, E e5) {
        return copyOf(Ordering.natural(), Arrays.asList(new Comparable[]{e, e2, e3, e4, e5}));
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedMultiset<E> m25942of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        int length = eArr.length + 6;
        C16203o.m26215b(length, "initialArraySize");
        ArrayList arrayList = new ArrayList(length);
        Collections.addAll(arrayList, new Comparable[]{e, e2, e3, e4, e5, e6});
        Collections.addAll(arrayList, eArr);
        return copyOf(Ordering.natural(), arrayList);
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Comparator<? super E> comparator, Iterator<? extends E> it) {
        comparator.getClass();
        C15980a aVar = new C15980a(comparator);
        while (it.hasNext()) {
            aVar.mo56826h(1, it.next());
        }
        return aVar.mo56725f();
    }
}
