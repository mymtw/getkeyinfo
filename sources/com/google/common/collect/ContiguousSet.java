package com.google.common.collect;

import com.google.common.base.C15794l;
import com.google.common.collect.ImmutableSortedSet;
import java.lang.Comparable;
import java.util.NoSuchElementException;

public abstract class ContiguousSet<C extends Comparable> extends ImmutableSortedSet<C> {
    public final DiscreteDomain<C> domain;

    public ContiguousSet(DiscreteDomain<C> discreteDomain) {
        super(Ordering.natural());
        this.domain = discreteDomain;
    }

    @Deprecated
    public static <E> ImmutableSortedSet.C15981a<E> builder() {
        throw new UnsupportedOperationException();
    }

    public static ContiguousSet<Integer> closed(int i, int i2) {
        return create(Range.closed(Integer.valueOf(i), Integer.valueOf(i2)), DiscreteDomain.integers());
    }

    public static ContiguousSet<Integer> closedOpen(int i, int i2) {
        return create(Range.closedOpen(Integer.valueOf(i), Integer.valueOf(i2)), DiscreteDomain.integers());
    }

    public static <C extends Comparable> ContiguousSet<C> create(Range<C> range, DiscreteDomain<C> discreteDomain) {
        range.getClass();
        discreteDomain.getClass();
        try {
            Range<C> intersection = !range.hasLowerBound() ? range.intersection(Range.atLeast(discreteDomain.minValue())) : range;
            if (!range.hasUpperBound()) {
                intersection = intersection.intersection(Range.atMost(discreteDomain.maxValue()));
            }
            return intersection.isEmpty() || Range.compareOrThrow(range.lowerBound.leastValueAbove(discreteDomain), range.upperBound.greatestValueBelow(discreteDomain)) > 0 ? new EmptyContiguousSet(discreteDomain) : new RegularContiguousSet(intersection, discreteDomain);
        } catch (NoSuchElementException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public ImmutableSortedSet<C> createDescendingSet() {
        return new DescendingImmutableSortedSet(this);
    }

    public abstract ContiguousSet<C> headSetImpl(C c, boolean z);

    public abstract ContiguousSet<C> intersection(ContiguousSet<C> contiguousSet);

    public abstract Range<C> range();

    public abstract Range<C> range(BoundType boundType, BoundType boundType2);

    public abstract ContiguousSet<C> subSetImpl(C c, boolean z, C c2, boolean z2);

    public abstract ContiguousSet<C> tailSetImpl(C c, boolean z);

    public String toString() {
        return range().toString();
    }

    public static ContiguousSet<Long> closed(long j, long j2) {
        return create(Range.closed(Long.valueOf(j), Long.valueOf(j2)), DiscreteDomain.longs());
    }

    public static ContiguousSet<Long> closedOpen(long j, long j2) {
        return create(Range.closedOpen(Long.valueOf(j), Long.valueOf(j2)), DiscreteDomain.longs());
    }

    public ContiguousSet<C> headSet(C c) {
        c.getClass();
        return headSetImpl(c, false);
    }

    public ContiguousSet<C> subSet(C c, C c2) {
        c.getClass();
        c2.getClass();
        C15794l.m25613g(comparator().compare(c, c2) <= 0);
        return subSetImpl(c, true, c2, false);
    }

    public ContiguousSet<C> tailSet(C c) {
        c.getClass();
        return tailSetImpl(c, true);
    }

    public ContiguousSet<C> headSet(C c, boolean z) {
        c.getClass();
        return headSetImpl(c, z);
    }

    public ContiguousSet<C> tailSet(C c, boolean z) {
        c.getClass();
        return tailSetImpl(c, z);
    }

    public ContiguousSet<C> subSet(C c, boolean z, C c2, boolean z2) {
        c.getClass();
        c2.getClass();
        C15794l.m25613g(comparator().compare(c, c2) <= 0);
        return subSetImpl(c, z, c2, z2);
    }
}
