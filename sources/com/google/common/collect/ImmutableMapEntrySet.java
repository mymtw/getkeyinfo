package com.google.common.collect;

import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

abstract class ImmutableMapEntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

    public static class EntrySetSerializedForm<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final ImmutableMap<K, V> map;

        public EntrySetSerializedForm(ImmutableMap<K, V> immutableMap) {
            this.map = immutableMap;
        }

        public Object readResolve() {
            return this.map.entrySet();
        }
    }

    public static final class RegularEntrySet<K, V> extends ImmutableMapEntrySet<K, V> {
        @Weak

        /* renamed from: d */
        public final transient ImmutableMap<K, V> f35916d;

        /* renamed from: e */
        public final transient ImmutableList<Map.Entry<K, V>> f35917e;

        public RegularEntrySet(ImmutableMap<K, V> immutableMap, Map.Entry<K, V>[] entryArr) {
            this(immutableMap, ImmutableList.asImmutableList(entryArr));
        }

        public int copyIntoArray(Object[] objArr, int i) {
            return this.f35917e.copyIntoArray(objArr, i);
        }

        public ImmutableList<Map.Entry<K, V>> createAsList() {
            return this.f35917e;
        }

        public ImmutableMap<K, V> map() {
            return this.f35916d;
        }

        public RegularEntrySet(ImmutableMap<K, V> immutableMap, ImmutableList<Map.Entry<K, V>> immutableList) {
            this.f35916d = immutableMap;
            this.f35917e = immutableList;
        }

        public C16170f2<Map.Entry<K, V>> iterator() {
            return this.f35917e.iterator();
        }
    }

    public boolean contains(@NullableDecl Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = map().get(entry.getKey());
        return obj2 != null && obj2.equals(entry.getValue());
    }

    public int hashCode() {
        return map().hashCode();
    }

    public boolean isHashCodeFast() {
        return map().isHashCodeFast();
    }

    public boolean isPartialView() {
        return map().isPartialView();
    }

    public abstract ImmutableMap<K, V> map();

    public int size() {
        return map().size();
    }

    public Object writeReplace() {
        return new EntrySetSerializedForm(map());
    }
}
