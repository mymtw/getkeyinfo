package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;

public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements C16196m<K, V> {

    public static class SerializedForm extends ImmutableMap.SerializedForm {
        private static final long serialVersionUID = 0;

        public SerializedForm(ImmutableBiMap<?, ?> immutableBiMap) {
            super(immutableBiMap);
        }

        public Object readResolve() {
            return createMap(new C15946a());
        }
    }

    /* renamed from: com.google.common.collect.ImmutableBiMap$a */
    public static final class C15946a<K, V> extends ImmutableMap.C15958b<K, V> {
        public C15946a(int i) {
            super(i);
        }

        /* renamed from: a */
        public final ImmutableMap mo56612a() {
            return this.f35915b == 0 ? ImmutableBiMap.m25809of() : new RegularImmutableBiMap(this.f35914a, this.f35915b);
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public final ImmutableMap.C15958b mo56613b(Object obj, Object obj2) {
            super.mo56613b(obj, obj2);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public final void mo56614c(Map.Entry entry) {
            super.mo56614c(entry);
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public final ImmutableMap.C15958b mo56615d(Iterable iterable) {
            super.mo56615d(iterable);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: e */
        public final void mo56616e(ImmutableMap immutableMap) {
            super.mo56615d(immutableMap.entrySet());
        }

        @CanIgnoreReturnValue
        /* renamed from: f */
        public final void mo56617f(Iterable iterable) {
            super.mo56615d(iterable);
        }

        public C15946a() {
            super(4);
        }
    }

    public static <K, V> C15946a<K, V> builder() {
        return new C15946a<>();
    }

    public static <K, V> C15946a<K, V> builderWithExpectedSize(int i) {
        C16203o.m26215b(i, "expectedSize");
        return new C15946a<>(i);
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if (map instanceof ImmutableBiMap) {
            ImmutableBiMap<K, V> immutableBiMap = (ImmutableBiMap) map;
            if (!immutableBiMap.isPartialView()) {
                return immutableBiMap;
            }
        }
        return copyOf(map.entrySet());
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m25809of() {
        return RegularImmutableBiMap.EMPTY;
    }

    @CanIgnoreReturnValue
    @Deprecated
    public V forcePut(K k, V v) {
        throw new UnsupportedOperationException();
    }

    public abstract ImmutableBiMap<V, K> inverse();

    public Object writeReplace() {
        return new SerializedForm(this);
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m25810of(K k, V v) {
        C16203o.m26214a(k, v);
        return new RegularImmutableBiMap(new Object[]{k, v}, 1);
    }

    public final ImmutableSet<V> createValues() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m25811of(K k, V v, K k2, V v2) {
        C16203o.m26214a(k, v);
        C16203o.m26214a(k2, v2);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2}, 2);
    }

    public ImmutableSet<V> values() {
        return inverse().keySet();
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        C15946a aVar = new C15946a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.mo56617f(iterable);
        if (aVar.f35915b == 0) {
            return m25809of();
        }
        return new RegularImmutableBiMap(aVar.f35914a, aVar.f35915b);
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m25812of(K k, V v, K k2, V v2, K k3, V v3) {
        C16203o.m26214a(k, v);
        C16203o.m26214a(k2, v2);
        C16203o.m26214a(k3, v3);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2, k3, v3}, 3);
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m25813of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C16203o.m26214a(k, v);
        C16203o.m26214a(k2, v2);
        C16203o.m26214a(k3, v3);
        C16203o.m26214a(k4, v4);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2, k3, v3, k4, v4}, 4);
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m25814of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C16203o.m26214a(k, v);
        C16203o.m26214a(k2, v2);
        C16203o.m26214a(k3, v3);
        C16203o.m26214a(k4, v4);
        C16203o.m26214a(k5, v5);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5}, 5);
    }
}
