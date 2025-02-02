package com.google.common.collect;

import java.lang.Comparable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.f */
public abstract class C16167f<C extends Comparable> implements C16205o1<C> {
    public void add(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    public void addAll(C16205o1<C> o1Var) {
        addAll(o1Var.asRanges());
    }

    public void clear() {
        remove(Range.all());
    }

    public boolean contains(C c) {
        return rangeContaining(c) != null;
    }

    public abstract boolean encloses(Range<C> range);

    public boolean enclosesAll(C16205o1<C> o1Var) {
        return enclosesAll(o1Var.asRanges());
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16205o1) {
            return asRanges().equals(((C16205o1) obj).asRanges());
        }
        return false;
    }

    public final int hashCode() {
        return asRanges().hashCode();
    }

    public boolean intersects(Range<C> range) {
        return !subRangeSet(range).isEmpty();
    }

    public boolean isEmpty() {
        return asRanges().isEmpty();
    }

    public abstract Range<C> rangeContaining(C c);

    public void remove(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    public void removeAll(C16205o1<C> o1Var) {
        removeAll(o1Var.asRanges());
    }

    public final String toString() {
        return asRanges().toString();
    }

    public void addAll(Iterable<Range<C>> iterable) {
        for (Range<C> add : iterable) {
            add(add);
        }
    }

    public boolean enclosesAll(Iterable<Range<C>> iterable) {
        for (Range<C> encloses : iterable) {
            if (!encloses(encloses)) {
                return false;
            }
        }
        return true;
    }

    public void removeAll(Iterable<Range<C>> iterable) {
        for (Range<C> remove : iterable) {
            remove(remove);
        }
    }
}
