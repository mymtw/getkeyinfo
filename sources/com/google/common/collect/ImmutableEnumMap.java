package com.google.common.collect;

import com.google.common.base.C15794l;
import com.google.common.collect.ImmutableMap;
import java.io.Serializable;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class ImmutableEnumMap<K extends Enum<K>, V> extends ImmutableMap.IteratorBasedImmutableMap<K, V> {

    /* renamed from: f */
    public final transient EnumMap<K, V> f35901f;

    public static class EnumSerializedForm<K extends Enum<K>, V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final EnumMap<K, V> delegate;

        public EnumSerializedForm(EnumMap<K, V> enumMap) {
            this.delegate = enumMap;
        }

        public Object readResolve() {
            return new ImmutableEnumMap(this.delegate);
        }
    }

    public static <K extends Enum<K>, V> ImmutableMap<K, V> asImmutable(EnumMap<K, V> enumMap) {
        int size = enumMap.size();
        if (size == 0) {
            return ImmutableMap.m25853of();
        }
        if (size != 1) {
            return new ImmutableEnumMap(enumMap);
        }
        Map.Entry entry = (Map.Entry) C16201n0.m26212c(enumMap.entrySet());
        return ImmutableMap.m25854of(entry.getKey(), entry.getValue());
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return this.f35901f.containsKey(obj);
    }

    public C16170f2<Map.Entry<K, V>> entryIterator() {
        return new C16244z0(this.f35901f.entrySet().iterator());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableEnumMap) {
            obj = ((ImmutableEnumMap) obj).f35901f;
        }
        return this.f35901f.equals(obj);
    }

    public V get(Object obj) {
        return this.f35901f.get(obj);
    }

    public boolean isPartialView() {
        return false;
    }

    public C16170f2<K> keyIterator() {
        return Iterators.m25986i(this.f35901f.keySet().iterator());
    }

    public int size() {
        return this.f35901f.size();
    }

    public Object writeReplace() {
        return new EnumSerializedForm(this.f35901f);
    }

    public ImmutableEnumMap(EnumMap<K, V> enumMap) {
        this.f35901f = enumMap;
        C15794l.m25613g(!enumMap.isEmpty());
    }
}
