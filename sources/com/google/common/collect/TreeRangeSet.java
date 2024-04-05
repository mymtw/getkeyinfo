package com.google.common.collect;

import com.google.common.base.C15788i;
import com.google.common.base.C15794l;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Iterators;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public class TreeRangeSet<C extends Comparable<?>> extends C16167f<C> implements Serializable {
    @MonotonicNonNullDecl

    /* renamed from: b */
    public transient C16130b f36213b;
    @MonotonicNonNullDecl

    /* renamed from: c */
    public transient C16130b f36214c;
    @MonotonicNonNullDecl

    /* renamed from: d */
    public transient C16205o1<C> f36215d;
    public final NavigableMap<Cut<C>, Range<C>> rangesByLowerBound;

    public final class Complement extends TreeRangeSet<C> {
        public Complement() {
            super(new C16131c(TreeRangeSet.this.rangesByLowerBound, Range.all()));
        }

        public void add(Range<C> range) {
            TreeRangeSet.this.remove(range);
        }

        public C16205o1<C> complement() {
            return TreeRangeSet.this;
        }

        public boolean contains(C c) {
            return !TreeRangeSet.this.contains(c);
        }

        public void remove(Range<C> range) {
            TreeRangeSet.this.add(range);
        }
    }

    public final class SubRangeSet extends TreeRangeSet<C> {
        private final Range<C> restriction;

        public SubRangeSet(Range<C> range) {
            super(new C16137e(Range.all(), range, TreeRangeSet.this.rangesByLowerBound));
            this.restriction = range;
        }

        public void add(Range<C> range) {
            C15794l.m25611e(range, "Cannot add range %s to subRangeSet(%s)", this.restriction, this.restriction.encloses(range));
            TreeRangeSet.super.add(range);
        }

        public void clear() {
            TreeRangeSet.this.remove(this.restriction);
        }

        public boolean contains(C c) {
            return this.restriction.contains(c) && TreeRangeSet.this.contains(c);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
            r3 = com.google.common.collect.TreeRangeSet.access$600(r2.this$0, r3);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean encloses(com.google.common.collect.Range<C> r3) {
            /*
                r2 = this;
                com.google.common.collect.Range<C> r0 = r2.restriction
                boolean r0 = r0.isEmpty()
                r1 = 0
                if (r0 != 0) goto L_0x0026
                com.google.common.collect.Range<C> r0 = r2.restriction
                boolean r0 = r0.encloses(r3)
                if (r0 == 0) goto L_0x0026
                com.google.common.collect.TreeRangeSet r0 = com.google.common.collect.TreeRangeSet.this
                com.google.common.collect.Range r3 = com.google.common.collect.TreeRangeSet.access$600(r0, r3)
                if (r3 == 0) goto L_0x0026
                com.google.common.collect.Range<C> r0 = r2.restriction
                com.google.common.collect.Range r3 = r3.intersection(r0)
                boolean r3 = r3.isEmpty()
                if (r3 != 0) goto L_0x0026
                r1 = 1
            L_0x0026:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.TreeRangeSet.SubRangeSet.encloses(com.google.common.collect.Range):boolean");
        }

        @NullableDecl
        public Range<C> rangeContaining(C c) {
            Range rangeContaining;
            if (this.restriction.contains(c) && (rangeContaining = TreeRangeSet.this.rangeContaining(c)) != null) {
                return rangeContaining.intersection(this.restriction);
            }
            return null;
        }

        public void remove(Range<C> range) {
            if (range.isConnected(this.restriction)) {
                TreeRangeSet.this.remove(range.intersection(this.restriction));
            }
        }

        public C16205o1<C> subRangeSet(Range<C> range) {
            return range.encloses(this.restriction) ? this : range.isConnected(this.restriction) ? new SubRangeSet(this.restriction.intersection(range)) : ImmutableRangeSet.m25889of();
        }
    }

    /* renamed from: com.google.common.collect.TreeRangeSet$b */
    public final class C16130b extends C16229v<Range<C>> implements Set<Range<C>> {

        /* renamed from: b */
        public final Collection<Range<C>> f36216b;

        public C16130b(Collection collection) {
            this.f36216b = collection;
        }

        public final Object delegate() {
            return this.f36216b;
        }

        public final boolean equals(@NullableDecl Object obj) {
            return Sets.m26091a(this, obj);
        }

        public final int hashCode() {
            return Sets.m26092b(this);
        }

        /* renamed from: delegate  reason: collision with other method in class */
        public final Collection<Range<C>> m35107delegate() {
            return this.f36216b;
        }
    }

    /* renamed from: com.google.common.collect.TreeRangeSet$c */
    public static final class C16131c<C extends Comparable<?>> extends C16162e<Cut<C>, Range<C>> {

        /* renamed from: b */
        public final NavigableMap<Cut<C>, Range<C>> f36217b;

        /* renamed from: c */
        public final C16134d f36218c;

        /* renamed from: d */
        public final Range<Cut<C>> f36219d;

        /* renamed from: com.google.common.collect.TreeRangeSet$c$a */
        public class C16132a extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* renamed from: d */
            public Cut<C> f36220d;

            /* renamed from: e */
            public final /* synthetic */ C16199m1 f36221e;

            public C16132a(Cut cut, Iterators.C15988e eVar) {
                this.f36221e = eVar;
                this.f36220d = cut;
            }

            /* renamed from: a */
            public final Object mo56053a() {
                Range<C> range;
                if (C16131c.this.f36219d.upperBound.isLessThan(this.f36220d) || this.f36220d == Cut.aboveAll()) {
                    this.f35745b = AbstractIterator.State.DONE;
                    return null;
                }
                if (this.f36221e.hasNext()) {
                    Range range2 = (Range) this.f36221e.next();
                    range = Range.create(this.f36220d, range2.lowerBound);
                    this.f36220d = range2.upperBound;
                } else {
                    range = Range.create(this.f36220d, Cut.aboveAll());
                    this.f36220d = Cut.aboveAll();
                }
                return new ImmutableEntry(range.lowerBound, range);
            }
        }

        /* renamed from: com.google.common.collect.TreeRangeSet$c$b */
        public class C16133b extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* renamed from: d */
            public Cut<C> f36223d;

            /* renamed from: e */
            public final /* synthetic */ C16199m1 f36224e;

            public C16133b(Cut cut, Iterators.C15988e eVar) {
                this.f36224e = eVar;
                this.f36223d = cut;
            }

            /* renamed from: a */
            public final Object mo56053a() {
                if (this.f36223d == Cut.belowAll()) {
                    this.f35745b = AbstractIterator.State.DONE;
                } else {
                    if (this.f36224e.hasNext()) {
                        Range range = (Range) this.f36224e.next();
                        Range<C> create = Range.create(range.upperBound, this.f36223d);
                        this.f36223d = range.lowerBound;
                        if (C16131c.this.f36219d.lowerBound.isLessThan(create.lowerBound)) {
                            return new ImmutableEntry(create.lowerBound, create);
                        }
                    } else if (C16131c.this.f36219d.lowerBound.isLessThan(Cut.belowAll())) {
                        Range<C> create2 = Range.create(Cut.belowAll(), this.f36223d);
                        this.f36223d = Cut.belowAll();
                        return new ImmutableEntry(Cut.belowAll(), create2);
                    }
                    this.f35745b = AbstractIterator.State.DONE;
                }
                return null;
            }
        }

        public C16131c(NavigableMap<Cut<C>, Range<C>> navigableMap, Range<Cut<C>> range) {
            this.f36217b = navigableMap;
            this.f36218c = new C16134d(navigableMap);
            this.f36219d = range;
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<Cut<C>, Range<C>>> mo56287a() {
            Collection collection;
            Cut<C> cut;
            if (this.f36219d.hasLowerBound()) {
                collection = this.f36218c.tailMap(this.f36219d.lowerEndpoint(), this.f36219d.lowerBoundType() == BoundType.CLOSED).values();
            } else {
                collection = this.f36218c.values();
            }
            Iterators.C15988e e = Iterators.m25982e(collection.iterator());
            if (this.f36219d.contains(Cut.belowAll()) && (!e.hasNext() || ((Range) e.peek()).lowerBound != Cut.belowAll())) {
                cut = Cut.belowAll();
            } else if (!e.hasNext()) {
                return Iterators.C15985b.f35974f;
            } else {
                cut = ((Range) e.next()).upperBound;
            }
            return new C16132a(cut, e);
        }

        /* renamed from: b */
        public final Iterator<Map.Entry<Cut<C>, Range<C>>> mo57544b() {
            Cut<C> cut;
            Iterators.C15988e e = Iterators.m25982e(this.f36218c.headMap(this.f36219d.hasUpperBound() ? this.f36219d.upperEndpoint() : Cut.aboveAll(), this.f36219d.hasUpperBound() && this.f36219d.upperBoundType() == BoundType.CLOSED).descendingMap().values().iterator());
            if (e.hasNext()) {
                cut = ((Range) e.peek()).upperBound == Cut.aboveAll() ? ((Range) e.next()).lowerBound : this.f36217b.higherKey(((Range) e.peek()).upperBound);
            } else if (!this.f36219d.contains(Cut.belowAll()) || this.f36217b.containsKey(Cut.belowAll())) {
                return Iterators.C15985b.f35974f;
            } else {
                cut = this.f36217b.higherKey(Cut.belowAll());
            }
            return new C16133b((Cut) C15788i.m25602a(cut, Cut.aboveAll()), e);
        }

        @NullableDecl
        /* renamed from: c */
        public final Range<C> get(Object obj) {
            if (!(obj instanceof Cut)) {
                return null;
            }
            try {
                Cut cut = (Cut) obj;
                Map.Entry firstEntry = mo57548d(Range.downTo(cut, BoundType.forBoolean(true))).firstEntry();
                if (firstEntry == null || !((Cut) firstEntry.getKey()).equals(cut)) {
                    return null;
                }
                return (Range) firstEntry.getValue();
            } catch (ClassCastException unused) {
                return null;
            }
        }

        public final Comparator<? super Cut<C>> comparator() {
            return Ordering.natural();
        }

        public final boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        /* renamed from: d */
        public final NavigableMap<Cut<C>, Range<C>> mo57548d(Range<Cut<C>> range) {
            if (!this.f36219d.isConnected(range)) {
                return ImmutableSortedMap.m25918of();
            }
            return new C16131c(this.f36217b, range.intersection(this.f36219d));
        }

        public final NavigableMap headMap(Object obj, boolean z) {
            return mo57548d(Range.upTo((Cut) obj, BoundType.forBoolean(z)));
        }

        public final int size() {
            return Iterators.m25985h(mo56287a());
        }

        public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            return mo57548d(Range.range((Cut) obj, BoundType.forBoolean(z), (Cut) obj2, BoundType.forBoolean(z2)));
        }

        public final NavigableMap tailMap(Object obj, boolean z) {
            return mo57548d(Range.downTo((Cut) obj, BoundType.forBoolean(z)));
        }
    }

    /* renamed from: com.google.common.collect.TreeRangeSet$e */
    public static final class C16137e<C extends Comparable<?>> extends C16162e<Cut<C>, Range<C>> {

        /* renamed from: b */
        public final Range<Cut<C>> f36232b;

        /* renamed from: c */
        public final Range<C> f36233c;

        /* renamed from: d */
        public final NavigableMap<Cut<C>, Range<C>> f36234d;

        /* renamed from: e */
        public final C16134d f36235e;

        /* renamed from: com.google.common.collect.TreeRangeSet$e$a */
        public class C16138a extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* renamed from: d */
            public final /* synthetic */ Iterator f36236d;

            /* renamed from: e */
            public final /* synthetic */ Cut f36237e;

            public C16138a(Iterator it, Cut cut) {
                this.f36236d = it;
                this.f36237e = cut;
            }

            /* renamed from: a */
            public final Object mo56053a() {
                if (!this.f36236d.hasNext()) {
                    this.f35745b = AbstractIterator.State.DONE;
                } else {
                    Range range = (Range) this.f36236d.next();
                    if (this.f36237e.isLessThan(range.lowerBound)) {
                        this.f35745b = AbstractIterator.State.DONE;
                    } else {
                        Range<C> intersection = range.intersection(C16137e.this.f36233c);
                        return new ImmutableEntry(intersection.lowerBound, intersection);
                    }
                }
                return null;
            }
        }

        /* renamed from: com.google.common.collect.TreeRangeSet$e$b */
        public class C16139b extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* renamed from: d */
            public final /* synthetic */ Iterator f36239d;

            public C16139b(Iterator it) {
                this.f36239d = it;
            }

            /* renamed from: a */
            public final Object mo56053a() {
                if (!this.f36239d.hasNext()) {
                    this.f35745b = AbstractIterator.State.DONE;
                } else {
                    Range range = (Range) this.f36239d.next();
                    if (C16137e.this.f36233c.lowerBound.compareTo(range.upperBound) >= 0) {
                        this.f35745b = AbstractIterator.State.DONE;
                    } else {
                        Range<C> intersection = range.intersection(C16137e.this.f36233c);
                        if (C16137e.this.f36232b.contains(intersection.lowerBound)) {
                            return new ImmutableEntry(intersection.lowerBound, intersection);
                        }
                        this.f35745b = AbstractIterator.State.DONE;
                    }
                }
                return null;
            }
        }

        public C16137e(Range<Cut<C>> range, Range<C> range2, NavigableMap<Cut<C>, Range<C>> navigableMap) {
            range.getClass();
            this.f36232b = range;
            range2.getClass();
            this.f36233c = range2;
            navigableMap.getClass();
            this.f36234d = navigableMap;
            this.f36235e = new C16134d(navigableMap);
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<Cut<C>, Range<C>>> mo56287a() {
            Iterator<Range<C>> it;
            if (this.f36233c.isEmpty()) {
                return Iterators.C15985b.f35974f;
            }
            if (this.f36232b.upperBound.isLessThan(this.f36233c.lowerBound)) {
                return Iterators.C15985b.f35974f;
            }
            boolean z = false;
            if (this.f36232b.lowerBound.isLessThan(this.f36233c.lowerBound)) {
                it = this.f36235e.tailMap(this.f36233c.lowerBound, false).values().iterator();
            } else {
                NavigableMap<Cut<C>, Range<C>> navigableMap = this.f36234d;
                C endpoint = this.f36232b.lowerBound.endpoint();
                if (this.f36232b.lowerBoundType() == BoundType.CLOSED) {
                    z = true;
                }
                it = navigableMap.tailMap(endpoint, z).values().iterator();
            }
            return new C16138a(it, (Cut) Ordering.natural().min(this.f36232b.upperBound, Cut.belowValue(this.f36233c.upperBound)));
        }

        /* renamed from: b */
        public final Iterator<Map.Entry<Cut<C>, Range<C>>> mo57544b() {
            if (this.f36233c.isEmpty()) {
                return Iterators.C15985b.f35974f;
            }
            Cut cut = (Cut) Ordering.natural().min(this.f36232b.upperBound, Cut.belowValue(this.f36233c.upperBound));
            return new C16139b(this.f36234d.headMap(cut.endpoint(), cut.typeAsUpperBound() == BoundType.CLOSED).descendingMap().values().iterator());
        }

        @NullableDecl
        /* renamed from: c */
        public final Range<C> get(@NullableDecl Object obj) {
            if (obj instanceof Cut) {
                try {
                    Cut cut = (Cut) obj;
                    if (this.f36232b.contains(cut) && cut.compareTo(this.f36233c.lowerBound) >= 0) {
                        if (cut.compareTo(this.f36233c.upperBound) < 0) {
                            if (cut.equals(this.f36233c.lowerBound)) {
                                Map.Entry<Cut<C>, Range<C>> floorEntry = this.f36234d.floorEntry(cut);
                                Range value = floorEntry == null ? null : floorEntry.getValue();
                                if (value != null && value.upperBound.compareTo(this.f36233c.lowerBound) > 0) {
                                    return value.intersection(this.f36233c);
                                }
                            } else {
                                Range range = this.f36234d.get(cut);
                                if (range != null) {
                                    return range.intersection(this.f36233c);
                                }
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        public final Comparator<? super Cut<C>> comparator() {
            return Ordering.natural();
        }

        public final boolean containsKey(@NullableDecl Object obj) {
            return get(obj) != null;
        }

        /* renamed from: d */
        public final NavigableMap<Cut<C>, Range<C>> mo57567d(Range<Cut<C>> range) {
            return !range.isConnected(this.f36232b) ? ImmutableSortedMap.m25918of() : new C16137e(this.f36232b.intersection(range), this.f36233c, this.f36234d);
        }

        public final NavigableMap headMap(Object obj, boolean z) {
            return mo57567d(Range.upTo((Cut) obj, BoundType.forBoolean(z)));
        }

        public final int size() {
            return Iterators.m25985h(mo56287a());
        }

        public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            return mo57567d(Range.range((Cut) obj, BoundType.forBoolean(z), (Cut) obj2, BoundType.forBoolean(z2)));
        }

        public final NavigableMap tailMap(Object obj, boolean z) {
            return mo57567d(Range.downTo((Cut) obj, BoundType.forBoolean(z)));
        }
    }

    public static Range access$600(TreeRangeSet treeRangeSet, Range range) {
        treeRangeSet.getClass();
        range.getClass();
        Map.Entry<Cut<C>, Range<C>> floorEntry = treeRangeSet.rangesByLowerBound.floorEntry(range.lowerBound);
        if (floorEntry == null || !floorEntry.getValue().encloses(range)) {
            return null;
        }
        return floorEntry.getValue();
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create() {
        return new TreeRangeSet<>(new TreeMap());
    }

    /* renamed from: a */
    public final void mo57539a(Range<C> range) {
        if (range.isEmpty()) {
            this.rangesByLowerBound.remove(range.lowerBound);
        } else {
            this.rangesByLowerBound.put(range.lowerBound, range);
        }
    }

    public void add(Range<C> range) {
        range.getClass();
        if (!range.isEmpty()) {
            Cut<C> cut = range.lowerBound;
            Cut<C> cut2 = range.upperBound;
            Map.Entry<K, V> lowerEntry = this.rangesByLowerBound.lowerEntry(cut);
            if (lowerEntry != null) {
                Range range2 = (Range) lowerEntry.getValue();
                if (range2.upperBound.compareTo(cut) >= 0) {
                    if (range2.upperBound.compareTo(cut2) >= 0) {
                        cut2 = range2.upperBound;
                    }
                    cut = range2.lowerBound;
                }
            }
            Map.Entry<K, V> floorEntry = this.rangesByLowerBound.floorEntry(cut2);
            if (floorEntry != null) {
                Range range3 = (Range) floorEntry.getValue();
                if (range3.upperBound.compareTo(cut2) >= 0) {
                    cut2 = range3.upperBound;
                }
            }
            this.rangesByLowerBound.subMap(cut, cut2).clear();
            mo57539a(Range.create(cut, cut2));
        }
    }

    public /* bridge */ /* synthetic */ void addAll(C16205o1 o1Var) {
        super.addAll(o1Var);
    }

    public Set<Range<C>> asDescendingSetOfRanges() {
        C16130b bVar = this.f36214c;
        if (bVar != null) {
            return bVar;
        }
        C16130b bVar2 = new C16130b(this.rangesByLowerBound.descendingMap().values());
        this.f36214c = bVar2;
        return bVar2;
    }

    public Set<Range<C>> asRanges() {
        C16130b bVar = this.f36213b;
        if (bVar != null) {
            return bVar;
        }
        C16130b bVar2 = new C16130b(this.rangesByLowerBound.values());
        this.f36213b = bVar2;
        return bVar2;
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public C16205o1<C> complement() {
        C16205o1<C> o1Var = this.f36215d;
        if (o1Var != null) {
            return o1Var;
        }
        Complement complement = new Complement();
        this.f36215d = complement;
        return complement;
    }

    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return super.contains(comparable);
    }

    public boolean encloses(Range<C> range) {
        range.getClass();
        Map.Entry<Cut<C>, Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(range.lowerBound);
        return floorEntry != null && floorEntry.getValue().encloses(range);
    }

    public /* bridge */ /* synthetic */ boolean enclosesAll(C16205o1 o1Var) {
        return super.enclosesAll(o1Var);
    }

    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    public boolean intersects(Range<C> range) {
        range.getClass();
        Map.Entry<Cut<C>, Range<C>> ceilingEntry = this.rangesByLowerBound.ceilingEntry(range.lowerBound);
        if (ceilingEntry != null && ceilingEntry.getValue().isConnected(range) && !ceilingEntry.getValue().intersection(range).isEmpty()) {
            return true;
        }
        Map.Entry<Cut<C>, Range<C>> lowerEntry = this.rangesByLowerBound.lowerEntry(range.lowerBound);
        return lowerEntry != null && lowerEntry.getValue().isConnected(range) && !lowerEntry.getValue().intersection(range).isEmpty();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @NullableDecl
    public Range<C> rangeContaining(C c) {
        c.getClass();
        Map.Entry<Cut<C>, Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(Cut.belowValue(c));
        if (floorEntry == null || !floorEntry.getValue().contains(c)) {
            return null;
        }
        return floorEntry.getValue();
    }

    public void remove(Range<C> range) {
        range.getClass();
        if (!range.isEmpty()) {
            Map.Entry<Cut<C>, Range<C>> lowerEntry = this.rangesByLowerBound.lowerEntry(range.lowerBound);
            if (lowerEntry != null) {
                Range value = lowerEntry.getValue();
                if (value.upperBound.compareTo(range.lowerBound) >= 0) {
                    if (range.hasUpperBound() && value.upperBound.compareTo(range.upperBound) >= 0) {
                        mo57539a(Range.create(range.upperBound, value.upperBound));
                    }
                    mo57539a(Range.create(value.lowerBound, range.lowerBound));
                }
            }
            Map.Entry<Cut<C>, Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(range.upperBound);
            if (floorEntry != null) {
                Range value2 = floorEntry.getValue();
                if (range.hasUpperBound() && value2.upperBound.compareTo(range.upperBound) >= 0) {
                    mo57539a(Range.create(range.upperBound, value2.upperBound));
                }
            }
            this.rangesByLowerBound.subMap(range.lowerBound, range.upperBound).clear();
        }
    }

    public /* bridge */ /* synthetic */ void removeAll(C16205o1 o1Var) {
        super.removeAll(o1Var);
    }

    public Range<C> span() {
        Map.Entry<Cut<C>, Range<C>> firstEntry = this.rangesByLowerBound.firstEntry();
        Map.Entry<Cut<C>, Range<C>> lastEntry = this.rangesByLowerBound.lastEntry();
        if (firstEntry != null) {
            return Range.create(firstEntry.getValue().lowerBound, lastEntry.getValue().upperBound);
        }
        throw new NoSuchElementException();
    }

    public C16205o1<C> subRangeSet(Range<C> range) {
        return range.equals(Range.all()) ? this : new SubRangeSet(range);
    }

    public TreeRangeSet(NavigableMap<Cut<C>, Range<C>> navigableMap) {
        this.rangesByLowerBound = navigableMap;
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(C16205o1<C> o1Var) {
        TreeRangeSet<C> create = create();
        create.addAll((C16205o1) o1Var);
        return create;
    }

    public /* bridge */ /* synthetic */ void addAll(Iterable iterable) {
        super.addAll(iterable);
    }

    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
        return super.enclosesAll(iterable);
    }

    public /* bridge */ /* synthetic */ void removeAll(Iterable iterable) {
        super.removeAll(iterable);
    }

    /* renamed from: com.google.common.collect.TreeRangeSet$d */
    public static final class C16134d<C extends Comparable<?>> extends C16162e<Cut<C>, Range<C>> {

        /* renamed from: b */
        public final NavigableMap<Cut<C>, Range<C>> f36226b;

        /* renamed from: c */
        public final Range<Cut<C>> f36227c;

        /* renamed from: com.google.common.collect.TreeRangeSet$d$a */
        public class C16135a extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* renamed from: d */
            public final /* synthetic */ Iterator f36228d;

            public C16135a(Iterator it) {
                this.f36228d = it;
            }

            /* renamed from: a */
            public final Object mo56053a() {
                if (!this.f36228d.hasNext()) {
                    this.f35745b = AbstractIterator.State.DONE;
                } else {
                    Range range = (Range) this.f36228d.next();
                    if (!C16134d.this.f36227c.upperBound.isLessThan(range.upperBound)) {
                        return new ImmutableEntry(range.upperBound, range);
                    }
                    this.f35745b = AbstractIterator.State.DONE;
                }
                return null;
            }
        }

        /* renamed from: com.google.common.collect.TreeRangeSet$d$b */
        public class C16136b extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* renamed from: d */
            public final /* synthetic */ C16199m1 f36230d;

            public C16136b(Iterators.C15988e eVar) {
                this.f36230d = eVar;
            }

            /* renamed from: a */
            public final Object mo56053a() {
                if (!this.f36230d.hasNext()) {
                    this.f35745b = AbstractIterator.State.DONE;
                } else {
                    Range range = (Range) this.f36230d.next();
                    if (C16134d.this.f36227c.lowerBound.isLessThan(range.upperBound)) {
                        return new ImmutableEntry(range.upperBound, range);
                    }
                    this.f35745b = AbstractIterator.State.DONE;
                }
                return null;
            }
        }

        public C16134d(NavigableMap<Cut<C>, Range<C>> navigableMap) {
            this.f36226b = navigableMap;
            this.f36227c = Range.all();
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<Cut<C>, Range<C>>> mo56287a() {
            Iterator<V> it;
            if (!this.f36227c.hasLowerBound()) {
                it = this.f36226b.values().iterator();
            } else {
                Map.Entry<Cut<C>, Range<C>> lowerEntry = this.f36226b.lowerEntry(this.f36227c.lowerEndpoint());
                it = lowerEntry == null ? this.f36226b.values().iterator() : this.f36227c.lowerBound.isLessThan(lowerEntry.getValue().upperBound) ? this.f36226b.tailMap(lowerEntry.getKey(), true).values().iterator() : this.f36226b.tailMap(this.f36227c.lowerEndpoint(), true).values().iterator();
            }
            return new C16135a(it);
        }

        /* renamed from: b */
        public final Iterator<Map.Entry<Cut<C>, Range<C>>> mo57544b() {
            Iterators.C15988e e = Iterators.m25982e((this.f36227c.hasUpperBound() ? this.f36226b.headMap(this.f36227c.upperEndpoint(), false).descendingMap().values() : this.f36226b.descendingMap().values()).iterator());
            if (e.hasNext() && this.f36227c.upperBound.isLessThan(((Range) e.peek()).upperBound)) {
                e.next();
            }
            return new C16136b(e);
        }

        /* renamed from: c */
        public final Range<C> get(@NullableDecl Object obj) {
            Map.Entry<Cut<C>, Range<C>> lowerEntry;
            if (obj instanceof Cut) {
                try {
                    Cut cut = (Cut) obj;
                    if (this.f36227c.contains(cut) && (lowerEntry = this.f36226b.lowerEntry(cut)) != null && lowerEntry.getValue().upperBound.equals(cut)) {
                        return lowerEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        public final Comparator<? super Cut<C>> comparator() {
            return Ordering.natural();
        }

        public final boolean containsKey(@NullableDecl Object obj) {
            return get(obj) != null;
        }

        /* renamed from: d */
        public final NavigableMap<Cut<C>, Range<C>> mo57557d(Range<Cut<C>> range) {
            return range.isConnected(this.f36227c) ? new C16134d(this.f36226b, range.intersection(this.f36227c)) : ImmutableSortedMap.m25918of();
        }

        public final NavigableMap headMap(Object obj, boolean z) {
            return mo57557d(Range.upTo((Cut) obj, BoundType.forBoolean(z)));
        }

        public final boolean isEmpty() {
            return this.f36227c.equals(Range.all()) ? this.f36226b.isEmpty() : !((AbstractIterator) mo56287a()).hasNext();
        }

        public final int size() {
            return this.f36227c.equals(Range.all()) ? this.f36226b.size() : Iterators.m25985h(mo56287a());
        }

        public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            return mo57557d(Range.range((Cut) obj, BoundType.forBoolean(z), (Cut) obj2, BoundType.forBoolean(z2)));
        }

        public final NavigableMap tailMap(Object obj, boolean z) {
            return mo57557d(Range.downTo((Cut) obj, BoundType.forBoolean(z)));
        }

        public C16134d(NavigableMap<Cut<C>, Range<C>> navigableMap, Range<Cut<C>> range) {
            this.f36226b = navigableMap;
            this.f36227c = range;
        }
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(Iterable<Range<C>> iterable) {
        TreeRangeSet<C> create = create();
        create.addAll((Iterable) iterable);
        return create;
    }
}
