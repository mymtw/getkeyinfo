package com.google.common.collect;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.gms.common.api.Api;
import com.google.common.base.C15794l;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p628nj.C18263b;

final class RegularContiguousSet<C extends Comparable> extends ContiguousSet<C> {
    private static final long serialVersionUID = 0;
    private final Range<C> range;

    public static final class SerializedForm<C extends Comparable> implements Serializable {
        public final DiscreteDomain<C> domain;
        public final Range<C> range;

        public SerializedForm() {
            throw null;
        }

        public SerializedForm(Range range2, DiscreteDomain discreteDomain, C16077a aVar) {
            this.range = range2;
            this.domain = discreteDomain;
        }

        private Object readResolve() {
            return new RegularContiguousSet(this.range, this.domain);
        }
    }

    /* renamed from: com.google.common.collect.RegularContiguousSet$a */
    public class C16077a extends C16171g<C> {

        /* renamed from: c */
        public final C f36113c;

        public C16077a(Comparable comparable) {
            super(comparable);
            this.f36113c = RegularContiguousSet.this.last();
        }

        /* renamed from: a */
        public final Object mo55956a(Object obj) {
            Comparable comparable = (Comparable) obj;
            if (RegularContiguousSet.access$000(comparable, this.f36113c)) {
                return null;
            }
            return RegularContiguousSet.this.domain.next(comparable);
        }
    }

    /* renamed from: com.google.common.collect.RegularContiguousSet$b */
    public class C16078b extends C16171g<C> {

        /* renamed from: c */
        public final C f36115c;

        public C16078b(Comparable comparable) {
            super(comparable);
            this.f36115c = RegularContiguousSet.this.first();
        }

        /* renamed from: a */
        public final Object mo55956a(Object obj) {
            Comparable comparable = (Comparable) obj;
            if (RegularContiguousSet.access$000(comparable, this.f36115c)) {
                return null;
            }
            return RegularContiguousSet.this.domain.previous(comparable);
        }
    }

    public RegularContiguousSet(Range<C> range2, DiscreteDomain<C> discreteDomain) {
        super(discreteDomain);
        this.range = range2;
    }

    public static boolean access$000(Comparable comparable, Comparable comparable2) {
        return comparable2 != null && Range.compareOrThrow(comparable, comparable2) == 0;
    }

    /* renamed from: c */
    public final ContiguousSet<C> mo57262c(Range<C> range2) {
        return this.range.isConnected(range2) ? ContiguousSet.create(this.range.intersection(range2), this.domain) : new EmptyContiguousSet(this.domain);
    }

    public boolean contains(@NullableDecl Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.range.contains((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean containsAll(Collection<?> collection) {
        return C18263b.m30809D(this, collection);
    }

    public ImmutableList<C> createAsList() {
        return this.domain.supportsFastOffset ? new ImmutableAsList<C>() {
            public ImmutableSortedSet<C> delegateCollection() {
                return RegularContiguousSet.this;
            }

            public C get(int i) {
                C15794l.m25616j(i, size());
                RegularContiguousSet regularContiguousSet = RegularContiguousSet.this;
                return regularContiguousSet.domain.offset(regularContiguousSet.first(), (long) i);
            }
        } : super.createAsList();
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RegularContiguousSet) {
            RegularContiguousSet regularContiguousSet = (RegularContiguousSet) obj;
            if (this.domain.equals(regularContiguousSet.domain)) {
                return first().equals(regularContiguousSet.first()) && last().equals(regularContiguousSet.last());
            }
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return Sets.m26092b(this);
    }

    public int indexOf(Object obj) {
        if (contains(obj)) {
            return (int) this.domain.distance(first(), (Comparable) obj);
        }
        return -1;
    }

    public ContiguousSet<C> intersection(ContiguousSet<C> contiguousSet) {
        contiguousSet.getClass();
        C15794l.m25613g(this.domain.equals(contiguousSet.domain));
        if (contiguousSet.isEmpty()) {
            return contiguousSet;
        }
        Comparable comparable = (Comparable) Ordering.natural().max(first(), contiguousSet.first());
        Comparable comparable2 = (Comparable) Ordering.natural().min(last(), contiguousSet.last());
        return comparable.compareTo(comparable2) <= 0 ? ContiguousSet.create(Range.closed(comparable, comparable2), this.domain) : new EmptyContiguousSet(this.domain);
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean isPartialView() {
        return false;
    }

    public Range<C> range() {
        BoundType boundType = BoundType.CLOSED;
        return range(boundType, boundType);
    }

    public int size() {
        long distance = this.domain.distance(first(), last());
        return distance >= ParserMinimalBase.MAX_INT_L ? Api.BaseClientBuilder.API_PRIORITY_OTHER : ((int) distance) + 1;
    }

    public Object writeReplace() {
        return new SerializedForm(this.range, this.domain, (C16077a) null);
    }

    public C16170f2<C> descendingIterator() {
        return new C16078b(last());
    }

    public C first() {
        return this.range.lowerBound.leastValueAbove(this.domain);
    }

    public ContiguousSet<C> headSetImpl(C c, boolean z) {
        return mo57262c(Range.upTo(c, BoundType.forBoolean(z)));
    }

    public C16170f2<C> iterator() {
        return new C16077a(first());
    }

    public C last() {
        return this.range.upperBound.greatestValueBelow(this.domain);
    }

    public Range<C> range(BoundType boundType, BoundType boundType2) {
        return Range.create(this.range.lowerBound.withLowerBoundType(boundType, this.domain), this.range.upperBound.withUpperBoundType(boundType2, this.domain));
    }

    public ContiguousSet<C> subSetImpl(C c, boolean z, C c2, boolean z2) {
        if (c.compareTo(c2) != 0 || z || z2) {
            return mo57262c(Range.range(c, BoundType.forBoolean(z), c2, BoundType.forBoolean(z2)));
        }
        return new EmptyContiguousSet(this.domain);
    }

    public ContiguousSet<C> tailSetImpl(C c, boolean z) {
        return mo57262c(Range.downTo(c, BoundType.forBoolean(z)));
    }
}
