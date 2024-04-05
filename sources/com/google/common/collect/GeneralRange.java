package com.google.common.collect;

import com.etsy.android.lib.conversation.MessageDraft;
import com.google.common.base.C15791j;
import com.google.common.base.C15794l;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class GeneralRange<T> implements Serializable {
    @MonotonicNonNullDecl

    /* renamed from: b */
    public transient GeneralRange<T> f35867b;
    private final Comparator<? super T> comparator;
    private final boolean hasLowerBound;
    private final boolean hasUpperBound;
    private final BoundType lowerBoundType;
    @NullableDecl
    private final T lowerEndpoint;
    private final BoundType upperBoundType;
    @NullableDecl
    private final T upperEndpoint;

    public GeneralRange(Comparator<? super T> comparator2, boolean z, @NullableDecl T t, BoundType boundType, boolean z2, @NullableDecl T t2, BoundType boundType2) {
        comparator2.getClass();
        this.comparator = comparator2;
        this.hasLowerBound = z;
        this.hasUpperBound = z2;
        this.lowerEndpoint = t;
        boundType.getClass();
        this.lowerBoundType = boundType;
        this.upperEndpoint = t2;
        boundType2.getClass();
        this.upperBoundType = boundType2;
        if (z) {
            comparator2.compare(t, t);
        }
        if (z2) {
            comparator2.compare(t2, t2);
        }
        if (z && z2) {
            int compare = comparator2.compare(t, t2);
            boolean z3 = true;
            C15794l.m25611e(t, "lowerEndpoint (%s) > upperEndpoint (%s)", t2, compare <= 0);
            if (compare == 0) {
                BoundType boundType3 = BoundType.OPEN;
                C15794l.m25613g((boundType != boundType3) | (boundType2 == boundType3 ? false : z3));
            }
        }
    }

    public static <T> GeneralRange<T> all(Comparator<? super T> comparator2) {
        BoundType boundType = BoundType.OPEN;
        return new GeneralRange(comparator2, false, (Object) null, boundType, false, (Object) null, boundType);
    }

    public static <T> GeneralRange<T> downTo(Comparator<? super T> comparator2, @NullableDecl T t, BoundType boundType) {
        return new GeneralRange(comparator2, true, t, boundType, false, (T) null, BoundType.OPEN);
    }

    public static <T extends Comparable> GeneralRange<T> from(Range<T> range) {
        T t = null;
        T lowerEndpoint2 = range.hasLowerBound() ? range.lowerEndpoint() : null;
        BoundType lowerBoundType2 = range.hasLowerBound() ? range.lowerBoundType() : BoundType.OPEN;
        if (range.hasUpperBound()) {
            t = range.upperEndpoint();
        }
        return new GeneralRange(Ordering.natural(), range.hasLowerBound(), lowerEndpoint2, lowerBoundType2, range.hasUpperBound(), t, range.hasUpperBound() ? range.upperBoundType() : BoundType.OPEN);
    }

    public static <T> GeneralRange<T> range(Comparator<? super T> comparator2, @NullableDecl T t, BoundType boundType, @NullableDecl T t2, BoundType boundType2) {
        return new GeneralRange(comparator2, true, t, boundType, true, t2, boundType2);
    }

    public static <T> GeneralRange<T> upTo(Comparator<? super T> comparator2, @NullableDecl T t, BoundType boundType) {
        return new GeneralRange(comparator2, false, (Object) null, BoundType.OPEN, true, t, boundType);
    }

    public Comparator<? super T> comparator() {
        return this.comparator;
    }

    public boolean contains(@NullableDecl T t) {
        return !tooLow(t) && !tooHigh(t);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof GeneralRange)) {
            return false;
        }
        GeneralRange generalRange = (GeneralRange) obj;
        return this.comparator.equals(generalRange.comparator) && this.hasLowerBound == generalRange.hasLowerBound && this.hasUpperBound == generalRange.hasUpperBound && getLowerBoundType().equals(generalRange.getLowerBoundType()) && getUpperBoundType().equals(generalRange.getUpperBoundType()) && C15791j.m25606a(getLowerEndpoint(), generalRange.getLowerEndpoint()) && C15791j.m25606a(getUpperEndpoint(), generalRange.getUpperEndpoint());
    }

    public BoundType getLowerBoundType() {
        return this.lowerBoundType;
    }

    public T getLowerEndpoint() {
        return this.lowerEndpoint;
    }

    public BoundType getUpperBoundType() {
        return this.upperBoundType;
    }

    public T getUpperEndpoint() {
        return this.upperEndpoint;
    }

    public boolean hasLowerBound() {
        return this.hasLowerBound;
    }

    public boolean hasUpperBound() {
        return this.hasUpperBound;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.comparator, getLowerEndpoint(), getLowerBoundType(), getUpperEndpoint(), getUpperBoundType()});
    }

    public GeneralRange<T> intersect(GeneralRange<T> generalRange) {
        BoundType boundType;
        BoundType boundType2;
        T t;
        int compare;
        BoundType boundType3;
        int compare2;
        int compare3;
        generalRange.getClass();
        C15794l.m25613g(this.comparator.equals(generalRange.comparator));
        boolean z = this.hasLowerBound;
        T lowerEndpoint2 = getLowerEndpoint();
        BoundType lowerBoundType2 = getLowerBoundType();
        if (!hasLowerBound()) {
            z = generalRange.hasLowerBound;
            lowerEndpoint2 = generalRange.getLowerEndpoint();
            lowerBoundType2 = generalRange.getLowerBoundType();
        } else if (generalRange.hasLowerBound() && ((compare3 = this.comparator.compare(getLowerEndpoint(), generalRange.getLowerEndpoint())) < 0 || (compare3 == 0 && generalRange.getLowerBoundType() == BoundType.OPEN))) {
            lowerEndpoint2 = generalRange.getLowerEndpoint();
            lowerBoundType2 = generalRange.getLowerBoundType();
        }
        boolean z2 = z;
        boolean z3 = this.hasUpperBound;
        T upperEndpoint2 = getUpperEndpoint();
        BoundType upperBoundType2 = getUpperBoundType();
        if (!hasUpperBound()) {
            z3 = generalRange.hasUpperBound;
            upperEndpoint2 = generalRange.getUpperEndpoint();
            upperBoundType2 = generalRange.getUpperBoundType();
        } else if (generalRange.hasUpperBound() && ((compare2 = this.comparator.compare(getUpperEndpoint(), generalRange.getUpperEndpoint())) > 0 || (compare2 == 0 && generalRange.getUpperBoundType() == BoundType.OPEN))) {
            upperEndpoint2 = generalRange.getUpperEndpoint();
            upperBoundType2 = generalRange.getUpperBoundType();
        }
        boolean z4 = z3;
        T t2 = upperEndpoint2;
        if (!z2 || !z4 || ((compare = this.comparator.compare(lowerEndpoint2, t2)) <= 0 && !(compare == 0 && lowerBoundType2 == (boundType3 = BoundType.OPEN) && upperBoundType2 == boundType3))) {
            t = lowerEndpoint2;
            boundType2 = lowerBoundType2;
            boundType = upperBoundType2;
        } else {
            boundType2 = BoundType.OPEN;
            boundType = BoundType.CLOSED;
            t = t2;
        }
        return new GeneralRange(this.comparator, z2, t, boundType2, z4, t2, boundType);
    }

    public boolean isEmpty() {
        return (hasUpperBound() && tooLow(getUpperEndpoint())) || (hasLowerBound() && tooHigh(getLowerEndpoint()));
    }

    public GeneralRange<T> reverse() {
        GeneralRange<T> generalRange = this.f35867b;
        if (generalRange != null) {
            return generalRange;
        }
        GeneralRange generalRange2 = new GeneralRange(Ordering.from(this.comparator).reverse(), this.hasUpperBound, getUpperEndpoint(), getUpperBoundType(), this.hasLowerBound, getLowerEndpoint(), getLowerBoundType());
        generalRange2.f35867b = this;
        this.f35867b = generalRange2;
        return generalRange2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.comparator);
        sb.append(MessageDraft.IMAGE_DELIMITER);
        BoundType boundType = this.lowerBoundType;
        BoundType boundType2 = BoundType.CLOSED;
        sb.append(boundType == boundType2 ? '[' : '(');
        sb.append(this.hasLowerBound ? this.lowerEndpoint : "-∞");
        sb.append(',');
        sb.append(this.hasUpperBound ? this.upperEndpoint : "∞");
        sb.append(this.upperBoundType == boundType2 ? ']' : ')');
        return sb.toString();
    }

    public boolean tooHigh(@NullableDecl T t) {
        boolean z = false;
        if (!hasUpperBound()) {
            return false;
        }
        int compare = this.comparator.compare(t, getUpperEndpoint());
        boolean z2 = compare > 0;
        boolean z3 = compare == 0;
        if (getUpperBoundType() == BoundType.OPEN) {
            z = true;
        }
        return (z3 & z) | z2;
    }

    public boolean tooLow(@NullableDecl T t) {
        boolean z = false;
        if (!hasLowerBound()) {
            return false;
        }
        int compare = this.comparator.compare(t, getLowerEndpoint());
        boolean z2 = compare < 0;
        boolean z3 = compare == 0;
        if (getLowerBoundType() == BoundType.OPEN) {
            z = true;
        }
        return (z3 & z) | z2;
    }
}
