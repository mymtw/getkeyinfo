package com.google.common.collect;

import com.google.common.base.C15794l;
import com.google.common.collect.C16149c;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p156k.C7159a;

abstract class AbstractMapBasedMultimap<K, V> extends C16149c<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* renamed from: g */
    public transient Map<K, Collection<V>> f35748g;

    /* renamed from: h */
    public transient int f35749h;

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$a */
    public class C15885a extends AbstractMapBasedMultimap<K, V>.d<V> {
        public C15885a(AbstractMapBasedMultimap abstractMapBasedMultimap) {
            super();
        }

        /* renamed from: a */
        public final V mo56084a(K k, V v) {
            return v;
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$b */
    public class C15886b extends AbstractMapBasedMultimap<K, V>.d<Map.Entry<K, V>> {
        public C15886b(AbstractMapBasedMultimap abstractMapBasedMultimap) {
            super();
        }

        /* renamed from: a */
        public final Object mo56084a(Object obj, Object obj2) {
            return new ImmutableEntry(obj, obj2);
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$c */
    public class C15887c extends Maps.C16052m<K, Collection<V>> {

        /* renamed from: e */
        public final transient Map<K, Collection<V>> f35750e;

        /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$c$a */
        public class C15888a extends Maps.C16040b<K, Collection<V>> {
            public C15888a() {
            }

            /* renamed from: a */
            public final Map<K, Collection<V>> mo56096a() {
                return C15887c.this;
            }

            public final boolean contains(Object obj) {
                Set<Map.Entry<K, Collection<V>>> entrySet = C15887c.this.f35750e.entrySet();
                entrySet.getClass();
                try {
                    return entrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }

            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C15889b();
            }

            public final boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                AbstractMapBasedMultimap.access$300(AbstractMapBasedMultimap.this, ((Map.Entry) obj).getKey());
                return true;
            }
        }

        /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$c$b */
        public class C15889b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: b */
            public final Iterator<Map.Entry<K, Collection<V>>> f35753b;
            @NullableDecl

            /* renamed from: c */
            public Collection<V> f35754c;

            public C15889b() {
                this.f35753b = C15887c.this.f35750e.entrySet().iterator();
            }

            public final boolean hasNext() {
                return this.f35753b.hasNext();
            }

            public final Object next() {
                Map.Entry next = this.f35753b.next();
                this.f35754c = (Collection) next.getValue();
                return C15887c.this.mo56088d(next);
            }

            public final void remove() {
                C16203o.m26218e(this.f35754c != null);
                this.f35753b.remove();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                int unused = abstractMapBasedMultimap.f35749h = abstractMapBasedMultimap.f35749h - this.f35754c.size();
                this.f35754c.clear();
                this.f35754c = null;
            }
        }

        public C15887c(Map<K, Collection<V>> map) {
            this.f35750e = map;
        }

        /* renamed from: a */
        public final Set<Map.Entry<K, Collection<V>>> mo56085a() {
            return new C15888a();
        }

        public final void clear() {
            if (this.f35750e == AbstractMapBasedMultimap.this.f35748g) {
                AbstractMapBasedMultimap.this.clear();
            } else {
                Iterators.m25979b(new C15889b());
            }
        }

        public final boolean containsKey(Object obj) {
            Map<K, Collection<V>> map = this.f35750e;
            map.getClass();
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        /* renamed from: d */
        public final Map.Entry<K, Collection<V>> mo56088d(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return new ImmutableEntry(key, AbstractMapBasedMultimap.this.wrapCollection(key, entry.getValue()));
        }

        public final boolean equals(@NullableDecl Object obj) {
            return this == obj || this.f35750e.equals(obj);
        }

        public final Object get(Object obj) {
            Collection collection = (Collection) Maps.m26057e(obj, this.f35750e);
            if (collection == null) {
                return null;
            }
            return AbstractMapBasedMultimap.this.wrapCollection(obj, collection);
        }

        public final int hashCode() {
            return this.f35750e.hashCode();
        }

        public Set<K> keySet() {
            return AbstractMapBasedMultimap.this.keySet();
        }

        public final Object remove(Object obj) {
            Collection remove = this.f35750e.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection createCollection = AbstractMapBasedMultimap.this.createCollection();
            createCollection.addAll(remove);
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            int unused = abstractMapBasedMultimap.f35749h = abstractMapBasedMultimap.f35749h - remove.size();
            remove.clear();
            return createCollection;
        }

        public final int size() {
            return this.f35750e.size();
        }

        public final String toString() {
            return this.f35750e.toString();
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$d */
    public abstract class C15890d<T> implements Iterator<T> {

        /* renamed from: b */
        public final Iterator<Map.Entry<K, Collection<V>>> f35756b;
        @NullableDecl

        /* renamed from: c */
        public K f35757c = null;
        @MonotonicNonNullDecl

        /* renamed from: d */
        public Collection<V> f35758d = null;

        /* renamed from: e */
        public Iterator<V> f35759e = Iterators.EmptyModifiableIterator.INSTANCE;

        public C15890d() {
            this.f35756b = AbstractMapBasedMultimap.this.f35748g.entrySet().iterator();
        }

        /* renamed from: a */
        public abstract T mo56084a(K k, V v);

        public final boolean hasNext() {
            return this.f35756b.hasNext() || this.f35759e.hasNext();
        }

        public final T next() {
            if (!this.f35759e.hasNext()) {
                Map.Entry next = this.f35756b.next();
                this.f35757c = next.getKey();
                Collection<V> collection = (Collection) next.getValue();
                this.f35758d = collection;
                this.f35759e = collection.iterator();
            }
            return mo56084a(this.f35757c, this.f35759e.next());
        }

        public final void remove() {
            this.f35759e.remove();
            if (this.f35758d.isEmpty()) {
                this.f35756b.remove();
            }
            AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$e */
    public class C15891e extends Maps.C16044e<K, Collection<V>> {

        /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$e$a */
        public class C15892a implements Iterator<K> {
            @NullableDecl

            /* renamed from: b */
            public Map.Entry<K, Collection<V>> f35762b;

            /* renamed from: c */
            public final /* synthetic */ Iterator f35763c;

            public C15892a(Iterator it) {
                this.f35763c = it;
            }

            public final boolean hasNext() {
                return this.f35763c.hasNext();
            }

            public final K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f35763c.next();
                this.f35762b = entry;
                return entry.getKey();
            }

            public final void remove() {
                C16203o.m26218e(this.f35762b != null);
                Collection value = this.f35762b.getValue();
                this.f35763c.remove();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                int unused = abstractMapBasedMultimap.f35749h = abstractMapBasedMultimap.f35749h - value.size();
                value.clear();
                this.f35762b = null;
            }
        }

        public C15891e(Map<K, Collection<V>> map) {
            super(map);
        }

        public final void clear() {
            Iterators.m25979b(iterator());
        }

        public final boolean containsAll(Collection<?> collection) {
            return this.f36080b.keySet().containsAll(collection);
        }

        public final boolean equals(@NullableDecl Object obj) {
            return this == obj || this.f36080b.keySet().equals(obj);
        }

        public final int hashCode() {
            return this.f36080b.keySet().hashCode();
        }

        public final Iterator<K> iterator() {
            return new C15892a(this.f36080b.entrySet().iterator());
        }

        public final boolean remove(Object obj) {
            int i;
            Collection collection = (Collection) this.f36080b.remove(obj);
            if (collection != null) {
                i = collection.size();
                collection.clear();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                int unused = abstractMapBasedMultimap.f35749h = abstractMapBasedMultimap.f35749h - i;
            } else {
                i = 0;
            }
            return i > 0;
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$f */
    public class C15893f extends AbstractMapBasedMultimap<K, V>.i implements NavigableMap<K, Collection<V>> {
        public C15893f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        /* renamed from: b */
        public final Set mo56115b() {
            return new C15894g(mo56125g());
        }

        public final Map.Entry<K, Collection<V>> ceilingEntry(K k) {
            Map.Entry ceilingEntry = mo56125g().ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return mo56088d(ceilingEntry);
        }

        public final K ceilingKey(K k) {
            return mo56125g().ceilingKey(k);
        }

        public final NavigableSet<K> descendingKeySet() {
            return ((C15893f) descendingMap()).navigableKeySet();
        }

        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new C15893f(mo56125g().descendingMap());
        }

        /* renamed from: e */
        public final SortedSet mo56120e() {
            return new C15894g(mo56125g());
        }

        /* renamed from: f */
        public final SortedSet mo56121f() {
            return (NavigableSet) super.keySet();
        }

        public final Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry firstEntry = mo56125g().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return mo56088d(firstEntry);
        }

        public final Map.Entry<K, Collection<V>> floorEntry(K k) {
            Map.Entry floorEntry = mo56125g().floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return mo56088d(floorEntry);
        }

        public final K floorKey(K k) {
            return mo56125g().floorKey(k);
        }

        /* renamed from: h */
        public final Map.Entry<K, Collection<V>> mo56126h(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry next = it.next();
            Collection createCollection = AbstractMapBasedMultimap.this.createCollection();
            createCollection.addAll((Collection) next.getValue());
            it.remove();
            return new ImmutableEntry(next.getKey(), AbstractMapBasedMultimap.this.unmodifiableCollectionSubclass(createCollection));
        }

        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        public final Map.Entry<K, Collection<V>> higherEntry(K k) {
            Map.Entry higherEntry = mo56125g().higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return mo56088d(higherEntry);
        }

        public final K higherKey(K k) {
            return mo56125g().higherKey(k);
        }

        /* renamed from: i */
        public final NavigableMap<K, Collection<V>> mo56125g() {
            return (NavigableMap) ((SortedMap) this.f35750e);
        }

        public final Set keySet() {
            return (NavigableSet) super.keySet();
        }

        public final Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry lastEntry = mo56125g().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return mo56088d(lastEntry);
        }

        public final Map.Entry<K, Collection<V>> lowerEntry(K k) {
            Map.Entry lowerEntry = mo56125g().lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return mo56088d(lowerEntry);
        }

        public final K lowerKey(K k) {
            return mo56125g().lowerKey(k);
        }

        public final NavigableSet<K> navigableKeySet() {
            return (NavigableSet) super.keySet();
        }

        public final Map.Entry<K, Collection<V>> pollFirstEntry() {
            return mo56126h(entrySet().iterator());
        }

        public final Map.Entry<K, Collection<V>> pollLastEntry() {
            return mo56126h(((Maps.C16052m) descendingMap()).entrySet().iterator());
        }

        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        public final NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new C15893f(mo56125g().headMap(k, z));
        }

        public final NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new C15893f(mo56125g().subMap(k, z, k2, z2));
        }

        public final NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new C15893f(mo56125g().tailMap(k, z));
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$g */
    public class C15894g extends AbstractMapBasedMultimap<K, V>.j implements NavigableSet<K> {
        public C15894g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public final K ceiling(K k) {
            return mo56142c().ceilingKey(k);
        }

        public final Iterator<K> descendingIterator() {
            return ((C15891e) descendingSet()).iterator();
        }

        public final NavigableSet<K> descendingSet() {
            return new C15894g(mo56142c().descendingMap());
        }

        /* renamed from: e */
        public final NavigableMap<K, Collection<V>> mo56142c() {
            return (NavigableMap) ((SortedMap) this.f36080b);
        }

        public final K floor(K k) {
            return mo56142c().floorKey(k);
        }

        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        public final K higher(K k) {
            return mo56142c().higherKey(k);
        }

        public final K lower(K k) {
            return mo56142c().lowerKey(k);
        }

        public final K pollFirst() {
            return Iterators.m25983f(iterator());
        }

        public final K pollLast() {
            return Iterators.m25983f(descendingIterator());
        }

        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        public final NavigableSet<K> headSet(K k, boolean z) {
            return new C15894g(mo56142c().headMap(k, z));
        }

        public final NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new C15894g(mo56142c().subMap(k, z, k2, z2));
        }

        public final NavigableSet<K> tailSet(K k, boolean z) {
            return new C15894g(mo56142c().tailMap(k, z));
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$h */
    public class C15895h extends AbstractMapBasedMultimap<K, V>.l implements RandomAccess {
        public C15895h(@NullableDecl AbstractMapBasedMultimap abstractMapBasedMultimap, K k, @NullableDecl List<V> list, AbstractMapBasedMultimap<K, V>.k kVar) {
            super(k, list, kVar);
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$i */
    public class C15896i extends AbstractMapBasedMultimap<K, V>.c implements SortedMap<K, Collection<V>> {
        @MonotonicNonNullDecl

        /* renamed from: g */
        public SortedSet<K> f35767g;

        public C15896i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public final Comparator<? super K> comparator() {
            return mo56125g().comparator();
        }

        /* renamed from: e */
        public SortedSet<K> mo56115b() {
            return new C15897j(mo56125g());
        }

        /* renamed from: f */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f35767g;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> e = mo56115b();
            this.f35767g = e;
            return e;
        }

        public final K firstKey() {
            return mo56125g().firstKey();
        }

        /* renamed from: g */
        public SortedMap<K, Collection<V>> mo56125g() {
            return (SortedMap) this.f35750e;
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new C15896i(mo56125g().headMap(k));
        }

        public final K lastKey() {
            return mo56125g().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new C15896i(mo56125g().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new C15896i(mo56125g().tailMap(k));
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$j */
    public class C15897j extends AbstractMapBasedMultimap<K, V>.e implements SortedSet<K> {
        public C15897j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* renamed from: c */
        public SortedMap<K, Collection<V>> mo56142c() {
            return (SortedMap) this.f36080b;
        }

        public final Comparator<? super K> comparator() {
            return mo56142c().comparator();
        }

        public final K first() {
            return mo56142c().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new C15897j(mo56142c().headMap(k));
        }

        public final K last() {
            return mo56142c().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new C15897j(mo56142c().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new C15897j(mo56142c().tailMap(k));
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$m */
    public class C15902m extends AbstractMapBasedMultimap<K, V>.o implements NavigableSet<V> {
        public C15902m(@NullableDecl K k, NavigableSet<V> navigableSet, @NullableDecl AbstractMapBasedMultimap<K, V>.k kVar) {
            super(k, navigableSet, kVar);
        }

        public final V ceiling(V v) {
            return mo56205g().ceiling(v);
        }

        public final Iterator<V> descendingIterator() {
            return new C15898k.C15899a(mo56205g().descendingIterator());
        }

        public final NavigableSet<V> descendingSet() {
            return mo56210m(mo56205g().descendingSet());
        }

        public final V floor(V v) {
            return mo56205g().floor(v);
        }

        public final NavigableSet<V> headSet(V v, boolean z) {
            return mo56210m(mo56205g().headSet(v, z));
        }

        public final V higher(V v) {
            return mo56205g().higher(v);
        }

        /* renamed from: l */
        public final NavigableSet<V> mo56205g() {
            return (NavigableSet) ((SortedSet) this.f35771c);
        }

        public final V lower(V v) {
            return mo56205g().lower(v);
        }

        /* renamed from: m */
        public final C15902m mo56210m(NavigableSet navigableSet) {
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            K k = this.f35770b;
            AbstractMapBasedMultimap<K, V>.k kVar = this.f35772d;
            if (kVar == null) {
                kVar = this;
            }
            return new C15902m(k, navigableSet, kVar);
        }

        public final V pollFirst() {
            return Iterators.m25983f(iterator());
        }

        public final V pollLast() {
            return Iterators.m25983f(descendingIterator());
        }

        public final NavigableSet<V> subSet(V v, boolean z, V v2, boolean z2) {
            return mo56210m(mo56205g().subSet(v, z, v2, z2));
        }

        public final NavigableSet<V> tailSet(V v, boolean z) {
            return mo56210m(mo56205g().tailSet(v, z));
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$n */
    public class C15903n extends AbstractMapBasedMultimap<K, V>.k implements Set<V> {
        public C15903n(@NullableDecl K k, Set<V> set) {
            super(k, set, (AbstractMapBasedMultimap<K, V>.k) null);
        }

        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean d = Sets.m26094d((Set) this.f35771c, collection);
            if (d) {
                int size2 = this.f35771c.size();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                int unused = abstractMapBasedMultimap.f35749h = (size2 - size) + abstractMapBasedMultimap.f35749h;
                mo56171e();
            }
            return d;
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$o */
    public class C15904o extends AbstractMapBasedMultimap<K, V>.k implements SortedSet<V> {
        public C15904o(@NullableDecl K k, SortedSet<V> sortedSet, @NullableDecl AbstractMapBasedMultimap<K, V>.k kVar) {
            super(k, sortedSet, kVar);
        }

        public final Comparator<? super V> comparator() {
            return mo56205g().comparator();
        }

        public final V first() {
            mo56167c();
            return mo56205g().first();
        }

        /* renamed from: g */
        public SortedSet<V> mo56205g() {
            return (SortedSet) this.f35771c;
        }

        public final SortedSet<V> headSet(V v) {
            mo56167c();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            K k = this.f35770b;
            SortedSet headSet = mo56205g().headSet(v);
            AbstractMapBasedMultimap<K, V>.k kVar = this.f35772d;
            if (kVar == null) {
                kVar = this;
            }
            return new C15904o(k, headSet, kVar);
        }

        public final V last() {
            mo56167c();
            return mo56205g().last();
        }

        public final SortedSet<V> subSet(V v, V v2) {
            mo56167c();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            K k = this.f35770b;
            SortedSet subSet = mo56205g().subSet(v, v2);
            AbstractMapBasedMultimap<K, V>.k kVar = this.f35772d;
            if (kVar == null) {
                kVar = this;
            }
            return new C15904o(k, subSet, kVar);
        }

        public final SortedSet<V> tailSet(V v) {
            mo56167c();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            K k = this.f35770b;
            SortedSet tailSet = mo56205g().tailSet(v);
            AbstractMapBasedMultimap<K, V>.k kVar = this.f35772d;
            if (kVar == null) {
                kVar = this;
            }
            return new C15904o(k, tailSet, kVar);
        }
    }

    public AbstractMapBasedMultimap(Map<K, Collection<V>> map) {
        C15794l.m25613g(map.isEmpty());
        this.f35748g = map;
    }

    public static Iterator access$100(Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public static /* synthetic */ int access$208(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i = abstractMapBasedMultimap.f35749h;
        abstractMapBasedMultimap.f35749h = i + 1;
        return i;
    }

    public static /* synthetic */ int access$210(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i = abstractMapBasedMultimap.f35749h;
        abstractMapBasedMultimap.f35749h = i - 1;
        return i;
    }

    public static void access$300(AbstractMapBasedMultimap abstractMapBasedMultimap, Object obj) {
        Collection<V> collection;
        Map<K, Collection<V>> map = abstractMapBasedMultimap.f35748g;
        map.getClass();
        try {
            collection = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            collection = null;
        }
        Collection collection2 = collection;
        if (collection2 != null) {
            int size = collection2.size();
            collection2.clear();
            abstractMapBasedMultimap.f35749h -= size;
        }
    }

    public Map<K, Collection<V>> backingMap() {
        return this.f35748g;
    }

    public void clear() {
        for (Collection<V> clear : this.f35748g.values()) {
            clear.clear();
        }
        this.f35748g.clear();
        this.f35749h = 0;
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return this.f35748g.containsKey(obj);
    }

    public Map<K, Collection<V>> createAsMap() {
        return new C15887c(this.f35748g);
    }

    public abstract Collection<V> createCollection();

    public Collection<V> createCollection(@NullableDecl K k) {
        return createCollection();
    }

    public Collection<Map.Entry<K, V>> createEntries() {
        return this instanceof C16217r1 ? new C16149c.C16151b(this) : new C16149c.C16150a();
    }

    public Set<K> createKeySet() {
        return new C15891e(this.f35748g);
    }

    public C16178h1<K> createKeys() {
        return new Multimaps.C16062c(this);
    }

    public final Map<K, Collection<V>> createMaybeNavigableAsMap() {
        Map<K, Collection<V>> map = this.f35748g;
        return map instanceof NavigableMap ? new C15893f((NavigableMap) this.f35748g) : map instanceof SortedMap ? new C15896i((SortedMap) this.f35748g) : new C15887c(this.f35748g);
    }

    public final Set<K> createMaybeNavigableKeySet() {
        Map<K, Collection<V>> map = this.f35748g;
        return map instanceof NavigableMap ? new C15894g((NavigableMap) this.f35748g) : map instanceof SortedMap ? new C15897j((SortedMap) this.f35748g) : new C15891e(this.f35748g);
    }

    public Collection<V> createUnmodifiableEmptyCollection() {
        return unmodifiableCollectionSubclass(createCollection());
    }

    public Collection<V> createValues() {
        return new C16149c.C16152c();
    }

    public Collection<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    public Iterator<Map.Entry<K, V>> entryIterator() {
        return new C15886b(this);
    }

    public Collection<V> get(@NullableDecl K k) {
        Collection collection = this.f35748g.get(k);
        if (collection == null) {
            collection = createCollection(k);
        }
        return wrapCollection(k, collection);
    }

    public boolean put(@NullableDecl K k, @NullableDecl V v) {
        Collection collection = this.f35748g.get(k);
        if (collection == null) {
            Collection createCollection = createCollection(k);
            if (createCollection.add(v)) {
                this.f35749h++;
                this.f35748g.put(k, createCollection);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.f35749h++;
            return true;
        }
    }

    public Collection<V> removeAll(@NullableDecl Object obj) {
        Collection remove = this.f35748g.remove(obj);
        if (remove == null) {
            return createUnmodifiableEmptyCollection();
        }
        Collection createCollection = createCollection();
        createCollection.addAll(remove);
        this.f35749h -= remove.size();
        remove.clear();
        return unmodifiableCollectionSubclass(createCollection);
    }

    public Collection<V> replaceValues(@NullableDecl K k, Iterable<? extends V> iterable) {
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext()) {
            return removeAll(k);
        }
        Collection collection = this.f35748g.get(k);
        if (collection == null) {
            collection = createCollection(k);
            this.f35748g.put(k, collection);
        }
        Collection createCollection = createCollection();
        createCollection.addAll(collection);
        this.f35749h -= collection.size();
        collection.clear();
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                this.f35749h++;
            }
        }
        return unmodifiableCollectionSubclass(createCollection);
    }

    public final void setMap(Map<K, Collection<V>> map) {
        this.f35748g = map;
        this.f35749h = 0;
        for (Collection next : map.values()) {
            C15794l.m25613g(!next.isEmpty());
            this.f35749h = next.size() + this.f35749h;
        }
    }

    public int size() {
        return this.f35749h;
    }

    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    public Iterator<V> valueIterator() {
        return new C15885a(this);
    }

    public Collection<V> values() {
        return super.values();
    }

    public Collection<V> wrapCollection(@NullableDecl K k, Collection<V> collection) {
        return new C15898k(k, collection, (AbstractMapBasedMultimap<K, V>.k) null);
    }

    public final List<V> wrapList(@NullableDecl K k, List<V> list, @NullableDecl AbstractMapBasedMultimap<K, V>.k kVar) {
        return list instanceof RandomAccess ? new C15895h(this, k, list, kVar) : new C15900l(k, list, kVar);
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$k */
    public class C15898k extends AbstractCollection<V> {
        @NullableDecl

        /* renamed from: b */
        public final K f35770b;

        /* renamed from: c */
        public Collection<V> f35771c;
        @NullableDecl

        /* renamed from: d */
        public final AbstractMapBasedMultimap<K, V>.k f35772d;
        @NullableDecl

        /* renamed from: e */
        public final Collection<V> f35773e;

        public C15898k(@NullableDecl K k, Collection<V> collection, @NullableDecl AbstractMapBasedMultimap<K, V>.k kVar) {
            this.f35770b = k;
            this.f35771c = collection;
            this.f35772d = kVar;
            this.f35773e = kVar == null ? null : kVar.f35771c;
        }

        /* renamed from: a */
        public final void mo56164a() {
            AbstractMapBasedMultimap<K, V>.k kVar = this.f35772d;
            if (kVar != null) {
                kVar.mo56164a();
            } else {
                AbstractMapBasedMultimap.this.f35748g.put(this.f35770b, this.f35771c);
            }
        }

        public final boolean add(V v) {
            mo56167c();
            boolean isEmpty = this.f35771c.isEmpty();
            boolean add = this.f35771c.add(v);
            if (add) {
                AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
                if (isEmpty) {
                    mo56164a();
                }
            }
            return add;
        }

        public final boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f35771c.addAll(collection);
            if (addAll) {
                int size2 = this.f35771c.size();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                int unused = abstractMapBasedMultimap.f35749h = (size2 - size) + abstractMapBasedMultimap.f35749h;
                if (size == 0) {
                    mo56164a();
                }
            }
            return addAll;
        }

        /* renamed from: c */
        public final void mo56167c() {
            Collection<V> collection;
            AbstractMapBasedMultimap<K, V>.k kVar = this.f35772d;
            if (kVar != null) {
                kVar.mo56167c();
                if (this.f35772d.f35771c != this.f35773e) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f35771c.isEmpty() && (collection = (Collection) AbstractMapBasedMultimap.this.f35748g.get(this.f35770b)) != null) {
                this.f35771c = collection;
            }
        }

        public final void clear() {
            int size = size();
            if (size != 0) {
                this.f35771c.clear();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                int unused = abstractMapBasedMultimap.f35749h = abstractMapBasedMultimap.f35749h - size;
                mo56171e();
            }
        }

        public final boolean contains(Object obj) {
            mo56167c();
            return this.f35771c.contains(obj);
        }

        public final boolean containsAll(Collection<?> collection) {
            mo56167c();
            return this.f35771c.containsAll(collection);
        }

        /* renamed from: e */
        public final void mo56171e() {
            AbstractMapBasedMultimap<K, V>.k kVar = this.f35772d;
            if (kVar != null) {
                kVar.mo56171e();
            } else if (this.f35771c.isEmpty()) {
                AbstractMapBasedMultimap.this.f35748g.remove(this.f35770b);
            }
        }

        public final boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            mo56167c();
            return this.f35771c.equals(obj);
        }

        public final int hashCode() {
            mo56167c();
            return this.f35771c.hashCode();
        }

        public final Iterator<V> iterator() {
            mo56167c();
            return new C15899a();
        }

        public final boolean remove(Object obj) {
            mo56167c();
            boolean remove = this.f35771c.remove(obj);
            if (remove) {
                AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
                mo56171e();
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f35771c.removeAll(collection);
            if (removeAll) {
                int size2 = this.f35771c.size();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                int unused = abstractMapBasedMultimap.f35749h = (size2 - size) + abstractMapBasedMultimap.f35749h;
                mo56171e();
            }
            return removeAll;
        }

        public final boolean retainAll(Collection<?> collection) {
            collection.getClass();
            int size = size();
            boolean retainAll = this.f35771c.retainAll(collection);
            if (retainAll) {
                int size2 = this.f35771c.size();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                int unused = abstractMapBasedMultimap.f35749h = (size2 - size) + abstractMapBasedMultimap.f35749h;
                mo56171e();
            }
            return retainAll;
        }

        public final int size() {
            mo56167c();
            return this.f35771c.size();
        }

        public final String toString() {
            mo56167c();
            return this.f35771c.toString();
        }

        /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$k$a */
        public class C15899a implements Iterator<V> {

            /* renamed from: b */
            public final Iterator<V> f35775b;

            /* renamed from: c */
            public final Collection<V> f35776c;

            public C15899a() {
                Collection<V> collection = C15898k.this.f35771c;
                this.f35776c = collection;
                this.f35775b = AbstractMapBasedMultimap.access$100(collection);
            }

            /* renamed from: a */
            public final void mo56180a() {
                C15898k.this.mo56167c();
                if (C15898k.this.f35771c != this.f35776c) {
                    throw new ConcurrentModificationException();
                }
            }

            public final boolean hasNext() {
                mo56180a();
                return this.f35775b.hasNext();
            }

            public final V next() {
                mo56180a();
                return this.f35775b.next();
            }

            public final void remove() {
                this.f35775b.remove();
                AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
                C15898k.this.mo56171e();
            }

            public C15899a(Iterator<V> it) {
                this.f35776c = C15898k.this.f35771c;
                this.f35775b = it;
            }
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$l */
    public class C15900l extends AbstractMapBasedMultimap<K, V>.k implements List<V> {

        /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$l$a */
        public class C15901a extends AbstractMapBasedMultimap<K, V>.C7159a implements ListIterator<V> {
            public C15901a() {
                super();
            }

            public final void add(V v) {
                boolean isEmpty = C15900l.this.isEmpty();
                mo56195b().add(v);
                AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
                if (isEmpty) {
                    C15900l.this.mo56164a();
                }
            }

            /* JADX WARNING: type inference failed for: r1v0, types: [com.google.common.collect.AbstractMapBasedMultimap$k$a, com.google.common.collect.AbstractMapBasedMultimap$l$a] */
            /* renamed from: b */
            public final ListIterator<V> mo56195b() {
                mo56180a();
                return (ListIterator) this.f35775b;
            }

            public final boolean hasPrevious() {
                return mo56195b().hasPrevious();
            }

            public final int nextIndex() {
                return mo56195b().nextIndex();
            }

            public final V previous() {
                return mo56195b().previous();
            }

            public final int previousIndex() {
                return mo56195b().previousIndex();
            }

            public final void set(V v) {
                mo56195b().set(v);
            }

            public C15901a(int i) {
                super(((List) C15900l.this.f35771c).listIterator(i));
            }
        }

        public C15900l(@NullableDecl K k, List<V> list, @NullableDecl AbstractMapBasedMultimap<K, V>.k kVar) {
            super(k, list, kVar);
        }

        public final void add(int i, V v) {
            mo56167c();
            boolean isEmpty = this.f35771c.isEmpty();
            ((List) this.f35771c).add(i, v);
            AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
            if (isEmpty) {
                mo56164a();
            }
        }

        public final boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = ((List) this.f35771c).addAll(i, collection);
            if (addAll) {
                int size2 = this.f35771c.size();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                int unused = abstractMapBasedMultimap.f35749h = (size2 - size) + abstractMapBasedMultimap.f35749h;
                if (size == 0) {
                    mo56164a();
                }
            }
            return addAll;
        }

        public final V get(int i) {
            mo56167c();
            return ((List) this.f35771c).get(i);
        }

        public final int indexOf(Object obj) {
            mo56167c();
            return ((List) this.f35771c).indexOf(obj);
        }

        public final int lastIndexOf(Object obj) {
            mo56167c();
            return ((List) this.f35771c).lastIndexOf(obj);
        }

        public final ListIterator<V> listIterator() {
            mo56167c();
            return new C15901a();
        }

        public final V remove(int i) {
            mo56167c();
            V remove = ((List) this.f35771c).remove(i);
            AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
            mo56171e();
            return remove;
        }

        public final V set(int i, V v) {
            mo56167c();
            return ((List) this.f35771c).set(i, v);
        }

        public final List<V> subList(int i, int i2) {
            mo56167c();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            K k = this.f35770b;
            List subList = ((List) this.f35771c).subList(i, i2);
            AbstractMapBasedMultimap<K, V>.k kVar = this.f35772d;
            if (kVar == null) {
                kVar = this;
            }
            return abstractMapBasedMultimap.wrapList(k, subList, kVar);
        }

        public final ListIterator<V> listIterator(int i) {
            mo56167c();
            return new C15901a(i);
        }
    }
}
