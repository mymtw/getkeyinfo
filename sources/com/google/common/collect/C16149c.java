package com.google.common.collect;

import com.google.common.collect.Multimaps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.c */
public abstract class C16149c<K, V> implements C16154c1<K, V> {
    @MonotonicNonNullDecl

    /* renamed from: b */
    public transient Collection<Map.Entry<K, V>> f36248b;
    @MonotonicNonNullDecl

    /* renamed from: c */
    public transient Set<K> f36249c;
    @MonotonicNonNullDecl

    /* renamed from: d */
    public transient C16178h1<K> f36250d;
    @MonotonicNonNullDecl

    /* renamed from: e */
    public transient Collection<V> f36251e;
    @MonotonicNonNullDecl

    /* renamed from: f */
    public transient Map<K, Collection<V>> f36252f;

    /* renamed from: com.google.common.collect.c$a */
    public class C16150a extends Multimaps.C16061b<K, V> {
        public C16150a() {
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return C16149c.this.entryIterator();
        }
    }

    /* renamed from: com.google.common.collect.c$b */
    public class C16151b extends C16149c<K, V>.a implements Set<Map.Entry<K, V>> {
        public C16151b(C16149c cVar) {
            super();
        }

        public final boolean equals(@NullableDecl Object obj) {
            return Sets.m26091a(this, obj);
        }

        public final int hashCode() {
            return Sets.m26092b(this);
        }
    }

    /* renamed from: com.google.common.collect.c$c */
    public class C16152c extends AbstractCollection<V> {
        public C16152c() {
        }

        public final void clear() {
            C16149c.this.clear();
        }

        public final boolean contains(@NullableDecl Object obj) {
            return C16149c.this.containsValue(obj);
        }

        public final Iterator<V> iterator() {
            return C16149c.this.valueIterator();
        }

        public final int size() {
            return C16149c.this.size();
        }
    }

    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.f36252f;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> createAsMap = createAsMap();
        this.f36252f = createAsMap;
        return createAsMap;
    }

    public boolean containsEntry(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Collection collection = (Collection) asMap().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean containsValue(@NullableDecl Object obj) {
        for (Collection contains : asMap().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map<K, Collection<V>> createAsMap();

    public abstract Collection<Map.Entry<K, V>> createEntries();

    public abstract Set<K> createKeySet();

    public abstract C16178h1<K> createKeys();

    public abstract Collection<V> createValues();

    public Collection<Map.Entry<K, V>> entries() {
        Collection<Map.Entry<K, V>> collection = this.f36248b;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> createEntries = createEntries();
        this.f36248b = createEntries;
        return createEntries;
    }

    public abstract Iterator<Map.Entry<K, V>> entryIterator();

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16154c1) {
            return asMap().equals(((C16154c1) obj).asMap());
        }
        return false;
    }

    public int hashCode() {
        return asMap().hashCode();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Set<K> keySet() {
        Set<K> set = this.f36249c;
        if (set != null) {
            return set;
        }
        Set<K> createKeySet = createKeySet();
        this.f36249c = createKeySet;
        return createKeySet;
    }

    public C16178h1<K> keys() {
        C16178h1<K> h1Var = this.f36250d;
        if (h1Var != null) {
            return h1Var;
        }
        C16178h1<K> createKeys = createKeys();
        this.f36250d = createKeys;
        return createKeys;
    }

    @CanIgnoreReturnValue
    public boolean put(@NullableDecl K k, @NullableDecl V v) {
        return get(k).add(v);
    }

    @CanIgnoreReturnValue
    public boolean putAll(C16154c1<? extends K, ? extends V> c1Var) {
        boolean z = false;
        for (Map.Entry next : c1Var.entries()) {
            z |= put(next.getKey(), next.getValue());
        }
        return z;
    }

    @CanIgnoreReturnValue
    public boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Collection collection = (Collection) asMap().get(obj);
        return collection != null && collection.remove(obj2);
    }

    @CanIgnoreReturnValue
    public Collection<V> replaceValues(@NullableDecl K k, Iterable<? extends V> iterable) {
        iterable.getClass();
        Collection<V> removeAll = removeAll(k);
        putAll(k, iterable);
        return removeAll;
    }

    public String toString() {
        return asMap().toString();
    }

    public Iterator<V> valueIterator() {
        return new C16233w0(entries().iterator());
    }

    public Collection<V> values() {
        Collection<V> collection = this.f36251e;
        if (collection != null) {
            return collection;
        }
        Collection<V> createValues = createValues();
        this.f36251e = createValues;
        return createValues;
    }

    @CanIgnoreReturnValue
    public boolean putAll(@NullableDecl K k, Iterable<? extends V> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty() || !get(k).addAll(collection)) {
                return false;
            }
            return true;
        }
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext() || !Iterators.m25978a(get(k), it)) {
            return false;
        }
        return true;
    }
}
