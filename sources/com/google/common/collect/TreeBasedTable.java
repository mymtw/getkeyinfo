package com.google.common.collect;

import com.google.common.base.C15784e;
import com.google.common.base.C15794l;
import com.google.common.base.C15804s;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public class TreeBasedTable<R, C, V> extends StandardRowSortedTable<R, C, V> {
    private static final long serialVersionUID = 0;
    private final Comparator<? super C> columnComparator;

    public static class Factory<C, V> implements C15804s<TreeMap<C, V>>, Serializable {
        private static final long serialVersionUID = 0;
        public final Comparator<? super C> comparator;

        public Factory(Comparator<? super C> comparator2) {
            this.comparator = comparator2;
        }

        public TreeMap<C, V> get() {
            return new TreeMap<>(this.comparator);
        }
    }

    /* renamed from: com.google.common.collect.TreeBasedTable$a */
    public class C16119a implements C15784e<Map<C, V>, Iterator<C>> {
        public final Object apply(Object obj) {
            return ((Map) obj).keySet().iterator();
        }
    }

    /* renamed from: com.google.common.collect.TreeBasedTable$b */
    public class C16120b extends AbstractIterator<C> {
        @NullableDecl

        /* renamed from: d */
        public C f36184d;

        /* renamed from: e */
        public final /* synthetic */ Iterator f36185e;

        /* renamed from: f */
        public final /* synthetic */ Comparator f36186f;

        public C16120b(Iterators.C15987d dVar, Comparator comparator) {
            this.f36185e = dVar;
            this.f36186f = comparator;
        }

        /* renamed from: a */
        public final C mo56053a() {
            boolean z;
            while (this.f36185e.hasNext()) {
                C next = this.f36185e.next();
                C c = this.f36184d;
                if (c == null || this.f36186f.compare(next, c) != 0) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (!z) {
                    this.f36184d = next;
                    return next;
                }
            }
            this.f36184d = null;
            this.f35745b = AbstractIterator.State.DONE;
            return null;
        }
    }

    /* renamed from: com.google.common.collect.TreeBasedTable$c */
    public class C16121c extends StandardTable<R, C, V>.f implements SortedMap<C, V> {
        @NullableDecl

        /* renamed from: e */
        public final C f36187e;
        @NullableDecl

        /* renamed from: f */
        public final C f36188f;
        @NullableDecl

        /* renamed from: g */
        public transient SortedMap<C, V> f36189g;

        public C16121c(R r, @NullableDecl C c, @NullableDecl C c2) {
            super(r);
            this.f36187e = c;
            this.f36188f = c2;
            C15794l.m25613g(c == null || c2 == null || comparator().compare(c, c2) <= 0);
        }

        /* renamed from: b */
        public final Map mo57359b() {
            return (SortedMap) super.mo57359b();
        }

        /* renamed from: c */
        public final Map mo57360c() {
            SortedMap f = mo57500f();
            if (f == null) {
                return null;
            }
            C c = this.f36187e;
            if (c != null) {
                f = f.tailMap(c);
            }
            C c2 = this.f36188f;
            return c2 != null ? f.headMap(c2) : f;
        }

        public final Comparator<? super C> comparator() {
            return TreeBasedTable.this.columnComparator();
        }

        public final boolean containsKey(Object obj) {
            return mo57499e(obj) && super.containsKey(obj);
        }

        /* renamed from: d */
        public final void mo57362d() {
            if (mo57500f() != null && this.f36189g.isEmpty()) {
                TreeBasedTable.this.backingMap.remove(this.f36168b);
                this.f36189g = null;
                this.f36169c = null;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
            r0 = r2.f36187e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
            r0 = r2.f36188f;
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo57499e(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
            /*
                r2 = this;
                if (r3 == 0) goto L_0x0020
                C r0 = r2.f36187e
                if (r0 == 0) goto L_0x0010
                java.util.Comparator r1 = r2.comparator()
                int r0 = r1.compare(r0, r3)
                if (r0 > 0) goto L_0x0020
            L_0x0010:
                C r0 = r2.f36188f
                if (r0 == 0) goto L_0x001e
                java.util.Comparator r1 = r2.comparator()
                int r3 = r1.compare(r0, r3)
                if (r3 <= 0) goto L_0x0020
            L_0x001e:
                r3 = 1
                goto L_0x0021
            L_0x0020:
                r3 = 0
            L_0x0021:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.TreeBasedTable.C16121c.mo57499e(java.lang.Object):boolean");
        }

        /* renamed from: f */
        public final SortedMap<C, V> mo57500f() {
            SortedMap<C, V> sortedMap = this.f36189g;
            if (sortedMap == null || (sortedMap.isEmpty() && TreeBasedTable.this.backingMap.containsKey(this.f36168b))) {
                this.f36189g = (SortedMap) TreeBasedTable.this.backingMap.get(this.f36168b);
            }
            return this.f36189g;
        }

        public final C firstKey() {
            if (((SortedMap) super.mo57359b()) != null) {
                return ((SortedMap) super.mo57359b()).firstKey();
            }
            throw new NoSuchElementException();
        }

        public final SortedMap<C, V> headMap(C c) {
            c.getClass();
            C15794l.m25613g(mo57499e(c));
            return new C16121c(this.f36168b, this.f36187e, c);
        }

        public final Set keySet() {
            return new Maps.C16046g(this);
        }

        public final C lastKey() {
            if (((SortedMap) super.mo57359b()) != null) {
                return ((SortedMap) super.mo57359b()).lastKey();
            }
            throw new NoSuchElementException();
        }

        public final V put(C c, V v) {
            c.getClass();
            C15794l.m25613g(mo57499e(c));
            return super.put(c, v);
        }

        public final SortedMap<C, V> subMap(C c, C c2) {
            boolean z;
            c.getClass();
            if (mo57499e(c)) {
                c2.getClass();
                if (mo57499e(c2)) {
                    z = true;
                    C15794l.m25613g(z);
                    return new C16121c(this.f36168b, c, c2);
                }
            }
            z = false;
            C15794l.m25613g(z);
            return new C16121c(this.f36168b, c, c2);
        }

        public final SortedMap<C, V> tailMap(C c) {
            c.getClass();
            C15794l.m25613g(mo57499e(c));
            return new C16121c(this.f36168b, c, this.f36188f);
        }
    }

    public TreeBasedTable(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        super(new TreeMap(comparator), new Factory(comparator2));
        this.columnComparator = comparator2;
    }

    public static <R extends Comparable, C extends Comparable, V> TreeBasedTable<R, C, V> create() {
        return new TreeBasedTable<>(Ordering.natural(), Ordering.natural());
    }

    public /* bridge */ /* synthetic */ Set cellSet() {
        return super.cellSet();
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ Map column(Object obj) {
        return super.column(obj);
    }

    @Deprecated
    public Comparator<? super C> columnComparator() {
        return this.columnComparator;
    }

    public /* bridge */ /* synthetic */ Set columnKeySet() {
        return super.columnKeySet();
    }

    public /* bridge */ /* synthetic */ Map columnMap() {
        return super.columnMap();
    }

    public /* bridge */ /* synthetic */ boolean contains(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.contains(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean containsColumn(@NullableDecl Object obj) {
        return super.containsColumn(obj);
    }

    public /* bridge */ /* synthetic */ boolean containsRow(@NullableDecl Object obj) {
        return super.containsRow(obj);
    }

    public /* bridge */ /* synthetic */ boolean containsValue(@NullableDecl Object obj) {
        return super.containsValue(obj);
    }

    public Iterator<C> createColumnKeyIterator() {
        Comparator columnComparator2 = columnComparator();
        Collection<Map<C, V>> values = this.backingMap.values();
        C16119a aVar = new C16119a();
        values.getClass();
        C16194l0 l0Var = new C16194l0(values, aVar);
        C15794l.m25617k(columnComparator2, "comparator");
        return new C16120b(new Iterators.C15987d(l0Var, columnComparator2), columnComparator2);
    }

    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ Object get(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.get(obj, obj2);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2, Object obj3) {
        return super.put(obj, obj2, obj3);
    }

    public /* bridge */ /* synthetic */ void putAll(C16147b2 b2Var) {
        super.putAll(b2Var);
    }

    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Object remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.remove(obj, obj2);
    }

    @Deprecated
    public Comparator<? super R> rowComparator() {
        return rowKeySet().comparator();
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public static <R, C, V> TreeBasedTable<R, C, V> create(TreeBasedTable<R, C, ? extends V> treeBasedTable) {
        TreeBasedTable<R, C, V> treeBasedTable2 = new TreeBasedTable<>(treeBasedTable.rowComparator(), treeBasedTable.columnComparator());
        treeBasedTable2.putAll(treeBasedTable);
        return treeBasedTable2;
    }

    public SortedMap<C, V> row(R r) {
        return new C16121c(r, null, null);
    }

    public SortedSet<R> rowKeySet() {
        return super.rowKeySet();
    }

    public SortedMap<R, Map<C, V>> rowMap() {
        return super.rowMap();
    }

    public static <R, C, V> TreeBasedTable<R, C, V> create(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        comparator.getClass();
        comparator2.getClass();
        return new TreeBasedTable<>(comparator, comparator2);
    }
}
