package com.google.common.collect;

import com.google.common.base.C15784e;
import com.google.common.collect.C16147b2;
import com.google.common.collect.C16178h1;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p628nj.C18263b;

public final class Synchronized {

    public static class SynchronizedAsMap<K, V> extends SynchronizedMap<K, Collection<V>> {
        private static final long serialVersionUID = 0;
        @MonotonicNonNullDecl
        public transient Set<Map.Entry<K, Collection<V>>> asMapEntrySet;
        @MonotonicNonNullDecl
        public transient Collection<Collection<V>> asMapValues;

        public SynchronizedAsMap(Map<K, Collection<V>> map, @NullableDecl Object obj) {
            super(map, obj);
        }

        public boolean containsValue(Object obj) {
            return values().contains(obj);
        }

        public Set<Map.Entry<K, Collection<V>>> entrySet() {
            Set<Map.Entry<K, Collection<V>>> set;
            synchronized (this.mutex) {
                if (this.asMapEntrySet == null) {
                    this.asMapEntrySet = new SynchronizedAsMapEntries(delegate().entrySet(), this.mutex);
                }
                set = this.asMapEntrySet;
            }
            return set;
        }

        public Collection<Collection<V>> values() {
            Collection<Collection<V>> collection;
            synchronized (this.mutex) {
                if (this.asMapValues == null) {
                    this.asMapValues = new SynchronizedAsMapValues(delegate().values(), this.mutex);
                }
                collection = this.asMapValues;
            }
            return collection;
        }

        public Collection<V> get(Object obj) {
            Collection<V> collection;
            synchronized (this.mutex) {
                Collection collection2 = (Collection) super.get(obj);
                if (collection2 == null) {
                    collection = null;
                } else {
                    collection = Synchronized.m26114b(collection2, this.mutex);
                }
            }
            return collection;
        }
    }

    public static class SynchronizedAsMapValues<V> extends SynchronizedCollection<Collection<V>> {
        private static final long serialVersionUID = 0;

        /* renamed from: com.google.common.collect.Synchronized$SynchronizedAsMapValues$a */
        public class C16113a extends C16155c2<Collection<V>, Collection<V>> {
            public C16113a(Iterator it) {
                super(it);
            }

            /* renamed from: a */
            public final Object mo56891a(Object obj) {
                return Synchronized.m26114b((Collection) obj, SynchronizedAsMapValues.this.mutex);
            }
        }

        public SynchronizedAsMapValues(Collection<Collection<V>> collection, @NullableDecl Object obj) {
            super(collection, obj, (C16116a) null);
        }

        public Iterator<Collection<V>> iterator() {
            return new C16113a(super.iterator());
        }
    }

    public static class SynchronizedBiMap<K, V> extends SynchronizedMap<K, V> implements C16196m<K, V> {
        private static final long serialVersionUID = 0;
        @MonotonicNonNullDecl

        /* renamed from: b */
        public transient Set<V> f36179b;
        @RetainedWith
        @MonotonicNonNullDecl

        /* renamed from: c */
        public transient C16196m<V, K> f36180c;

        public V forcePut(K k, V v) {
            V forcePut;
            synchronized (this.mutex) {
                forcePut = delegate().forcePut(k, v);
            }
            return forcePut;
        }

        public C16196m<V, K> inverse() {
            C16196m<V, K> mVar;
            synchronized (this.mutex) {
                if (this.f36180c == null) {
                    this.f36180c = new SynchronizedBiMap(delegate().inverse(), this.mutex, this);
                }
                mVar = this.f36180c;
            }
            return mVar;
        }

        public SynchronizedBiMap(C16196m<K, V> mVar, @NullableDecl Object obj, @NullableDecl C16196m<V, K> mVar2) {
            super(mVar, obj);
            this.f36180c = mVar2;
        }

        public Set<V> values() {
            Set<V> set;
            synchronized (this.mutex) {
                if (this.f36179b == null) {
                    this.f36179b = new SynchronizedSet(delegate().values(), this.mutex);
                }
                set = this.f36179b;
            }
            return set;
        }

        public C16196m<K, V> delegate() {
            return (C16196m) super.delegate();
        }
    }

    public static class SynchronizedCollection<E> extends SynchronizedObject implements Collection<E> {
        private static final long serialVersionUID = 0;

        public SynchronizedCollection() {
            throw null;
        }

        public SynchronizedCollection(Collection collection, Object obj, C16116a aVar) {
            super(collection, obj);
        }

        public boolean add(E e) {
            boolean add;
            synchronized (this.mutex) {
                add = delegate().add(e);
            }
            return add;
        }

        public boolean addAll(Collection<? extends E> collection) {
            boolean addAll;
            synchronized (this.mutex) {
                addAll = delegate().addAll(collection);
            }
            return addAll;
        }

        public void clear() {
            synchronized (this.mutex) {
                delegate().clear();
            }
        }

        public boolean contains(Object obj) {
            boolean contains;
            synchronized (this.mutex) {
                contains = delegate().contains(obj);
            }
            return contains;
        }

        public boolean containsAll(Collection<?> collection) {
            boolean containsAll;
            synchronized (this.mutex) {
                containsAll = delegate().containsAll(collection);
            }
            return containsAll;
        }

        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.mutex) {
                isEmpty = delegate().isEmpty();
            }
            return isEmpty;
        }

        public Iterator<E> iterator() {
            return delegate().iterator();
        }

        public boolean remove(Object obj) {
            boolean remove;
            synchronized (this.mutex) {
                remove = delegate().remove(obj);
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            boolean removeAll;
            synchronized (this.mutex) {
                removeAll = delegate().removeAll(collection);
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            boolean retainAll;
            synchronized (this.mutex) {
                retainAll = delegate().retainAll(collection);
            }
            return retainAll;
        }

        public int size() {
            int size;
            synchronized (this.mutex) {
                size = delegate().size();
            }
            return size;
        }

        public Object[] toArray() {
            Object[] array;
            synchronized (this.mutex) {
                array = delegate().toArray();
            }
            return array;
        }

        /* access modifiers changed from: package-private */
        public Collection<E> delegate() {
            return (Collection) super.delegate();
        }

        public <T> T[] toArray(T[] tArr) {
            T[] array;
            synchronized (this.mutex) {
                array = delegate().toArray(tArr);
            }
            return array;
        }
    }

    public static class SynchronizedEntry<K, V> extends SynchronizedObject implements Map.Entry<K, V> {
        private static final long serialVersionUID = 0;

        public SynchronizedEntry(Map.Entry<K, V> entry, @NullableDecl Object obj) {
            super(entry, obj);
        }

        public boolean equals(Object obj) {
            boolean equals;
            synchronized (this.mutex) {
                equals = delegate().equals(obj);
            }
            return equals;
        }

        public K getKey() {
            K key;
            synchronized (this.mutex) {
                key = delegate().getKey();
            }
            return key;
        }

        public V getValue() {
            V value;
            synchronized (this.mutex) {
                value = delegate().getValue();
            }
            return value;
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.mutex) {
                hashCode = delegate().hashCode();
            }
            return hashCode;
        }

        public V setValue(V v) {
            V value;
            synchronized (this.mutex) {
                value = delegate().setValue(v);
            }
            return value;
        }

        public Map.Entry<K, V> delegate() {
            return (Map.Entry) super.delegate();
        }
    }

    public static class SynchronizedList<E> extends SynchronizedCollection<E> implements List<E> {
        private static final long serialVersionUID = 0;

        public SynchronizedList(List<E> list, @NullableDecl Object obj) {
            super(list, obj, (C16116a) null);
        }

        public void add(int i, E e) {
            synchronized (this.mutex) {
                delegate().add(i, e);
            }
        }

        public boolean addAll(int i, Collection<? extends E> collection) {
            boolean addAll;
            synchronized (this.mutex) {
                addAll = delegate().addAll(i, collection);
            }
            return addAll;
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                equals = delegate().equals(obj);
            }
            return equals;
        }

        public E get(int i) {
            E e;
            synchronized (this.mutex) {
                e = delegate().get(i);
            }
            return e;
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.mutex) {
                hashCode = delegate().hashCode();
            }
            return hashCode;
        }

        public int indexOf(Object obj) {
            int indexOf;
            synchronized (this.mutex) {
                indexOf = delegate().indexOf(obj);
            }
            return indexOf;
        }

        public int lastIndexOf(Object obj) {
            int lastIndexOf;
            synchronized (this.mutex) {
                lastIndexOf = delegate().lastIndexOf(obj);
            }
            return lastIndexOf;
        }

        public ListIterator<E> listIterator() {
            return delegate().listIterator();
        }

        public E remove(int i) {
            E remove;
            synchronized (this.mutex) {
                remove = delegate().remove(i);
            }
            return remove;
        }

        public E set(int i, E e) {
            E e2;
            synchronized (this.mutex) {
                e2 = delegate().set(i, e);
            }
            return e2;
        }

        public List<E> subList(int i, int i2) {
            List<E> d;
            synchronized (this.mutex) {
                d = Synchronized.m26116d(delegate().subList(i, i2), this.mutex);
            }
            return d;
        }

        public ListIterator<E> listIterator(int i) {
            return delegate().listIterator(i);
        }

        public List<E> delegate() {
            return (List) super.delegate();
        }
    }

    public static class SynchronizedListMultimap<K, V> extends SynchronizedMultimap<K, V> implements C16219s0<K, V> {
        private static final long serialVersionUID = 0;

        public SynchronizedListMultimap(C16219s0<K, V> s0Var, @NullableDecl Object obj) {
            super(s0Var, obj);
        }

        public List<V> get(K k) {
            List<V> d;
            synchronized (this.mutex) {
                d = Synchronized.m26116d(delegate().get(k), this.mutex);
            }
            return d;
        }

        public List<V> removeAll(Object obj) {
            List<V> removeAll;
            synchronized (this.mutex) {
                removeAll = delegate().removeAll(obj);
            }
            return removeAll;
        }

        public List<V> replaceValues(K k, Iterable<? extends V> iterable) {
            List<V> replaceValues;
            synchronized (this.mutex) {
                replaceValues = delegate().replaceValues(k, iterable);
            }
            return replaceValues;
        }

        public C16219s0<K, V> delegate() {
            return (C16219s0) super.delegate();
        }
    }

    public static class SynchronizedMap<K, V> extends SynchronizedObject implements Map<K, V> {
        private static final long serialVersionUID = 0;
        @MonotonicNonNullDecl
        public transient Set<Map.Entry<K, V>> entrySet;
        @MonotonicNonNullDecl
        public transient Set<K> keySet;
        @MonotonicNonNullDecl
        public transient Collection<V> values;

        public SynchronizedMap(Map<K, V> map, @NullableDecl Object obj) {
            super(map, obj);
        }

        public void clear() {
            synchronized (this.mutex) {
                delegate().clear();
            }
        }

        public boolean containsKey(Object obj) {
            boolean containsKey;
            synchronized (this.mutex) {
                containsKey = delegate().containsKey(obj);
            }
            return containsKey;
        }

        public boolean containsValue(Object obj) {
            boolean containsValue;
            synchronized (this.mutex) {
                containsValue = delegate().containsValue(obj);
            }
            return containsValue;
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.mutex) {
                if (this.entrySet == null) {
                    this.entrySet = new SynchronizedSet(delegate().entrySet(), this.mutex);
                }
                set = this.entrySet;
            }
            return set;
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                equals = delegate().equals(obj);
            }
            return equals;
        }

        public V get(Object obj) {
            V v;
            synchronized (this.mutex) {
                v = delegate().get(obj);
            }
            return v;
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.mutex) {
                hashCode = delegate().hashCode();
            }
            return hashCode;
        }

        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.mutex) {
                isEmpty = delegate().isEmpty();
            }
            return isEmpty;
        }

        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.mutex) {
                if (this.keySet == null) {
                    this.keySet = new SynchronizedSet(delegate().keySet(), this.mutex);
                }
                set = this.keySet;
            }
            return set;
        }

        public V put(K k, V v) {
            V put;
            synchronized (this.mutex) {
                put = delegate().put(k, v);
            }
            return put;
        }

        public void putAll(Map<? extends K, ? extends V> map) {
            synchronized (this.mutex) {
                delegate().putAll(map);
            }
        }

        public V remove(Object obj) {
            V remove;
            synchronized (this.mutex) {
                remove = delegate().remove(obj);
            }
            return remove;
        }

        public int size() {
            int size;
            synchronized (this.mutex) {
                size = delegate().size();
            }
            return size;
        }

        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.mutex) {
                if (this.values == null) {
                    this.values = new SynchronizedCollection(delegate().values(), this.mutex, (C16116a) null);
                }
                collection = this.values;
            }
            return collection;
        }

        public Map<K, V> delegate() {
            return (Map) super.delegate();
        }
    }

    public static class SynchronizedMultimap<K, V> extends SynchronizedObject implements C16154c1<K, V> {
        private static final long serialVersionUID = 0;
        @MonotonicNonNullDecl
        public transient Map<K, Collection<V>> asMap;
        @MonotonicNonNullDecl
        public transient Collection<Map.Entry<K, V>> entries;
        @MonotonicNonNullDecl
        public transient Set<K> keySet;
        @MonotonicNonNullDecl
        public transient C16178h1<K> keys;
        @MonotonicNonNullDecl
        public transient Collection<V> valuesCollection;

        public SynchronizedMultimap(C16154c1<K, V> c1Var, @NullableDecl Object obj) {
            super(c1Var, obj);
        }

        public Map<K, Collection<V>> asMap() {
            Map<K, Collection<V>> map;
            synchronized (this.mutex) {
                if (this.asMap == null) {
                    this.asMap = new SynchronizedAsMap(delegate().asMap(), this.mutex);
                }
                map = this.asMap;
            }
            return map;
        }

        public void clear() {
            synchronized (this.mutex) {
                delegate().clear();
            }
        }

        public boolean containsEntry(Object obj, Object obj2) {
            boolean containsEntry;
            synchronized (this.mutex) {
                containsEntry = delegate().containsEntry(obj, obj2);
            }
            return containsEntry;
        }

        public boolean containsKey(Object obj) {
            boolean containsKey;
            synchronized (this.mutex) {
                containsKey = delegate().containsKey(obj);
            }
            return containsKey;
        }

        public boolean containsValue(Object obj) {
            boolean containsValue;
            synchronized (this.mutex) {
                containsValue = delegate().containsValue(obj);
            }
            return containsValue;
        }

        public Collection<Map.Entry<K, V>> entries() {
            Collection<Map.Entry<K, V>> collection;
            synchronized (this.mutex) {
                if (this.entries == null) {
                    this.entries = Synchronized.m26114b(delegate().entries(), this.mutex);
                }
                collection = this.entries;
            }
            return collection;
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                equals = delegate().equals(obj);
            }
            return equals;
        }

        public Collection<V> get(K k) {
            Collection<V> b;
            synchronized (this.mutex) {
                b = Synchronized.m26114b(delegate().get(k), this.mutex);
            }
            return b;
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.mutex) {
                hashCode = delegate().hashCode();
            }
            return hashCode;
        }

        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.mutex) {
                isEmpty = delegate().isEmpty();
            }
            return isEmpty;
        }

        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.mutex) {
                if (this.keySet == null) {
                    this.keySet = Synchronized.m26113a(delegate().keySet(), this.mutex);
                }
                set = this.keySet;
            }
            return set;
        }

        public C16178h1<K> keys() {
            C16178h1<K> h1Var;
            synchronized (this.mutex) {
                if (this.keys == null) {
                    C16178h1<K> keys2 = delegate().keys();
                    Object obj = this.mutex;
                    if (!(keys2 instanceof SynchronizedMultiset)) {
                        if (!(keys2 instanceof ImmutableMultiset)) {
                            keys2 = new SynchronizedMultiset<>(keys2, obj);
                        }
                    }
                    this.keys = keys2;
                }
                h1Var = this.keys;
            }
            return h1Var;
        }

        public boolean put(K k, V v) {
            boolean put;
            synchronized (this.mutex) {
                put = delegate().put(k, v);
            }
            return put;
        }

        public boolean putAll(K k, Iterable<? extends V> iterable) {
            boolean putAll;
            synchronized (this.mutex) {
                putAll = delegate().putAll(k, iterable);
            }
            return putAll;
        }

        public boolean remove(Object obj, Object obj2) {
            boolean remove;
            synchronized (this.mutex) {
                remove = delegate().remove(obj, obj2);
            }
            return remove;
        }

        public Collection<V> removeAll(Object obj) {
            Collection<V> removeAll;
            synchronized (this.mutex) {
                removeAll = delegate().removeAll(obj);
            }
            return removeAll;
        }

        public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
            Collection<V> replaceValues;
            synchronized (this.mutex) {
                replaceValues = delegate().replaceValues(k, iterable);
            }
            return replaceValues;
        }

        public int size() {
            int size;
            synchronized (this.mutex) {
                size = delegate().size();
            }
            return size;
        }

        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.mutex) {
                if (this.valuesCollection == null) {
                    this.valuesCollection = new SynchronizedCollection(delegate().values(), this.mutex, (C16116a) null);
                }
                collection = this.valuesCollection;
            }
            return collection;
        }

        public C16154c1<K, V> delegate() {
            return (C16154c1) super.delegate();
        }

        public boolean putAll(C16154c1<? extends K, ? extends V> c1Var) {
            boolean putAll;
            synchronized (this.mutex) {
                putAll = delegate().putAll(c1Var);
            }
            return putAll;
        }
    }

    public static class SynchronizedObject implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object delegate;
        public final Object mutex;

        public SynchronizedObject(Object obj, @NullableDecl Object obj2) {
            obj.getClass();
            this.delegate = obj;
            this.mutex = obj2 == null ? this : obj2;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            synchronized (this.mutex) {
                objectOutputStream.defaultWriteObject();
            }
        }

        /* access modifiers changed from: package-private */
        public Object delegate() {
            return this.delegate;
        }

        public String toString() {
            String obj;
            synchronized (this.mutex) {
                obj = this.delegate.toString();
            }
            return obj;
        }
    }

    public static class SynchronizedRandomAccessList<E> extends SynchronizedList<E> implements RandomAccess {
        private static final long serialVersionUID = 0;

        public SynchronizedRandomAccessList(List<E> list, @NullableDecl Object obj) {
            super(list, obj);
        }
    }

    public static class SynchronizedSetMultimap<K, V> extends SynchronizedMultimap<K, V> implements C16217r1<K, V> {
        private static final long serialVersionUID = 0;
        @MonotonicNonNullDecl
        public transient Set<Map.Entry<K, V>> entrySet;

        public SynchronizedSetMultimap(C16217r1<K, V> r1Var, @NullableDecl Object obj) {
            super(r1Var, obj);
        }

        public Set<Map.Entry<K, V>> entries() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.mutex) {
                if (this.entrySet == null) {
                    this.entrySet = new SynchronizedSet(delegate().entries(), this.mutex);
                }
                set = this.entrySet;
            }
            return set;
        }

        public Set<V> get(K k) {
            SynchronizedSet synchronizedSet;
            synchronized (this.mutex) {
                synchronizedSet = new SynchronizedSet(delegate().get(k), this.mutex);
            }
            return synchronizedSet;
        }

        public Set<V> removeAll(Object obj) {
            Set<V> removeAll;
            synchronized (this.mutex) {
                removeAll = delegate().removeAll(obj);
            }
            return removeAll;
        }

        public Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
            Set<V> replaceValues;
            synchronized (this.mutex) {
                replaceValues = delegate().replaceValues(k, iterable);
            }
            return replaceValues;
        }

        public C16217r1<K, V> delegate() {
            return (C16217r1) super.delegate();
        }
    }

    public static final class SynchronizedTable<R, C, V> extends SynchronizedObject implements C16147b2<R, C, V> {

        /* renamed from: com.google.common.collect.Synchronized$SynchronizedTable$a */
        public class C16114a implements C15784e<Map<C, V>, Map<C, V>> {
            public C16114a() {
            }

            public final Object apply(Object obj) {
                return new SynchronizedMap((Map) obj, SynchronizedTable.this.mutex);
            }
        }

        /* renamed from: com.google.common.collect.Synchronized$SynchronizedTable$b */
        public class C16115b implements C15784e<Map<R, V>, Map<R, V>> {
            public C16115b() {
            }

            public final Object apply(Object obj) {
                return new SynchronizedMap((Map) obj, SynchronizedTable.this.mutex);
            }
        }

        public SynchronizedTable(C16147b2<R, C, V> b2Var, Object obj) {
            super(b2Var, obj);
        }

        public Set<C16147b2.C16148a<R, C, V>> cellSet() {
            SynchronizedSet synchronizedSet;
            synchronized (this.mutex) {
                synchronizedSet = new SynchronizedSet(delegate().cellSet(), this.mutex);
            }
            return synchronizedSet;
        }

        public void clear() {
            synchronized (this.mutex) {
                delegate().clear();
            }
        }

        public Map<R, V> column(@NullableDecl C c) {
            SynchronizedMap synchronizedMap;
            synchronized (this.mutex) {
                synchronizedMap = new SynchronizedMap(delegate().column(c), this.mutex);
            }
            return synchronizedMap;
        }

        public Set<C> columnKeySet() {
            SynchronizedSet synchronizedSet;
            synchronized (this.mutex) {
                synchronizedSet = new SynchronizedSet(delegate().columnKeySet(), this.mutex);
            }
            return synchronizedSet;
        }

        public Map<C, Map<R, V>> columnMap() {
            SynchronizedMap synchronizedMap;
            synchronized (this.mutex) {
                synchronizedMap = new SynchronizedMap(Maps.m26059g(delegate().columnMap(), new C16115b()), this.mutex);
            }
            return synchronizedMap;
        }

        public boolean contains(@NullableDecl Object obj, @NullableDecl Object obj2) {
            boolean contains;
            synchronized (this.mutex) {
                contains = delegate().contains(obj, obj2);
            }
            return contains;
        }

        public boolean containsColumn(@NullableDecl Object obj) {
            boolean containsColumn;
            synchronized (this.mutex) {
                containsColumn = delegate().containsColumn(obj);
            }
            return containsColumn;
        }

        public boolean containsRow(@NullableDecl Object obj) {
            boolean containsRow;
            synchronized (this.mutex) {
                containsRow = delegate().containsRow(obj);
            }
            return containsRow;
        }

        public boolean containsValue(@NullableDecl Object obj) {
            boolean containsValue;
            synchronized (this.mutex) {
                containsValue = delegate().containsValue(obj);
            }
            return containsValue;
        }

        public boolean equals(@NullableDecl Object obj) {
            boolean equals;
            if (this == obj) {
                return true;
            }
            synchronized (this.mutex) {
                equals = delegate().equals(obj);
            }
            return equals;
        }

        public V get(@NullableDecl Object obj, @NullableDecl Object obj2) {
            V v;
            synchronized (this.mutex) {
                v = delegate().get(obj, obj2);
            }
            return v;
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.mutex) {
                hashCode = delegate().hashCode();
            }
            return hashCode;
        }

        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.mutex) {
                isEmpty = delegate().isEmpty();
            }
            return isEmpty;
        }

        public V put(@NullableDecl R r, @NullableDecl C c, @NullableDecl V v) {
            V put;
            synchronized (this.mutex) {
                put = delegate().put(r, c, v);
            }
            return put;
        }

        public void putAll(C16147b2<? extends R, ? extends C, ? extends V> b2Var) {
            synchronized (this.mutex) {
                delegate().putAll(b2Var);
            }
        }

        public V remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
            V remove;
            synchronized (this.mutex) {
                remove = delegate().remove(obj, obj2);
            }
            return remove;
        }

        public Map<C, V> row(@NullableDecl R r) {
            SynchronizedMap synchronizedMap;
            synchronized (this.mutex) {
                synchronizedMap = new SynchronizedMap(delegate().row(r), this.mutex);
            }
            return synchronizedMap;
        }

        public Set<R> rowKeySet() {
            SynchronizedSet synchronizedSet;
            synchronized (this.mutex) {
                synchronizedSet = new SynchronizedSet(delegate().rowKeySet(), this.mutex);
            }
            return synchronizedSet;
        }

        public Map<R, Map<C, V>> rowMap() {
            SynchronizedMap synchronizedMap;
            synchronized (this.mutex) {
                synchronizedMap = new SynchronizedMap(Maps.m26059g(delegate().rowMap(), new C16114a()), this.mutex);
            }
            return synchronizedMap;
        }

        public int size() {
            int size;
            synchronized (this.mutex) {
                size = delegate().size();
            }
            return size;
        }

        public Collection<V> values() {
            SynchronizedCollection synchronizedCollection;
            synchronized (this.mutex) {
                synchronizedCollection = new SynchronizedCollection(delegate().values(), this.mutex, (C16116a) null);
            }
            return synchronizedCollection;
        }

        public C16147b2<R, C, V> delegate() {
            return (C16147b2) super.delegate();
        }
    }

    /* renamed from: a */
    public static Set m26113a(Set set, Object obj) {
        return set instanceof SortedSet ? new SynchronizedSortedSet((SortedSet) set, obj) : new SynchronizedSet(set, obj);
    }

    /* renamed from: b */
    public static Collection m26114b(Collection collection, Object obj) {
        return collection instanceof SortedSet ? new SynchronizedSortedSet((SortedSet) collection, obj) : collection instanceof Set ? new SynchronizedSet((Set) collection, obj) : collection instanceof List ? m26116d((List) collection, obj) : new SynchronizedCollection(collection, obj, (C16116a) null);
    }

    /* renamed from: c */
    public static Map.Entry m26115c(Map.Entry entry, Object obj) {
        if (entry == null) {
            return null;
        }
        return new SynchronizedEntry(entry, obj);
    }

    /* renamed from: d */
    public static <E> List<E> m26116d(List<E> list, @NullableDecl Object obj) {
        return list instanceof RandomAccess ? new SynchronizedRandomAccessList(list, obj) : new SynchronizedList(list, obj);
    }

    public static class SynchronizedMultiset<E> extends SynchronizedCollection<E> implements C16178h1<E> {
        private static final long serialVersionUID = 0;
        @MonotonicNonNullDecl
        public transient Set<E> elementSet;
        @MonotonicNonNullDecl
        public transient Set<C16178h1.C16179a<E>> entrySet;

        public SynchronizedMultiset(C16178h1<E> h1Var, @NullableDecl Object obj) {
            super(h1Var, obj, (C16116a) null);
        }

        public int add(E e, int i) {
            int add;
            synchronized (this.mutex) {
                add = delegate().add(e, i);
            }
            return add;
        }

        public int count(Object obj) {
            int count;
            synchronized (this.mutex) {
                count = delegate().count(obj);
            }
            return count;
        }

        public Set<E> elementSet() {
            Set<E> set;
            synchronized (this.mutex) {
                if (this.elementSet == null) {
                    this.elementSet = Synchronized.m26113a(delegate().elementSet(), this.mutex);
                }
                set = this.elementSet;
            }
            return set;
        }

        public Set<C16178h1.C16179a<E>> entrySet() {
            Set<C16178h1.C16179a<E>> set;
            synchronized (this.mutex) {
                if (this.entrySet == null) {
                    this.entrySet = Synchronized.m26113a(delegate().entrySet(), this.mutex);
                }
                set = this.entrySet;
            }
            return set;
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                equals = delegate().equals(obj);
            }
            return equals;
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.mutex) {
                hashCode = delegate().hashCode();
            }
            return hashCode;
        }

        public int remove(Object obj, int i) {
            int remove;
            synchronized (this.mutex) {
                remove = delegate().remove(obj, i);
            }
            return remove;
        }

        public int setCount(E e, int i) {
            int count;
            synchronized (this.mutex) {
                count = delegate().setCount(e, i);
            }
            return count;
        }

        public C16178h1<E> delegate() {
            return (C16178h1) super.delegate();
        }

        public boolean setCount(E e, int i, int i2) {
            boolean count;
            synchronized (this.mutex) {
                count = delegate().setCount(e, i, i2);
            }
            return count;
        }
    }

    public static class SynchronizedQueue<E> extends SynchronizedCollection<E> implements Queue<E> {
        private static final long serialVersionUID = 0;

        public SynchronizedQueue(Queue<E> queue, @NullableDecl Object obj) {
            super(queue, obj, (C16116a) null);
        }

        public E element() {
            E element;
            synchronized (this.mutex) {
                element = delegate().element();
            }
            return element;
        }

        public boolean offer(E e) {
            boolean offer;
            synchronized (this.mutex) {
                offer = delegate().offer(e);
            }
            return offer;
        }

        public E peek() {
            E peek;
            synchronized (this.mutex) {
                peek = delegate().peek();
            }
            return peek;
        }

        public E poll() {
            E poll;
            synchronized (this.mutex) {
                poll = delegate().poll();
            }
            return poll;
        }

        public E remove() {
            E remove;
            synchronized (this.mutex) {
                remove = delegate().remove();
            }
            return remove;
        }

        public Queue<E> delegate() {
            return (Queue) super.delegate();
        }
    }

    public static class SynchronizedSet<E> extends SynchronizedCollection<E> implements Set<E> {
        private static final long serialVersionUID = 0;

        public SynchronizedSet(Set<E> set, @NullableDecl Object obj) {
            super(set, obj, (C16116a) null);
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                equals = delegate().equals(obj);
            }
            return equals;
        }

        public int hashCode() {
            int hashCode;
            synchronized (this.mutex) {
                hashCode = delegate().hashCode();
            }
            return hashCode;
        }

        /* access modifiers changed from: package-private */
        public Set<E> delegate() {
            return (Set) super.delegate();
        }
    }

    public static class SynchronizedSortedMap<K, V> extends SynchronizedMap<K, V> implements SortedMap<K, V> {
        private static final long serialVersionUID = 0;

        public SynchronizedSortedMap(SortedMap<K, V> sortedMap, @NullableDecl Object obj) {
            super(sortedMap, obj);
        }

        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator;
            synchronized (this.mutex) {
                comparator = delegate().comparator();
            }
            return comparator;
        }

        public K firstKey() {
            K firstKey;
            synchronized (this.mutex) {
                firstKey = delegate().firstKey();
            }
            return firstKey;
        }

        public SortedMap<K, V> headMap(K k) {
            SynchronizedSortedMap synchronizedSortedMap;
            synchronized (this.mutex) {
                synchronizedSortedMap = new SynchronizedSortedMap(delegate().headMap(k), this.mutex);
            }
            return synchronizedSortedMap;
        }

        public K lastKey() {
            K lastKey;
            synchronized (this.mutex) {
                lastKey = delegate().lastKey();
            }
            return lastKey;
        }

        public SortedMap<K, V> subMap(K k, K k2) {
            SynchronizedSortedMap synchronizedSortedMap;
            synchronized (this.mutex) {
                synchronizedSortedMap = new SynchronizedSortedMap(delegate().subMap(k, k2), this.mutex);
            }
            return synchronizedSortedMap;
        }

        public SortedMap<K, V> tailMap(K k) {
            SynchronizedSortedMap synchronizedSortedMap;
            synchronized (this.mutex) {
                synchronizedSortedMap = new SynchronizedSortedMap(delegate().tailMap(k), this.mutex);
            }
            return synchronizedSortedMap;
        }

        public SortedMap<K, V> delegate() {
            return (SortedMap) super.delegate();
        }
    }

    public static class SynchronizedSortedSetMultimap<K, V> extends SynchronizedSetMultimap<K, V> implements C16239x1<K, V> {
        private static final long serialVersionUID = 0;

        public SynchronizedSortedSetMultimap(C16239x1<K, V> x1Var, @NullableDecl Object obj) {
            super(x1Var, obj);
        }

        public Comparator<? super V> valueComparator() {
            Comparator<? super V> valueComparator;
            synchronized (this.mutex) {
                valueComparator = delegate().valueComparator();
            }
            return valueComparator;
        }

        public SortedSet<V> get(K k) {
            SynchronizedSortedSet synchronizedSortedSet;
            synchronized (this.mutex) {
                synchronizedSortedSet = new SynchronizedSortedSet(delegate().get(k), this.mutex);
            }
            return synchronizedSortedSet;
        }

        public SortedSet<V> removeAll(Object obj) {
            SortedSet<V> removeAll;
            synchronized (this.mutex) {
                removeAll = delegate().removeAll(obj);
            }
            return removeAll;
        }

        public SortedSet<V> replaceValues(K k, Iterable<? extends V> iterable) {
            SortedSet<V> replaceValues;
            synchronized (this.mutex) {
                replaceValues = delegate().replaceValues(k, iterable);
            }
            return replaceValues;
        }

        public C16239x1<K, V> delegate() {
            return (C16239x1) super.delegate();
        }
    }

    public static final class SynchronizedDeque<E> extends SynchronizedQueue<E> implements Deque<E> {
        private static final long serialVersionUID = 0;

        public SynchronizedDeque(Deque<E> deque, @NullableDecl Object obj) {
            super(deque, obj);
        }

        public void addFirst(E e) {
            synchronized (this.mutex) {
                delegate().addFirst(e);
            }
        }

        public void addLast(E e) {
            synchronized (this.mutex) {
                delegate().addLast(e);
            }
        }

        public Iterator<E> descendingIterator() {
            Iterator<E> descendingIterator;
            synchronized (this.mutex) {
                descendingIterator = delegate().descendingIterator();
            }
            return descendingIterator;
        }

        public E getFirst() {
            E first;
            synchronized (this.mutex) {
                first = delegate().getFirst();
            }
            return first;
        }

        public E getLast() {
            E last;
            synchronized (this.mutex) {
                last = delegate().getLast();
            }
            return last;
        }

        public boolean offerFirst(E e) {
            boolean offerFirst;
            synchronized (this.mutex) {
                offerFirst = delegate().offerFirst(e);
            }
            return offerFirst;
        }

        public boolean offerLast(E e) {
            boolean offerLast;
            synchronized (this.mutex) {
                offerLast = delegate().offerLast(e);
            }
            return offerLast;
        }

        public E peekFirst() {
            E peekFirst;
            synchronized (this.mutex) {
                peekFirst = delegate().peekFirst();
            }
            return peekFirst;
        }

        public E peekLast() {
            E peekLast;
            synchronized (this.mutex) {
                peekLast = delegate().peekLast();
            }
            return peekLast;
        }

        public E pollFirst() {
            E pollFirst;
            synchronized (this.mutex) {
                pollFirst = delegate().pollFirst();
            }
            return pollFirst;
        }

        public E pollLast() {
            E pollLast;
            synchronized (this.mutex) {
                pollLast = delegate().pollLast();
            }
            return pollLast;
        }

        public E pop() {
            E pop;
            synchronized (this.mutex) {
                pop = delegate().pop();
            }
            return pop;
        }

        public void push(E e) {
            synchronized (this.mutex) {
                delegate().push(e);
            }
        }

        public E removeFirst() {
            E removeFirst;
            synchronized (this.mutex) {
                removeFirst = delegate().removeFirst();
            }
            return removeFirst;
        }

        public boolean removeFirstOccurrence(Object obj) {
            boolean removeFirstOccurrence;
            synchronized (this.mutex) {
                removeFirstOccurrence = delegate().removeFirstOccurrence(obj);
            }
            return removeFirstOccurrence;
        }

        public E removeLast() {
            E removeLast;
            synchronized (this.mutex) {
                removeLast = delegate().removeLast();
            }
            return removeLast;
        }

        public boolean removeLastOccurrence(Object obj) {
            boolean removeLastOccurrence;
            synchronized (this.mutex) {
                removeLastOccurrence = delegate().removeLastOccurrence(obj);
            }
            return removeLastOccurrence;
        }

        public Deque<E> delegate() {
            return (Deque) super.delegate();
        }
    }

    public static class SynchronizedNavigableMap<K, V> extends SynchronizedSortedMap<K, V> implements NavigableMap<K, V> {
        private static final long serialVersionUID = 0;
        @MonotonicNonNullDecl
        public transient NavigableSet<K> descendingKeySet;
        @MonotonicNonNullDecl
        public transient NavigableMap<K, V> descendingMap;
        @MonotonicNonNullDecl
        public transient NavigableSet<K> navigableKeySet;

        public SynchronizedNavigableMap(NavigableMap<K, V> navigableMap, @NullableDecl Object obj) {
            super(navigableMap, obj);
        }

        public Map.Entry<K, V> ceilingEntry(K k) {
            Map.Entry<K, V> c;
            synchronized (this.mutex) {
                c = Synchronized.m26115c(delegate().ceilingEntry(k), this.mutex);
            }
            return c;
        }

        public K ceilingKey(K k) {
            K ceilingKey;
            synchronized (this.mutex) {
                ceilingKey = delegate().ceilingKey(k);
            }
            return ceilingKey;
        }

        public NavigableSet<K> descendingKeySet() {
            synchronized (this.mutex) {
                NavigableSet<K> navigableSet = this.descendingKeySet;
                if (navigableSet != null) {
                    return navigableSet;
                }
                SynchronizedNavigableSet synchronizedNavigableSet = new SynchronizedNavigableSet(delegate().descendingKeySet(), this.mutex);
                this.descendingKeySet = synchronizedNavigableSet;
                return synchronizedNavigableSet;
            }
        }

        public NavigableMap<K, V> descendingMap() {
            synchronized (this.mutex) {
                NavigableMap<K, V> navigableMap = this.descendingMap;
                if (navigableMap != null) {
                    return navigableMap;
                }
                SynchronizedNavigableMap synchronizedNavigableMap = new SynchronizedNavigableMap(delegate().descendingMap(), this.mutex);
                this.descendingMap = synchronizedNavigableMap;
                return synchronizedNavigableMap;
            }
        }

        public Map.Entry<K, V> firstEntry() {
            Map.Entry<K, V> c;
            synchronized (this.mutex) {
                c = Synchronized.m26115c(delegate().firstEntry(), this.mutex);
            }
            return c;
        }

        public Map.Entry<K, V> floorEntry(K k) {
            Map.Entry<K, V> c;
            synchronized (this.mutex) {
                c = Synchronized.m26115c(delegate().floorEntry(k), this.mutex);
            }
            return c;
        }

        public K floorKey(K k) {
            K floorKey;
            synchronized (this.mutex) {
                floorKey = delegate().floorKey(k);
            }
            return floorKey;
        }

        public NavigableMap<K, V> headMap(K k, boolean z) {
            SynchronizedNavigableMap synchronizedNavigableMap;
            synchronized (this.mutex) {
                synchronizedNavigableMap = new SynchronizedNavigableMap(delegate().headMap(k, z), this.mutex);
            }
            return synchronizedNavigableMap;
        }

        public Map.Entry<K, V> higherEntry(K k) {
            Map.Entry<K, V> c;
            synchronized (this.mutex) {
                c = Synchronized.m26115c(delegate().higherEntry(k), this.mutex);
            }
            return c;
        }

        public K higherKey(K k) {
            K higherKey;
            synchronized (this.mutex) {
                higherKey = delegate().higherKey(k);
            }
            return higherKey;
        }

        public Set<K> keySet() {
            return navigableKeySet();
        }

        public Map.Entry<K, V> lastEntry() {
            Map.Entry<K, V> c;
            synchronized (this.mutex) {
                c = Synchronized.m26115c(delegate().lastEntry(), this.mutex);
            }
            return c;
        }

        public Map.Entry<K, V> lowerEntry(K k) {
            Map.Entry<K, V> c;
            synchronized (this.mutex) {
                c = Synchronized.m26115c(delegate().lowerEntry(k), this.mutex);
            }
            return c;
        }

        public K lowerKey(K k) {
            K lowerKey;
            synchronized (this.mutex) {
                lowerKey = delegate().lowerKey(k);
            }
            return lowerKey;
        }

        public NavigableSet<K> navigableKeySet() {
            synchronized (this.mutex) {
                NavigableSet<K> navigableSet = this.navigableKeySet;
                if (navigableSet != null) {
                    return navigableSet;
                }
                SynchronizedNavigableSet synchronizedNavigableSet = new SynchronizedNavigableSet(delegate().navigableKeySet(), this.mutex);
                this.navigableKeySet = synchronizedNavigableSet;
                return synchronizedNavigableSet;
            }
        }

        public Map.Entry<K, V> pollFirstEntry() {
            Map.Entry<K, V> c;
            synchronized (this.mutex) {
                c = Synchronized.m26115c(delegate().pollFirstEntry(), this.mutex);
            }
            return c;
        }

        public Map.Entry<K, V> pollLastEntry() {
            Map.Entry<K, V> c;
            synchronized (this.mutex) {
                c = Synchronized.m26115c(delegate().pollLastEntry(), this.mutex);
            }
            return c;
        }

        public NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
            SynchronizedNavigableMap synchronizedNavigableMap;
            synchronized (this.mutex) {
                synchronizedNavigableMap = new SynchronizedNavigableMap(delegate().subMap(k, z, k2, z2), this.mutex);
            }
            return synchronizedNavigableMap;
        }

        public NavigableMap<K, V> tailMap(K k, boolean z) {
            SynchronizedNavigableMap synchronizedNavigableMap;
            synchronized (this.mutex) {
                synchronizedNavigableMap = new SynchronizedNavigableMap(delegate().tailMap(k, z), this.mutex);
            }
            return synchronizedNavigableMap;
        }

        public NavigableMap<K, V> delegate() {
            return (NavigableMap) super.delegate();
        }

        public SortedMap<K, V> headMap(K k) {
            return headMap(k, false);
        }

        public SortedMap<K, V> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        public SortedMap<K, V> tailMap(K k) {
            return tailMap(k, true);
        }
    }

    public static class SynchronizedSortedSet<E> extends SynchronizedSet<E> implements SortedSet<E> {
        private static final long serialVersionUID = 0;

        public SynchronizedSortedSet(SortedSet<E> sortedSet, @NullableDecl Object obj) {
            super(sortedSet, obj);
        }

        public Comparator<? super E> comparator() {
            Comparator<? super E> comparator;
            synchronized (this.mutex) {
                comparator = delegate().comparator();
            }
            return comparator;
        }

        public E first() {
            E first;
            synchronized (this.mutex) {
                first = delegate().first();
            }
            return first;
        }

        public SortedSet<E> headSet(E e) {
            SynchronizedSortedSet synchronizedSortedSet;
            synchronized (this.mutex) {
                synchronizedSortedSet = new SynchronizedSortedSet(delegate().headSet(e), this.mutex);
            }
            return synchronizedSortedSet;
        }

        public E last() {
            E last;
            synchronized (this.mutex) {
                last = delegate().last();
            }
            return last;
        }

        public SortedSet<E> subSet(E e, E e2) {
            SynchronizedSortedSet synchronizedSortedSet;
            synchronized (this.mutex) {
                synchronizedSortedSet = new SynchronizedSortedSet(delegate().subSet(e, e2), this.mutex);
            }
            return synchronizedSortedSet;
        }

        public SortedSet<E> tailSet(E e) {
            SynchronizedSortedSet synchronizedSortedSet;
            synchronized (this.mutex) {
                synchronizedSortedSet = new SynchronizedSortedSet(delegate().tailSet(e), this.mutex);
            }
            return synchronizedSortedSet;
        }

        public SortedSet<E> delegate() {
            return (SortedSet) super.delegate();
        }
    }

    public static class SynchronizedNavigableSet<E> extends SynchronizedSortedSet<E> implements NavigableSet<E> {
        private static final long serialVersionUID = 0;
        @MonotonicNonNullDecl
        public transient NavigableSet<E> descendingSet;

        public SynchronizedNavigableSet(NavigableSet<E> navigableSet, @NullableDecl Object obj) {
            super(navigableSet, obj);
        }

        public E ceiling(E e) {
            E ceiling;
            synchronized (this.mutex) {
                ceiling = delegate().ceiling(e);
            }
            return ceiling;
        }

        public Iterator<E> descendingIterator() {
            return delegate().descendingIterator();
        }

        public NavigableSet<E> descendingSet() {
            synchronized (this.mutex) {
                NavigableSet<E> navigableSet = this.descendingSet;
                if (navigableSet != null) {
                    return navigableSet;
                }
                SynchronizedNavigableSet synchronizedNavigableSet = new SynchronizedNavigableSet(delegate().descendingSet(), this.mutex);
                this.descendingSet = synchronizedNavigableSet;
                return synchronizedNavigableSet;
            }
        }

        public E floor(E e) {
            E floor;
            synchronized (this.mutex) {
                floor = delegate().floor(e);
            }
            return floor;
        }

        public NavigableSet<E> headSet(E e, boolean z) {
            SynchronizedNavigableSet synchronizedNavigableSet;
            synchronized (this.mutex) {
                synchronizedNavigableSet = new SynchronizedNavigableSet(delegate().headSet(e, z), this.mutex);
            }
            return synchronizedNavigableSet;
        }

        public E higher(E e) {
            E higher;
            synchronized (this.mutex) {
                higher = delegate().higher(e);
            }
            return higher;
        }

        public E lower(E e) {
            E lower;
            synchronized (this.mutex) {
                lower = delegate().lower(e);
            }
            return lower;
        }

        public E pollFirst() {
            E pollFirst;
            synchronized (this.mutex) {
                pollFirst = delegate().pollFirst();
            }
            return pollFirst;
        }

        public E pollLast() {
            E pollLast;
            synchronized (this.mutex) {
                pollLast = delegate().pollLast();
            }
            return pollLast;
        }

        public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            SynchronizedNavigableSet synchronizedNavigableSet;
            synchronized (this.mutex) {
                synchronizedNavigableSet = new SynchronizedNavigableSet(delegate().subSet(e, z, e2, z2), this.mutex);
            }
            return synchronizedNavigableSet;
        }

        public NavigableSet<E> tailSet(E e, boolean z) {
            SynchronizedNavigableSet synchronizedNavigableSet;
            synchronized (this.mutex) {
                synchronizedNavigableSet = new SynchronizedNavigableSet(delegate().tailSet(e, z), this.mutex);
            }
            return synchronizedNavigableSet;
        }

        public NavigableSet<E> delegate() {
            return (NavigableSet) super.delegate();
        }

        public SortedSet<E> headSet(E e) {
            return headSet(e, false);
        }

        public SortedSet<E> subSet(E e, E e2) {
            return subSet(e, true, e2, false);
        }

        public SortedSet<E> tailSet(E e) {
            return tailSet(e, true);
        }
    }

    public static class SynchronizedAsMapEntries<K, V> extends SynchronizedSet<Map.Entry<K, Collection<V>>> {
        private static final long serialVersionUID = 0;

        /* renamed from: com.google.common.collect.Synchronized$SynchronizedAsMapEntries$a */
        public class C16112a extends C16155c2<Map.Entry<K, Collection<V>>, Map.Entry<K, Collection<V>>> {
            public C16112a(Iterator it) {
                super(it);
            }

            /* renamed from: a */
            public final Object mo56891a(Object obj) {
                return new C16143a2(this, (Map.Entry) obj);
            }
        }

        public SynchronizedAsMapEntries(Set<Map.Entry<K, Collection<V>>> set, @NullableDecl Object obj) {
            super(set, obj);
        }

        public boolean contains(Object obj) {
            boolean z;
            synchronized (this.mutex) {
                Set delegate = delegate();
                if (!(obj instanceof Map.Entry)) {
                    z = false;
                } else {
                    Map.Entry entry = (Map.Entry) obj;
                    entry.getClass();
                    z = delegate.contains(new C16241y0(entry));
                }
            }
            return z;
        }

        public boolean containsAll(Collection<?> collection) {
            boolean D;
            synchronized (this.mutex) {
                D = C18263b.m30809D(delegate(), collection);
            }
            return D;
        }

        public boolean equals(Object obj) {
            boolean a;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                a = Sets.m26091a(delegate(), obj);
            }
            return a;
        }

        public Iterator<Map.Entry<K, Collection<V>>> iterator() {
            return new C16112a(super.iterator());
        }

        public boolean remove(Object obj) {
            boolean z;
            synchronized (this.mutex) {
                Set delegate = delegate();
                if (!(obj instanceof Map.Entry)) {
                    z = false;
                } else {
                    Map.Entry entry = (Map.Entry) obj;
                    entry.getClass();
                    z = delegate.remove(new C16241y0(entry));
                }
            }
            return z;
        }

        public boolean removeAll(Collection<?> collection) {
            boolean g;
            synchronized (this.mutex) {
                g = Iterators.m25984g(collection, delegate().iterator());
            }
            return g;
        }

        public boolean retainAll(Collection<?> collection) {
            boolean z;
            synchronized (this.mutex) {
                Iterator it = delegate().iterator();
                collection.getClass();
                z = false;
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                        z = true;
                    }
                }
            }
            return z;
        }

        public Object[] toArray() {
            Object[] objArr;
            synchronized (this.mutex) {
                Set delegate = delegate();
                objArr = new Object[delegate.size()];
                C16188j1.m26183b(delegate, objArr);
            }
            return objArr;
        }

        public <T> T[] toArray(T[] tArr) {
            T[] c;
            synchronized (this.mutex) {
                c = C16188j1.m26184c(delegate(), tArr);
            }
            return c;
        }
    }
}
