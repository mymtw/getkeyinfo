package com.google.common.collect;

import android.support.p013v4.media.C0072d;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

abstract class Cut<C extends Comparable> implements Comparable<Cut<C>>, Serializable {
    private static final long serialVersionUID = 0;
    @NullableDecl
    public final C endpoint;

    public static final class AboveAll extends Cut<Comparable<?>> {

        /* renamed from: b */
        public static final AboveAll f35842b = new AboveAll();
        private static final long serialVersionUID = 0;

        private AboveAll() {
            super(null);
        }

        private Object readResolve() {
            return f35842b;
        }

        public int compareTo(Cut<Comparable<?>> cut) {
            return cut == this ? 0 : 1;
        }

        public void describeAsLowerBound(StringBuilder sb) {
            throw new AssertionError();
        }

        public void describeAsUpperBound(StringBuilder sb) {
            sb.append("+∞)");
        }

        public Comparable<?> endpoint() {
            throw new IllegalStateException("range unbounded on this side");
        }

        public Comparable<?> greatestValueBelow(DiscreteDomain<Comparable<?>> discreteDomain) {
            return discreteDomain.maxValue();
        }

        public int hashCode() {
            return System.identityHashCode(this);
        }

        public boolean isLessThan(Comparable<?> comparable) {
            return false;
        }

        public Comparable<?> leastValueAbove(DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError();
        }

        public String toString() {
            return "+∞";
        }

        public BoundType typeAsLowerBound() {
            throw new AssertionError("this statement should be unreachable");
        }

        public BoundType typeAsUpperBound() {
            throw new IllegalStateException();
        }

        public Cut<Comparable<?>> withLowerBoundType(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError("this statement should be unreachable");
        }

        public Cut<Comparable<?>> withUpperBoundType(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new IllegalStateException();
        }
    }

    public static final class AboveValue<C extends Comparable> extends Cut<C> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AboveValue(C c) {
            super(c);
            c.getClass();
        }

        public Cut<C> canonical(DiscreteDomain<C> discreteDomain) {
            C leastValueAbove = leastValueAbove(discreteDomain);
            return leastValueAbove != null ? Cut.belowValue(leastValueAbove) : Cut.aboveAll();
        }

        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return Cut.super.compareTo((Cut) obj);
        }

        public void describeAsLowerBound(StringBuilder sb) {
            sb.append('(');
            sb.append(this.endpoint);
        }

        public void describeAsUpperBound(StringBuilder sb) {
            sb.append(this.endpoint);
            sb.append(']');
        }

        public C greatestValueBelow(DiscreteDomain<C> discreteDomain) {
            return this.endpoint;
        }

        public int hashCode() {
            return ~this.endpoint.hashCode();
        }

        public boolean isLessThan(C c) {
            return Range.compareOrThrow(this.endpoint, c) < 0;
        }

        public C leastValueAbove(DiscreteDomain<C> discreteDomain) {
            return discreteDomain.next(this.endpoint);
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("/");
            h.append(this.endpoint);
            h.append("\\");
            return h.toString();
        }

        public BoundType typeAsLowerBound() {
            return BoundType.OPEN;
        }

        public BoundType typeAsUpperBound() {
            return BoundType.CLOSED;
        }

        public Cut<C> withLowerBoundType(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i = C15930a.f35844a[boundType.ordinal()];
            if (i == 1) {
                C next = discreteDomain.next(this.endpoint);
                return next == null ? Cut.belowAll() : Cut.belowValue(next);
            } else if (i == 2) {
                return this;
            } else {
                throw new AssertionError();
            }
        }

        public Cut<C> withUpperBoundType(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i = C15930a.f35844a[boundType.ordinal()];
            if (i == 1) {
                return this;
            }
            if (i == 2) {
                C next = discreteDomain.next(this.endpoint);
                return next == null ? Cut.aboveAll() : Cut.belowValue(next);
            }
            throw new AssertionError();
        }
    }

    public static final class BelowAll extends Cut<Comparable<?>> {

        /* renamed from: b */
        public static final BelowAll f35843b = new BelowAll();
        private static final long serialVersionUID = 0;

        private BelowAll() {
            super(null);
        }

        private Object readResolve() {
            return f35843b;
        }

        public Cut<Comparable<?>> canonical(DiscreteDomain<Comparable<?>> discreteDomain) {
            try {
                return Cut.belowValue(discreteDomain.minValue());
            } catch (NoSuchElementException unused) {
                return this;
            }
        }

        public int compareTo(Cut<Comparable<?>> cut) {
            return cut == this ? 0 : -1;
        }

        public void describeAsLowerBound(StringBuilder sb) {
            sb.append("(-∞");
        }

        public void describeAsUpperBound(StringBuilder sb) {
            throw new AssertionError();
        }

        public Comparable<?> endpoint() {
            throw new IllegalStateException("range unbounded on this side");
        }

        public Comparable<?> greatestValueBelow(DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError();
        }

        public int hashCode() {
            return System.identityHashCode(this);
        }

        public boolean isLessThan(Comparable<?> comparable) {
            return true;
        }

        public Comparable<?> leastValueAbove(DiscreteDomain<Comparable<?>> discreteDomain) {
            return discreteDomain.minValue();
        }

        public String toString() {
            return "-∞";
        }

        public BoundType typeAsLowerBound() {
            throw new IllegalStateException();
        }

        public BoundType typeAsUpperBound() {
            throw new AssertionError("this statement should be unreachable");
        }

        public Cut<Comparable<?>> withLowerBoundType(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new IllegalStateException();
        }

        public Cut<Comparable<?>> withUpperBoundType(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError("this statement should be unreachable");
        }
    }

    public static final class BelowValue<C extends Comparable> extends Cut<C> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BelowValue(C c) {
            super(c);
            c.getClass();
        }

        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return Cut.super.compareTo((Cut) obj);
        }

        public void describeAsLowerBound(StringBuilder sb) {
            sb.append('[');
            sb.append(this.endpoint);
        }

        public void describeAsUpperBound(StringBuilder sb) {
            sb.append(this.endpoint);
            sb.append(')');
        }

        public C greatestValueBelow(DiscreteDomain<C> discreteDomain) {
            return discreteDomain.previous(this.endpoint);
        }

        public int hashCode() {
            return this.endpoint.hashCode();
        }

        public boolean isLessThan(C c) {
            return Range.compareOrThrow(this.endpoint, c) <= 0;
        }

        public C leastValueAbove(DiscreteDomain<C> discreteDomain) {
            return this.endpoint;
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("\\");
            h.append(this.endpoint);
            h.append("/");
            return h.toString();
        }

        public BoundType typeAsLowerBound() {
            return BoundType.CLOSED;
        }

        public BoundType typeAsUpperBound() {
            return BoundType.OPEN;
        }

        public Cut<C> withLowerBoundType(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i = C15930a.f35844a[boundType.ordinal()];
            if (i == 1) {
                return this;
            }
            if (i == 2) {
                C previous = discreteDomain.previous(this.endpoint);
                return previous == null ? Cut.belowAll() : new AboveValue(previous);
            }
            throw new AssertionError();
        }

        public Cut<C> withUpperBoundType(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i = C15930a.f35844a[boundType.ordinal()];
            if (i == 1) {
                C previous = discreteDomain.previous(this.endpoint);
                return previous == null ? Cut.aboveAll() : new AboveValue(previous);
            } else if (i == 2) {
                return this;
            } else {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: com.google.common.collect.Cut$a */
    public static /* synthetic */ class C15930a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35844a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.common.collect.BoundType[] r0 = com.google.common.collect.BoundType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35844a = r0
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.CLOSED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35844a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.OPEN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Cut.C15930a.<clinit>():void");
        }
    }

    public Cut(@NullableDecl C c) {
        this.endpoint = c;
    }

    public static <C extends Comparable> Cut<C> aboveAll() {
        return AboveAll.f35842b;
    }

    public static <C extends Comparable> Cut<C> aboveValue(C c) {
        return new AboveValue(c);
    }

    public static <C extends Comparable> Cut<C> belowAll() {
        return BelowAll.f35843b;
    }

    public static <C extends Comparable> Cut<C> belowValue(C c) {
        return new BelowValue(c);
    }

    public Cut<C> canonical(DiscreteDomain<C> discreteDomain) {
        return this;
    }

    public abstract void describeAsLowerBound(StringBuilder sb);

    public abstract void describeAsUpperBound(StringBuilder sb);

    public C endpoint() {
        return this.endpoint;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Cut)) {
            return false;
        }
        try {
            return compareTo((Cut) obj) == 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public abstract C greatestValueBelow(DiscreteDomain<C> discreteDomain);

    public abstract int hashCode();

    public abstract boolean isLessThan(C c);

    public abstract C leastValueAbove(DiscreteDomain<C> discreteDomain);

    public abstract BoundType typeAsLowerBound();

    public abstract BoundType typeAsUpperBound();

    public abstract Cut<C> withLowerBoundType(BoundType boundType, DiscreteDomain<C> discreteDomain);

    public abstract Cut<C> withUpperBoundType(BoundType boundType, DiscreteDomain<C> discreteDomain);

    public int compareTo(Cut<C> cut) {
        if (cut == belowAll()) {
            return 1;
        }
        if (cut == aboveAll()) {
            return -1;
        }
        int compareOrThrow = Range.compareOrThrow(this.endpoint, cut.endpoint);
        if (compareOrThrow != 0) {
            return compareOrThrow;
        }
        boolean z = this instanceof AboveValue;
        if (z == (cut instanceof AboveValue)) {
            return 0;
        }
        if (z) {
            return 1;
        }
        return -1;
    }
}
