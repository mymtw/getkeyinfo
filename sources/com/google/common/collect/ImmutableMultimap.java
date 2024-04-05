package com.google.common.collect;

import com.etsy.android.lib.models.ResponseConstants;
import com.google.common.collect.C16178h1;
import com.google.common.collect.C16213q1;
import com.google.common.collect.Iterators;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class ImmutableMultimap<K, V> extends C16193l<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    public final transient ImmutableMap<K, ? extends ImmutableCollection<V>> map;
    public final transient int size;

    public static class EntryCollection<K, V> extends ImmutableCollection<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;
        @Weak
        public final ImmutableMultimap<K, V> multimap;

        public EntryCollection(ImmutableMultimap<K, V> immutableMultimap) {
            this.multimap = immutableMultimap;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.multimap.containsEntry(entry.getKey(), entry.getValue());
        }

        public boolean isPartialView() {
            return this.multimap.isPartialView();
        }

        public int size() {
            return this.multimap.size();
        }

        public C16170f2<Map.Entry<K, V>> iterator() {
            return this.multimap.entryIterator();
        }
    }

    public class Keys extends ImmutableMultiset<K> {
        public Keys() {
        }

        public boolean contains(@NullableDecl Object obj) {
            return ImmutableMultimap.this.containsKey(obj);
        }

        public int count(@NullableDecl Object obj) {
            Collection collection = (Collection) ImmutableMultimap.this.map.get(obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        public C16178h1.C16179a<K> getEntry(int i) {
            Map.Entry entry = ImmutableMultimap.this.map.entrySet().asList().get(i);
            return new Multisets.ImmutableEntry(entry.getKey(), ((Collection) entry.getValue()).size());
        }

        public boolean isPartialView() {
            return true;
        }

        public int size() {
            return ImmutableMultimap.this.size();
        }

        public Object writeReplace() {
            return new KeysSerializedForm(ImmutableMultimap.this);
        }

        public ImmutableSet<K> elementSet() {
            return ImmutableMultimap.this.keySet();
        }
    }

    public static final class KeysSerializedForm implements Serializable {
        public final ImmutableMultimap<?, ?> multimap;

        public KeysSerializedForm(ImmutableMultimap<?, ?> immutableMultimap) {
            this.multimap = immutableMultimap;
        }

        public Object readResolve() {
            return this.multimap.keys();
        }
    }

    public static final class Values<K, V> extends ImmutableCollection<V> {
        private static final long serialVersionUID = 0;
        @Weak

        /* renamed from: c */
        public final transient ImmutableMultimap<K, V> f35919c;

        public Values(ImmutableMultimap<K, V> immutableMultimap) {
            this.f35919c = immutableMultimap;
        }

        public boolean contains(@NullableDecl Object obj) {
            return this.f35919c.containsValue(obj);
        }

        public int copyIntoArray(Object[] objArr, int i) {
            C16170f2<? extends ImmutableCollection<V>> it = this.f35919c.map.values().iterator();
            while (it.hasNext()) {
                i = ((ImmutableCollection) it.next()).copyIntoArray(objArr, i);
            }
            return i;
        }

        public boolean isPartialView() {
            return true;
        }

        public int size() {
            return this.f35919c.size();
        }

        public C16170f2<V> iterator() {
            return this.f35919c.valueIterator();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMultimap$a */
    public class C15961a extends C16170f2<Map.Entry<K, V>> {

        /* renamed from: b */
        public final C16170f2 f35920b;

        /* renamed from: c */
        public K f35921c = null;

        /* renamed from: d */
        public C16170f2 f35922d = Iterators.C15985b.f35974f;

        public C15961a(ImmutableMultimap immutableMultimap) {
            this.f35920b = immutableMultimap.map.entrySet().iterator();
        }

        public final boolean hasNext() {
            return this.f35922d.hasNext() || this.f35920b.hasNext();
        }

        public final Object next() {
            if (!this.f35922d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f35920b.next();
                this.f35921c = entry.getKey();
                this.f35922d = ((ImmutableCollection) entry.getValue()).iterator();
            }
            return new ImmutableEntry(this.f35921c, this.f35922d.next());
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMultimap$b */
    public class C15962b extends C16170f2<V> {

        /* renamed from: b */
        public C16170f2 f35923b;

        /* renamed from: c */
        public C16170f2 f35924c = Iterators.C15985b.f35974f;

        public C15962b(ImmutableMultimap immutableMultimap) {
            this.f35923b = immutableMultimap.map.values().iterator();
        }

        public final boolean hasNext() {
            return this.f35924c.hasNext() || this.f35923b.hasNext();
        }

        public final V next() {
            if (!this.f35924c.hasNext()) {
                this.f35924c = ((ImmutableCollection) this.f35923b.next()).iterator();
            }
            return this.f35924c.next();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMultimap$c */
    public static class C15963c<K, V> {

        /* renamed from: a */
        public Map<K, Collection<V>> f35925a = CompactHashMap.create();

        /* renamed from: a */
        public Collection<V> mo56712a() {
            return new ArrayList();
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public C15963c<K, V> mo56666b(K k, V v) {
            C16203o.m26214a(k, v);
            Collection collection = this.f35925a.get(k);
            if (collection == null) {
                Map<K, Collection<V>> map = this.f35925a;
                Collection a = mo56712a();
                map.put(k, a);
                collection = a;
            }
            collection.add(v);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public void mo56667c(Map.Entry entry) {
            mo56666b(entry.getKey(), entry.getValue());
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public C15963c<K, V> mo56713d(K k, Iterable<? extends V> iterable) {
            Collection collection = this.f35925a.get(k);
            if (collection != null) {
                for (Object next : iterable) {
                    C16203o.m26214a(k, next);
                    collection.add(next);
                }
                return this;
            }
            Iterator<? extends V> it = iterable.iterator();
            if (!it.hasNext()) {
                return this;
            }
            Collection a = mo56712a();
            while (it.hasNext()) {
                Object next2 = it.next();
                C16203o.m26214a(k, next2);
                a.add(next2);
            }
            this.f35925a.put(k, a);
            return this;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMultimap$d */
    public static class C15964d {

        /* renamed from: a */
        public static final C16213q1.C16214a<ImmutableMultimap> f35926a = C16213q1.m26244a(ImmutableMultimap.class, "map");

        /* renamed from: b */
        public static final C16213q1.C16214a<ImmutableMultimap> f35927b = C16213q1.m26244a(ImmutableMultimap.class, ResponseConstants.SIZE);
    }

    public ImmutableMultimap(ImmutableMap<K, ? extends ImmutableCollection<V>> immutableMap, int i) {
        this.map = immutableMap;
        this.size = i;
    }

    public static <K, V> C15963c<K, V> builder() {
        return new C15963c<>();
    }

    public static <K, V> ImmutableMultimap<K, V> copyOf(C16154c1<? extends K, ? extends V> c1Var) {
        if (c1Var instanceof ImmutableMultimap) {
            ImmutableMultimap<K, V> immutableMultimap = (ImmutableMultimap) c1Var;
            if (!immutableMultimap.isPartialView()) {
                return immutableMultimap;
            }
        }
        return ImmutableListMultimap.copyOf(c1Var);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m25864of() {
        return ImmutableListMultimap.m25842of();
    }

    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ boolean containsEntry(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return this.map.containsKey(obj);
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return obj != null && super.containsValue(obj);
    }

    public Map<K, Collection<V>> createAsMap() {
        throw new AssertionError("should never be called");
    }

    public Set<K> createKeySet() {
        throw new AssertionError("unreachable");
    }

    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    public abstract ImmutableCollection<V> get(K k);

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public abstract ImmutableMultimap<V, K> inverse();

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public boolean isPartialView() {
        return this.map.isPartialView();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public boolean put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public boolean putAll(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.size;
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m25865of(K k, V v) {
        return ImmutableListMultimap.m25843of(k, v);
    }

    public ImmutableMap<K, Collection<V>> asMap() {
        return this.map;
    }

    public ImmutableCollection<Map.Entry<K, V>> createEntries() {
        return new EntryCollection(this);
    }

    public ImmutableMultiset<K> createKeys() {
        return new Keys();
    }

    public ImmutableCollection<V> createValues() {
        return new Values(this);
    }

    public ImmutableCollection<Map.Entry<K, V>> entries() {
        return (ImmutableCollection) super.entries();
    }

    public C16170f2<Map.Entry<K, V>> entryIterator() {
        return new C15961a(this);
    }

    public ImmutableSet<K> keySet() {
        return this.map.keySet();
    }

    public ImmutableMultiset<K> keys() {
        return (ImmutableMultiset) super.keys();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public boolean putAll(C16154c1<? extends K, ? extends V> c1Var) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public ImmutableCollection<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public ImmutableCollection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public C16170f2<V> valueIterator() {
        return new C15962b(this);
    }

    public ImmutableCollection<V> values() {
        return (ImmutableCollection) super.values();
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m25866of(K k, V v, K k2, V v2) {
        return ImmutableListMultimap.m25844of(k, v, k2, v2);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m25867of(K k, V v, K k2, V v2, K k3, V v3) {
        return ImmutableListMultimap.m25845of(k, v, k2, v2, k3, v3);
    }

    public static <K, V> ImmutableMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return ImmutableListMultimap.copyOf(iterable);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m25868of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return ImmutableListMultimap.m25846of(k, v, k2, v2, k3, v3, k4, v4);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m25869of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return ImmutableListMultimap.m25847of(k, v, k2, v2, k3, v3, k4, v4, k5, v5);
    }
}
