package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    public static final Map.Entry<?, ?>[] EMPTY_ENTRY_ARRAY = new Map.Entry[0];
    @LazyInit

    /* renamed from: b */
    public transient ImmutableSet<Map.Entry<K, V>> f35908b;
    @RetainedWith
    @LazyInit

    /* renamed from: c */
    public transient ImmutableSet<K> f35909c;
    @RetainedWith
    @LazyInit

    /* renamed from: d */
    public transient ImmutableCollection<V> f35910d;
    @LazyInit

    /* renamed from: e */
    public transient ImmutableSetMultimap<K, V> f35911e;

    public static abstract class IteratorBasedImmutableMap<K, V> extends ImmutableMap<K, V> {
        public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
            return new ImmutableMapEntrySet<K, V>() {
                public ImmutableMap<K, V> map() {
                    return IteratorBasedImmutableMap.this;
                }

                public C16170f2<Map.Entry<K, V>> iterator() {
                    return IteratorBasedImmutableMap.this.entryIterator();
                }
            };
        }

        public ImmutableSet<K> createKeySet() {
            return new ImmutableMapKeySet(this);
        }

        public ImmutableCollection<V> createValues() {
            return new ImmutableMapValues(this);
        }

        public abstract C16170f2<Map.Entry<K, V>> entryIterator();

        public /* bridge */ /* synthetic */ Set entrySet() {
            return ImmutableMap.super.entrySet();
        }

        public /* bridge */ /* synthetic */ Set keySet() {
            return ImmutableMap.super.keySet();
        }

        public /* bridge */ /* synthetic */ Collection values() {
            return ImmutableMap.super.values();
        }
    }

    public final class MapViewOfValuesAsSingletonSets extends IteratorBasedImmutableMap<K, ImmutableSet<V>> {

        /* renamed from: com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$a */
        public class C15956a extends C16170f2<Map.Entry<K, ImmutableSet<V>>> {

            /* renamed from: b */
            public final /* synthetic */ Iterator f35912b;

            public C15956a(C16170f2 f2Var) {
                this.f35912b = f2Var;
            }

            public final boolean hasNext() {
                return this.f35912b.hasNext();
            }

            public final Object next() {
                return new C16187j0((Map.Entry) this.f35912b.next());
            }
        }

        public MapViewOfValuesAsSingletonSets(C15957a aVar) {
        }

        public boolean containsKey(@NullableDecl Object obj) {
            return ImmutableMap.this.containsKey(obj);
        }

        public ImmutableSet<K> createKeySet() {
            return ImmutableMap.this.keySet();
        }

        public C16170f2<Map.Entry<K, ImmutableSet<V>>> entryIterator() {
            return new C15956a(ImmutableMap.this.entrySet().iterator());
        }

        public int hashCode() {
            return ImmutableMap.this.hashCode();
        }

        public boolean isHashCodeFast() {
            return ImmutableMap.this.isHashCodeFast();
        }

        public boolean isPartialView() {
            return ImmutableMap.this.isPartialView();
        }

        public int size() {
            return ImmutableMap.this.size();
        }

        public ImmutableSet<V> get(@NullableDecl Object obj) {
            Object obj2 = ImmutableMap.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            return ImmutableSet.m25895of(obj2);
        }
    }

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final Object[] keys;
        private final Object[] values;

        public SerializedForm(ImmutableMap<?, ?> immutableMap) {
            this.keys = new Object[immutableMap.size()];
            this.values = new Object[immutableMap.size()];
            C16170f2<Map.Entry<?, ?>> it = immutableMap.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry next = it.next();
                this.keys[i] = next.getKey();
                this.values[i] = next.getValue();
                i++;
            }
        }

        public Object createMap(C15958b<Object, Object> bVar) {
            int i = 0;
            while (true) {
                Object[] objArr = this.keys;
                if (i >= objArr.length) {
                    return bVar.mo56612a();
                }
                bVar.mo56613b(objArr[i], this.values[i]);
                i++;
            }
        }

        public Object readResolve() {
            return createMap(new C15958b(this.keys.length));
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMap$a */
    public class C15957a extends C16170f2<K> {

        /* renamed from: b */
        public final /* synthetic */ C16170f2 f35913b;

        public C15957a(C16170f2 f2Var) {
            this.f35913b = f2Var;
        }

        public final boolean hasNext() {
            return this.f35913b.hasNext();
        }

        public final K next() {
            return ((Map.Entry) this.f35913b.next()).getKey();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMap$b */
    public static class C15958b<K, V> {

        /* renamed from: a */
        public Object[] f35914a;

        /* renamed from: b */
        public int f35915b = 0;

        public C15958b(int i) {
            this.f35914a = new Object[(i * 2)];
        }

        /* renamed from: a */
        public ImmutableMap<K, V> mo56612a() {
            return RegularImmutableMap.create(this.f35915b, this.f35914a);
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public C15958b<K, V> mo56613b(K k, V v) {
            int i = (this.f35915b + 1) * 2;
            Object[] objArr = this.f35914a;
            if (i > objArr.length) {
                this.f35914a = Arrays.copyOf(objArr, ImmutableCollection.C15950b.m25825a(objArr.length, i));
            }
            C16203o.m26214a(k, v);
            Object[] objArr2 = this.f35914a;
            int i2 = this.f35915b;
            int i3 = i2 * 2;
            objArr2[i3] = k;
            objArr2[i3 + 1] = v;
            this.f35915b = i2 + 1;
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public void mo56614c(Map.Entry entry) {
            mo56613b(entry.getKey(), entry.getValue());
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public C15958b<K, V> mo56615d(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                int size = (((Collection) iterable).size() + this.f35915b) * 2;
                Object[] objArr = this.f35914a;
                if (size > objArr.length) {
                    this.f35914a = Arrays.copyOf(objArr, ImmutableCollection.C15950b.m25825a(objArr.length, size));
                }
            }
            for (Map.Entry c : iterable) {
                mo56614c(c);
            }
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: e */
        public void mo56616e(ImmutableMap immutableMap) {
            mo56615d(immutableMap.entrySet());
        }
    }

    public static <K, V> C15958b<K, V> builder() {
        return new C15958b<>(4);
    }

    public static <K, V> C15958b<K, V> builderWithExpectedSize(int i) {
        C16203o.m26215b(i, "expectedSize");
        return new C15958b<>(i);
    }

    public static void checkNoConflict(boolean z, String str, Map.Entry<?, ?> entry, Map.Entry<?, ?> entry2) {
        if (!z) {
            throw conflictException(str, entry, entry2);
        }
    }

    public static IllegalArgumentException conflictException(String str, Object obj, Object obj2) {
        return new IllegalArgumentException("Multiple entries with same " + str + ": " + obj + " and " + obj2);
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap<K, V> immutableMap = (ImmutableMap) map;
            if (!immutableMap.isPartialView()) {
                return immutableMap;
            }
        }
        return copyOf(map.entrySet());
    }

    public static <K, V> Map.Entry<K, V> entryOf(K k, V v) {
        C16203o.m26214a(k, v);
        return new AbstractMap.SimpleImmutableEntry(k, v);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m25853of() {
        return RegularImmutableMap.EMPTY;
    }

    public ImmutableSetMultimap<K, V> asMultimap() {
        if (isEmpty()) {
            return ImmutableSetMultimap.m25904of();
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap = this.f35911e;
        if (immutableSetMultimap != null) {
            return immutableSetMultimap;
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap2 = new ImmutableSetMultimap<>(new MapViewOfValuesAsSingletonSets((C15957a) null), size(), (Comparator) null);
        this.f35911e = immutableSetMultimap2;
        return immutableSetMultimap2;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    public abstract ImmutableSet<Map.Entry<K, V>> createEntrySet();

    public abstract ImmutableSet<K> createKeySet();

    public abstract ImmutableCollection<V> createValues();

    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public abstract V get(@NullableDecl Object obj);

    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    public int hashCode() {
        return Sets.m26092b(entrySet());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isHashCodeFast() {
        return false;
    }

    public abstract boolean isPartialView();

    public C16170f2<K> keyIterator() {
        return new C15957a(entrySet().iterator());
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return Maps.m26058f(this);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m25854of(K k, V v) {
        C16203o.m26214a(k, v);
        return RegularImmutableMap.create(1, new Object[]{k, v});
    }

    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.f35908b;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> createEntrySet = createEntrySet();
        this.f35908b = createEntrySet;
        return createEntrySet;
    }

    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.f35909c;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> createKeySet = createKeySet();
        this.f35909c = createKeySet;
        return createKeySet;
    }

    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.f35910d;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> createValues = createValues();
        this.f35910d = createValues;
        return createValues;
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m25855of(K k, V v, K k2, V v2) {
        C16203o.m26214a(k, v);
        C16203o.m26214a(k2, v2);
        return RegularImmutableMap.create(2, new Object[]{k, v, k2, v2});
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        C15958b bVar = new C15958b(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        bVar.mo56615d(iterable);
        return bVar.mo56612a();
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m25856of(K k, V v, K k2, V v2, K k3, V v3) {
        C16203o.m26214a(k, v);
        C16203o.m26214a(k2, v2);
        C16203o.m26214a(k3, v3);
        return RegularImmutableMap.create(3, new Object[]{k, v, k2, v2, k3, v3});
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m25857of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C16203o.m26214a(k, v);
        C16203o.m26214a(k2, v2);
        C16203o.m26214a(k3, v3);
        C16203o.m26214a(k4, v4);
        return RegularImmutableMap.create(4, new Object[]{k, v, k2, v2, k3, v3, k4, v4});
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m25858of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C16203o.m26214a(k, v);
        C16203o.m26214a(k2, v2);
        C16203o.m26214a(k3, v3);
        C16203o.m26214a(k4, v4);
        C16203o.m26214a(k5, v5);
        return RegularImmutableMap.create(5, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5});
    }
}
