package com.google.common.collect;

import com.google.common.base.C15784e;
import com.google.common.base.C15804s;
import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.C16178h1;
import com.google.common.collect.Maps;
import com.google.common.collect.Multisets;
import com.google.common.collect.Sets;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class Multimaps {

    public static class CustomListMultimap<K, V> extends AbstractListMultimap<K, V> {
        private static final long serialVersionUID = 0;
        public transient C15804s<? extends List<V>> factory;

        public CustomListMultimap(Map<K, Collection<V>> map, C15804s<? extends List<V>> sVar) {
            super(map);
            sVar.getClass();
            this.factory = sVar;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.factory = (C15804s) objectInputStream.readObject();
            setMap((Map) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        public Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        public Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        public List<V> createCollection() {
            return (List) this.factory.get();
        }
    }

    public static class CustomMultimap<K, V> extends AbstractMapBasedMultimap<K, V> {
        private static final long serialVersionUID = 0;
        public transient C15804s<? extends Collection<V>> factory;

        public CustomMultimap(Map<K, Collection<V>> map, C15804s<? extends Collection<V>> sVar) {
            super(map);
            sVar.getClass();
            this.factory = sVar;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.factory = (C15804s) objectInputStream.readObject();
            setMap((Map) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        public Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        public Collection<V> createCollection() {
            return (Collection) this.factory.get();
        }

        public Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
            return collection instanceof NavigableSet ? Sets.m26096f((NavigableSet) collection) : collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? Collections.unmodifiableSet((Set) collection) : collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
        }

        public Collection<V> wrapCollection(K k, Collection<V> collection) {
            return collection instanceof List ? wrapList(k, (List) collection, (AbstractMapBasedMultimap<K, V>.k) null) : collection instanceof NavigableSet ? new AbstractMapBasedMultimap.C15902m(k, (NavigableSet) collection, (AbstractMapBasedMultimap<K, V>.k) null) : collection instanceof SortedSet ? new AbstractMapBasedMultimap.C15904o(k, (SortedSet) collection, (AbstractMapBasedMultimap<K, V>.k) null) : collection instanceof Set ? new AbstractMapBasedMultimap.C15903n(k, (Set) collection) : new AbstractMapBasedMultimap.C15898k(k, collection, (AbstractMapBasedMultimap<K, V>.k) null);
        }
    }

    public static class CustomSetMultimap<K, V> extends AbstractSetMultimap<K, V> {
        private static final long serialVersionUID = 0;
        public transient C15804s<? extends Set<V>> factory;

        public CustomSetMultimap(Map<K, Collection<V>> map, C15804s<? extends Set<V>> sVar) {
            super(map);
            sVar.getClass();
            this.factory = sVar;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.factory = (C15804s) objectInputStream.readObject();
            setMap((Map) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        public Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        public Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
            return collection instanceof NavigableSet ? Sets.m26096f((NavigableSet) collection) : collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : Collections.unmodifiableSet((Set) collection);
        }

        public Collection<V> wrapCollection(K k, Collection<V> collection) {
            return collection instanceof NavigableSet ? new AbstractMapBasedMultimap.C15902m(k, (NavigableSet) collection, (AbstractMapBasedMultimap<K, V>.k) null) : collection instanceof SortedSet ? new AbstractMapBasedMultimap.C15904o(k, (SortedSet) collection, (AbstractMapBasedMultimap<K, V>.k) null) : new AbstractMapBasedMultimap.C15903n(k, (Set) collection);
        }

        public Set<V> createCollection() {
            return (Set) this.factory.get();
        }
    }

    public static class MapMultimap<K, V> extends C16149c<K, V> implements C16217r1<K, V>, Serializable {
        private static final long serialVersionUID = 7845222491160860175L;
        public final Map<K, V> map;

        /* renamed from: com.google.common.collect.Multimaps$MapMultimap$a */
        public class C16055a extends Sets.C16082a<V> {

            /* renamed from: b */
            public final /* synthetic */ Object f36088b;

            /* renamed from: com.google.common.collect.Multimaps$MapMultimap$a$a */
            public class C16056a implements Iterator<V> {

                /* renamed from: b */
                public int f36090b;

                public C16056a() {
                }

                public final boolean hasNext() {
                    if (this.f36090b == 0) {
                        C16055a aVar = C16055a.this;
                        if (MapMultimap.this.map.containsKey(aVar.f36088b)) {
                            return true;
                        }
                    }
                    return false;
                }

                public final V next() {
                    if (hasNext()) {
                        this.f36090b++;
                        C16055a aVar = C16055a.this;
                        return MapMultimap.this.map.get(aVar.f36088b);
                    }
                    throw new NoSuchElementException();
                }

                public final void remove() {
                    boolean z = true;
                    if (this.f36090b != 1) {
                        z = false;
                    }
                    C16203o.m26218e(z);
                    this.f36090b = -1;
                    C16055a aVar = C16055a.this;
                    MapMultimap.this.map.remove(aVar.f36088b);
                }
            }

            public C16055a(Object obj) {
                this.f36088b = obj;
            }

            public final Iterator<V> iterator() {
                return new C16056a();
            }

            public final int size() {
                return MapMultimap.this.map.containsKey(this.f36088b) ? 1 : 0;
            }
        }

        public MapMultimap(Map<K, V> map2) {
            map2.getClass();
            this.map = map2;
        }

        public void clear() {
            this.map.clear();
        }

        public boolean containsEntry(Object obj, Object obj2) {
            return this.map.entrySet().contains(new ImmutableEntry(obj, obj2));
        }

        public boolean containsKey(Object obj) {
            return this.map.containsKey(obj);
        }

        public boolean containsValue(Object obj) {
            return this.map.containsValue(obj);
        }

        public Map<K, Collection<V>> createAsMap() {
            return new C16058a(this);
        }

        public Collection<Map.Entry<K, V>> createEntries() {
            throw new AssertionError("unreachable");
        }

        public Set<K> createKeySet() {
            return this.map.keySet();
        }

        public C16178h1<K> createKeys() {
            return new C16062c(this);
        }

        public Collection<V> createValues() {
            return this.map.values();
        }

        public Iterator<Map.Entry<K, V>> entryIterator() {
            return this.map.entrySet().iterator();
        }

        public int hashCode() {
            return this.map.hashCode();
        }

        public boolean put(K k, V v) {
            throw new UnsupportedOperationException();
        }

        public boolean putAll(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        public boolean remove(Object obj, Object obj2) {
            return this.map.entrySet().remove(new ImmutableEntry(obj, obj2));
        }

        public int size() {
            return this.map.size();
        }

        public Set<Map.Entry<K, V>> entries() {
            return this.map.entrySet();
        }

        public Set<V> get(K k) {
            return new C16055a(k);
        }

        public boolean putAll(C16154c1<? extends K, ? extends V> c1Var) {
            throw new UnsupportedOperationException();
        }

        public Set<V> removeAll(Object obj) {
            HashSet hashSet = new HashSet(2);
            if (!this.map.containsKey(obj)) {
                return hashSet;
            }
            hashSet.add(this.map.remove(obj));
            return hashSet;
        }

        public Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    public static class UnmodifiableListMultimap<K, V> extends UnmodifiableMultimap<K, V> implements C16219s0<K, V> {
        private static final long serialVersionUID = 0;

        public UnmodifiableListMultimap(C16219s0<K, V> s0Var) {
            super(s0Var);
        }

        public List<V> get(K k) {
            return Collections.unmodifiableList(delegate().get(k));
        }

        public List<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        public List<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        public C16219s0<K, V> delegate() {
            return (C16219s0) super.delegate();
        }
    }

    public static class UnmodifiableMultimap<K, V> extends C16141a0<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final C16154c1<K, V> delegate;
        @MonotonicNonNullDecl
        public transient Collection<Map.Entry<K, V>> entries;
        @MonotonicNonNullDecl
        public transient Set<K> keySet;
        @MonotonicNonNullDecl
        public transient C16178h1<K> keys;
        @MonotonicNonNullDecl
        public transient Map<K, Collection<V>> map;
        @MonotonicNonNullDecl
        public transient Collection<V> values;

        /* renamed from: com.google.common.collect.Multimaps$UnmodifiableMultimap$a */
        public class C16057a implements C15784e<Collection<V>, Collection<V>> {
            public final Object apply(Object obj) {
                return Multimaps.m26074a((Collection) obj);
            }
        }

        public UnmodifiableMultimap(C16154c1<K, V> c1Var) {
            c1Var.getClass();
            this.delegate = c1Var;
        }

        public Map<K, Collection<V>> asMap() {
            Map<K, Collection<V>> map2 = this.map;
            if (map2 != null) {
                return map2;
            }
            Map<K, Collection<V>> unmodifiableMap = Collections.unmodifiableMap(Maps.m26059g(this.delegate.asMap(), new C16057a()));
            this.map = unmodifiableMap;
            return unmodifiableMap;
        }

        public void clear() {
            throw new UnsupportedOperationException();
        }

        public Collection<Map.Entry<K, V>> entries() {
            Collection<Map.Entry<K, V>> collection = this.entries;
            if (collection != null) {
                return collection;
            }
            Collection<Map.Entry<K, V>> entries2 = this.delegate.entries();
            Collection<Map.Entry<K, V>> kVar = entries2 instanceof Set ? new Maps.C16050k<>(Collections.unmodifiableSet((Set) entries2)) : new Maps.C16049j<>(Collections.unmodifiableCollection(entries2));
            this.entries = kVar;
            return kVar;
        }

        public Collection<V> get(K k) {
            return Multimaps.m26074a(this.delegate.get(k));
        }

        public Set<K> keySet() {
            Set<K> set = this.keySet;
            if (set != null) {
                return set;
            }
            Set<K> unmodifiableSet = Collections.unmodifiableSet(this.delegate.keySet());
            this.keySet = unmodifiableSet;
            return unmodifiableSet;
        }

        public C16178h1<K> keys() {
            C16178h1<K> h1Var = this.keys;
            if (h1Var == null) {
                h1Var = this.delegate.keys();
                if (!(h1Var instanceof Multisets.UnmodifiableMultiset) && !(h1Var instanceof ImmutableMultiset)) {
                    h1Var.getClass();
                    h1Var = new Multisets.UnmodifiableMultiset<>(h1Var);
                }
                this.keys = h1Var;
            }
            return h1Var;
        }

        public boolean put(K k, V v) {
            throw new UnsupportedOperationException();
        }

        public boolean putAll(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        public boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        public Collection<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        public Collection<V> values() {
            Collection<V> collection = this.values;
            if (collection != null) {
                return collection;
            }
            Collection<V> unmodifiableCollection = Collections.unmodifiableCollection(this.delegate.values());
            this.values = unmodifiableCollection;
            return unmodifiableCollection;
        }

        public C16154c1<K, V> delegate() {
            return this.delegate;
        }

        public boolean putAll(C16154c1<? extends K, ? extends V> c1Var) {
            throw new UnsupportedOperationException();
        }
    }

    public static class UnmodifiableSetMultimap<K, V> extends UnmodifiableMultimap<K, V> implements C16217r1<K, V> {
        private static final long serialVersionUID = 0;

        public UnmodifiableSetMultimap(C16217r1<K, V> r1Var) {
            super(r1Var);
        }

        public Set<Map.Entry<K, V>> entries() {
            return new Maps.C16050k(Collections.unmodifiableSet(delegate().entries()));
        }

        public Set<V> get(K k) {
            return Collections.unmodifiableSet(delegate().get(k));
        }

        public Set<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        public Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        public C16217r1<K, V> delegate() {
            return (C16217r1) super.delegate();
        }
    }

    /* renamed from: com.google.common.collect.Multimaps$a */
    public static final class C16058a<K, V> extends Maps.C16052m<K, Collection<V>> {
        @Weak

        /* renamed from: e */
        public final C16154c1<K, V> f36092e;

        /* renamed from: com.google.common.collect.Multimaps$a$a */
        public class C16059a extends Maps.C16040b<K, Collection<V>> {

            /* renamed from: com.google.common.collect.Multimaps$a$a$a */
            public class C16060a implements C15784e<K, Collection<V>> {
                public C16060a() {
                }

                public final Object apply(Object obj) {
                    return C16058a.this.f36092e.get(obj);
                }
            }

            public C16059a() {
            }

            /* renamed from: a */
            public final Map<K, Collection<V>> mo56096a() {
                return C16058a.this;
            }

            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                Set<K> keySet = C16058a.this.f36092e.keySet();
                return new C16238x0(keySet.iterator(), new C16060a());
            }

            public final boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                C16058a aVar = C16058a.this;
                aVar.f36092e.keySet().remove(((Map.Entry) obj).getKey());
                return true;
            }
        }

        public C16058a(C16154c1<K, V> c1Var) {
            c1Var.getClass();
            this.f36092e = c1Var;
        }

        /* renamed from: a */
        public final Set<Map.Entry<K, Collection<V>>> mo56085a() {
            return new C16059a();
        }

        public final void clear() {
            this.f36092e.clear();
        }

        public final boolean containsKey(Object obj) {
            return this.f36092e.containsKey(obj);
        }

        public final Object get(Object obj) {
            if (containsKey(obj)) {
                return this.f36092e.get(obj);
            }
            return null;
        }

        public final boolean isEmpty() {
            return this.f36092e.isEmpty();
        }

        public final Set<K> keySet() {
            return this.f36092e.keySet();
        }

        public final Object remove(Object obj) {
            if (containsKey(obj)) {
                return this.f36092e.removeAll(obj);
            }
            return null;
        }

        public final int size() {
            return this.f36092e.keySet().size();
        }
    }

    /* renamed from: com.google.common.collect.Multimaps$b */
    public static abstract class C16061b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        public final void clear() {
            C16149c.this.clear();
        }

        public final boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return C16149c.this.containsEntry(entry.getKey(), entry.getValue());
        }

        public final boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return C16149c.this.remove(entry.getKey(), entry.getValue());
        }

        public final int size() {
            return C16149c.this.size();
        }
    }

    /* renamed from: com.google.common.collect.Multimaps$c */
    public static class C16062c<K, V> extends C16156d<K> {
        @Weak

        /* renamed from: d */
        public final C16154c1<K, V> f36095d;

        /* renamed from: com.google.common.collect.Multimaps$c$a */
        public class C16063a extends C16155c2<Map.Entry<K, Collection<V>>, C16178h1.C16179a<K>> {
            public C16063a(Iterator it) {
                super(it);
            }

            /* renamed from: a */
            public final Object mo56891a(Object obj) {
                return new C16173g1((Map.Entry) obj);
            }
        }

        public C16062c(C16154c1<K, V> c1Var) {
            this.f36095d = c1Var;
        }

        public final void clear() {
            this.f36095d.clear();
        }

        public final boolean contains(@NullableDecl Object obj) {
            return this.f36095d.containsKey(obj);
        }

        public final int count(@NullableDecl Object obj) {
            Collection collection = (Collection) Maps.m26057e(obj, this.f36095d.asMap());
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        public final int distinctElements() {
            return this.f36095d.asMap().size();
        }

        public final Iterator<K> elementIterator() {
            throw new AssertionError("should never be called");
        }

        public final Set<K> elementSet() {
            return this.f36095d.keySet();
        }

        public final Iterator<C16178h1.C16179a<K>> entryIterator() {
            return new C16063a(this.f36095d.asMap().entrySet().iterator());
        }

        public final Iterator<K> iterator() {
            return new C16230v0(this.f36095d.entries().iterator());
        }

        public final int remove(@NullableDecl Object obj, int i) {
            C16203o.m26215b(i, "occurrences");
            if (i == 0) {
                return count(obj);
            }
            Collection collection = (Collection) Maps.m26057e(obj, this.f36095d.asMap());
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i >= size) {
                collection.clear();
            } else {
                Iterator it = collection.iterator();
                for (int i2 = 0; i2 < i; i2++) {
                    it.next();
                    it.remove();
                }
            }
            return size;
        }

        public final int size() {
            return this.f36095d.size();
        }
    }

    /* renamed from: a */
    public static Collection m26074a(Collection collection) {
        return collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? Collections.unmodifiableSet((Set) collection) : collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
    }

    public static class CustomSortedSetMultimap<K, V> extends AbstractSortedSetMultimap<K, V> {
        private static final long serialVersionUID = 0;
        public transient C15804s<? extends SortedSet<V>> factory;
        public transient Comparator<? super V> valueComparator;

        public CustomSortedSetMultimap(Map<K, Collection<V>> map, C15804s<? extends SortedSet<V>> sVar) {
            super(map);
            sVar.getClass();
            this.factory = sVar;
            this.valueComparator = ((SortedSet) sVar.get()).comparator();
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            C15804s<? extends SortedSet<V>> sVar = (C15804s) objectInputStream.readObject();
            this.factory = sVar;
            this.valueComparator = ((SortedSet) sVar.get()).comparator();
            setMap((Map) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        public Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        public Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        public Comparator<? super V> valueComparator() {
            return this.valueComparator;
        }

        public SortedSet<V> createCollection() {
            return (SortedSet) this.factory.get();
        }
    }

    public static class UnmodifiableSortedSetMultimap<K, V> extends UnmodifiableSetMultimap<K, V> implements C16239x1<K, V> {
        private static final long serialVersionUID = 0;

        public UnmodifiableSortedSetMultimap(C16239x1<K, V> x1Var) {
            super(x1Var);
        }

        public Comparator<? super V> valueComparator() {
            return delegate().valueComparator();
        }

        public SortedSet<V> get(K k) {
            return Collections.unmodifiableSortedSet(delegate().get(k));
        }

        public SortedSet<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        public SortedSet<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        public C16239x1<K, V> delegate() {
            return (C16239x1) super.delegate();
        }
    }
}
