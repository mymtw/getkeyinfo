package com.google.android.gms.internal.icing;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class zzdy<K, V> extends LinkedHashMap<K, V> {
    private boolean zza = true;

    static {
        new zzdy().zza = false;
    }

    private zzdy() {
    }

    public final void clear() {
        mo49997d();
        super.clear();
    }

    /* renamed from: d */
    public final void mo49997d() {
        if (!this.zza) {
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
                Charset charset = C14515k0.f32655a;
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
                Charset charset2 = C14515k0.f32655a;
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
        mo49997d();
        Charset charset = C14515k0.f32655a;
        k.getClass();
        v.getClass();
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        mo49997d();
        for (Object next : map.keySet()) {
            Charset charset = C14515k0.f32655a;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        mo49997d();
        return super.remove(obj);
    }

    public final void zza(zzdy<K, V> zzdy) {
        mo49997d();
        if (!zzdy.isEmpty()) {
            putAll(zzdy);
        }
    }

    public final zzdy<K, V> zzb() {
        return isEmpty() ? new zzdy<>() : new zzdy<>(this);
    }

    public final void zzc() {
        this.zza = false;
    }

    public final boolean zzd() {
        return this.zza;
    }

    public zzdy(Map<K, V> map) {
        super(map);
    }
}
