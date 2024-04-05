package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class zzkw<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b */
    public static final zzkw f33199b;
    private boolean zzb = true;

    static {
        zzkw zzkw = new zzkw();
        f33199b = zzkw;
        zzkw.zzb = false;
    }

    private zzkw() {
    }

    public static <K, V> zzkw<K, V> zza() {
        return f33199b;
    }

    public final void clear() {
        mo51103d();
        super.clear();
    }

    /* renamed from: d */
    public final void mo51103d() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z = value.equals(obj2);
                continue;
            } else {
                z = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            int i3 = 1;
            if (key instanceof byte[]) {
                Charset charset = C14575a6.f32740a;
                i = r5;
                for (byte b : (byte[]) key) {
                    i = (i * 31) + b;
                }
                if (i == 0) {
                    i = 1;
                }
            } else {
                i = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Charset charset2 = C14575a6.f32740a;
                int i4 = r4;
                for (byte b2 : (byte[]) value) {
                    i4 = (i4 * 31) + b2;
                }
                if (i4 != 0) {
                    i3 = i4;
                }
            } else {
                i3 = value.hashCode();
            }
            i2 += i3 ^ i;
        }
        return i2;
    }

    public final V put(K k, V v) {
        mo51103d();
        Charset charset = C14575a6.f32740a;
        k.getClass();
        v.getClass();
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        mo51103d();
        for (Object next : map.keySet()) {
            Charset charset = C14575a6.f32740a;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        mo51103d();
        return super.remove(obj);
    }

    public final zzkw<K, V> zzb() {
        return isEmpty() ? new zzkw<>() : new zzkw<>(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final void zzd(zzkw<K, V> zzkw) {
        mo51103d();
        if (!zzkw.isEmpty()) {
            putAll(zzkw);
        }
    }

    public final boolean zze() {
        return this.zzb;
    }

    public zzkw(Map<K, V> map) {
        super(map);
    }
}
