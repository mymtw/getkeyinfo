package com.google.common.collect;

import java.io.Serializable;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class ImmutableMapValues<K, V> extends ImmutableCollection<V> {
    /* access modifiers changed from: private */
    public final ImmutableMap<K, V> map;

    public static class SerializedForm<V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final ImmutableMap<?, V> map;

        public SerializedForm(ImmutableMap<?, V> immutableMap) {
            this.map = immutableMap;
        }

        public Object readResolve() {
            return this.map.values();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMapValues$a */
    public class C15960a extends C16170f2<V> {

        /* renamed from: b */
        public final C16170f2<Map.Entry<K, V>> f35918b;

        public C15960a(ImmutableMapValues immutableMapValues) {
            this.f35918b = immutableMapValues.map.entrySet().iterator();
        }

        public final boolean hasNext() {
            return this.f35918b.hasNext();
        }

        public final V next() {
            return this.f35918b.next().getValue();
        }
    }

    public ImmutableMapValues(ImmutableMap<K, V> immutableMap) {
        this.map = immutableMap;
    }

    public ImmutableList<V> asList() {
        final ImmutableList<Map.Entry<K, V>> asList = this.map.entrySet().asList();
        return new ImmutableList<V>() {
            public V get(int i) {
                return ((Map.Entry) asList.get(i)).getValue();
            }

            public boolean isPartialView() {
                return true;
            }

            public int size() {
                return asList.size();
            }
        };
    }

    public boolean contains(@NullableDecl Object obj) {
        return obj != null && Iterators.m25980c(obj, iterator());
    }

    public boolean isPartialView() {
        return true;
    }

    public int size() {
        return this.map.size();
    }

    public Object writeReplace() {
        return new SerializedForm(this.map);
    }

    public C16170f2<V> iterator() {
        return new C15960a(this);
    }
}
