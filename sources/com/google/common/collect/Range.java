package com.google.common.collect;

import android.support.p013v4.media.C0072d;
import com.google.common.base.C15784e;
import com.google.common.base.C15795m;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class Range<C extends Comparable> extends RangeGwtSerializationDependencies implements C15795m<C> {

    /* renamed from: b */
    public static final Range<Comparable> f36109b = new Range<>(Cut.belowAll(), Cut.aboveAll());
    private static final long serialVersionUID = 0;
    public final Cut<C> lowerBound;
    public final Cut<C> upperBound;

    public static class RangeLexOrdering extends Ordering<Range<?>> implements Serializable {
        public static final Ordering<Range<?>> INSTANCE = new RangeLexOrdering();
        private static final long serialVersionUID = 0;

        private RangeLexOrdering() {
        }

        public int compare(Range<?> range, Range<?> range2) {
            return C16206p.f36306a.mo57710c(range.lowerBound, range2.lowerBound).mo57710c(range.upperBound, range2.upperBound).mo57714g();
        }
    }

    /* renamed from: com.google.common.collect.Range$a */
    public static /* synthetic */ class C16073a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36110a;

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
                f36110a = r0
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.OPEN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36110a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.CLOSED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Range.C16073a.<clinit>():void");
        }
    }

    /* renamed from: com.google.common.collect.Range$b */
    public static class C16074b implements C15784e<Range, Cut> {

        /* renamed from: b */
        public static final C16074b f36111b = new C16074b();

        public final Object apply(Object obj) {
            return ((Range) obj).lowerBound;
        }
    }

    /* renamed from: com.google.common.collect.Range$c */
    public static class C16075c implements C15784e<Range, Cut> {

        /* renamed from: b */
        public static final C16075c f36112b = new C16075c();

        public final Object apply(Object obj) {
            return ((Range) obj).upperBound;
        }
    }

    public Range(Cut<C> cut, Cut<C> cut2) {
        cut.getClass();
        this.lowerBound = cut;
        cut2.getClass();
        this.upperBound = cut2;
        if (cut.compareTo(cut2) > 0 || cut == Cut.aboveAll() || cut2 == Cut.belowAll()) {
            StringBuilder h = C0072d.m201h("Invalid range: ");
            StringBuilder sb = new StringBuilder(16);
            cut.describeAsLowerBound(sb);
            sb.append("..");
            cut2.describeAsUpperBound(sb);
            h.append(sb.toString());
            throw new IllegalArgumentException(h.toString());
        }
    }

    public static <C extends Comparable<?>> Range<C> all() {
        return f36109b;
    }

    public static <C extends Comparable<?>> Range<C> atLeast(C c) {
        return create(Cut.belowValue(c), Cut.aboveAll());
    }

    public static <C extends Comparable<?>> Range<C> atMost(C c) {
        return create(Cut.belowAll(), Cut.aboveValue(c));
    }

    public static <C extends Comparable<?>> Range<C> closed(C c, C c2) {
        return create(Cut.belowValue(c), Cut.aboveValue(c2));
    }

    public static <C extends Comparable<?>> Range<C> closedOpen(C c, C c2) {
        return create(Cut.belowValue(c), Cut.belowValue(c2));
    }

    public static int compareOrThrow(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static <C extends Comparable<?>> Range<C> create(Cut<C> cut, Cut<C> cut2) {
        return new Range<>(cut, cut2);
    }

    public static <C extends Comparable<?>> Range<C> downTo(C c, BoundType boundType) {
        int i = C16073a.f36110a[boundType.ordinal()];
        if (i == 1) {
            return greaterThan(c);
        }
        if (i == 2) {
            return atLeast(c);
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> Range<C> encloseAll(Iterable<C> iterable) {
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            Comparator comparator = sortedSet.comparator();
            if (Ordering.natural().equals(comparator) || comparator == null) {
                return closed((Comparable) sortedSet.first(), (Comparable) sortedSet.last());
            }
        }
        Iterator<C> it = iterable.iterator();
        C next = it.next();
        next.getClass();
        Comparable comparable = (Comparable) next;
        Comparable comparable2 = comparable;
        while (it.hasNext()) {
            C next2 = it.next();
            next2.getClass();
            Comparable comparable3 = (Comparable) next2;
            comparable = (Comparable) Ordering.natural().min(comparable, comparable3);
            comparable2 = (Comparable) Ordering.natural().max(comparable2, comparable3);
        }
        return closed(comparable, comparable2);
    }

    public static <C extends Comparable<?>> Range<C> greaterThan(C c) {
        return create(Cut.aboveValue(c), Cut.aboveAll());
    }

    public static <C extends Comparable<?>> Range<C> lessThan(C c) {
        return create(Cut.belowAll(), Cut.belowValue(c));
    }

    public static <C extends Comparable<?>> C15784e<Range<C>, Cut<C>> lowerBoundFn() {
        return C16074b.f36111b;
    }

    public static <C extends Comparable<?>> Range<C> open(C c, C c2) {
        return create(Cut.aboveValue(c), Cut.belowValue(c2));
    }

    public static <C extends Comparable<?>> Range<C> openClosed(C c, C c2) {
        return create(Cut.aboveValue(c), Cut.aboveValue(c2));
    }

    public static <C extends Comparable<?>> Range<C> range(C c, BoundType boundType, C c2, BoundType boundType2) {
        boundType.getClass();
        boundType2.getClass();
        BoundType boundType3 = BoundType.OPEN;
        return create(boundType == boundType3 ? Cut.aboveValue(c) : Cut.belowValue(c), boundType2 == boundType3 ? Cut.belowValue(c2) : Cut.aboveValue(c2));
    }

    public static <C extends Comparable<?>> Ordering<Range<C>> rangeLexOrdering() {
        return RangeLexOrdering.INSTANCE;
    }

    public static <C extends Comparable<?>> Range<C> singleton(C c) {
        return closed(c, c);
    }

    public static <C extends Comparable<?>> Range<C> upTo(C c, BoundType boundType) {
        int i = C16073a.f36110a[boundType.ordinal()];
        if (i == 1) {
            return lessThan(c);
        }
        if (i == 2) {
            return atMost(c);
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> C15784e<Range<C>, Cut<C>> upperBoundFn() {
        return C16075c.f36112b;
    }

    public Range<C> canonical(DiscreteDomain<C> discreteDomain) {
        discreteDomain.getClass();
        Cut<C> canonical = this.lowerBound.canonical(discreteDomain);
        Cut<C> canonical2 = this.upperBound.canonical(discreteDomain);
        return (canonical == this.lowerBound && canonical2 == this.upperBound) ? this : create(canonical, canonical2);
    }

    public boolean contains(C c) {
        c.getClass();
        return this.lowerBound.isLessThan(c) && !this.upperBound.isLessThan(c);
    }

    public boolean containsAll(Iterable<? extends C> iterable) {
        if (iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext()) {
            return true;
        }
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            Comparator comparator = sortedSet.comparator();
            if (Ordering.natural().equals(comparator) || comparator == null) {
                return contains((Comparable) sortedSet.first()) && contains((Comparable) sortedSet.last());
            }
        }
        Iterator<? extends C> it = iterable.iterator();
        while (it.hasNext()) {
            if (!contains((Comparable) it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean encloses(Range<C> range) {
        return this.lowerBound.compareTo(range.lowerBound) <= 0 && this.upperBound.compareTo(range.upperBound) >= 0;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        return this.lowerBound.equals(range.lowerBound) && this.upperBound.equals(range.upperBound);
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Incorrect type for immutable var: ssa=com.google.common.collect.Range<C>, code=com.google.common.collect.Range, for r3v0, types: [com.google.common.collect.Range, com.google.common.collect.Range<C>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.common.collect.Range<C> gap(com.google.common.collect.Range r3) {
        /*
            r2 = this;
            com.google.common.collect.Cut<C> r0 = r2.lowerBound
            com.google.common.collect.Cut<C> r1 = r3.lowerBound
            int r0 = r0.compareTo(r1)
            if (r0 >= 0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            if (r0 == 0) goto L_0x0011
            r1 = r2
            goto L_0x0012
        L_0x0011:
            r1 = r3
        L_0x0012:
            if (r0 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r3 = r2
        L_0x0016:
            com.google.common.collect.Cut<C> r0 = r1.upperBound
            com.google.common.collect.Cut<C> r3 = r3.lowerBound
            com.google.common.collect.Range r3 = create(r0, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Range.gap(com.google.common.collect.Range):com.google.common.collect.Range");
    }

    public boolean hasLowerBound() {
        return this.lowerBound != Cut.belowAll();
    }

    public boolean hasUpperBound() {
        return this.upperBound != Cut.aboveAll();
    }

    public int hashCode() {
        return (this.lowerBound.hashCode() * 31) + this.upperBound.hashCode();
    }

    public Range<C> intersection(Range<C> range) {
        int compareTo = this.lowerBound.compareTo(range.lowerBound);
        int compareTo2 = this.upperBound.compareTo(range.upperBound);
        if (compareTo >= 0 && compareTo2 <= 0) {
            return this;
        }
        if (compareTo <= 0 && compareTo2 >= 0) {
            return range;
        }
        return create(compareTo >= 0 ? this.lowerBound : range.lowerBound, compareTo2 <= 0 ? this.upperBound : range.upperBound);
    }

    public boolean isConnected(Range<C> range) {
        return this.lowerBound.compareTo(range.upperBound) <= 0 && range.lowerBound.compareTo(this.upperBound) <= 0;
    }

    public boolean isEmpty() {
        return this.lowerBound.equals(this.upperBound);
    }

    public BoundType lowerBoundType() {
        return this.lowerBound.typeAsLowerBound();
    }

    public C lowerEndpoint() {
        return this.lowerBound.endpoint();
    }

    public Object readResolve() {
        return equals(f36109b) ? all() : this;
    }

    public Range<C> span(Range<C> range) {
        int compareTo = this.lowerBound.compareTo(range.lowerBound);
        int compareTo2 = this.upperBound.compareTo(range.upperBound);
        if (compareTo <= 0 && compareTo2 >= 0) {
            return this;
        }
        if (compareTo >= 0 && compareTo2 <= 0) {
            return range;
        }
        return create(compareTo <= 0 ? this.lowerBound : range.lowerBound, compareTo2 >= 0 ? this.upperBound : range.upperBound);
    }

    public String toString() {
        Cut<C> cut = this.lowerBound;
        Cut<C> cut2 = this.upperBound;
        StringBuilder sb = new StringBuilder(16);
        cut.describeAsLowerBound(sb);
        sb.append("..");
        cut2.describeAsUpperBound(sb);
        return sb.toString();
    }

    public BoundType upperBoundType() {
        return this.upperBound.typeAsUpperBound();
    }

    public C upperEndpoint() {
        return this.upperBound.endpoint();
    }

    @Deprecated
    public boolean apply(C c) {
        return contains(c);
    }
}
