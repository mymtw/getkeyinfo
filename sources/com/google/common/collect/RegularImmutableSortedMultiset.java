package com.google.common.collect;

import com.google.common.base.C15794l;
import com.google.common.collect.C16178h1;
import com.google.common.collect.Multisets;
import com.google.common.primitives.Ints;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class RegularImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {
    public static final ImmutableSortedMultiset<Comparable> NATURAL_EMPTY_MULTISET = new RegularImmutableSortedMultiset(Ordering.natural());

    /* renamed from: h */
    public static final long[] f36138h = {0};

    /* renamed from: e */
    public final transient long[] f36139e;
    public final transient RegularImmutableSortedSet<E> elementSet;

    /* renamed from: f */
    public final transient int f36140f;

    /* renamed from: g */
    public final transient int f36141g;

    public RegularImmutableSortedMultiset(Comparator<? super E> comparator) {
        this.elementSet = ImmutableSortedSet.emptySet(comparator);
        this.f36139e = f36138h;
        this.f36140f = 0;
        this.f36141g = 0;
    }

    public int count(@NullableDecl Object obj) {
        int indexOf = this.elementSet.indexOf(obj);
        if (indexOf < 0) {
            return 0;
        }
        long[] jArr = this.f36139e;
        int i = this.f36140f + indexOf;
        return (int) (jArr[i + 1] - jArr[i]);
    }

    public C16178h1.C16179a<E> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return getEntry(0);
    }

    public C16178h1.C16179a<E> getEntry(int i) {
        E e = this.elementSet.asList().get(i);
        long[] jArr = this.f36139e;
        int i2 = this.f36140f + i;
        return new Multisets.ImmutableEntry(e, (int) (jArr[i2 + 1] - jArr[i2]));
    }

    public ImmutableSortedMultiset<E> getSubMultiset(int i, int i2) {
        C15794l.m25619m(i, i2, this.f36141g);
        return i == i2 ? ImmutableSortedMultiset.emptyMultiset(comparator()) : (i == 0 && i2 == this.f36141g) ? this : new RegularImmutableSortedMultiset(this.elementSet.getSubSet(i, i2), this.f36139e, this.f36140f + i, i2 - i);
    }

    public boolean isPartialView() {
        return this.f36140f > 0 || this.f36141g < this.f36139e.length - 1;
    }

    public C16178h1.C16179a<E> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return getEntry(this.f36141g - 1);
    }

    public int size() {
        long[] jArr = this.f36139e;
        int i = this.f36140f;
        return Ints.m26384b(jArr[this.f36141g + i] - jArr[i]);
    }

    public ImmutableSortedMultiset<E> headMultiset(E e, BoundType boundType) {
        RegularImmutableSortedSet<E> regularImmutableSortedSet = this.elementSet;
        boundType.getClass();
        return getSubMultiset(0, regularImmutableSortedSet.headIndex(e, boundType == BoundType.CLOSED));
    }

    public ImmutableSortedMultiset<E> tailMultiset(E e, BoundType boundType) {
        RegularImmutableSortedSet<E> regularImmutableSortedSet = this.elementSet;
        boundType.getClass();
        return getSubMultiset(regularImmutableSortedSet.tailIndex(e, boundType == BoundType.CLOSED), this.f36141g);
    }

    public ImmutableSortedSet<E> elementSet() {
        return this.elementSet;
    }

    public RegularImmutableSortedMultiset(RegularImmutableSortedSet<E> regularImmutableSortedSet, long[] jArr, int i, int i2) {
        this.elementSet = regularImmutableSortedSet;
        this.f36139e = jArr;
        this.f36140f = i;
        this.f36141g = i2;
    }
}
