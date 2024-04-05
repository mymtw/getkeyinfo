package com.google.protobuf;

import com.google.protobuf.C16935v;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class MapFieldLite<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b */
    public static final MapFieldLite f37160b;
    private boolean isMutable = true;

    static {
        MapFieldLite mapFieldLite = new MapFieldLite();
        f37160b = mapFieldLite;
        mapFieldLite.makeImmutable();
    }

    private MapFieldLite() {
    }

    /* renamed from: a */
    public static int m27986a(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Charset charset = C16935v.f37301a;
            int length = bArr.length;
            int i = length;
            for (int i2 = 0; i2 < 0 + length; i2++) {
                i = (i * 31) + bArr[i2];
            }
            if (i == 0) {
                return 1;
            }
            return i;
        } else if (!(obj instanceof C16935v.C16936a)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public static <K, V> int calculateHashCodeForMap(Map<K, V> map) {
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            i += m27986a(next.getValue()) ^ m27986a(next.getKey());
        }
        return i;
    }

    public static <K, V> Map<K, V> copy(Map<K, V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            Object key = next.getKey();
            Object value = next.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                value = Arrays.copyOf(bArr, bArr.length);
            }
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }

    public static <K, V> MapFieldLite<K, V> emptyMapField() {
        return f37160b;
    }

    public static <K, V> boolean equals(Map<K, V> map, Map<K, V> map2) {
        boolean z;
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry next : map.entrySet()) {
            if (!map2.containsKey(next.getKey())) {
                return false;
            }
            Object value = next.getValue();
            V v = map2.get(next.getKey());
            if (!(value instanceof byte[]) || !(v instanceof byte[])) {
                z = value.equals(v);
                continue;
            } else {
                z = Arrays.equals((byte[]) value, (byte[]) v);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public void clear() {
        mo59777d();
        super.clear();
    }

    /* renamed from: d */
    public final void mo59777d() {
        if (!isMutable()) {
            throw new UnsupportedOperationException();
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public int hashCode() {
        return calculateHashCodeForMap(this);
    }

    public boolean isMutable() {
        return this.isMutable;
    }

    public void makeImmutable() {
        this.isMutable = false;
    }

    public void mergeFrom(MapFieldLite<K, V> mapFieldLite) {
        mo59777d();
        if (!mapFieldLite.isEmpty()) {
            putAll(mapFieldLite);
        }
    }

    public MapFieldLite<K, V> mutableCopy() {
        return isEmpty() ? new MapFieldLite<>() : new MapFieldLite<>(this);
    }

    public V put(K k, V v) {
        mo59777d();
        Charset charset = C16935v.f37301a;
        k.getClass();
        v.getClass();
        return super.put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo59777d();
        for (Object next : map.keySet()) {
            Charset charset = C16935v.f37301a;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    public V remove(Object obj) {
        mo59777d();
        return super.remove(obj);
    }

    public MapFieldLite(Map<K, V> map) {
        super(map);
    }

    public V put(Map.Entry<K, V> entry) {
        return put(entry.getKey(), entry.getValue());
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && equals(this, (Map) obj);
    }
}
