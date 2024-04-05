package com.google.common.collect;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

final class NaturalOrdering extends Ordering<Comparable> implements Serializable {
    public static final NaturalOrdering INSTANCE = new NaturalOrdering();
    private static final long serialVersionUID = 0;
    @MonotonicNonNullDecl

    /* renamed from: b */
    public transient Ordering<Comparable> f36104b;
    @MonotonicNonNullDecl

    /* renamed from: c */
    public transient Ordering<Comparable> f36105c;

    private NaturalOrdering() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public <S extends Comparable> Ordering<S> nullsFirst() {
        Ordering<Comparable> ordering = this.f36104b;
        if (ordering != null) {
            return ordering;
        }
        Ordering<Comparable> nullsFirst = super.nullsFirst();
        this.f36104b = nullsFirst;
        return nullsFirst;
    }

    public <S extends Comparable> Ordering<S> nullsLast() {
        Ordering<Comparable> ordering = this.f36105c;
        if (ordering != null) {
            return ordering;
        }
        Ordering<Comparable> nullsLast = super.nullsLast();
        this.f36105c = nullsLast;
        return nullsLast;
    }

    public <S extends Comparable> Ordering<S> reverse() {
        return ReverseNaturalOrdering.INSTANCE;
    }

    public String toString() {
        return "Ordering.natural()";
    }

    public int compare(Comparable comparable, Comparable comparable2) {
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }
}
