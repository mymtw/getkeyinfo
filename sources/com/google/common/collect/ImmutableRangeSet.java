package com.google.common.collect;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.common.base.C15794l;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Iterators;
import com.google.common.collect.SortedLists;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class ImmutableRangeSet<C extends Comparable> extends C16167f<C> implements Serializable {

    /* renamed from: d */
    public static final ImmutableRangeSet<Comparable<?>> f35938d = new ImmutableRangeSet<>(ImmutableList.m25826of());

    /* renamed from: e */
    public static final ImmutableRangeSet<Comparable<?>> f35939e = new ImmutableRangeSet<>(ImmutableList.m25827of(Range.all()));

    /* renamed from: b */
    public final transient ImmutableList<Range<C>> f35940b;
    @LazyInit

    /* renamed from: c */
    public transient ImmutableRangeSet<C> f35941c;

    public final class AsSet extends ImmutableSortedSet<C> {
        @MonotonicNonNullDecl

        /* renamed from: d */
        public transient Integer f35942d;
        /* access modifiers changed from: private */
        public final DiscreteDomain<C> domain;

        /* renamed from: com.google.common.collect.ImmutableRangeSet$AsSet$a */
        public class C15971a extends AbstractIterator<C> {

            /* renamed from: d */
            public final C16170f2 f35943d;

            /* renamed from: e */
            public C16170f2 f35944e = Iterators.C15985b.f35974f;

            public C15971a() {
                this.f35943d = ImmutableRangeSet.this.f35940b.iterator();
            }

            /* renamed from: a */
            public final Object mo56053a() {
                while (!this.f35944e.hasNext()) {
                    if (this.f35943d.hasNext()) {
                        this.f35944e = ContiguousSet.create((Range) this.f35943d.next(), AsSet.this.domain).iterator();
                    } else {
                        this.f35745b = AbstractIterator.State.DONE;
                        return null;
                    }
                }
                return (Comparable) this.f35944e.next();
            }
        }

        /* renamed from: com.google.common.collect.ImmutableRangeSet$AsSet$b */
        public class C15972b extends AbstractIterator<C> {

            /* renamed from: d */
            public final C16170f2 f35946d;

            /* renamed from: e */
            public C16170f2 f35947e = Iterators.C15985b.f35974f;

            public C15972b() {
                this.f35946d = ImmutableRangeSet.this.f35940b.reverse().iterator();
            }

            /* renamed from: a */
            public final Object mo56053a() {
                while (!this.f35947e.hasNext()) {
                    if (this.f35946d.hasNext()) {
                        this.f35947e = ContiguousSet.create((Range) this.f35946d.next(), AsSet.this.domain).descendingIterator();
                    } else {
                        this.f35745b = AbstractIterator.State.DONE;
                        return null;
                    }
                }
                return (Comparable) this.f35947e.next();
            }
        }

        public AsSet(DiscreteDomain<C> discreteDomain) {
            super(Ordering.natural());
            this.domain = discreteDomain;
        }

        public boolean contains(@NullableDecl Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                return ImmutableRangeSet.this.contains((Comparable) obj);
            } catch (ClassCastException unused) {
                return false;
            }
        }

        public ImmutableSortedSet<C> createDescendingSet() {
            return new DescendingImmutableSortedSet(this);
        }

        public int indexOf(Object obj) {
            if (!contains(obj)) {
                return -1;
            }
            Comparable comparable = (Comparable) obj;
            long j = 0;
            C16170f2 it = ImmutableRangeSet.this.f35940b.iterator();
            while (it.hasNext()) {
                Range range = (Range) it.next();
                if (range.contains(comparable)) {
                    return Ints.m26384b(j + ((long) ContiguousSet.create(range, this.domain).indexOf(comparable)));
                }
                j += (long) ContiguousSet.create(range, this.domain).size();
            }
            throw new AssertionError("impossible");
        }

        public boolean isPartialView() {
            return ImmutableRangeSet.this.f35940b.isPartialView();
        }

        public int size() {
            Integer num = this.f35942d;
            if (num == null) {
                long j = 0;
                C16170f2 it = ImmutableRangeSet.this.f35940b.iterator();
                while (it.hasNext()) {
                    j += (long) ContiguousSet.create((Range) it.next(), this.domain).size();
                    if (j >= ParserMinimalBase.MAX_INT_L) {
                        break;
                    }
                }
                num = Integer.valueOf(Ints.m26384b(j));
                this.f35942d = num;
            }
            return num.intValue();
        }

        public ImmutableSortedSet<C> subSet(Range<C> range) {
            return ImmutableRangeSet.this.subRangeSet(range).asSet(this.domain);
        }

        public String toString() {
            return ImmutableRangeSet.this.f35940b.toString();
        }

        public Object writeReplace() {
            return new AsSetSerializedForm(ImmutableRangeSet.this.f35940b, this.domain);
        }

        public C16170f2<C> descendingIterator() {
            return new C15972b();
        }

        public ImmutableSortedSet<C> headSetImpl(C c, boolean z) {
            return subSet(Range.upTo(c, BoundType.forBoolean(z)));
        }

        public C16170f2<C> iterator() {
            return new C15971a();
        }

        public ImmutableSortedSet<C> subSetImpl(C c, boolean z, C c2, boolean z2) {
            if (z || z2 || Range.compareOrThrow(c, c2) != 0) {
                return subSet(Range.range(c, BoundType.forBoolean(z), c2, BoundType.forBoolean(z2)));
            }
            return ImmutableSortedSet.m25958of();
        }

        public ImmutableSortedSet<C> tailSetImpl(C c, boolean z) {
            return subSet(Range.downTo(c, BoundType.forBoolean(z)));
        }
    }

    public static class AsSetSerializedForm<C extends Comparable> implements Serializable {
        private final DiscreteDomain<C> domain;
        private final ImmutableList<Range<C>> ranges;

        public AsSetSerializedForm(ImmutableList<Range<C>> immutableList, DiscreteDomain<C> discreteDomain) {
            this.ranges = immutableList;
            this.domain = discreteDomain;
        }

        public Object readResolve() {
            return new ImmutableRangeSet(this.ranges).asSet(this.domain);
        }
    }

    public final class ComplementRanges extends ImmutableList<Range<C>> {
        private final boolean positiveBoundedAbove;
        private final boolean positiveBoundedBelow;
        private final int size;

        public ComplementRanges() {
            boolean hasLowerBound = ((Range) ImmutableRangeSet.this.f35940b.get(0)).hasLowerBound();
            this.positiveBoundedBelow = hasLowerBound;
            boolean hasUpperBound = ((Range) C16201n0.m26211b(ImmutableRangeSet.this.f35940b)).hasUpperBound();
            this.positiveBoundedAbove = hasUpperBound;
            int size2 = ImmutableRangeSet.this.f35940b.size() - 1;
            size2 = hasLowerBound ? size2 + 1 : size2;
            this.size = hasUpperBound ? size2 + 1 : size2;
        }

        public boolean isPartialView() {
            return true;
        }

        public int size() {
            return this.size;
        }

        public Range<C> get(int i) {
            Cut<C> cut;
            Cut<C> cut2;
            C15794l.m25616j(i, this.size);
            if (this.positiveBoundedBelow) {
                cut = i == 0 ? Cut.belowAll() : ((Range) ImmutableRangeSet.this.f35940b.get(i - 1)).upperBound;
            } else {
                cut = ((Range) ImmutableRangeSet.this.f35940b.get(i)).upperBound;
            }
            if (!this.positiveBoundedAbove || i != this.size - 1) {
                cut2 = ((Range) ImmutableRangeSet.this.f35940b.get(i + (this.positiveBoundedBelow ^ true ? 1 : 0))).lowerBound;
            } else {
                cut2 = Cut.aboveAll();
            }
            return Range.create(cut, cut2);
        }
    }

    public static final class SerializedForm<C extends Comparable> implements Serializable {
        private final ImmutableList<Range<C>> ranges;

        public SerializedForm(ImmutableList<Range<C>> immutableList) {
            this.ranges = immutableList;
        }

        public Object readResolve() {
            return this.ranges.isEmpty() ? ImmutableRangeSet.m25889of() : this.ranges.equals(ImmutableList.m25827of(Range.all())) ? ImmutableRangeSet.all() : new ImmutableRangeSet(this.ranges);
        }
    }

    /* renamed from: com.google.common.collect.ImmutableRangeSet$a */
    public static class C15973a<C extends Comparable<?>> {
        public C15973a() {
            new ArrayList();
        }
    }

    public ImmutableRangeSet(ImmutableList<Range<C>> immutableList) {
        this.f35940b = immutableList;
    }

    public static <C extends Comparable> ImmutableRangeSet<C> all() {
        return f35939e;
    }

    public static <C extends Comparable<?>> C15973a<C> builder() {
        return new C15973a<>();
    }

    public static <C extends Comparable<?>> ImmutableRangeSet<C> copyOf(Iterable<Range<C>> iterable) {
        ArrayList arrayList = new ArrayList();
        for (Range next : iterable) {
            C15794l.m25612f(next, "range must not be empty, but was %s", true ^ next.isEmpty());
            arrayList.add(next);
        }
        int size = arrayList.size();
        C16203o.m26215b(size, "initialCapacity");
        Object[] objArr = new Object[size];
        Collections.sort(arrayList, Range.rangeLexOrdering());
        Iterators.C15988e e = Iterators.m25982e(arrayList.iterator());
        int i = 0;
        while (e.hasNext()) {
            Range range = (Range) e.next();
            while (e.hasNext()) {
                Range range2 = (Range) e.peek();
                if (!range.isConnected(range2)) {
                    break;
                }
                C15794l.m25611e(range, "Overlapping ranges not permitted but found %s overlapping %s", range2, range.intersection(range2).isEmpty());
                range = range.span((Range) e.next());
            }
            range.getClass();
            int i2 = i + 1;
            if (objArr.length < i2) {
                objArr = Arrays.copyOf(objArr, ImmutableCollection.C15950b.m25825a(objArr.length, i2));
            }
            objArr[i] = range;
            i = i2;
        }
        ImmutableList asImmutableList = ImmutableList.asImmutableList(objArr, i);
        if (asImmutableList.isEmpty()) {
            return m25889of();
        }
        if (asImmutableList.size() != 1 || !((Range) C16201n0.m26212c(asImmutableList)).equals(Range.all())) {
            return new ImmutableRangeSet<>(asImmutableList);
        }
        return all();
    }

    /* renamed from: of */
    public static <C extends Comparable> ImmutableRangeSet<C> m25889of() {
        return f35938d;
    }

    public static <C extends Comparable<?>> ImmutableRangeSet<C> unionOf(Iterable<Range<C>> iterable) {
        return copyOf(TreeRangeSet.create(iterable));
    }

    @Deprecated
    public void add(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public void addAll(C16205o1<C> o1Var) {
        throw new UnsupportedOperationException();
    }

    public ImmutableSortedSet<C> asSet(DiscreteDomain<C> discreteDomain) {
        discreteDomain.getClass();
        if (isEmpty()) {
            return ImmutableSortedSet.m25958of();
        }
        Range<C> canonical = span().canonical(discreteDomain);
        if (canonical.hasLowerBound()) {
            if (!canonical.hasUpperBound()) {
                try {
                    discreteDomain.maxValue();
                } catch (NoSuchElementException unused) {
                    throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded above");
                }
            }
            return new AsSet(discreteDomain);
        }
        throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded below");
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return super.contains(comparable);
    }

    public ImmutableRangeSet<C> difference(C16205o1<C> o1Var) {
        TreeRangeSet create = TreeRangeSet.create(this);
        create.removeAll(o1Var);
        return copyOf(create);
    }

    public boolean encloses(Range<C> range) {
        int b = SortedLists.m26098b(this.f35940b, Range.lowerBoundFn(), range.lowerBound, Ordering.natural(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        return b != -1 && this.f35940b.get(b).encloses(range);
    }

    public /* bridge */ /* synthetic */ boolean enclosesAll(C16205o1 o1Var) {
        return super.enclosesAll(o1Var);
    }

    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    public ImmutableRangeSet<C> intersection(C16205o1<C> o1Var) {
        TreeRangeSet create = TreeRangeSet.create(this);
        create.removeAll(o1Var.complement());
        return copyOf(create);
    }

    public boolean intersects(Range<C> range) {
        int b = SortedLists.m26098b(this.f35940b, Range.lowerBoundFn(), range.lowerBound, Ordering.natural(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
        if (b < this.f35940b.size() && this.f35940b.get(b).isConnected(range) && !this.f35940b.get(b).intersection(range).isEmpty()) {
            return true;
        }
        if (b > 0) {
            int i = b - 1;
            return this.f35940b.get(i).isConnected(range) && !this.f35940b.get(i).intersection(range).isEmpty();
        }
    }

    public boolean isEmpty() {
        return this.f35940b.isEmpty();
    }

    public boolean isPartialView() {
        return this.f35940b.isPartialView();
    }

    public Range<C> rangeContaining(C c) {
        int b = SortedLists.m26098b(this.f35940b, Range.lowerBoundFn(), Cut.belowValue(c), Ordering.natural(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (b != -1) {
            Range<C> range = this.f35940b.get(b);
            if (range.contains(c)) {
                return range;
            }
        }
        return null;
    }

    @Deprecated
    public void remove(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public void removeAll(C16205o1<C> o1Var) {
        throw new UnsupportedOperationException();
    }

    public Range<C> span() {
        if (!this.f35940b.isEmpty()) {
            Cut<C> cut = this.f35940b.get(0).lowerBound;
            ImmutableList<Range<C>> immutableList = this.f35940b;
            return Range.create(cut, immutableList.get(immutableList.size() - 1).upperBound);
        }
        throw new NoSuchElementException();
    }

    public ImmutableRangeSet<C> union(C16205o1<C> o1Var) {
        Iterable[] iterableArr = {asRanges(), o1Var.asRanges()};
        for (int i = 0; i < 2; i++) {
            iterableArr[i].getClass();
        }
        return unionOf(new C16225u(iterableArr));
    }

    public Object writeReplace() {
        return new SerializedForm(this.f35940b);
    }

    /* renamed from: of */
    public static <C extends Comparable> ImmutableRangeSet<C> m25890of(Range<C> range) {
        range.getClass();
        if (range.isEmpty()) {
            return m25889of();
        }
        if (range.equals(Range.all())) {
            return all();
        }
        return new ImmutableRangeSet<>(ImmutableList.m25827of(range));
    }

    @Deprecated
    public void addAll(Iterable<Range<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    public ImmutableSet<Range<C>> asDescendingSetOfRanges() {
        if (this.f35940b.isEmpty()) {
            return ImmutableSet.m25894of();
        }
        return new RegularImmutableSortedSet(this.f35940b.reverse(), Range.rangeLexOrdering().reverse());
    }

    public ImmutableSet<Range<C>> asRanges() {
        if (this.f35940b.isEmpty()) {
            return ImmutableSet.m25894of();
        }
        return new RegularImmutableSortedSet(this.f35940b, Range.rangeLexOrdering());
    }

    public ImmutableRangeSet<C> complement() {
        ImmutableRangeSet<C> immutableRangeSet = this.f35941c;
        if (immutableRangeSet != null) {
            return immutableRangeSet;
        }
        if (this.f35940b.isEmpty()) {
            ImmutableRangeSet<C> all = all();
            this.f35941c = all;
            return all;
        } else if (this.f35940b.size() != 1 || !this.f35940b.get(0).equals(Range.all())) {
            ImmutableRangeSet<C> immutableRangeSet2 = new ImmutableRangeSet<>(new ComplementRanges(), this);
            this.f35941c = immutableRangeSet2;
            return immutableRangeSet2;
        } else {
            ImmutableRangeSet<C> of = m25889of();
            this.f35941c = of;
            return of;
        }
    }

    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
        return super.enclosesAll(iterable);
    }

    @Deprecated
    public void removeAll(Iterable<Range<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    public ImmutableRangeSet<C> subRangeSet(final Range<C> range) {
        ImmutableList<Range<C>> immutableList;
        int i;
        if (!isEmpty()) {
            Range span = span();
            if (range.encloses(span)) {
                return this;
            }
            if (range.isConnected(span)) {
                if (this.f35940b.isEmpty() || range.isEmpty()) {
                    immutableList = ImmutableList.m25826of();
                } else if (range.encloses(span())) {
                    immutableList = this.f35940b;
                } else {
                    final int a = range.hasLowerBound() ? SortedLists.m26097a(this.f35940b, Range.upperBoundFn(), range.lowerBound, SortedLists.KeyPresentBehavior.FIRST_AFTER, SortedLists.KeyAbsentBehavior.NEXT_HIGHER) : 0;
                    if (range.hasUpperBound()) {
                        i = SortedLists.m26097a(this.f35940b, Range.lowerBoundFn(), range.upperBound, SortedLists.KeyPresentBehavior.FIRST_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
                    } else {
                        i = this.f35940b.size();
                    }
                    final int i2 = i - a;
                    if (i2 == 0) {
                        immutableList = ImmutableList.m25826of();
                    } else {
                        immutableList = new ImmutableList<Range<Comparable>>() {
                            public boolean isPartialView() {
                                return true;
                            }

                            public int size() {
                                return i2;
                            }

                            public Range<Comparable> get(int i) {
                                C15794l.m25616j(i, i2);
                                if (i == 0 || i == i2 - 1) {
                                    return ((Range) ImmutableRangeSet.this.f35940b.get(i + a)).intersection(range);
                                }
                                return (Range) ImmutableRangeSet.this.f35940b.get(i + a);
                            }
                        };
                    }
                }
                return new ImmutableRangeSet<>(immutableList);
            }
        }
        return m25889of();
    }

    public ImmutableRangeSet(ImmutableList<Range<C>> immutableList, ImmutableRangeSet<C> immutableRangeSet) {
        this.f35940b = immutableList;
        this.f35941c = immutableRangeSet;
    }

    public static <C extends Comparable> ImmutableRangeSet<C> copyOf(C16205o1<C> o1Var) {
        o1Var.getClass();
        if (o1Var.isEmpty()) {
            return m25889of();
        }
        if (o1Var.encloses(Range.all())) {
            return all();
        }
        if (o1Var instanceof ImmutableRangeSet) {
            ImmutableRangeSet<C> immutableRangeSet = (ImmutableRangeSet) o1Var;
            if (!immutableRangeSet.isPartialView()) {
                return immutableRangeSet;
            }
        }
        return new ImmutableRangeSet<>(ImmutableList.copyOf(o1Var.asRanges()));
    }
}
